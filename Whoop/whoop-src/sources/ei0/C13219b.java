package ei0;

import android.content.Intent;
import android.net.Uri;
import com.amplitude.android.engagement.C4861a;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.data.repositories.FeatureFlagChecker;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p021av.C2088b;
import p031b9.AbstractC2875y;
import p197hj.C17319b;
import p197hj.C17330m;
import p197hj.C17336s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ei0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lei0/b;", "Lei0/a;", "Lcom/amplitude/android/engagement/a;", "amplitudeEngagement", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/amplitude/android/engagement/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lhj/b;", "options", "Ll83/a0;", "a", "(Lhj/b;)V", "Landroid/content/Intent;", "intent", "b", "(Landroid/content/Intent;)V", "Lcom/amplitude/android/engagement/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "amplitude-sdk_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13219b implements InterfaceC13218a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4861a amplitudeEngagement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C13219b(C4861a amplitudeEngagement, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(amplitudeEngagement, "amplitudeEngagement");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.amplitudeEngagement = amplitudeEngagement;
        this.featureFlagChecker = featureFlagChecker;
    }

    @Override // ei0.InterfaceC13218a
    /* JADX INFO: renamed from: a */
    public void mo37117a(C17319b options) {
        AbstractC22676k.m65750j(options, "options");
        if (this.featureFlagChecker.isFeatureEnabled("android-enable-amplitude-survey-sdk")) {
            this.amplitudeEngagement.m15515a(options);
        }
    }

    @Override // ei0.InterfaceC13218a
    /* JADX INFO: renamed from: b */
    public void mo37118b(Intent intent) {
        String str;
        Integer numM125932Q;
        AbstractC22676k.m65750j(intent, "intent");
        if (this.featureFlagChecker.isFeatureEnabled("android-enable-amplitude-survey-sdk")) {
            C4861a c4861a = this.amplitudeEngagement;
            c4861a.getClass();
            C5101l0 c5101l0 = C4861a.f20259o;
            c5101l0.m16030H(new C2088b(intent, 21));
            String scheme = intent.getScheme();
            if (scheme == null || !AbstractC39421y.m125930O(scheme, "amp-", false)) {
                return;
            }
            Uri data = intent.getData();
            if (AbstractC22676k.m65745e(data != null ? data.getHost() : null, "gs")) {
                Uri data2 = intent.getData();
                List<String> pathSegments = data2 != null ? data2.getPathSegments() : null;
                if (pathSegments == null) {
                    pathSegments = new ArrayList<>();
                }
                if (!AbstractC22676k.m65745e(AbstractC25265s.m74102I0(0, pathSegments), "preview") || (str = (String) AbstractC25265s.m74102I0(1, pathSegments)) == null || (numM125932Q = AbstractC39421y.m125932Q(str)) == null) {
                    return;
                }
                int iIntValue = numM125932Q.intValue();
                c5101l0.m16030H(new C17336s(iIntValue));
                c4861a.f20263d.m53801a(AbstractC2875y.m8296i(iIntValue, "window.engagement._startNudgeDebug({ nudge: { variantId: ", " } })"), C17330m.f67125z);
            }
        }
    }
}
