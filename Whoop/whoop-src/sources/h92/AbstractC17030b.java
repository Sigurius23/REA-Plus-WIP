package h92;

import com.whoop.domain.model.WhoopUri;
import m83.AbstractC25265s;
import or2.AbstractC28188o1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: h92.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/domain/model/WhoopUri;", "", "d", "(Lcom/whoop/domain/model/WhoopUri;)Z", "isPasswordReset", "c", "isNewPasswordReset", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17030b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final boolean m48097c(WhoopUri whoopUri) {
        String str;
        return whoopUri.getPathSegments().size() == 1 && (str = (String) AbstractC25265s.m74100H0(whoopUri.getPathSegments())) != null && str.equalsIgnoreCase("reset-password-v2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m48098d(WhoopUri whoopUri) {
        return AbstractC28188o1.m85311a(whoopUri.getPathSegments(), "password_reset");
    }
}
