package com.github.cb372.util.process;

import com.github.cb372.util.stream.StreamListener;

/**
* Author: chris
* Created: 4/5/13
*/
class MyCustomErrorListener implements StreamListener {
    @Override
    public void onChar(char c) {
        // Called once for every character of output
    }
    @Override
    public void onLine(String line) {
        // Called once for every line of output
    }
}