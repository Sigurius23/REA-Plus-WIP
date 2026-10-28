package je2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleResponse;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import ie2.C18447b;
import ie2.InterfaceC18449d;
import jb1.C21535a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: je2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lje2/d;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "response", "Lje2/c;", "c", "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lje2/c;", "Lec3/l;", "Lie2/b;", "domainStateFlow", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21625d {

    /* JADX INFO: renamed from: b */
    public static final int f83041b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: je2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83043w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21625d f83044x;

        /* JADX INFO: renamed from: je2.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41842a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83045w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21625d f83046x;

            /* JADX INFO: renamed from: je2.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.togglesettings.presentation.ShepherdToggleSettingsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdToggleSettingsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41843a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83047E;

                /* JADX INFO: renamed from: F */
                Object f83048F;

                /* JADX INFO: renamed from: G */
                Object f83049G;

                /* JADX INFO: renamed from: H */
                int f83050H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83051w;

                /* JADX INFO: renamed from: x */
                int f83052x;

                /* JADX INFO: renamed from: y */
                Object f83053y;

                public C41843a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83051w = obj;
                    this.f83052x |= Integer.MIN_VALUE;
                    return C41842a.this.emit(null, this);
                }
            }

            public C41842a(InterfaceC13062m interfaceC13062m, C21625d c21625d) {
                this.f83045w = interfaceC13062m;
                this.f83046x = c21625d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41843a c41843a;
                Object aVar;
                if (interfaceC30057d instanceof C41843a) {
                    c41843a = (C41843a) interfaceC30057d;
                    int i13 = c41843a.f83052x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41843a.f83052x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41843a = new C41843a(interfaceC30057d);
                    }
                } else {
                    c41843a = new C41843a(interfaceC30057d);
                }
                Object obj2 = c41843a.f83051w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41843a.f83052x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83045w;
                    C18447b c18447b = (C18447b) obj;
                    InterfaceC18449d currentScreenType = c18447b.getCurrentScreenType();
                    if (AbstractC22676k.m65745e(currentScreenType, InterfaceC18449d.d.f71864a)) {
                        aVar = InterfaceC21624c.a.INSTANCE.m60854c();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC18449d.b.f71862a)) {
                        aVar = InterfaceC21624c.a.INSTANCE.m60853b();
                    } else if (AbstractC22676k.m65745e(currentScreenType, InterfaceC18449d.c.f71863a)) {
                        aVar = this.f83046x.m60862c(c18447b.getSettingsScreenResponse());
                    } else if (currentScreenType instanceof InterfaceC18449d.e) {
                        aVar = InterfaceC21624c.a.m60843f(InterfaceC21624c.a.INSTANCE.m60855d(), null, null, null, null, null, null, new InterfaceC21622a.i(((InterfaceC18449d.e) c18447b.getCurrentScreenType()).getIsDetectionOn(), ((InterfaceC18449d.e) c18447b.getCurrentScreenType()).getIsNotificationOn()), 63, null);
                    } else if (currentScreenType instanceof InterfaceC18449d.a) {
                        aVar = InterfaceC21624c.a.m60843f(InterfaceC21624c.a.INSTANCE.m60852a(), null, null, null, new InterfaceC21622a.g(((InterfaceC18449d.a) c18447b.getCurrentScreenType()).getIsDetectionOn(), ((InterfaceC18449d.a) c18447b.getCurrentScreenType()).getIsNotificationOn()), null, InterfaceC21622a.a.f82989a, null, 87, null);
                    } else {
                        if (!AbstractC22676k.m65745e(currentScreenType, InterfaceC18449d.f.f71867a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new InterfaceC21624c.a(new AbstractC33208p0.h(null, 0L, null, 7, null), null, null, null, null, null, InterfaceC21622a.f.f82994a, 62, null);
                    }
                    c41843a.f83053y = null;
                    c41843a.f83047E = null;
                    c41843a.f83048F = null;
                    c41843a.f83049G = null;
                    c41843a.f83050H = 0;
                    c41843a.f83052x = 1;
                    if (interfaceC13062m.emit(aVar, c41843a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C21625d c21625d) {
            this.f83043w = interfaceC13058l;
            this.f83044x = c21625d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83043w.collect(new C41842a(interfaceC13062m, this.f83044x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C21625d(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC21624c m60862c(ShepherdToggleSettingsResponse response) {
        if (response == null) {
            return InterfaceC21624c.a.INSTANCE.m60853b();
        }
        InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(response.getCtaTile());
        ShepherdToggleResponse shepherdDetectionToggle = response.getShepherdDetectionToggle();
        C21627f c21627f = new C21627f(AbstractC8693b.m21278l(shepherdDetectionToggle.getTitle()), AbstractC8693b.m21278l(shepherdDetectionToggle.getDescription()), shepherdDetectionToggle.getEnabled());
        ShepherdToggleResponse shepherdNotificationToggle = response.getShepherdNotificationToggle();
        return new InterfaceC21624c.b(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l(response.getPageTitle()), c21627f, new C21627f(AbstractC8693b.m21278l(shepherdNotificationToggle.getTitle()), AbstractC8693b.m21278l(shepherdNotificationToggle.getDescription()), shepherdNotificationToggle.getEnabled()), interfaceC25312uM60541h);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m60863b(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }

    public /* synthetic */ C21625d(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21626e.f83055a : c21535a);
    }
}
