package p341nh;

import android.content.Context;
import android.util.DisplayMetrics;
import bh.C3244g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C26709c implements InterfaceC26715i {

    /* JADX INFO: renamed from: w */
    public final Context f106207w;

    public C26709c(Context context) {
        this.f106207w = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26709c) {
            return AbstractC22676k.m65745e(this.f106207w, ((C26709c) obj).f106207w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106207w.hashCode();
    }

    @Override // p341nh.InterfaceC26715i
    /* JADX INFO: renamed from: j */
    public final Object mo1866j(C3244g c3244g) {
        DisplayMetrics displayMetrics = this.f106207w.getResources().getDisplayMetrics();
        C26707a c26707a = new C26707a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C26714h(c26707a, c26707a);
    }
}
