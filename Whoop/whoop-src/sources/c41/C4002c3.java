package c41;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.c3 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001f\u0010\u000f¨\u0006&"}, m65681d2 = {"Lc41/c3;", "Lm91/u;", "Lc41/d3;", "type", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "", "ctaUrl", "name", "<init>", "(Lc41/d3;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc41/d3;", "g", "()Lc41/d3;", "b", "Lkd1/o;", "()Lkd1/o;", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4002c3 implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f16276g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC4009d3 type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String ctaUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String name;

    public C4002c3(EnumC4009d3 type, AbstractC22403o image, TextResource title, TextResource subTitle, String ctaUrl, String name) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        AbstractC22676k.m65750j(name, "name");
        this.type = type;
        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
        this.ctaUrl = ctaUrl;
        this.name = name;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4002c3)) {
            return false;
        }
        C4002c3 c4002c3 = (C4002c3) other;
        return this.type == c4002c3.type && AbstractC22676k.m65745e(this.image, c4002c3.image) && AbstractC22676k.m65745e(this.title, c4002c3.title) && AbstractC22676k.m65745e(this.subTitle, c4002c3.subTitle) && AbstractC22676k.m65745e(this.ctaUrl, c4002c3.ctaUrl) && AbstractC22676k.m65745e(this.name, c4002c3.name);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC4009d3 getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode() + AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.image, this.type.hashCode() * 31, 31), this.title, 31), this.subTitle, 31), 31, this.ctaUrl);
    }

    public String toString() {
        EnumC4009d3 enumC4009d3 = this.type;
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subTitle;
        String str = this.ctaUrl;
        String str2 = this.name;
        StringBuilder sb4 = new StringBuilder("ListItemTileState(type=");
        sb4.append(enumC4009d3);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", subTitle=", textResource2, ", ctaUrl=");
        return AbstractC11266d.m30464r(sb4, str, ", name=", str2, ")");
    }

    public /* synthetic */ C4002c3(EnumC4009d3 enumC4009d3, AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4009d3, abstractC22403o, textResource, textResource2, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? "" : str2);
    }
}
