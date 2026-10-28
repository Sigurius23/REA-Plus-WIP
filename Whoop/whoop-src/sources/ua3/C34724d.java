package ua3;

import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ua3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C34724d extends AbstractC21598x {

    /* JADX INFO: renamed from: x */
    public final String f146261x;

    /* JADX INFO: renamed from: y */
    public final String f146262y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34724d(String name, String desc) {
        super(28);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(desc, "desc");
        this.f146261x = name;
        this.f146262y = desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34724d)) {
            return false;
        }
        C34724d c34724d = (C34724d) obj;
        return AbstractC22676k.m65745e(this.f146261x, c34724d.f146261x) && AbstractC22676k.m65745e(this.f146262y, c34724d.f146262y);
    }

    public final int hashCode() {
        return this.f146262y.hashCode() + (this.f146261x.hashCode() * 31);
    }

    @Override // p249jc.AbstractC21598x
    /* JADX INFO: renamed from: j */
    public final String mo60718j() {
        return this.f146261x + ':' + this.f146262y;
    }
}
