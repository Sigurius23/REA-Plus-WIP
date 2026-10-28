package i21;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: i21.u */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Li21/u;", "", "Li21/v;", "tagType", "Lcom/whoop/design/util/TextResource;", "tagTitle", "Ly81/f;", "tagBackgroundColor", "tagLabelColor", "<init>", "(Li21/v;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li21/v;", "d", "()Li21/v;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18011u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC18012v tagType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource tagTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f tagBackgroundColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f tagLabelColor;

    public C18011u(EnumC18012v tagType, TextResource textResource, EnumC39333f enumC39333f, EnumC39333f enumC39333f2) {
        AbstractC22676k.m65750j(tagType, "tagType");
        this.tagType = tagType;
        this.tagTitle = textResource;
        this.tagBackgroundColor = enumC39333f;
        this.tagLabelColor = enumC39333f2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getTagBackgroundColor() {
        return this.tagBackgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getTagLabelColor() {
        return this.tagLabelColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTagTitle() {
        return this.tagTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC18012v getTagType() {
        return this.tagType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18011u)) {
            return false;
        }
        C18011u c18011u = (C18011u) other;
        return this.tagType == c18011u.tagType && AbstractC22676k.m65745e(this.tagTitle, c18011u.tagTitle) && this.tagBackgroundColor == c18011u.tagBackgroundColor && this.tagLabelColor == c18011u.tagLabelColor;
    }

    public int hashCode() {
        int iHashCode = this.tagType.hashCode() * 31;
        TextResource textResource = this.tagTitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC39333f enumC39333f = this.tagBackgroundColor;
        int iHashCode3 = (iHashCode2 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        EnumC39333f enumC39333f2 = this.tagLabelColor;
        return iHashCode3 + (enumC39333f2 != null ? enumC39333f2.hashCode() : 0);
    }

    public String toString() {
        return "TagInfo(tagType=" + this.tagType + ", tagTitle=" + this.tagTitle + ", tagBackgroundColor=" + this.tagBackgroundColor + ", tagLabelColor=" + this.tagLabelColor + ")";
    }
}
