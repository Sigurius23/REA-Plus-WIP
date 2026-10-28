package kd1;

import android.graphics.Color;
import c81.EnumC4306f;
import e93.AbstractC12889b;
import i93.C18282h;
import i93.C18284j;
import l83.C23465k;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: kd1.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lkd1/t;", "", "<init>", "()V", "", "color1", "color2", "", "ratio", "e", "(IIF)I", "Ll83/k;", "intPair", "Li93/h;", "b", "(Ll83/k;)Li93/h;", "progression", "a", "(Li93/h;)I", "t", "c", "(Li93/h;F)F", "", "name", "", "ignoreCurrent", "Ly81/f;", "f", "(Ljava/lang/String;Z)Ly81/f;", "range", "value", "d", "(Li93/h;I)F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22408t {

    /* JADX INFO: renamed from: kd1.t$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87654a;

        static {
            int[] iArr = new int[EnumC4306f.values().length];
            try {
                iArr[EnumC4306f.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4306f.CURRENT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4306f.HIGHLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87654a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m64513a(C18282h progression) {
        AbstractC22676k.m65750j(progression, "progression");
        return Math.abs(progression.f71134x - progression.f71133w);
    }

    /* JADX INFO: renamed from: b */
    public final C18282h m64514b(C23465k intPair) {
        AbstractC22676k.m65750j(intPair, "intPair");
        Number number = (Number) intPair.f92937w;
        int iIntValue = number.intValue();
        Number number2 = (Number) intPair.f92938x;
        return iIntValue < number2.intValue() ? new C18284j(number.intValue(), number2.intValue(), 1) : new C18282h(number.intValue(), number2.intValue(), -1);
    }

    /* JADX INFO: renamed from: c */
    public final float m64515c(C18282h progression, float t14) {
        AbstractC22676k.m65750j(progression, "progression");
        int i13 = progression.f71133w;
        return AbstractC2875y.m8288a(progression.f71134x, i13, t14, i13);
    }

    /* JADX INFO: renamed from: d */
    public final float m64516d(C18282h range, int value) {
        AbstractC22676k.m65750j(range, "range");
        int i13 = range.f71133w;
        return AbstractC12889b.m36283m((value - i13) / (range.f71134x - i13), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: e */
    public final int m64517e(int color1, int color2, float ratio) {
        float f13 = 1.0f - ratio;
        Float fValueOf = Float.valueOf((Color.alpha(color1) * f13) + (Color.alpha(color2) * ratio));
        if (Math.abs(fValueOf.floatValue()) > Float.MAX_VALUE) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        Float fValueOf2 = Float.valueOf((Color.red(color1) * f13) + (Color.red(color2) * ratio));
        if (Math.abs(fValueOf2.floatValue()) > Float.MAX_VALUE) {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        Float fValueOf3 = Float.valueOf((Color.green(color1) * f13) + (Color.green(color2) * ratio));
        if (Math.abs(fValueOf3.floatValue()) > Float.MAX_VALUE) {
            fValueOf3 = null;
        }
        float fFloatValue3 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
        Float fValueOf4 = Float.valueOf((Color.blue(color1) * f13) + (Color.blue(color2) * ratio));
        Float f14 = Math.abs(fValueOf4.floatValue()) <= Float.MAX_VALUE ? fValueOf4 : null;
        return Color.argb(AbstractC12889b.m36258X(fFloatValue), AbstractC12889b.m36258X(fFloatValue2), AbstractC12889b.m36258X(fFloatValue3), AbstractC12889b.m36258X(f14 != null ? f14.floatValue() : 0.0f));
    }

    /* JADX INFO: renamed from: f */
    public final EnumC39333f m64518f(String name, boolean ignoreCurrent) {
        EnumC4306f enumC4306f;
        AbstractC22676k.m65750j(name, "name");
        EnumC4306f enumC4306f2 = EnumC4306f.NEUTRAL;
        EnumC4306f[] enumC4306fArrValues = EnumC4306f.values();
        int length = enumC4306fArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC4306f = null;
                break;
            }
            enumC4306f = enumC4306fArrValues[i13];
            if (AbstractC22676k.m65745e(enumC4306f.name(), name)) {
                break;
            }
            i13++;
        }
        if (enumC4306f != null) {
            enumC4306f2 = enumC4306f;
        }
        int i14 = a.f87654a[enumC4306f2.ordinal()];
        if (i14 == 1) {
            return EnumC39333f.WHITE_10;
        }
        if (i14 == 2) {
            return ignoreCurrent ? EnumC39333f.WHITE_10 : EnumC39333f.WHITE_90;
        }
        if (i14 == 3) {
            return EnumC39333f.WHITE_30;
        }
        throw new NoWhenBranchMatchedException();
    }
}
