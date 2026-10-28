package com.iterable.iterableapi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ge3.AbstractC15751g;
import java.io.File;
import p005a3.C0237p;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC5361p0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0237p f21802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5361p0(C0237p c0237p, Looper looper) {
        super(looper);
        this.f21802a = c0237p;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 100) {
            C0237p c0237p = this.f21802a;
            synchronized (c0237p) {
                c0237p.m683N();
                synchronized (c0237p) {
                    try {
                        File file = new File(((Context) c0237p.f812x).getFilesDir(), "com.iterable.sdk");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, "IterableInAppFileStorage");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        AbstractC15751g.m44448a0(new File(file2, "itbl_inapp.json"), c0237p.m684O().toString());
                    } catch (Exception e5) {
                        AbstractC12350b.m34596q("IterableInAppFileStorage", "Error while saving in-app messages to file", e5);
                    }
                }
            }
        }
    }
}
