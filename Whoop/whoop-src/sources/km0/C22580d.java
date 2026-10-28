package km0;

import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: km0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001d\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b/\u0010#R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b+\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b \u00103R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b*\u0010.¨\u00065"}, m65681d2 = {"Lkm0/d;", "Lm91/n;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "", "isSelected", "Lkd1/o;", "icon", "subtitle", "", "categories", "avoidanceText", "weeklyPlanGoal", "Lhy0/h1;", "tag", "trailingTags", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Z", "g", "()Z", "d", "Lkd1/o;", "()Lkd1/o;", "e", "f", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "getAvoidanceText", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lhy0/h1;", "()Lhy0/h1;", "j", "bottomsheet-item-selector_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22580d implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: k */
    public static final int f88854k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<TextResource> categories;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource avoidanceText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean weeklyPlanGoal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<C17750h1> trailingTags;

    /* JADX WARN: Multi-variable type inference failed */
    public C22580d(String id4, TextResource title, boolean z4, AbstractC22403o abstractC22403o, TextResource textResource, List<? extends TextResource> categories, TextResource textResource2, boolean z13, C17750h1 c17750h1, List<C17750h1> trailingTags) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(trailingTags, "trailingTags");
        this.id = id4;
        this.title = title;
        this.isSelected = z4;
        this.icon = abstractC22403o;
        this.subtitle = textResource;
        this.categories = categories;
        this.avoidanceText = textResource2;
        this.weeklyPlanGoal = z13;
        this.tag = c17750h1;
        this.trailingTags = trailingTags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<C17750h1> m65413e() {
        return this.trailingTags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22580d)) {
            return false;
        }
        C22580d c22580d = (C22580d) other;
        return AbstractC22676k.m65745e(this.id, c22580d.id) && AbstractC22676k.m65745e(this.title, c22580d.title) && this.isSelected == c22580d.isSelected && AbstractC22676k.m65745e(this.icon, c22580d.icon) && AbstractC22676k.m65745e(this.subtitle, c22580d.subtitle) && AbstractC22676k.m65745e(this.categories, c22580d.categories) && AbstractC22676k.m65745e(this.avoidanceText, c22580d.avoidanceText) && this.weeklyPlanGoal == c22580d.weeklyPlanGoal && AbstractC22676k.m65745e(this.tag, c22580d.tag) && AbstractC22676k.m65745e(this.trailingTags, c22580d.trailingTags);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), 31, this.isSelected);
        AbstractC22403o abstractC22403o = this.icon;
        int iHashCode = (iM8289b + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        TextResource textResource = this.subtitle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.categories);
        TextResource textResource2 = this.avoidanceText;
        int iM8289b2 = AbstractC2875y.m8289b((iM31983b + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.weeklyPlanGoal);
        C17750h1 c17750h1 = this.tag;
        return this.trailingTags.hashCode() + ((iM8289b2 + (c17750h1 != null ? c17750h1.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        boolean z4 = this.isSelected;
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource2 = this.subtitle;
        List<TextResource> list = this.categories;
        TextResource textResource3 = this.avoidanceText;
        boolean z13 = this.weeklyPlanGoal;
        C17750h1 c17750h1 = this.tag;
        List<C17750h1> list2 = this.trailingTags;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("BottomSheetSelectorToggleViewState(id=", str, ", title=", textResource, ", isSelected=");
        sbM91847q.append(z4);
        sbM91847q.append(", icon=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", subtitle=");
        AbstractC21702c.m61143n(textResource2, ", categories=", ", avoidanceText=", sbM91847q, list);
        AbstractC33745d.m106664w(textResource3, ", weeklyPlanGoal=", ", tag=", sbM91847q, z13);
        sbM91847q.append(c17750h1);
        sbM91847q.append(", trailingTags=");
        sbM91847q.append(list2);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public /* synthetic */ C22580d(String str, TextResource textResource, boolean z4, AbstractC22403o abstractC22403o, TextResource textResource2, List list, TextResource textResource3, boolean z13, C17750h1 c17750h1, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, z4, abstractC22403o, textResource2, list, textResource3, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : c17750h1, (i13 & 512) != 0 ? C25271y.f99162w : list2);
    }
}
