package p579wc;

import aws.sdk.kotlin.runtime.auth.credentials.InvalidJsonCredentialsException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import gf.InterfaceC15761b;
import gm.C15990r;
import ie.EnumC18438a;
import io.getstream.chat.android.client.C19092i;
import l83.C23465k;
import m83.AbstractC25260n;
import p000.AbstractC11266d;
import p048ce.AbstractC4482w;
import p088dc.AbstractC11894a;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p251jg.C21649b;
import p251jg.C21652e;
import p460rg.AbstractC31366a;
import p484s9.AbstractC32281f;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import ug.C34913b;
import ve.InterfaceC35921f;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35967n;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wc.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37093i0 implements InterfaceC35921f {

    /* JADX INFO: renamed from: w */
    public final String f158683w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35967n f158684x;

    /* JADX INFO: renamed from: y */
    public final long f158685y;

    /* JADX INFO: renamed from: z */
    public final long f158686z;

    public C37093i0(String credentialProcess) {
        InterfaceC35967n.f153143a.getClass();
        C35971r platformProvider = C35966m.f153142b;
        AbstractC22676k.m65750j(credentialProcess, "credentialProcess");
        AbstractC22676k.m65750j(platformProvider, "platformProvider");
        this.f158683w = credentialProcess;
        this.f158684x = platformProvider;
        this.f158685y = 65536L;
        this.f158686z = 60000L;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        C37090h0 c37090h0;
        C15990r c15990r;
        if (abstractC32269c instanceof C37090h0) {
            c37090h0 = (C37090h0) abstractC32269c;
            int i13 = c37090h0.f158674z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37090h0.f158674z = i13 - Integer.MIN_VALUE;
            } else {
                c37090h0 = new C37090h0(this, abstractC32269c);
            }
        } else {
            c37090h0 = new C37090h0(this, abstractC32269c);
        }
        C37090h0 c37090h1 = c37090h0;
        Object obj = c37090h1.f158672x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37090h1.f158674z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j context = c37090h1.getContext();
                String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37093i0.class).getQualifiedName();
                if (qualifiedName == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
                }
                C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
                String str = this.f158683w;
                InterfaceC35967n interfaceC35967n = this.f158684x;
                long j7 = this.f158685y;
                long j13 = this.f158686z;
                c37090h1.f158671w = c15990rM113984B;
                c37090h1.f158674z = 1;
                Object objM96471k = AbstractC31366a.m96471k(str, interfaceC35967n, j7, j13, c37090h1);
                if (objM96471k == enumC31071a) {
                    return enumC31071a;
                }
                c15990r = c15990rM113984B;
                obj = objM96471k;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c15990r = c37090h1.f158671w;
                AbstractC34132o.m107864I(obj);
            }
            C23465k c23465k = (C23465k) obj;
            int iIntValue = ((Number) c23465k.f92937w).intValue();
            String str2 = (String) c23465k.f92938x;
            Integer numValueOf = null;
            if (iIntValue != 0) {
                c15990r.mo390n(null, new C19092i(iIntValue, str2));
                throw new CredentialsProviderException(null, AbstractC11266d.m30456j(iIntValue, "Command completed with nonzero exit code ", ": ", str2));
            }
            C21649b c21649b = new C21649b(AbstractC39421y.m125919D(str2));
            C17251l c17251l = C17251l.f66278i;
            C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessKeyId")}), 0);
            C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("SecretAccessKey")}), 0);
            C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("SessionToken")}), 0);
            C17248i c17248i4 = new C17248i(C17251l.f66280k, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Expiration")}), 0);
            C17248i c17248i5 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Version")}), 0);
            C17248i c17248i6 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccountId")}), 0);
            C38445a c38445a = new C38445a(13);
            c38445a.m123180p(c17248i);
            c38445a.m123180p(c17248i2);
            c38445a.m123180p(c17248i3);
            c38445a.m123180p(c17248i4);
            c38445a.m123180p(c17248i5);
            c38445a.m123180p(c17248i6);
            try {
                InterfaceC17242c interfaceC17242cM60916d = c21649b.m60916d(new C17249j(c38445a));
                C34913b c34913bM106272p = null;
                String strMo45166o = null;
                String strMo45166o2 = null;
                String strMo45166o3 = null;
                String strMo45166o4 = null;
                while (true) {
                    Integer numMo45167q = interfaceC17242cM60916d.mo45167q();
                    int i15 = c17248i.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i15) {
                        int i16 = c17248i2.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i16) {
                            int i17 = c17248i3.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i17) {
                                int i18 = c17248i4.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i18) {
                                    int i19 = c17248i5.f66267b;
                                    if (numMo45167q == null || numMo45167q.intValue() != i19) {
                                        int i24 = c17248i6.f66267b;
                                        if (numMo45167q == null || numMo45167q.intValue() != i24) {
                                            if (numMo45167q == null) {
                                                break;
                                            }
                                            interfaceC17242cM60916d.skipValue();
                                        } else {
                                            strMo45166o4 = interfaceC17242cM60916d.mo45166o();
                                        }
                                    } else {
                                        numValueOf = Integer.valueOf(interfaceC17242cM60916d.mo45164h());
                                    }
                                } else {
                                    C33647p c33647p = C34913b.f147015x;
                                    c34913bM106272p = C33647p.m106272p(interfaceC17242cM60916d.mo45166o());
                                }
                            } else {
                                strMo45166o3 = interfaceC17242cM60916d.mo45166o();
                            }
                        } else {
                            strMo45166o2 = interfaceC17242cM60916d.mo45166o();
                        }
                    } else {
                        strMo45166o = interfaceC17242cM60916d.mo45166o();
                    }
                }
                if (strMo45166o == null) {
                    throw new InvalidJsonCredentialsException("missing field `" + AbstractC4482w.m13980P(c17248i) + '`', 0);
                }
                if (strMo45166o2 == null) {
                    throw new InvalidJsonCredentialsException("missing field `" + AbstractC4482w.m13980P(c17248i2) + '`', 0);
                }
                if (strMo45166o3 == null) {
                    throw new InvalidJsonCredentialsException("missing field `" + AbstractC4482w.m13980P(c17248i3) + '`', 0);
                }
                if (numValueOf == null) {
                    throw new InvalidJsonCredentialsException("missing field `" + AbstractC4482w.m13980P(c17248i5) + '`', 0);
                }
                if (numValueOf.intValue() == 1) {
                    if (c34913bM106272p == null) {
                        c34913bM106272p = C34913b.f147014F;
                    }
                    return AbstractC11894a.m31950R(AbstractC32306h.m100559g(strMo45166o, strMo45166o2, strMo45166o3, c34913bM106272p, "Process", strMo45166o4), EnumC18438a.CREDENTIALS_PROCESS);
                }
                throw new InvalidJsonCredentialsException("version " + numValueOf.intValue() + " is not supported", 0);
            } catch (DeserializationException e5) {
                throw new InvalidJsonCredentialsException("invalid JSON credentials response", e5);
            }
        } catch (Exception e13) {
            throw new CredentialsProviderException("Failed to execute command", e13);
        }
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
