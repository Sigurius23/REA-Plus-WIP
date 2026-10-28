package p579wc;

import bc3.AbstractC3006f0;
import gf.InterfaceC15761b;
import gm.C15990r;
import ie.EnumC18438a;
import java.io.IOException;
import p088dc.AbstractC11894a;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p645yc.C39422a;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sz.C33151q;
import ug.C34912a;
import ve.C35920e;
import ve.InterfaceC35918c;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35967n;
import vv1.C36532c;

/* JADX INFO: renamed from: wc.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C37124w implements InterfaceC35918c {

    /* JADX INFO: renamed from: E */
    public final String f158819E;

    /* JADX INFO: renamed from: F */
    public final C39422a f158820F;

    /* JADX INFO: renamed from: w */
    public final String f158821w;

    /* JADX INFO: renamed from: x */
    public final String f158822x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35967n f158823y;

    /* JADX INFO: renamed from: z */
    public final C34912a f158824z;

    public C37124w(String loginSession, String str) {
        InterfaceC35967n.f153143a.getClass();
        C35971r platformProvider = C35966m.f153142b;
        AbstractC22676k.m65750j(loginSession, "loginSession");
        AbstractC22676k.m65750j(platformProvider, "platformProvider");
        this.f158821w = loginSession;
        this.f158822x = str;
        this.f158823y = platformProvider;
        this.f158824z = C34912a.f147012a;
        String strM114207b = platformProvider.m114207b("AWS_LOGIN_IN_CACHE_DIRECTORY");
        this.f158819E = strM114207b == null ? AbstractC37131z0.m119045b(platformProvider, "~", ".aws", "login", "cache") : strM114207b;
        this.f158820F = (C39422a) AbstractC3006f0.m8699E(C30064k.f122676w, new C33151q(this, null, 12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        C37122v c37122v;
        if (abstractC32269c instanceof C37122v) {
            c37122v = (C37122v) abstractC32269c;
            int i13 = c37122v.f158813y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37122v.f158813y = i13 - Integer.MIN_VALUE;
            } else {
                c37122v = new C37122v(this, abstractC32269c);
            }
        } else {
            c37122v = new C37122v(this, abstractC32269c);
        }
        Object objMo79294b = c37122v.f158811w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37122v.f158813y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo79294b);
            InterfaceC30063j context = c37122v.getContext();
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37124w.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
            C37084f0 c37084f0 = new C37084f0(this.f158821w, this.f158823y, this.f158824z, this.f158819E, this.f158820F);
            c15990rM113984B.mo394s(null, new C36532c(this, 7));
            c37122v.f158813y = 1;
            objMo79294b = c37084f0.mo79294b(interfaceC15761b, c37122v);
            if (objMo79294b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo79294b);
        }
        return AbstractC11894a.m31950R((C35920e) objMo79294b, EnumC18438a.CREDENTIALS_LOGIN);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f158820F.close();
    }
}
