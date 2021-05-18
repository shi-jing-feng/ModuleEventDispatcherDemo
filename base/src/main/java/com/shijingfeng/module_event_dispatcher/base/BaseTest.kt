package com.shijingfeng.module_event_dispatcher.base

import android.util.Log
import com.blankj.utilcode.util.GsonUtils
import com.shijingfeng.module_event_dispatcher.data.annotations.ModuleEventReceiver
import com.shijingfeng.module_event_dispatcher.data.constant.Constant
import com.shijingfeng.module_event_dispatcher.data.interfaces.ModuleEventListener

/**
 * Function:
 * Date: 2020/12/29 11:24
 * Description:
 * Author: ShiJingFeng
 */
@ModuleEventReceiver(
    group = "Test",
//    priority = Constant.PRIORITY_HIGH,
//    flag = 0x1
)
internal class BaseTest : ModuleEventListener {

    /**
     * 事件接收回调函数
     *
     * @param data 携带的数据
     * @return 是否中断接下来的其他模块该方法的执行  true: 中断
     */
    override fun onReceive(data: Map<String, Any>): Boolean {
        Log.e("测试", "BaseTest onReceive: ${GsonUtils.toJson(data)}")
        return super.onReceive(data)
    }

}