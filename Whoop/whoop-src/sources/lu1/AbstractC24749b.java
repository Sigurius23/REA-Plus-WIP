package lu1;

import com.whoop.service.network.model.UserState;
import fi0.InterfaceC14515a;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lu1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0005\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lfi0/a;", "", "hrZone", "Ll83/a0;", "a", "(Lfi0/a;Ljava/lang/String;)V", "error", "c", HMSTrackSource.SCREEN, "b", "componentId", "d", "", "Llu1/c;", "Ljava/util/Map;", "scrubEventData", "last-night-sleep_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24749b {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C24750c> f96782a = AbstractC25247g0.m73990Y(new C23465k("hours_of_sleep", new C24750c("Activity Details", UserState.States.SLEEP, AbstractC31061c.m95645u("type", "Sleep"))), new C23465k("sleep_stress", new C24750c("Stress Monitor", "Sleep Stress", null, 4, null)));

    /* JADX INFO: renamed from: a */
    public static final void m72471a(InterfaceC14515a interfaceC14515a, String hrZone) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(hrZone, "hrZone");
        InterfaceC14515a.m41418i(interfaceC14515a, null, null, hrZone, "Activity - Press Horizontal Bar Graph", null, AbstractC25247g0.m73990Y(new C23465k("type", "Sleep"), new C23465k("activity", UserState.States.SLEEP), new C23465k("source", "sleep_deep_dive")), 19, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m72472b(InterfaceC14515a interfaceC14515a, String screen) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(screen, "screen");
        interfaceC14515a.mo41428k("Sleep", "Open", screen, "Explain Page", AbstractC31061c.m95645u("source", "sleep_deep_dive"));
    }

    /* JADX INFO: renamed from: c */
    public static final void m72473c(InterfaceC14515a interfaceC14515a, String error) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(error, "error");
        interfaceC14515a.mo41428k("last_nights_sleep", "error", UserState.States.SLEEP, "Deep Dive", AbstractC31061c.m95645u("error", error));
    }

    /* JADX INFO: renamed from: d */
    public static final void m72474d(InterfaceC14515a interfaceC14515a, String componentId) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(componentId, "componentId");
        C24750c c24750c = f96782a.get(componentId);
        if (c24750c == null) {
            c24750c = new C24750c("unknown", UserState.States.SLEEP, null, 4, null);
        }
        Map<String, String> mapM72477c = c24750c.m72477c();
        if (mapM72477c != null) {
            interfaceC14515a.mo41428k(c24750c.getCategory(), "Press", c24750c.getLabel(), "Data Scrubbing", mapM72477c);
        } else {
            interfaceC14515a.mo41424f(c24750c.getCategory(), "Press", c24750c.getLabel(), "Data Scrubbing");
        }
    }
}
