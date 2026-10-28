package h31;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h31.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001d\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b!\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b\u001a\u0010-¨\u0006."}, m65681d2 = {"Lh31/q;", "Lm91/u;", "", "recommendationId", "Lh31/n;", "style", "header", "", "body", "cta", "", "isExpanded", "isSelected", "Lh31/b;", "backgroundStyle", "<init>", "(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZZLh31/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lh31/n;", "g", "()Lh31/n;", "c", "Lm91/u;", "e", "()Lm91/u;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "i", "Lh31/b;", "()Lh31/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16824q implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String recommendationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16821n style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u header;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u cta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC16809b backgroundStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public C16824q(String recommendationId, EnumC16821n style, InterfaceC25312u interfaceC25312u, List<? extends InterfaceC25312u> body, InterfaceC25312u interfaceC25312u2, boolean z4, boolean z13, EnumC16809b enumC16809b) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(body, "body");
        this.recommendationId = recommendationId;
        this.style = style;
        this.header = interfaceC25312u;
        this.body = body;
        this.cta = interfaceC25312u2;
        this.isExpanded = z4;
        this.isSelected = z13;
        this.backgroundStyle = enumC16809b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16809b getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m47398b() {
        return this.body;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16824q)) {
            return false;
        }
        C16824q c16824q = (C16824q) other;
        return AbstractC22676k.m65745e(this.recommendationId, c16824q.recommendationId) && this.style == c16824q.style && AbstractC22676k.m65745e(this.header, c16824q.header) && AbstractC22676k.m65745e(this.body, c16824q.body) && AbstractC22676k.m65745e(this.cta, c16824q.cta) && this.isExpanded == c16824q.isExpanded && this.isSelected == c16824q.isSelected && this.backgroundStyle == c16824q.backgroundStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRecommendationId() {
        return this.recommendationId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16821n getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + (this.recommendationId.hashCode() * 31)) * 31;
        InterfaceC25312u interfaceC25312u = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.body);
        InterfaceC25312u interfaceC25312u2 = this.cta;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31, 31, this.isExpanded), 31, this.isSelected);
        EnumC16809b enumC16809b = this.backgroundStyle;
        return iM8289b + (enumC16809b != null ? enumC16809b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "RecommendationTileViewState(recommendationId=" + this.recommendationId + ", style=" + this.style + ", header=" + this.header + ", body=" + this.body + ", cta=" + this.cta + ", isExpanded=" + this.isExpanded + ", isSelected=" + this.isSelected + ", backgroundStyle=" + this.backgroundStyle + ")";
    }

    public /* synthetic */ C16824q(String str, EnumC16821n enumC16821n, InterfaceC25312u interfaceC25312u, List list, InterfaceC25312u interfaceC25312u2, boolean z4, boolean z13, EnumC16809b enumC16809b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC16821n, (i13 & 4) != 0 ? null : interfaceC25312u, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : interfaceC25312u2, (i13 & 32) != 0 ? true : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? null : enumC16809b);
    }
}
