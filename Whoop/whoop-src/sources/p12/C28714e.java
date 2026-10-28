package p12;

import com.whoop.data.onboarding.FeatureEducationType;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: p12.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lp12/e;", "", "Lcom/whoop/data/onboarding/FeatureEducationType;", "type", "", "id", "<init>", "(Lcom/whoop/data/onboarding/FeatureEducationType;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/data/onboarding/FeatureEducationType;", "b", "()Lcom/whoop/data/onboarding/FeatureEducationType;", "I", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28714e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureEducationType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int id;

    public C28714e(FeatureEducationType featureEducationType, int i13) {
        this.type = featureEducationType;
        this.id = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FeatureEducationType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28714e)) {
            return false;
        }
        C28714e c28714e = (C28714e) other;
        return this.type == c28714e.type && this.id == c28714e.id;
    }

    public int hashCode() {
        FeatureEducationType featureEducationType = this.type;
        return Integer.hashCode(this.id) + ((featureEducationType == null ? 0 : featureEducationType.hashCode()) * 31);
    }

    public String toString() {
        return "FeatureEducation(type=" + this.type + ", id=" + this.id + ")";
    }
}
