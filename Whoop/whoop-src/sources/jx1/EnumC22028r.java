package jx1;

import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import java.util.List;
import m83.C25271y;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.Function1;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

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
/* JADX INFO: renamed from: jx1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m65681d2 = {"Ljx1/r;", "", "Li91/a;", "background", "", "Ljx1/b;", "backgroundColors", "", "alpha", "<init>", "(Ljava/lang/String;ILi91/a;Ljava/util/List;F)V", "Li91/a;", "getBackground", "()Li91/a;", "Ljava/util/List;", "getBackgroundColors", "()Ljava/util/List;", "F", "getAlpha", "()F", "ONE", "PEAK", "LIFE", "PLAIN", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC22028r {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC22028r[] $VALUES;
    public static final EnumC22028r LIFE;
    public static final EnumC22028r ONE;
    public static final EnumC22028r PEAK = new EnumC22028r("PEAK", 1, null, AbstractC37056f.m118959K(new C22006b(0.0f, AbstractC17918w0.m51517e(4289577677L), null), new C22006b(0.8f, AbstractC17918w0.m51517e(2152176322L), null), new C22006b(1.0f, AbstractC17918w0.m51515c(4692674), null)), 0.5f, 1, null);
    public static final EnumC22028r PLAIN = new EnumC22028r("PLAIN", 3, AbstractC18249c.m52575m(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: jx1.r.a
        /* JADX INFO: renamed from: a */
        public final long m62974a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m62974a((C39336i) obj));
        }
    })), null, 0.0f, 6, null);
    private final float alpha;
    private final AbstractC18247a background;
    private final List<C22006b> backgroundColors;

    private static final /* synthetic */ EnumC22028r[] $values() {
        return new EnumC22028r[]{ONE, PEAK, LIFE, PLAIN};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        ONE = new EnumC22028r("ONE", 0, null, AbstractC37056f.m118959K(new C22006b(0.0f, AbstractC17918w0.m51517e(4294967295L), null), new C22006b(0.8f, AbstractC17918w0.m51517e(2164260863L), null), new C22006b(1.0f, AbstractC17918w0.m51515c(16777215), null)), 0.2f, 1, defaultConstructorMarker);
        LIFE = new EnumC22028r("LIFE", 2, null, AbstractC37056f.m118959K(new C22006b(0.0f, AbstractC17918w0.m51517e(4290429613L), null), new C22006b(0.4f, AbstractC17918w0.m51517e(2160451545L), null), new C22006b(0.8f, AbstractC17918w0.m51517e(2159915198L), null), new C22006b(1.0f, AbstractC17918w0.m51515c(12431550), null)), 0.5f, 1, defaultConstructorMarker);
        EnumC22028r[] enumC22028rArr$values = $values();
        $VALUES = enumC22028rArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC22028rArr$values);
    }

    private EnumC22028r(String str, int i13, AbstractC18247a abstractC18247a, List list, float f13) {
        super(str, i13);
        this.background = abstractC18247a;
        this.backgroundColors = list;
        this.alpha = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC22028r valueOf(String str) {
        return (EnumC22028r) Enum.valueOf(EnumC22028r.class, str);
    }

    public static EnumC22028r[] values() {
        return (EnumC22028r[]) $VALUES.clone();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final AbstractC18247a getBackground() {
        return this.background;
    }

    public final List<C22006b> getBackgroundColors() {
        return this.backgroundColors;
    }

    public /* synthetic */ EnumC22028r(String str, int i13, AbstractC18247a abstractC18247a, List list, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? null : abstractC18247a, (i14 & 2) != 0 ? C25271y.f99162w : list, (i14 & 4) != 0 ? 1.0f : f13);
    }
}
