package ss2;

import com.whoop.weeklyplan.api.ChallengeLandingResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ss2.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lss2/f;", "", "<init>", "()V", "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "response", "Lss2/a;", "a", "(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/a;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32955f {

    /* JADX INFO: renamed from: a */
    public static final C32955f f137286a = new C32955f();

    private C32955f() {
    }

    /* JADX INFO: renamed from: a */
    public final C32950a m104068a(ChallengeLandingResponse response) {
        AbstractC22676k.m65750j(response, "response");
        return new C32950a(response.getNavigationTitle(), response.getHeroImageUrl(), response.getJanuaryJumpstartImageUrl(), new C32953d(response.getHeaderSection().getSubtitleDisplay(), response.getHeaderSection().getLearnMoreButton()), response.getCustomPlanCard(), response.getItems());
    }
}
