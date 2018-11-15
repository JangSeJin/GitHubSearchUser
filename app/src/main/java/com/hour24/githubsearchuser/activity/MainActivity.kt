package com.hour24.githubsearchuser.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.hour24.githubsearchuser.R
import com.hour24.githubsearchuser.databinding.MainActivityBinding
import com.hour24.githubsearchuser.interfaces.InitInterface
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity(), InitInterface {

    private var mBinding: MainActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)

        initLayout()
        initVariable()
        initEventListener()

    }

    override fun initLayout() {

        // 리사이클러 뷰
        rv_show.layoutManager = GridLayoutManager(this, 3)


    }

    override fun initVariable() {

    }

    override fun initEventListener() {

    }
}
