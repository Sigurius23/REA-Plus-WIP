package cg;

import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33770b;

/* JADX INFO: renamed from: cg.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4570y {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f18388c = 0;

    /* JADX INFO: renamed from: a */
    public final C33770b f18389a;

    /* JADX INFO: renamed from: b */
    public final C33770b f18390b;

    static {
        C33770b c33770b = C33770b.f141347f;
        new C4570y(c33770b, c33770b);
    }

    public C4570y(C33770b c33770b, C33770b c33770b2) {
        this.f18389a = c33770b;
        this.f18390b = c33770b2;
        if (!c33770b2.f141351d && !c33770b.f141352e) {
            throw new IllegalArgumentException("Cannot have a password without a user name");
        }
        boolean z4 = c33770b.f141351d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4570y.class != obj.getClass()) {
            return false;
        }
        C4570y c4570y = (C4570y) obj;
        return AbstractC22676k.m65745e(this.f18389a, c4570y.f18389a) && AbstractC22676k.m65745e(this.f18390b, c4570y.f18390b);
    }

    public final int hashCode() {
        return this.f18390b.hashCode() + (this.f18389a.hashCode() * 31);
    }

    public final String toString() {
        C33770b c33770b = this.f18389a;
        if (c33770b.f141351d) {
            return "";
        }
        C33770b c33770b2 = this.f18390b;
        if (c33770b2.f141351d) {
            return c33770b.f141349b;
        }
        return c33770b.f141349b + ':' + c33770b2.f141349b;
    }
}
