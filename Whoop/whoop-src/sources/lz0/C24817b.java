package lz0;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Llz0/b;", "", "", "position", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/f;", "color", "", "showMarker", "<init>", "(FLcom/whoop/design/util/TextResource;Ly81/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24817b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showMarker;

    public C24817b(float f13, TextResource label, EnumC39333f color, boolean z4) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(color, "color");
        this.position = f13;
        this.label = label;
        this.color = color;
        this.showMarker = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowMarker() {
        return this.showMarker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24817b)) {
            return false;
        }
        C24817b c24817b = (C24817b) other;
        return Float.compare(this.position, c24817b.position) == 0 && AbstractC22676k.m65745e(this.label, c24817b.label) && this.color == c24817b.color && this.showMarker == c24817b.showMarker;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showMarker) + AbstractC21702c.m61132c(this.color, AbstractC31061c.m95625a(Float.hashCode(this.position) * 31, this.label, 31), 31);
    }

    public String toString() {
        return "PregnancyProgressLabel(position=" + this.position + ", label=" + this.label + ", color=" + this.color + ", showMarker=" + this.showMarker + ")";
    }

    public /* synthetic */ C24817b(float f13, TextResource textResource, EnumC39333f enumC39333f, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, textResource, enumC39333f, (i13 & 8) != 0 ? false : z4);
    }
}
