package ce0;

import c31.C3927k;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import de0.C11980a;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: ce0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lce0/d;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lce0/d$a;", "Lce0/d$b;", "Lce0/d$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4489d implements InterfaceC14875k {

    /* JADX INFO: renamed from: ce0.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lce0/d$a;", "Lce0/d;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC4489d {

        /* JADX INFO: renamed from: b */
        public static final a f18068b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ce0.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lce0/d$b;", "Lce0/d;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC4489d {

        /* JADX INFO: renamed from: b */
        public static final b f18069b = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC4489d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof b) {
            return ScreenState.LOADING;
        }
        if (this instanceof a) {
            return ScreenState.ERROR;
        }
        if (this instanceof c) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC4489d() {
    }

    /* JADX INFO: renamed from: ce0.d$c */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J¢\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b*\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b.\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b)\u0010;\u001a\u0004\b7\u0010<R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b(\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\b@\u0010\u001c¨\u0006A"}, m65681d2 = {"Lce0/d$c;", "Lce0/d;", "", "title", "subtitle", "searchHeaderDisplay", "Lm91/u;", "testTile", "Lce0/a;", "formContent", "Lc31/k;", "button", "Lcom/whoop/navigation/e;", "buttonDestination", "Lde0/a;", "selectedAppointment", "Lsz0/q0;", "modalViewState", "", "isSearching", "episodeId", "biomarkerTestId", "testType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lce0/a;Lc31/k;Lcom/whoop/navigation/e;Lde0/a;Lsz0/q0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lce0/d$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "o", "c", "l", "d", "j", "e", "Lm91/u;", "m", "()Lm91/u;", "f", "Lce0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lce0/a;", "g", "Lc31/k;", "()Lc31/k;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "i", "Lde0/a;", "k", "()Lde0/a;", "Lsz0/q0;", "()Lsz0/q0;", "Z", "p", "()Z", "n", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4489d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String searchHeaderDisplay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC25312u testTile;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C4486a formContent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C3927k button;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C9598e buttonDestination;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C11980a selectedAppointment;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C33211q0 modalViewState;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean isSearching;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String episodeId;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String biomarkerTestId;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final String testType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String title, String subtitle, String searchHeaderDisplay, InterfaceC25312u interfaceC25312u, C4486a c4486a, C3927k button, C9598e c9598e, C11980a c11980a, C33211q0 c33211q0, boolean z4, String str, String str2, String str3) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(searchHeaderDisplay, "searchHeaderDisplay");
            AbstractC22676k.m65750j(button, "button");
            this.title = title;
            this.subtitle = subtitle;
            this.searchHeaderDisplay = searchHeaderDisplay;
            this.testTile = interfaceC25312u;
            this.formContent = c4486a;
            this.button = button;
            this.buttonDestination = c9598e;
            this.selectedAppointment = c11980a;
            this.modalViewState = c33211q0;
            this.isSearching = z4;
            this.episodeId = str;
            this.biomarkerTestId = str2;
            this.testType = str3;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ c m14041c(c cVar, String str, String str2, String str3, InterfaceC25312u interfaceC25312u, C4486a c4486a, C3927k c3927k, C9598e c9598e, C11980a c11980a, C33211q0 c33211q0, boolean z4, String str4, String str5, String str6, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = cVar.title;
            }
            return cVar.m14042b(str, (i13 & 2) != 0 ? cVar.subtitle : str2, (i13 & 4) != 0 ? cVar.searchHeaderDisplay : str3, (i13 & 8) != 0 ? cVar.testTile : interfaceC25312u, (i13 & 16) != 0 ? cVar.formContent : c4486a, (i13 & 32) != 0 ? cVar.button : c3927k, (i13 & 64) != 0 ? cVar.buttonDestination : c9598e, (i13 & 128) != 0 ? cVar.selectedAppointment : c11980a, (i13 & 256) != 0 ? cVar.modalViewState : c33211q0, (i13 & 512) != 0 ? cVar.isSearching : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? cVar.episodeId : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? cVar.biomarkerTestId : str5, (i13 & 4096) != 0 ? cVar.testType : str6);
        }

        /* JADX INFO: renamed from: b */
        public final c m14042b(String title, String subtitle, String searchHeaderDisplay, InterfaceC25312u testTile, C4486a formContent, C3927k button, C9598e buttonDestination, C11980a selectedAppointment, C33211q0 modalViewState, boolean isSearching, String episodeId, String biomarkerTestId, String testType) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(searchHeaderDisplay, "searchHeaderDisplay");
            AbstractC22676k.m65750j(button, "button");
            return new c(title, subtitle, searchHeaderDisplay, testTile, formContent, button, buttonDestination, selectedAppointment, modalViewState, isSearching, episodeId, biomarkerTestId, testType);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getBiomarkerTestId() {
            return this.biomarkerTestId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C3927k getButton() {
            return this.button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.searchHeaderDisplay, cVar.searchHeaderDisplay) && AbstractC22676k.m65745e(this.testTile, cVar.testTile) && AbstractC22676k.m65745e(this.formContent, cVar.formContent) && AbstractC22676k.m65745e(this.button, cVar.button) && AbstractC22676k.m65745e(this.buttonDestination, cVar.buttonDestination) && AbstractC22676k.m65745e(this.selectedAppointment, cVar.selectedAppointment) && AbstractC22676k.m65745e(this.modalViewState, cVar.modalViewState) && this.isSearching == cVar.isSearching && AbstractC22676k.m65745e(this.episodeId, cVar.episodeId) && AbstractC22676k.m65745e(this.biomarkerTestId, cVar.biomarkerTestId) && AbstractC22676k.m65745e(this.testType, cVar.testType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C9598e getButtonDestination() {
            return this.buttonDestination;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getEpisodeId() {
            return this.episodeId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C4486a getFormContent() {
            return this.formContent;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.searchHeaderDisplay);
            InterfaceC25312u interfaceC25312u = this.testTile;
            int iHashCode = (iM30450d + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
            C4486a c4486a = this.formContent;
            int iHashCode2 = (this.button.hashCode() + ((iHashCode + (c4486a == null ? 0 : c4486a.hashCode())) * 31)) * 31;
            C9598e c9598e = this.buttonDestination;
            int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
            C11980a c11980a = this.selectedAppointment;
            int iHashCode4 = (iHashCode3 + (c11980a == null ? 0 : c11980a.hashCode())) * 31;
            C33211q0 c33211q0 = this.modalViewState;
            int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (c33211q0 == null ? 0 : c33211q0.hashCode())) * 31, 31, this.isSearching);
            String str = this.episodeId;
            int iHashCode5 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.biomarkerTestId;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.testType;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C33211q0 getModalViewState() {
            return this.modalViewState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSearchHeaderDisplay() {
            return this.searchHeaderDisplay;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C11980a getSelectedAppointment() {
            return this.selectedAppointment;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC25312u getTestTile() {
            return this.testTile;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getIsSearching() {
            return this.isSearching;
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.searchHeaderDisplay;
            InterfaceC25312u interfaceC25312u = this.testTile;
            C4486a c4486a = this.formContent;
            C3927k c3927k = this.button;
            C9598e c9598e = this.buttonDestination;
            C11980a c11980a = this.selectedAppointment;
            C33211q0 c33211q0 = this.modalViewState;
            boolean z4 = this.isSearching;
            String str4 = this.episodeId;
            String str5 = this.biomarkerTestId;
            String str6 = this.testType;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Success(title=", str, ", subtitle=", str2, ", searchHeaderDisplay=");
            sbM32001t.append(str3);
            sbM32001t.append(", testTile=");
            sbM32001t.append(interfaceC25312u);
            sbM32001t.append(", formContent=");
            sbM32001t.append(c4486a);
            sbM32001t.append(", button=");
            sbM32001t.append(c3927k);
            sbM32001t.append(", buttonDestination=");
            sbM32001t.append(c9598e);
            sbM32001t.append(", selectedAppointment=");
            sbM32001t.append(c11980a);
            sbM32001t.append(", modalViewState=");
            sbM32001t.append(c33211q0);
            sbM32001t.append(", isSearching=");
            sbM32001t.append(z4);
            sbM32001t.append(", episodeId=");
            AbstractC11266d.m30444B(sbM32001t, str4, ", biomarkerTestId=", str5, ", testType=");
            return AbstractC25012a.m73376i(str6, ")", sbM32001t);
        }

        public /* synthetic */ c(String str, String str2, String str3, InterfaceC25312u interfaceC25312u, C4486a c4486a, C3927k c3927k, C9598e c9598e, C11980a c11980a, C33211q0 c33211q0, boolean z4, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i13 & 8) != 0 ? null : interfaceC25312u, c4486a, c3927k, (i13 & 64) != 0 ? null : c9598e, (i13 & 128) != 0 ? null : c11980a, (i13 & 256) != 0 ? null : c33211q0, (i13 & 512) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str5, (i13 & 4096) != 0 ? null : str6);
        }
    }
}
