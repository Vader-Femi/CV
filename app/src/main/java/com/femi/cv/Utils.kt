package com.femi.cv

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast

fun Context?.copyToClipboard(label: String?, textToCopy: String?, toastTest: String?) {
    val clipboardManager: ClipboardManager =
        this?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val cData = ClipData.newPlainText(label, textToCopy)
    clipboardManager.setPrimaryClip(cData)
    toastTest?.let {
        Toast.makeText(this, toastTest, Toast.LENGTH_SHORT).show()
    }
}