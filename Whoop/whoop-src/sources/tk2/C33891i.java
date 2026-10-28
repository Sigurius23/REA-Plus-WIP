package tk2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tk2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001d\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010%¨\u0006&"}, m65681d2 = {"Ltk2/i;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "primaryActionText", "secondaryActionText", "Ltk2/j$l;", "approveEvent", "dismissEvent", "", "isLoading", "usePrimaryWhiteButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltk2/j$l;Ltk2/j$l;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "e", "Ltk2/j$l;", "()Ltk2/j$l;", "g", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33891i {

    /* JADX INFO: renamed from: i */
    public static final int f141976i = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource primaryActionText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondaryActionText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC33892j.l approveEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC33892j.l dismissEvent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean usePrimaryWhiteButton;

    public C33891i(TextResource title, TextResource description, TextResource primaryActionText, TextResource secondaryActionText, InterfaceC33892j.l approveEvent, InterfaceC33892j.l dismissEvent, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryActionText, "primaryActionText");
        AbstractC22676k.m65750j(secondaryActionText, "secondaryActionText");
        AbstractC22676k.m65750j(approveEvent, "approveEvent");
        AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
        this.title = title;
        this.description = description;
        this.primaryActionText = primaryActionText;
        this.secondaryActionText = secondaryActionText;
        this.approveEvent = approveEvent;
        this.dismissEvent = dismissEvent;
        this.isLoading = z4;
        this.usePrimaryWhiteButton = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC33892j.l getApproveEvent() {
        return this.approveEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC33892j.l getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPrimaryActionText() {
        return this.primaryActionText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSecondaryActionText() {
        return this.secondaryActionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33891i)) {
            return false;
        }
        C33891i c33891i = (C33891i) other;
        return AbstractC22676k.m65745e(this.title, c33891i.title) && AbstractC22676k.m65745e(this.description, c33891i.description) && AbstractC22676k.m65745e(this.primaryActionText, c33891i.primaryActionText) && AbstractC22676k.m65745e(this.secondaryActionText, c33891i.secondaryActionText) && AbstractC22676k.m65745e(this.approveEvent, c33891i.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, c33891i.dismissEvent) && this.isLoading == c33891i.isLoading && this.usePrimaryWhiteButton == c33891i.usePrimaryWhiteButton;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getUsePrimaryWhiteButton() {
        return this.usePrimaryWhiteButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return Boolean.hashCode(this.usePrimaryWhiteButton) + AbstractC2875y.m8289b((this.dismissEvent.hashCode() + ((this.approveEvent.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.primaryActionText, 31), this.secondaryActionText, 31)) * 31)) * 31, 31, this.isLoading);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.primaryActionText;
        TextResource textResource4 = this.secondaryActionText;
        InterfaceC33892j.l lVar = this.approveEvent;
        InterfaceC33892j.l lVar2 = this.dismissEvent;
        boolean z4 = this.isLoading;
        boolean z13 = this.usePrimaryWhiteButton;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TrackSessionMiniArchDialogState(title=", textResource, ", description=", textResource2, ", primaryActionText=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", secondaryActionText=", textResource4, ", approveEvent=");
        sbM106658q.append(lVar);
        sbM106658q.append(", dismissEvent=");
        sbM106658q.append(lVar2);
        sbM106658q.append(", isLoading=");
        return AbstractC36095b.m114682j(sbM106658q, z4, ", usePrimaryWhiteButton=", z13, ")");
    }

    public /* synthetic */ C33891i(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC33892j.l lVar, InterfaceC33892j.l lVar2, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, textResource4, lVar, lVar2, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13);
    }
}
