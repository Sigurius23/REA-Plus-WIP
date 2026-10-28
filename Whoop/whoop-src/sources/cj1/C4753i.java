package cj1;

import com.whoop.design.util.TextResource;
import com.whoop.health.domain.models.HealthTabScrollBackgroundStyle;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cj1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001d\u0017'B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001b\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, m65681d2 = {"Lcj1/i;", "Lfy1/k;", "Lcj1/i$c;", "fullScreenModal", "Lcj1/i$d;", "content", "Lcj1/i$a;", "analyticsData", "Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;", "backgroundStyle", "<init>", "(Lcj1/i$c;Lcj1/i$d;Lcj1/i$a;Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcj1/i$c;", "e", "()Lcj1/i$c;", "c", "Lcj1/i$d;", "d", "()Lcj1/i$d;", "Lcj1/i$a;", "()Lcj1/i$a;", "Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;", "()Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4753i implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final a analyticsData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final HealthTabScrollBackgroundStyle backgroundStyle;

    /* JADX INFO: renamed from: cj1.i$a */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcj1/i$a;", "", "", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        public a(String str, String str2) {
            this.label = str;
            this.value = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return AbstractC22676k.m65745e(this.label, aVar.label) && AbstractC22676k.m65745e(this.value, aVar.value);
        }

        public int hashCode() {
            String str = this.label;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AnalyticsData(label=", this.label, ", value=", this.value, ")");
        }
    }

    /* JADX INFO: renamed from: cj1.i$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcj1/i$d;", "", "", "Lm91/u;", "items", "", "displayPullToRefresh", "displayRefreshingAnimation", "Lcj1/i$b;", "dialogState", "<init>", "(Ljava/util/List;ZZLcj1/i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Z", "()Z", "c", "Lcj1/i$b;", "()Lcj1/i$b;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean displayPullToRefresh;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final b dialogState;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends InterfaceC25312u> items, boolean z4, boolean z13, b bVar) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
            this.displayPullToRefresh = z4;
            this.displayRefreshingAnimation = z13;
            this.dialogState = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getDialogState() {
            return this.dialogState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDisplayPullToRefresh() {
            return this.displayPullToRefresh;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC25312u> m14982d() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.items, dVar.items) && this.displayPullToRefresh == dVar.displayPullToRefresh && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.dialogState, dVar.dialogState);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.displayPullToRefresh), 31, this.displayRefreshingAnimation);
            b bVar = this.dialogState;
            return iM8289b + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "ScreenContent(items=" + this.items + ", displayPullToRefresh=" + this.displayPullToRefresh + ", displayRefreshingAnimation=" + this.displayRefreshingAnimation + ", dialogState=" + this.dialogState + ")";
        }
    }

    public C4753i(c cVar, d dVar, a aVar, HealthTabScrollBackgroundStyle healthTabScrollBackgroundStyle) {
        this.fullScreenModal = cVar;
        this.content = dVar;
        this.analyticsData = aVar;
        this.backgroundStyle = healthTabScrollBackgroundStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getAnalyticsData() {
        return this.analyticsData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final HealthTabScrollBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4753i)) {
            return false;
        }
        C4753i c4753i = (C4753i) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c4753i.fullScreenModal) && AbstractC22676k.m65745e(this.content, c4753i.content) && AbstractC22676k.m65745e(this.analyticsData, c4753i.analyticsData) && this.backgroundStyle == c4753i.backgroundStyle;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        C33211q0 state;
        C33211q0 state2;
        c cVar = this.fullScreenModal;
        AbstractC33208p0 type = null;
        if (((cVar == null || (state2 = cVar.getState()) == null) ? null : state2.getType()) instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        c cVar2 = this.fullScreenModal;
        if (cVar2 != null && (state = cVar2.getState()) != null) {
            type = state.getType();
        }
        if (type instanceof AbstractC33208p0.b) {
            return ScreenState.ERROR;
        }
        return this.content != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
    }

    public int hashCode() {
        c cVar = this.fullScreenModal;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        d dVar = this.content;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.analyticsData;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        HealthTabScrollBackgroundStyle healthTabScrollBackgroundStyle = this.backgroundStyle;
        return iHashCode3 + (healthTabScrollBackgroundStyle != null ? healthTabScrollBackgroundStyle.hashCode() : 0);
    }

    public String toString() {
        return "HealthTabViewState(fullScreenModal=" + this.fullScreenModal + ", content=" + this.content + ", analyticsData=" + this.analyticsData + ", backgroundStyle=" + this.backgroundStyle + ")";
    }

    /* JADX INFO: renamed from: cj1.i$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcj1/i$c;", "", "Lsz0/q0;", "state", "Lcj1/g;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Lsz0/q0;Lcj1/g;Lcj1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "c", "()Lsz0/q0;", "b", "Lcj1/g;", "()Lcj1/g;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: d */
        public static final int f19563d = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC4751g primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC4751g secondaryClickEvent;

        public c(C33211q0 state, InterfaceC4751g interfaceC4751g, InterfaceC4751g interfaceC4751g2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC4751g;
            this.secondaryClickEvent = interfaceC4751g2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4751g getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC4751g getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.state, cVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, cVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, cVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC4751g interfaceC4751g = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC4751g == null ? 0 : interfaceC4751g.hashCode())) * 31;
            InterfaceC4751g interfaceC4751g2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC4751g2 != null ? interfaceC4751g2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ c(C33211q0 c33211q0, InterfaceC4751g interfaceC4751g, InterfaceC4751g interfaceC4751g2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC4751g, (i13 & 4) != 0 ? null : interfaceC4751g2);
        }
    }

    public /* synthetic */ C4753i(c cVar, d dVar, a aVar, HealthTabScrollBackgroundStyle healthTabScrollBackgroundStyle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : cVar, (i13 & 2) != 0 ? null : dVar, (i13 & 4) != 0 ? null : aVar, (i13 & 8) != 0 ? null : healthTabScrollBackgroundStyle);
    }

    /* JADX INFO: renamed from: cj1.i$b */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b\u001c\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b\"\u0010/¨\u00060"}, m65681d2 = {"Lcj1/i$b;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "", "showCloseIcon", "useSolidButtons", "Lj11/p;", "topDialogStyle", "Lcj1/g;", "approveEvent", "dismissEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcj1/g;Lcj1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "Ly81/e;", "d", "()Ly81/e;", "f", "Z", "g", "()Z", "j", "Lj11/p;", "i", "()Lj11/p;", "Lcj1/g;", "()Lcj1/g;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource primaryActionText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC39332e primaryActionColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryActionText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean showCloseIcon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean useSolidButtons;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final EnumC21213p topDialogStyle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final InterfaceC4751g approveEvent;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC4751g dismissEvent;

        public b(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, boolean z4, boolean z13, EnumC21213p topDialogStyle, InterfaceC4751g interfaceC4751g, InterfaceC4751g interfaceC4751g2) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            this.title = title;
            this.primaryActionText = textResource;
            this.primaryActionColor = interfaceC39332e;
            this.secondaryActionText = textResource2;
            this.description = description;
            this.showCloseIcon = z4;
            this.useSolidButtons = z13;
            this.topDialogStyle = topDialogStyle;
            this.approveEvent = interfaceC4751g;
            this.dismissEvent = interfaceC4751g2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4751g getApproveEvent() {
            return this.approveEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC4751g getDismissEvent() {
            return this.dismissEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC39332e getPrimaryActionColor() {
            return this.primaryActionColor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.primaryActionText, bVar.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, bVar.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, bVar.secondaryActionText) && AbstractC22676k.m65745e(this.description, bVar.description) && this.showCloseIcon == bVar.showCloseIcon && this.useSolidButtons == bVar.useSolidButtons && this.topDialogStyle == bVar.topDialogStyle && AbstractC22676k.m65745e(this.approveEvent, bVar.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, bVar.dismissEvent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getSecondaryActionText() {
            return this.secondaryActionText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.primaryActionText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            int iHashCode3 = (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
            TextResource textResource2 = this.secondaryActionText;
            int iM106647f = AbstractC33745d.m106647f(this.topDialogStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.description, 31), 31, this.showCloseIcon), 31, this.useSolidButtons), 31);
            InterfaceC4751g interfaceC4751g = this.approveEvent;
            int iHashCode4 = (iM106647f + (interfaceC4751g == null ? 0 : interfaceC4751g.hashCode())) * 31;
            InterfaceC4751g interfaceC4751g2 = this.dismissEvent;
            return iHashCode4 + (interfaceC4751g2 != null ? interfaceC4751g2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC21213p getTopDialogStyle() {
            return this.topDialogStyle;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getUseSolidButtons() {
            return this.useSolidButtons;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.primaryActionText;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            TextResource textResource3 = this.secondaryActionText;
            TextResource textResource4 = this.description;
            boolean z4 = this.showCloseIcon;
            boolean z13 = this.useSolidButtons;
            EnumC21213p enumC21213p = this.topDialogStyle;
            InterfaceC4751g interfaceC4751g = this.approveEvent;
            InterfaceC4751g interfaceC4751g2 = this.dismissEvent;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("DialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            AbstractC33745d.m106664w(textResource4, ", showCloseIcon=", ", useSolidButtons=", sbM106658q, z4);
            AbstractC33745d.m106666y(sbM106658q, z13, ", topDialogStyle=", enumC21213p, ", approveEvent=");
            sbM106658q.append(interfaceC4751g);
            sbM106658q.append(", dismissEvent=");
            sbM106658q.append(interfaceC4751g2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ b(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, InterfaceC4751g interfaceC4751g, InterfaceC4751g interfaceC4751g2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 256) != 0 ? null : interfaceC4751g, (i13 & 512) != 0 ? null : interfaceC4751g2);
        }
    }
}
