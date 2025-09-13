package com.modernjava.threads;

import com.modernjava.util.CommonUtil;
import static com.modernjava.util.LoggerUtil.log;

public class ExploreThreads {

    public static void doSomeWork() {
        log("started doSomeWork");
        CommonUtil.sleep(1000);
        log("finished doSomeWork");

    }

    public static void main(String[] args) {

        var thread1 = Thread.ofPlatform().name("t1");
        thread1.start( () -> {
            log("Run task 1 in the background");
        });

        var thread2 = Thread.ofPlatform().name("t2");
        thread2.start(ExploreThreads::doSomeWork);
        log("Program Completed");

    }
}
