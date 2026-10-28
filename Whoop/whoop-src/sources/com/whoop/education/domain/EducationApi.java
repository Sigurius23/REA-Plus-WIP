package com.whoop.education.domain;

import com.whoop.design.models.items.ArticleTileCarouselModel;
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
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/education/domain/EducationApi;", "", "", "featureEducationPath", "Lcom/whoop/educationModels/FeatureEducationDto;", "getEducation", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "featureEducationType", "getEducationUnauthed", "zoneId", "cta", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "getCommunityEducationCarousel", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/educationModels/CompleteFeatureEducationBody;", "completeFeatureEducationBody", "Lpg3/v0;", "Ll83/a0;", "completeFeatureEducation", "(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface EducationApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m21354a(EducationApi educationApi, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCommunityEducationCarousel");
        }
        if ((i13 & 2) != 0) {
            str2 = "MORE";
        }
        return educationApi.getCommunityEducationCarousel(str, str2, interfaceC30057d);
    }

    @InterfaceC37285p("onboarding-service/v1/feature-education-state")
    Object completeFeatureEducation(@InterfaceC37270a CompleteFeatureEducationBody completeFeatureEducationBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/learn-more-carousel/bff/community")
    Object getCommunityEducationCarousel(@InterfaceC37289t("zoneId") String str, @InterfaceC37289t("cta") String str2, InterfaceC30057d<? super ArticleTileCarouselModel> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/features/educations/{featureEducationPath}")
    Object getEducation(@InterfaceC37288s("featureEducationPath") String str, InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/features/educations/onboarding/{featureEducation}")
    Object getEducationUnauthed(@InterfaceC37288s("featureEducation") String str, InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d);
}
