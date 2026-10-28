package uw1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import ow1.C28436a;
import ow1.C28437b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p742vw1.C36545d;
import pw1.C29588d;
import pw1.InterfaceC29585a;
import q83.InterfaceC30057d;
import qw1.C30690d;
import qw1.InterfaceC30688b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ww1.InterfaceC37658d;
import ww1.InterfaceC37660f;
import ww1.InterfaceC37661g;

/* JADX INFO: renamed from: uw1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020.0)8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Luw1/f;", "Landroidx/lifecycle/w1;", "Lpw1/d;", "familyPlanInteractor", "Lqw1/d;", "inviteFamilyMemberInteractor", "Low1/b;", "combiner", "Luw1/b;", "eventConverter", "Lvw1/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lpw1/d;Lqw1/d;Low1/b;Luw1/b;Lvw1/d;Lbc3/c0;)V", "Lww1/f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lww1/f;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lvw1/d;", "x", "Lbc3/c0;", "Lec3/o1;", "Lww1/d;", "y", "Lec3/o1;", "familyPlanEventFlow", "Lec3/t1;", "Lpw1/b;", "z", "Lec3/t1;", "familyPlanDomainResult", "Lww1/g;", "E", "inviteMemberEventFlow", "Lqw1/c;", "F", "inviteMemberDomainResult", "Lec3/l;", "Low1/a;", "G", "Lec3/l;", "combinedDomainResult", "Luw1/g;", "H", "getViewState", "()Lec3/l;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35313f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 inviteMemberEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 inviteMemberDomainResult;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l combinedDomainResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C36545d reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 familyPlanEventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 familyPlanDomainResult;

    /* JADX INFO: renamed from: uw1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.presentation.FamilyPlanViewModel$sendViewEvent$1", m100430f = "FamilyPlanViewModel.kt", m100431l = {53, 54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150453w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC37660f f150454x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35313f f150455y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC37660f interfaceC37660f, C35313f c35313f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150454x = interfaceC37660f;
            this.f150455y = c35313f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f150454x, this.f150455y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f150453w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L48
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                ww1.f r5 = r4.f150454x
                boolean r1 = r5 instanceof ww1.InterfaceC37658d
                if (r1 == 0) goto L33
                uw1.f r5 = r4.f150455y
                ec3.o1 r5 = uw1.C35313f.m112151g(r5)
                ww1.f r1 = r4.f150454x
                r4.f150453w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L48
                goto L47
            L33:
                boolean r5 = r5 instanceof ww1.InterfaceC37661g
                if (r5 == 0) goto L4b
                uw1.f r5 = r4.f150455y
                ec3.o1 r5 = uw1.C35313f.m112152j(r5)
                ww1.f r1 = r4.f150454x
                r4.f150453w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            L4b:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uw1.C35313f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: uw1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150456w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35309b f150457x;

        /* JADX INFO: renamed from: uw1.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150458w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35309b f150459x;

            /* JADX INFO: renamed from: uw1.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.presentation.FamilyPlanViewModel$special$$inlined$map$1$2", m100430f = "FamilyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42517a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150460E;

                /* JADX INFO: renamed from: F */
                Object f150461F;

                /* JADX INFO: renamed from: G */
                Object f150462G;

                /* JADX INFO: renamed from: H */
                int f150463H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150464w;

                /* JADX INFO: renamed from: x */
                int f150465x;

                /* JADX INFO: renamed from: y */
                Object f150466y;

                public C42517a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150464w = obj;
                    this.f150465x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35309b c35309b) {
                this.f150458w = interfaceC13062m;
                this.f150459x = c35309b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42517a c42517a;
                if (interfaceC30057d instanceof C42517a) {
                    c42517a = (C42517a) interfaceC30057d;
                    int i13 = c42517a.f150465x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42517a.f150465x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42517a = new C42517a(interfaceC30057d);
                    }
                } else {
                    c42517a = new C42517a(interfaceC30057d);
                }
                Object obj2 = c42517a.f150464w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42517a.f150465x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150458w;
                    InterfaceC29585a interfaceC29585aM112105a = this.f150459x.m112105a((InterfaceC37658d) obj);
                    c42517a.f150466y = null;
                    c42517a.f150460E = null;
                    c42517a.f150461F = null;
                    c42517a.f150462G = null;
                    c42517a.f150463H = 0;
                    c42517a.f150465x = 1;
                    if (interfaceC13062m.emit(interfaceC29585aM112105a, c42517a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C35309b c35309b) {
            this.f150456w = interfaceC13058l;
            this.f150457x = c35309b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150456w.collect(new a(interfaceC13062m, this.f150457x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw1.f$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150468w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35309b f150469x;

        /* JADX INFO: renamed from: uw1.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150470w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35309b f150471x;

            /* JADX INFO: renamed from: uw1.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.presentation.FamilyPlanViewModel$special$$inlined$map$2$2", m100430f = "FamilyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42518a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150472E;

                /* JADX INFO: renamed from: F */
                Object f150473F;

                /* JADX INFO: renamed from: G */
                Object f150474G;

                /* JADX INFO: renamed from: H */
                int f150475H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150476w;

                /* JADX INFO: renamed from: x */
                int f150477x;

                /* JADX INFO: renamed from: y */
                Object f150478y;

                public C42518a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150476w = obj;
                    this.f150477x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35309b c35309b) {
                this.f150470w = interfaceC13062m;
                this.f150471x = c35309b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42518a c42518a;
                if (interfaceC30057d instanceof C42518a) {
                    c42518a = (C42518a) interfaceC30057d;
                    int i13 = c42518a.f150477x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42518a.f150477x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42518a = new C42518a(interfaceC30057d);
                    }
                } else {
                    c42518a = new C42518a(interfaceC30057d);
                }
                Object obj2 = c42518a.f150476w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42518a.f150477x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150470w;
                    InterfaceC30688b interfaceC30688bM112106b = this.f150471x.m112106b((InterfaceC37661g) obj);
                    c42518a.f150478y = null;
                    c42518a.f150472E = null;
                    c42518a.f150473F = null;
                    c42518a.f150474G = null;
                    c42518a.f150475H = 0;
                    c42518a.f150477x = 1;
                    if (interfaceC13062m.emit(interfaceC30688bM112106b, c42518a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C35309b c35309b) {
            this.f150468w = interfaceC13058l;
            this.f150469x = c35309b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150468w.collect(new a(interfaceC13062m, this.f150469x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw1.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150480w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35313f f150481x;

        /* JADX INFO: renamed from: uw1.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150482w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35313f f150483x;

            /* JADX INFO: renamed from: uw1.f$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.presentation.FamilyPlanViewModel$special$$inlined$map$3$2", m100430f = "FamilyPlanViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42519a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150484E;

                /* JADX INFO: renamed from: F */
                Object f150485F;

                /* JADX INFO: renamed from: G */
                Object f150486G;

                /* JADX INFO: renamed from: H */
                int f150487H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150488w;

                /* JADX INFO: renamed from: x */
                int f150489x;

                /* JADX INFO: renamed from: y */
                Object f150490y;

                public C42519a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150488w = obj;
                    this.f150489x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35313f c35313f) {
                this.f150482w = interfaceC13062m;
                this.f150483x = c35313f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42519a c42519a;
                if (interfaceC30057d instanceof C42519a) {
                    c42519a = (C42519a) interfaceC30057d;
                    int i13 = c42519a.f150489x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42519a.f150489x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42519a = new C42519a(interfaceC30057d);
                    }
                } else {
                    c42519a = new C42519a(interfaceC30057d);
                }
                Object obj2 = c42519a.f150488w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42519a.f150489x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150482w;
                    C35314g c35314gM117176a = this.f150483x.reducer.m117176a((C28436a) obj);
                    c42519a.f150490y = null;
                    c42519a.f150484E = null;
                    c42519a.f150485F = null;
                    c42519a.f150486G = null;
                    c42519a.f150487H = 0;
                    c42519a.f150489x = 1;
                    if (interfaceC13062m.emit(c35314gM117176a, c42519a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C35313f c35313f) {
            this.f150480w = interfaceC13058l;
            this.f150481x = c35313f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150480w.collect(new a(interfaceC13062m, this.f150481x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35313f(C29588d familyPlanInteractor, C30690d inviteFamilyMemberInteractor, C28437b combiner, C35309b eventConverter, C36545d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(familyPlanInteractor, "familyPlanInteractor");
        AbstractC22676k.m65750j(inviteFamilyMemberInteractor, "inviteFamilyMemberInteractor");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(eventConverter, "eventConverter");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.familyPlanEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, eventConverter), familyPlanInteractor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, coroutineScope, c13021b2, 1);
        this.familyPlanDomainResult = c13078q1M36586L;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.inviteMemberEventFlow = c13096w1M36592b2;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new c(c13096w1M36592b2, eventConverter), inviteFamilyMemberInteractor), coroutineScope, c13021b2, 1);
        this.inviteMemberDomainResult = c13078q1M36586L2;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(combiner.m86168a(c13078q1M36586L, c13078q1M36586L2), coroutineScope, c13021b2, 1);
        this.combinedDomainResult = c13078q1M36586L3;
        this.viewState = new d(c13078q1M36586L3, this);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m112154n(InterfaceC37660f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, this, null), 3);
    }

    public /* synthetic */ C35313f(C29588d c29588d, C30690d c30690d, C28437b c28437b, C35309b c35309b, C36545d c36545d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29588d, c30690d, c28437b, c35309b, c36545d, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
