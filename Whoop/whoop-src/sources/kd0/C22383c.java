package kd0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import ny0.C27256h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: kd0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\b\u001b\"\u0015#$%&\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, m65681d2 = {"Lkd0/c;", "Lfy1/k;", "Lkd0/c$a;", "popUpDialog", "Lkd0/c$d;", "fullScreenModal", "Lkd0/c$g;", "screenContent", "<init>", "(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkd0/c$a;", "c", "()Lkd0/c$a;", "Lkd0/c$d;", "()Lkd0/c$d;", "d", "Lkd0/c$g;", "()Lkd0/c$g;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22383c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final g screenContent;

    /* JADX INFO: renamed from: kd0.c$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkd0/c$a;", "", "", "hashCode", "()I", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {
        public abstract int hashCode();
    }

    /* JADX INFO: renamed from: kd0.c$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lkd0/c$b;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "Lny0/h;", "primaryButton", "secondaryButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Lny0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lny0/h;", "()Lny0/h;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f87539e;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C27256h primaryButton;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C27256h secondaryButton;

        static {
            int i13 = C27256h.f109055z;
            int i14 = TextResource.$stable;
            f87539e = i13 | i14 | i14;
        }

        public b(TextResource title, TextResource description, C27256h primaryButton, C27256h secondaryButton) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButton, "primaryButton");
            AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
            this.title = title;
            this.description = description;
            this.primaryButton = primaryButton;
            this.secondaryButton = secondaryButton;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C27256h getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C27256h getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.description, bVar.description) && AbstractC22676k.m65745e(this.primaryButton, bVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, bVar.secondaryButton);
        }

        public int hashCode() {
            return this.secondaryButton.hashCode() + ((this.primaryButton.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31)) * 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.description;
            C27256h c27256h = this.primaryButton;
            C27256h c27256h2 = this.secondaryButton;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("AttendedAppointmentDialogState(title=", textResource, ", description=", textResource2, ", primaryButton=");
            sbM106658q.append(c27256h);
            sbM106658q.append(", secondaryButton=");
            sbM106658q.append(c27256h2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }
    }

    /* JADX INFO: renamed from: kd0.c$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/c$c;", "", "", "Lm91/u;", "itemViewState", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends InterfaceC25312u> itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m64366a() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.itemViewState, ((c) other).itemViewState);
        }

        public int hashCode() {
            return this.itemViewState.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ComponentItem(itemViewState=", ")", this.itemViewState);
        }
    }

    /* JADX INFO: renamed from: kd0.c$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lkd0/c$e;", "", "", "navigationTitle", "Lkd0/c$f;", "navigationRightButton", "<init>", "(Ljava/lang/String;Lkd0/c$f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lkd0/c$f;", "()Lkd0/c$f;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: c */
        public static final int f87550c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String navigationTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final f navigationRightButton;

        public e(String navigationTitle, f fVar) {
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            this.navigationTitle = navigationTitle;
            this.navigationRightButton = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getNavigationRightButton() {
            return this.navigationRightButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.navigationTitle, eVar.navigationTitle) && AbstractC22676k.m65745e(this.navigationRightButton, eVar.navigationRightButton);
        }

        public int hashCode() {
            int iHashCode = this.navigationTitle.hashCode() * 31;
            f fVar = this.navigationRightButton;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "NavigationBarViewState(navigationTitle=" + this.navigationTitle + ", navigationRightButton=" + this.navigationRightButton + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.c$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lkd0/c$f;", "", "Lgz0/m0;", "icon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lgz0/m0;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "b", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: c */
        public static final int f87553c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C9598e destination;

        public f(EnumC16313m0 enumC16313m0, C9598e c9598e) {
            this.icon = enumC16313m0;
            this.destination = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.icon == fVar.icon && AbstractC22676k.m65745e(this.destination, fVar.destination);
        }

        public int hashCode() {
            EnumC16313m0 enumC16313m0 = this.icon;
            int iHashCode = (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31;
            C9598e c9598e = this.destination;
            return iHashCode + (c9598e != null ? c9598e.hashCode() : 0);
        }

        public String toString() {
            return "NavigationButtonViewState(icon=" + this.icon + ", destination=" + this.destination + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.c$h */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkd0/c$h;", "", "", "text", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, List<? extends InterfaceC25312u> items) {
            AbstractC22676k.m65750j(items, "items");
            this.text = str;
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m64383a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.text, hVar.text) && AbstractC22676k.m65745e(this.items, hVar.items);
        }

        public int hashCode() {
            String str = this.text;
            return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("StickyFooter(text=", this.text, ", items=", ")", this.items);
        }
    }

    public C22383c(a aVar, d dVar, g gVar) {
        this.popUpDialog = aVar;
        this.fullScreenModal = dVar;
        this.screenContent = gVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22383c)) {
            return false;
        }
        C22383c c22383c = (C22383c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c22383c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c22383c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c22383c.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        d dVar = this.fullScreenModal;
        if (dVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = dVar.getState().getType();
        if (AbstractC22676k.m65745e(type, AbstractC33208p0.c.f138471e)) {
            return ScreenState.LOADING;
        }
        if (type instanceof AbstractC33208p0.b) {
            return ScreenState.ERROR;
        }
        return type instanceof AbstractC33208p0.h ? ScreenState.SUCCESS : ScreenState.OTHER;
    }

    public int hashCode() {
        int i13 = 0 * 31;
        d dVar = this.fullScreenModal;
        int iHashCode = (i13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g gVar = this.screenContent;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "AdvancedLabsViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: kd0.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lkd0/c$d;", "", "Lsz0/q0;", "state", "Lkd0/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lkd0/a;Lkd0/a;Lkd0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lkd0/a;", "()Lkd0/a;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: e */
        public static final int f87545e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC22381a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC22381a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC22381a backClickEvent;

        public d(C33211q0 state, InterfaceC22381a interfaceC22381a, InterfaceC22381a interfaceC22381a2, InterfaceC22381a interfaceC22381a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC22381a;
            this.secondaryClickEvent = interfaceC22381a2;
            this.backClickEvent = interfaceC22381a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC22381a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC22381a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC22381a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.state, dVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, dVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, dVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, dVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC22381a interfaceC22381a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC22381a == null ? 0 : interfaceC22381a.hashCode())) * 31;
            InterfaceC22381a interfaceC22381a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC22381a2 == null ? 0 : interfaceC22381a2.hashCode())) * 31;
            InterfaceC22381a interfaceC22381a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC22381a3 != null ? interfaceC22381a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ d(C33211q0 c33211q0, InterfaceC22381a interfaceC22381a, InterfaceC22381a interfaceC22381a2, InterfaceC22381a interfaceC22381a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC22381a, (i13 & 4) != 0 ? null : interfaceC22381a2, (i13 & 8) != 0 ? null : interfaceC22381a3);
        }
    }

    public /* synthetic */ C22383c(a aVar, d dVar, g gVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : dVar, (i13 & 4) != 0 ? null : gVar);
    }

    /* JADX INFO: renamed from: kd0.c$g */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b\u001f\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b'\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u0010\u0018R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b#\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lkd0/c$g;", "", "Lep0/j;", "screenContextMetadata", "Lkd0/c$e;", "navigationBar", "", "Lkd0/c$c;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "", "displayRefreshingSpinner", "Lkd0/c$h;", "stickyFooter", "", "selectedSegmentId", "Lkd0/c$b;", "attendedAppointmentDialog", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "appointmentSummaryBottomSheet", "<init>", "(Lep0/j;Lkd0/c$e;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;ZLkd0/c$h;Ljava/lang/String;Lkd0/c$b;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lep0/j;", "e", "()Lep0/j;", "b", "Lkd0/c$e;", "d", "()Lkd0/c$e;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "Z", "()Z", "Lkd0/c$h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd0/c$h;", "g", "Ljava/lang/String;", "Lkd0/c$b;", "()Lkd0/c$b;", "i", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "getAppointmentSummaryBottomSheet", "()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final e navigationBar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<c> sections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean displayRefreshingSpinner;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final h stickyFooter;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final b attendedAppointmentDialog;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final AppointmentSummaryBottomSheet appointmentSummaryBottomSheet;

        public g(C13404j c13404j, e navigationBar, List<c> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, boolean z4, h hVar, String str, b bVar, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet) {
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(sections, "sections");
            this.screenContextMetadata = c13404j;
            this.navigationBar = navigationBar;
            this.sections = sections;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
            this.displayRefreshingSpinner = z4;
            this.stickyFooter = hVar;
            this.selectedSegmentId = str;
            this.attendedAppointmentDialog = bVar;
            this.appointmentSummaryBottomSheet = appointmentSummaryBottomSheet;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getAttendedAppointmentDialog() {
            return this.attendedAppointmentDialog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplayRefreshingSpinner() {
            return this.displayRefreshingSpinner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getNavigationBar() {
            return this.navigationBar;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.screenContextMetadata, gVar.screenContextMetadata) && AbstractC22676k.m65745e(this.navigationBar, gVar.navigationBar) && AbstractC22676k.m65745e(this.sections, gVar.sections) && AbstractC22676k.m65745e(this.analyticsData, gVar.analyticsData) && this.displayRefreshingSpinner == gVar.displayRefreshingSpinner && AbstractC22676k.m65745e(this.stickyFooter, gVar.stickyFooter) && AbstractC22676k.m65745e(this.selectedSegmentId, gVar.selectedSegmentId) && AbstractC22676k.m65745e(this.attendedAppointmentDialog, gVar.attendedAppointmentDialog) && AbstractC22676k.m65745e(this.appointmentSummaryBottomSheet, gVar.appointmentSummaryBottomSheet);
        }

        /* JADX INFO: renamed from: f */
        public final List<c> m64380f() {
            return this.sections;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final h getStickyFooter() {
            return this.stickyFooter;
        }

        public int hashCode() {
            C13404j c13404j = this.screenContextMetadata;
            int iM31983b = AbstractC11895b.m31983b((this.navigationBar.hashCode() + ((c13404j == null ? 0 : c13404j.hashCode()) * 31)) * 31, 31, this.sections);
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            int iM8289b = AbstractC2875y.m8289b((iM31983b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31, 31, this.displayRefreshingSpinner);
            h hVar = this.stickyFooter;
            int iHashCode = (iM8289b + (hVar == null ? 0 : hVar.hashCode())) * 31;
            String str = this.selectedSegmentId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.attendedAppointmentDialog;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            AppointmentSummaryBottomSheet appointmentSummaryBottomSheet = this.appointmentSummaryBottomSheet;
            return iHashCode3 + (appointmentSummaryBottomSheet != null ? appointmentSummaryBottomSheet.hashCode() : 0);
        }

        public String toString() {
            return "ScreenContent(screenContextMetadata=" + this.screenContextMetadata + ", navigationBar=" + this.navigationBar + ", sections=" + this.sections + ", analyticsData=" + this.analyticsData + ", displayRefreshingSpinner=" + this.displayRefreshingSpinner + ", stickyFooter=" + this.stickyFooter + ", selectedSegmentId=" + this.selectedSegmentId + ", attendedAppointmentDialog=" + this.attendedAppointmentDialog + ", appointmentSummaryBottomSheet=" + this.appointmentSummaryBottomSheet + ")";
        }

        public /* synthetic */ g(C13404j c13404j, e eVar, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, boolean z4, h hVar, String str, b bVar, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : c13404j, eVar, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : advancedLabsAnalyticsDomainModel, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : hVar, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : bVar, (i13 & 256) != 0 ? null : appointmentSummaryBottomSheet);
        }
    }
}
