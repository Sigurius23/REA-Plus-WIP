package n81;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: n81.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Ln81/f;", "Lm91/u;", "", "Ln81/a;", "tags", "", "selectedTag", "", "horizontalPadding", "defaultTag", "Ln81/d;", "style", "", "tagMaps", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ln81/d;Ljava/util/Map;)V", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ln81/d;Ljava/util/Map;)Ln81/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "i", "()Ljava/util/List;", "b", "Ljava/lang/String;", "f", "c", "Ljava/lang/Float;", "e", "()Ljava/lang/Float;", "d", "Ln81/d;", "g", "()Ln81/d;", "Ljava/util/Map;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26453f implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f105060g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C26448a> tags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Float horizontalPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String defaultTag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C26451d style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, InterfaceC25312u> tagMaps;

    /* JADX WARN: Multi-variable type inference failed */
    public C26453f(List<C26448a> tags, String selectedTag, Float f13, String str, C26451d style, Map<String, ? extends InterfaceC25312u> tagMaps) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(selectedTag, "selectedTag");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(tagMaps, "tagMaps");
        this.tags = tags;
        this.selectedTag = selectedTag;
        this.horizontalPadding = f13;
        this.defaultTag = str;
        this.style = style;
        this.tagMaps = tagMaps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26453f m78338b(C26453f c26453f, List list, String str, Float f13, String str2, C26451d c26451d, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c26453f.tags;
        }
        if ((i13 & 2) != 0) {
            str = c26453f.selectedTag;
        }
        if ((i13 & 4) != 0) {
            f13 = c26453f.horizontalPadding;
        }
        if ((i13 & 8) != 0) {
            str2 = c26453f.defaultTag;
        }
        if ((i13 & 16) != 0) {
            c26451d = c26453f.style;
        }
        if ((i13 & 32) != 0) {
            map = c26453f.tagMaps;
        }
        C26451d c26451d2 = c26451d;
        Map map2 = map;
        return c26453f.m78339a(list, str, f13, str2, c26451d2, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C26453f m78339a(List<C26448a> tags, String selectedTag, Float horizontalPadding, String defaultTag, C26451d style, Map<String, ? extends InterfaceC25312u> tagMaps) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(selectedTag, "selectedTag");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(tagMaps, "tagMaps");
        return new C26453f(tags, selectedTag, horizontalPadding, defaultTag, style, tagMaps);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultTag() {
        return this.defaultTag;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26453f)) {
            return false;
        }
        C26453f c26453f = (C26453f) other;
        return AbstractC22676k.m65745e(this.tags, c26453f.tags) && AbstractC22676k.m65745e(this.selectedTag, c26453f.selectedTag) && AbstractC22676k.m65745e(this.horizontalPadding, c26453f.horizontalPadding) && AbstractC22676k.m65745e(this.defaultTag, c26453f.defaultTag) && AbstractC22676k.m65745e(this.style, c26453f.style) && AbstractC22676k.m65745e(this.tagMaps, c26453f.tagMaps);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedTag() {
        return this.selectedTag;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C26451d getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, InterfaceC25312u> m78344h() {
        return this.tagMaps;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.tags.hashCode() * 31, 31, this.selectedTag);
        Float f13 = this.horizontalPadding;
        int iHashCode = (iM30450d + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str = this.defaultTag;
        return this.tagMaps.hashCode() + ((this.style.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<C26448a> m78345i() {
        return this.tags;
    }

    public String toString() {
        List<C26448a> list = this.tags;
        String str = this.selectedTag;
        Float f13 = this.horizontalPadding;
        String str2 = this.defaultTag;
        C26451d c26451d = this.style;
        Map<String, InterfaceC25312u> map = this.tagMaps;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("TagSelectorViewState(tags=", ", selectedTag=", str, ", horizontalPadding=", list);
        sbM79507k.append(f13);
        sbM79507k.append(", defaultTag=");
        sbM79507k.append(str2);
        sbM79507k.append(", style=");
        sbM79507k.append(c26451d);
        sbM79507k.append(", tagMaps=");
        sbM79507k.append(map);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public /* synthetic */ C26453f(List list, String str, Float f13, String str2, C26451d c26451d, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i13 & 4) != 0 ? null : f13, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? new C26451d(null, null, null, 7, null) : c26451d, map);
    }
}
