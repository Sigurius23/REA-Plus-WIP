package p41;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: p41.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lp41/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "collapsedTitle", "expandedTitle", "Lgz0/m0;", "collapsedIcon", "expandedIcon", "", "style", "", "isExpanded", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Z)Lp41/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "g", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "f", "Ljava/lang/String;", "getStyle", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28833d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource collapsedTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource expandedTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 collapsedIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 expandedIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isExpanded;

    public C28833d(TextResource collapsedTitle, TextResource expandedTitle, EnumC16313m0 collapsedIcon, EnumC16313m0 expandedIcon, String str, boolean z4) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        this.collapsedTitle = collapsedTitle;
        this.expandedTitle = expandedTitle;
        this.collapsedIcon = collapsedIcon;
        this.expandedIcon = expandedIcon;
        this.style = str;
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28833d m87698b(C28833d c28833d, TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c28833d.collapsedTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c28833d.expandedTitle;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c28833d.collapsedIcon;
        }
        if ((i13 & 8) != 0) {
            enumC16313m1 = c28833d.expandedIcon;
        }
        if ((i13 & 16) != 0) {
            str = c28833d.style;
        }
        if ((i13 & 32) != 0) {
            z4 = c28833d.isExpanded;
        }
        String str2 = str;
        boolean z13 = z4;
        return c28833d.m87699a(textResource, textResource2, enumC16313m0, enumC16313m1, str2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C28833d m87699a(TextResource collapsedTitle, TextResource expandedTitle, EnumC16313m0 collapsedIcon, EnumC16313m0 expandedIcon, String style, boolean isExpanded) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        return new C28833d(collapsedTitle, expandedTitle, collapsedIcon, expandedIcon, style, isExpanded);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getCollapsedIcon() {
        return this.collapsedIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getCollapsedTitle() {
        return this.collapsedTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28833d)) {
            return false;
        }
        C28833d c28833d = (C28833d) other;
        return AbstractC22676k.m65745e(this.collapsedTitle, c28833d.collapsedTitle) && AbstractC22676k.m65745e(this.expandedTitle, c28833d.expandedTitle) && this.collapsedIcon == c28833d.collapsedIcon && this.expandedIcon == c28833d.expandedIcon && AbstractC22676k.m65745e(this.style, c28833d.style) && this.isExpanded == c28833d.isExpanded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getExpandedIcon() {
        return this.expandedIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getExpandedTitle() {
        return this.expandedTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.expandedIcon, AbstractC17176i.m48500b(this.collapsedIcon, AbstractC31061c.m95625a(this.collapsedTitle.hashCode() * 31, this.expandedTitle, 31), 31), 31);
        String str = this.style;
        return Boolean.hashCode(this.isExpanded) + ((iM48500b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.collapsedTitle;
        TextResource textResource2 = this.expandedTitle;
        EnumC16313m0 enumC16313m0 = this.collapsedIcon;
        EnumC16313m0 enumC16313m1 = this.expandedIcon;
        String str = this.style;
        boolean z4 = this.isExpanded;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ToggleCardButtonState(collapsedTitle=", textResource, ", expandedTitle=", textResource2, ", collapsedIcon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", expandedIcon=");
        sbM106658q.append(enumC16313m1);
        sbM106658q.append(", style=");
        return AbstractC21702c.m61137h(sbM106658q, str, ", isExpanded=", z4, ")");
    }

    public /* synthetic */ C28833d(TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, enumC16313m0, enumC16313m1, str, (i13 & 32) != 0 ? false : z4);
    }
}
