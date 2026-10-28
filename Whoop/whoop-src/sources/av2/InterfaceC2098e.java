package av2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: av2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lav2/e;", "", "a", "b", "Lav2/e$a;", "Lav2/e$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC2098e {

    /* JADX INFO: renamed from: av2.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lav2/e$a;", "Lav2/e;", "Lcom/whoop/design/util/TextResource;", "errorText", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC2098e {

        /* JADX INFO: renamed from: b */
        public static final int f8325b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorText;

        public a(TextResource errorText) {
            AbstractC22676k.m65750j(errorText, "errorText");
            this.errorText = errorText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorText() {
            return this.errorText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.errorText, ((a) other).errorText);
        }

        public int hashCode() {
            return this.errorText.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Error(errorText=", this.errorText, ")");
        }
    }

    /* JADX INFO: renamed from: av2.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lav2/e$b;", "Lav2/e;", "Lcom/whoop/design/util/TextResource;", "workoutNameText", "", "textFieldIsError", "textFieldErrorMsg", "ctaEnabled", "<init>", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "c", "()Z", "e", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC2098e {

        /* JADX INFO: renamed from: f */
        public static final int f8328f = TextResource.$stable;

        /* JADX INFO: renamed from: g */
        private static final b f8329g = new b(AbstractC8693b.m21267a(), false, AbstractC8693b.m21267a(), false);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource workoutNameText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean textFieldIsError;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource textFieldErrorMsg;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean ctaEnabled;

        public b(TextResource workoutNameText, boolean z4, TextResource textFieldErrorMsg, boolean z13) {
            AbstractC22676k.m65750j(workoutNameText, "workoutNameText");
            AbstractC22676k.m65750j(textFieldErrorMsg, "textFieldErrorMsg");
            this.workoutNameText = workoutNameText;
            this.textFieldIsError = z4;
            this.textFieldErrorMsg = textFieldErrorMsg;
            this.ctaEnabled = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCtaEnabled() {
            return this.ctaEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getTextFieldErrorMsg() {
            return this.textFieldErrorMsg;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getTextFieldIsError() {
            return this.textFieldIsError;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getWorkoutNameText() {
            return this.workoutNameText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.workoutNameText, bVar.workoutNameText) && this.textFieldIsError == bVar.textFieldIsError && AbstractC22676k.m65745e(this.textFieldErrorMsg, bVar.textFieldErrorMsg) && this.ctaEnabled == bVar.ctaEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.ctaEnabled) + AbstractC31061c.m95625a(AbstractC2875y.m8289b(this.workoutNameText.hashCode() * 31, 31, this.textFieldIsError), this.textFieldErrorMsg, 31);
        }

        public String toString() {
            TextResource textResource = this.workoutNameText;
            boolean z4 = this.textFieldIsError;
            TextResource textResource2 = this.textFieldErrorMsg;
            boolean z13 = this.ctaEnabled;
            StringBuilder sbM91846p = AbstractC30007c.m91846p("Loaded(workoutNameText=", textResource, ", textFieldIsError=", z4, ", textFieldErrorMsg=");
            sbM91846p.append(textResource2);
            sbM91846p.append(", ctaEnabled=");
            sbM91846p.append(z13);
            sbM91846p.append(")");
            return sbM91846p.toString();
        }
    }
}
