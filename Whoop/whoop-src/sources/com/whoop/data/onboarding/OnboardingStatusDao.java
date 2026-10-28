package com.whoop.data.onboarding;

import androidx.core.app.NotificationCompat;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000f2\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\t¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/onboarding/OnboardingStatusDao;", "", "Lcom/whoop/data/onboarding/OnboardingStatus;", NotificationCompat.CATEGORY_STATUS, "Ll83/a0;", "updateTable", "(Lcom/whoop/data/onboarding/OnboardingStatus;Lq83/d;)Ljava/lang/Object;", "", "getOnboardingStatus", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/onboarding/FeatureEducationType;", "featureEducationType", "", "isCompleted", "(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "isCompletedFlow", "(Lcom/whoop/data/onboarding/FeatureEducationType;)Lec3/l;", "deleteAll", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OnboardingStatusDao {
    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getOnboardingStatus(InterfaceC30057d<? super List<OnboardingStatus>> interfaceC30057d);

    Object isCompleted(FeatureEducationType featureEducationType, InterfaceC30057d<? super Boolean> interfaceC30057d);

    InterfaceC13058l isCompletedFlow(FeatureEducationType featureEducationType);

    Object updateTable(OnboardingStatus onboardingStatus, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
