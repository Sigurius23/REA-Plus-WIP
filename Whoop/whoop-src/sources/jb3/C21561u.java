package jb3;

import java.util.List;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.C23758a1;
import lb3.C23784k0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import nb3.C26552i;
import nb3.C26555l;
import nb3.EnumC26554k;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import qa3.C30175y0;
import r93.AbstractC31152r;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import s93.InterfaceC32307i;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import se.AbstractC32410a;
import u93.AbstractC34676g;
import u93.C34672e;
import u93.C34674f;
import va3.C35850h;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: jb3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C21561u extends AbstractC34676g implements InterfaceC21551k {

    /* JADX INFO: renamed from: K */
    public final C30175y0 f82690K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC32332f f82691L;

    /* JADX INFO: renamed from: M */
    public final C32334h f82692M;

    /* JADX INFO: renamed from: N */
    public final C32336j f82693N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC21550j f82694O;

    /* JADX INFO: renamed from: P */
    public AbstractC23763c0 f82695P;

    /* JADX INFO: renamed from: Q */
    public AbstractC23763c0 f82696Q;

    /* JADX INFO: renamed from: R */
    public List f82697R;

    /* JADX INFO: renamed from: S */
    public AbstractC23763c0 f82698S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21561u(InterfaceC22345n storageManager, InterfaceC31135k containingDeclaration, InterfaceC32307i interfaceC32307i, C35850h c35850h, AbstractC31152r visibility, C30175y0 proto, InterfaceC32332f nameResolver, C32334h typeTable, C32336j versionRequirementTable, InterfaceC21550j interfaceC21550j) {
        super(storageManager, containingDeclaration, interfaceC32307i, c35850h, visibility);
        AbstractC22676k.m65750j(storageManager, "storageManager");
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(visibility, "visibility");
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        AbstractC22676k.m65750j(versionRequirementTable, "versionRequirementTable");
        this.f82690K = proto;
        this.f82691L = nameResolver;
        this.f82692M = typeTable;
        this.f82693N = versionRequirementTable;
        this.f82694O = interfaceC21550j;
    }

    /* JADX INFO: renamed from: J0 */
    public final InterfaceC31117e m60589J0() {
        if (AbstractC23791o.m69886e(m60590K0())) {
            return null;
        }
        InterfaceC31126h interfaceC31126hMo1784d = m60590K0().mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d instanceof InterfaceC31117e) {
            return (InterfaceC31117e) interfaceC31126hMo1784d;
        }
        return null;
    }

    /* JADX INFO: renamed from: K0 */
    public final AbstractC23763c0 m60590K0() {
        AbstractC23763c0 abstractC23763c0 = this.f82696Q;
        if (abstractC23763c0 != null) {
            return abstractC23763c0;
        }
        AbstractC22676k.m65757q("expandedType");
        throw null;
    }

    /* JADX INFO: renamed from: L0 */
    public final AbstractC23763c0 m60591L0() {
        AbstractC23763c0 abstractC23763c0 = this.f82695P;
        if (abstractC23763c0 != null) {
            return abstractC23763c0;
        }
        AbstractC22676k.m65757q("underlyingType");
        throw null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m60592M0(List list, AbstractC23763c0 underlyingType, AbstractC23763c0 expandedType) {
        InterfaceC22712o interfaceC22712oMo60489K;
        AbstractC23763c0 abstractC23763c0M69893l;
        AbstractC22676k.m65750j(underlyingType, "underlyingType");
        AbstractC22676k.m65750j(expandedType, "expandedType");
        this.f146065H = list;
        this.f82695P = underlyingType;
        this.f82696Q = expandedType;
        this.f82697R = AbstractC21598x.m60704u(this);
        InterfaceC31117e interfaceC31117eM60589J0 = m60589J0();
        if (interfaceC31117eM60589J0 == null || (interfaceC22712oMo60489K = interfaceC31117eM60589J0.mo60489K()) == null) {
            interfaceC22712oMo60489K = C22711n.f89378b;
        }
        InterfaceC22712o interfaceC22712o = interfaceC22712oMo60489K;
        C34672e c34672e = new C34672e(this);
        C26552i c26552i = AbstractC23767d1.f94137a;
        if (C26555l.m78685f(this)) {
            abstractC23763c0M69893l = C26555l.m78682c(EnumC26554k.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            InterfaceC23796q0 interfaceC23796q0Mo60496e = mo60496e();
            if (interfaceC23796q0Mo60496e == null) {
                AbstractC23767d1.m69845a(12);
                throw null;
            }
            List listM69848d = AbstractC23767d1.m69848d(((C34674f) interfaceC23796q0Mo60496e).getParameters());
            C23784k0.f94165x.getClass();
            abstractC23763c0M69893l = AbstractC23791o.m69893l(C23784k0.f94166y, interfaceC23796q0Mo60496e, listM69848d, false, interfaceC22712o, c34672e);
        }
        this.f82698S = abstractC23763c0M69893l;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: R */
    public final InterfaceC37019v mo60564R() {
        return this.f82690K;
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31138l mo60593d(C23758a1 substitutor) {
        AbstractC22676k.m65750j(substitutor, "substitutor");
        if (substitutor.f94122a.mo69908e()) {
            return this;
        }
        InterfaceC31135k interfaceC31135kMo60581g = mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
        InterfaceC32307i annotations = getAnnotations();
        AbstractC22676k.m65749i(annotations, "<get-annotations>(...)");
        C35850h name = getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        C21561u c21561u = new C21561u(this.f146063F, interfaceC31135kMo60581g, annotations, name, this.f146064G, this.f82690K, this.f82691L, this.f82692M, this.f82693N, this.f82694O);
        List listMo60497j = mo60497j();
        AbstractC23763c0 abstractC23763c0M60591L0 = m60591L0();
        EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
        c21561u.m60592M0(listMo60497j, AbstractC32410a.m101050t(substitutor.m69822g(abstractC23763c0M60591L0, enumC23776g1)), AbstractC32410a.m101050t(substitutor.m69822g(m60590K0(), enumC23776g1)));
        return c21561u;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: i */
    public final AbstractC23763c0 mo60594i() {
        AbstractC23763c0 abstractC23763c0 = this.f82698S;
        if (abstractC23763c0 != null) {
            return abstractC23763c0;
        }
        AbstractC22676k.m65757q("defaultTypeImpl");
        throw null;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: t */
    public final C32334h mo60567t() {
        return this.f82692M;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: w */
    public final InterfaceC32332f mo60568w() {
        return this.f82691L;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: x */
    public final InterfaceC21550j mo60569x() {
        return this.f82694O;
    }
}
