package xq2;

import com.whoop.design.util.TextResource;
import i91.AbstractC18247a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lxq2/m;", "", "Lcom/whoop/design/util/TextResource;", "stat", "text", "Ly81/e;", "statTextColor", "Li91/a;", "backgroundColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Li91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "d", "c", "Ly81/e;", "()Ly81/e;", "Li91/a;", "()Li91/a;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38577m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource stat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e statTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC18247a backgroundColor;

    public C38577m(TextResource stat, TextResource text, InterfaceC39332e statTextColor, AbstractC18247a backgroundColor) {
        AbstractC22676k.m65750j(stat, "stat");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(statTextColor, "statTextColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.stat = stat;
        this.text = text;
        this.statTextColor = statTextColor;
        this.backgroundColor = backgroundColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18247a getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getStat() {
        return this.stat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getStatTextColor() {
        return this.statTextColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38577m)) {
            return false;
        }
        C38577m c38577m = (C38577m) other;
        return AbstractC22676k.m65745e(this.stat, c38577m.stat) && AbstractC22676k.m65745e(this.text, c38577m.text) && AbstractC22676k.m65745e(this.statTextColor, c38577m.statTextColor) && AbstractC22676k.m65745e(this.backgroundColor, c38577m.backgroundColor);
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + AbstractC33745d.m106648g(this.statTextColor, AbstractC31061c.m95625a(this.stat.hashCode() * 31, this.text, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.stat;
        TextResource textResource2 = this.text;
        InterfaceC39332e interfaceC39332e = this.statTextColor;
        AbstractC18247a abstractC18247a = this.backgroundColor;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("FooterItemState(stat=", textResource, ", text=", textResource2, ", statTextColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", backgroundColor=");
        sbM106658q.append(abstractC18247a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
