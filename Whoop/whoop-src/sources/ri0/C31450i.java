package ri0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import kd1.AbstractC22403o;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ri0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b2\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b\"\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b*\u0010;R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010<\u001a\u0004\b.\u0010=R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b&\u0010?¨\u0006@"}, m65681d2 = {"Lri0/i;", "Lri0/h;", "Lgz0/m0;", "icon", "Lkd1/o;", "iconUrl", "Lcom/whoop/design/util/TextResource;", "contentDescription", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "glowStyle", "", "glowPulse", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lj02/s;", "dismissAction", "Lcom/whoop/design/models/modal/AnyModal;", "dismissModal", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;ZLcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lj02/s;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "i", "()Lgz0/m0;", "b", "Lkd1/o;", "j", "()Lkd1/o;", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "e", "Z", "g", "()Z", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lj02/s;", "()Lj02/s;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31450i implements InterfaceC31449h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o iconUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GlowStyle glowStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean glowPulse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C21166s dismissAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AnyModal dismissModal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C31450i(EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, TextResource textResource, GlowStyle glowStyle, boolean z4, C9598e c9598e, Action action, C21166s c21166s, AnyModal anyModal, AnalyticEventModel analyticEventModel) {
        this.icon = enumC16313m0;
        this.iconUrl = abstractC22403o;
        this.contentDescription = textResource;
        this.glowStyle = glowStyle;
        this.glowPulse = z4;
        this.destination = c9598e;
        this.action = action;
        this.dismissAction = c21166s;
        this.dismissModal = anyModal;
        this.analyticEvent = analyticEventModel;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: a, reason: from getter */
    public Action getAction() {
        return this.action;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: b, reason: from getter */
    public AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: c, reason: from getter */
    public C21166s getDismissAction() {
        return this.dismissAction;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: d, reason: from getter */
    public AnyModal getDismissModal() {
        return this.dismissModal;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: e, reason: from getter */
    public C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31450i)) {
            return false;
        }
        C31450i c31450i = (C31450i) other;
        return this.icon == c31450i.icon && AbstractC22676k.m65745e(this.iconUrl, c31450i.iconUrl) && AbstractC22676k.m65745e(this.contentDescription, c31450i.contentDescription) && this.glowStyle == c31450i.glowStyle && this.glowPulse == c31450i.glowPulse && AbstractC22676k.m65745e(this.destination, c31450i.destination) && AbstractC22676k.m65745e(this.action, c31450i.action) && AbstractC22676k.m65745e(this.dismissAction, c31450i.dismissAction) && AbstractC22676k.m65745e(this.dismissModal, c31450i.dismissModal) && AbstractC22676k.m65745e(this.analyticEvent, c31450i.analyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getGlowPulse() {
        return this.glowPulse;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GlowStyle getGlowStyle() {
        return this.glowStyle;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31;
        AbstractC22403o abstractC22403o = this.iconUrl;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        TextResource textResource = this.contentDescription;
        int iHashCode3 = (iHashCode2 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        GlowStyle glowStyle = this.glowStyle;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (glowStyle == null ? 0 : glowStyle.hashCode())) * 31, 31, this.glowPulse);
        C9598e c9598e = this.destination;
        int iHashCode4 = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode5 = (iHashCode4 + (action == null ? 0 : action.hashCode())) * 31;
        C21166s c21166s = this.dismissAction;
        int iHashCode6 = (iHashCode5 + (c21166s == null ? 0 : c21166s.hashCode())) * 31;
        AnyModal anyModal = this.dismissModal;
        int iHashCode7 = (iHashCode6 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode7 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC22403o getIconUrl() {
        return this.iconUrl;
    }

    public String toString() {
        return "NavigationIconButtonState(icon=" + this.icon + ", iconUrl=" + this.iconUrl + ", contentDescription=" + this.contentDescription + ", glowStyle=" + this.glowStyle + ", glowPulse=" + this.glowPulse + ", destination=" + this.destination + ", action=" + this.action + ", dismissAction=" + this.dismissAction + ", dismissModal=" + this.dismissModal + ", analyticEvent=" + this.analyticEvent + ")";
    }
}
