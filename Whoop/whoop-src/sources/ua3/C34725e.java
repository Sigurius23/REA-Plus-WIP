package ua3;

import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ua3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C34725e extends AbstractC21598x {

    /* JADX INFO: renamed from: x */
    public final String f146263x;

    /* JADX INFO: renamed from: y */
    public final String f146264y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34725e(String name, String desc) {
        super(28);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(desc, "desc");
        this.f146263x = name;
        this.f146264y = desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34725e)) {
            return false;
        }
        C34725e c34725e = (C34725e) obj;
        return AbstractC22676k.m65745e(this.f146263x, c34725e.f146263x) && AbstractC22676k.m65745e(this.f146264y, c34725e.f146264y);
    }

    public final int hashCode() {
        return this.f146264y.hashCode() + (this.f146263x.hashCode() * 31);
    }

    @Override // p249jc.AbstractC21598x
    /* JADX INFO: renamed from: j */
    public final String mo60718j() {
        return this.f146263x + this.f146264y;
    }
}
