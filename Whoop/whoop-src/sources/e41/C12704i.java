package e41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: e41.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b\u001f\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b\"\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b/\u00105R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b-\u00108¨\u00069"}, m65681d2 = {"Le41/i;", "Lm91/u;", "Lm91/n;", "", "id", "", NotificationCompat.CATEGORY_EVENT, "", "showHighlight", "showSelectionHighlight", "isDraggable", "isOrderable", "shouldHideEndTrim", "toggleInitialState", "Lgz0/m0;", "icon", "previewIcon", "Lcom/whoop/design/util/TextResource;", "title", "Le41/k;", "swipeableTileState", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZZZZZLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;Le41/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "c", "Z", "e", "()Z", "d", "getShowSelectionHighlight", "i", "f", "j", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lgz0/m0;", "()Lgz0/m0;", "k", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "l", "Le41/k;", "()Le41/k;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12704i implements InterfaceC25312u, InterfaceC25305n<String> {

    /* JADX INFO: renamed from: m */
    public static final int f43436m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showHighlight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showSelectionHighlight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isDraggable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isOrderable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean shouldHideEndTrim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean toggleInitialState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC16313m0 previewIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC12706k swipeableTileState;

    public C12704i(String id4, Object event, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, EnumC16313m0 icon, EnumC16313m0 enumC16313m0, TextResource title, EnumC12706k swipeableTileState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(swipeableTileState, "swipeableTileState");
        this.id = id4;
        this.event = event;
        this.showHighlight = z4;
        this.showSelectionHighlight = z13;
        this.isDraggable = z14;
        this.isOrderable = z15;
        this.shouldHideEndTrim = z16;
        this.toggleInitialState = z17;
        this.icon = icon;
        this.previewIcon = enumC16313m0;
        this.title = title;
        this.swipeableTileState = swipeableTileState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getPreviewIcon() {
        return this.previewIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldHideEndTrim() {
        return this.shouldHideEndTrim;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12704i)) {
            return false;
        }
        C12704i c12704i = (C12704i) other;
        return AbstractC22676k.m65745e(this.id, c12704i.id) && AbstractC22676k.m65745e(this.event, c12704i.event) && this.showHighlight == c12704i.showHighlight && this.showSelectionHighlight == c12704i.showSelectionHighlight && this.isDraggable == c12704i.isDraggable && this.isOrderable == c12704i.isOrderable && this.shouldHideEndTrim == c12704i.shouldHideEndTrim && this.toggleInitialState == c12704i.toggleInitialState && this.icon == c12704i.icon && this.previewIcon == c12704i.previewIcon && AbstractC22676k.m65745e(this.title, c12704i.title) && this.swipeableTileState == c12704i.swipeableTileState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC12706k getSwipeableTileState() {
        return this.swipeableTileState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getToggleInitialState() {
        return this.toggleInitialState;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.icon, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC33745d.m106644c(this.id.hashCode() * 31, 31, this.event), 31, this.showHighlight), 31, this.showSelectionHighlight), 31, this.isDraggable), 31, this.isOrderable), 31, this.shouldHideEndTrim), 31, this.toggleInitialState), 31);
        EnumC16313m0 enumC16313m0 = this.previewIcon;
        return this.swipeableTileState.hashCode() + AbstractC31061c.m95625a((iM48500b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.title, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsOrderable() {
        return this.isOrderable;
    }

    public String toString() {
        String str = this.id;
        Object obj = this.event;
        boolean z4 = this.showHighlight;
        boolean z13 = this.showSelectionHighlight;
        boolean z14 = this.isDraggable;
        boolean z15 = this.isOrderable;
        boolean z16 = this.shouldHideEndTrim;
        boolean z17 = this.toggleInitialState;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC16313m0 enumC16313m1 = this.previewIcon;
        TextResource textResource = this.title;
        EnumC12706k enumC12706k = this.swipeableTileState;
        StringBuilder sb4 = new StringBuilder("DraggableTileState(id=");
        sb4.append(str);
        sb4.append(", event=");
        sb4.append(obj);
        sb4.append(", showHighlight=");
        AbstractC38963t7.m124392v(sb4, z4, ", showSelectionHighlight=", z13, ", isDraggable=");
        AbstractC38963t7.m124392v(sb4, z14, ", isOrderable=", z15, ", shouldHideEndTrim=");
        AbstractC38963t7.m124392v(sb4, z16, ", toggleInitialState=", z17, ", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", previewIcon=");
        sb4.append(enumC16313m1);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", swipeableTileState=");
        sb4.append(enumC12706k);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public /* synthetic */ C12704i(String str, Object obj, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, TextResource textResource, EnumC12706k enumC12706k, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C23454a0.f92919a : obj, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? true : z15, (i13 & 64) != 0 ? false : z16, (i13 & 128) != 0 ? false : z17, (i13 & 256) != 0 ? EnumC16313m0.WHOOP_LOGO_CIRCLE : enumC16313m0, (i13 & 512) != 0 ? null : enumC16313m1, textResource, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC12706k.NOT_EXPANDED : enumC12706k);
    }
}
