package androidx.viewpager2.adapter;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1855c {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList f7298a;

    /* JADX INFO: renamed from: a */
    public static void m5502a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
    }
}
