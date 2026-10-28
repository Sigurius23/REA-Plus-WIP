package gi2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.strava.domain.models.StravaBffSettingsResponse;
import com.whoop.strava.domain.models.StravaDefaultResponse;
import hi2.C17316a;
import hi2.C17317b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gi2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lgi2/d;", "", "<init>", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "d", "g", "a", "f", "e", "j", "i", "b", "Lgi2/d$a;", "Lgi2/d$b;", "Lgi2/d$c;", "Lgi2/d$d;", "Lgi2/d$e;", "Lgi2/d$f;", "Lgi2/d$g;", "Lgi2/d$h;", "Lgi2/d$i;", "Lgi2/d$j;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15898d {

    /* JADX INFO: renamed from: gi2.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgi2/d$a;", "Lgi2/d;", "Lcom/whoop/strava/domain/models/StravaDefaultResponse;", "defaultResponse", "<init>", "(Lcom/whoop/strava/domain/models/StravaDefaultResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/strava/domain/models/StravaDefaultResponse;", "()Lcom/whoop/strava/domain/models/StravaDefaultResponse;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC15898d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final StravaDefaultResponse defaultResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StravaDefaultResponse defaultResponse) {
            super(null);
            AbstractC22676k.m65750j(defaultResponse, "defaultResponse");
            this.defaultResponse = defaultResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StravaDefaultResponse getDefaultResponse() {
            return this.defaultResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.defaultResponse, ((a) other).defaultResponse);
        }

        public int hashCode() {
            return this.defaultResponse.hashCode();
        }

        public String toString() {
            return "Authorize(defaultResponse=" + this.defaultResponse + ")";
        }
    }

    /* JADX INFO: renamed from: gi2.d$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgi2/d$b;", "Lgi2/d;", "Lhi2/a;", "disconnectConfirmationData", "<init>", "(Lhi2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi2/a;", "()Lhi2/a;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC15898d {

        /* JADX INFO: renamed from: b */
        public static final int f60083b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17316a disconnectConfirmationData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C17316a disconnectConfirmationData) {
            super(null);
            AbstractC22676k.m65750j(disconnectConfirmationData, "disconnectConfirmationData");
            this.disconnectConfirmationData = disconnectConfirmationData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17316a getDisconnectConfirmationData() {
            return this.disconnectConfirmationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.disconnectConfirmationData, ((b) other).disconnectConfirmationData);
        }

        public int hashCode() {
            return this.disconnectConfirmationData.hashCode();
        }

        public String toString() {
            return "DisconnectConfirmationModal(disconnectConfirmationData=" + this.disconnectConfirmationData + ")";
        }
    }

    /* JADX INFO: renamed from: gi2.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgi2/d$c;", "Lgi2/d;", "<init>", "()V", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC15898d {

        /* JADX INFO: renamed from: a */
        public static final c f60085a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gi2.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgi2/d$d;", "Lgi2/d;", "<init>", "()V", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC15898d {

        /* JADX INFO: renamed from: a */
        public static final d f60086a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gi2.d$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgi2/d$e;", "Lgi2/d;", "", "newText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC15898d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String newText) {
            super(null);
            AbstractC22676k.m65750j(newText, "newText");
            this.newText = newText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNewText() {
            return this.newText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.newText, ((e) other).newText);
        }

        public int hashCode() {
            return this.newText.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SearchFieldChange(newText=", this.newText, ")");
        }
    }

    /* JADX INFO: renamed from: gi2.d$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lgi2/d$f;", "Lgi2/d;", "Lhi2/b;", "selectedActivitiesData", "<init>", "(Lhi2/b;)V", "a", "(Lhi2/b;)Lgi2/d$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhi2/b;", "b", "()Lhi2/b;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC15898d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17317b selectedActivitiesData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C17317b selectedActivitiesData) {
            super(null);
            AbstractC22676k.m65750j(selectedActivitiesData, "selectedActivitiesData");
            this.selectedActivitiesData = selectedActivitiesData;
        }

        /* JADX INFO: renamed from: a */
        public final f m44862a(C17317b selectedActivitiesData) {
            AbstractC22676k.m65750j(selectedActivitiesData, "selectedActivitiesData");
            return new f(selectedActivitiesData);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C17317b getSelectedActivitiesData() {
            return this.selectedActivitiesData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.selectedActivitiesData, ((f) other).selectedActivitiesData);
        }

        public int hashCode() {
            return this.selectedActivitiesData.hashCode();
        }

        public String toString() {
            return "SelectedActivities(selectedActivitiesData=" + this.selectedActivitiesData + ")";
        }
    }

    /* JADX INFO: renamed from: gi2.d$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgi2/d$g;", "Lgi2/d;", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "settingsResponse", "<init>", "(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC15898d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final StravaBffSettingsResponse settingsResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(StravaBffSettingsResponse settingsResponse) {
            super(null);
            AbstractC22676k.m65750j(settingsResponse, "settingsResponse");
            this.settingsResponse = settingsResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StravaBffSettingsResponse getSettingsResponse() {
            return this.settingsResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.settingsResponse, ((g) other).settingsResponse);
        }

        public int hashCode() {
            return this.settingsResponse.hashCode();
        }

        public String toString() {
            return "Settings(settingsResponse=" + this.settingsResponse + ")";
        }
    }

    /* JADX INFO: renamed from: gi2.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgi2/d$h;", "Lgi2/d;", "<init>", "()V", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC15898d {

        /* JADX INFO: renamed from: a */
        public static final h f60090a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gi2.d$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lgi2/d$i;", "Lgi2/d;", "", "checked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC15898d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean checked;

        public i(boolean z4) {
            super(null);
            this.checked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.checked == ((i) other).checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleAllActivities(checked=", ")", this.checked);
        }
    }

    /* JADX INFO: renamed from: gi2.d$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lgi2/d$j;", "Lgi2/d;", "", "name", "", "checked", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC15898d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean checked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String name, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
            this.checked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.name, jVar.name) && this.checked == jVar.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ToggleIndividualActivity(name=", this.name, ", checked=", ")", this.checked);
        }
    }

    public /* synthetic */ AbstractC15898d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15898d() {
    }
}
