package f70;

import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import g70.C15542a;
import h70.C16983a;
import i70.C18196a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j70.C21389a;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pj1.C29298b;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BY\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J*\u0010%\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010$\u001a\u00020'H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010!J\u001a\u0010+\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\"H\u0082@¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\"H\u0082@¢\u0006\u0004\b-\u0010,J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J#\u00104\u001a\b\u0012\u0004\u0012\u00020\u0003022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m65681d2 = {"Lf70/h;", "Lod1/g;", "Lf70/d;", "Lf70/e;", "Ltr2/n;", "logger", "Lf70/r0;", "memberInfoHandler", "Lpj1/b;", "healthConnectRepository", "Lf70/a0;", "forgotPasswordSubmissionHandler", "Lf70/a1;", "startScreenCtaHelper", "Lf70/b1;", "startScreenJoinCtaHelper", "Li70/a;", "screenFetchDispatcher", "Lj70/a;", "forwardNavigationOrchestrator", "Lg70/a;", "previousNavigationOrchestrator", "Lh70/a;", "dialogHandler", "<init>", "(Ltr2/n;Lf70/r0;Lpj1/b;Lf70/a0;Lf70/a1;Lf70/b1;Li70/a;Lj70/a;Lg70/a;Lh70/a;)V", "previous", "u", "(Lf70/e;Lf70/e;)Lf70/e;", "prevDomainResult", "q", "(Lf70/e;Lq83/d;)Ljava/lang/Object;", "p", "(Lf70/e;)Lf70/e;", "Lec3/m;", "Lf70/d$y;", "action", "x", "(Lec3/m;Lf70/e;Lf70/d$y;Lq83/d;)Ljava/lang/Object;", "Lf70/d$x;", "r", "(Lec3/m;Lf70/d$x;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "s", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "t", "", "shouldDismissErrorMessage", "v", "(Lf70/e;Z)Lf70/e;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Ltr2/n;", "b", "Lf70/r0;", "c", "Lpj1/b;", "d", "Lf70/a0;", "e", "Lf70/a1;", "f", "Lf70/b1;", "g", "Li70/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lj70/a;", "i", "Lg70/a;", "j", "Lh70/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14182h implements InterfaceC27844g<InterfaceC14173d, InterfaceC14176e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14203r0 memberInfoHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29298b healthConnectRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14165a0 forgotPasswordSubmissionHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14166a1 startScreenCtaHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C14169b1 startScreenJoinCtaHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C18196a screenFetchDispatcher;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C21389a forwardNavigationOrchestrator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C15542a previousNavigationOrchestrator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C16983a dialogHandler;

    /* JADX INFO: renamed from: f70.h$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor", m100430f = "ActivationInteractor.kt", m100431l = {88}, m100432m = "checkForHealthConnect", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51293E;

        /* JADX INFO: renamed from: F */
        int f51294F;

        /* JADX INFO: renamed from: G */
        int f51295G;

        /* JADX INFO: renamed from: H */
        int f51296H;

        /* JADX INFO: renamed from: I */
        int f51297I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f51298J;

        /* JADX INFO: renamed from: L */
        int f51300L;

        /* JADX INFO: renamed from: w */
        Object f51301w;

        /* JADX INFO: renamed from: x */
        Object f51302x;

        /* JADX INFO: renamed from: y */
        int f51303y;

        /* JADX INFO: renamed from: z */
        int f51304z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51298J = obj;
            this.f51300L |= Integer.MIN_VALUE;
            return C14182h.this.m40468q(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor$interact$1", m100430f = "ActivationInteractor.kt", m100431l = {32, 34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lf70/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14182h f51305E;

        /* JADX INFO: renamed from: w */
        Object f51306w;

        /* JADX INFO: renamed from: x */
        int f51307x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f51308y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f51309z;

        /* JADX INFO: renamed from: f70.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C14182h f51310w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f51311x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22669g0 f51312y;

            /* JADX INFO: renamed from: f70.h$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor$interact$1$1", m100430f = "ActivationInteractor.kt", m100431l = {36, 37, 38, 40, 49, 50, 51, 54, 56, 61}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41582a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f51313E;

                /* JADX INFO: renamed from: w */
                Object f51314w;

                /* JADX INFO: renamed from: x */
                Object f51315x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f51316y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f51317z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41582a(a<? super T> aVar, InterfaceC30057d<? super C41582a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f51317z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f51316y = obj;
                    this.f51313E |= Integer.MIN_VALUE;
                    return this.f51317z.emit(null, this);
                }
            }

            public a(C14182h c14182h, InterfaceC13062m interfaceC13062m, C22669g0 c22669g0) {
                this.f51310w = c14182h;
                this.f51311x = interfaceC13062m;
                this.f51312y = c22669g0;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0114, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x016b, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01c1, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x01ef, code lost:
            
                if (r11 == r0) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x023c, code lost:
            
                if (r10.emit(r11, r7) == r0) goto L94;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(f70.InterfaceC14173d r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    Method dump skipped, instruction units count: 610
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: f70.C14182h.b.a.emit(f70.d, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, C14182h c14182h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f51309z = interfaceC13058l;
            this.f51305E = c14182h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f51309z, this.f51305E, interfaceC30057d);
            bVar.f51308y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r7.collect(r4, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f51308y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f51307x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r6.f51306w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L54
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r2 = r6.f51306w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r7)
                f70.e$a r7 = f70.InterfaceC14176e.a.f51223a
                r2.f89336w = r7
                r6.f51308y = r0
                r6.f51306w = r2
                r6.f51307x = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3d
                goto L53
            L3d:
                ec3.l r7 = r6.f51309z
                f70.h$b$a r4 = new f70.h$b$a
                f70.h r5 = r6.f51305E
                r4.<init>(r5, r0, r2)
                r0 = 0
                r6.f51308y = r0
                r6.f51306w = r0
                r6.f51307x = r3
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r1) goto L54
            L53:
                return r1
            L54:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f70.C14182h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: f70.h$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor", m100430f = "ActivationInteractor.kt", m100431l = {130, 131}, m100432m = "onForgotPasswordClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51318E;

        /* JADX INFO: renamed from: w */
        Object f51319w;

        /* JADX INFO: renamed from: x */
        Object f51320x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51321y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51321y = obj;
            this.f51318E |= Integer.MIN_VALUE;
            return C14182h.this.m40469r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.h$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor", m100430f = "ActivationInteractor.kt", m100431l = {152, 153}, m100432m = "onStartScreenCtaClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51323w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51324x;

        /* JADX INFO: renamed from: z */
        int f51326z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51324x = obj;
            this.f51326z |= Integer.MIN_VALUE;
            return C14182h.this.m40470s(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.h$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor", m100430f = "ActivationInteractor.kt", m100431l = {160, 161}, m100432m = "onStartScreenJoinCtaClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51327w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51328x;

        /* JADX INFO: renamed from: z */
        int f51330z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51328x = obj;
            this.f51330z |= Integer.MIN_VALUE;
            return C14182h.this.m40471t(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.h$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor", m100430f = "ActivationInteractor.kt", m100431l = {117, 121}, m100432m = "storeMembershipInformation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51331E;

        /* JADX INFO: renamed from: G */
        int f51333G;

        /* JADX INFO: renamed from: w */
        Object f51334w;

        /* JADX INFO: renamed from: x */
        Object f51335x;

        /* JADX INFO: renamed from: y */
        Object f51336y;

        /* JADX INFO: renamed from: z */
        Object f51337z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51331E = obj;
            this.f51333G |= Integer.MIN_VALUE;
            return C14182h.this.m40475x(null, null, null, this);
        }
    }

    public C14182h(InterfaceC34116n logger, C14203r0 memberInfoHandler, C29298b healthConnectRepository, C14165a0 forgotPasswordSubmissionHandler, C14166a1 startScreenCtaHelper, C14169b1 startScreenJoinCtaHelper, C18196a screenFetchDispatcher, C21389a forwardNavigationOrchestrator, C15542a previousNavigationOrchestrator, C16983a dialogHandler) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(memberInfoHandler, "memberInfoHandler");
        AbstractC22676k.m65750j(healthConnectRepository, "healthConnectRepository");
        AbstractC22676k.m65750j(forgotPasswordSubmissionHandler, "forgotPasswordSubmissionHandler");
        AbstractC22676k.m65750j(startScreenCtaHelper, "startScreenCtaHelper");
        AbstractC22676k.m65750j(startScreenJoinCtaHelper, "startScreenJoinCtaHelper");
        AbstractC22676k.m65750j(screenFetchDispatcher, "screenFetchDispatcher");
        AbstractC22676k.m65750j(forwardNavigationOrchestrator, "forwardNavigationOrchestrator");
        AbstractC22676k.m65750j(previousNavigationOrchestrator, "previousNavigationOrchestrator");
        AbstractC22676k.m65750j(dialogHandler, "dialogHandler");
        this.logger = logger;
        this.memberInfoHandler = memberInfoHandler;
        this.healthConnectRepository = healthConnectRepository;
        this.forgotPasswordSubmissionHandler = forgotPasswordSubmissionHandler;
        this.startScreenCtaHelper = startScreenCtaHelper;
        this.startScreenJoinCtaHelper = startScreenJoinCtaHelper;
        this.screenFetchDispatcher = screenFetchDispatcher;
        this.forwardNavigationOrchestrator = forwardNavigationOrchestrator;
        this.previousNavigationOrchestrator = previousNavigationOrchestrator;
        this.dialogHandler = dialogHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC14176e m40467p(InterfaceC14176e prevDomainResult) {
        return prevDomainResult instanceof InterfaceC14176e.b ? InterfaceC14176e.b.m40416b((InterfaceC14176e.b) prevDomainResult, null, null, null, null, null, false, null, false, null, true, false, null, null, null, null, null, null, 130559, null) : prevDomainResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: q */
    public final Object m40468q(InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        C14201q0 memberInfo;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        InterfaceC14176e interfaceC14176e2 = interfaceC14176e;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i24 = aVar.f51300L;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                aVar.f51300L = i24 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM88925f = aVar.f51298J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i25 = aVar.f51300L;
        if (i25 == 0) {
            AbstractC34132o.m107864I(objM88925f);
            if (!(interfaceC14176e2 instanceof InterfaceC14176e.b)) {
                return interfaceC14176e2;
            }
            memberInfo = ((InterfaceC14176e.b) interfaceC14176e2).getMemberInfo();
            C29298b c29298b = this.healthConnectRepository;
            aVar.f51301w = interfaceC14176e2;
            aVar.f51302x = memberInfo;
            aVar.f51303y = 0;
            aVar.f51304z = 0;
            aVar.f51293E = 0;
            aVar.f51294F = 0;
            aVar.f51295G = 0;
            aVar.f51296H = 0;
            aVar.f51297I = 0;
            aVar.f51300L = 1;
            objM88925f = c29298b.m88925f(aVar);
            if (objM88925f == enumC31071a) {
                return enumC31071a;
            }
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        } else {
            if (i25 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i26 = aVar.f51297I;
            i13 = aVar.f51296H;
            i14 = aVar.f51295G;
            i15 = aVar.f51294F;
            i16 = aVar.f51293E;
            i17 = aVar.f51304z;
            i18 = aVar.f51303y;
            memberInfo = (C14201q0) aVar.f51302x;
            InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) aVar.f51301w;
            AbstractC34132o.m107864I(objM88925f);
            i19 = i26;
            interfaceC14176e2 = interfaceC14176e3;
        }
        InterfaceC14176e.b bVar = (InterfaceC14176e.b) interfaceC14176e2;
        return InterfaceC14176e.b.m40416b(bVar, null, C26418e.m78162b(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, null, 15, null), null, C14201q0.m40542b(memberInfo, null, null, null, null, null, null, null, null, i18 != 0, i17 != 0, i16 != 0, null, null, null, null, null, null, null, null, i15 != 0, i14 != 0, i13 != 0, null, null, null, null, i19, ((Boolean) objM88925f).booleanValue(), false, false, 939524095, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: r */
    public final Object m40469r(InterfaceC13062m interfaceC13062m, InterfaceC14173d.x xVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        c cVar;
        InterfaceC14173d.x xVar2;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51318E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51318E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f51321y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f51318E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            cVar.f51319w = null;
            xVar2 = xVar;
            cVar.f51320x = xVar2;
            cVar.f51318E = 1;
            if (interfaceC13062m.emit(bVar, cVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14173d.x xVar3 = (InterfaceC14173d.x) cVar.f51320x;
        AbstractC34132o.m107864I(obj);
        xVar2 = xVar3;
        C14165a0 c14165a0 = this.forgotPasswordSubmissionHandler;
        cVar.f51319w = null;
        cVar.f51320x = null;
        cVar.f51318E = 2;
        Object objM40352b = c14165a0.m40352b(xVar2, cVar);
        return objM40352b == obj2 ? obj2 : objM40352b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r1 == r3) goto L21;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40470s(ec3.InterfaceC13062m r29, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            boolean r2 = r1 instanceof f70.C14182h.d
            if (r2 == 0) goto L17
            r2 = r1
            f70.h$d r2 = (f70.C14182h.d) r2
            int r3 = r2.f51326z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f51326z = r3
            goto L1c
        L17:
            f70.h$d r2 = new f70.h$d
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f51324x
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f51326z
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L43
            if (r4 == r6) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f51323w
            ec3.m r2 = (ec3.InterfaceC13062m) r2
            p505ts.AbstractC34132o.m107864I(r1)
            goto L86
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.Object r4 = r2.f51323w
            ec3.m r4 = (ec3.InterfaceC13062m) r4
            p505ts.AbstractC34132o.m107864I(r1)
            goto L79
        L43:
            p505ts.AbstractC34132o.m107864I(r1)
            f70.e$b r8 = new f70.e$b
            f70.b0 r13 = f70.EnumC14168b0.LOADING
            r26 = 131055(0x1ffef, float:1.83647E-40)
            r27 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.f51323w = r7
            r2.f51326z = r6
            r1 = r29
            java.lang.Object r1 = r1.emit(r8, r2)
            if (r1 != r3) goto L79
            goto L85
        L79:
            f70.a1 r1 = r0.startScreenCtaHelper
            r2.f51323w = r7
            r2.f51326z = r5
            java.lang.Object r1 = r1.m40355b(r2)
            if (r1 != r3) goto L86
        L85:
            return r3
        L86:
            r2 = r1
            f70.e r2 = (f70.InterfaceC14176e) r2
            boolean r3 = r2 instanceof f70.InterfaceC14176e.b
            if (r3 == 0) goto L90
            f70.e$b r2 = (f70.InterfaceC14176e.b) r2
            goto L91
        L90:
            r2 = r7
        L91:
            if (r2 == 0) goto L9d
            n70.e r2 = r2.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String()
            if (r2 == 0) goto L9d
            com.whoop.activation.view.navigation.ActivationFlowDestination r7 = r2.getCurrentDestination()
        L9d:
            tr2.n r2 = r0.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "User pressed 'I have a whoop device' button. Navigating to the "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = "."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
            r2.mo85216g(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14182h.m40470s(ec3.m, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: t */
    public final Object m40471t(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f51330z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f51330z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f51328x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f51330z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            eVar.f51327w = null;
            eVar.f51330z = 1;
            if (interfaceC13062m.emit(bVar, eVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        C14169b1 c14169b1 = this.startScreenJoinCtaHelper;
        eVar.f51327w = null;
        eVar.f51330z = 2;
        Object objM40363b = c14169b1.m40363b(eVar);
        return objM40363b == obj2 ? obj2 : objM40363b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC14176e m40472u(InterfaceC14176e interfaceC14176e, InterfaceC14176e interfaceC14176e2) {
        ActivationFlowDestination currentDestination;
        if (!(interfaceC14176e instanceof InterfaceC14176e.b) || !(interfaceC14176e2 instanceof InterfaceC14176e.b)) {
            return interfaceC14176e;
        }
        InterfaceC14176e.b bVar = (InterfaceC14176e.b) interfaceC14176e;
        if (bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentDestination() != null || (currentDestination = ((InterfaceC14176e.b) interfaceC14176e2).getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentDestination()) == null) {
            return interfaceC14176e;
        }
        this.logger.mo85228t("Preserving currentDestination=" + currentDestination + " across a result that dropped it", new AbstractC30556a.a[0]);
        return InterfaceC14176e.b.m40416b(bVar, null, C26418e.m78162b(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, currentDestination, null, 23, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC14176e m40473v(InterfaceC14176e prevDomainResult, boolean shouldDismissErrorMessage) {
        return prevDomainResult instanceof InterfaceC14176e.b ? InterfaceC14176e.b.m40416b((InterfaceC14176e.b) prevDomainResult, null, null, null, null, null, false, null, false, null, false, shouldDismissErrorMessage, null, null, null, null, null, null, 130047, null) : prevDomainResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC14176e m40474w(InterfaceC14176e prevDomainResult) {
        if (!(prevDomainResult instanceof InterfaceC14176e.b)) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.HOME, null, 2, null), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
        }
        InterfaceC14176e.b bVar = (InterfaceC14176e.b) prevDomainResult;
        return InterfaceC14176e.b.m40416b(bVar, null, C26418e.m78162b(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.HOME, null, 2, null), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: x */
    public final Object m40475x(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC14173d.y yVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f51333G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f51333G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM40596b = fVar2.f51331E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f51333G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40596b);
            C14203r0 c14203r0 = this.memberInfoHandler;
            fVar2.f51334w = interfaceC13062m;
            fVar2.f51335x = null;
            fVar2.f51336y = yVar;
            fVar2.f51333G = 1;
            objM40596b = c14203r0.m40596b(interfaceC14176e, yVar, fVar2);
            if (objM40596b != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM40596b);
            return objM40596b;
        }
        yVar = (InterfaceC14173d.y) fVar2.f51336y;
        interfaceC13062m = (InterfaceC13062m) fVar2.f51334w;
        AbstractC34132o.m107864I(objM40596b);
        InterfaceC14176e interfaceC14176e2 = (InterfaceC14176e) objM40596b;
        if (!(yVar instanceof InterfaceC14173d.y.o)) {
            return interfaceC14176e2;
        }
        C21389a c21389a = this.forwardNavigationOrchestrator;
        fVar2.f51334w = null;
        fVar2.f51335x = null;
        fVar2.f51336y = null;
        fVar2.f51337z = null;
        fVar2.f51333G = 2;
        Object objM60032d = C21389a.m60032d(c21389a, interfaceC13062m, interfaceC14176e2, false, null, null, fVar2, 28, null);
        return objM60032d == enumC31071a ? enumC31071a : objM60032d;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new b(upstream, this, null));
    }

    public /* synthetic */ C14182h(InterfaceC34116n interfaceC34116n, C14203r0 c14203r0, C29298b c29298b, C14165a0 c14165a0, C14166a1 c14166a1, C14169b1 c14169b1, C18196a c18196a, C21389a c21389a, C15542a c15542a, C16983a c16983a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationInteractor") : interfaceC34116n, c14203r0, c29298b, c14165a0, c14166a1, c14169b1, c18196a, c21389a, c15542a, c16983a);
    }
}
