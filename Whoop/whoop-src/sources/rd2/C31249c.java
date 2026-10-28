package rd2;

import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdNotificationHistoryResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import fi0.InterfaceC14515a;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import xm0.C38458b;

/* JADX INFO: renamed from: rd2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lrd2/c;", "", "Lcom/whoop/shepherd/domain/ShepherdApi;", "api", "Ltr2/n;", "logger", "Lxm0/b;", "cacheUpdater", "Lfi0/a;", "analytics", "<init>", "(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;Lxm0/b;Lfi0/a;)V", "Lrd2/b;", "domainState", "", "historyDate", "f", "(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "e", "Lec3/l;", "Lrd2/a;", "upstream", "g", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/shepherd/domain/ShepherdApi;", "b", "Ltr2/n;", "c", "Lxm0/b;", "d", "Lfi0/a;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31249c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShepherdApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: rd2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor", m100430f = "ShepherdHistoryDetailInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 81}, m100432m = "clearHistoryByDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f128720E;

        /* JADX INFO: renamed from: F */
        int f128721F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f128722G;

        /* JADX INFO: renamed from: I */
        int f128724I;

        /* JADX INFO: renamed from: w */
        Object f128725w;

        /* JADX INFO: renamed from: x */
        Object f128726x;

        /* JADX INFO: renamed from: y */
        Object f128727y;

        /* JADX INFO: renamed from: z */
        Object f128728z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f128722G = obj;
            this.f128724I |= Integer.MIN_VALUE;
            return C31249c.this.m96267e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: rd2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor$clearHistoryByDate$2$1", m100430f = "ShepherdHistoryDetailInteractor.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f128729w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f128731y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f128731y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31249c.this.new b(this.f128731y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128729w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C31249c.this.api;
            String str = this.f128731y;
            this.f128729w = 1;
            Object objClearHistoryByDate = shepherdApi.clearHistoryByDate(str, this);
            return objClearHistoryByDate == enumC31071a ? enumC31071a : objClearHistoryByDate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rd2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor", m100430f = "ShepherdHistoryDetailInteractor.kt", m100431l = {58}, m100432m = "fetchShepherdHistoryDetailData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f128732E;

        /* JADX INFO: renamed from: F */
        int f128733F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f128734G;

        /* JADX INFO: renamed from: I */
        int f128736I;

        /* JADX INFO: renamed from: w */
        Object f128737w;

        /* JADX INFO: renamed from: x */
        Object f128738x;

        /* JADX INFO: renamed from: y */
        Object f128739y;

        /* JADX INFO: renamed from: z */
        Object f128740z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f128734G = obj;
            this.f128736I |= Integer.MIN_VALUE;
            return C31249c.this.m96268f(null, null, this);
        }
    }

    /* JADX INFO: renamed from: rd2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor$fetchShepherdHistoryDetailData$2$1$1", m100430f = "ShepherdHistoryDetailInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f128741w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f128743y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f128743y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31249c.this.new d(this.f128743y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128741w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C31249c.this.api;
            String str = this.f128743y;
            this.f128741w = 1;
            Object shepherdHistoryDetail = shepherdApi.getShepherdHistoryDetail(str, this);
            return shepherdHistoryDetail == enumC31071a ? enumC31071a : shepherdHistoryDetail;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdHistoryDetailResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rd2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor$interact$1", m100430f = "ShepherdHistoryDetailInteractor.kt", m100431l = {25, 51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lrd2/b;", "prevDomainState", "Lrd2/a;", "domainAction", "<anonymous>", "(Lrd2/b;Lrd2/a;)Lrd2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f128744w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f128745x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f128746y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C31248b c31248b, InterfaceC31247a interfaceC31247a, InterfaceC30057d<? super C31248b> interfaceC30057d) {
            e eVar = C31249c.this.new e(interfaceC30057d);
            eVar.f128745x = c31248b;
            eVar.f128746y = interfaceC31247a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r8 == r2) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (r8 == r2) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f128745x
                rd2.b r0 = (rd2.C31248b) r0
                java.lang.Object r1 = r7.f128746y
                rd2.a r1 = (rd2.InterfaceC31247a) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r7.f128744w
                r4 = 1
                r5 = 2
                if (r3 == 0) goto L25
                if (r3 == r4) goto L21
                if (r3 != r5) goto L19
                p505ts.AbstractC34132o.m107864I(r8)
                goto Laa
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L42
            L25:
                p505ts.AbstractC34132o.m107864I(r8)
                boolean r8 = r1 instanceof rd2.InterfaceC31247a.d
                r3 = 0
                if (r8 == 0) goto L45
                rd2.c r8 = rd2.C31249c.this
                rd2.a$d r1 = (rd2.InterfaceC31247a.d) r1
                java.lang.String r1 = r1.getHistoryDate()
                r7.f128745x = r3
                r7.f128746y = r3
                r7.f128744w = r4
                java.lang.Object r8 = rd2.C31249c.m96264b(r8, r0, r1, r7)
                if (r8 != r2) goto L42
                goto La9
            L42:
                rd2.b r8 = (rd2.C31248b) r8
                return r8
            L45:
                rd2.a$c r8 = rd2.InterfaceC31247a.c.f128711a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r8)
                java.lang.String r4 = "Clear Date History"
                java.lang.String r6 = "ANF"
                if (r8 == 0) goto L63
                rd2.c r8 = rd2.C31249c.this
                fi0.a r8 = rd2.C31249c.m96265c(r8)
                java.lang.String r1 = "Click"
                r8.mo41424f(r6, r1, r4, r6)
                rd2.e$a r8 = rd2.InterfaceC31251e.a.f128748a
                rd2.b r8 = rd2.C31248b.m96259b(r0, r8, r3, r5, r3)
                return r8
            L63:
                rd2.a$b r8 = rd2.InterfaceC31247a.b.f128710a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r8)
                if (r8 == 0) goto L72
                rd2.e$d r8 = rd2.InterfaceC31251e.d.f128751a
                rd2.b r8 = rd2.C31248b.m96259b(r0, r8, r3, r5, r3)
                return r8
            L72:
                boolean r8 = r1 instanceof rd2.InterfaceC31247a.e
                if (r8 == 0) goto L91
                rd2.c r8 = rd2.C31249c.this
                fi0.a r8 = rd2.C31249c.m96265c(r8)
                java.lang.String r2 = "Confirm"
                r8.mo41424f(r6, r2, r4, r6)
                rd2.e$f r8 = new rd2.e$f
                rd2.a$e r1 = (rd2.InterfaceC31247a.e) r1
                java.lang.String r1 = r1.getHistoryDate()
                r8.<init>(r1)
                rd2.b r8 = rd2.C31248b.m96259b(r0, r8, r3, r5, r3)
                return r8
            L91:
                boolean r8 = r1 instanceof rd2.InterfaceC31247a.a
                if (r8 == 0) goto Lad
                rd2.c r8 = rd2.C31249c.this
                rd2.a$a r1 = (rd2.InterfaceC31247a.a) r1
                java.lang.String r1 = r1.getHistoryDate()
                r7.f128745x = r3
                r7.f128746y = r3
                r7.f128744w = r5
                java.lang.Object r8 = rd2.C31249c.m96263a(r8, r0, r1, r7)
                if (r8 != r2) goto Laa
            La9:
                return r2
            Laa:
                rd2.b r8 = (rd2.C31248b) r8
                return r8
            Lad:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rd2.C31249c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C31249c(ShepherdApi api, InterfaceC34116n logger, C38458b cacheUpdater, InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.api = api;
        this.logger = logger;
        this.cacheUpdater = cacheUpdater;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: e */
    public final Object m96267e(C31248b c31248b, String str, InterfaceC30057d<? super C31248b> interfaceC30057d) {
        a aVar;
        C31248b c31248b2;
        Object obj;
        int i13;
        C31248b c31248b3;
        C31248b c31248bM96259b;
        String str2 = str;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f128724I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f128724I = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj2 = aVar2.f128722G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar2.f128724I;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj2);
            String strM96271a = AbstractC31250d.m96271a(str2, this.logger);
            if (strM96271a != null) {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                String strM30461o = AbstractC11266d.m30461o("Failed to delete arrhythmia history by date: ", str2);
                b bVar = new b(strM96271a, null);
                c31248b2 = c31248b;
                aVar2.f128725w = c31248b2;
                aVar2.f128726x = str2;
                aVar2.f128727y = null;
                aVar2.f128720E = 0;
                aVar2.f128724I = 1;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, bVar, aVar2, 2, null);
                if (objM108729b != enumC31071a) {
                    obj = objM108729b;
                    i13 = 0;
                }
                return enumC31071a;
            }
            c31248b2 = c31248b;
            return C31248b.m96259b(c31248b2, new InterfaceC31251e.b(str2), null, 2, null);
        }
        if (i15 == 1) {
            int i16 = aVar2.f128720E;
            String str3 = (String) aVar2.f128726x;
            C31248b c31248b4 = (C31248b) aVar2.f128725w;
            AbstractC34132o.m107864I(obj2);
            i13 = i16;
            str2 = str3;
            obj = obj2;
            c31248b2 = c31248b4;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) aVar2.f128726x;
            c31248b3 = (C31248b) aVar2.f128725w;
            AbstractC34132o.m107864I(obj2);
        }
        C31248b c31248b5 = c31248b3;
        c31248bM96259b = c31248b3.m96260a(InterfaceC31251e.g.f128754a, null);
        c31248b2 = c31248b5;
        if (c31248bM96259b != null) {
            return c31248bM96259b;
        }
        return C31248b.m96259b(c31248b2, new InterfaceC31251e.b(str2), null, 2, null);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            C38458b c38458b = this.cacheUpdater;
            aVar2.f128725w = c31248b2;
            aVar2.f128726x = str2;
            aVar2.f128727y = null;
            aVar2.f128728z = null;
            aVar2.f128720E = i13;
            aVar2.f128721F = 0;
            aVar2.f128724I = 2;
            if (c38458b.m123247a("shepherdrefreshscope", aVar2) != enumC31071a) {
                c31248b3 = c31248b2;
                C31248b c31248b6 = c31248b3;
                c31248bM96259b = c31248b3.m96260a(InterfaceC31251e.g.f128754a, null);
                c31248b2 = c31248b6;
            }
            return enumC31071a;
        }
        c31248bM96259b = C31248b.m96259b(c31248b2, new InterfaceC31251e.b(str2), null, 2, null);
        if (c31248bM96259b != null) {
            return c31248bM96259b;
        }
        return C31248b.m96259b(c31248b2, new InterfaceC31251e.b(str2), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[PHI: r12
      0x009d: PHI (r12v1 rd2.b) = (r12v0 rd2.b), (r12v5 rd2.b) binds: [B:18:0x004e, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m96268f(C31248b c31248b, String str, InterfaceC30057d<? super C31248b> interfaceC30057d) {
        c cVar;
        C31248b c31248bM96259b;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f128736I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f128736I = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f128734G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f128736I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (str != null) {
                String strM96271a = AbstractC31250d.m96271a(str, this.logger);
                if (strM96271a != null) {
                    InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n = this.logger;
                    d dVar = new d(strM96271a, null);
                    cVar2.f128737w = c31248b;
                    cVar2.f128738x = null;
                    cVar2.f128739y = null;
                    cVar2.f128740z = null;
                    cVar2.f128732E = 0;
                    cVar2.f128733F = 0;
                    cVar2.f128736I = 1;
                    objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch history detail data.", dVar, cVar2, 2, null);
                    if (objM108729b == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    c31248bM96259b = C31248b.m96259b(c31248b, InterfaceC31251e.c.f128750a, null, 2, null);
                }
                if (c31248bM96259b != null) {
                    return c31248bM96259b;
                }
            }
            return C31248b.m96259b(c31248b, InterfaceC31251e.c.f128750a, null, 2, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c31248b = (C31248b) cVar2.f128737w;
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            c31248bM96259b = c31248b.m96260a(InterfaceC31251e.d.f128751a, (ShepherdHistoryDetailResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c31248bM96259b = C31248b.m96259b(c31248b, InterfaceC31251e.c.f128750a, null, 2, null);
        }
        if (c31248bM96259b == null) {
            c31248bM96259b = C31248b.m96259b(c31248b, InterfaceC31251e.c.f128750a, null, 2, null);
        }
        if (c31248bM96259b != null) {
            return c31248bM96259b;
        }
        return C31248b.m96259b(c31248b, InterfaceC31251e.c.f128750a, null, 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m96269g(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C31248b(InterfaceC31251e.e.f128752a, null, 2, null), upstream, new e(null));
    }
}
