package p579wc;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import gf.InterfaceC15761b;
import ie.EnumC18438a;
import p088dc.AbstractC11894a;
import p368og.EnumC27905b;
import p484s9.AbstractC32281f;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import ve.InterfaceC35921f;
import w91.C36965l;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wc.l */
/* JADX INFO: loaded from: classes.dex */
public final class C37101l implements InterfaceC35921f {

    /* JADX INFO: renamed from: w */
    public final C22672i f158715w;

    /* JADX WARN: Multi-variable type inference failed */
    public C37101l(Function1 function1) {
        this.f158715w = (C22672i) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: a */
    public final String m119019a(String str) {
        String str2 = (String) this.f158715w.invoke(str);
        if (str2 != null) {
            if (AbstractC39414r.m125890i0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        throw new ProviderConfigurationException(AbstractC31061c.m95633i('`', "Missing value for environment variable `", str));
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        InterfaceC30063j context = abstractC32269c.getContext();
        C36965l c36965l = new C36965l(14);
        EnumC27905b enumC27905b = EnumC27905b.f112502E;
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37101l.class).getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c36965l);
        String strM119019a = m119019a(AbstractC37104m.f158726a);
        String strM119019a2 = m119019a(AbstractC37104m.f158727b);
        String str = AbstractC37104m.f158728c;
        ?? r10 = this.f158715w;
        return AbstractC11894a.m31950R(AbstractC32306h.m100560h(strM119019a, strM119019a2, (String) r10.invoke(str), "Environment", (String) r10.invoke(AbstractC37104m.f158729d), 8), EnumC18438a.CREDENTIALS_ENV_VARS);
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
