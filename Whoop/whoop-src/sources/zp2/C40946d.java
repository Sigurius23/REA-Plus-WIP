package zp2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.user.journey.model.UserJourneyContentModel;
import com.whoop.user.journey.model.UserJourneyContentModelV2;
import com.whoop.user.journey.sources.data.UserJourneyApi;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: zp2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lzp2/d;", "", "Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "userJourneyApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Ltr2/n;)V", "", "year", "Lcom/whoop/user/journey/model/UserJourneyContentState;", "b", "(ILq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "Ltr2/n;", "c", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40946d {

    /* JADX INFO: renamed from: d */
    public static final int f176673d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyApi userJourneyApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: zp2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyContentInteractor", m100430f = "UserJourneyContentInteractor.kt", m100431l = {C1533u.MAX_FIELD_NUMBER, 28}, m100432m = "interact", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f176676w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176677x;

        /* JADX INFO: renamed from: z */
        int f176679z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176677x = obj;
            this.f176679z |= Integer.MIN_VALUE;
            return C40946d.this.m132865b(0, this);
        }
    }

    /* JADX INFO: renamed from: zp2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyContentInteractor$interact$response$1", m100430f = "UserJourneyContentInteractor.kt", m100431l = {C1533u.AVG_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/user/journey/model/UserJourneyContentModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176680w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40946d.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176680w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            UserJourneyApi userJourneyApi = C40946d.this.userJourneyApi;
            this.f176680w = 1;
            Object weekInReviewSteps = userJourneyApi.getWeekInReviewSteps(this);
            return weekInReviewSteps == enumC31071a ? enumC31071a : weekInReviewSteps;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UserJourneyContentModel> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zp2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyContentInteractor$interact$response$2", m100430f = "UserJourneyContentInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176682w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f176684y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f176684y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40946d.this.new d(this.f176684y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176682w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            UserJourneyApi userJourneyApi = C40946d.this.userJourneyApi;
            int i14 = this.f176684y;
            this.f176682w = 1;
            Object yearInReviewSteps = userJourneyApi.getYearInReviewSteps(i14, this);
            return yearInReviewSteps == enumC31071a ? enumC31071a : yearInReviewSteps;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UserJourneyContentModelV2> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C40946d(UserJourneyApi userJourneyApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userJourneyApi, "userJourneyApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.userJourneyApi = userJourneyApi;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r15 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r15 == r0) goto L40;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m132865b(int r14, q83.InterfaceC30057d<? super com.whoop.user.journey.model.UserJourneyContentState> r15) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp2.C40946d.m132865b(int, q83.d):java.lang.Object");
    }
}
