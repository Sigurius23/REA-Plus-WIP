package jx1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bx1.C3689c;
import bx1.InterfaceC3687a;
import c93.InterfaceC4351m;
import cx1.C11178a;
import cx1.C11179b;
import dx1.C12429c;
import dx1.InterfaceC12427a;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ex1.C13729c;
import ex1.InterfaceC13727a;
import fx1.C14848d;
import fx1.InterfaceC14845a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kx1.C22883d;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import lx1.InterfaceC24790a;
import lx1.InterfaceC24791b;
import lx1.InterfaceC24792c;
import lx1.InterfaceC24793d;
import lx1.InterfaceC24794e;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: jx1.d0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010 R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010%R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010 R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010%R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020>098\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010A¨\u0006C"}, m65681d2 = {"Ljx1/d0;", "Landroidx/lifecycle/w1;", "Lex1/c;", "membershipManagementInteractor", "Lfx1/d;", "membershipAdjustmentCheckoutInteractor", "Ldx1/c;", "manageMembershipInteractor", "Lbx1/c;", "checkoutInteractor", "Lcx1/b;", "combiner", "Ljx1/a0;", "eventConverter", "Lkx1/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lex1/c;Lfx1/d;Ldx1/c;Lbx1/c;Lcx1/b;Ljx1/a0;Lkx1/d;Lbc3/c0;)V", "Llx1/e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Llx1/e;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkx1/d;", "x", "Lbc3/c0;", "Lec3/o1;", "Llx1/d;", "y", "Lec3/o1;", "membershipManagementEventFlow", "Lec3/t1;", "Lex1/b;", "z", "Lec3/t1;", "membershipManagementDomainResult", "Llx1/c;", "E", "membershipAdjustmentCheckoutEventFlow", "Lfx1/b;", "F", "membershipAdjustmentCheckoutDomainResult", "Llx1/b;", "G", "manageMembershipEventFlow", "Ldx1/b;", "H", "manageMembershipDomainResult", "Llx1/a;", "I", "checkoutEventFlow", "Lbx1/b;", "J", "checkoutDomainResult", "Lec3/l;", "Lcx1/a;", "K", "Lec3/l;", "combinedDomainResult", "Ljx1/e0;", "L", "getViewState", "()Lec3/l;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22011d0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 membershipAdjustmentCheckoutEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 membershipAdjustmentCheckoutDomainResult;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 manageMembershipEventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 manageMembershipDomainResult;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13072o1 checkoutEventFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13087t1 checkoutDomainResult;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13058l combinedDomainResult;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C22883d reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 membershipManagementEventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 membershipManagementDomainResult;

    /* JADX INFO: renamed from: jx1.d0$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$sendViewEvent$1", m100430f = "MembershipManagementViewModel.kt", m100431l = {73, 74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 76, 78, 79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85286w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC24794e f85287x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22011d0 f85288y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC24794e interfaceC24794e, C22011d0 c22011d0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85287x = interfaceC24794e;
            this.f85288y = c22011d0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f85287x, this.f85288y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L35;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r3.f85286w
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L14;
                    case 2: goto L14;
                    case 3: goto L14;
                    case 4: goto L14;
                    case 5: goto Lf;
                    case 6: goto L14;
                    default: goto L7;
                }
            L7:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            Lf:
                p505ts.AbstractC34132o.m107864I(r4)
                goto L91
            L14:
                p505ts.AbstractC34132o.m107864I(r4)
                goto La3
            L19:
                p505ts.AbstractC34132o.m107864I(r4)
                lx1.e r4 = r3.f85287x
                boolean r1 = r4 instanceof lx1.InterfaceC24793d
                if (r1 == 0) goto L35
                jx1.d0 r4 = r3.f85288y
                ec3.o1 r4 = jx1.C22011d0.m62907n(r4)
                lx1.e r1 = r3.f85287x
                r2 = 1
                r3.f85286w = r2
                java.lang.Object r4 = r4.emit(r1, r3)
                if (r4 != r0) goto La3
                goto La2
            L35:
                boolean r1 = r4 instanceof lx1.InterfaceC24792c
                if (r1 == 0) goto L4b
                jx1.d0 r4 = r3.f85288y
                ec3.o1 r4 = jx1.C22011d0.m62906l(r4)
                lx1.e r1 = r3.f85287x
                r2 = 2
                r3.f85286w = r2
                java.lang.Object r4 = r4.emit(r1, r3)
                if (r4 != r0) goto La3
                goto La2
            L4b:
                boolean r1 = r4 instanceof lx1.InterfaceC24791b
                if (r1 == 0) goto L61
                jx1.d0 r4 = r3.f85288y
                ec3.o1 r4 = jx1.C22011d0.m62905j(r4)
                lx1.e r1 = r3.f85287x
                r2 = 3
                r3.f85286w = r2
                java.lang.Object r4 = r4.emit(r1, r3)
                if (r4 != r0) goto La3
                goto La2
            L61:
                boolean r1 = r4 instanceof lx1.InterfaceC24790a.a
                if (r1 == 0) goto L77
                jx1.d0 r4 = r3.f85288y
                ec3.o1 r4 = jx1.C22011d0.m62904g(r4)
                lx1.e r1 = r3.f85287x
                r2 = 4
                r3.f85286w = r2
                java.lang.Object r4 = r4.emit(r1, r3)
                if (r4 != r0) goto La3
                goto La2
            L77:
                lx1.f r1 = lx1.C24795f.f97043a
                boolean r4 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r4, r1)
                if (r4 == 0) goto La6
                jx1.d0 r4 = r3.f85288y
                ec3.o1 r4 = jx1.C22011d0.m62907n(r4)
                lx1.d$c r1 = lx1.InterfaceC24793d.c.f97042a
                r2 = 5
                r3.f85286w = r2
                java.lang.Object r4 = r4.emit(r1, r3)
                if (r4 != r0) goto L91
                goto La2
            L91:
                jx1.d0 r4 = r3.f85288y
                ec3.o1 r4 = jx1.C22011d0.m62905j(r4)
                lx1.b$b r1 = lx1.InterfaceC24791b.b.f97027a
                r2 = 6
                r3.f85286w = r2
                java.lang.Object r4 = r4.emit(r1, r3)
                if (r4 != r0) goto La3
            La2:
                return r0
            La3:
                l83.a0 r4 = l83.C23454a0.f92919a
                return r4
            La6:
                kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                r4.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: jx1.C22011d0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jx1.d0$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f85289w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22005a0 f85290x;

        /* JADX INFO: renamed from: jx1.d0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f85291w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22005a0 f85292x;

            /* JADX INFO: renamed from: jx1.d0$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$special$$inlined$map$1$2", m100430f = "MembershipManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41865a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f85293E;

                /* JADX INFO: renamed from: F */
                Object f85294F;

                /* JADX INFO: renamed from: G */
                Object f85295G;

                /* JADX INFO: renamed from: H */
                int f85296H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85297w;

                /* JADX INFO: renamed from: x */
                int f85298x;

                /* JADX INFO: renamed from: y */
                Object f85299y;

                public C41865a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85297w = obj;
                    this.f85298x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22005a0 c22005a0) {
                this.f85291w = interfaceC13062m;
                this.f85292x = c22005a0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41865a c41865a;
                if (interfaceC30057d instanceof C41865a) {
                    c41865a = (C41865a) interfaceC30057d;
                    int i13 = c41865a.f85298x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41865a.f85298x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41865a = new C41865a(interfaceC30057d);
                    }
                } else {
                    c41865a = new C41865a(interfaceC30057d);
                }
                Object obj2 = c41865a.f85297w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41865a.f85298x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f85291w;
                    InterfaceC13727a interfaceC13727aM62888c = this.f85292x.m62888c((InterfaceC24793d) obj);
                    c41865a.f85299y = null;
                    c41865a.f85293E = null;
                    c41865a.f85294F = null;
                    c41865a.f85295G = null;
                    c41865a.f85296H = 0;
                    c41865a.f85298x = 1;
                    if (interfaceC13062m.emit(interfaceC13727aM62888c, c41865a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C22005a0 c22005a0) {
            this.f85289w = interfaceC13058l;
            this.f85290x = c22005a0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f85289w.collect(new a(interfaceC13062m, this.f85290x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx1.d0$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f85301w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22005a0 f85302x;

        /* JADX INFO: renamed from: jx1.d0$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f85303w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22005a0 f85304x;

            /* JADX INFO: renamed from: jx1.d0$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$special$$inlined$map$2$2", m100430f = "MembershipManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41866a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f85305E;

                /* JADX INFO: renamed from: F */
                Object f85306F;

                /* JADX INFO: renamed from: G */
                Object f85307G;

                /* JADX INFO: renamed from: H */
                int f85308H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85309w;

                /* JADX INFO: renamed from: x */
                int f85310x;

                /* JADX INFO: renamed from: y */
                Object f85311y;

                public C41866a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85309w = obj;
                    this.f85310x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22005a0 c22005a0) {
                this.f85303w = interfaceC13062m;
                this.f85304x = c22005a0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41866a c41866a;
                if (interfaceC30057d instanceof C41866a) {
                    c41866a = (C41866a) interfaceC30057d;
                    int i13 = c41866a.f85310x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41866a.f85310x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41866a = new C41866a(interfaceC30057d);
                    }
                } else {
                    c41866a = new C41866a(interfaceC30057d);
                }
                Object obj2 = c41866a.f85309w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41866a.f85310x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f85303w;
                    InterfaceC14845a interfaceC14845aM62889d = this.f85304x.m62889d((InterfaceC24792c) obj);
                    c41866a.f85311y = null;
                    c41866a.f85305E = null;
                    c41866a.f85306F = null;
                    c41866a.f85307G = null;
                    c41866a.f85308H = 0;
                    c41866a.f85310x = 1;
                    if (interfaceC13062m.emit(interfaceC14845aM62889d, c41866a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C22005a0 c22005a0) {
            this.f85301w = interfaceC13058l;
            this.f85302x = c22005a0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f85301w.collect(new a(interfaceC13062m, this.f85302x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx1.d0$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f85313w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22005a0 f85314x;

        /* JADX INFO: renamed from: jx1.d0$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f85315w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22005a0 f85316x;

            /* JADX INFO: renamed from: jx1.d0$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$special$$inlined$map$3$2", m100430f = "MembershipManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41867a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f85317E;

                /* JADX INFO: renamed from: F */
                Object f85318F;

                /* JADX INFO: renamed from: G */
                Object f85319G;

                /* JADX INFO: renamed from: H */
                int f85320H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85321w;

                /* JADX INFO: renamed from: x */
                int f85322x;

                /* JADX INFO: renamed from: y */
                Object f85323y;

                public C41867a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85321w = obj;
                    this.f85322x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22005a0 c22005a0) {
                this.f85315w = interfaceC13062m;
                this.f85316x = c22005a0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41867a c41867a;
                if (interfaceC30057d instanceof C41867a) {
                    c41867a = (C41867a) interfaceC30057d;
                    int i13 = c41867a.f85322x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41867a.f85322x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41867a = new C41867a(interfaceC30057d);
                    }
                } else {
                    c41867a = new C41867a(interfaceC30057d);
                }
                Object obj2 = c41867a.f85321w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41867a.f85322x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f85315w;
                    InterfaceC12427a interfaceC12427aM62887b = this.f85316x.m62887b((InterfaceC24791b) obj);
                    c41867a.f85323y = null;
                    c41867a.f85317E = null;
                    c41867a.f85318F = null;
                    c41867a.f85319G = null;
                    c41867a.f85320H = 0;
                    c41867a.f85322x = 1;
                    if (interfaceC13062m.emit(interfaceC12427aM62887b, c41867a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l, C22005a0 c22005a0) {
            this.f85313w = interfaceC13058l;
            this.f85314x = c22005a0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f85313w.collect(new a(interfaceC13062m, this.f85314x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx1.d0$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f85325w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22005a0 f85326x;

        /* JADX INFO: renamed from: jx1.d0$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f85327w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22005a0 f85328x;

            /* JADX INFO: renamed from: jx1.d0$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$special$$inlined$map$4$2", m100430f = "MembershipManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41868a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f85329E;

                /* JADX INFO: renamed from: F */
                Object f85330F;

                /* JADX INFO: renamed from: G */
                Object f85331G;

                /* JADX INFO: renamed from: H */
                int f85332H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85333w;

                /* JADX INFO: renamed from: x */
                int f85334x;

                /* JADX INFO: renamed from: y */
                Object f85335y;

                public C41868a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85333w = obj;
                    this.f85334x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22005a0 c22005a0) {
                this.f85327w = interfaceC13062m;
                this.f85328x = c22005a0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41868a c41868a;
                if (interfaceC30057d instanceof C41868a) {
                    c41868a = (C41868a) interfaceC30057d;
                    int i13 = c41868a.f85334x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41868a.f85334x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41868a = new C41868a(interfaceC30057d);
                    }
                } else {
                    c41868a = new C41868a(interfaceC30057d);
                }
                Object obj2 = c41868a.f85333w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41868a.f85334x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f85327w;
                    InterfaceC3687a interfaceC3687aM62886a = this.f85328x.m62886a((InterfaceC24790a) obj);
                    c41868a.f85335y = null;
                    c41868a.f85329E = null;
                    c41868a.f85330F = null;
                    c41868a.f85331G = null;
                    c41868a.f85332H = 0;
                    c41868a.f85334x = 1;
                    if (interfaceC13062m.emit(interfaceC3687aM62886a, c41868a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C22005a0 c22005a0) {
            this.f85325w = interfaceC13058l;
            this.f85326x = c22005a0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f85325w.collect(new a(interfaceC13062m, this.f85326x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx1.d0$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f85337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22011d0 f85338x;

        /* JADX INFO: renamed from: jx1.d0$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f85339w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22011d0 f85340x;

            /* JADX INFO: renamed from: jx1.d0$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$special$$inlined$map$5$2", m100430f = "MembershipManagementViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41869a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f85341E;

                /* JADX INFO: renamed from: F */
                Object f85342F;

                /* JADX INFO: renamed from: G */
                Object f85343G;

                /* JADX INFO: renamed from: H */
                int f85344H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85345w;

                /* JADX INFO: renamed from: x */
                int f85346x;

                /* JADX INFO: renamed from: y */
                Object f85347y;

                public C41869a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85345w = obj;
                    this.f85346x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22011d0 c22011d0) {
                this.f85339w = interfaceC13062m;
                this.f85340x = c22011d0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41869a c41869a;
                if (interfaceC30057d instanceof C41869a) {
                    c41869a = (C41869a) interfaceC30057d;
                    int i13 = c41869a.f85346x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41869a.f85346x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41869a = new C41869a(interfaceC30057d);
                    }
                } else {
                    c41869a = new C41869a(interfaceC30057d);
                }
                Object obj2 = c41869a.f85345w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41869a.f85346x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f85339w;
                    C22013e0 c22013e0M66508a = this.f85340x.reducer.m66508a((C11178a) obj);
                    c41869a.f85347y = null;
                    c41869a.f85341E = null;
                    c41869a.f85342F = null;
                    c41869a.f85343G = null;
                    c41869a.f85344H = 0;
                    c41869a.f85346x = 1;
                    if (interfaceC13062m.emit(c22013e0M66508a, c41869a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC13058l interfaceC13058l, C22011d0 c22011d0) {
            this.f85337w = interfaceC13058l;
            this.f85338x = c22011d0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f85337w.collect(new a(interfaceC13062m, this.f85338x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22011d0(C13729c membershipManagementInteractor, C14848d membershipAdjustmentCheckoutInteractor, C12429c manageMembershipInteractor, C3689c checkoutInteractor, C11179b combiner, C22005a0 eventConverter, C22883d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(membershipManagementInteractor, "membershipManagementInteractor");
        AbstractC22676k.m65750j(membershipAdjustmentCheckoutInteractor, "membershipAdjustmentCheckoutInteractor");
        AbstractC22676k.m65750j(manageMembershipInteractor, "manageMembershipInteractor");
        AbstractC22676k.m65750j(checkoutInteractor, "checkoutInteractor");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(eventConverter, "eventConverter");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.membershipManagementEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, eventConverter), membershipManagementInteractor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, coroutineScope, c13021b2, 1);
        this.membershipManagementDomainResult = c13078q1M36586L;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.membershipAdjustmentCheckoutEventFlow = c13096w1M36592b2;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new c(c13096w1M36592b2, eventConverter), membershipAdjustmentCheckoutInteractor), coroutineScope, c13021b2, 1);
        this.membershipAdjustmentCheckoutDomainResult = c13078q1M36586L2;
        C13096w1 c13096w1M36592b3 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.manageMembershipEventFlow = c13096w1M36592b3;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new d(c13096w1M36592b3, eventConverter), manageMembershipInteractor), coroutineScope, c13021b2, 1);
        this.manageMembershipDomainResult = c13078q1M36586L3;
        C13096w1 c13096w1M36592b4 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.checkoutEventFlow = c13096w1M36592b4;
        C13078q1 c13078q1M36586L4 = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new e(c13096w1M36592b4, eventConverter), checkoutInteractor), coroutineScope, c13021b2, 1);
        this.checkoutDomainResult = c13078q1M36586L4;
        C13078q1 c13078q1M36586L5 = AbstractC13091v.m36586L(combiner.m30290a(c13078q1M36586L, c13078q1M36586L2, c13078q1M36586L3, c13078q1M36586L4), coroutineScope, c13021b2, 1);
        this.combinedDomainResult = c13078q1M36586L5;
        this.viewState = new f(c13078q1M36586L5, this);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final void m62909p(InterfaceC24794e event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C22011d0(C13729c c13729c, C14848d c14848d, C12429c c12429c, C3689c c3689c, C11179b c11179b, C22005a0 c22005a0, C22883d c22883d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13729c, c14848d, c12429c, c3689c, c11179b, c22005a0, c22883d, (i13 & 128) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
