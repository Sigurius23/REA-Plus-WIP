package com.whoop.onboarding.story.domain.network;

import com.whoop.educationModels.CompleteFeatureEducationBody;
import com.whoop.educationModels.FeatureEducationDto;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "", "", "featureEducationType", "Lcom/whoop/educationModels/FeatureEducationDto;", "getFeatureEducation", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "getFeatureEducationOnboarding", "Lcom/whoop/educationModels/CompleteFeatureEducationBody;", "completeFeatureEducationBody", "Lpg3/v0;", "Ll83/a0;", "completeFeatureEducation", "(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FeatureEducationApi {
    @InterfaceC37285p("onboarding-service/v1/feature-education-state")
    Object completeFeatureEducation(@InterfaceC37270a CompleteFeatureEducationBody completeFeatureEducationBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/features/educations/{featureEducation}")
    Object getFeatureEducation(@InterfaceC37288s("featureEducation") String str, InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/features/educations/onboarding/{featureEducation}")
    Object getFeatureEducationOnboarding(@InterfaceC37288s("featureEducation") String str, InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d);
}
