package p579wc;

import androidx.room.C1832u;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import gf.InterfaceC15761b;
import ie.EnumC18438a;
import p088dc.AbstractC11894a;
import p368og.EnumC27905b;
import p484s9.AbstractC32281f;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import ve.InterfaceC35921f;
import w91.C36965l;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wc.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C37100k1 implements InterfaceC35921f {

    /* JADX INFO: renamed from: w */
    public final C1832u f158714w;

    public C37100k1(C1832u c1832u) {
        this.f158714w = c1832u;
    }

    /* JADX INFO: renamed from: a */
    public final String m119018a(String str) {
        String str2 = (String) this.f158714w.invoke(str);
        if (str2 != null) {
            if (AbstractC39414r.m125890i0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        throw new ProviderConfigurationException(AbstractC31061c.m95633i('`', "Missing value for system property `", str));
    }

    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        InterfaceC30063j context = abstractC32269c.getContext();
        C36965l c36965l = new C36965l(23);
        EnumC27905b enumC27905b = EnumC27905b.f112502E;
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37100k1.class).getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c36965l);
        String strM119018a = m119018a(AbstractC37103l1.f158722a);
        String strM119018a2 = m119018a(AbstractC37103l1.f158723b);
        String str = AbstractC37103l1.f158724c;
        C1832u c1832u = this.f158714w;
        return AbstractC11894a.m31950R(AbstractC32306h.m100560h(strM119018a, strM119018a2, (String) c1832u.invoke(str), "SystemProperties", (String) c1832u.invoke(AbstractC37103l1.f158725d), 8), EnumC18438a.CREDENTIALS_JVM_SYSTEM_PROPERTIES);
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
