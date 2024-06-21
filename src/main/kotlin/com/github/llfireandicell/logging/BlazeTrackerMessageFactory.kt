package com.github.llfireandicell.logging

import com.github.llfireandicell.BlazeTrackerMod
import org.apache.logging.log4j.message.AbstractMessageFactory
import org.apache.logging.log4j.message.FormattedMessage
import org.apache.logging.log4j.message.Message
import org.apache.logging.log4j.message.ParameterizedMessage

object BlazeTrackerMessageFactory : AbstractMessageFactory() {

    override fun newMessage(message: String?, vararg params: Any?): Message {
        val parameterizedMessage = ParameterizedMessage(message, params)
        return FormattedMessage("[${BlazeTrackerMod.NAME}%s] %s", "/${BlazeTrackerMod.NAME}", parameterizedMessage)
    }
}