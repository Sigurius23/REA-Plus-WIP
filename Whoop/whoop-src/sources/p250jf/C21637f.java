package p250jf;

import d13.AbstractC11478a;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C21637f {

    /* JADX INFO: renamed from: a */
    public final Function1 f83076a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f83077b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f83078c;

    /* JADX INFO: renamed from: d */
    public final Object f83079d;

    public C21637f(Function1 parse, ArrayList arrayList, ArrayList arrayList2, Object obj) {
        AbstractC22676k.m65750j(parse, "parse");
        this.f83076a = parse;
        this.f83077b = arrayList;
        this.f83078c = arrayList2;
        this.f83079d = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m60885a() {
        return this.f83079d;
    }

    /* JADX INFO: renamed from: b */
    public final List m60886b() {
        return this.f83078c;
    }

    /* JADX INFO: renamed from: c */
    public final Function1 m60887c() {
        return this.f83076a;
    }

    /* JADX INFO: renamed from: d */
    public final List m60888d() {
        return this.f83077b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21637f)) {
            return false;
        }
        C21637f c21637f = (C21637f) obj;
        return AbstractC22676k.m65745e(this.f83076a, c21637f.f83076a) && this.f83077b.equals(c21637f.f83077b) && this.f83078c.equals(c21637f.f83078c) && AbstractC22676k.m65745e(this.f83079d, c21637f.f83079d);
    }

    public final int hashCode() {
        int iHashCode = (this.f83078c.hashCode() + ((this.f83077b.hashCode() + (this.f83076a.hashCode() * 31)) * 31)) * 31;
        Object obj = this.f83079d;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MultipleKeyEnvironmentSetting(parse=");
        sb4.append(this.f83076a);
        sb4.append(", sysProps=");
        sb4.append(this.f83077b);
        sb4.append(", envVars=");
        sb4.append(this.f83078c);
        sb4.append(", defaultValue=");
        return AbstractC11478a.m30860l(sb4, this.f83079d, ')');
    }
}
