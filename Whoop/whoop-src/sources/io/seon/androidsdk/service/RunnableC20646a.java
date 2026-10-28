package io.seon.androidsdk.service;

import android.content.Context;
import p474s.C31983m2;

/* JADX INFO: renamed from: io.seon.androidsdk.service.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC20646a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Context context;
        if (PageSizeUtil.f77221a || (context = PageSizeUtil.f77222b) == null) {
            return;
        }
        C31983m2 c31983m2 = new C31983m2(12);
        C31983m2.m99477o("Beginning load of %s...", "pgs");
        c31983m2.m99490n(context, "pgs");
        PageSizeUtil.f77221a = true;
    }
}
