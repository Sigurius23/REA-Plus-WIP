package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import p043c4.C3967k;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20252g {

    /* JADX INFO: renamed from: a */
    public final int f76062a;

    /* JADX INFO: renamed from: b */
    public final int f76063b;

    /* JADX INFO: renamed from: c */
    public final float f76064c;

    /* JADX INFO: renamed from: d */
    public final boolean f76065d;

    /* JADX INFO: renamed from: e */
    public final boolean f76066e;

    /* JADX INFO: renamed from: f */
    public final Rect f76067f;

    /* JADX INFO: renamed from: g */
    public ArrayList f76068g;

    public AbstractC20252g(int i13, int i14, float f13, AbstractC20252g abstractC20252g, boolean z4, boolean z13, Rect rect) {
        this.f76062a = i13;
        this.f76063b = i14;
        this.f76064c = f13;
        this.f76065d = z4;
        this.f76066e = z13;
        this.f76067f = rect;
    }

    /* JADX INFO: renamed from: a */
    public final void m56178a(C3967k c3967k) {
        ArrayList arrayList;
        if (!((Boolean) c3967k.invoke(this)).booleanValue() || (arrayList = this.f76068g) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC20252g) it.next()).m56178a(c3967k);
        }
    }
}
