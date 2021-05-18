package com.shijingfeng.module_event_dispatcher.app

import android.app.Application
import android.util.Log
import com.shijingfeng.module_event_dispatcher.api.manager.ModuleEventManager
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * Function:
 * Date: 2020/12/29 11:26
 * Description:
 * Author: ShiJingFeng
 */
internal class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("测试", "Application onCreate")
        GlobalScope.launch {
            ModuleEventManager.dynamicInit(this@AppApplication)
            Log.e("测试", "Application GlobalScope")
//            ModuleEventManager.staticInit()
            ModuleEventManager.dispatch("Test", mutableMapOf<String, Any>("data1" to "这是data1"))
        }
    }
}