package hb3;

import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30145k;
import r93.InterfaceC31155s0;
import sa3.AbstractC32327a;
import sa3.InterfaceC32332f;

/* JADX INFO: renamed from: hb3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C17109d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32332f f65713a;

    /* JADX INFO: renamed from: b */
    public final C30145k f65714b;

    /* JADX INFO: renamed from: c */
    public final AbstractC32327a f65715c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC31155s0 f65716d;

    public C17109d(InterfaceC32332f nameResolver, C30145k classProto, AbstractC32327a abstractC32327a, InterfaceC31155s0 sourceElement) {
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(classProto, "classProto");
        AbstractC22676k.m65750j(sourceElement, "sourceElement");
        this.f65713a = nameResolver;
        this.f65714b = classProto;
        this.f65715c = abstractC32327a;
        this.f65716d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17109d)) {
            return false;
        }
        C17109d c17109d = (C17109d) obj;
        return AbstractC22676k.m65745e(this.f65713a, c17109d.f65713a) && AbstractC22676k.m65745e(this.f65714b, c17109d.f65714b) && AbstractC22676k.m65745e(this.f65715c, c17109d.f65715c) && AbstractC22676k.m65745e(this.f65716d, c17109d.f65716d);
    }

    public final int hashCode() {
        return this.f65716d.hashCode() + ((this.f65715c.hashCode() + ((this.f65714b.hashCode() + (this.f65713a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f65713a + ", classProto=" + this.f65714b + ", metadataVersion=" + this.f65715c + ", sourceElement=" + this.f65716d + ')';
    }
}
