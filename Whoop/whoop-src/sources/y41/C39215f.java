package y41;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y41.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b'\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b/\u0010&R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b0\u00105¨\u00066"}, m65681d2 = {"Ly41/f;", "Lm91/u;", "Lgz0/m0;", "titleIcon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Ly41/g;", "contributorSections", "Ly41/i;", "secondaryActionButton", "explanationTitle", "explanation", "Ly41/e;", "style", "", "fillHeight", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly41/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly41/e;Z)V", "a", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly41/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly41/e;Z)Ly41/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "k", "()Lgz0/m0;", "b", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ly41/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly41/i;", "f", "g", "Ly41/e;", "i", "()Ly41/e;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39215f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 titleIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C39216g> contributorSections;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39218i secondaryActionButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource explanationTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource explanation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC39214e style;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean fillHeight;

    public C39215f(EnumC16313m0 enumC16313m0, TextResource title, TextResource subtitle, List<C39216g> contributorSections, C39218i secondaryActionButton, TextResource explanationTitle, TextResource explanation, EnumC39214e style, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(contributorSections, "contributorSections");
        AbstractC22676k.m65750j(secondaryActionButton, "secondaryActionButton");
        AbstractC22676k.m65750j(explanationTitle, "explanationTitle");
        AbstractC22676k.m65750j(explanation, "explanation");
        AbstractC22676k.m65750j(style, "style");
        this.titleIcon = enumC16313m0;
        this.title = title;
        this.subtitle = subtitle;
        this.contributorSections = contributorSections;
        this.secondaryActionButton = secondaryActionButton;
        this.explanationTitle = explanationTitle;
        this.explanation = explanation;
        this.style = style;
        this.fillHeight = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39215f m124915b(C39215f c39215f, EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, List list, C39218i c39218i, TextResource textResource3, TextResource textResource4, EnumC39214e enumC39214e, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = c39215f.titleIcon;
        }
        if ((i13 & 2) != 0) {
            textResource = c39215f.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c39215f.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = c39215f.contributorSections;
        }
        if ((i13 & 16) != 0) {
            c39218i = c39215f.secondaryActionButton;
        }
        if ((i13 & 32) != 0) {
            textResource3 = c39215f.explanationTitle;
        }
        if ((i13 & 64) != 0) {
            textResource4 = c39215f.explanation;
        }
        if ((i13 & 128) != 0) {
            enumC39214e = c39215f.style;
        }
        if ((i13 & 256) != 0) {
            z4 = c39215f.fillHeight;
        }
        EnumC39214e enumC39214e2 = enumC39214e;
        boolean z13 = z4;
        TextResource textResource5 = textResource3;
        TextResource textResource6 = textResource4;
        C39218i c39218i2 = c39218i;
        TextResource textResource7 = textResource2;
        return c39215f.m124916a(enumC16313m0, textResource, textResource7, list, c39218i2, textResource5, textResource6, enumC39214e2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C39215f m124916a(EnumC16313m0 titleIcon, TextResource title, TextResource subtitle, List<C39216g> contributorSections, C39218i secondaryActionButton, TextResource explanationTitle, TextResource explanation, EnumC39214e style, boolean fillHeight) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(contributorSections, "contributorSections");
        AbstractC22676k.m65750j(secondaryActionButton, "secondaryActionButton");
        AbstractC22676k.m65750j(explanationTitle, "explanationTitle");
        AbstractC22676k.m65750j(explanation, "explanation");
        AbstractC22676k.m65750j(style, "style");
        return new C39215f(titleIcon, title, subtitle, contributorSections, secondaryActionButton, explanationTitle, explanation, style, fillHeight);
    }

    /* JADX INFO: renamed from: c */
    public final List<C39216g> m124917c() {
        return this.contributorSections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getExplanation() {
        return this.explanation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39215f)) {
            return false;
        }
        C39215f c39215f = (C39215f) other;
        return this.titleIcon == c39215f.titleIcon && AbstractC22676k.m65745e(this.title, c39215f.title) && AbstractC22676k.m65745e(this.subtitle, c39215f.subtitle) && AbstractC22676k.m65745e(this.contributorSections, c39215f.contributorSections) && AbstractC22676k.m65745e(this.secondaryActionButton, c39215f.secondaryActionButton) && AbstractC22676k.m65745e(this.explanationTitle, c39215f.explanationTitle) && AbstractC22676k.m65745e(this.explanation, c39215f.explanation) && this.style == c39215f.style && this.fillHeight == c39215f.fillHeight;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getExplanationTitle() {
        return this.explanationTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getFillHeight() {
        return this.fillHeight;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C39218i getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.titleIcon;
        return Boolean.hashCode(this.fillHeight) + ((this.style.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.secondaryActionButton.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, this.title, 31), this.subtitle, 31), 31, this.contributorSections)) * 31, this.explanationTitle, 31), this.explanation, 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC39214e getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC16313m0 getTitleIcon() {
        return this.titleIcon;
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.titleIcon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<C39216g> list = this.contributorSections;
        C39218i c39218i = this.secondaryActionButton;
        TextResource textResource3 = this.explanationTitle;
        TextResource textResource4 = this.explanation;
        EnumC39214e enumC39214e = this.style;
        boolean z4 = this.fillHeight;
        StringBuilder sb4 = new StringBuilder("AiWeeklyPlanSuggestionViewState(titleIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        AbstractC21702c.m61143n(textResource2, ", contributorSections=", ", secondaryActionButton=", sb4, list);
        sb4.append(c39218i);
        sb4.append(", explanationTitle=");
        sb4.append(textResource3);
        sb4.append(", explanation=");
        sb4.append(textResource4);
        sb4.append(", style=");
        sb4.append(enumC39214e);
        sb4.append(", fillHeight=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C39215f(EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, List list, C39218i c39218i, TextResource textResource3, TextResource textResource4, EnumC39214e enumC39214e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, textResource, textResource2, list, c39218i, textResource3, textResource4, enumC39214e, (i13 & 256) != 0 ? false : z4);
    }
}
