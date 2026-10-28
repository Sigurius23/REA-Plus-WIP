package f51;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f51.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lf51/m;", "", "Lcom/whoop/design/util/TextResource;", "title", "magnitude", "Ly81/f;", "magnitudeColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14102m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource magnitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f magnitudeColor;

    public C14102m(TextResource title, TextResource magnitude, EnumC39333f magnitudeColor) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(magnitude, "magnitude");
        AbstractC22676k.m65750j(magnitudeColor, "magnitudeColor");
        this.title = title;
        this.magnitude = magnitude;
        this.magnitudeColor = magnitudeColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getMagnitudeColor() {
        return this.magnitudeColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14102m)) {
            return false;
        }
        C14102m c14102m = (C14102m) other;
        return AbstractC22676k.m65745e(this.title, c14102m.title) && AbstractC22676k.m65745e(this.magnitude, c14102m.magnitude) && this.magnitudeColor == c14102m.magnitudeColor;
    }

    public int hashCode() {
        return this.magnitudeColor.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.magnitude, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.magnitude;
        return AbstractC21702c.m61138i(AbstractC33745d.m106658q("MagnitudeQuestionItemState(title=", textResource, ", magnitude=", textResource2, ", magnitudeColor="), this.magnitudeColor, ")");
    }
}
