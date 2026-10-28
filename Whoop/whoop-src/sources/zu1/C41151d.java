package zu1;

import c93.InterfaceC4351m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.PricingSelectionCardModel;
import com.whoop.design.models.items.TimerMetaDataModel;
import com.whoop.domain.model.User;
import com.whoop.limitedtimeoffer.domain.GetLimitedTimeOfferRequest;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferModels;
import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferSectionModel;
import com.whoop.limitedtimeoffer.domain.models.TimerPillModel;
import com.whoop.service.network.HomeComponentDismissApi;
import cv1.InterfaceC11144a;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p237j$.time.DesugarDuration;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u92.C34659c;
import xu1.C38653a;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: zu1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010#\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010/J+\u00101\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u00100\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0007¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, m65681d2 = {"Lzu1/d;", "Lod1/g;", "Lzu1/b;", "Lzu1/c;", "Lnm0/e;", "cachedApiSource", "Lz92/a;", "userInfoAccessor", "Lxu1/a;", "analyticsHelper", "Lcom/whoop/service/network/HomeComponentDismissApi;", "homeComponentDismissApi", "Lu92/c;", "ltoDismissStore", "Ltr2/n;", "logger", "Ljava/time/Clock;", "clock", "<init>", "(Lnm0/e;Lz92/a;Lxu1/a;Lcom/whoop/service/network/HomeComponentDismissApi;Lu92/c;Ltr2/n;Ljava/time/Clock;)V", "previousState", "action", "i", "(Lzu1/c;Lzu1/b;)Lzu1/c;", "", "manualRefresh", "", "offerId", "source", "Lec3/l;", "k", "(ZLjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lpm0/a$c;", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "cacheResult", "j", "(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzu1/c;", "", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;", "sections", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;)Ljava/lang/String;", "dateString", "m", "(Ljava/lang/String;)Ljava/lang/String;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "selectedSegmentId", "n", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "a", "Lnm0/e;", "b", "Lz92/a;", "c", "Lxu1/a;", "d", "Lcom/whoop/service/network/HomeComponentDismissApi;", "e", "Lu92/c;", "f", "Ltr2/n;", "g", "Ljava/time/Clock;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41151d implements InterfaceC27844g<AbstractC41149b, C41150c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38653a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final HomeComponentDismissApi homeComponentDismissApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34659c ltoDismissStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: zu1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {192, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f177468E;

        /* JADX INFO: renamed from: F */
        Object f177469F;

        /* JADX INFO: renamed from: G */
        Object f177470G;

        /* JADX INFO: renamed from: H */
        int f177471H;

        /* JADX INFO: renamed from: w */
        int f177472w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177473x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177474y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C41151d f177475z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C41151d c41151d) {
            super(3, interfaceC30057d);
            this.f177475z = c41151d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC41149b abstractC41149b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f177475z);
            aVar.f177473x = interfaceC13062m;
            aVar.f177474y = abstractC41149b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
        
            if (r14 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r14, r13) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r13.f177472w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L34
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r13.f177473x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r10 = r13
                goto L94
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                java.lang.Object r1 = r13.f177470G
                zu1.b r1 = (zu1.AbstractC41149b) r1
                java.lang.Object r1 = r13.f177469F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r13.f177468E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r13.f177473x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r14)
                r10 = r13
                goto L6a
            L34:
                p505ts.AbstractC34132o.m107864I(r14)
                java.lang.Object r14 = r13.f177473x
                r1 = r14
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r14 = r13.f177474y
                zu1.b r14 = (zu1.AbstractC41149b) r14
                boolean r5 = r14 instanceof zu1.AbstractC41149b.b
                if (r5 == 0) goto L76
                zu1.d r6 = r13.f177475z
                zu1.b$b r14 = (zu1.AbstractC41149b.b) r14
                java.lang.String r8 = r14.getOfferId()
                java.lang.String r9 = r14.getSource()
                r13.f177473x = r4
                r13.f177474y = r4
                r13.f177468E = r1
                r13.f177469F = r4
                r13.f177470G = r4
                r14 = 0
                r13.f177471H = r14
                r13.f177472w = r3
                r7 = 0
                r11 = 1
                r12 = 0
                r10 = r13
                java.lang.Object r14 = zu1.C41151d.m133680l(r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L6a
                goto L93
            L6a:
                ec3.l r14 = (ec3.InterfaceC13058l) r14
                zu1.d$e r3 = new zu1.d$e
                r3.<init>(r4)
                fc3.k r14 = ec3.AbstractC13091v.m36590P(r14, r3)
                goto L81
            L76:
                r10 = r13
                zu1.d$c r3 = new zu1.d$c
                r3.<init>(r14, r4)
                ec3.s1 r14 = new ec3.s1
                r14.<init>(r3)
            L81:
                r10.f177473x = r4
                r10.f177474y = r4
                r10.f177468E = r4
                r10.f177469F = r4
                r10.f177470G = r4
                r10.f177472w = r2
                java.lang.Object r14 = ec3.AbstractC13091v.m36613w(r1, r14, r13)
                if (r14 != r0) goto L94
            L93:
                return r0
            L94:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: zu1.C41151d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC41149b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zu1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$interact$1$1$1", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzu1/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177476w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177477x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C41150c f177478y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C41150c c41150c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177478y = c41150c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f177478y, interfaceC30057d);
            bVar.f177477x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177477x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177476w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC41152e.a aVar = new AbstractC41152e.a(this.f177478y);
                this.f177477x = null;
                this.f177476w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zu1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$interact$1$4", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzu1/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177479w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177480x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC41149b f177481y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC41149b abstractC41149b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177481y = abstractC41149b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f177481y, interfaceC30057d);
            cVar.f177480x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177480x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177479w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC41152e.b bVar = new AbstractC41152e.b(this.f177481y);
                this.f177480x = null;
                this.f177479w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zu1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$interact$2", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lzu1/c;", "previousState", "Lzu1/e;", "action", "<anonymous>", "(Lzu1/c;Lzu1/e;)Lzu1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177482w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f177483x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177484y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C41150c c41150c, AbstractC41152e abstractC41152e, InterfaceC30057d<? super C41150c> interfaceC30057d) {
            d dVar = C41151d.this.new d(interfaceC30057d);
            dVar.f177483x = c41150c;
            dVar.f177484y = abstractC41152e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C41150c c41150c = (C41150c) this.f177483x;
            AbstractC41152e abstractC41152e = (AbstractC41152e) this.f177484y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f177482w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC41152e instanceof AbstractC41152e.b) {
                return C41151d.this.m133677i(c41150c, ((AbstractC41152e.b) abstractC41152e).getDomainAction());
            }
            if (abstractC41152e instanceof AbstractC41152e.a) {
                return ((AbstractC41152e.a) abstractC41152e).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: zu1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177486w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177487x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177488y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C41150c c41150c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f177487x = interfaceC13062m;
            eVar.f177488y = c41150c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177486w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177487x;
                C13084s1 c13084s1 = new C13084s1(new b((C41150c) this.f177488y, null));
                this.f177487x = null;
                this.f177488y = null;
                this.f177486w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C41150c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zu1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$loadLimitedTimeOfferCache$$inlined$cacheAPI$1", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177489w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177490x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177491y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f177492z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f177492z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f177492z);
            fVar.f177490x = interfaceC13062m;
            fVar.f177491y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177489w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177490x;
                C26832c c26832c = (C26832c) this.f177491y;
                InterfaceC26834e interfaceC26834e = this.f177492z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LimitedTimeOfferModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(LimitedTimeOfferModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f177490x = null;
                this.f177491y = null;
                this.f177489w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zu1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C41151d f177493E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f177494w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f177495x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f177496y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f177497z;

        /* JADX INFO: renamed from: zu1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C41151d f177498E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f177499w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f177500x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f177501y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f177502z;

            /* JADX INFO: renamed from: zu1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$loadLimitedTimeOfferCache$$inlined$map$1$2", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42775a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f177503E;

                /* JADX INFO: renamed from: F */
                Object f177504F;

                /* JADX INFO: renamed from: G */
                Object f177505G;

                /* JADX INFO: renamed from: H */
                int f177506H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f177507w;

                /* JADX INFO: renamed from: x */
                int f177508x;

                /* JADX INFO: renamed from: y */
                Object f177509y;

                public C42775a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f177507w = obj;
                    this.f177508x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, String str2, boolean z4, C41151d c41151d) {
                this.f177499w = interfaceC13062m;
                this.f177500x = str;
                this.f177501y = str2;
                this.f177502z = z4;
                this.f177498E = c41151d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42775a c42775a;
                C41150c c41150cM133678j;
                C41150c c41150c;
                if (interfaceC30057d instanceof C42775a) {
                    c42775a = (C42775a) interfaceC30057d;
                    int i13 = c42775a.f177508x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42775a.f177508x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42775a = new C42775a(interfaceC30057d);
                    }
                } else {
                    c42775a = new C42775a(interfaceC30057d);
                }
                Object obj2 = c42775a.f177507w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42775a.f177508x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f177499w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c41150cM133678j = new C41150c(this.f177500x, this.f177501y, InterfaceC41148a.b.f177446a, null, null, false, false, 120, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            c41150c = new C41150c(this.f177500x, this.f177501y, null, (LimitedTimeOfferModels) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), null, this.f177502z, true, 20, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            if (!this.f177502z) {
                                this.f177498E.analyticsHelper.m123907b(new InterfaceC11144a.h(this.f177500x, this.f177501y, this.f177498E.m133676h(((LimitedTimeOfferModels) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData()).getSections())));
                            }
                            String str = this.f177500x;
                            String str2 = this.f177501y;
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            LimitedTimeOfferModels limitedTimeOfferModels = (LimitedTimeOfferModels) c42173a.getData();
                            String preSelectedId = ((LimitedTimeOfferModels) c42173a.getData()).getPreSelectedId();
                            if (preSelectedId == null) {
                                preSelectedId = "";
                            }
                            c41150cM133678j = new C41150c(str, str2, null, limitedTimeOfferModels, preSelectedId, false, false, 100, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            c41150c = new C41150c(this.f177500x, this.f177501y, null, (LimitedTimeOfferModels) ((InterfaceC29354a.d) interfaceC29354a).getData(), null, false, false, 116, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c41150cM133678j = this.f177498E.m133678j((InterfaceC29354a.c) interfaceC29354a, this.f177501y, this.f177500x);
                        }
                        c41150cM133678j = c41150c;
                    }
                    c42775a.f177509y = null;
                    c42775a.f177503E = null;
                    c42775a.f177504F = null;
                    c42775a.f177505G = null;
                    c42775a.f177506H = 0;
                    c42775a.f177508x = 1;
                    if (interfaceC13062m.emit(c41150cM133678j, c42775a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, String str2, boolean z4, C41151d c41151d) {
            this.f177494w = interfaceC13058l;
            this.f177495x = str;
            this.f177496y = str2;
            this.f177497z = z4;
            this.f177493E = c41151d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f177494w.collect(new a(interfaceC13062m, this.f177495x, this.f177496y, this.f177497z, this.f177493E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zu1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor", m100430f = "LimitedTimeOfferInteractor.kt", m100431l = {108}, m100432m = "loadLimitedTimeOfferCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f177512F;

        /* JADX INFO: renamed from: w */
        boolean f177513w;

        /* JADX INFO: renamed from: x */
        Object f177514x;

        /* JADX INFO: renamed from: y */
        Object f177515y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f177516z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f177516z = obj;
            this.f177512F |= Integer.MIN_VALUE;
            return C41151d.this.m133679k(false, null, null, this);
        }
    }

    public C41151d(InterfaceC26834e cachedApiSource, InterfaceC40205a userInfoAccessor, C38653a analyticsHelper, HomeComponentDismissApi homeComponentDismissApi, C34659c ltoDismissStore, InterfaceC34116n logger, Clock clock) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(homeComponentDismissApi, "homeComponentDismissApi");
        AbstractC22676k.m65750j(ltoDismissStore, "ltoDismissStore");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(clock, "clock");
        this.cachedApiSource = cachedApiSource;
        this.userInfoAccessor = userInfoAccessor;
        this.analyticsHelper = analyticsHelper;
        this.homeComponentDismissApi = homeComponentDismissApi;
        this.ltoDismissStore = ltoDismissStore;
        this.logger = logger;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final String m133676h(List<LimitedTimeOfferSectionModel> sections) {
        DesignSystemModel timerMetadata;
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            for (DesignSystemModel designSystemModel : ((LimitedTimeOfferSectionModel) it.next()).getItems()) {
                if ((designSystemModel instanceof TimerPillModel) && (timerMetadata = ((TimerPillModel) designSystemModel).getTimerMetadata()) != null) {
                    return m133681m(((TimerMetaDataModel) timerMetadata).getExpireTime());
                }
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C41150c m133677i(C41150c previousState, AbstractC41149b action) {
        if ((action instanceof AbstractC41149b.b) || !(action instanceof AbstractC41149b.a)) {
            return previousState;
        }
        AbstractC41149b.a aVar = (AbstractC41149b.a) action;
        String selectedCardId = aVar.getSelectedCardId();
        LimitedTimeOfferModels response = previousState.getResponse();
        return C41150c.m133662b(previousState, null, null, null, response != null ? LimitedTimeOfferModels.copy$default(response, null, null, null, m133682n(aVar.getSelectedCardId(), previousState.getResponse().getSections()), null, null, 55, null) : null, selectedCardId, false, false, 103, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C41150c m133678j(InterfaceC29354a.c<LimitedTimeOfferModels> cacheResult, String offerId, String source) {
        return AbstractC29355b.m89462a(cacheResult) ? new C41150c(source, offerId, new InterfaceC41148a.d(offerId, source), null, null, false, false, 120, null) : new C41150c(source, offerId, new InterfaceC41148a.c(offerId, source), null, null, false, false, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m133679k(boolean z4, String str, String str2, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f177512F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f177512F = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objMo129089c = hVar.f177516z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f177512F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            hVar.f177514x = str;
            hVar.f177515y = str2;
            hVar.f177513w = z4;
            hVar.f177512F = 1;
            objMo129089c = interfaceC40205a.mo129089c(hVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = hVar.f177513w;
            str2 = (String) hVar.f177515y;
            str = (String) hVar.f177514x;
            AbstractC34132o.m107864I(objMo129089c);
        }
        String str3 = str;
        User user = (User) objMo129089c;
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetLimitedTimeOfferRequest(String.valueOf(user != null ? user.getId() : 0), str3), 1), AbstractC12350b.m34570S("LimitedTimeOffer_SCOPE"), null, 2, null), new f(null, this.cachedApiSource)), str2, str3, z4, this);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m133680l(C41151d c41151d, boolean z4, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c41151d.m133679k(z4, str, str2, interfaceC30057d);
    }

    /* JADX INFO: renamed from: m */
    private final String m133681m(String dateString) {
        Duration durationBetween = Duration.between(LocalDateTime.now(this.clock), LocalDateTime.parse(dateString, new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd'T'HH:mm:ss").optionalStart().appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true).optionalEnd().optionalStart().appendOffset("+HHMM", "Z").optionalStart().appendOffset("+HH:MM", "Z").optionalEnd().toFormatter()));
        if (durationBetween.isNegative()) {
            return "00:00:00";
        }
        return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(durationBetween.toHours()), Integer.valueOf(DesugarDuration.toMinutesPart(durationBetween)), Integer.valueOf(DesugarDuration.toSecondsPart(durationBetween))}, 3));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C41150c(null, null, InterfaceC41148a.b.f177446a, null, null, false, false, 123, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }

    /* JADX INFO: renamed from: n */
    public final List<LimitedTimeOfferSectionModel> m133682n(String selectedSegmentId, List<LimitedTimeOfferSectionModel> sections) {
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        AbstractC22676k.m65750j(sections, "sections");
        ArrayList arrayList = new ArrayList();
        for (LimitedTimeOfferSectionModel limitedTimeOfferSectionModel : sections) {
            ArrayList arrayList2 = new ArrayList();
            for (DesignSystemModel designSystemModel : limitedTimeOfferSectionModel.getItems()) {
                if (designSystemModel instanceof PricingSelectionCardModel) {
                    PricingSelectionCardModel pricingSelectionCardModel = (PricingSelectionCardModel) designSystemModel;
                    arrayList2.add(PricingSelectionCardModel.copy$default(pricingSelectionCardModel, null, null, null, null, null, null, null, null, null, AbstractC22676k.m65745e(pricingSelectionCardModel.getId(), selectedSegmentId) ? "CURRENT_WITH_CHECKMARK" : "DEFAULT", null, null, 3583, null));
                } else {
                    arrayList2.add(designSystemModel);
                }
            }
            arrayList.add(new LimitedTimeOfferSectionModel(arrayList2, limitedTimeOfferSectionModel.getSectionType()));
        }
        return arrayList;
    }

    public /* synthetic */ C41151d(InterfaceC26834e interfaceC26834e, InterfaceC40205a interfaceC40205a, C38653a c38653a, HomeComponentDismissApi homeComponentDismissApi, C34659c c34659c, InterfaceC34116n interfaceC34116n, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, interfaceC40205a, c38653a, homeComponentDismissApi, c34659c, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LimitedTimeOfferInteractor") : interfaceC34116n, clock);
    }
}
