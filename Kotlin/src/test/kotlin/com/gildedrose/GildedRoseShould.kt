package com.gildedrose

import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

internal class GildedRoseShould {

    @Test
    fun updateQualityFromANormalItem() {
        val items = listOf(Item("foo", 0, 0))
        val app = GildedRose(items)

        app.updateQuality()

        Approvals.verify(items[0].toString())
    }


}


