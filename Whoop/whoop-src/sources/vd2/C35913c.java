package vd2;

import c93.InterfaceC4351m;
import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdHistoryResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdNotificationHistoryResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdPaginatedHistoryResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rd2.AbstractC31250d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import xm0.C38458b;

/* JADX INFO: renamed from: vd2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\r\u001a\u00020\f*\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\f*\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0012J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lvd2/c;", "", "Lcom/whoop/shepherd/domain/ShepherdApi;", "api", "Lfi0/a;", "analytics", "Lxm0/b;", "cacheUpdater", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/shepherd/domain/ShepherdApi;Lfi0/a;Lxm0/b;Ltr2/n;)V", "Lvd2/b;", "j", "(Lvd2/b;Lq83/d;)Ljava/lang/Object;", "", "nextToken", "i", "(Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "g", "domainState", "historyDate", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/l;", "Lvd2/a;", "upstream", "k", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/shepherd/domain/ShepherdApi;", "b", "Lfi0/a;", "c", "Lxm0/b;", "d", "Ltr2/n;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35913c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShepherdApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vd2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {126, 131}, m100432m = "clearAllShepherdHistory", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f152922F;

        /* JADX INFO: renamed from: w */
        Object f152923w;

        /* JADX INFO: renamed from: x */
        Object f152924x;

        /* JADX INFO: renamed from: y */
        int f152925y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f152926z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152926z = obj;
            this.f152922F |= Integer.MIN_VALUE;
            return C35913c.this.m114088g(null, this);
        }
    }

    /* JADX INFO: renamed from: vd2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$clearAllShepherdHistory$2", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {127}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f152927w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35913c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152927w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C35913c.this.api;
            this.f152927w = 1;
            Object objClearAllHistory = shepherdApi.clearAllHistory(this);
            return objClearAllHistory == enumC31071a ? enumC31071a : objClearAllHistory;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vd2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {143, 149}, m100432m = "clearHistoryByDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f152929E;

        /* JADX INFO: renamed from: F */
        int f152930F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f152931G;

        /* JADX INFO: renamed from: I */
        int f152933I;

        /* JADX INFO: renamed from: w */
        Object f152934w;

        /* JADX INFO: renamed from: x */
        Object f152935x;

        /* JADX INFO: renamed from: y */
        Object f152936y;

        /* JADX INFO: renamed from: z */
        Object f152937z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152931G = obj;
            this.f152933I |= Integer.MIN_VALUE;
            return C35913c.this.m114089h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vd2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$clearHistoryByDate$2$1", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {144}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f152938w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f152940y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f152940y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35913c.this.new d(this.f152940y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152938w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C35913c.this.api;
            String str = this.f152940y;
            this.f152938w = 1;
            Object objClearHistoryByDate = shepherdApi.clearHistoryByDate(str, this);
            return objClearHistoryByDate == enumC31071a ? enumC31071a : objClearHistoryByDate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vd2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {104}, m100432m = "fetchShepherdHistory", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f152941E;

        /* JADX INFO: renamed from: w */
        Object f152942w;

        /* JADX INFO: renamed from: x */
        Object f152943x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152944y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152944y = obj;
            this.f152941E |= Integer.MIN_VALUE;
            return C35913c.this.m114090i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vd2.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$fetchShepherdHistory$2", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f152946w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f152948y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f152948y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35913c.this.new f(this.f152948y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152946w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C35913c.this.api;
            String str = this.f152948y;
            this.f152946w = 1;
            Object shepherdHistory = shepherdApi.getShepherdHistory(str, this);
            return shepherdHistory == enumC31071a ? enumC31071a : shepherdHistory;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdPaginatedHistoryResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vd2.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {92}, m100432m = "fetchShepherdSettingsData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f152949w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152950x;

        /* JADX INFO: renamed from: z */
        int f152952z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152950x = obj;
            this.f152952z |= Integer.MIN_VALUE;
            return C35913c.this.m114091j(null, this);
        }
    }

    /* JADX INFO: renamed from: vd2.c$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$fetchShepherdSettingsData$2", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f152953w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35913c.this.new h(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152953w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C35913c.this.api;
            this.f152953w = 1;
            Object shepherdNotificationHistory = shepherdApi.getShepherdNotificationHistory(this);
            return shepherdNotificationHistory == enumC31071a ? enumC31071a : shepherdNotificationHistory;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vd2.c$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$interact$1", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {29, 32, 55, 78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvd2/b;", "prevDomainState", "Lvd2/a;", "domainAction", "<anonymous>", "(Lvd2/b;Lvd2/a;)Lvd2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f152955w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152956x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152957y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C35912b c35912b, InterfaceC35911a interfaceC35911a, InterfaceC30057d<? super C35912b> interfaceC30057d) {
            i iVar = C35913c.this.new i(interfaceC30057d);
            iVar.f152956x = c35912b;
            iVar.f152957y = interfaceC35911a;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r11 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        
            if (r11 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
        
            if (r11 == r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
        
            if (r11 == r2) goto L63;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vd2.C35913c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vd2.c$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$interact$2", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lvd2/b;", "domainState", "Lec3/l;", "<anonymous>", "(Lvd2/b;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152959w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152960x;

        /* JADX INFO: renamed from: vd2.c$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$interact$2$1", m100430f = "ShepherdNotificationHistoryInteractor.kt", m100431l = {83, 84, 85}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvd2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f152961w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f152962x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C35912b f152963y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35912b c35912b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f152963y = c35912b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f152963y, interfaceC30057d);
                aVar.f152962x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
            
                if (r0.emit(r12, r11) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = r11.f152962x
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r11.f152961w
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L27
                    if (r2 == r5) goto L23
                    if (r2 == r4) goto L1f
                    if (r2 != r3) goto L17
                    p505ts.AbstractC34132o.m107864I(r12)
                    goto L5d
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    p505ts.AbstractC34132o.m107864I(r12)
                    goto L44
                L23:
                    p505ts.AbstractC34132o.m107864I(r12)
                    goto L37
                L27:
                    p505ts.AbstractC34132o.m107864I(r12)
                    vd2.b r12 = r11.f152963y
                    r11.f152962x = r0
                    r11.f152961w = r5
                    java.lang.Object r12 = r0.emit(r12, r11)
                    if (r12 != r1) goto L37
                    goto L5c
                L37:
                    r11.f152962x = r0
                    r11.f152961w = r4
                    r4 = 500(0x1f4, double:2.47E-321)
                    java.lang.Object r12 = bc3.AbstractC3034m0.m8782b(r4, r11)
                    if (r12 != r1) goto L44
                    goto L5c
                L44:
                    vd2.b r4 = r11.f152963y
                    r9 = 11
                    r10 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    vd2.b r12 = vd2.C35912b.m114077b(r4, r5, r6, r7, r8, r9, r10)
                    r2 = 0
                    r11.f152962x = r2
                    r11.f152961w = r3
                    java.lang.Object r12 = r0.emit(r12, r11)
                    if (r12 != r1) goto L5d
                L5c:
                    return r1
                L5d:
                    l83.a0 r12 = l83.C23454a0.f92919a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: vd2.C35913c.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f152960x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C35912b c35912b, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((j) create(c35912b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C35912b c35912b = (C35912b) this.f152960x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152959w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c35912b.getIsLoadingMoreHistory() ? new C13084s1(new a(c35912b, null)) : new C0456u(c35912b, 1);
        }
    }

    public C35913c(ShepherdApi api, InterfaceC14515a analytics, C38458b cacheUpdater, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.analytics = analytics;
        this.cacheUpdater = cacheUpdater;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: g */
    public final Object m114088g(C35912b c35912b, InterfaceC30057d<? super C35912b> interfaceC30057d) {
        a aVar;
        C35912b c35912b2;
        InterfaceC34385a interfaceC34385a;
        C35912b c35912b3;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f152922F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f152922F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f152926z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f152922F;
        if (i14 != 0) {
            if (i14 == 1) {
                C35912b c35912b4 = (C35912b) aVar2.f152923w;
                AbstractC34132o.m107864I(objM108729b);
                c35912b2 = c35912b4;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34385a = (InterfaceC34385a) aVar2.f152924x;
                c35912b3 = (C35912b) aVar2.f152923w;
                AbstractC34132o.m107864I(objM108729b);
            }
            return C35912b.m114077b(c35912b3, InterfaceC35914d.j.f152973a, (ShepherdNotificationHistoryResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, null, 12, null);
        }
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        b bVar = new b(null);
        c35912b2 = c35912b;
        aVar2.f152923w = c35912b2;
        aVar2.f152922F = 1;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to delete all arrhythmia history", bVar, aVar2, 2, null);
        if (objM108729b != enumC31071a) {
        }
        return enumC31071a;
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a2 instanceof InterfaceC34385a.b) {
                return C35912b.m114077b(c35912b2, InterfaceC35914d.c.f152966a, null, false, null, 14, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        C38458b c38458b = this.cacheUpdater;
        aVar2.f152923w = c35912b2;
        aVar2.f152924x = interfaceC34385a2;
        aVar2.f152925y = 0;
        aVar2.f152922F = 2;
        if (c38458b.m123247a("shepherdrefreshscope", aVar2) != enumC31071a) {
            interfaceC34385a = interfaceC34385a2;
            c35912b3 = c35912b2;
            return C35912b.m114077b(c35912b3, InterfaceC35914d.j.f152973a, (ShepherdNotificationHistoryResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, null, 12, null);
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: h */
    public final Object m114089h(C35912b c35912b, String str, InterfaceC30057d<? super C35912b> interfaceC30057d) {
        c cVar;
        C35912b c35912b2;
        Object objM108729b;
        C35912b c35912b3;
        int i13;
        C35912b c35912b4;
        C35912b c35912bM114077b;
        String str2 = str;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f152933I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f152933I = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f152931G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = cVar2.f152933I;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            String strM96271a = AbstractC31250d.m96271a(str2, this.logger);
            if (strM96271a != null) {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                String strM30461o = AbstractC11266d.m30461o("Failed to delete arrhythmia history by date: ", str2);
                d dVar = new d(strM96271a, null);
                cVar2.f152934w = c35912b;
                cVar2.f152935x = str2;
                cVar2.f152936y = null;
                cVar2.f152929E = 0;
                cVar2.f152933I = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, dVar, cVar2, 2, null);
                if (objM108729b != enumC31071a) {
                    c35912b3 = c35912b;
                    i13 = 0;
                }
                return enumC31071a;
            }
            c35912b2 = c35912b;
            return C35912b.m114077b(c35912b2, new InterfaceC35914d.d(str2), null, false, null, 14, null);
        }
        if (i15 == 1) {
            int i16 = cVar2.f152929E;
            String str3 = (String) cVar2.f152935x;
            C35912b c35912b5 = (C35912b) cVar2.f152934w;
            AbstractC34132o.m107864I(obj);
            i13 = i16;
            str2 = str3;
            objM108729b = obj;
            c35912b3 = c35912b5;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) cVar2.f152935x;
            C35912b c35912b6 = (C35912b) cVar2.f152934w;
            AbstractC34132o.m107864I(obj);
            c35912b4 = c35912b6;
        }
        c35912b3 = c35912b4;
        c35912bM114077b = C35912b.m114077b(c35912b4, InterfaceC35914d.j.f152973a, null, false, null, 14, null);
        if (c35912bM114077b == null) {
            return c35912bM114077b;
        }
        c35912b2 = c35912b3;
        return C35912b.m114077b(c35912b2, new InterfaceC35914d.d(str2), null, false, null, 14, null);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            C38458b c38458b = this.cacheUpdater;
            cVar2.f152934w = c35912b3;
            cVar2.f152935x = str2;
            cVar2.f152936y = null;
            cVar2.f152937z = null;
            cVar2.f152929E = i13;
            cVar2.f152930F = 0;
            cVar2.f152933I = 2;
            if (c38458b.m123247a("shepherdrefreshscope", cVar2) != enumC31071a) {
                c35912b4 = c35912b3;
                c35912b3 = c35912b4;
                c35912bM114077b = C35912b.m114077b(c35912b4, InterfaceC35914d.j.f152973a, null, false, null, 14, null);
            }
            return enumC31071a;
        }
        c35912bM114077b = C35912b.m114077b(c35912b3, new InterfaceC35914d.d(str2), null, false, null, 14, null);
        if (c35912bM114077b == null) {
            return c35912bM114077b;
        }
        c35912b2 = c35912b3;
        return C35912b.m114077b(c35912b2, new InterfaceC35914d.d(str2), null, false, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final Object m114090i(C35912b c35912b, String str, InterfaceC30057d<? super C35912b> interfaceC30057d) {
        e eVar;
        C35912b c35912b2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f152941E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f152941E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f152944y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f152941E;
        Object objCopy$default = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(str, null);
            eVar2.f152942w = c35912b;
            eVar2.f152943x = null;
            eVar2.f152941E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch arrhythmia history", fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c35912b2 = c35912b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C35912b c35912b3 = (C35912b) eVar2.f152942w;
            AbstractC34132o.m107864I(objM108729b);
            c35912b2 = c35912b3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C35912b.m114077b(c35912b2, null, null, false, null, 3, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        ShepherdNotificationHistoryResponse settingsScreenResponse = c35912b2.getSettingsScreenResponse();
        if (settingsScreenResponse != null) {
            ShepherdHistoryResponse shepherdHistory = c35912b2.getSettingsScreenResponse().getShepherdHistory();
            ShepherdPaginatedHistoryResponse shepherdPaginatedHistory = c35912b2.getSettingsScreenResponse().getShepherdHistory().getShepherdPaginatedHistory();
            if (shepherdPaginatedHistory != null) {
                InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
                objCopy$default = shepherdPaginatedHistory.copy(AbstractC25265s.m74129g1(shepherdPaginatedHistory.getRecords(), ((ShepherdPaginatedHistoryResponse) cVar.m108735a()).getRecords()), ((ShepherdPaginatedHistoryResponse) cVar.m108735a()).getNextToken());
            }
            objCopy$default = ShepherdNotificationHistoryResponse.copy$default(settingsScreenResponse, null, null, null, null, null, false, ShepherdHistoryResponse.copy$default(shepherdHistory, null, null, null, objCopy$default, 7, null), null, null, 447, null);
        }
        return C35912b.m114077b(c35912b2, null, objCopy$default, false, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m114091j(C35912b c35912b, InterfaceC30057d<? super C35912b> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f152952z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f152952z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM108729b = gVar2.f152950x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f152952z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(null);
            gVar2.f152949w = c35912b;
            gVar2.f152952z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch arrhythmia settings BFF", hVar, gVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35912b = (C35912b) gVar2.f152949w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C35912b c35912b2 = c35912b;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C35912b.m114077b(c35912b2, InterfaceC35914d.e.f152968a, null, false, null, 14, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C35912b.m114077b(c35912b2, InterfaceC35914d.f.f152969a, (ShepherdNotificationHistoryResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, null, 12, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m114092k(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36578D(new j(null), new C13060l1(new C35912b(InterfaceC35914d.g.f152970a, null, false, null, 14, null), upstream, new i(null)));
    }
}
