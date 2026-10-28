package mh;

import android.graphics.Bitmap;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import hc3.AbstractC17182o;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p031b9.AbstractC2875y;
import p341nh.EnumC26710d;
import p425qh.AbstractC30358d;
import p715kotlin.jvm.internal.AbstractC22676k;
import ph.C29229c;
import ph.InterfaceC29231e;

/* JADX INFO: renamed from: mh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C25535c {

    /* JADX INFO: renamed from: a */
    public final AbstractC3069w1 f100055a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3076z f100056b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3076z f100057c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3076z f100058d;

    /* JADX INFO: renamed from: e */
    public final C29229c f100059e;

    /* JADX INFO: renamed from: f */
    public final EnumC26710d f100060f;

    /* JADX INFO: renamed from: g */
    public final Bitmap.Config f100061g;

    /* JADX INFO: renamed from: h */
    public final boolean f100062h;

    /* JADX INFO: renamed from: i */
    public final EnumC25534b f100063i;

    /* JADX INFO: renamed from: j */
    public final EnumC25534b f100064j;

    /* JADX INFO: renamed from: k */
    public final EnumC25534b f100065k;

    public C25535c() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        EnumC26710d enumC26710d = EnumC26710d.f106210y;
        Bitmap.Config config = AbstractC30358d.f124549b;
        EnumC25534b enumC25534b = EnumC25534b.ENABLED;
        this.f100055a = abstractC3069w1Mo8825s;
        this.f100056b = executorC22364d;
        this.f100057c = executorC22364d;
        this.f100058d = executorC22364d;
        this.f100059e = InterfaceC29231e.f118305a;
        this.f100060f = enumC26710d;
        this.f100061g = config;
        this.f100062h = true;
        this.f100063i = enumC25534b;
        this.f100064j = enumC25534b;
        this.f100065k = enumC25534b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25535c)) {
            return false;
        }
        C25535c c25535c = (C25535c) obj;
        return AbstractC22676k.m65745e(this.f100055a, c25535c.f100055a) && AbstractC22676k.m65745e(this.f100056b, c25535c.f100056b) && AbstractC22676k.m65745e(this.f100057c, c25535c.f100057c) && AbstractC22676k.m65745e(this.f100058d, c25535c.f100058d) && AbstractC22676k.m65745e(this.f100059e, c25535c.f100059e) && this.f100060f == c25535c.f100060f && this.f100061g == c25535c.f100061g && this.f100062h == c25535c.f100062h && this.f100063i == c25535c.f100063i && this.f100064j == c25535c.f100064j && this.f100065k == c25535c.f100065k;
    }

    public final int hashCode() {
        int iHashCode = (this.f100058d.hashCode() + ((this.f100057c.hashCode() + ((this.f100056b.hashCode() + (this.f100055a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f100059e.getClass();
        return this.f100065k.hashCode() + ((this.f100064j.hashCode() + ((this.f100063i.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f100061g.hashCode() + ((this.f100060f.hashCode() + ((C29229c.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f100062h), 923521, false)) * 31)) * 31);
    }
}
