package km1;

import android.graphics.Shader;
import java.util.List;
import p132f0.C13825t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17922y0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: km1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\f\u0010\b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0012"}, m65681d2 = {"", "Li2/x;", "colors", "Li2/t;", "d", "(Ljava/util/List;)Li2/t;", "", "a", "(Ljava/lang/String;)Li2/t;", "Lf0/t;", "c", "(Ljava/lang/String;)Lf0/t;", "b", "Ljava/util/List;", "patrioticGradientColors", "Li2/t;", "patrioticGradientBrush", "patrioticBackgroundBrush", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22587d {

    /* JADX INFO: renamed from: a */
    private static final List<C17919x> f88893a;

    /* JADX INFO: renamed from: b */
    private static final AbstractC17911t f88894b;

    /* JADX INFO: renamed from: c */
    private static final AbstractC17911t f88895c;

    /* JADX INFO: renamed from: km1.d$a */
    @Metadata(m65680d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"km1/d$a", "Li2/y0;", "Lh2/e;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC17922y0 {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ List<C17919x> f88896f;

        public a(List<C17919x> list) {
            this.f88896f = list;
        }

        @Override // p208i2.AbstractC17922y0
        /* JADX INFO: renamed from: b */
        public Shader mo29549b(long size) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) / 2.0f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L));
            return AbstractC17918w0.m51521i(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), this.f88896f, null, 0);
        }
    }

    static {
        EnumC39333f enumC39333f = EnumC39333f.PATRIOTIC_BLUE;
        C17919x c17919x = new C17919x(enumC39333f.getColor());
        C17919x c17919x2 = new C17919x(EnumC39333f.BRAND_WHITE.getColor());
        EnumC39333f enumC39333f2 = EnumC39333f.PATRIOTIC_RED;
        List<C17919x> listM118959K = AbstractC37056f.m118959K(c17919x, c17919x2, new C17919x(enumC39333f2.getColor()));
        f88893a = listM118959K;
        f88894b = m65470d(listM118959K);
        f88895c = m65470d(AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, enumC39333f.getColor())), new C17919x(C17919x.f69636m), new C17919x(C17919x.m51541c(0.15f, enumC39333f2.getColor()))));
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC17911t m65467a(String str) {
        if (AbstractC22676k.m65745e(str, "BLUE_WHITE_RED")) {
            return f88894b;
        }
        C17909s c17909s = AbstractC17911t.f69612b;
        long j7 = C17919x.f69629f;
        return C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j7)), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC17911t m65468b(String str) {
        if (AbstractC22676k.m65745e(str, "AMERICA_250")) {
            return f88895c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final C13825t m65469c(String str) {
        if (AbstractC22676k.m65745e(str, "AMERICA_250")) {
            return new C13825t((float) 1.5d, f88894b);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static final AbstractC17911t m65470d(List<C17919x> list) {
        return new a(list);
    }
}
