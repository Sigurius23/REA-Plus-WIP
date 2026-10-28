package i32;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i32.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Li32/a;", "", "<init>", "()V", "a", "b", "Li32/a$a;", "Li32/a$b;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18054a {

    /* JADX INFO: renamed from: i32.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Li32/a$a;", "Li32/a;", "", "path", "screenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18054a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String path, String screenName) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(screenName, "screenName");
            this.path = path;
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.screenName, aVar.screenName);
        }

        public int hashCode() {
            return this.screenName.hashCode() + (this.path.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LoadTile(path=", this.path, ", screenName=", this.screenName, ")");
        }
    }

    /* JADX INFO: renamed from: i32.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Li32/a$b;", "Li32/a;", "", "updatePath", "screenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC18054a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String updatePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String updatePath, String screenName) {
            super(null);
            AbstractC22676k.m65750j(updatePath, "updatePath");
            AbstractC22676k.m65750j(screenName, "screenName");
            this.updatePath = updatePath;
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUpdatePath() {
            return this.updatePath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.updatePath, bVar.updatePath) && AbstractC22676k.m65745e(this.screenName, bVar.screenName);
        }

        public int hashCode() {
            return this.screenName.hashCode() + (this.updatePath.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("RefreshPaymentMethodTile(updatePath=", this.updatePath, ", screenName=", this.screenName, ")");
        }
    }

    public /* synthetic */ AbstractC18054a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18054a() {
    }
}
