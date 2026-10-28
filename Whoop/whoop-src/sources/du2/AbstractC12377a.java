package du2;

import com.whoop.navigation.FeatureEducationModel;
import com.whoop.navigation.NavigationScreenModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: du2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "educationName", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/navigation/NavigationScreenModel;", "b", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12377a {
    /* JADX INFO: renamed from: a */
    public static final String m34729a(String educationName) {
        AbstractC22676k.m65750j(educationName, "educationName");
        if (educationName.equals("EXERCISE_PROGRESS_EDUCATION_1RM_ELIGIBLE")) {
            return "exercise_progress_1rm_eligible";
        }
        return educationName.equals("EXERCISE_PROGRESS_EDUCATION_1RM_INELIGIBLE") ? "exercise_progress_1rm_ineligible" : "exercise_progress";
    }

    /* JADX INFO: renamed from: b */
    public static final NavigationScreenModel m34730b(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "<this>");
        if (!(navigationScreenModel instanceof FeatureEducationModel)) {
            return navigationScreenModel;
        }
        FeatureEducationModel featureEducationModel = (FeatureEducationModel) navigationScreenModel;
        return FeatureEducationModel.copy$default(featureEducationModel, null, null, m34729a(featureEducationModel.getFeatureEducationName()), 3, null);
    }
}
