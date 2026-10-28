package p249jc;

import ac.AbstractC0735a;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC3027k1;
import e61.C12764g;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kc3.C22365e;
import l83.C23454a0;
import m83.AbstractC25265s;
import p005a3.C0237p;
import p007a6.C0458v;
import p024b0.C2178b;
import p031b9.AbstractC2875y;
import p073cq.ExecutorC11050s;
import p218ic.AbstractC18372n;
import p218ic.AbstractC18386u;
import p218ic.AbstractC18388v;
import p218ic.C18348b;
import p218ic.C18358g;
import p218ic.C18362i;
import p218ic.C18380r;
import p218ic.C18389w;
import p218ic.C18391y;
import p218ic.EnumC18371m0;
import p319m4.AbstractC25012a;
import p392p3.C28761b0;
import p400pc.InterfaceC29062a;
import p420qc.C30193c;
import p420qc.C30207q;
import p420qc.C30211u;
import p457rc.C31230m;
import p457rc.C31231n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30061h;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sc.C32352b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jc.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21582i0 {

    /* JADX INFO: renamed from: a */
    public final C30207q f82758a;

    /* JADX INFO: renamed from: b */
    public final Context f82759b;

    /* JADX INFO: renamed from: c */
    public final String f82760c;

    /* JADX INFO: renamed from: d */
    public final C0237p f82761d;

    /* JADX INFO: renamed from: e */
    public final C32352b f82762e;

    /* JADX INFO: renamed from: f */
    public final C18348b f82763f;

    /* JADX INFO: renamed from: g */
    public final C18391y f82764g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC29062a f82765h;

    /* JADX INFO: renamed from: i */
    public final WorkDatabase f82766i;

    /* JADX INFO: renamed from: j */
    public final C30211u f82767j;

    /* JADX INFO: renamed from: k */
    public final C30193c f82768k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f82769l;

    /* JADX INFO: renamed from: m */
    public final String f82770m;

    /* JADX INFO: renamed from: n */
    public final C3031l1 f82771n;

    public C21582i0(C21568b0 c21568b0) {
        C30207q c30207q = (C30207q) c21568b0.f82715e;
        this.f82758a = c30207q;
        this.f82759b = (Context) c21568b0.f82717g;
        String str = c30207q.f123634a;
        this.f82760c = str;
        this.f82761d = (C0237p) c21568b0.f82718h;
        this.f82762e = (C32352b) c21568b0.f82712b;
        C18348b c18348b = (C18348b) c21568b0.f82711a;
        this.f82763f = c18348b;
        this.f82764g = c18348b.f71449d;
        this.f82765h = (InterfaceC29062a) c21568b0.f82713c;
        WorkDatabase workDatabase = (WorkDatabase) c21568b0.f82714d;
        this.f82766i = workDatabase;
        this.f82767j = workDatabase.mo5521h();
        this.f82768k = workDatabase.mo5515b();
        ArrayList arrayList = (ArrayList) c21568b0.f82716f;
        this.f82769l = arrayList;
        this.f82770m = AbstractC25012a.m73376i(AbstractC25265s.m74110N0(arrayList, ",", null, null, null, 62), " } ]", AbstractC18489d0.m53375p("Work [ id=", str, ", tags={ "));
        this.f82771n = AbstractC3006f0.m8709c();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0186 A[LOOP:0: B:68:0x0180->B:70:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0220  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:83:0x024e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0294  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public static final Object m60626a(final C21582i0 c21582i0, AbstractC32269c abstractC32269c) {
        C21580h0 c21580h0;
        String str;
        boolean z4;
        C21580h0 c21580h1;
        EnumC31071a enumC31071a;
        final int i13;
        OverwritingInputMerger overwritingInputMerger;
        OverwritingInputMerger overwritingInputMerger2;
        LinkedHashMap linkedHashMap;
        Iterator it;
        C18358g c18358gM6856b;
        C31230m c31230m;
        final AbstractC18388v abstractC18388vM52884a;
        Object objRunInTransaction;
        EnumC31071a enumC31071a2;
        Throwable th3;
        String str2;
        CancellationException e5;
        String str3;
        C18389w c18389wM52886d;
        String strM8299l;
        String str4 = c21582i0.f82770m;
        String id4 = c21582i0.f82760c;
        C32352b c32352b = c21582i0.f82762e;
        WorkDatabase workDatabase = c21582i0.f82766i;
        C18348b c18348b = c21582i0.f82763f;
        C18391y c18391y = c18348b.f71458m;
        C30207q c30207q = c21582i0.f82758a;
        if (abstractC32269c instanceof C21580h0) {
            c21580h0 = (C21580h0) abstractC32269c;
            int i14 = c21580h0.f82757y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c21580h0.f82757y = i14 - Integer.MIN_VALUE;
            } else {
                c21580h0 = new C21580h0(c21582i0, abstractC32269c);
            }
        } else {
            c21580h0 = new C21580h0(c21582i0, abstractC32269c);
        }
        Object objM8705K = c21580h0.f82755w;
        EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
        int i15 = c21580h0.f82757y;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C18362i c18362i = c18348b.f71450e;
            c18391y.getClass();
            boolean zM88496E = AbstractC29125c.m88496E();
            final String str5 = c30207q.f123657x;
            String str6 = c30207q.f123636c;
            String className = c30207q.f123637d;
            if (zM88496E && str5 != null) {
                int iHashCode = c30207q.hashCode();
                str = str4;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0735a.m1789a(iHashCode, AbstractC29125c.m88517Z(str5));
                } else {
                    String strM88517Z = AbstractC29125c.m88517Z(str5);
                    try {
                        if (AbstractC29125c.f117893c == null) {
                            enumC31071a = enumC31071a3;
                            try {
                                c21580h1 = c21580h0;
                                z4 = zM88496E;
                                try {
                                    AbstractC29125c.f117893c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                } catch (Exception e13) {
                                    e = e13;
                                    AbstractC29125c.m88495D(e, "asyncTraceBegin");
                                }
                            } catch (Exception e14) {
                                e = e14;
                                z4 = zM88496E;
                                c21580h1 = c21580h0;
                                AbstractC29125c.m88495D(e, "asyncTraceBegin");
                            }
                        } else {
                            z4 = zM88496E;
                            c21580h1 = c21580h0;
                            enumC31071a = enumC31071a3;
                        }
                        AbstractC29125c.f117893c.invoke(null, Long.valueOf(AbstractC29125c.f117891a), strM88517Z, Integer.valueOf(iHashCode));
                    } catch (Exception e15) {
                        e = e15;
                        z4 = zM88496E;
                        c21580h1 = c21580h0;
                        enumC31071a = enumC31071a3;
                    }
                }
                i13 = 0;
                if (((Boolean) workDatabase.runInTransaction(new Callable(c21582i0) { // from class: jc.z

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C21582i0 f82825x;

                    {
                        this.f82825x = c21582i0;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i13) {
                            case 0:
                                C21582i0 c21582i1 = this.f82825x;
                                C30207q c30207q2 = c21582i1.f82758a;
                                EnumC18371m0 enumC18371m0 = c30207q2.f123635b;
                                String str7 = c30207q2.f123636c;
                                EnumC18371m0 enumC18371m1 = EnumC18371m0.f71515w;
                                if (enumC18371m0 != enumC18371m1) {
                                    String str8 = AbstractC21584j0.f82776a;
                                    C18389w.m52886d().m52888a(str8, str7 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (c30207q2.m92426c() || (c30207q2.f123635b == enumC18371m1 && c30207q2.f123644k > 0)) {
                                    c21582i1.f82764g.getClass();
                                    if (System.currentTimeMillis() < c30207q2.m92425a()) {
                                        C18389w.m52886d().m52888a(AbstractC21584j0.f82776a, "Delaying execution for " + str7 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                C21582i0 c21582i2 = this.f82825x;
                                C30211u c30211u = c21582i2.f82767j;
                                String str9 = c21582i2.f82760c;
                                boolean z13 = false;
                                if (c30211u.m92433d(str9) == EnumC18371m0.f71515w) {
                                    c30211u.m92439j(EnumC18371m0.f71516x, str9);
                                    ((Number) AbstractC15751g.m44432L(c30211u.f123665a, false, true, new C12764g(str9, 15))).intValue();
                                    c30211u.m92440k(-256, str9);
                                    z13 = true;
                                }
                                return Boolean.valueOf(z13);
                        }
                    }
                })).booleanValue()) {
                    return new C21574e0();
                }
                if (c30207q.m92426c()) {
                    c18358gM6856b = c30207q.f123638e;
                } else {
                    c18348b.f71451f.getClass();
                    AbstractC22676k.m65750j(className, "className");
                    String str7 = AbstractC18372n.f71519a;
                    try {
                        overwritingInputMerger = null;
                        try {
                            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                            AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                            overwritingInputMerger2 = (OverwritingInputMerger) objNewInstance;
                        } catch (Exception e16) {
                            e = e16;
                            C18389w.m52886d().m52890c(AbstractC18372n.f71519a, "Trouble instantiating ".concat(className), e);
                            overwritingInputMerger2 = overwritingInputMerger;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        overwritingInputMerger = null;
                        C18389w.m52886d().m52890c(AbstractC18372n.f71519a, "Trouble instantiating ".concat(className), e);
                        overwritingInputMerger2 = overwritingInputMerger;
                        if (overwritingInputMerger2 == null) {
                            C18389w.m52886d().m52889b(AbstractC21584j0.f82776a, "Could not create Input Merger ".concat(className));
                            return new C21570c0();
                        }
                        List listM118958J = AbstractC37056f.m118958J(c30207q.f123638e);
                        C30211u c30211u = c21582i0.f82767j;
                        c30211u.getClass();
                        AbstractC22676k.m65750j(id4, "id");
                        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(listM118958J, (List) AbstractC15751g.m44432L(c30211u.f123665a, true, false, new C12764g(id4, 14)));
                        C2178b c2178b = new C2178b(1);
                        linkedHashMap = new LinkedHashMap();
                        it = arrayListM74129g1.iterator();
                        while (it.hasNext()) {
                            Map mapUnmodifiableMap = Collections.unmodifiableMap(((C18358g) it.next()).f71480a);
                            AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(...)");
                            linkedHashMap.putAll(mapUnmodifiableMap);
                        }
                        c2178b.m6859e(linkedHashMap);
                        c18358gM6856b = c2178b.m6856b();
                        UUID uuidFromString = UUID.fromString(id4);
                        ArrayList arrayList = c21582i0.f82769l;
                        C0237p c0237p = c21582i0.f82761d;
                        int i16 = c30207q.f123644k;
                        Executor executor = c18348b.f71446a;
                        C22365e c22365e = c18348b.f71447b;
                        C31231n c31231n = new C31231n(workDatabase, c32352b);
                        c31230m = new C31230m(workDatabase, c21582i0.f82765h, c32352b);
                        WorkerParameters workerParameters = new WorkerParameters();
                        workerParameters.f7332a = uuidFromString;
                        workerParameters.f7333b = c18358gM6856b;
                        workerParameters.f7334c = new HashSet(arrayList);
                        workerParameters.f7335d = c0237p;
                        workerParameters.f7336e = i16;
                        workerParameters.f7337f = executor;
                        workerParameters.f7338g = c22365e;
                        workerParameters.f7339h = c32352b;
                        workerParameters.f7340i = c18362i;
                        workerParameters.f7341j = c31231n;
                        workerParameters.f7342k = c31230m;
                        abstractC18388vM52884a = c18362i.m52884a(c21582i0.f82759b, str6, workerParameters);
                        abstractC18388vM52884a.setUsed();
                        InterfaceC30061h interfaceC30061h = c21580h1.getContext().get(C3023j1.f12041w);
                        AbstractC22676k.m65747g(interfaceC30061h);
                        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30061h;
                        final boolean z13 = z4;
                        interfaceC3027k1.invokeOnCompletion(new Function1() { // from class: jc.a0
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String str8;
                                Throwable th4 = (Throwable) obj;
                                if (th4 instanceof WorkerStoppedException) {
                                    abstractC18388vM52884a.stop(((WorkerStoppedException) th4).f7351w);
                                }
                                if (z13 && (str8 = str5) != null) {
                                    C21582i0 c21582i1 = c21582i0;
                                    C18391y c18391y2 = c21582i1.f82763f.f71458m;
                                    int iHashCode2 = c21582i1.f82758a.hashCode();
                                    c18391y2.getClass();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        AbstractC0735a.m1790b(iHashCode2, AbstractC29125c.m88517Z(str8));
                                    } else {
                                        String strM88517Z2 = AbstractC29125c.m88517Z(str8);
                                        try {
                                            if (AbstractC29125c.f117894d == null) {
                                                AbstractC29125c.f117894d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                            }
                                            AbstractC29125c.f117894d.invoke(null, Long.valueOf(AbstractC29125c.f117891a), strM88517Z2, Integer.valueOf(iHashCode2));
                                        } catch (Exception e18) {
                                            AbstractC29125c.m88495D(e18, "asyncTraceEnd");
                                        }
                                    }
                                }
                                return C23454a0.f92919a;
                            }
                        });
                        final int i17 = 1;
                        objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(c21582i0) { // from class: jc.z

                            /* JADX INFO: renamed from: x */
                            public final /* synthetic */ C21582i0 f82825x;

                            {
                                this.f82825x = c21582i0;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i17) {
                                    case 0:
                                        C21582i0 c21582i1 = this.f82825x;
                                        C30207q c30207q2 = c21582i1.f82758a;
                                        EnumC18371m0 enumC18371m0 = c30207q2.f123635b;
                                        String str8 = c30207q2.f123636c;
                                        EnumC18371m0 enumC18371m1 = EnumC18371m0.f71515w;
                                        if (enumC18371m0 != enumC18371m1) {
                                            String str9 = AbstractC21584j0.f82776a;
                                            C18389w.m52886d().m52888a(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                            return Boolean.TRUE;
                                        }
                                        if (c30207q2.m92426c() || (c30207q2.f123635b == enumC18371m1 && c30207q2.f123644k > 0)) {
                                            c21582i1.f82764g.getClass();
                                            if (System.currentTimeMillis() < c30207q2.m92425a()) {
                                                C18389w.m52886d().m52888a(AbstractC21584j0.f82776a, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                                return Boolean.TRUE;
                                            }
                                        }
                                        return Boolean.FALSE;
                                    default:
                                        C21582i0 c21582i2 = this.f82825x;
                                        C30211u c30211u2 = c21582i2.f82767j;
                                        String str10 = c21582i2.f82760c;
                                        boolean z14 = false;
                                        if (c30211u2.m92433d(str10) == EnumC18371m0.f71515w) {
                                            c30211u2.m92439j(EnumC18371m0.f71516x, str10);
                                            ((Number) AbstractC15751g.m44432L(c30211u2.f123665a, false, true, new C12764g(str10, 15))).intValue();
                                            c30211u2.m92440k(-256, str10);
                                            z14 = true;
                                        }
                                        return Boolean.valueOf(z14);
                                }
                            }
                        });
                        AbstractC22676k.m65749i(objRunInTransaction, "runInTransaction(...)");
                        if (!((Boolean) objRunInTransaction).booleanValue()) {
                            return new C21574e0();
                        }
                        ExecutorC11050s executorC11050s = c32352b.f133918d;
                        AbstractC22676k.m65749i(executorC11050s, "getMainThreadExecutor(...)");
                        AbstractC3076z abstractC3076zM8723q = AbstractC3006f0.m8723q(executorC11050s);
                        try {
                            C0458v c0458v = new C0458v(c21582i0, abstractC18388vM52884a, c31230m, null, 13);
                            C21580h0 c21580h2 = c21580h1;
                            c21580h2.f82757y = 1;
                            objM8705K = AbstractC3006f0.m8705K(abstractC3076zM8723q, c0458v, c21580h2);
                            enumC31071a2 = enumC31071a;
                            if (objM8705K == enumC31071a2) {
                                return enumC31071a2;
                            }
                            AbstractC18386u abstractC18386u = (AbstractC18386u) objM8705K;
                            AbstractC22676k.m65747g(abstractC18386u);
                            return new C21572d0(abstractC18386u);
                        } catch (CancellationException e18) {
                            e5 = e18;
                            str2 = str;
                            str3 = AbstractC21584j0.f82776a;
                            c18389wM52886d = C18389w.m52886d();
                            strM8299l = AbstractC2875y.m8299l(str2, " was cancelled");
                            if (c18389wM52886d.f71556a <= 4) {
                                Log.i(str3, strM8299l, e5);
                            }
                            throw e5;
                        } catch (Throwable th4) {
                            th3 = th4;
                            String str8 = AbstractC21584j0.f82776a;
                            C18389w.m52886d().m52890c(str8, str + " failed because it threw an exception/error", th3);
                            return new C21570c0();
                        }
                    }
                    if (overwritingInputMerger2 == null) {
                        C18389w.m52886d().m52889b(AbstractC21584j0.f82776a, "Could not create Input Merger ".concat(className));
                        return new C21570c0();
                    }
                    List listM118958J2 = AbstractC37056f.m118958J(c30207q.f123638e);
                    C30211u c30211u2 = c21582i0.f82767j;
                    c30211u2.getClass();
                    AbstractC22676k.m65750j(id4, "id");
                    ArrayList arrayListM74129g2 = AbstractC25265s.m74129g1(listM118958J2, (List) AbstractC15751g.m44432L(c30211u2.f123665a, true, false, new C12764g(id4, 14)));
                    C2178b c2178b2 = new C2178b(1);
                    linkedHashMap = new LinkedHashMap();
                    it = arrayListM74129g2.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(((C18358g) it.next()).f71480a);
                        AbstractC22676k.m65749i(mapUnmodifiableMap2, "unmodifiableMap(...)");
                        linkedHashMap.putAll(mapUnmodifiableMap2);
                    }
                    c2178b2.m6859e(linkedHashMap);
                    c18358gM6856b = c2178b2.m6856b();
                }
                UUID uuidFromString2 = UUID.fromString(id4);
                ArrayList arrayList2 = c21582i0.f82769l;
                C0237p c0237p2 = c21582i0.f82761d;
                int i18 = c30207q.f123644k;
                Executor executor2 = c18348b.f71446a;
                C22365e c22365e2 = c18348b.f71447b;
                C31231n c31231n2 = new C31231n(workDatabase, c32352b);
                c31230m = new C31230m(workDatabase, c21582i0.f82765h, c32352b);
                WorkerParameters workerParameters2 = new WorkerParameters();
                workerParameters2.f7332a = uuidFromString2;
                workerParameters2.f7333b = c18358gM6856b;
                workerParameters2.f7334c = new HashSet(arrayList2);
                workerParameters2.f7335d = c0237p2;
                workerParameters2.f7336e = i18;
                workerParameters2.f7337f = executor2;
                workerParameters2.f7338g = c22365e2;
                workerParameters2.f7339h = c32352b;
                workerParameters2.f7340i = c18362i;
                workerParameters2.f7341j = c31231n2;
                workerParameters2.f7342k = c31230m;
                try {
                    abstractC18388vM52884a = c18362i.m52884a(c21582i0.f82759b, str6, workerParameters2);
                    abstractC18388vM52884a.setUsed();
                    InterfaceC30061h interfaceC30061h2 = c21580h1.getContext().get(C3023j1.f12041w);
                    AbstractC22676k.m65747g(interfaceC30061h2);
                    InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) interfaceC30061h2;
                    final boolean z14 = z4;
                    interfaceC3027k2.invokeOnCompletion(new Function1() { // from class: jc.a0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str9;
                            Throwable th5 = (Throwable) obj;
                            if (th5 instanceof WorkerStoppedException) {
                                abstractC18388vM52884a.stop(((WorkerStoppedException) th5).f7351w);
                            }
                            if (z14 && (str9 = str5) != null) {
                                C21582i0 c21582i1 = c21582i0;
                                C18391y c18391y2 = c21582i1.f82763f.f71458m;
                                int iHashCode2 = c21582i1.f82758a.hashCode();
                                c18391y2.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    AbstractC0735a.m1790b(iHashCode2, AbstractC29125c.m88517Z(str9));
                                } else {
                                    String strM88517Z2 = AbstractC29125c.m88517Z(str9);
                                    try {
                                        if (AbstractC29125c.f117894d == null) {
                                            AbstractC29125c.f117894d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                        }
                                        AbstractC29125c.f117894d.invoke(null, Long.valueOf(AbstractC29125c.f117891a), strM88517Z2, Integer.valueOf(iHashCode2));
                                    } catch (Exception e19) {
                                        AbstractC29125c.m88495D(e19, "asyncTraceEnd");
                                    }
                                }
                            }
                            return C23454a0.f92919a;
                        }
                    });
                    final int i19 = 1;
                    objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(c21582i0) { // from class: jc.z

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C21582i0 f82825x;

                        {
                            this.f82825x = c21582i0;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i19) {
                                case 0:
                                    C21582i0 c21582i1 = this.f82825x;
                                    C30207q c30207q2 = c21582i1.f82758a;
                                    EnumC18371m0 enumC18371m0 = c30207q2.f123635b;
                                    String str9 = c30207q2.f123636c;
                                    EnumC18371m0 enumC18371m1 = EnumC18371m0.f71515w;
                                    if (enumC18371m0 != enumC18371m1) {
                                        String str10 = AbstractC21584j0.f82776a;
                                        C18389w.m52886d().m52888a(str10, str9 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (c30207q2.m92426c() || (c30207q2.f123635b == enumC18371m1 && c30207q2.f123644k > 0)) {
                                        c21582i1.f82764g.getClass();
                                        if (System.currentTimeMillis() < c30207q2.m92425a()) {
                                            C18389w.m52886d().m52888a(AbstractC21584j0.f82776a, "Delaying execution for " + str9 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    C21582i0 c21582i2 = this.f82825x;
                                    C30211u c30211u3 = c21582i2.f82767j;
                                    String str11 = c21582i2.f82760c;
                                    boolean z15 = false;
                                    if (c30211u3.m92433d(str11) == EnumC18371m0.f71515w) {
                                        c30211u3.m92439j(EnumC18371m0.f71516x, str11);
                                        ((Number) AbstractC15751g.m44432L(c30211u3.f123665a, false, true, new C12764g(str11, 15))).intValue();
                                        c30211u3.m92440k(-256, str11);
                                        z15 = true;
                                    }
                                    return Boolean.valueOf(z15);
                            }
                        }
                    });
                    AbstractC22676k.m65749i(objRunInTransaction, "runInTransaction(...)");
                    if (!((Boolean) objRunInTransaction).booleanValue() && !interfaceC3027k2.isCancelled()) {
                        ExecutorC11050s executorC11050s2 = c32352b.f133918d;
                        AbstractC22676k.m65749i(executorC11050s2, "getMainThreadExecutor(...)");
                        AbstractC3076z abstractC3076zM8723q2 = AbstractC3006f0.m8723q(executorC11050s2);
                        C0458v c0458v2 = new C0458v(c21582i0, abstractC18388vM52884a, c31230m, null, 13);
                        C21580h0 c21580h3 = c21580h1;
                        c21580h3.f82757y = 1;
                        objM8705K = AbstractC3006f0.m8705K(abstractC3076zM8723q2, c0458v2, c21580h3);
                        enumC31071a2 = enumC31071a;
                        if (objM8705K == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                    return new C21574e0();
                } catch (Throwable unused) {
                    String str9 = AbstractC21584j0.f82776a;
                    C18389w.m52886d().m52889b(str9, "Could not create Worker " + str6);
                    return new C21570c0();
                }
            }
            str = str4;
            z4 = zM88496E;
            c21580h1 = c21580h0;
            enumC31071a = enumC31071a3;
            i13 = 0;
            if (((Boolean) workDatabase.runInTransaction(new Callable(c21582i0) { // from class: jc.z

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C21582i0 f82825x;

                {
                    this.f82825x = c21582i0;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i13) {
                        case 0:
                            C21582i0 c21582i1 = this.f82825x;
                            C30207q c30207q2 = c21582i1.f82758a;
                            EnumC18371m0 enumC18371m0 = c30207q2.f123635b;
                            String str10 = c30207q2.f123636c;
                            EnumC18371m0 enumC18371m1 = EnumC18371m0.f71515w;
                            if (enumC18371m0 != enumC18371m1) {
                                String str11 = AbstractC21584j0.f82776a;
                                C18389w.m52886d().m52888a(str11, str10 + " is not in ENQUEUED state. Nothing more to do");
                                return Boolean.TRUE;
                            }
                            if (c30207q2.m92426c() || (c30207q2.f123635b == enumC18371m1 && c30207q2.f123644k > 0)) {
                                c21582i1.f82764g.getClass();
                                if (System.currentTimeMillis() < c30207q2.m92425a()) {
                                    C18389w.m52886d().m52888a(AbstractC21584j0.f82776a, "Delaying execution for " + str10 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        default:
                            C21582i0 c21582i2 = this.f82825x;
                            C30211u c30211u3 = c21582i2.f82767j;
                            String str12 = c21582i2.f82760c;
                            boolean z15 = false;
                            if (c30211u3.m92433d(str12) == EnumC18371m0.f71515w) {
                                c30211u3.m92439j(EnumC18371m0.f71516x, str12);
                                ((Number) AbstractC15751g.m44432L(c30211u3.f123665a, false, true, new C12764g(str12, 15))).intValue();
                                c30211u3.m92440k(-256, str12);
                                z15 = true;
                            }
                            return Boolean.valueOf(z15);
                    }
                }
            })).booleanValue()) {
                return new C21574e0();
            }
            if (c30207q.m92426c()) {
                c18358gM6856b = c30207q.f123638e;
            } else {
                c18348b.f71451f.getClass();
                AbstractC22676k.m65750j(className, "className");
                String str10 = AbstractC18372n.f71519a;
                overwritingInputMerger = null;
                Object objNewInstance2 = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                AbstractC22676k.m65748h(objNewInstance2, "null cannot be cast to non-null type androidx.work.InputMerger");
                overwritingInputMerger2 = (OverwritingInputMerger) objNewInstance2;
                if (overwritingInputMerger2 == null) {
                    C18389w.m52886d().m52889b(AbstractC21584j0.f82776a, "Could not create Input Merger ".concat(className));
                    return new C21570c0();
                }
                List listM118958J3 = AbstractC37056f.m118958J(c30207q.f123638e);
                C30211u c30211u3 = c21582i0.f82767j;
                c30211u3.getClass();
                AbstractC22676k.m65750j(id4, "id");
                ArrayList arrayListM74129g3 = AbstractC25265s.m74129g1(listM118958J3, (List) AbstractC15751g.m44432L(c30211u3.f123665a, true, false, new C12764g(id4, 14)));
                C2178b c2178b3 = new C2178b(1);
                linkedHashMap = new LinkedHashMap();
                it = arrayListM74129g3.iterator();
                while (it.hasNext()) {
                    Map mapUnmodifiableMap3 = Collections.unmodifiableMap(((C18358g) it.next()).f71480a);
                    AbstractC22676k.m65749i(mapUnmodifiableMap3, "unmodifiableMap(...)");
                    linkedHashMap.putAll(mapUnmodifiableMap3);
                }
                c2178b3.m6859e(linkedHashMap);
                c18358gM6856b = c2178b3.m6856b();
            }
            UUID uuidFromString3 = UUID.fromString(id4);
            ArrayList arrayList3 = c21582i0.f82769l;
            C0237p c0237p3 = c21582i0.f82761d;
            int i110 = c30207q.f123644k;
            Executor executor3 = c18348b.f71446a;
            C22365e c22365e3 = c18348b.f71447b;
            C31231n c31231n3 = new C31231n(workDatabase, c32352b);
            c31230m = new C31230m(workDatabase, c21582i0.f82765h, c32352b);
            WorkerParameters workerParameters3 = new WorkerParameters();
            workerParameters3.f7332a = uuidFromString3;
            workerParameters3.f7333b = c18358gM6856b;
            workerParameters3.f7334c = new HashSet(arrayList3);
            workerParameters3.f7335d = c0237p3;
            workerParameters3.f7336e = i110;
            workerParameters3.f7337f = executor3;
            workerParameters3.f7338g = c22365e3;
            workerParameters3.f7339h = c32352b;
            workerParameters3.f7340i = c18362i;
            workerParameters3.f7341j = c31231n3;
            workerParameters3.f7342k = c31230m;
            abstractC18388vM52884a = c18362i.m52884a(c21582i0.f82759b, str6, workerParameters3);
            abstractC18388vM52884a.setUsed();
            InterfaceC30061h interfaceC30061h3 = c21580h1.getContext().get(C3023j1.f12041w);
            AbstractC22676k.m65747g(interfaceC30061h3);
            InterfaceC3027k1 interfaceC3027k3 = (InterfaceC3027k1) interfaceC30061h3;
            final boolean z15 = z4;
            interfaceC3027k3.invokeOnCompletion(new Function1() { // from class: jc.a0
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str11;
                    Throwable th5 = (Throwable) obj;
                    if (th5 instanceof WorkerStoppedException) {
                        abstractC18388vM52884a.stop(((WorkerStoppedException) th5).f7351w);
                    }
                    if (z15 && (str11 = str5) != null) {
                        C21582i0 c21582i1 = c21582i0;
                        C18391y c18391y2 = c21582i1.f82763f.f71458m;
                        int iHashCode2 = c21582i1.f82758a.hashCode();
                        c18391y2.getClass();
                        if (Build.VERSION.SDK_INT >= 29) {
                            AbstractC0735a.m1790b(iHashCode2, AbstractC29125c.m88517Z(str11));
                        } else {
                            String strM88517Z2 = AbstractC29125c.m88517Z(str11);
                            try {
                                if (AbstractC29125c.f117894d == null) {
                                    AbstractC29125c.f117894d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                }
                                AbstractC29125c.f117894d.invoke(null, Long.valueOf(AbstractC29125c.f117891a), strM88517Z2, Integer.valueOf(iHashCode2));
                            } catch (Exception e19) {
                                AbstractC29125c.m88495D(e19, "asyncTraceEnd");
                            }
                        }
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i111 = 1;
            objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(c21582i0) { // from class: jc.z

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C21582i0 f82825x;

                {
                    this.f82825x = c21582i0;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i111) {
                        case 0:
                            C21582i0 c21582i1 = this.f82825x;
                            C30207q c30207q2 = c21582i1.f82758a;
                            EnumC18371m0 enumC18371m0 = c30207q2.f123635b;
                            String str11 = c30207q2.f123636c;
                            EnumC18371m0 enumC18371m1 = EnumC18371m0.f71515w;
                            if (enumC18371m0 != enumC18371m1) {
                                String str12 = AbstractC21584j0.f82776a;
                                C18389w.m52886d().m52888a(str12, str11 + " is not in ENQUEUED state. Nothing more to do");
                                return Boolean.TRUE;
                            }
                            if (c30207q2.m92426c() || (c30207q2.f123635b == enumC18371m1 && c30207q2.f123644k > 0)) {
                                c21582i1.f82764g.getClass();
                                if (System.currentTimeMillis() < c30207q2.m92425a()) {
                                    C18389w.m52886d().m52888a(AbstractC21584j0.f82776a, "Delaying execution for " + str11 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        default:
                            C21582i0 c21582i2 = this.f82825x;
                            C30211u c30211u4 = c21582i2.f82767j;
                            String str13 = c21582i2.f82760c;
                            boolean z16 = false;
                            if (c30211u4.m92433d(str13) == EnumC18371m0.f71515w) {
                                c30211u4.m92439j(EnumC18371m0.f71516x, str13);
                                ((Number) AbstractC15751g.m44432L(c30211u4.f123665a, false, true, new C12764g(str13, 15))).intValue();
                                c30211u4.m92440k(-256, str13);
                                z16 = true;
                            }
                            return Boolean.valueOf(z16);
                    }
                }
            });
            AbstractC22676k.m65749i(objRunInTransaction, "runInTransaction(...)");
            if (!((Boolean) objRunInTransaction).booleanValue()) {
                return new C21574e0();
            }
            ExecutorC11050s executorC11050s3 = c32352b.f133918d;
            AbstractC22676k.m65749i(executorC11050s3, "getMainThreadExecutor(...)");
            AbstractC3076z abstractC3076zM8723q3 = AbstractC3006f0.m8723q(executorC11050s3);
            C0458v c0458v3 = new C0458v(c21582i0, abstractC18388vM52884a, c31230m, null, 13);
            C21580h0 c21580h4 = c21580h1;
            c21580h4.f82757y = 1;
            objM8705K = AbstractC3006f0.m8705K(abstractC3076zM8723q3, c0458v3, c21580h4);
            enumC31071a2 = enumC31071a;
            if (objM8705K == enumC31071a2) {
                return enumC31071a2;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                AbstractC34132o.m107864I(objM8705K);
                str = str4;
            } catch (CancellationException e19) {
                e5 = e19;
                str2 = str4;
                str3 = AbstractC21584j0.f82776a;
                c18389wM52886d = C18389w.m52886d();
                strM8299l = AbstractC2875y.m8299l(str2, " was cancelled");
                if (c18389wM52886d.f71556a <= 4) {
                    Log.i(str3, strM8299l, e5);
                }
                throw e5;
            } catch (Throwable th5) {
                th3 = th5;
                str = str4;
                String str11 = AbstractC21584j0.f82776a;
                C18389w.m52886d().m52890c(str11, str + " failed because it threw an exception/error", th3);
                return new C21570c0();
            }
        }
        AbstractC18386u abstractC18386u2 = (AbstractC18386u) objM8705K;
        AbstractC22676k.m65747g(abstractC18386u2);
        return new C21572d0(abstractC18386u2);
    }

    /* JADX INFO: renamed from: b */
    public final void m60627b(int i13) {
        EnumC18371m0 enumC18371m0 = EnumC18371m0.f71515w;
        C30211u c30211u = this.f82767j;
        String str = this.f82760c;
        c30211u.m92439j(enumC18371m0, str);
        this.f82764g.getClass();
        c30211u.m92438i(System.currentTimeMillis(), str);
        c30211u.m92437h(this.f82758a.f123655v, str);
        c30211u.m92436g(-1L, str);
        c30211u.m92440k(i13, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m60628c() {
        this.f82764g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C30211u c30211u = this.f82767j;
        String str = this.f82760c;
        c30211u.m92438i(jCurrentTimeMillis, str);
        c30211u.m92439j(EnumC18371m0.f71515w, str);
        c30211u.getClass();
        ((Number) AbstractC15751g.m44432L(c30211u.f123665a, false, true, new C12764g(str, 12))).intValue();
        c30211u.m92437h(this.f82758a.f123655v, str);
        c30211u.getClass();
        AbstractC15751g.m44432L(c30211u.f123665a, false, true, new C12764g(str, 13));
        c30211u.m92436g(-1L, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m60629d(AbstractC18386u result) {
        AbstractC22676k.m65750j(result, "result");
        String str = this.f82760c;
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(str);
        while (true) {
            boolean zIsEmpty = arrayListM118964P.isEmpty();
            C30211u c30211u = this.f82767j;
            if (zIsEmpty) {
                C18358g c18358g = ((C18380r) result).f71546a;
                AbstractC22676k.m65749i(c18358g, "getOutputData(...)");
                c30211u.m92437h(this.f82758a.f123655v, str);
                c30211u.getClass();
                AbstractC15751g.m44432L(c30211u.f123665a, false, true, new C28761b0(6, c18358g, str));
                return;
            }
            String str2 = (String) AbstractC25265s.m74134l1(arrayListM118964P);
            if (c30211u.m92433d(str2) != EnumC18371m0.f71513F) {
                c30211u.m92439j(EnumC18371m0.f71518z, str2);
            }
            arrayListM118964P.addAll(this.f82768k.m92416a(str2));
        }
    }
}
