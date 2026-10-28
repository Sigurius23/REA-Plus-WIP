package rf1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rf1.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lfi0/a;", "", "source", "Ll83/a0;", "b", "(Lfi0/a;Ljava/lang/String;)V", "a", "(Lfi0/a;)V", "feedback-survey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31358b {
    /* JADX INFO: renamed from: a */
    public static final void m96431a(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "keep_advanced_labs", null, "Bloodwork", null, AbstractC25247g0.m73989X(new C23465k(HMSTrackSource.SCREEN, "cancellation_flow")), 21, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m96432b(InterfaceC14515a interfaceC14515a, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, null, "Bloodwork", null, AbstractC25247g0.m73990Y(new C23465k("source", source), new C23465k(HMSTrackSource.SCREEN, "cancellation_flow")), 21, null);
    }
}
