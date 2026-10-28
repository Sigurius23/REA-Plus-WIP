package p579wc;

import gf.InterfaceC15761b;
import ie.EnumC18438a;
import p088dc.AbstractC11894a;
import p505ts.AbstractC34132o;
import pf.InterfaceC29123a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ve.C35920e;
import ve.InterfaceC35918c;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: wc.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C37097j1 implements InterfaceC35918c {

    /* JADX INFO: renamed from: w */
    public final InterfaceC35967n f158704w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC29123a f158705x;

    /* JADX INFO: renamed from: y */
    public final String f158706y;

    public C37097j1(String str, InterfaceC29123a interfaceC29123a, InterfaceC35967n interfaceC35967n) {
        this.f158704w = interfaceC35967n;
        this.f158705x = interfaceC29123a;
        this.f158706y = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) throws Throwable {
        C37094i1 c37094i1;
        if (abstractC32269c instanceof C37094i1) {
            c37094i1 = (C37094i1) abstractC32269c;
            int i13 = c37094i1.f158689y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37094i1.f158689y = i13 - Integer.MIN_VALUE;
            } else {
                c37094i1 = new C37094i1(this, abstractC32269c);
            }
        } else {
            c37094i1 = new C37094i1(this, abstractC32269c);
        }
        Object objMo79294b = c37094i1.f158687w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37094i1.f158689y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo79294b);
            C37091h1 c37091h1M119013a = C37085f1.m119013a(this.f158706y, this.f158705x, this.f158704w);
            c37094i1.f158689y = 1;
            objMo79294b = c37091h1M119013a.mo79294b(interfaceC15761b, c37094i1);
            if (objMo79294b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo79294b);
        }
        return AbstractC11894a.m31950R((C35920e) objMo79294b, EnumC18438a.CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
