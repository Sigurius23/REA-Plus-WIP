package cr2;

import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cr2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, m65681d2 = {"Lcr2/g;", "", "Lcom/whoop/design/util/TextResource;", "title", "value", "suffix", "Lcr2/h;", "style", "subtext", "Lhy0/b2;", "subtextState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "d", "Lcr2/h;", "()Lcr2/h;", "Lhy0/b2;", "()Lhy0/b2;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11091g {

    /* JADX INFO: renamed from: g */
    public static final int f35183g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource suffix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC11092h style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC17727b2 subtextState;

    public C11091g(TextResource title, TextResource value, TextResource textResource, EnumC11092h style, TextResource subtext, EnumC17727b2 subtextState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(subtextState, "subtextState");
        this.title = title;
        this.value = value;
        this.suffix = textResource;
        this.style = style;
        this.subtext = subtext;
        this.subtextState = subtextState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC11092h getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC17727b2 getSubtextState() {
        return this.subtextState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11091g)) {
            return false;
        }
        C11091g c11091g = (C11091g) other;
        return AbstractC22676k.m65745e(this.title, c11091g.title) && AbstractC22676k.m65745e(this.value, c11091g.value) && AbstractC22676k.m65745e(this.suffix, c11091g.suffix) && this.style == c11091g.style && AbstractC22676k.m65745e(this.subtext, c11091g.subtext) && this.subtextState == c11091g.subtextState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.value, 31);
        TextResource textResource = this.suffix;
        return this.subtextState.hashCode() + AbstractC31061c.m95625a((this.style.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31, this.subtext, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.value;
        TextResource textResource3 = this.suffix;
        EnumC11092h enumC11092h = this.style;
        TextResource textResource4 = this.subtext;
        EnumC17727b2 enumC17727b2 = this.subtextState;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StatItemState(title=", textResource, ", value=", textResource2, ", suffix=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", style=");
        sbM106658q.append(enumC11092h);
        sbM106658q.append(", subtext=");
        sbM106658q.append(textResource4);
        sbM106658q.append(", subtextState=");
        sbM106658q.append(enumC17727b2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
