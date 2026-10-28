package mh;

import android.graphics.drawable.Drawable;
import kh.C22467a;
import p031b9.AbstractC2875y;
import p092dh.EnumC12020g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mh.o */
/* JADX INFO: loaded from: classes.dex */
public final class C25547o extends AbstractC25543k {

    /* JADX INFO: renamed from: a */
    public final Drawable f100152a;

    /* JADX INFO: renamed from: b */
    public final C25542j f100153b;

    /* JADX INFO: renamed from: c */
    public final EnumC12020g f100154c;

    /* JADX INFO: renamed from: d */
    public final C22467a f100155d;

    /* JADX INFO: renamed from: e */
    public final String f100156e;

    /* JADX INFO: renamed from: f */
    public final boolean f100157f;

    /* JADX INFO: renamed from: g */
    public final boolean f100158g;

    public C25547o(Drawable drawable, C25542j c25542j, EnumC12020g enumC12020g, C22467a c22467a, String str, boolean z4, boolean z13) {
        this.f100152a = drawable;
        this.f100153b = c25542j;
        this.f100154c = enumC12020g;
        this.f100155d = c22467a;
        this.f100156e = str;
        this.f100157f = z4;
        this.f100158g = z13;
    }

    @Override // mh.AbstractC25543k
    /* JADX INFO: renamed from: a */
    public final Drawable mo75114a() {
        return this.f100152a;
    }

    @Override // mh.AbstractC25543k
    /* JADX INFO: renamed from: b */
    public final C25542j mo75115b() {
        return this.f100153b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25547o)) {
            return false;
        }
        C25547o c25547o = (C25547o) obj;
        return AbstractC22676k.m65745e(this.f100152a, c25547o.f100152a) && AbstractC22676k.m65745e(this.f100153b, c25547o.f100153b) && this.f100154c == c25547o.f100154c && AbstractC22676k.m65745e(this.f100155d, c25547o.f100155d) && AbstractC22676k.m65745e(this.f100156e, c25547o.f100156e) && this.f100157f == c25547o.f100157f && this.f100158g == c25547o.f100158g;
    }

    public final int hashCode() {
        int iHashCode = (this.f100154c.hashCode() + ((this.f100153b.hashCode() + (this.f100152a.hashCode() * 31)) * 31)) * 31;
        C22467a c22467a = this.f100155d;
        int iHashCode2 = (iHashCode + (c22467a != null ? c22467a.hashCode() : 0)) * 31;
        String str = this.f100156e;
        return Boolean.hashCode(this.f100158g) + AbstractC2875y.m8289b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f100157f);
    }
}
