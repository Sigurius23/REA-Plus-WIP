package com.iterable.iterableapi;

import java.util.Comparator;

/* JADX INFO: renamed from: com.iterable.iterableapi.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5307b1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5339j1 c5339j1 = (C5339j1) obj;
        C5339j1 c5339j2 = (C5339j1) obj2;
        if (c5339j1.m16460h() < c5339j2.m16460h()) {
            return -1;
        }
        return c5339j1.m16460h() == c5339j2.m16460h() ? 0 : 1;
    }
}
