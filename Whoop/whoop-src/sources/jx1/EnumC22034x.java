package jx1;

import gb1.AbstractC15673b0;
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

/* JADX INFO: renamed from: jx1.x */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m65681d2 = {"Ljx1/x;", "", "Li91/a;", "iconBackground", "", "Ljx1/b;", "backgroundColors", "", "alpha", "<init>", "(Ljava/lang/String;ILi91/a;Ljava/util/List;F)V", "Li91/a;", "getIconBackground", "()Li91/a;", "Ljava/util/List;", "getBackgroundColors", "()Ljava/util/List;", "F", "getAlpha", "()F", "ONE", "PEAK", "LIFE", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC22034x {
    ONE(AbstractC18249c.m52577o(AbstractC17918w0.m51517e(4294178297L)), AbstractC37056f.m118959K(new C22006b(0.0f, AbstractC17918w0.m51517e(4294967295L), null), new C22006b(0.8f, AbstractC17918w0.m51517e(2164260863L), null), new C22006b(1.0f, AbstractC17918w0.m51515c(16777215), null)), 0.2f),
    PEAK(AbstractC18249c.m52575m(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: jx1.x.a
        /* JADX INFO: renamed from: a */
        public final long m63012a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63012a((C39336i) obj));
        }
    })), AbstractC37056f.m118959K(new C22006b(0.0f, AbstractC17918w0.m51517e(4289577677L), null), new C22006b(0.8f, AbstractC17918w0.m51517e(2152176322L), null), new C22006b(1.0f, AbstractC17918w0.m51515c(4692674), null)), 0.5f),
    LIFE(AbstractC18249c.m52571i(p712j91.Function1.m60318a(AbstractC15673b0.m43989I0()), 1.0f), AbstractC37056f.m118959K(new C22006b(0.0f, AbstractC17918w0.m51517e(4290429613L), null), new C22006b(0.4f, AbstractC17918w0.m51517e(2160451545L), null), new C22006b(0.8f, AbstractC17918w0.m51517e(2159915198L), null), new C22006b(1.0f, AbstractC17918w0.m51515c(12431550), null)), 0.5f);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final float alpha;
    private final List<C22006b> backgroundColors;
    private final AbstractC18247a iconBackground;

    EnumC22034x(AbstractC18247a abstractC18247a, List list, float f13) {
        this.iconBackground = abstractC18247a;
        this.backgroundColors = list;
        this.alpha = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final List<C22006b> getBackgroundColors() {
        return this.backgroundColors;
    }

    public final AbstractC18247a getIconBackground() {
        return this.iconBackground;
    }

    /* synthetic */ EnumC22034x(AbstractC18247a abstractC18247a, List list, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18247a, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 1.0f : f13);
    }
}
