package lv1;

import androidx.core.app.NotificationCompat;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lv1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llv1/a;", "", "<init>", "()V", "a", "b", "Llv1/a$a;", "Llv1/a$b;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24760a {

    /* JADX INFO: renamed from: lv1.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llv1/a$a;", "Llv1/a;", "<init>", "()V", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC24760a {

        /* JADX INFO: renamed from: a */
        public static final a f96849a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lv1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llv1/a$b;", "Llv1/a;", "", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC24760a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String email) {
            super(null);
            AbstractC22676k.m65750j(email, "email");
            this.email = email;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.email, ((b) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SubmitExportRequest(email=", this.email, ")");
        }
    }

    public /* synthetic */ AbstractC24760a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24760a() {
    }
}
