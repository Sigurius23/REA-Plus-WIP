package vv1;

import androidx.lifecycle.AbstractC1613o1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.membership.dunning.domain.api.DunningApi;
import com.whoop.membership.dunning.domain.models.CycleDataDunningBottomSheetModel;
import com.whoop.membership.dunning.domain.models.PaymentsOptionsDunningBottomSheetModel;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import hf1.InterfaceC17235b;
import hj0.C17345d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import lf1.C23994d;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import zv1.AbstractC41164a;

/* JADX INFO: renamed from: vv1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lvv1/a;", "", "Lbc3/c0;", "scope", "Lrv1/a;", "membershipRepository", "Lcom/whoop/membership/dunning/domain/api/DunningApi;", "dunningApi", "Lhf1/b;", "experimentsChecker", "Lhj0/d;", "applicationLifecycle", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Lrv1/a;Lcom/whoop/membership/dunning/domain/api/DunningApi;Lhf1/b;Lhj0/d;Ltr2/n;)V", "Ll83/a0;", "o", "()V", "p", "Lbc3/k1;", "l", "()Lbc3/k1;", "Lzv1/a;", "m", "(Lq83/d;)Ljava/lang/Object;", "k", "r", "q", "a", "Lbc3/c0;", "b", "Lrv1/a;", "c", "Lcom/whoop/membership/dunning/domain/api/DunningApi;", "d", "Lhf1/b;", "e", "Lhj0/d;", "f", "Ltr2/n;", "Lec3/p1;", "Lvv1/e;", "g", "Lec3/p1;", "_stateFlow", "Lec3/l;", "Lvv1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/l;", "n", "()Lec3/l;", "stateFlow", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36530a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final DunningApi dunningApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17345d applicationLifecycle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13075p1 _stateFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC13058l stateFlow;

    /* JADX INFO: renamed from: vv1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {124}, m100432m = "fetchCycleDataDunningBottomSheet", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f156364w;

        /* JADX INFO: renamed from: y */
        int f156366y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f156364w = obj;
            this.f156366y |= Integer.MIN_VALUE;
            return C36530a.this.m117072k(this);
        }
    }

    /* JADX INFO: renamed from: vv1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$fetchCycleDataDunningBottomSheet$response$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {124}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f156367w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156367w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            DunningApi dunningApi = C36530a.this.dunningApi;
            this.f156367w = 1;
            Object objFetchCycleDataDunningBottomSheet = dunningApi.fetchCycleDataDunningBottomSheet(this);
            return objFetchCycleDataDunningBottomSheet == enumC31071a ? enumC31071a : objFetchCycleDataDunningBottomSheet;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CycleDataDunningBottomSheetModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vv1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$fetchDunningBottomSheet$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {82, 87, 88, 93, 94, 98, 102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f156369E;

        /* JADX INFO: renamed from: F */
        int f156370F;

        /* JADX INFO: renamed from: w */
        int f156372w;

        /* JADX INFO: renamed from: x */
        Object f156373x;

        /* JADX INFO: renamed from: y */
        Object f156374y;

        /* JADX INFO: renamed from: z */
        Object f156375z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c2 A[PHI: r1 r4 r14
          0x00c2: PHI (r1v12 int) = (r1v9 int), (r1v14 int) binds: [B:24:0x00be, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x00c2: PHI (r4v10 vv1.e) = (r4v6 vv1.e), (r4v13 vv1.e) binds: [B:24:0x00be, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x00c2: PHI (r14v20 java.lang.Object) = (r14v19 java.lang.Object), (r14v0 java.lang.Object) binds: [B:24:0x00be, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:34:0x0105 A[PHI: r1 r4 r14
          0x0105: PHI (r1v15 int) = (r1v9 int), (r1v17 int) binds: [B:32:0x0102, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
          0x0105: PHI (r4v14 vv1.e) = (r4v6 vv1.e), (r4v17 vv1.e) binds: [B:32:0x0102, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
          0x0105: PHI (r14v24 java.lang.Object) = (r14v17 java.lang.Object), (r14v0 java.lang.Object) binds: [B:32:0x0102, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x012b  */
        /* JADX WARN: Code duplicated, block: B:42:0x016a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x016b A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            String str;
            C36534e c36534e;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f156370F;
            C23454a0 c23454a0 = C23454a0.f92919a;
            switch (i14) {
                case 0:
                    AbstractC34132o.m107864I(obj);
                    int i15 = C36530a.this.membershipRepository.m98946G().getValue() == MembershipStatus.PAST_DUE ? 1 : 0;
                    if (i15 != 0) {
                        C23994d c23994d = new C23994d(null, null, null, null, 15, null);
                        InterfaceC17235b interfaceC17235b = C36530a.this.experimentsChecker;
                        this.f156373x = null;
                        this.f156372w = i15;
                        this.f156370F = 1;
                        Object objMo48745e = interfaceC17235b.mo48745e(c23994d, true, this);
                        if (objMo48745e != enumC31071a) {
                            i13 = i15;
                            obj = objMo48745e;
                            str = (String) obj;
                            c36534e = (C36534e) ((C13045h2) C36530a.this._stateFlow).getValue();
                            if (AbstractC22676k.m65745e(str, "payment options")) {
                                C36530a c36530a = C36530a.this;
                                this.f156373x = null;
                                this.f156374y = null;
                                this.f156375z = c36534e;
                                this.f156372w = i13;
                                this.f156370F = 2;
                                obj = c36530a.m117074m(this);
                                if (obj != enumC31071a) {
                                    AbstractC41164a abstractC41164a = (AbstractC41164a) obj;
                                    InterfaceC13075p1 interfaceC13075p1 = C36530a.this._stateFlow;
                                    C36534e c36534eM117084b = C36534e.m117084b(c36534e, abstractC41164a, false, false, 6, null);
                                    this.f156373x = null;
                                    this.f156374y = null;
                                    this.f156375z = null;
                                    this.f156369E = null;
                                    this.f156372w = i13;
                                    this.f156370F = 3;
                                    ((C13045h2) interfaceC13075p1).emit(c36534eM117084b, this);
                                    if (c23454a0 == enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            } else if (AbstractC22676k.m65745e(str, "cycle data")) {
                                C36530a c36530a2 = C36530a.this;
                                this.f156373x = null;
                                this.f156374y = null;
                                this.f156375z = c36534e;
                                this.f156372w = i13;
                                this.f156370F = 4;
                                obj = c36530a2.m117072k(this);
                                if (obj != enumC31071a) {
                                    AbstractC41164a abstractC41164a2 = (AbstractC41164a) obj;
                                    InterfaceC13075p1 interfaceC13075p2 = C36530a.this._stateFlow;
                                    C36534e c36534eM117084b2 = C36534e.m117084b(c36534e, abstractC41164a2, false, false, 6, null);
                                    this.f156373x = null;
                                    this.f156374y = null;
                                    this.f156375z = null;
                                    this.f156369E = null;
                                    this.f156372w = i13;
                                    this.f156370F = 5;
                                    ((C13045h2) interfaceC13075p2).emit(c36534eM117084b2, this);
                                    if (c23454a0 == enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            } else {
                                InterfaceC13075p1 interfaceC13075p3 = C36530a.this._stateFlow;
                                C36534e c36534e2 = new C36534e(null, false, false, 7, null);
                                this.f156373x = null;
                                this.f156374y = null;
                                this.f156375z = null;
                                this.f156372w = i13;
                                this.f156370F = 6;
                                ((C13045h2) interfaceC13075p3).emit(c36534e2, this);
                                if (c23454a0 == enumC31071a) {
                                    return c23454a0;
                                }
                            }
                        }
                    } else {
                        InterfaceC13075p1 interfaceC13075p4 = C36530a.this._stateFlow;
                        C36534e c36534e3 = new C36534e(null, false, false, 7, null);
                        this.f156372w = i15;
                        this.f156370F = 7;
                        ((C13045h2) interfaceC13075p4).emit(c36534e3, this);
                        if (c23454a0 != enumC31071a) {
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                case 1:
                    i13 = this.f156372w;
                    AbstractC34132o.m107864I(obj);
                    str = (String) obj;
                    c36534e = (C36534e) ((C13045h2) C36530a.this._stateFlow).getValue();
                    if (AbstractC22676k.m65745e(str, "payment options")) {
                        C36530a c36530a3 = C36530a.this;
                        this.f156373x = null;
                        this.f156374y = null;
                        this.f156375z = c36534e;
                        this.f156372w = i13;
                        this.f156370F = 2;
                        obj = c36530a3.m117074m(this);
                        if (obj != enumC31071a) {
                            AbstractC41164a abstractC41164a3 = (AbstractC41164a) obj;
                            InterfaceC13075p1 interfaceC13075p5 = C36530a.this._stateFlow;
                            C36534e c36534eM117084b3 = C36534e.m117084b(c36534e, abstractC41164a3, false, false, 6, null);
                            this.f156373x = null;
                            this.f156374y = null;
                            this.f156375z = null;
                            this.f156369E = null;
                            this.f156372w = i13;
                            this.f156370F = 3;
                            ((C13045h2) interfaceC13075p5).emit(c36534eM117084b3, this);
                            if (c23454a0 == enumC31071a) {
                                return c23454a0;
                            }
                        }
                    } else if (AbstractC22676k.m65745e(str, "cycle data")) {
                        C36530a c36530a4 = C36530a.this;
                        this.f156373x = null;
                        this.f156374y = null;
                        this.f156375z = c36534e;
                        this.f156372w = i13;
                        this.f156370F = 4;
                        obj = c36530a4.m117072k(this);
                        if (obj != enumC31071a) {
                            AbstractC41164a abstractC41164a4 = (AbstractC41164a) obj;
                            InterfaceC13075p1 interfaceC13075p6 = C36530a.this._stateFlow;
                            C36534e c36534eM117084b4 = C36534e.m117084b(c36534e, abstractC41164a4, false, false, 6, null);
                            this.f156373x = null;
                            this.f156374y = null;
                            this.f156375z = null;
                            this.f156369E = null;
                            this.f156372w = i13;
                            this.f156370F = 5;
                            ((C13045h2) interfaceC13075p6).emit(c36534eM117084b4, this);
                            if (c23454a0 == enumC31071a) {
                                return c23454a0;
                            }
                        }
                    } else {
                        InterfaceC13075p1 interfaceC13075p7 = C36530a.this._stateFlow;
                        C36534e c36534e4 = new C36534e(null, false, false, 7, null);
                        this.f156373x = null;
                        this.f156374y = null;
                        this.f156375z = null;
                        this.f156372w = i13;
                        this.f156370F = 6;
                        ((C13045h2) interfaceC13075p7).emit(c36534e4, this);
                        if (c23454a0 == enumC31071a) {
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                case 2:
                    i13 = this.f156372w;
                    c36534e = (C36534e) this.f156375z;
                    AbstractC34132o.m107864I(obj);
                    AbstractC41164a abstractC41164a5 = (AbstractC41164a) obj;
                    InterfaceC13075p1 interfaceC13075p8 = C36530a.this._stateFlow;
                    C36534e c36534eM117084b5 = C36534e.m117084b(c36534e, abstractC41164a5, false, false, 6, null);
                    this.f156373x = null;
                    this.f156374y = null;
                    this.f156375z = null;
                    this.f156369E = null;
                    this.f156372w = i13;
                    this.f156370F = 3;
                    ((C13045h2) interfaceC13075p8).emit(c36534eM117084b5, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 3:
                case 5:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 4:
                    i13 = this.f156372w;
                    c36534e = (C36534e) this.f156375z;
                    AbstractC34132o.m107864I(obj);
                    AbstractC41164a abstractC41164a6 = (AbstractC41164a) obj;
                    InterfaceC13075p1 interfaceC13075p9 = C36530a.this._stateFlow;
                    C36534e c36534eM117084b6 = C36534e.m117084b(c36534e, abstractC41164a6, false, false, 6, null);
                    this.f156373x = null;
                    this.f156374y = null;
                    this.f156375z = null;
                    this.f156369E = null;
                    this.f156372w = i13;
                    this.f156370F = 5;
                    ((C13045h2) interfaceC13075p9).emit(c36534eM117084b6, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 6:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 7:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: vv1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {117}, m100432m = "fetchPaymentsOptionsDunningBottomSheet", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f156376w;

        /* JADX INFO: renamed from: y */
        int f156378y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f156376w = obj;
            this.f156378y |= Integer.MIN_VALUE;
            return C36530a.this.m117074m(this);
        }
    }

    /* JADX INFO: renamed from: vv1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$fetchPaymentsOptionsDunningBottomSheet$response$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f156379w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156379w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            DunningApi dunningApi = C36530a.this.dunningApi;
            this.f156379w = 1;
            Object objFetchPaymentsOptionsDunningBottomSheet = dunningApi.fetchPaymentsOptionsDunningBottomSheet(this);
            return objFetchPaymentsOptionsDunningBottomSheet == enumC31071a ? enumC31071a : objFetchPaymentsOptionsDunningBottomSheet;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PaymentsOptionsDunningBottomSheetModel> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vv1.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$observeBackgroundToForegroundTransitions$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156381w;

        /* JADX INFO: renamed from: vv1.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36530a f156383w;

            public a(C36530a c36530a) {
                this.f156383w = c36530a;
            }

            /* JADX INFO: renamed from: b */
            public final Object m117080b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (z4) {
                    C36534e c36534e = (C36534e) ((C13045h2) this.f156383w._stateFlow).getValue();
                    if (!c36534e.getIsDunningBottomSheetDisplayed()) {
                        ((C13045h2) this.f156383w._stateFlow).emit(C36534e.m117084b(c36534e, null, true, false, 5, null), interfaceC30057d);
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    }
                }
                return c23454a0;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m117080b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156381w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 appForegroundFlow = C36530a.this.applicationLifecycle.getAppForegroundFlow();
                a aVar = new a(C36530a.this);
                this.f156381w = 1;
                if (appForegroundFlow.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: vv1.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$observeMembershipStatus$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156384w;

        /* JADX INFO: renamed from: vv1.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36530a f156386w;

            public a(C36530a c36530a) {
                this.f156386w = c36530a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(MembershipStatus membershipStatus, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f156386w.m117073l();
                return C23454a0.f92919a;
            }
        }

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156384w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM5011a = AbstractC1613o1.m5011a(C36530a.this.membershipRepository.m98946G());
                a aVar = new a(C36530a.this);
                this.f156384w = 1;
                if (interfaceC13058lM5011a.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vv1.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$onDunningBottomSheetDismissed$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f156387w;

        /* JADX INFO: renamed from: x */
        int f156388x;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156388x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36534e c36534eM117084b = C36534e.m117084b((C36534e) ((C13045h2) C36530a.this._stateFlow).getValue(), null, false, false, 3, null);
                InterfaceC13075p1 interfaceC13075p1 = C36530a.this._stateFlow;
                this.f156387w = null;
                this.f156388x = 1;
                ((C13045h2) interfaceC13075p1).emit(c36534eM117084b, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: vv1.a$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$onDunningBottomSheetShown$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f156390w;

        /* JADX INFO: renamed from: x */
        int f156391x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156391x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36534e c36534eM117084b = C36534e.m117084b((C36534e) ((C13045h2) C36530a.this._stateFlow).getValue(), null, false, true, 1, null);
                InterfaceC13075p1 interfaceC13075p1 = C36530a.this._stateFlow;
                this.f156390w = null;
                this.f156391x = 1;
                ((C13045h2) interfaceC13075p1).emit(c36534eM117084b, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: vv1.a$j */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f156393w;

        /* JADX INFO: renamed from: vv1.a$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f156394w;

            /* JADX INFO: renamed from: vv1.a$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$special$$inlined$map$1$2", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42568a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f156395E;

                /* JADX INFO: renamed from: F */
                Object f156396F;

                /* JADX INFO: renamed from: G */
                Object f156397G;

                /* JADX INFO: renamed from: H */
                int f156398H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f156399w;

                /* JADX INFO: renamed from: x */
                int f156400x;

                /* JADX INFO: renamed from: y */
                Object f156401y;

                public C42568a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f156399w = obj;
                    this.f156400x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f156394w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42568a c42568a;
                if (interfaceC30057d instanceof C42568a) {
                    c42568a = (C42568a) interfaceC30057d;
                    int i13 = c42568a.f156400x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42568a.f156400x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42568a = new C42568a(interfaceC30057d);
                    }
                } else {
                    c42568a = new C42568a(interfaceC30057d);
                }
                Object obj2 = c42568a.f156399w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42568a.f156400x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f156394w;
                    C36534e c36534e = (C36534e) obj;
                    C36531b c36531b = new C36531b(c36534e.getState(), c36534e.getDunningBottomSheetHasNotBeenShown() && c36534e.getState() != null);
                    c42568a.f156401y = null;
                    c42568a.f156395E = null;
                    c42568a.f156396F = null;
                    c42568a.f156397G = null;
                    c42568a.f156398H = 0;
                    c42568a.f156400x = 1;
                    if (interfaceC13062m.emit(c36531b, c42568a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l) {
            this.f156393w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f156393w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vv1.a$k */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetCoordinator$stateFlow$1", m100430f = "DunningBottomSheetCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvv1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156403w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36530a.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f156403w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C36530a.this.m117076p();
            C36530a.this.m117075o();
            return C23454a0.f92919a;
        }
    }

    public C36530a(InterfaceC2994c0 scope, C31842a membershipRepository, DunningApi dunningApi, InterfaceC17235b experimentsChecker, C17345d applicationLifecycle, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(dunningApi, "dunningApi");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(applicationLifecycle, "applicationLifecycle");
        AbstractC22676k.m65750j(logger, "logger");
        this.scope = scope;
        this.membershipRepository = membershipRepository;
        this.dunningApi = dunningApi;
        this.experimentsChecker = experimentsChecker;
        this.applicationLifecycle = applicationLifecycle;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C36534e(null, true, false));
        this._stateFlow = c13045h2M36593c;
        this.stateFlow = AbstractC13091v.m36587M(new j(new C13015a0(new k(null), c13045h2M36593c)), scope, C13105z1.f45288a, new C36531b(null, false, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m117072k(InterfaceC30057d<? super AbstractC41164a> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f156366y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f156366y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f156364w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f156366y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f156366y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        CycleDataDunningBottomSheetModel cycleDataDunningBottomSheetModel = (CycleDataDunningBottomSheetModel) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        if (cycleDataDunningBottomSheetModel != null) {
            return new AbstractC41164a.a(cycleDataDunningBottomSheetModel);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC3027k1 m117073l() {
        return AbstractC3006f0.m8732z(this.scope, null, null, new c(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m117074m(InterfaceC30057d<? super AbstractC41164a> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f156378y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f156378y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f156376w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f156378y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(null);
            dVar2.f156378y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        PaymentsOptionsDunningBottomSheetModel paymentsOptionsDunningBottomSheetModel = (PaymentsOptionsDunningBottomSheetModel) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        if (paymentsOptionsDunningBottomSheetModel != null) {
            return new AbstractC41164a.b(paymentsOptionsDunningBottomSheetModel);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m117075o() {
        AbstractC3006f0.m8732z(this.scope, null, null, new f(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m117076p() {
        AbstractC3006f0.m8732z(this.scope, null, null, new g(null), 3);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getStateFlow() {
        return this.stateFlow;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC3027k1 m117078q() {
        return AbstractC3006f0.m8732z(this.scope, null, null, new h(null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC3027k1 m117079r() {
        return AbstractC3006f0.m8732z(this.scope, null, null, new i(null), 3);
    }

    public /* synthetic */ C36530a(InterfaceC2994c0 interfaceC2994c0, C31842a c31842a, DunningApi dunningApi, InterfaceC17235b interfaceC17235b, C17345d c17345d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, c31842a, dunningApi, interfaceC17235b, c17345d, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DunningBottomSheetCoordinator") : interfaceC34116n);
    }
}
