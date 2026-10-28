package to;

import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import cd3.C4455g;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jp.HandlerC21846d;
import p000.AbstractC11266d;
import p002a0.C0022g;
import p036bq.RunnableC3543b;
import p044c5.RunnableC4209a;
import p073cq.C11040i;
import p529uo.AbstractC35107c;
import p529uo.AbstractC35135w;
import p529uo.C35110d0;
import p590wo.C37435c;
import pg3.C29203o;
import q30.C29934u0;

/* JADX INFO: renamed from: to.v */
/* JADX INFO: loaded from: classes.dex */
public final class C34003v implements InterfaceC4978i, InterfaceC4979j {

    /* JADX INFO: renamed from: g */
    public final InterfaceC4973d f142495g;

    /* JADX INFO: renamed from: h */
    public final C33961a f142496h;

    /* JADX INFO: renamed from: i */
    public final C29203o f142497i;

    /* JADX INFO: renamed from: l */
    public final int f142500l;

    /* JADX INFO: renamed from: m */
    public final BinderC33978i0 f142501m;

    /* JADX INFO: renamed from: n */
    public boolean f142502n;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C33971f f142506r;

    /* JADX INFO: renamed from: f */
    public final LinkedList f142494f = new LinkedList();

    /* JADX INFO: renamed from: j */
    public final HashSet f142498j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final HashMap f142499k = new HashMap();

    /* JADX INFO: renamed from: o */
    public final ArrayList f142503o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public C4969a f142504p = null;

    /* JADX INFO: renamed from: q */
    public int f142505q = 0;

