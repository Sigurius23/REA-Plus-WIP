package wm0;

import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import l83.C23454a0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lwm0/a;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "scope", "Ll83/a0;", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "Lec3/o1;", "Lec3/o1;", "events", "Lec3/t1;", "c", "Lec3/t1;", "()Lec3/t1;", "scopeUpdateEvents", "d", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37378a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13072o1 events;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13087t1 scopeUpdateEvents;

    /* JADX INFO: renamed from: wm0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lwm0/a$a;", "", "<init>", "()V", "", "path", "a", "(Ljava/lang/String;)Ljava/lang/String;", "DEFAULT_REFRESH_SCOPE", "Ljava/lang/String;", "HOME_REFRESH_SCOPE", "NOTIFICATIONS_REFRESH_SCOPE", "DISABLE_HIGH_FREQUENCY_REFRESH_SCOPE", "SMART_ALARM_REFRESH_SCOPE", "STREAKS_HOME", "AI_INSIGHTS", "HORMONAL_INSIGHTS_OVERVIEW_SCOPE", "MCI_OVERVIEW_REFRESH_SCOPE", "HEALTH_TAB_REFRESH_SCOPE", "COMMUNITY_FOLLOWER_REFRESH_SCOPE", "BADGING_REFRESH_SCOPE", "FORM_COMPLETION_REFRESH_SCOPE", "SHOP_HOME_REFRESH_SCOPE", "NESTED_BFF_PREFIX", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m119658a(String path) {
            return (path == null || AbstractC39414r.m125890i0(path)) ? "nested-bff" : AbstractC11266d.m30461o("nested-bff:", path);
        }

        private Companion() {
        }
    }

    public C37378a(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.events = c13096w1M36592b;
        this.scopeUpdateEvents = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m119655c(C37378a c37378a, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE;
        }
        return c37378a.m119657b(str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13087t1 getScopeUpdateEvents() {
        return this.scopeUpdateEvents;
    }

    /* JADX INFO: renamed from: b */
    public final Object m119657b(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logger.mo85228t(AbstractC11266d.m30461o("refreshing scope for ", str), new AbstractC30556a.a[0]);
        Object objEmit = this.events.emit(str, interfaceC30057d);
        return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
    }

    public /* synthetic */ C37378a(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ScopeCoordinator") : interfaceC34116n);
    }
}
