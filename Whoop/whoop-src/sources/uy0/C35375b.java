package uy0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;

/* JADX INFO: renamed from: uy0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Luy0/b;", "Lm91/n;", "", "id", "glyph", "Ly3/f;", "size", "glyphSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "F", "()F", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35375b implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: e */
    public static final int f150675e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String glyph;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float glyphSize;

    public /* synthetic */ C35375b(String str, String str2, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGlyph() {
        return this.glyph;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getGlyphSize() {
        return this.glyphSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35375b)) {
            return false;
        }
        C35375b c35375b = (C35375b) other;
        return AbstractC22676k.m65745e(this.id, c35375b.id) && AbstractC22676k.m65745e(this.glyph, c35375b.glyph) && C39174f.m124782b(this.size, c35375b.size) && C39174f.m124782b(this.glyphSize, c35375b.glyphSize);
    }

    public int hashCode() {
        return Float.hashCode(this.glyphSize) + AbstractC11266d.m30447a(this.size, AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.glyph), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.glyph;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("EmojiItemViewState(id=", str, ", glyph=", str2, ", size="), C39174f.m124783c(this.size), ", glyphSize=", C39174f.m124783c(this.glyphSize), ")");
    }

    private C35375b(String id4, String glyph, float f13, float f14) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(glyph, "glyph");
        this.id = id4;
        this.glyph = glyph;
        this.size = f13;
        this.glyphSize = f14;
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
