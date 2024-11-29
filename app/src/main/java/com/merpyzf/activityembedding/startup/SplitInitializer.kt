package com.merpyzf.activityembedding.startup

import android.content.Context
import androidx.startup.Initializer
import androidx.window.embedding.RuleController
import com.merpyzf.activityembedding.R

class SplitInitializer : Initializer<RuleController> {
    override fun create(context: Context): RuleController {
        return RuleController.getInstance(context).apply {
            setRules(RuleController.parseRules(context, R.xml.main_split_config))
        }
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}