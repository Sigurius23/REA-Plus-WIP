package km1;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.home.domain.models.ChallengeHomeTileModel;
import com.whoop.home.domain.models.ChallengeHomeTileProgressModel;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;

/* JADX INFO: renamed from: km1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/home/domain/models/ChallengeHomeTileModel;", "Lkm1/e;", "a", "(Lcom/whoop/home/domain/models/ChallengeHomeTileModel;)Lkm1/e;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22589f {
    /* JADX INFO: renamed from: a */
    public static final C22588e m65480a(ChallengeHomeTileModel challengeHomeTileModel) {
        C22586c c22586c;
        AbstractC22676k.m65750j(challengeHomeTileModel, "<this>");
        CardButtonModel ctaButton = challengeHomeTileModel.getCtaButton();
        if (ctaButton == null) {
            ctaButton = null;
        }
        C27256h c27256hM68662l = ctaButton != null ? AbstractC23613d4.m68662l(ctaButton, null, 1, null) : null;
        ChallengeHomeTileProgressModel progressBar = challengeHomeTileModel.getProgressBar();
        if (progressBar != null) {
            String currentValue = progressBar.getCurrentValue();
            if (currentValue == null) {
                currentValue = "";
            }
            String totalValue = progressBar.getTotalValue();
            if (totalValue == null) {
                totalValue = "";
            }
            String label = progressBar.getLabel();
            if (label == null) {
                label = "";
            }
            c22586c = new C22586c(currentValue, totalValue, label, progressBar.getPercentValue(), AbstractC22587d.m65467a(progressBar.getProgressBarStyle()));
        } else {
            c22586c = null;
        }
        String headerTitle = challengeHomeTileModel.getHeaderTitle();
        String str = headerTitle == null ? "" : headerTitle;
        String title = challengeHomeTileModel.getTitle();
        String subtitle = challengeHomeTileModel.getSubtitle();
        String imageUrl = challengeHomeTileModel.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        String backgroundStyle = challengeHomeTileModel.getBackgroundStyle();
        String daysLeftDisplay = challengeHomeTileModel.getDaysLeftDisplay();
        C9598e destination = challengeHomeTileModel.getDestination();
        return new C22588e(str, title, subtitle, cVar, backgroundStyle, daysLeftDisplay, c22586c, c27256hM68662l, destination == null ? new C9598e(null, null, null, 7, null) : destination);
    }
}
