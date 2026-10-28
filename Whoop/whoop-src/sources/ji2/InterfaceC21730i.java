package ji2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import hi2.C17316a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ji2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lji2/i;", "", "f", "a", "e", "j", "o", "k", "n", "m", "d", "l", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "b", "Lji2/i$a;", "Lji2/i$b;", "Lji2/i$c;", "Lji2/i$e;", "Lji2/i$f;", "Lji2/i$g;", "Lji2/i$h;", "Lji2/i$i;", "Lji2/i$j;", "Lji2/i$l;", "Lji2/i$o;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21730i {

    /* JADX INFO: renamed from: ji2.i$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lji2/i$a;", "Lji2/i;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        public a(String url) {
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.url, ((a) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ConnectClicked(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: ji2.i$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lji2/i$b;", "Lji2/i;", "Lhi2/a;", "disconnectConfirmationData", "<init>", "(Lhi2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi2/a;", "b", "()Lhi2/a;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21730i {

        /* JADX INFO: renamed from: b */
        public static final int f83506b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17316a disconnectConfirmationData;

        public b(C17316a disconnectConfirmationData) {
            AbstractC22676k.m65750j(disconnectConfirmationData, "disconnectConfirmationData");
            this.disconnectConfirmationData = disconnectConfirmationData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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

    /* JADX INFO: renamed from: ji2.i$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lji2/i$c;", "Lji2/i;", "<init>", "()V", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC21730i {

        /* JADX INFO: renamed from: a */
        public static final c f83508a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: ji2.i$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lji2/i$d;", "Lji2/i$o;", "Lji2/m;", "updateSettingsData", "<init>", "(Lji2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji2/m;", "()Lji2/m;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21734m updateSettingsData;

        public d(C21734m updateSettingsData) {
            AbstractC22676k.m65750j(updateSettingsData, "updateSettingsData");
            this.updateSettingsData = updateSettingsData;
        }

        @Override // ji2.InterfaceC21730i.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public C21734m getUpdateSettingsData() {
            return this.updateSettingsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.updateSettingsData, ((d) other).updateSettingsData);
        }

        public int hashCode() {
            return this.updateSettingsData.hashCode();
        }

        public String toString() {
            return "ImportFromStravaClicked(updateSettingsData=" + this.updateSettingsData + ")";
        }
    }

    /* JADX INFO: renamed from: ji2.i$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lji2/i$e;", "Lji2/i;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        public e(String url) {
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.url, ((e) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LearnMoreClicked(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: ji2.i$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lji2/i$g;", "Lji2/i;", "", "newText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newText;

        public g(String newText) {
            AbstractC22676k.m65750j(newText, "newText");
            this.newText = newText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNewText() {
            return this.newText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.newText, ((g) other).newText);
        }

        public int hashCode() {
            return this.newText.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnSearchFieldChange(newText=", this.newText, ")");
        }
    }

    /* JADX INFO: renamed from: ji2.i$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lji2/i$h;", "Lji2/i;", "", "checked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean checked;

        public h(boolean z4) {
            this.checked = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.checked == ((h) other).checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return AbstractC3855a.m11827k("OnToggleAllActivities(checked=", ")", this.checked);
        }
    }

    /* JADX INFO: renamed from: ji2.i$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lji2/i$i;", "Lji2/i;", "", "name", "", "checked", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean checked;

        public i(String name, boolean z4) {
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
            this.checked = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.name, iVar.name) && this.checked == iVar.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("OnToggleIndividualActivity(name=", this.name, ", checked=", ")", this.checked);
        }
    }

    /* JADX INFO: renamed from: ji2.i$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lji2/i$j;", "Lji2/i;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        public j(String url) {
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.url, ((j) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PrivacyPolicyClicked(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: ji2.i$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lji2/i$k;", "Lji2/i$o;", "Lji2/m;", "updateSettingsData", "<init>", "(Lji2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji2/m;", "()Lji2/m;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21734m updateSettingsData;

        public k(C21734m updateSettingsData) {
            AbstractC22676k.m65750j(updateSettingsData, "updateSettingsData");
            this.updateSettingsData = updateSettingsData;
        }

        @Override // ji2.InterfaceC21730i.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public C21734m getUpdateSettingsData() {
            return this.updateSettingsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.updateSettingsData, ((k) other).updateSettingsData);
        }

        public int hashCode() {
            return this.updateSettingsData.hashCode();
        }

        public String toString() {
            return "SaveActivitiesSelectedClicked(updateSettingsData=" + this.updateSettingsData + ")";
        }
    }

    /* JADX INFO: renamed from: ji2.i$l */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b)\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b*\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b-\u0010 R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b&\u0010(¨\u00060"}, m65681d2 = {"Lji2/i$l;", "Lji2/i;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "searchPlaceHolder", "description", "allTextDisplay", "", "allActivities", "popularTitle", "otherTitle", "", "Lji2/c;", "activities", "saveSelectionDisplay", "", "templateName", "automaticallyImportEnabled", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "b", "j", "c", "f", "d", "e", "Z", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Ljava/util/List;", "()Ljava/util/List;", "i", "Ljava/lang/String;", "k", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource titleDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource searchPlaceHolder;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource allTextDisplay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean allActivities;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource popularTitle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource otherTitle;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C21724c> activities;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource saveSelectionDisplay;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String templateName;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean automaticallyImportEnabled;

        public l(TextResource titleDisplay, TextResource searchPlaceHolder, TextResource description, TextResource allTextDisplay, boolean z4, TextResource popularTitle, TextResource otherTitle, List<C21724c> activities, TextResource saveSelectionDisplay, String templateName, boolean z13) {
            AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
            AbstractC22676k.m65750j(searchPlaceHolder, "searchPlaceHolder");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(allTextDisplay, "allTextDisplay");
            AbstractC22676k.m65750j(popularTitle, "popularTitle");
            AbstractC22676k.m65750j(otherTitle, "otherTitle");
            AbstractC22676k.m65750j(activities, "activities");
            AbstractC22676k.m65750j(saveSelectionDisplay, "saveSelectionDisplay");
            AbstractC22676k.m65750j(templateName, "templateName");
            this.titleDisplay = titleDisplay;
            this.searchPlaceHolder = searchPlaceHolder;
            this.description = description;
            this.allTextDisplay = allTextDisplay;
            this.allActivities = z4;
            this.popularTitle = popularTitle;
            this.otherTitle = otherTitle;
            this.activities = activities;
            this.saveSelectionDisplay = saveSelectionDisplay;
            this.templateName = templateName;
            this.automaticallyImportEnabled = z13;
        }

        /* JADX INFO: renamed from: b */
        public final List<C21724c> m61274b() {
            return this.activities;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAllActivities() {
            return this.allActivities;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getAllTextDisplay() {
            return this.allTextDisplay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getAutomaticallyImportEnabled() {
            return this.automaticallyImportEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.titleDisplay, lVar.titleDisplay) && AbstractC22676k.m65745e(this.searchPlaceHolder, lVar.searchPlaceHolder) && AbstractC22676k.m65745e(this.description, lVar.description) && AbstractC22676k.m65745e(this.allTextDisplay, lVar.allTextDisplay) && this.allActivities == lVar.allActivities && AbstractC22676k.m65745e(this.popularTitle, lVar.popularTitle) && AbstractC22676k.m65745e(this.otherTitle, lVar.otherTitle) && AbstractC22676k.m65745e(this.activities, lVar.activities) && AbstractC22676k.m65745e(this.saveSelectionDisplay, lVar.saveSelectionDisplay) && AbstractC22676k.m65745e(this.templateName, lVar.templateName) && this.automaticallyImportEnabled == lVar.automaticallyImportEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getOtherTitle() {
            return this.otherTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getPopularTitle() {
            return this.popularTitle;
        }

        public int hashCode() {
            return Boolean.hashCode(this.automaticallyImportEnabled) + AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.searchPlaceHolder, 31), this.description, 31), this.allTextDisplay, 31), 31, this.allActivities), this.popularTitle, 31), this.otherTitle, 31), 31, this.activities), this.saveSelectionDisplay, 31), 31, this.templateName);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getSaveSelectionDisplay() {
            return this.saveSelectionDisplay;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getSearchPlaceHolder() {
            return this.searchPlaceHolder;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTemplateName() {
            return this.templateName;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getTitleDisplay() {
            return this.titleDisplay;
        }

        public String toString() {
            TextResource textResource = this.titleDisplay;
            TextResource textResource2 = this.searchPlaceHolder;
            TextResource textResource3 = this.description;
            TextResource textResource4 = this.allTextDisplay;
            boolean z4 = this.allActivities;
            TextResource textResource5 = this.popularTitle;
            TextResource textResource6 = this.otherTitle;
            List<C21724c> list = this.activities;
            TextResource textResource7 = this.saveSelectionDisplay;
            String str = this.templateName;
            boolean z13 = this.automaticallyImportEnabled;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("SelectedActivitiesClicked(titleDisplay=", textResource, ", searchPlaceHolder=", textResource2, ", description=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", allTextDisplay=", textResource4, ", allActivities=");
            AbstractC21702c.m61144o(textResource5, ", popularTitle=", ", otherTitle=", sbM106658q, z4);
            AbstractC21702c.m61143n(textResource6, ", activities=", ", saveSelectionDisplay=", sbM106658q, list);
            AbstractC30007c.m91856z(sbM106658q, textResource7, ", templateName=", str, ", automaticallyImportEnabled=");
            return AbstractC18489d0.m53372m(sbM106658q, z13, ")");
        }
    }

    /* JADX INFO: renamed from: ji2.i$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lji2/i$m;", "Lji2/i$o;", "Lji2/m;", "updateSettingsData", "<init>", "(Lji2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji2/m;", "()Lji2/m;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21734m updateSettingsData;

        public m(C21734m updateSettingsData) {
            AbstractC22676k.m65750j(updateSettingsData, "updateSettingsData");
            this.updateSettingsData = updateSettingsData;
        }

        @Override // ji2.InterfaceC21730i.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public C21734m getUpdateSettingsData() {
            return this.updateSettingsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.updateSettingsData, ((m) other).updateSettingsData);
        }

        public int hashCode() {
            return this.updateSettingsData.hashCode();
        }

        public String toString() {
            return "ShareToStravaClicked(updateSettingsData=" + this.updateSettingsData + ")";
        }
    }

    /* JADX INFO: renamed from: ji2.i$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lji2/i$n;", "Lji2/i$o;", "Lji2/m;", "updateSettingsData", "<init>", "(Lji2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji2/m;", "()Lji2/m;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21734m updateSettingsData;

        public n(C21734m updateSettingsData) {
            AbstractC22676k.m65750j(updateSettingsData, "updateSettingsData");
            this.updateSettingsData = updateSettingsData;
        }

        @Override // ji2.InterfaceC21730i.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public C21734m getUpdateSettingsData() {
            return this.updateSettingsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.updateSettingsData, ((n) other).updateSettingsData);
        }

        public int hashCode() {
            return this.updateSettingsData.hashCode();
        }

        public String toString() {
            return "TemplateGraphicClicked(updateSettingsData=" + this.updateSettingsData + ")";
        }
    }

    /* JADX INFO: renamed from: ji2.i$o */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lji2/i$o;", "Lji2/i;", "Lji2/m;", "a", "()Lji2/m;", "updateSettingsData", "Lji2/i$d;", "Lji2/i$k;", "Lji2/i$m;", "Lji2/i$n;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface o extends InterfaceC21730i {
        /* JADX INFO: renamed from: a */
        C21734m getUpdateSettingsData();
    }

    /* JADX INFO: renamed from: ji2.i$f */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lji2/i$f;", "Lji2/i;", "", "code", "state", "scope", "", "navBack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Z", "()Z", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC21730i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String state;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String scope;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean navBack;

        public f(String str, String str2, String str3, boolean z4) {
            this.code = str;
            this.state = str2;
            this.scope = str3;
            this.navBack = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getNavBack() {
            return this.navBack;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.code, fVar.code) && AbstractC22676k.m65745e(this.state, fVar.state) && AbstractC22676k.m65745e(this.scope, fVar.scope) && this.navBack == fVar.navBack;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.state;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.scope;
            return Boolean.hashCode(this.navBack) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.code;
            String str2 = this.state;
            return AbstractC21702c.m61137h(AbstractC11895b.m32001t("LoadSettings(code=", str, ", state=", str2, ", scope="), this.scope, ", navBack=", this.navBack, ")");
        }

        public /* synthetic */ f(String str, String str2, String str3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? false : z4);
        }
    }
}
