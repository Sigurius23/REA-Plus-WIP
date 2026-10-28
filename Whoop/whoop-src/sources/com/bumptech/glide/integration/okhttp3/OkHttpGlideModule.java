package com.bumptech.glide.integration.okhttp3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p005a3.C0223l1;
import p014aj.C0928c;
import p093dl.C12144i;
import p093dl.C12161z;
import p093dl.InterfaceC12156u;
import p554vk.C36074b;
import p581we.C37199o;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class OkHttpGlideModule {
    /* JADX INFO: renamed from: a */
    public final void m15554a(C0223l1 c0223l1) {
        ArrayList arrayListM33624e;
        C36074b c36074b = new C36074b(0);
        C37199o c37199o = (C37199o) c0223l1.f738b;
        synchronized (c37199o) {
            C12161z c12161z = (C12161z) c37199o.f159040w;
            synchronized (c12161z) {
                arrayListM33624e = c12161z.m33624e();
                c12161z.m33620a(C12144i.class, InputStream.class, c36074b);
            }
            Iterator it = arrayListM33624e.iterator();
            while (it.hasNext()) {
                ((InterfaceC12156u) it.next()).getClass();
            }
            ((HashMap) ((C0928c) c37199o.f159041x).f3421x).clear();
        }
    }
}
