package gb1;

import android.graphics.Shader;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23465k;
import p000.AbstractC11266d;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17922y0;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: gb1.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, m65681d2 = {"Lgb1/t;", "Li2/y0;", "", "Li2/x;", "colors", "", "stops", "Li2/w0;", "tileMode", "angleInDegrees", "", "useAsCssAngle", "<init>", "(Ljava/util/List;Ljava/util/List;IFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh2/e;", "size", "Ll83/k;", "Lh2/b;", "c", "(J)Ll83/k;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "f", "Ljava/util/List;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "i", "F", "normalizedAngle", "j", "angleInRadians", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15692t extends AbstractC17922y0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C17919x> colors;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<Float> stops;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int tileMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float normalizedAngle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float angleInRadians;

    public /* synthetic */ C15692t(List list, List list2, int i13, float f13, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, i13, f13, z4);
    }

    /* JADX INFO: renamed from: c */
    private final C23465k m44153c(long size) {
        int i13 = (int) (size >> 32);
        double d3 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat(i13), d3)) + ((float) Math.pow(Float.intBitsToFloat((int) (size & 4294967295L)), d3)));
        float fAcos = (float) Math.acos(Float.intBitsToFloat(i13) / fSqrt);
        float f13 = this.normalizedAngle;
        float fAbs = Math.abs(((float) Math.cos((((f13 <= 90.0f || f13 >= 180.0f) && (f13 <= 270.0f || f13 >= 360.0f)) ? this.angleInRadians : 3.1415927f - this.angleInRadians) - fAcos)) * fSqrt) / 2;
        float fCos = ((float) Math.cos(this.angleInRadians)) * fAbs;
        float fSin = fAbs * ((float) Math.sin(this.angleInRadians));
        return new C23465k(new C16617b(C16617b.m47192h(AbstractC21598x.m60656L(size), (((long) Float.floatToRawIntBits(-fCos)) << 32) | (((long) Float.floatToRawIntBits(fSin)) & 4294967295L))), new C16617b(C16617b.m47192h(AbstractC21598x.m60656L(size), (((long) Float.floatToRawIntBits(-fSin)) & 4294967295L) | (((long) Float.floatToRawIntBits(fCos)) << 32))));
    }

    @Override // p208i2.AbstractC17922y0
    /* JADX INFO: renamed from: b */
    public Shader mo29549b(long size) {
        C23465k c23465kM44153c = m44153c(size);
        return AbstractC17918w0.m51521i(((C16617b) c23465kM44153c.f92937w).f63937a, ((C16617b) c23465kM44153c.f92938x).f63937a, this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15692t)) {
            return false;
        }
        C15692t c15692t = (C15692t) other;
        return AbstractC22676k.m65745e(this.colors, c15692t.colors) && AbstractC22676k.m65745e(this.stops, c15692t.stops) && this.normalizedAngle == c15692t.normalizedAngle && this.tileMode == c15692t.tileMode;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return Integer.hashCode(this.tileMode) + AbstractC11266d.m30447a(this.normalizedAngle, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        List<C17919x> list = this.colors;
        List<Float> list2 = this.stops;
        float f13 = this.normalizedAngle;
        String strM51510L = AbstractC17918w0.m51510L(this.tileMode);
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("LinearGradient(colors=", ", stops=", list, ", angle=", list2);
        sbM124380j.append(f13);
        sbM124380j.append(", tileMode=");
        sbM124380j.append(strM51510L);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    private C15692t(List<C17919x> colors, List<Float> list, int i13, float f13, boolean z4) {
        float f14;
        AbstractC22676k.m65750j(colors, "colors");
        this.colors = colors;
        this.stops = list;
        this.tileMode = i13;
        if (z4) {
            float f15 = 360;
            f14 = (((90 - f13) % f15) + f15) % f15;
        } else {
            float f16 = 360;
            f14 = ((f13 % f16) + f16) % f16;
        }
        this.normalizedAngle = f14;
        this.angleInRadians = (float) Math.toRadians(f14);
    }
}
