package jc2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import kotlinx.serialization.json.JsonElement;
import or2.C28198s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jc2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Ljc2/a;", "", "Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/o0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lor2/s;", "legacyNavController", "Ll83/a0;", "a", "(Lor2/s;)V", "Lj02/o0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21606a {

    /* JADX INFO: renamed from: d */
    public static final int f82935d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C21606a(InterfaceC21159o0 navigator, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navigator = navigator;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final void m60765a(C28198s legacyNavController) {
        AbstractC22676k.m65750j(legacyNavController, "legacyNavController");
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PRIVACY_ARCHV2_SCREEN)) {
            this.navigator.mo59393b(new AbstractC21155m0.m1(new ApiRequest("privacy-service-bff/v1/screen?source=settings", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null));
        } else {
            legacyNavController.m85342h("whoop://com.whoop/privacyConsentFragment");
        }
    }
}
