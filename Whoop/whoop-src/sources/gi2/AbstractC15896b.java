package gi2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.strava.domain.models.StravaAuthorizeRequest;
import hi2.C17316a;
import hi2.C17317b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import ji2.C21724c;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gi2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lgi2/b;", "", "<init>", "()V", "b", "i", "a", "f", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "c", "d", "Lgi2/b$a;", "Lgi2/b$b;", "Lgi2/b$c;", "Lgi2/b$d;", "Lgi2/b$e;", "Lgi2/b$f;", "Lgi2/b$g;", "Lgi2/b$h;", "Lgi2/b$i;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15896b {

    /* JADX INFO: renamed from: gi2.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgi2/b$a;", "Lgi2/b;", "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "authorizeRequest", "<init>", "(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "()Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC15896b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final StravaAuthorizeRequest authorizeRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StravaAuthorizeRequest authorizeRequest) {
            super(null);
            AbstractC22676k.m65750j(authorizeRequest, "authorizeRequest");
            this.authorizeRequest = authorizeRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StravaAuthorizeRequest getAuthorizeRequest() {
            return this.authorizeRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.authorizeRequest, ((a) other).authorizeRequest);
        }

        public int hashCode() {
            return this.authorizeRequest.hashCode();
        }

        public String toString() {
            return "Authorize(authorizeRequest=" + this.authorizeRequest + ")";
        }
    }

    /* JADX INFO: renamed from: gi2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgi2/b$c;", "Lgi2/b;", "<init>", "()V", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC15896b {

        /* JADX INFO: renamed from: a */
        public static final c f60024a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gi2.b$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgi2/b$d;", "Lgi2/b;", "Lhi2/a;", "disconnectConfirmationData", "<init>", "(Lhi2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi2/a;", "()Lhi2/a;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC15896b {

        /* JADX INFO: renamed from: b */
        public static final int f60025b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17316a disconnectConfirmationData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C17316a disconnectConfirmationData) {
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
            return (other instanceof d) && AbstractC22676k.m65745e(this.disconnectConfirmationData, ((d) other).disconnectConfirmationData);
        }

        public int hashCode() {
            return this.disconnectConfirmationData.hashCode();
        }

        public String toString() {
            return "DisconnectConfirmationModal(disconnectConfirmationData=" + this.disconnectConfirmationData + ")";
        }
    }

    /* JADX INFO: renamed from: gi2.b$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgi2/b$e;", "Lgi2/b;", "", "newText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC15896b {

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

    /* JADX INFO: renamed from: gi2.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgi2/b$f;", "Lgi2/b;", "Lhi2/b;", "selectedActivitiesData", "<init>", "(Lhi2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi2/b;", "()Lhi2/b;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC15896b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17317b selectedActivitiesData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C17317b selectedActivitiesData) {
            super(null);
            AbstractC22676k.m65750j(selectedActivitiesData, "selectedActivitiesData");
            this.selectedActivitiesData = selectedActivitiesData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
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

    /* JADX INFO: renamed from: gi2.b$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lgi2/b$g;", "Lgi2/b;", "", "checked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC15896b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean checked;

        public g(boolean z4) {
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
            return (other instanceof g) && this.checked == ((g) other).checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleAllActivities(checked=", ")", this.checked);
        }
    }

    /* JADX INFO: renamed from: gi2.b$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lgi2/b$h;", "Lgi2/b;", "", "name", "", "checked", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC15896b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean checked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String name, boolean z4) {
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
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.name, hVar.name) && this.checked == hVar.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ToggleIndividualActivity(name=", this.name, ", checked=", ")", this.checked);
        }
    }

    /* JADX INFO: renamed from: gi2.b$i */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\""}, m65681d2 = {"Lgi2/b$i;", "Lgi2/b;", "", "shareToStrava", "shareAllActivities", "", "templateName", "", "Lji2/c;", "sharedActivities", "navBack", "importActivities", "<init>", "(ZZLjava/lang/String;Ljava/util/List;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Ljava/lang/String;", "f", "Ljava/util/List;", "e", "()Ljava/util/List;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC15896b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean shareToStrava;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean shareAllActivities;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String templateName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C21724c> sharedActivities;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean navBack;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean importActivities;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z4, boolean z13, String templateName, List<C21724c> sharedActivities, boolean z14, boolean z15) {
            super(null);
            AbstractC22676k.m65750j(templateName, "templateName");
            AbstractC22676k.m65750j(sharedActivities, "sharedActivities");
            this.shareToStrava = z4;
            this.shareAllActivities = z13;
            this.templateName = templateName;
            this.sharedActivities = sharedActivities;
            this.navBack = z14;
            this.importActivities = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getImportActivities() {
            return this.importActivities;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getNavBack() {
            return this.navBack;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShareAllActivities() {
            return this.shareAllActivities;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShareToStrava() {
            return this.shareToStrava;
        }

        /* JADX INFO: renamed from: e */
        public final List<C21724c> m44845e() {
            return this.sharedActivities;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return this.shareToStrava == iVar.shareToStrava && this.shareAllActivities == iVar.shareAllActivities && AbstractC22676k.m65745e(this.templateName, iVar.templateName) && AbstractC22676k.m65745e(this.sharedActivities, iVar.sharedActivities) && this.navBack == iVar.navBack && this.importActivities == iVar.importActivities;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTemplateName() {
            return this.templateName;
        }

        public int hashCode() {
            return Boolean.hashCode(this.importActivities) + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.shareToStrava) * 31, 31, this.shareAllActivities), 31, this.templateName), 31, this.sharedActivities), 31, this.navBack);
        }

        public String toString() {
            boolean z4 = this.shareToStrava;
            boolean z13 = this.shareAllActivities;
            String str = this.templateName;
            List<C21724c> list = this.sharedActivities;
            boolean z14 = this.navBack;
            boolean z15 = this.importActivities;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("UpsertSettings(shareToStrava=", ", shareAllActivities=", ", templateName=", z4, z13);
            AbstractC36095b.m114694v(str, ", sharedActivities=", ", navBack=", sbM32002u, list);
            return AbstractC36095b.m114682j(sbM32002u, z14, ", importActivities=", z15, ")");
        }
    }

    public /* synthetic */ AbstractC15896b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: gi2.b$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lgi2/b$b;", "Lgi2/b;", "", "navBack", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC15896b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean navBack;

        public b(boolean z4) {
            super(null);
            this.navBack = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNavBack() {
            return this.navBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.navBack == ((b) other).navBack;
        }

        public int hashCode() {
            return Boolean.hashCode(this.navBack);
        }

        public String toString() {
            return AbstractC3855a.m11827k("BffSettings(navBack=", ")", this.navBack);
        }

        public /* synthetic */ b(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4);
        }
    }

    private AbstractC15896b() {
    }
}
