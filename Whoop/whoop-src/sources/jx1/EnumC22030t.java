package jx1;

import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import l83.C23465k;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.Function1;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: jx1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\b\u0002\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, m65681d2 = {"Ljx1/t;", "", "", "Ll83/k;", "", "Li2/x;", "backgroundColors", "alpha", "Li91/a;", "buttonBackground", "<init>", "(Ljava/lang/String;I[Ll83/k;FLi91/a;)V", "[Ll83/k;", "getBackgroundColors", "()[Ll83/k;", "F", "getAlpha", "()F", "Li91/a;", "getButtonBackground", "()Li91/a;", "ONE", "PEAK", "LIFE", "DISABLED", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC22030t {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC22030t[] $VALUES;
    public static final EnumC22030t DISABLED;
    public static final EnumC22030t LIFE;
    public static final EnumC22030t ONE;
    public static final EnumC22030t PEAK;
    private final float alpha;
    private final C23465k[] backgroundColors;
    private final AbstractC18247a buttonBackground;

    private static final /* synthetic */ EnumC22030t[] $values() {
        return new EnumC22030t[]{ONE, PEAK, LIFE, DISABLED};
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        C23465k c23465k = new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51515c(16777215)));
        Float fValueOf2 = Float.valueOf(1.0f);
        ONE = new EnumC22030t("ONE", 0, new C23465k[]{c23465k, new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51515c(452984831)))}, 0.5f, AbstractC18249c.m52575m(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: jx1.t.a
            /* JADX INFO: renamed from: a */
            public final long m62999a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhite();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m62999a((C39336i) obj));
            }
        })));
        C23465k c23465k2 = new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4289577677L)));
        Float fValueOf3 = Float.valueOf(0.8f);
        PEAK = new EnumC22030t("PEAK", 1, new C23465k[]{c23465k2, new C23465k(fValueOf3, new C17919x(AbstractC17918w0.m51517e(2152176322L))), new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51515c(4692674)))}, 0.5f, AbstractC18249c.m52575m(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: jx1.t.b
            /* JADX INFO: renamed from: a */
            public final long m63000a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getStrainZone1();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m63000a((C39336i) obj));
            }
        })));
        C23465k c23465k3 = new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4290429613L)));
        Float fValueOf4 = Float.valueOf(0.4f);
        LIFE = new EnumC22030t("LIFE", 2, new C23465k[]{c23465k3, new C23465k(fValueOf4, new C17919x(AbstractC17918w0.m51517e(2160451545L))), new C23465k(fValueOf3, new C17919x(AbstractC17918w0.m51517e(2159915198L))), new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51515c(12431550)))}, 0.5f, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()));
        DISABLED = new EnumC22030t("DISABLED", 3, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4290429613L))), new C23465k(fValueOf4, new C17919x(AbstractC17918w0.m51517e(2160451545L))), new C23465k(fValueOf3, new C17919x(AbstractC17918w0.m51517e(2159915198L))), new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51515c(12431550)))}, 0.5f, AbstractC18249c.m52577o(C17919x.f69636m));
        EnumC22030t[] enumC22030tArr$values = $values();
        $VALUES = enumC22030tArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC22030tArr$values);
    }

    private EnumC22030t(String str, int i13, C23465k[] c23465kArr, float f13, AbstractC18247a abstractC18247a) {
        super(str, i13);
        this.backgroundColors = c23465kArr;
        this.alpha = f13;
        this.buttonBackground = abstractC18247a;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC22030t valueOf(String str) {
        return (EnumC22030t) Enum.valueOf(EnumC22030t.class, str);
    }

    public static EnumC22030t[] values() {
        return (EnumC22030t[]) $VALUES.clone();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final C23465k[] getBackgroundColors() {
        return this.backgroundColors;
    }

    public final AbstractC18247a getButtonBackground() {
        return this.buttonBackground;
    }

    public /* synthetic */ EnumC22030t(String str, int i13, C23465k[] c23465kArr, float f13, AbstractC18247a abstractC18247a, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? new C23465k[0] : c23465kArr, (i14 & 2) != 0 ? 1.0f : f13, abstractC18247a);
    }
}
