package p395p6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.C3031l1;
import dc3.C11923h;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import hg3.AbstractC17269i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import m83.C25272z;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p639y6.C39254f;
import p639y6.InterfaceC39249a;
import p639y6.InterfaceC39255g;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C28894l {

    /* JADX INFO: renamed from: a */
    public final String f116951a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f116952b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f116953c;

    /* JADX INFO: renamed from: d */
    public final C11923h f116954d;

    /* JADX INFO: renamed from: e */
    public final AbstractC28880g0 f116955e;

    /* JADX INFO: renamed from: f */
    public final C28864b f116956f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC39249a f116957g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC28923u1 f116958h;

    /* JADX INFO: renamed from: i */
    public final boolean f116959i;

    /* JADX INFO: renamed from: j */
    public final C28633k1 f116960j;

    /* JADX INFO: renamed from: k */
    public final C28633k1 f116961k;

    /* JADX INFO: renamed from: l */
    public Object f116962l;

    /* JADX INFO: renamed from: m */
    public final C3031l1 f116963m;

    /* JADX INFO: renamed from: n */
    public final C13045h2 f116964n;

    public C28894l(AbstractC28880g0 abstractC28880g0, C28864b c28864b, Bundle bundle) {
        C39254f c39254f = C39254f.f168772a;
        InterfaceC28923u1 sizeMode = abstractC28880g0.getSizeMode();
        this.f116951a = AbstractC35902e.m113970l(c28864b.f116802a);
        this.f116952b = new AtomicBoolean(true);
        this.f116953c = new AtomicBoolean(false);
        this.f116954d = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        this.f116955e = abstractC28880g0;
        this.f116956f = c28864b;
        this.f116957g = c39254f;
        this.f116958h = sizeMode;
        this.f116959i = true;
        int i13 = c28864b.f116802a;
        if (Integer.MIN_VALUE <= i13 && i13 < -1) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        C28676v0 c28676v0 = C28676v0.f115976y;
        this.f116960j = new C28633k1(null, c28676v0);
        this.f116961k = new C28633k1(bundle, c28676v0);
        this.f116962l = C25272z.f99163w;
        this.f116963m = AbstractC3006f0.m8709c();
        this.f116964n = AbstractC13091v.m36593c(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (r3.m87843b(r5) == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
    
        if (r3.m87843b(r5) == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0174, code lost:
    
        if (r3.m87843b(r5) == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        if (r3.m87843b(r5) == r6) goto L71;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m87812a(p395p6.C28894l r20, android.content.Context r21, p335n6.AbstractC26394k r22, s83.AbstractC32269c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p395p6.C28894l.m87812a(p6.l, android.content.Context, n6.k, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static Object m87813b(C28894l c28894l, Context context, Object obj, AbstractC32269c abstractC32269c) throws Throwable {
        C28885i c28885i;
        C39949b c39949bMo128121C;
        C39949b c39949bMo128121C2;
        C39949b c39949bMo128121C3;
        if (abstractC32269c instanceof C28885i) {
            c28885i = (C28885i) abstractC32269c;
            int i13 = c28885i.f116922z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28885i.f116922z = i13 - Integer.MIN_VALUE;
            } else {
                c28885i = new C28885i(c28894l, abstractC32269c);
            }
        } else {
            c28885i = new C28885i(c28894l, abstractC32269c);
        }
        Object objM125028c = c28885i.f116920x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28885i.f116922z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C23454a0 c23454a1 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125028c);
            if (!(obj instanceof C28876f)) {
                if (obj instanceof C28873e) {
                    AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
                    C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
                    if (c39949b == null || (c39949bMo128121C2 = c39949b.mo128121C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC39957f abstractC39957fM128153j = c39949bMo128121C2.m128153j();
                        try {
                            c28894l.f116961k.setValue(((C28873e) obj).f116861a);
                            AbstractC39957f.m128151q(abstractC39957fM128153j);
                            c39949bMo128121C2.mo128127w().mo128155d();
                            c39949bMo128121C2.mo128122c();
                            return c23454a0;
                        } catch (Throwable th3) {
                            AbstractC39957f.m128151q(abstractC39957fM128153j);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        c39949bMo128121C2.mo128122c();
                        throw th4;
                    }
                }
                if (obj instanceof C28870d) {
                    AbstractC39957f abstractC39957fM128171k2 = AbstractC39963l.m128171k();
                    C39949b c39949b2 = abstractC39957fM128171k2 instanceof C39949b ? (C39949b) abstractC39957fM128171k2 : null;
                    if (c39949b2 == null || (c39949bMo128121C = c39949b2.mo128121C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC39957f abstractC39957fM128153j2 = c39949bMo128121C.m128153j();
                        try {
                            List list = (List) c28894l.f116962l.get(((C28870d) obj).f116847a);
                            if (list != null) {
                                Iterator it = list.iterator();
                                if (it.hasNext()) {
                                    throw null;
                                }
                                c23454a1 = c23454a0;
                            }
                            AbstractC39957f.m128151q(abstractC39957fM128153j2);
                            c39949bMo128121C.mo128127w().mo128155d();
                            c39949bMo128121C.mo128122c();
                            if (c23454a1 == null) {
                                AbstractC17269i.m48918v(Log.w("AppWidgetSession", "Triggering Action(" + ((C28870d) obj).f116847a + ") for session(" + c28894l.f116951a + ") failed"));
                                return c23454a0;
                            }
                        } catch (Throwable th5) {
                            AbstractC39957f.m128151q(abstractC39957fM128153j2);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        c39949bMo128121C.mo128122c();
                        throw th6;
                    }
                } else {
                    if (!(obj instanceof C28879g)) {
                        throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                    }
                    C3031l1 c3031l1 = ((C28879g) obj).f116875a;
                    if (c3031l1.isActive()) {
                        c3031l1.complete();
                    }
                }
                return c23454a0;
            }
            InterfaceC39255g interfaceC39255gMo63262h = c28894l.f116955e.mo63262h();
            if (interfaceC39255gMo63262h != null) {
                InterfaceC39249a interfaceC39249a = c28894l.f116957g;
                String str = c28894l.f116951a;
                c28885i.f116919w = c28894l;
                c28885i.f116922z = 1;
                objM125028c = ((C39254f) interfaceC39249a).m125028c(context, interfaceC39255gMo63262h, str, c28885i);
                if (objM125028c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                objM125028c = null;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28894l = c28885i.f116919w;
            AbstractC34132o.m107864I(objM125028c);
        }
        AbstractC39957f abstractC39957fM128171k3 = AbstractC39963l.m128171k();
        C39949b c39949b3 = abstractC39957fM128171k3 instanceof C39949b ? (C39949b) abstractC39957fM128171k3 : null;
        if (c39949b3 == null || (c39949bMo128121C3 = c39949b3.mo128121C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC39957f abstractC39957fM128153j3 = c39949bMo128121C3.m128153j();
            try {
                c28894l.f116960j.setValue(objM125028c);
                AbstractC39957f.m128151q(abstractC39957fM128153j3);
                c39949bMo128121C3.mo128127w().mo128155d();
                c39949bMo128121C3.mo128122c();
                return c23454a0;
            } catch (Throwable th7) {
                AbstractC39957f.m128151q(abstractC39957fM128153j3);
                throw th7;
            }
        } catch (Throwable th8) {
            c39949bMo128121C3.mo128122c();
            throw th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ad -> B:35:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static java.lang.Object m87814d(p395p6.C28894l r7, java.util.ArrayList r8, s83.AbstractC32269c r9) {
        /*
            boolean r0 = r9 instanceof p395p6.C28888j
            if (r0 == 0) goto L13
            r0 = r9
            p6.j r0 = (p395p6.C28888j) r0
            int r1 = r0.f116935H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116935H = r1
            goto L18
        L13:
            p6.j r0 = new p6.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f116933F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f116935H
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r7 = r0.f116932E
            int r8 = r0.f116939z
            java.util.List r2 = r0.f116938y
            java.util.List r2 = (java.util.List) r2
            p6.l r4 = r0.f116937x
            p6.l r5 = r0.f116936w
            p505ts.AbstractC34132o.m107864I(r9)
            goto Lb0
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p505ts.AbstractC34132o.m107864I(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r8.iterator()
        L48:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.next()
            boolean r5 = r4 instanceof p395p6.C28870d
            if (r5 == 0) goto L48
            r9.add(r4)
            goto L48
        L5a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L63:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r8.next()
            boolean r5 = r4 instanceof p395p6.C28873e
            if (r5 == 0) goto L63
            r2.add(r4)
            goto L63
        L75:
            java.lang.Object r8 = m83.AbstractC25265s.m74114R0(r2)
            p6.e r8 = (p395p6.C28873e) r8
            if (r8 == 0) goto L80
            android.os.Bundle r8 = r8.f116861a
            goto L81
        L80:
            r8 = 0
        L81:
            p6.l r2 = new p6.l
            p6.g0 r4 = r7.f116955e
            p6.b r7 = r7.f116956f
            r2.<init>(r4, r7, r8)
            int r7 = r9.size()
            r8 = 0
            r4 = r2
            r5 = r4
            r2 = r9
        L92:
            if (r8 >= r7) goto Lb2
            java.lang.Object r9 = r2.get(r8)
            p6.d r9 = (p395p6.C28870d) r9
            r0.f116936w = r5
            r0.f116937x = r4
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r0.f116938y = r6
            r0.f116939z = r8
            r0.f116932E = r7
            r0.f116935H = r3
            java.lang.Object r9 = r4.m87816e(r9, r0)
            if (r9 != r1) goto Lb0
            return r1
        Lb0:
            int r8 = r8 + r3
            goto L92
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p395p6.C28894l.m87814d(p6.l, java.util.ArrayList, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: ClosedReceiveChannelException -> 0x0082, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x0082, blocks: (B:13:0x002c, B:22:0x0052, B:26:0x0064, B:28:0x006c, B:18:0x0041, B:21:0x0048), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (m87813b(r6, r2, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m87815c(android.content.Context r7, p579wc.C37082e1 r8, s83.AbstractC32269c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p605x6.C38000e
            if (r0 == 0) goto L13
            r0 = r9
            x6.e r0 = (p605x6.C38000e) r0
            int r1 = r0.f162783F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162783F = r1
            goto L18
        L13:
            x6.e r0 = new x6.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f162787z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f162783F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            dc3.c r7 = r0.f162786y
            kotlin.jvm.functions.Function1 r8 = r0.f162785x
            android.content.Context r2 = r0.f162784w
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
        L2f:
            r5 = r2
            r2 = r7
            r7 = r5
            goto L52
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            dc3.c r7 = r0.f162786y
            kotlin.jvm.functions.Function1 r8 = r0.f162785x
            android.content.Context r2 = r0.f162784w
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            goto L64
        L45:
            p505ts.AbstractC34132o.m107864I(r9)
            dc3.h r9 = r6.f116954d     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r9.getClass()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            dc3.c r2 = new dc3.c     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r2.<init>(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
        L52:
            r0.f162784w = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162785x = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162786y = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162783F = r4     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            java.lang.Object r9 = r2.m32187a(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            if (r9 != r1) goto L61
            goto L81
        L61:
            r5 = r2
            r2 = r7
            r7 = r5
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            boolean r9 = r9.booleanValue()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            if (r9 == 0) goto L82
            java.lang.Object r9 = r7.m32188c()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r8.invoke(r9)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162784w = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162785x = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162786y = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            r0.f162783F = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            java.lang.Object r9 = m87813b(r6, r2, r9, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L82
            if (r9 != r1) goto L2f
        L81:
            return r1
        L82:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p395p6.C28894l.m87815c(android.content.Context, wc.e1, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final Object m87816e(Object obj, AbstractC32269c abstractC32269c) {
        Object objMo32219t = this.f116954d.mo32219t(obj, abstractC32269c);
        return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m87817f(AbstractC32269c abstractC32269c) {
        C28891k c28891k;
        C28879g c28879g;
        if (abstractC32269c instanceof C28891k) {
            c28891k = (C28891k) abstractC32269c;
            int i13 = c28891k.f116944z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28891k.f116944z = i13 - Integer.MIN_VALUE;
            } else {
                c28891k = new C28891k(this, abstractC32269c);
            }
        } else {
            c28891k = new C28891k(this, abstractC32269c);
        }
        Object obj = c28891k.f116942x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c28891k.f116944z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C28879g c28879g2 = new C28879g(new C3031l1(this.f116963m));
            c28891k.f116941w = c28879g2;
            c28891k.f116944z = 1;
            if (m87816e(c28879g2, c28891k) == obj2) {
                return obj2;
            }
            c28879g = c28879g2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28879g = c28891k.f116941w;
            AbstractC34132o.m107864I(obj);
        }
        return c28879g.f116875a;
    }
}
