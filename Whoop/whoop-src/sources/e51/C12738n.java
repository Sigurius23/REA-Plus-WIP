package e51;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: e51.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Le51/n;", "Lm91/u;", "", "Le51/p;", "tags", "Le51/e;", "items", "", "selectedTagId", "Le51/m;", "scrollTrackingMode", "Ly3/f;", "tagsHorizontalInset", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;F)Le51/n;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "f", "d", "Le51/m;", "e", "()Le51/m;", "F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12738n implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f43579f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C12740p> tags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C12729e> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String selectedTagId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC12737m scrollTrackingMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float tagsHorizontalInset;

    public /* synthetic */ C12738n(List list, List list2, String str, EnumC12737m enumC12737m, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, str, enumC12737m, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12738n m35649b(C12738n c12738n, List list, List list2, String str, EnumC12737m enumC12737m, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c12738n.tags;
        }
        if ((i13 & 2) != 0) {
            list2 = c12738n.items;
        }
        if ((i13 & 4) != 0) {
            str = c12738n.selectedTagId;
        }
        if ((i13 & 8) != 0) {
            enumC12737m = c12738n.scrollTrackingMode;
        }
        if ((i13 & 16) != 0) {
            f13 = c12738n.tagsHorizontalInset;
        }
        float f14 = f13;
        String str2 = str;
        return c12738n.m35650a(list, list2, str2, enumC12737m, f14);
    }

    /* JADX INFO: renamed from: a */
    public final C12738n m35650a(List<C12740p> tags, List<C12729e> items, String selectedTagId, EnumC12737m scrollTrackingMode, float tagsHorizontalInset) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(scrollTrackingMode, "scrollTrackingMode");
        return new C12738n(tags, items, selectedTagId, scrollTrackingMode, tagsHorizontalInset, null);
    }

    /* JADX INFO: renamed from: c */
    public final List<C12729e> m35651c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC12737m getScrollTrackingMode() {
        return this.scrollTrackingMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12738n)) {
            return false;
        }
        C12738n c12738n = (C12738n) other;
        return AbstractC22676k.m65745e(this.tags, c12738n.tags) && AbstractC22676k.m65745e(this.items, c12738n.items) && AbstractC22676k.m65745e(this.selectedTagId, c12738n.selectedTagId) && this.scrollTrackingMode == c12738n.scrollTrackingMode && C39174f.m124782b(this.tagsHorizontalInset, c12738n.tagsHorizontalInset);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedTagId() {
        return this.selectedTagId;
    }

    /* JADX INFO: renamed from: g */
    public final List<C12740p> m35654g() {
        return this.tags;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getTagsHorizontalInset() {
        return this.tagsHorizontalInset;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.tags.hashCode() * 31, 31, this.items);
        String str = this.selectedTagId;
        return Float.hashCode(this.tagsHorizontalInset) + ((this.scrollTrackingMode.hashCode() + ((iM31983b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        List<C12740p> list = this.tags;
        List<C12729e> list2 = this.items;
        String str = this.selectedTagId;
        EnumC12737m enumC12737m = this.scrollTrackingMode;
        String strM124783c = C39174f.m124783c(this.tagsHorizontalInset);
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("AnchorSelectorState(tags=", ", items=", list, ", selectedTagId=", list2);
        sbM124380j.append(str);
        sbM124380j.append(", scrollTrackingMode=");
        sbM124380j.append(enumC12737m);
        sbM124380j.append(", tagsHorizontalInset=");
        return AbstractC25012a.m73376i(strM124783c, ")", sbM124380j);
    }

    private C12738n(List<C12740p> tags, List<C12729e> items, String str, EnumC12737m scrollTrackingMode, float f13) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(scrollTrackingMode, "scrollTrackingMode");
        this.tags = tags;
        this.items = items;
        this.selectedTagId = str;
        this.scrollTrackingMode = scrollTrackingMode;
        this.tagsHorizontalInset = f13;
    }

    public /* synthetic */ C12738n(List list, List list2, String str, EnumC12737m enumC12737m, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? EnumC12737m.FIRST_VISIBLE : enumC12737m, (i13 & 16) != 0 ? AbstractC12739o.m35656a() : f13, null);
    }
}
