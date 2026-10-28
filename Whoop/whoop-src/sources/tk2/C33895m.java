package tk2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33211q0;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import zk2.C40845f;
import zk2.C40851l;

/* JADX INFO: renamed from: tk2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0018B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ltk2/m;", "Lm91/u;", "Ltk2/m$a;", "fullScreenModal", "Ltk2/m$b;", "screenSuccessContent", "Lcom/whoop/navigation/e;", "pendingExitEvent", "<init>", "(Ltk2/m$a;Ltk2/m$b;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltk2/m$a;", "()Ltk2/m$a;", "b", "Ltk2/m$b;", "c", "()Ltk2/m$b;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33895m implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b screenSuccessContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e pendingExitEvent;

    public C33895m(a aVar, b bVar, C9598e c9598e) {
        this.fullScreenModal = aVar;
        this.screenSuccessContent = bVar;
        this.pendingExitEvent = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getPendingExitEvent() {
        return this.pendingExitEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getScreenSuccessContent() {
        return this.screenSuccessContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33895m)) {
            return false;
        }
        C33895m c33895m = (C33895m) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c33895m.fullScreenModal) && AbstractC22676k.m65745e(this.screenSuccessContent, c33895m.screenSuccessContent) && AbstractC22676k.m65745e(this.pendingExitEvent, c33895m.pendingExitEvent);
    }

    public int hashCode() {
        a aVar = this.fullScreenModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.screenSuccessContent;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C9598e c9598e = this.pendingExitEvent;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        a aVar = this.fullScreenModal;
        b bVar = this.screenSuccessContent;
        C9598e c9598e = this.pendingExitEvent;
        StringBuilder sb4 = new StringBuilder("TrackSessionMiniArchViewState(fullScreenModal=");
        sb4.append(aVar);
        sb4.append(", screenSuccessContent=");
        sb4.append(bVar);
        sb4.append(", pendingExitEvent=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    /* JADX INFO: renamed from: tk2.m$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Ltk2/m$a;", "", "Lsz0/q0;", "state", "Ltk2/j;", "primaryClickEvent", "Ltk2/j$l;", "secondaryClickEvent", "dismissClickEvent", "<init>", "(Lsz0/q0;Ltk2/j;Ltk2/j$l;Ltk2/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Ltk2/j;", "()Ltk2/j;", "c", "Ltk2/j$l;", "()Ltk2/j$l;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: e */
        public static final int f142037e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC33892j primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC33892j.l secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC33892j dismissClickEvent;

        public a(C33211q0 state, InterfaceC33892j interfaceC33892j, InterfaceC33892j.l lVar, InterfaceC33892j interfaceC33892j2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC33892j;
            this.secondaryClickEvent = lVar;
            this.dismissClickEvent = interfaceC33892j2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC33892j getDismissClickEvent() {
            return this.dismissClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC33892j getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC33892j.l getSecondaryClickEvent() {
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
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.dismissClickEvent, aVar.dismissClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC33892j interfaceC33892j = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC33892j == null ? 0 : interfaceC33892j.hashCode())) * 31;
            InterfaceC33892j.l lVar = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            InterfaceC33892j interfaceC33892j2 = this.dismissClickEvent;
            return iHashCode3 + (interfaceC33892j2 != null ? interfaceC33892j2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", dismissClickEvent=" + this.dismissClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, InterfaceC33892j interfaceC33892j, InterfaceC33892j.l lVar, InterfaceC33892j interfaceC33892j2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC33892j, (i13 & 4) != 0 ? null : lVar, (i13 & 8) != 0 ? null : interfaceC33892j2);
        }
    }

    public /* synthetic */ C33895m(a aVar, b bVar, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : c9598e);
    }

    /* JADX INFO: renamed from: tk2.m$b */
    @Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b(\u0010+R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b3\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b2\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b,\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b$\u0010?¨\u0006@"}, m65681d2 = {"Ltk2/m$b;", "", "Lzk2/f;", "tagGroup", "", "", "Ltk2/a;", "tabContent", "Lzk2/l;", "liveBottomContentByTab", "Ltk2/q;", "tabBackgrounds", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "toolbarDurationLeading", "toolbarDurationTrailing", "toolbarDurationTargetText", "Ltk2/n;", "toolbarDurationProgressBar", "Ly81/f;", "backgroundColor", "", "isPaused", "primaryButtonText", "Ltk2/i;", "dialogState", "<init>", "(Lzk2/f;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltk2/n;Ly81/f;ZLcom/whoop/design/util/TextResource;Ltk2/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lzk2/f;", "f", "()Lzk2/f;", "b", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "c", "d", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "g", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ltk2/n;", "()Ltk2/n;", "Ly81/f;", "getBackgroundColor", "()Ly81/f;", "Z", "l", "()Z", "m", "Ltk2/i;", "()Ltk2/i;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40845f tagGroup;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, C33883a> tabContent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<String, C40851l> liveBottomContentByTab;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Map<String, InterfaceC33899q> tabBackgrounds;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource toolbarDurationLeading;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource toolbarDurationTrailing;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource toolbarDurationTargetText;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C33896n toolbarDurationProgressBar;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final EnumC39333f backgroundColor;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean isPaused;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final C33891i dialogState;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C40845f tagGroup, Map<String, C33883a> tabContent, Map<String, C40851l> liveBottomContentByTab, Map<String, ? extends InterfaceC33899q> tabBackgrounds, TextResource toolbarTitle, TextResource toolbarDurationLeading, TextResource toolbarDurationTrailing, TextResource textResource, C33896n c33896n, EnumC39333f enumC39333f, boolean z4, TextResource textResource2, C33891i c33891i) {
            AbstractC22676k.m65750j(tagGroup, "tagGroup");
            AbstractC22676k.m65750j(tabContent, "tabContent");
            AbstractC22676k.m65750j(liveBottomContentByTab, "liveBottomContentByTab");
            AbstractC22676k.m65750j(tabBackgrounds, "tabBackgrounds");
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(toolbarDurationLeading, "toolbarDurationLeading");
            AbstractC22676k.m65750j(toolbarDurationTrailing, "toolbarDurationTrailing");
            this.tagGroup = tagGroup;
            this.tabContent = tabContent;
            this.liveBottomContentByTab = liveBottomContentByTab;
            this.tabBackgrounds = tabBackgrounds;
            this.toolbarTitle = toolbarTitle;
            this.toolbarDurationLeading = toolbarDurationLeading;
            this.toolbarDurationTrailing = toolbarDurationTrailing;
            this.toolbarDurationTargetText = textResource;
            this.toolbarDurationProgressBar = c33896n;
            this.backgroundColor = enumC39333f;
            this.isPaused = z4;
            this.primaryButtonText = textResource2;
            this.dialogState = c33891i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C33891i getDialogState() {
            return this.dialogState;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, C40851l> m107222b() {
            return this.liveBottomContentByTab;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, InterfaceC33899q> m107224d() {
            return this.tabBackgrounds;
        }

        /* JADX INFO: renamed from: e */
        public final Map<String, C33883a> m107225e() {
            return this.tabContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.tagGroup, bVar.tagGroup) && AbstractC22676k.m65745e(this.tabContent, bVar.tabContent) && AbstractC22676k.m65745e(this.liveBottomContentByTab, bVar.liveBottomContentByTab) && AbstractC22676k.m65745e(this.tabBackgrounds, bVar.tabBackgrounds) && AbstractC22676k.m65745e(this.toolbarTitle, bVar.toolbarTitle) && AbstractC22676k.m65745e(this.toolbarDurationLeading, bVar.toolbarDurationLeading) && AbstractC22676k.m65745e(this.toolbarDurationTrailing, bVar.toolbarDurationTrailing) && AbstractC22676k.m65745e(this.toolbarDurationTargetText, bVar.toolbarDurationTargetText) && AbstractC22676k.m65745e(this.toolbarDurationProgressBar, bVar.toolbarDurationProgressBar) && this.backgroundColor == bVar.backgroundColor && this.isPaused == bVar.isPaused && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText) && AbstractC22676k.m65745e(this.dialogState, bVar.dialogState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C40845f getTagGroup() {
            return this.tagGroup;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getToolbarDurationLeading() {
            return this.toolbarDurationLeading;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C33896n getToolbarDurationProgressBar() {
            return this.toolbarDurationProgressBar;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC3855a.m11821e(this.tabBackgrounds, AbstractC3855a.m11821e(this.liveBottomContentByTab, AbstractC3855a.m11821e(this.tabContent, this.tagGroup.hashCode() * 31, 31), 31), 31), this.toolbarTitle, 31), this.toolbarDurationLeading, 31), this.toolbarDurationTrailing, 31);
            TextResource textResource = this.toolbarDurationTargetText;
            int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
            C33896n c33896n = this.toolbarDurationProgressBar;
            int iHashCode2 = (iHashCode + (c33896n == null ? 0 : c33896n.hashCode())) * 31;
            EnumC39333f enumC39333f = this.backgroundColor;
            int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31, this.isPaused);
            TextResource textResource2 = this.primaryButtonText;
            int iHashCode3 = (iM8289b + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            C33891i c33891i = this.dialogState;
            return iHashCode3 + (c33891i != null ? c33891i.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getToolbarDurationTargetText() {
            return this.toolbarDurationTargetText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getToolbarDurationTrailing() {
            return this.toolbarDurationTrailing;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsPaused() {
            return this.isPaused;
        }

        public String toString() {
            C40845f c40845f = this.tagGroup;
            Map<String, C33883a> map = this.tabContent;
            Map<String, C40851l> map2 = this.liveBottomContentByTab;
            Map<String, InterfaceC33899q> map3 = this.tabBackgrounds;
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.toolbarDurationLeading;
            TextResource textResource3 = this.toolbarDurationTrailing;
            TextResource textResource4 = this.toolbarDurationTargetText;
            C33896n c33896n = this.toolbarDurationProgressBar;
            EnumC39333f enumC39333f = this.backgroundColor;
            boolean z4 = this.isPaused;
            TextResource textResource5 = this.primaryButtonText;
            C33891i c33891i = this.dialogState;
            StringBuilder sb4 = new StringBuilder("ScreenSuccessContent(tagGroup=");
            sb4.append(c40845f);
            sb4.append(", tabContent=");
            sb4.append(map);
            sb4.append(", liveBottomContentByTab=");
            AbstractC3855a.m11840x(sb4, map2, ", tabBackgrounds=", map3, ", toolbarTitle=");
            AbstractC30007c.m91855y(sb4, textResource, ", toolbarDurationLeading=", textResource2, ", toolbarDurationTrailing=");
            AbstractC30007c.m91855y(sb4, textResource3, ", toolbarDurationTargetText=", textResource4, ", toolbarDurationProgressBar=");
            sb4.append(c33896n);
            sb4.append(", backgroundColor=");
            sb4.append(enumC39333f);
            sb4.append(", isPaused=");
            AbstractC21702c.m61144o(textResource5, ", primaryButtonText=", ", dialogState=", sb4, z4);
            sb4.append(c33891i);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(C40845f c40845f, Map map, Map map2, Map map3, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, C33896n c33896n, EnumC39333f enumC39333f, boolean z4, TextResource textResource5, C33891i c33891i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            int i14 = i13 & 4;
            C25272z c25272z = C25272z.f99163w;
            this(c40845f, map, i14 != 0 ? c25272z : map2, (i13 & 8) != 0 ? c25272z : map3, textResource, textResource2, textResource3, (i13 & 128) != 0 ? null : textResource4, (i13 & 256) != 0 ? null : c33896n, (i13 & 512) != 0 ? null : enumC39333f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : textResource5, (i13 & 4096) != 0 ? null : c33891i);
        }
    }
}
