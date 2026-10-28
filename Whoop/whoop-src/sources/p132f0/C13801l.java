package p132f0;

import android.content.Context;
import p000.AbstractC11266d;
import p208i2.C17919x;
import p291l0.InterfaceC22973k1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C13801l {

    /* JADX INFO: renamed from: a */
    public final Context f49245a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39171c f49246b;

    /* JADX INFO: renamed from: c */
    public final long f49247c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC22973k1 f49248d;

    public C13801l(Context context, InterfaceC39171c interfaceC39171c, long j7, InterfaceC22973k1 interfaceC22973k1) {
        this.f49245a = context;
        this.f49246b = interfaceC39171c;
        this.f49247c = j7;
        this.f49248d = interfaceC22973k1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13801l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C13801l c13801l = (C13801l) obj;
        return AbstractC22676k.m65745e(this.f49245a, c13801l.f49245a) && AbstractC22676k.m65745e(this.f49246b, c13801l.f49246b) && C17919x.m51542d(this.f49247c, c13801l.f49247c) && AbstractC22676k.m65745e(this.f49248d, c13801l.f49248d);
    }

    public final int hashCode() {
        int iHashCode = (this.f49246b.hashCode() + (this.f49245a.hashCode() * 31)) * 31;
        int i13 = C17919x.f69638o;
        return this.f49248d.hashCode() + AbstractC11266d.m30451e(iHashCode, this.f49247c, 31);
    }
}