    public C34003v(C33971f c33971f, AbstractC4977h abstractC4977h) {
        this.f142506r = c33971f;
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        InterfaceC4973d interfaceC4973dZaa = abstractC4977h.zaa(handlerC21846d.getLooper(), this);
        this.f142495g = interfaceC4973dZaa;
        this.f142496h = abstractC4977h.getApiKey();
        this.f142497i = new C29203o(4);
        this.f142500l = abstractC4977h.zab();
        if (interfaceC4973dZaa.mo5665a()) {
            this.f142501m = abstractC4977h.zac(c33971f.f142418E, handlerC21846d);
        } else {
            this.f142501m = null;
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC4978i
    /* JADX INFO: renamed from: X */
    public final void mo15599X(int i13) {
        C33971f c33971f = this.f142506r;
        if (Looper.myLooper() == c33971f.f142427N.getLooper()) {
            m107476b(i13);
        } else {
            c33971f.f142427N.post(new RunnableC4209a(this, i13, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m107475a() {
        InterfaceC4973d interfaceC4973d = this.f142495g;
        C33971f c33971f = this.f142506r;
        AbstractC35135w.m111091c(c33971f.f142427N);
        this.f142504p = null;
        m107484j(C4969a.f20478E);
        if (this.f142502n) {
            HandlerC21846d handlerC21846d = c33971f.f142427N;
            C33961a c33961a = this.f142496h;
            handlerC21846d.removeMessages(11, c33961a);
            c33971f.f142427N.removeMessages(9, c33961a);
            this.f142502n = false;
        }
        Iterator it = this.f142499k.values().iterator();
        while (it.hasNext()) {
            try {
                ((C33972f0) it.next()).f142433a.mo107436b(interfaceC4973d, new C11040i());
            } catch (DeadObjectException unused) {
                mo15599X(3);
                ((AbstractC35107c) interfaceC4973d).m111059f("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException e5) {
                e = e5;
                Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            } catch (RuntimeException e13) {
                e = e13;
                Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            }
        }
        m107478d();
        m107482h();
    }

    /* JADX INFO: renamed from: b */
    public final void m107476b(int i13) {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        this.f142504p = null;
        this.f142502n = true;
        String str = ((AbstractC35107c) this.f142495g).f148962a;
        C29203o c29203o = this.f142497i;
        c29203o.getClass();
        StringBuilder sb4 = new StringBuilder("The connection to Google Play services was lost");
        if (i13 == 1) {
            sb4.append(" due to service disconnection.");
        } else if (i13 == 3) {
            sb4.append(" due to dead object exception.");
        }
        if (str != null) {
            sb4.append(" Last reason for disconnect: ");
            sb4.append(str);
        }
        c29203o.m88706v0(new Status(20, sb4.toString(), null, null), true);
        C33961a c33961a = this.f142496h;
        C33971f c33971f = this.f142506r;
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        handlerC21846d.sendMessageDelayed(Message.obtain(handlerC21846d, 9, c33961a), 5000L);
        HandlerC21846d handlerC21846d2 = c33971f.f142427N;
        handlerC21846d2.sendMessageDelayed(Message.obtain(handlerC21846d2, 11, c33961a), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) c33971f.f142420G.f115462x;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f142499k.values().iterator();
        while (it.hasNext()) {
            ((C33972f0) it.next()).f142435c.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m107477c(C4969a c4969a) {
        synchronized (C33971f.f142416R) {
            try {
                C33971f c33971f = this.f142506r;
                if (c33971f.f142424K == null || !c33971f.f142425L.contains(this.f142496h)) {
                    return false;
                }
                c33971f.f142424K.m107469l(c4969a, this.f142500l);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC4979j
    /* JADX INFO: renamed from: c0 */
    public final void mo15607c0(C4969a c4969a) {
        m107486l(c4969a, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m107478d() {
        LinkedList linkedList = this.f142494f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC33988n0 abstractC33988n0 = (AbstractC33988n0) arrayList.get(i13);
            if (!((AbstractC35107c) this.f142495g).m111062n()) {
                return;
            }
            if (m107479e(abstractC33988n0)) {
                linkedList.remove(abstractC33988n0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final boolean m107479e(AbstractC33988n0 abstractC33988n0) {
        if (!(abstractC33988n0 instanceof AbstractC33968d0)) {
            C29203o c29203o = this.f142497i;
            InterfaceC4973d interfaceC4973d = this.f142495g;
            abstractC33988n0.mo107453c(c29203o, interfaceC4973d.mo5665a());
            try {
                abstractC33988n0.mo107454d(this);
                return true;
            } catch (DeadObjectException unused) {
                mo15599X(1);
                ((AbstractC35107c) interfaceC4973d).m111059f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        AbstractC33968d0 abstractC33968d0 = (AbstractC33968d0) abstractC33988n0;
        C4986c[] c4986cArrMo107425f = abstractC33968d0.mo107425f(this);
        C4986c c4986c = null;
        if (c4986cArrMo107425f != null && c4986cArrMo107425f.length != 0) {
            C35110d0 c35110d0 = ((AbstractC35107c) this.f142495g).f148983v;
            C4986c[] c4986cArr = c35110d0 == null ? null : c35110d0.f148989x;
            if (c4986cArr == null) {
                c4986cArr = new C4986c[0];
            }
            C0022g c0022g = new C0022g(c4986cArr.length);
            for (C4986c c4986c2 : c4986cArr) {
                c0022g.put(c4986c2.f20522w, Long.valueOf(c4986c2.m15611b()));
            }
            for (C4986c c4986c3 : c4986cArrMo107425f) {
                Long l7 = (Long) c0022g.get(c4986c3.f20522w);
                if (l7 == null || l7.longValue() < c4986c3.m15611b()) {
                    c4986c = c4986c3;
                    break;
                }
            }
        }
        if (c4986c == null) {
            C29203o c29203o2 = this.f142497i;
            InterfaceC4973d interfaceC4973d2 = this.f142495g;
            abstractC33988n0.mo107453c(c29203o2, interfaceC4973d2.mo5665a());
            try {
                abstractC33988n0.mo107454d(this);
                return true;
            } catch (DeadObjectException unused2) {
                mo15599X(1);
                ((AbstractC35107c) interfaceC4973d2).m111059f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f142495g.getClass().getName();
        String str = c4986c.f20522w;
        long jM15611b = c4986c.m15611b();
        StringBuilder sb4 = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jM15611b).length() + 2);
        AbstractC11266d.m30444B(sb4, name, " could not execute call because it requires feature (", str, ", ");
        sb4.append(jM15611b);
        sb4.append(").");
        Log.w("GoogleApiManager", sb4.toString());
        C33971f c33971f = this.f142506r;
        if (!c33971f.f142428O || !abstractC33968d0.mo107426g(this)) {
            abstractC33968d0.mo107452b(new UnsupportedApiCallException(c4986c));
            return true;
        }
        C34004w c34004w = new C34004w(this.f142496h, c4986c);
        ArrayList arrayList = this.f142503o;
        int iIndexOf = arrayList.indexOf(c34004w);
        if (iIndexOf >= 0) {
            C34004w c34004w2 = (C34004w) arrayList.get(iIndexOf);
            c33971f.f142427N.removeMessages(15, c34004w2);
            c33971f.f142427N.sendMessageDelayed(Message.obtain(c33971f.f142427N, 15, c34004w2), 5000L);
            return false;
        }
        arrayList.add(c34004w);
        c33971f.f142427N.sendMessageDelayed(Message.obtain(c33971f.f142427N, 15, c34004w), 5000L);
        c33971f.f142427N.sendMessageDelayed(Message.obtain(c33971f.f142427N, 16, c34004w), 120000L);
        C4969a c4969a = new C4969a(2, null);
        if (m107477c(c4969a)) {
            String str2 = c4986c.f20522w;
            long jM15611b2 = c4986c.m15611b();
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jM15611b2).length());
            sb5.append("A dialog should be displayed for missing feature: ");
            sb5.append(str2);
            sb5.append(", version: ");
            sb5.append(jM15611b2);
            Log.w("GoogleApiManager", sb5.toString());
            return false;
        }
        if (!c33971f.f142419F.zad(c33971f.f142418E, c4969a, this.f142500l)) {
            return false;
        }
        String str3 = c4986c.f20522w;
        long jM15611b3 = c4986c.m15611b();
        StringBuilder sb6 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jM15611b3).length());
        sb6.append("Notification displayed for missing feature: ");
        sb6.append(str3);
        sb6.append(", version: ");
        sb6.append(jM15611b3);
        Log.w("GoogleApiManager", sb6.toString());
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m107480f(Status status, Exception exc, boolean z4) {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f142494f.iterator();
        while (it.hasNext()) {
            AbstractC33988n0 abstractC33988n0 = (AbstractC33988n0) it.next();
            if (!z4 || abstractC33988n0.f142464a == 2) {
                if (status != null) {
                    abstractC33988n0.mo107451a(status);
                } else {
                    abstractC33988n0.mo107452b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m107481g(Status status) {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        m107480f(status, null, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m107482h() {
        C33971f c33971f = this.f142506r;
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        C33961a c33961a = this.f142496h;
        handlerC21846d.removeMessages(12, c33961a);
        HandlerC21846d handlerC21846d2 = c33971f.f142427N;
        handlerC21846d2.sendMessageDelayed(handlerC21846d2.obtainMessage(12, c33961a), c33971f.f142429w);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m107483i(boolean z4) {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        AbstractC35107c abstractC35107c = (AbstractC35107c) this.f142495g;
        if (!abstractC35107c.m111062n() || !this.f142499k.isEmpty()) {
            return false;
        }
        C29203o c29203o = this.f142497i;
        if (((Map) c29203o.f118198w).isEmpty() && ((Map) c29203o.f118199x).isEmpty()) {
            abstractC35107c.m111059f("Timing out service connection.");
            return true;
        }
        if (!z4) {
            return false;
        }
        m107482h();
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m107484j(C4969a c4969a) {
        String str;
        HashSet<C33990o0> hashSet = this.f142498j;
        for (C33990o0 c33990o0 : hashSet) {
            if (AbstractC35135w.m111097i(c4969a, C4969a.f20478E)) {
                AbstractC35107c abstractC35107c = (AbstractC35107c) this.f142495g;
                if (!abstractC35107c.m111062n() || abstractC35107c.f148963b == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
                str = "com.google.android.gms";
            } else {
                str = null;
            }
            c33990o0.m107464c(this.f142496h, c4969a, str);
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m107485k(C4969a c4969a) {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        Object obj = this.f142495g;
        String name = obj.getClass().getName();
        String strValueOf = String.valueOf(c4969a);
        AbstractC35107c abstractC35107c = (AbstractC35107c) obj;
        abstractC35107c.m111059f(AbstractC11266d.m30464r(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        m107486l(c4969a, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m107486l(C4969a c4969a, RuntimeException runtimeException) {
        C33971f c33971f = this.f142506r;
        AbstractC35135w.m111091c(c33971f.f142427N);
        BinderC33978i0 binderC33978i0 = this.f142501m;
        if (binderC33978i0 != null) {
            binderC33978i0.m107448o0();
        }
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        this.f142504p = null;
        SparseIntArray sparseIntArray = (SparseIntArray) c33971f.f142420G.f115462x;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        m107484j(c4969a);
        if ((this.f142495g instanceof C37435c) && c4969a.f20480x != 24) {
            c33971f.f142430x = true;
            HandlerC21846d handlerC21846d = c33971f.f142427N;
            handlerC21846d.sendMessageDelayed(handlerC21846d.obtainMessage(19), 300000L);
        }
        int i13 = c4969a.f20480x;
        if (i13 == 4) {
            m107481g(C33971f.f142415Q);
            return;
        }
        if (i13 == 25) {
            m107481g(C33971f.m107428d(this.f142496h, c4969a));
            return;
        }
        LinkedList linkedList = this.f142494f;
        if (linkedList.isEmpty()) {
            this.f142504p = c4969a;
            return;
        }
        if (runtimeException != null) {
            AbstractC35135w.m111091c(c33971f.f142427N);
            m107480f(null, runtimeException, false);
            return;
        }
        if (!c33971f.f142428O) {
            m107481g(C33971f.m107428d(this.f142496h, c4969a));
            return;
        }
        C33961a c33961a = this.f142496h;
        m107480f(C33971f.m107428d(c33961a, c4969a), null, true);
        if (linkedList.isEmpty() || m107477c(c4969a)) {
            return;
        }
        if (c33971f.f142419F.zad(c33971f.f142418E, c4969a, this.f142500l)) {
            return;
        }
        if (c4969a.f20480x == 18) {
            this.f142502n = true;
        }
        if (!this.f142502n) {
            m107481g(C33971f.m107428d(c33961a, c4969a));
        } else {
            HandlerC21846d handlerC21846d2 = c33971f.f142427N;
            handlerC21846d2.sendMessageDelayed(Message.obtain(handlerC21846d2, 9, c33961a), 5000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m107487m(AbstractC33988n0 abstractC33988n0) {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        boolean zM111062n = ((AbstractC35107c) this.f142495g).m111062n();
        LinkedList linkedList = this.f142494f;
        if (zM111062n) {
            if (m107479e(abstractC33988n0)) {
                m107482h();
                return;
            } else {
                linkedList.add(abstractC33988n0);
                return;
            }
        }
        linkedList.add(abstractC33988n0);
        C4969a c4969a = this.f142504p;
        if (c4969a == null || c4969a.f20480x == 0 || c4969a.f20481y == null) {
            m107489o();
        } else {
            m107486l(c4969a, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m107488n() {
        AbstractC35135w.m111091c(this.f142506r.f142427N);
        Status status = C33971f.f142414P;
        m107481g(status);
        this.f142497i.m88706v0(status, false);
        for (C33979j c33979j : (C33979j[]) this.f142499k.keySet().toArray(new C33979j[0])) {
            m107487m(new C33984l0(c33979j, new C11040i()));
        }
        m107484j(new C4969a(4));
        if (((AbstractC35107c) this.f142495g).m111062n()) {
            new C29934u0(this, 25).m91530F();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public final void m107489o() {
        C33971f c33971f = this.f142506r;
        AbstractC35135w.m111091c(c33971f.f142427N);
        InterfaceC4973d interfaceC4973d = this.f142495g;
        AbstractC35107c abstractC35107c = (AbstractC35107c) interfaceC4973d;
        if (abstractC35107c.m111062n() || abstractC35107c.m111063o()) {
            return;
        }
        try {
            int iM86843o = c33971f.f142420G.m86843o(c33971f.f142418E, interfaceC4973d);
            if (iM86843o != 0) {
                C4969a c4969a = new C4969a(iM86843o, null);
                String name = interfaceC4973d.getClass().getName();
                String string = c4969a.toString();
                StringBuilder sb4 = new StringBuilder(name.length() + 35 + string.length());
                sb4.append("The service for ");
                sb4.append(name);
                sb4.append(" is not available: ");
                sb4.append(string);
                Log.w("GoogleApiManager", sb4.toString());
                m107486l(c4969a, null);
                return;
            }
            C4455g c4455g = new C4455g(c33971f, interfaceC4973d, this.f142496h);
            if (interfaceC4973d.mo5665a()) {
                BinderC33978i0 binderC33978i0 = this.f142501m;
                AbstractC35135w.m111094f(binderC33978i0);
                binderC33978i0.m107447n0(c4455g);
            }
            try {
                abstractC35107c.f148970i = c4455g;
                abstractC35107c.m111067t(2, null);
            } catch (SecurityException e5) {
                m107486l(new C4969a(10), e5);
            }
        } catch (IllegalStateException e13) {
            m107486l(new C4969a(10), e13);
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC4978i
    /* JADX INFO: renamed from: s */
    public final void mo15600s() {
        C33971f c33971f = this.f142506r;
        if (Looper.myLooper() == c33971f.f142427N.getLooper()) {
            m107475a();
        } else {
            c33971f.f142427N.post(new RunnableC3543b(this, 26));
        }
    }
}
