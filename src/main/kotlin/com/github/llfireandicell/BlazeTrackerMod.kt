package com.github.llfireandicell

import cc.polyfrost.oneconfig.libs.universal.UMinecraft
import com.github.llfireandicell.logging.BlazeTrackerMessageFactory
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.io.File

@Mod(
    modid = BlazeTrackerMod.MODID,
    name = BlazeTrackerMod.NAME,
    version = BlazeTrackerMod.VERSION,
    modLanguageAdapter = "cc.polyfrost.oneconfig.utils.KotlinLanguageAdapter"
)
object BlazeTrackerMod {

    const val MODID = "@ID"
    const val NAME = "@NAME@"
    const val VERSION = "@VERSION@"
    val DIR = File(File(UMinecraft.getMinecraft().mcDataDir, "config"), "BlazeTracker")
    const val PREFIX = "§b§lBlazeTracker§r§8 »§r"

    val logger: Logger = LogManager.getLogger(BlazeTrackerMessageFactory)

    @EventHandler
    fun onInit(event: FMLInitializationEvent) {
        DIR.mkdirs()
    }
}
