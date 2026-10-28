package ie2;

import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import fi0.InterfaceC14515a;
import l83.C23454a0;
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

/* JADX INFO: renamed from: ie2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\r\u001a\u00020\f*\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lie2/c;", "", "Lcom/whoop/shepherd/domain/ShepherdApi;", "api", "Lfi0/a;", "analytics", "Lxm0/b;", "cacheUpdater", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/shepherd/domain/ShepherdApi;Lfi0/a;Lxm0/b;Ltr2/n;)V", "Lie2/b;", "e", "(Lie2/b;Lq83/d;)Ljava/lang/Object;", "", "isDetectionOn", "isNotificationOn", "g", "(Lie2/b;ZZLq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lie2/a;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/shepherd/domain/ShepherdApi;", "b", "Lfi0/a;", "c", "Lxm0/b;", "d", "Ltr2/n;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18448c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShepherdApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ie2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor", m100430f = "ShepherdToggleSettingsInteractor.kt", m100431l = {52}, m100432m = "fetchShepherdSettingsData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f71837w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71838x;

        /* JADX INFO: renamed from: z */
        int f71840z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71838x = obj;
            this.f71840z |= Integer.MIN_VALUE;
            return C18448c.this.m53159e(null, this);
        }
    }

    /* JADX INFO: renamed from: ie2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor$fetchShepherdSettingsData$2", m100430f = "ShepherdToggleSettingsInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f71841w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C18448c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71841w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C18448c.this.api;
            this.f71841w = 1;
            Object shepherdToggleSettings = shepherdApi.getShepherdToggleSettings(this);
            return shepherdToggleSettings == enumC31071a ? enumC31071a : shepherdToggleSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdToggleSettingsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ie2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor$interact$1", m100430f = "ShepherdToggleSettingsInteractor.kt", m100431l = {24, 47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lie2/b;", "prevDomainState", "Lie2/a;", "domainAction", "<anonymous>", "(Lie2/b;Lie2/a;)Lie2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f71843w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71844x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f71845y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18447b c18447b, InterfaceC18446a interfaceC18446a, InterfaceC30057d<? super C18447b> interfaceC30057d) {
            c cVar = C18448c.this.new c(interfaceC30057d);
            cVar.f71844x = c18447b;
            cVar.f71845y = interfaceC18446a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r14 == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        
            if (r14 == r2) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ie2.C18448c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ie2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor", m100430f = "ShepherdToggleSettingsInteractor.kt", m100431l = {64, 71}, m100432m = "updateShepherdSettings", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f71847E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f71848F;

        /* JADX INFO: renamed from: H */
        int f71850H;

        /* JADX INFO: renamed from: w */
        Object f71851w;

        /* JADX INFO: renamed from: x */
        Object f71852x;

        /* JADX INFO: renamed from: y */
        boolean f71853y;

        /* JADX INFO: renamed from: z */
        boolean f71854z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71848F = obj;
            this.f71850H |= Integer.MIN_VALUE;
            return C18448c.this.m53160g(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: ie2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor$updateShepherdSettings$2", m100430f = "ShepherdToggleSettingsInteractor.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C18448c f71855E;

        /* JADX INFO: renamed from: w */
        Object f71856w;

        /* JADX INFO: renamed from: x */
        int f71857x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f71858y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f71859z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, boolean z13, C18448c c18448c, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f71858y = z4;
            this.f71859z = z13;
            this.f71855E = c18448c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f71858y, this.f71859z, this.f71855E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71857x;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdToggleSettingsUpdateRequest shepherdToggleSettingsUpdateRequest = new ShepherdToggleSettingsUpdateRequest(this.f71858y, this.f71859z);
            ShepherdApi shepherdApi = this.f71855E.api;
            this.f71856w = null;
            this.f71857x = 1;
            Object objUpdateShepherdToggleSettings = shepherdApi.updateShepherdToggleSettings(shepherdToggleSettingsUpdateRequest, this);
            return objUpdateShepherdToggleSettings == enumC31071a ? enumC31071a : objUpdateShepherdToggleSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdToggleSettingsResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C18448c(ShepherdApi api, InterfaceC14515a analytics, C38458b cacheUpdater, InterfaceC34116n logger) {
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
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m53159e(C18447b c18447b, InterfaceC30057d<? super C18447b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f71840z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f71840z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f71838x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f71840z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f71837w = c18447b;
            aVar2.f71840z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch arrhythmia settings BFF", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18447b = (C18447b) aVar2.f71837w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C18447b.m53151b(c18447b, InterfaceC18449d.b.f71862a, null, 2, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return c18447b.m53152a(InterfaceC18449d.c.f71863a, (ShepherdToggleSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m53160g(C18447b c18447b, boolean z4, boolean z13, InterfaceC30057d<? super C18447b> interfaceC30057d) {
        d dVar;
        C18447b c18447b2;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f71850H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f71850H = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f71848F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f71850H;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = dVar2.f71854z;
                z4 = dVar2.f71853y;
                c18447b = (C18447b) dVar2.f71851w;
                AbstractC34132o.m107864I(objM108729b);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34385a = (InterfaceC34385a) dVar2.f71852x;
                c18447b2 = (C18447b) dVar2.f71851w;
                AbstractC34132o.m107864I(objM108729b);
            }
            return c18447b2.m53152a(InterfaceC18449d.f.f71867a, (ShepherdToggleSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        e eVar = new e(z4, z13, this, null);
        dVar2.f71851w = c18447b;
        dVar2.f71853y = z4;
        dVar2.f71854z = z13;
        dVar2.f71850H = 1;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload arrhythmia settings", eVar, dVar2, 2, null);
        if (objM108729b != enumC31071a) {
        }
        return enumC31071a;
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a2 instanceof InterfaceC34385a.b) {
            return C18447b.m53151b(c18447b, new InterfaceC18449d.a(z4, z13), null, 2, null);
        }
        if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        C38458b c38458b = this.cacheUpdater;
        dVar2.f71851w = c18447b;
        dVar2.f71852x = interfaceC34385a2;
        dVar2.f71853y = z4;
        dVar2.f71854z = z13;
        dVar2.f71847E = 0;
        dVar2.f71850H = 2;
        if (c38458b.m123247a("shepherdrefreshscope", dVar2) != enumC31071a) {
            c18447b2 = c18447b;
            interfaceC34385a = interfaceC34385a2;
            return c18447b2.m53152a(InterfaceC18449d.f.f71867a, (ShepherdToggleSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m53161f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C18447b(InterfaceC18449d.d.f71864a, null, 2, null), upstream, new c(null));
    }
}
