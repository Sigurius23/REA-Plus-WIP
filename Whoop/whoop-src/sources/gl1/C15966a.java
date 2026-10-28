package gl1;

import com.whoop.navigation.AppScreen;
import ey1.EnumC13744a;
import ey1.EnumC13745b;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import live.hms.video.media.tracks.HMSTrackSource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gl1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\f*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lgl1/a;", "", "Lgl1/b;", "analyticsHelper", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(Lgl1/b;Liy1/c;Ltr2/n;)V", "Ley1/a;", "action", "Ley1/b;", HMSTrackSource.SCREEN, "Ll83/a0;", "c", "(Ley1/a;Ley1/b;)V", "Lcom/whoop/navigation/AppScreen;", "a", "(Lcom/whoop/navigation/AppScreen;)Ley1/b;", "", "autoPopId", "", "hijackDetected", "b", "(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;Z)V", "Lgl1/b;", "Liy1/c;", "Ltr2/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15966a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15967b analyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C15966a(C15967b analyticsHelper, InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.analyticsHelper = analyticsHelper;
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final EnumC13745b m45043a(AppScreen appScreen) {
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9275b3.f27499w)) {
            return EnumC13745b.JOURNAL;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9424u0.f27957w)) {
            return EnumC13745b.COACH;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9271b.f27485w)) {
            return EnumC13745b.ACHIEVEMENT;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9421t5.f27948w)) {
            return EnumC13745b.STREAK_CELEBRATION;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9411s3.f27917w)) {
            return EnumC13745b.MARKETING_CONSENT;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9346k2.f27718w)) {
            return EnumC13745b.GENERIC;
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9426u2.f27963w)) {
            return EnumC13745b.HOME;
        }
        return AbstractC22676k.m65745e(appScreen, AppScreen.C9441w1.f28009w) ? EnumC13745b.DAY_ZERO_SPLASH : EnumC13745b.OTHER;
    }

    /* JADX INFO: renamed from: c */
    private final void m45044c(EnumC13744a action, EnumC13745b screen) {
        this.metricWriter.mo58701b(new C22047a(0, action.getValue(), null, AbstractC37056f.m118958J(screen.getTag()), null, 21, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m45045b(AppScreen screen, String autoPopId, boolean hijackDetected) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(autoPopId, "autoPopId");
        EnumC13745b enumC13745bM45043a = m45043a(screen);
        m45044c(EnumC13744a.PRESENTED, enumC13745bM45043a);
        if (hijackDetected) {
            this.logger.mo85228t(AbstractC2875y.m8300m("hijack detected: presented ", screen.getName(), ":", autoPopId, " over a non-Home destination"), new AbstractC30556a.a[0]);
            m45044c(EnumC13744a.HIJACK_DETECTED, enumC13745bM45043a);
        }
        this.analyticsHelper.m45080h(screen.getName(), autoPopId);
    }

    public /* synthetic */ C15966a(C15967b c15967b, InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c15967b, interfaceC21030c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AutoPopTracker") : interfaceC34116n);
    }
}
