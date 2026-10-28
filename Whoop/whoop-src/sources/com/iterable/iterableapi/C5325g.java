package com.iterable.iterableapi;

import android.os.Handler;
import android.os.Looper;
import androidx.databinding.RunnableC1189s;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.iterable.iterableapi.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5325g {

    /* JADX INFO: renamed from: h */
    public static boolean f21685h = false;

    /* JADX INFO: renamed from: i */
    public static final C5325g f21686i = new C5325g();

    /* JADX INFO: renamed from: b */
    public WeakReference f21688b;

    /* JADX INFO: renamed from: a */
    public final Handler f21687a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public int f21689c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f21690d = false;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f21691e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public final RunnableC1189s f21692f = new RunnableC1189s(this, 2);

    /* JADX INFO: renamed from: g */
    public final C5317e f21693g = new C5317e(this);

    /* JADX INFO: renamed from: a */
    public final void m16438a(InterfaceC5321f interfaceC5321f) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21691e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == interfaceC5321f) {
                return;
            }
        }
        copyOnWriteArrayList.add(new WeakReference(interfaceC5321f));
    }
}
