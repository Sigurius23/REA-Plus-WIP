package com.whoop.data.onboarding;

import java.util.Map;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/onboarding/OnboardingStatusApi;", "", "", "userId", "", "", "", "getOnboardingStatus", "(ILq83/d;)Ljava/lang/Object;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OnboardingStatusApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String ONBOARDING_SERVICE_PATH = "onboarding-service/v1/feature-education-state";

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/data/onboarding/OnboardingStatusApi$Companion;", "", "<init>", "()V", "ONBOARDING_SERVICE_PATH", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ONBOARDING_SERVICE_PATH = "onboarding-service/v1/feature-education-state";

        private Companion() {
        }
    }

    @InterfaceC37275f("onboarding-service/v1/feature-education-state")
    Object getOnboardingStatus(@InterfaceC37289t("userId") int i13, InterfaceC30057d<? super Map<String, Boolean>> interfaceC30057d);
}
