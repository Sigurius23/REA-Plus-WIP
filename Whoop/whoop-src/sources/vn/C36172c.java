package vn;

import java.util.ArrayList;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: vn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C36172c implements InterfaceC36178i {

    /* JADX INFO: renamed from: b */
    public static final int[] f154754b = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a */
    public static void m115113a(ArrayList arrayList, int i13) {
        if (AbstractC35903f.m114021u(i13, 0, 7, f154754b) == -1 || arrayList.contains(Integer.valueOf(i13))) {
            return;
        }
        arrayList.add(Integer.valueOf(i13));
    }
}
