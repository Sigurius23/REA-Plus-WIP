package vc3;

import kotlinx.datetime.DatePeriod;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C35884c implements InterfaceC37138c {

    /* JADX INFO: renamed from: b */
    public static final C35884c f152803b = new C35884c();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC39443g f152804c = AbstractC35952b.m114194b("kotlinx.datetime.DatePeriod", C39441e.f169698i);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C35883b f152805a = C35883b.f152801a;

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        return this.f152805a.deserialize(interfaceC40541d);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152804c;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        DatePeriod value = (DatePeriod) obj;
        AbstractC22676k.m65750j(value, "value");
        this.f152805a.getClass();
        interfaceC40542e.encodeString(value.toString());
    }
}
