package p250jf;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21632a {

    /* JADX INFO: renamed from: a */
    public final Function1 f83065a;

    /* JADX INFO: renamed from: b */
    public final String f83066b;

    /* JADX INFO: renamed from: c */
    public final String f83067c;

    /* JADX INFO: renamed from: d */
    public final Object f83068d;

    public C21632a(Function1 parse, String sysProp, String envVar, Object obj) {
        AbstractC22676k.m65750j(parse, "parse");
        AbstractC22676k.m65750j(sysProp, "sysProp");
        AbstractC22676k.m65750j(envVar, "envVar");
        this.f83065a = parse;
        this.f83066b = sysProp;
        this.f83067c = envVar;
        this.f83068d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21632a)) {
            return false;
        }
        C21632a c21632a = (C21632a) obj;
        return AbstractC22676k.m65745e(this.f83065a, c21632a.f83065a) && AbstractC22676k.m65745e(this.f83066b, c21632a.f83066b) && AbstractC22676k.m65745e(this.f83067c, c21632a.f83067c) && AbstractC22676k.m65745e(this.f83068d, c21632a.f83068d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f83065a.hashCode() * 31, 31, this.f83066b), 31, this.f83067c);
        Object obj = this.f83068d;
        return iM30450d + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EnvironmentSetting(parse=");
        sb4.append(this.f83065a);
        sb4.append(", sysProp=");
        sb4.append(this.f83066b);
        sb4.append(", envVar=");
        sb4.append(this.f83067c);
        sb4.append(", defaultValue=");
        return AbstractC11478a.m30860l(sb4, this.f83068d, ')');
    }
}
