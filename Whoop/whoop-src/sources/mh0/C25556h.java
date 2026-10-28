package mh0;

import com.whoop.design.models.items.ActionButtonStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.ApiRequest;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: mh0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\u001b\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, m65681d2 = {"Lmh0/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "icon", "Lcom/whoop/design/models/items/ActionButtonStyle;", "style", "Ly81/e;", "foregroundColor", "iconColor", "backgroundColor", "Lcom/whoop/navigation/models/ApiRequest;", "request", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/ApiRequest;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "c", "()Lgz0/m0;", "Lcom/whoop/design/models/items/ActionButtonStyle;", "g", "()Lcom/whoop/design/models/items/ActionButtonStyle;", "d", "Ly81/e;", "()Ly81/e;", "e", "f", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25556h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ActionButtonStyle style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e foregroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ApiRequest request;

    public C25556h(TextResource title, EnumC16313m0 enumC16313m0, ActionButtonStyle style, InterfaceC39332e foregroundColor, InterfaceC39332e iconColor, InterfaceC39332e backgroundColor, ApiRequest request) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(foregroundColor, "foregroundColor");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(request, "request");
        this.title = title;
        this.icon = enumC16313m0;
        this.style = style;
        this.foregroundColor = foregroundColor;
        this.iconColor = iconColor;
        this.backgroundColor = backgroundColor;
        this.request = request;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25556h)) {
            return false;
        }
        C25556h c25556h = (C25556h) other;
        return AbstractC22676k.m65745e(this.title, c25556h.title) && this.icon == c25556h.icon && this.style == c25556h.style && AbstractC22676k.m65745e(this.foregroundColor, c25556h.foregroundColor) && AbstractC22676k.m65745e(this.iconColor, c25556h.iconColor) && AbstractC22676k.m65745e(this.backgroundColor, c25556h.backgroundColor) && AbstractC22676k.m65745e(this.request, c25556h.request);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ActionButtonStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return this.request.hashCode() + AbstractC33745d.m106648g(this.backgroundColor, AbstractC33745d.m106648g(this.iconColor, AbstractC33745d.m106648g(this.foregroundColor, (this.style.hashCode() + ((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        ActionButtonStyle actionButtonStyle = this.style;
        InterfaceC39332e interfaceC39332e = this.foregroundColor;
        InterfaceC39332e interfaceC39332e2 = this.iconColor;
        InterfaceC39332e interfaceC39332e3 = this.backgroundColor;
        ApiRequest apiRequest = this.request;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("StartTurnButtonViewState(title=", textResource, ", icon=", enumC16313m0, ", style=");
        sbM61140k.append(actionButtonStyle);
        sbM61140k.append(", foregroundColor=");
        sbM61140k.append(interfaceC39332e);
        sbM61140k.append(", iconColor=");
        sbM61140k.append(interfaceC39332e2);
        sbM61140k.append(", backgroundColor=");
        sbM61140k.append(interfaceC39332e3);
        sbM61140k.append(", request=");
        sbM61140k.append(apiRequest);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
