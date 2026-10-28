package r93;

import java.util.List;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: r93.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C31114d implements InterfaceC31165x0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC31165x0 f128316w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC31129i f128317x;

    /* JADX INFO: renamed from: y */
    public final int f128318y;

    public C31114d(InterfaceC31165x0 interfaceC31165x0, InterfaceC31129i interfaceC31129i, int i13) {
        this.f128316w = interfaceC31165x0;
        this.f128317x = interfaceC31129i;
        this.f128318y = i13;
    }

    @Override // r93.InterfaceC31165x0
    /* JADX INFO: renamed from: D */
    public final boolean mo95861D() {
        return true;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return this.f128316w.mo78659T(interfaceC31141m, obj);
    }

    @Override // r93.InterfaceC31126h, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31126h mo78660a() {
        return this.f128316w.mo78660a();
    }

    @Override // r93.InterfaceC31165x0, r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        InterfaceC23796q0 interfaceC23796q0Mo60496e = this.f128316w.mo60496e();
        AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
        return interfaceC23796q0Mo60496e;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        return this.f128317x;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return this.f128316w.getAnnotations();
    }

    @Override // r93.InterfaceC31165x0
    public final int getIndex() {
        return this.f128316w.getIndex() + this.f128318y;
    }

    @Override // r93.InterfaceC31135k
    public final C35850h getName() {
        C35850h name = this.f128316w.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return name;
    }

    @Override // r93.InterfaceC31138l
    public final InterfaceC31155s0 getSource() {
        InterfaceC31155s0 source = this.f128316w.getSource();
        AbstractC22676k.m65749i(source, "getSource(...)");
        return source;
    }

    @Override // r93.InterfaceC31165x0
    public final List getUpperBounds() {
        List upperBounds = this.f128316w.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // r93.InterfaceC31165x0
    public final EnumC23776g1 getVariance() {
        EnumC23776g1 variance = this.f128316w.getVariance();
        AbstractC22676k.m65749i(variance, "getVariance(...)");
        return variance;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: i */
    public final AbstractC23763c0 mo60594i() {
        AbstractC23763c0 abstractC23763c0Mo60594i = this.f128316w.mo60594i();
        AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
        return abstractC23763c0Mo60594i;
    }

    @Override // r93.InterfaceC31165x0
    public final boolean isReified() {
        return this.f128316w.isReified();
    }

    public final String toString() {
        return this.f128316w + "[inner-copy]";
    }

    @Override // r93.InterfaceC31165x0
    /* JADX INFO: renamed from: z */
    public final InterfaceC22345n mo95862z() {
        InterfaceC22345n interfaceC22345nMo95862z = this.f128316w.mo95862z();
        AbstractC22676k.m65749i(interfaceC22345nMo95862z, "getStorageManager(...)");
        return interfaceC22345nMo95862z;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31135k mo78660a() {
        return this.f128316w.mo78660a();
    }

    @Override // r93.InterfaceC31165x0, r93.InterfaceC31126h, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31165x0 mo78660a() {
        return this.f128316w.mo78660a();
    }
}
