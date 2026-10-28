package ym2;

import ch.C4588i;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import m83.AbstractC25265s;
import or2.InterfaceC28203t1;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ym2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\f\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u001a"}, m65681d2 = {"Lym2/h;", "Lym2/g;", "Lor2/t1;", "systemSettingsChecker", "Ltr2/n;", "logger", "<init>", "(Lor2/t1;Ltr2/n;)V", "Ll83/a0;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lor2/t1;", "b", "Ltr2/n;", "", "value", "c", "Z", "()Z", "(Z)V", "splashShown", "Lec3/o1;", "d", "Lec3/o1;", "splashShownFlow", "animatorsDisabledInDeveloperOptions", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39660h implements InterfaceC39659g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28203t1 systemSettingsChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean splashShown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13072o1 splashShownFlow;

    public C39660h(InterfaceC28203t1 systemSettingsChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(systemSettingsChecker, "systemSettingsChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.systemSettingsChecker = systemSettingsChecker;
        this.logger = logger;
        this.splashShownFlow = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
    }

    /* JADX INFO: renamed from: d */
    private final boolean m126792d() {
        return this.systemSettingsChecker.getFloat("animator_duration_scale", 1.0f) == 0.0f;
    }

    @Override // ym2.InterfaceC39659g
    /* JADX INFO: renamed from: a */
    public Object mo126789a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM36603m;
        return (!m126792d() && this.splashShownFlow.getReplayCache().isEmpty() && (objM36603m = AbstractC13091v.m36603m(new C4588i(this.splashShownFlow, 1), interfaceC30057d)) == EnumC31071a.f128113w) ? objM36603m : C23454a0.f92919a;
    }

    @Override // ym2.InterfaceC39659g
    /* JADX INFO: renamed from: b */
    public void mo126790b(boolean z4) {
        this.logger.mo85228t(AbstractC11266d.m30462p("Setting splash shown = ", z4), new AbstractC30556a.a[0]);
        this.splashShown = z4;
        this.splashShownFlow.mo36564a(Boolean.valueOf(z4));
    }

    @Override // ym2.InterfaceC39659g
    /* JADX INFO: renamed from: c */
    public boolean mo126791c() {
        this.logger.mo85228t(AbstractC25012a.m73375h(AbstractC25265s.m74100H0(this.splashShownFlow.getReplayCache()), "Getting splashShownState: "), new AbstractC30556a.a[0]);
        if (m126792d()) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC25265s.m74100H0(this.splashShownFlow.getReplayCache());
        return bool != null ? bool.booleanValue() : false;
    }

    public /* synthetic */ C39660h(InterfaceC28203t1 interfaceC28203t1, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC28203t1, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("WhoopSplashState") : interfaceC34116n);
    }
}
