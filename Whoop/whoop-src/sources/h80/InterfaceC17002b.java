package h80;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: h80.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lh80/b;", "", "j", "i", "d", "a", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "c", "f", "e", "Lh80/b$a;", "Lh80/b$b;", "Lh80/b$c;", "Lh80/b$d;", "Lh80/b$e;", "Lh80/b$f;", "Lh80/b$g;", "Lh80/b$h;", "Lh80/b$i;", "Lh80/b$j;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17002b {

    /* JADX INFO: renamed from: h80.b$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lh80/b$a;", "Lh80/b;", "", "screenName", "label", "value", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String category;

        public a(String screenName, String label, String value, String category) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(category, "category");
            this.screenName = screenName;
            this.label = label;
            this.value = value;
            this.category = category;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.screenName, aVar.screenName) && AbstractC22676k.m65745e(this.label, aVar.label) && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.category, aVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.screenName.hashCode() * 31, 31, this.label), 31, this.value);
        }

        public String toString() {
            String str = this.screenName;
            String str2 = this.label;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("OnErrorAction(screenName=", str, ", label=", str2, ", value="), this.value, ", category=", this.category, ")");
        }
    }

    /* JADX INFO: renamed from: h80.b$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lh80/b$b;", "Lh80/b;", "", "experimentName", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String experimentName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String variant;

        public b(String experimentName, String variant) {
            AbstractC22676k.m65750j(experimentName, "experimentName");
            AbstractC22676k.m65750j(variant, "variant");
            this.experimentName = experimentName;
            this.variant = variant;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExperimentName() {
            return this.experimentName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.experimentName, bVar.experimentName) && AbstractC22676k.m65745e(this.variant, bVar.variant);
        }

        public int hashCode() {
            return this.variant.hashCode() + (this.experimentName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnExperimentAssignment(experimentName=", this.experimentName, ", variant=", this.variant, ")");
        }
    }

    /* JADX INFO: renamed from: h80.b$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lh80/b$c;", "Lh80/b;", "", "isPasswordResetChallenge", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isPasswordResetChallenge;

        public c(boolean z4) {
            this.isPasswordResetChallenge = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsPasswordResetChallenge() {
            return this.isPasswordResetChallenge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.isPasswordResetChallenge == ((c) other).isPasswordResetChallenge;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isPasswordResetChallenge);
        }

        public String toString() {
            return AbstractC3855a.m11827k("OnForgotPasswordView(isPasswordResetChallenge=", ")", this.isPasswordResetChallenge);
        }
    }

    /* JADX INFO: renamed from: h80.b$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lh80/b$d;", "Lh80/b;", "", "screenName", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        public d(String screenName, String value) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(value, "value");
            this.screenName = screenName;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.screenName, dVar.screenName) && AbstractC22676k.m65745e(this.value, dVar.value);
        }

        public int hashCode() {
            return this.value.hashCode() + (this.screenName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnInputAction(screenName=", this.screenName, ", value=", this.value, ")");
        }
    }

    /* JADX INFO: renamed from: h80.b$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lh80/b$e;", "Lh80/b;", "Lh80/d;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lh80/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/d;", "()Lh80/d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC17004d event;

        public e(InterfaceC17004d event) {
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC17004d getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.event, ((e) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "OnPasswordManagerEvent(event=" + this.event + ")";
        }
    }

    /* JADX INFO: renamed from: h80.b$f */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lh80/b$f;", "Lh80/b;", "", "action", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String action;

        public f(String action) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.action, ((f) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnResetPasswordChallengeTap(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: h80.b$g */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lh80/b$g;", "Lh80/b;", "", "screenName", "label", "value", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String category;

        public g(String screenName, String label, String value, String category) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(category, "category");
            this.screenName = screenName;
            this.label = label;
            this.value = value;
            this.category = category;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.screenName, gVar.screenName) && AbstractC22676k.m65745e(this.label, gVar.label) && AbstractC22676k.m65745e(this.value, gVar.value) && AbstractC22676k.m65745e(this.category, gVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.screenName.hashCode() * 31, 31, this.label), 31, this.value);
        }

        public String toString() {
            String str = this.screenName;
            String str2 = this.label;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("OnScrollAction(screenName=", str, ", label=", str2, ", value="), this.value, ", category=", this.category, ")");
        }
    }

    /* JADX INFO: renamed from: h80.b$h */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lh80/b$h;", "Lh80/b;", "", "screenName", "label", "value", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String category;

        public h(String screenName, String label, String value, String category) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(category, "category");
            this.screenName = screenName;
            this.label = label;
            this.value = value;
            this.category = category;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.screenName, hVar.screenName) && AbstractC22676k.m65745e(this.label, hVar.label) && AbstractC22676k.m65745e(this.value, hVar.value) && AbstractC22676k.m65745e(this.category, hVar.category);
        }

        public int hashCode() {
            return this.category.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.screenName.hashCode() * 31, 31, this.label), 31, this.value);
        }

        public String toString() {
            String str = this.screenName;
            String str2 = this.label;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("OnShareAction(screenName=", str, ", label=", str2, ", value="), this.value, ", category=", this.category, ")");
        }
    }

    /* JADX INFO: renamed from: h80.b$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lh80/b$j;", "Lh80/b;", "", "screenName", "value", "category", "", "", "extraProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Map<String, Object> extraProps;

        public j(String screenName, String str, String str2, Map<String, ? extends Object> map) {
            AbstractC22676k.m65750j(screenName, "screenName");
            this.screenName = screenName;
            this.value = str;
            this.category = str2;
            this.extraProps = map;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, Object> m47901b() {
            return this.extraProps;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.screenName, jVar.screenName) && AbstractC22676k.m65745e(this.value, jVar.value) && AbstractC22676k.m65745e(this.category, jVar.category) && AbstractC22676k.m65745e(this.extraProps, jVar.extraProps);
        }

        public int hashCode() {
            int iHashCode = this.screenName.hashCode() * 31;
            String str = this.value;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.extraProps;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.screenName;
            String str2 = this.value;
            return AbstractC30007c.m91842l(AbstractC11895b.m32001t("OnViewAction(screenName=", str, ", value=", str2, ", category="), this.category, ", extraProps=", this.extraProps, ")");
        }

        public /* synthetic */ j(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : map);
        }
    }

    /* JADX INFO: renamed from: h80.b$i */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lh80/b$i;", "Lh80/b;", "", "screenName", "action", "label", "value", "category", "", "", "extraProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC17002b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> extraProps;

        public i(String screenName, String action, String label, String str, String str2, Map<String, ? extends Object> map) {
            AbstractC22676k.m65750j(screenName, "screenName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            this.screenName = screenName;
            this.action = action;
            this.label = label;
            this.value = str;
            this.category = str2;
            this.extraProps = map;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: c */
        public final Map<String, Object> m47896c() {
            return this.extraProps;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.screenName, iVar.screenName) && AbstractC22676k.m65745e(this.action, iVar.action) && AbstractC22676k.m65745e(this.label, iVar.label) && AbstractC22676k.m65745e(this.value, iVar.value) && AbstractC22676k.m65745e(this.category, iVar.category) && AbstractC22676k.m65745e(this.extraProps, iVar.extraProps);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.screenName.hashCode() * 31, 31, this.action), 31, this.label);
            String str = this.value;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.extraProps;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.screenName;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.value;
            String str5 = this.category;
            Map<String, Object> map = this.extraProps;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OnTapAction(screenName=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", category=");
            return AbstractC30007c.m91842l(sbM32001t, str5, ", extraProps=", map, ")");
        }

        public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "tap" : str2, (i13 & 4) != 0 ? "cta" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : map);
        }
    }
}
