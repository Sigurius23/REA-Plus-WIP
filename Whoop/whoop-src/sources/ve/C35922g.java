package ve;

import bc3.AbstractC3006f0;
import gf.C15768i;
import gf.InterfaceC15761b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mg.C25527i;
import mg.InterfaceC25526h;
import ng.C26671a;
import ng.C26676f;
import ng.C26678h;
import p035bp.AbstractC3511b;
import p097ds.AbstractC12314q;
import p460rg.AbstractC31375j;
import p460rg.C31371f;
import p460rg.C31374i;
import p460rg.C31376k;
import p460rg.C31377l;
import p460rg.EnumC31369d;
import p460rg.EnumC31370e;
import p505ts.AbstractC34132o;
import p613xf.C38258d;
import p613xf.C38259e;
import p613xf.InterfaceC38257c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ve.g */
/* JADX INFO: loaded from: classes.dex */
public final class C35922g implements InterfaceC35921f, InterfaceC38257c, Closeable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC38257c[] f152987w;

    public C35922g(InterfaceC35921f... interfaceC35921fArr) {
        InterfaceC38257c[] providers = (InterfaceC38257c[]) Arrays.copyOf(interfaceC35921fArr, interfaceC35921fArr.length);
        AbstractC22676k.m65750j(providers, "providers");
        this.f152987w = providers;
        if (providers.length == 0) {
            throw new IllegalArgumentException("at least one provider must be in the chain");
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d5 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:49:0x00d1, B:51:0x00d5, B:53:0x00e5, B:52:0x00dd), top: B:58:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:49:0x00d1, B:51:0x00d5, B:53:0x00e5, B:52:0x00dd), top: B:58:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static Object m114101h(C35922g c35922g, InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        C38258d c38258d;
        C31371f c31371f;
        InterfaceC30063j c26678h;
        InterfaceC25526h interfaceC25526hM75078s;
        if (abstractC32269c instanceof C38258d) {
            c38258d = (C38258d) abstractC32269c;
            int i13 = c38258d.f164028z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38258d.f164028z = i13 - Integer.MIN_VALUE;
            } else {
                c38258d = new C38258d(c35922g, abstractC32269c);
            }
        } else {
            c38258d = new C38258d(c35922g, abstractC32269c);
        }
        Object obj = c38258d.f164026x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38258d.f164028z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31371f = c38258d.f164025w;
            try {
                try {
                    AbstractC34132o.m107864I(obj);
                    c31371f.getClass();
                    return obj;
                } catch (Exception e5) {
                    e = e5;
                    if (e instanceof CancellationException) {
                        AbstractC31375j.m96498n(c31371f, "cancelled", Boolean.TRUE);
                    } else {
                        EnumC31370e[] enumC31370eArr = EnumC31370e.f129032w;
                        c31371f.m96484b();
                        AbstractC31375j.m96497m(c31371f, e);
                    }
                    throw e;
                }
            } catch (Throwable th3) {
                th = th3;
                c31371f.getClass();
                throw th;
            }
        }
        AbstractC34132o.m107864I(obj);
        EnumC31369d enumC31369d = EnumC31369d.f129029w;
        if (AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35922g.class).getQualifiedName() == null) {
            throw new IllegalArgumentException("withSpan<T> cannot be used on an anonymous object");
        }
        ((C31377l) AbstractC3511b.m10394w(c38258d.getContext()).mo75077d()).getClass();
        AbstractC12314q.m34346z(c38258d.getContext());
        C31371f c31371fM96483a = C31376k.f129039a.m96483a("ResolveIdentityChain", C15768i.f59433w, enumC31369d);
        try {
            C25527i c25527i = (C25527i) c38258d.getContext().get(C25527i.f99938x);
            C26676f c26676f = (c25527i == null || (interfaceC25526hM75078s = c25527i.m75078s()) == null || interfaceC25526hM75078s.mo75076b() == null) ? null : C26671a.f106051a;
            C30064k c30064k = C30064k.f122676w;
            if (c26676f != null) {
                c26678h = new C26678h(c26676f);
            } else {
                c26678h = (C26678h) c38258d.getContext().get(C26678h.f106054x);
                if (c26678h == null) {
                    c26678h = c30064k;
                }
            }
            InterfaceC30063j interfaceC30063jPlus = new C31374i(c31371fM96483a).plus(c26678h).plus(c30064k);
            C38259e c38259e = new C38259e(c31371fM96483a, null, c35922g, interfaceC15761b);
            c38258d.f164025w = c31371fM96483a;
            c38258d.f164028z = 1;
            Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jPlus, c38259e, c38258d);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
            obj = objM8705K;
            c31371f = c31371fM96483a;
            c31371f.getClass();
            return obj;
        } catch (Exception e13) {
            e = e13;
            c31371f = c31371fM96483a;
            if (e instanceof CancellationException) {
                AbstractC31375j.m96498n(c31371f, "cancelled", Boolean.TRUE);
            } else {
                EnumC31370e[] enumC31370eArr2 = EnumC31370e.f129032w;
                c31371f.m96484b();
                AbstractC31375j.m96497m(c31371f, e);
            }
            throw e;
        } catch (Throwable th4) {
            th = th4;
            c31371f = c31371fM96483a;
            c31371f.getClass();
            throw th;
        }
    }

    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        return m114101h(this, interfaceC15761b, abstractC32269c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        Exception exc;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC38257c interfaceC38257c : this.f152987w) {
            try {
                exc = null;
                Closeable closeable = interfaceC38257c instanceof Closeable ? (Closeable) interfaceC38257c : null;
                if (closeable != null) {
                    closeable.close();
                }
            } catch (Exception e5) {
                exc = e5;
            }
            if (exc != null) {
                arrayList.add(exc);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Exception exc2 = (Exception) AbstractC25265s.m74096F0(arrayList);
        Iterator it = AbstractC25265s.m74161z0(arrayList, 1).iterator();
        while (it.hasNext()) {
            exc2.addSuppressed((Throwable) it.next());
        }
        throw exc2;
    }

    public final String toString() {
        return AbstractC25260n.m74028D0(this.f152987w, " -> ", null, null, null, 62);
    }
}
