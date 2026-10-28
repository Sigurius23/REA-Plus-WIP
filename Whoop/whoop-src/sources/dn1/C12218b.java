package dn1;

import bn1.C3498a;
import com.whoop.homecustomization.domain.HomeCustomizationApi;
import com.whoop.homecustomization.domain.models.CustomizableMetricModel;
import com.whoop.homecustomization.domain.models.CustomizeOverviewDomainBody;
import com.whoop.homecustomization.domain.models.CustomizeOverviewResponse;
import com.whoop.homecustomization.domain.models.MetricsSection;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.AbstractC25269w;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: dn1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010$J#\u0010)\u001a\u00020\u0003*\u00020\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Ldn1/b;", "Lod1/g;", "Ldn1/a;", "Ldn1/c;", "Lcom/whoop/homecustomization/domain/HomeCustomizationApi;", "homeCustomizationApi", "Lbn1/a;", "analyticHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/homecustomization/domain/HomeCustomizationApi;Lbn1/a;Ltr2/n;)V", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "", "metricName", "n", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ljava/lang/String;)Ljava/lang/String;", "Ldn1/e;", "currResult", "Ll83/a0;", "r", "(Ldn1/e;)V", "m", "(Lq83/d;)Ljava/lang/Object;", "lastKnownResponse", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;", "saveDomainBody", "q", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;Lq83/d;)Ljava/lang/Object;", "", "fromIndex", "toIndex", "p", "(Ldn1/e;II)Ldn1/c;", "index", "l", "(Ldn1/e;I)Ldn1/c;", "o", "Ldn1/h;", "selectedIndex", "newMetricType", "s", "(Ldn1/e;Ldn1/h;Ljava/lang/String;)Ldn1/c;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/homecustomization/domain/HomeCustomizationApi;", "b", "Lbn1/a;", "c", "Ltr2/n;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12218b implements InterfaceC27844g<InterfaceC12217a, InterfaceC12219c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HomeCustomizationApi homeCustomizationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3498a analyticHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dn1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.CustomizeOverviewDomainInteractor", m100430f = "CustomizeOverviewDomainInteractor.kt", m100431l = {119}, m100432m = "fetchCustomizeOverviewContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f40882w;

        /* JADX INFO: renamed from: y */
        int f40884y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40882w = obj;
            this.f40884y |= Integer.MIN_VALUE;
            return C12218b.this.m33946m(this);
        }
    }

    /* JADX INFO: renamed from: dn1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.CustomizeOverviewDomainInteractor$fetchCustomizeOverviewContent$2", m100430f = "CustomizeOverviewDomainInteractor.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f40885w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12218b.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f40885w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeCustomizationApi homeCustomizationApi = C12218b.this.homeCustomizationApi;
            this.f40885w = 1;
            Object customizeOverview = homeCustomizationApi.getCustomizeOverview(this);
            return customizeOverview == enumC31071a ? enumC31071a : customizeOverview;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CustomizeOverviewResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dn1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.CustomizeOverviewDomainInteractor$interact$1", m100430f = "CustomizeOverviewDomainInteractor.kt", m100431l = {21, 26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldn1/c;", "currResult", "Ldn1/a;", "action", "<anonymous>", "(Ldn1/c;Ldn1/a;)Ldn1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f40887E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f40888F;

        /* JADX INFO: renamed from: w */
        Object f40890w;

        /* JADX INFO: renamed from: x */
        Object f40891x;

        /* JADX INFO: renamed from: y */
        int f40892y;

        /* JADX INFO: renamed from: z */
        int f40893z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC12219c interfaceC12219c, InterfaceC12217a interfaceC12217a, InterfaceC30057d<? super InterfaceC12219c> interfaceC30057d) {
            c cVar = C12218b.this.new c(interfaceC30057d);
            cVar.f40887E = interfaceC12219c;
            cVar.f40888F = interfaceC12217a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r7 == r2) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        
            if (r7 == r2) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dn1.C12218b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dn1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((CustomizableMetricModel) t14).getName(), ((CustomizableMetricModel) t15).getName());
        }
    }

    /* JADX INFO: renamed from: dn1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.CustomizeOverviewDomainInteractor", m100430f = "CustomizeOverviewDomainInteractor.kt", m100431l = {139}, m100432m = "saveChanges", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f40894E;

        /* JADX INFO: renamed from: w */
        Object f40895w;

        /* JADX INFO: renamed from: x */
        Object f40896x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f40897y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f40897y = obj;
            this.f40894E |= Integer.MIN_VALUE;
            return C12218b.this.m33950q(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dn1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.CustomizeOverviewDomainInteractor$saveChanges$4", m100430f = "CustomizeOverviewDomainInteractor.kt", m100431l = {140}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f40899w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CustomizeOverviewDomainBody f40901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CustomizeOverviewDomainBody customizeOverviewDomainBody, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f40901y = customizeOverviewDomainBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12218b.this.new f(this.f40901y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f40899w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeCustomizationApi homeCustomizationApi = C12218b.this.homeCustomizationApi;
            CustomizeOverviewDomainBody customizeOverviewDomainBody = this.f40901y;
            this.f40899w = 1;
            Object objUpdateCustomizeOverviewPrefs = homeCustomizationApi.updateCustomizeOverviewPrefs(customizeOverviewDomainBody, this);
            return objUpdateCustomizeOverviewPrefs == enumC31071a ? enumC31071a : objUpdateCustomizeOverviewPrefs;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C12218b(HomeCustomizationApi homeCustomizationApi, C3498a analyticHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(homeCustomizationApi, "homeCustomizationApi");
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.homeCustomizationApi = homeCustomizationApi;
        this.analyticHelper = analyticHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC12219c m33945l(C12221e c12221e, int i13) {
        CustomizeOverviewResponse response = c12221e.getResponse();
        CustomizableMetricModel customizableMetricModel = response.getUnpinnedMetricsSection().getMetrics().get(i13);
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(response.getPinnedMetricsSection().getMetrics());
        arrayListM74097F1.add(customizableMetricModel);
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(response.getUnpinnedMetricsSection().getMetrics());
        arrayListM74097F2.remove(i13);
        return C12221e.m33955c(c12221e, CustomizeOverviewResponse.copy$default(response, null, null, null, null, null, null, MetricsSection.copy$default(response.getPinnedMetricsSection(), null, arrayListM74097F1, 1, null), MetricsSection.copy$default(response.getUnpinnedMetricsSection(), null, arrayListM74097F2, 1, null), 63, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m33946m(InterfaceC30057d<? super InterfaceC12219c> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f40884y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f40884y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f40882w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f40884y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f40884y = 1;
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
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return new C12220d(EnumC12223g.HTTP);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return new C12220d(EnumC12223g.NETWORK);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new C12221e((CustomizeOverviewResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    private final String m33947n(CustomizeOverviewResponse customizeOverviewResponse, String str) {
        Object next;
        Iterator<T> it = customizeOverviewResponse.getBottomSheetMetrics().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((CustomizableMetricModel) next).getMetric(), str));
        CustomizableMetricModel customizableMetricModel = (CustomizableMetricModel) next;
        if (customizableMetricModel != null) {
            return customizableMetricModel.getShortName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC12219c m33948o(C12221e c12221e, int i13) {
        CustomizeOverviewResponse response = c12221e.getResponse();
        CustomizableMetricModel customizableMetricModel = response.getPinnedMetricsSection().getMetrics().get(i13);
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(response.getPinnedMetricsSection().getMetrics());
        arrayListM74097F1.remove(i13);
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(response.getUnpinnedMetricsSection().getMetrics());
        arrayListM74097F2.add(customizableMetricModel);
        if (arrayListM74097F2.size() > 1) {
            AbstractC25269w.m74166l0(arrayListM74097F2, new d());
        }
        return C12221e.m33955c(c12221e, CustomizeOverviewResponse.copy$default(response, null, null, null, null, null, null, MetricsSection.copy$default(response.getPinnedMetricsSection(), null, arrayListM74097F1, 1, null), MetricsSection.copy$default(response.getUnpinnedMetricsSection(), null, arrayListM74097F2, 1, null), 63, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC12219c m33949p(C12221e c12221e, int i13, int i14) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c12221e.getResponse().getPinnedMetricsSection().getMetrics());
        CustomizeOverviewResponse response = c12221e.getResponse();
        if (i13 >= 0 && i13 < arrayListM74097F1.size() && i14 >= 0 && i14 < arrayListM74097F1.size()) {
            arrayListM74097F1.add(i14, arrayListM74097F1.remove(i13));
        }
        return C12221e.m33955c(c12221e, CustomizeOverviewResponse.copy$default(response, null, null, null, null, null, null, new MetricsSection("PINNED", arrayListM74097F1), null, 191, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m33950q(CustomizeOverviewResponse customizeOverviewResponse, CustomizeOverviewDomainBody customizeOverviewDomainBody, InterfaceC30057d<? super InterfaceC12219c> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f40894E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f40894E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f40897y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f40894E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            C3498a c3498a = this.analyticHelper;
            List<String> pinnedMetrics = customizeOverviewDomainBody.getPinnedMetrics();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(pinnedMetrics, 10));
            Iterator<T> it = pinnedMetrics.iterator();
            while (true) {
                String str = "";
                if (!it.hasNext()) {
                    break;
                }
                String strM33947n = m33947n(customizeOverviewResponse, (String) it.next());
                if (strM33947n != null) {
                    str = strM33947n;
                }
                arrayList.add(str);
            }
            String strValueOf = String.valueOf(customizeOverviewDomainBody.getPinnedMetrics().size());
            List<String> gaugeMetrics = customizeOverviewDomainBody.getGaugeMetrics();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(gaugeMetrics, 10));
            Iterator<T> it3 = gaugeMetrics.iterator();
            while (it3.hasNext()) {
                String strM33947n2 = m33947n(customizeOverviewResponse, (String) it3.next());
                if (strM33947n2 == null) {
                    strM33947n2 = "";
                }
                arrayList2.add(strM33947n2);
            }
            c3498a.m10330i(arrayList, strValueOf, arrayList2);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(customizeOverviewDomainBody, null);
            eVar2.f40895w = customizeOverviewResponse;
            eVar2.f40896x = null;
            eVar2.f40894E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, fVar, eVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customizeOverviewResponse = (CustomizeOverviewResponse) eVar2.f40895w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if ((interfaceC34385a instanceof InterfaceC34385a.b.a) || (interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
            return new InterfaceC12222f.a(customizeOverviewResponse);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC12222f.c(customizeOverviewResponse);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m33951r(C12221e currResult) {
        CustomizeOverviewResponse response = currResult.getResponse();
        C12225i selectedValue = currResult.getSelectedValue();
        String selectedMetricType = selectedValue != null ? selectedValue.getSelectedMetricType() : null;
        if (selectedMetricType == null) {
            selectedMetricType = "";
        }
        String strM33947n = m33947n(response, selectedMetricType);
        if (strM33947n != null) {
            this.analyticHelper.m10331j(strM33947n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC12219c m33952s(C12221e c12221e, EnumC12224h enumC12224h, String str) {
        Object next;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c12221e.getResponse().getGaugeMetrics());
        Iterator<T> it = c12221e.getResponse().getBottomSheetMetrics().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((CustomizableMetricModel) next).getMetric(), str));
        CustomizableMetricModel customizableMetricModel = (CustomizableMetricModel) next;
        if (customizableMetricModel != null) {
            CustomizeOverviewResponse response = c12221e.getResponse();
            arrayListM74097F1.remove(enumC12224h.getGaugeIndex());
            arrayListM74097F1.add(enumC12224h.getGaugeIndex(), customizableMetricModel);
            C12221e c12221eM33955c = C12221e.m33955c(c12221e, CustomizeOverviewResponse.copy$default(response, null, null, arrayListM74097F1, null, null, null, null, null, 251, null), null, 2, null);
            if (c12221eM33955c != null) {
                return c12221eM33955c;
            }
        }
        return c12221e;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC12219c.a.f40902a, upstream, new c(null));
    }
}
