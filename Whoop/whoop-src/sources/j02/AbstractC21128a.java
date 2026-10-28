package j02;

import com.whoop.navigation.ActivityDetailType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lcom/whoop/navigation/ActivityDetailType;", "a", "(Ljava/lang/String;)Lcom/whoop/navigation/ActivityDetailType;", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21128a {
    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static final ActivityDetailType m58959a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        ActivityDetailType activityDetailType = ActivityDetailType.CARDIO;
        for (ActivityDetailType activityDetailType2 : ActivityDetailType.values()) {
            if (AbstractC22676k.m65745e(activityDetailType2.name(), str)) {
                if (activityDetailType2 == null) {
                    return activityDetailType;
                }
                return activityDetailType2;
            }
        }
        activityDetailType2 = null;
        if (activityDetailType2 == null) {
            return activityDetailType;
        }
        return activityDetailType2;
    }
}
