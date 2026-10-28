package zq0;

import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p715kotlin.Metadata;
import p720m91.C25314w;

/* JADX INFO: renamed from: zq0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, m65681d2 = {"Lzq0/o;", "", "<init>", "()V", "Lm91/w;", "a", "Lm91/w;", "b", "()Lm91/w;", "declared", "", "<set-?>", "Lp1/a1;", "c", "()I", "d", "(I)V", "measuredHeightPx", "chromeHeightPx", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40974o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25314w declared = new C25314w();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28593a1 measuredHeightPx = new C28621h1(0);

    /* JADX INFO: renamed from: a */
    public final int m133028a() {
        Integer numValueOf = Integer.valueOf(this.declared.m74331c());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : m133030c();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C25314w getDeclared() {
        return this.declared;
    }

    /* JADX INFO: renamed from: c */
    public final int m133030c() {
        return ((C28621h1) this.measuredHeightPx).m87024x();
    }

    /* JADX INFO: renamed from: d */
    public final void m133031d(int i13) {
        ((C28621h1) this.measuredHeightPx).m87025y(i13);
    }
}
