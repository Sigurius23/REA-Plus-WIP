package ke1;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ke1.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lke1/a;", "", "<init>", "()V", "a", "Lke1/a$a;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22418a {

    /* JADX INFO: renamed from: ke1.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lke1/a$a;", "Lke1/a;", "", "featureEducationPath", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22418a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String featureEducationPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String featureEducationPath) {
            super(null);
            AbstractC22676k.m65750j(featureEducationPath, "featureEducationPath");
            this.featureEducationPath = featureEducationPath;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFeatureEducationPath() {
            return this.featureEducationPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.featureEducationPath, ((a) other).featureEducationPath);
        }

        public int hashCode() {
            return this.featureEducationPath.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadData(featureEducationPath=", this.featureEducationPath, ")");
        }
    }

    public /* synthetic */ AbstractC22418a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22418a() {
    }
}
