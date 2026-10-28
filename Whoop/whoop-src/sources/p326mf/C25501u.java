package p326mf;

import aws.smithy.kotlin.runtime.http.engine.HttpClientEngineClosedException;
import bc3.AbstractC3006f0;
import g20.C15270p;
import p091dg.C12002a;
import p522uf.C34894u;
import p551vf.C35937b;
import p551vf.C35943h;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29143u;
import pf.InterfaceC29123a;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32416g;

/* JADX INFO: renamed from: mf.u */
/* JADX INFO: loaded from: classes.dex */
public final class C25501u implements InterfaceC39492e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29123a f99858a;

    public C25501u(InterfaceC29123a engine) {
        AbstractC22676k.m65750j(engine, "engine");
        this.f99858a = engine;
    }

    @Override // p647yf.InterfaceC39492e
    /* JADX INFO: renamed from: a */
    public final Object mo2061a(Object obj, AbstractC32269c abstractC32269c) {
        C34894u c34894u = (C34894u) obj;
        return m74907b(c34894u.m110033b(), ((C35937b) c34894u.m110034c()).m114177b(), abstractC32269c);
    }

    /* JADX INFO: renamed from: b */
    public final Object m74907b(C12002a c12002a, C35943h c35943h, AbstractC32269c abstractC32269c) {
        InterfaceC29123a interfaceC29123a = this.f99858a;
        if (!AbstractC3006f0.m8725s(interfaceC29123a.getCoroutineContext()).isActive()) {
            throw new HttpClientEngineClosedException(0);
        }
        InterfaceC30063j interfaceC30063jM101162s = AbstractC32416g.m101162s(interfaceC29123a, abstractC32269c.getContext());
        Object objM8817m = AbstractC3006f0.m8711e(interfaceC29123a, interfaceC30063jM101162s.plus(new C29143u(interfaceC30063jM101162s)), new C15270p(this, c12002a, c35943h, (InterfaceC30057d) null, 28), 2).m8817m(abstractC32269c);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }
}
