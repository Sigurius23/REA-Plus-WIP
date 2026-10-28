package bm0;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bm0.t */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lbm0/t;", "", "", "size", "Ly81/f;", "style", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "<init>", "(FLy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Ly81/f;", "()Ly81/f;", "c", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3417t {

    /* JADX INFO: renamed from: e */
    public static final int f13315e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    public C3417t(float f13, EnumC39333f style, TextResource title, TextResource subtitle) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.size = f13;
        this.style = style;
        this.title = title;
        this.subtitle = subtitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3417t)) {
            return false;
        }
        C3417t c3417t = (C3417t) other;
        return Float.compare(this.size, c3417t.size) == 0 && this.style == c3417t.style && AbstractC22676k.m65745e(this.title, c3417t.title) && AbstractC22676k.m65745e(this.subtitle, c3417t.subtitle);
    }

    public int hashCode() {
        return this.subtitle.hashCode() + AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.style, Float.hashCode(this.size) * 31, 31), this.title, 31);
    }

    public String toString() {
        float f13 = this.size;
        EnumC39333f enumC39333f = this.style;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        StringBuilder sb4 = new StringBuilder("Zone(size=");
        sb4.append(f13);
        sb4.append(", style=");
        sb4.append(enumC39333f);
        sb4.append(", title=");
        return AbstractC33745d.m106655n(sb4, textResource, ", subtitle=", textResource2, ")");
    }
}
