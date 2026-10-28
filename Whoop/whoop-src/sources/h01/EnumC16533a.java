package h01;

import androidx.compose.p018ui.Modifier;
import com.whoop.design.models.DesignSystemEnum;
import d11.C11475j;
import d11.C11476k;
import d11.InterfaceC11466a;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i91.C18250d;
import i91.C18252f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p490t0.AbstractC33253j;
import p712j91.Function1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: h01.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BC\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067"}, m65681d2 = {"Lh01/a;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Li91/a;", "background", "Ld11/a;", "borderInformation", "", "Ly81/e;", "buttonColor", "endIconColor", "Ly3/f;", "elevation", "<init>", "(Ljava/lang/String;ILi91/a;Ld11/a;Ljava/util/List;Ly81/e;F)V", "Li91/a;", "getBackground", "()Li91/a;", "Ld11/a;", "getBorderInformation", "()Ld11/a;", "Ljava/util/List;", "getButtonColor", "()Ljava/util/List;", "Ly81/e;", "getEndIconColor", "()Ly81/e;", "F", "getElevation-D9Ej5fM", "()F", "Landroidx/compose/ui/Modifier;", "styleModifier", "Landroidx/compose/ui/Modifier;", "getStyleModifier", "()Landroidx/compose/ui/Modifier;", "AI_COACH", "ADVANCED_LABS", "AMERICA_250", "ALERT", "CHALLENGE", "DEFAULT", "HAL", "LOCKED", "ONBOARDING", "ONBOARDING_BG_GRADIENT", "HEALTHSPAN_VOW_CARD", "HEALTHSPAN_VOW_INLINE", "REPORT", "WARNING", "PROMOTION", "PROMOTION_ALT", "PROMO_LINEAR", "PROMO_LINEAR_TRANSPARENCY", "SUFFICIENT", "ELEVATED", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class EnumC16533a implements DesignSystemEnum {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC16533a[] $VALUES;
    public static final EnumC16533a ADVANCED_LABS;
    public static final EnumC16533a CHALLENGE;
    public static final EnumC16533a ELEVATED;
    public static final EnumC16533a HEALTHSPAN_VOW_CARD;
    public static final EnumC16533a HEALTHSPAN_VOW_INLINE;
    public static final EnumC16533a LOCKED;
    public static final EnumC16533a ONBOARDING;
    public static final EnumC16533a PROMOTION;
    public static final EnumC16533a PROMOTION_ALT;
    public static final EnumC16533a PROMO_LINEAR;
    public static final EnumC16533a PROMO_LINEAR_TRANSPARENCY;
    public static final EnumC16533a REPORT;
    public static final EnumC16533a SUFFICIENT;
    public static final EnumC16533a WARNING;
    private final AbstractC18247a background;
    private final InterfaceC11466a borderInformation;
    private final List<InterfaceC39332e> buttonColor;
    private final float elevation;
    private final InterfaceC39332e endIconColor;
    private final Modifier styleModifier;
    public static final EnumC16533a AI_COACH = new EnumC16533a("AI_COACH", 0, null, new C11475j(Function1.m60318a(AbstractC15673b0.m43972A()), 0.0f, 2, null), AbstractC37056f.m118959K(p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4287324927L)), p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4283487743L))), null, 0.0f, 25, null);
    public static final EnumC16533a AMERICA_250 = new EnumC16533a("AMERICA_250", 2) { // from class: h01.a.u

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Modifier styleModifier;

        {
            C17909s c17909s = AbstractC17911t.f69612b;
            EnumC39333f enumC39333f = EnumC39333f.PATRIOTIC_BLUE;
            C17919x c17919x = new C17919x(enumC39333f.getColor());
            EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
            C17919x c17919x2 = new C17919x(enumC39333f2.getColor());
            EnumC39333f enumC39333f3 = EnumC39333f.PATRIOTIC_RED;
            C11475j c11475j = new C11475j(Function1.m60318a(C17909s.m51483a(c17909s, AbstractC37056f.m118959K(c17919x, c17919x2, new C17919x(enumC39333f3.getColor())), 0.0f, 0.0f, 14)), 0.0f, 2, null);
            List listM118959K = AbstractC37056f.m118959K(enumC39333f, enumC39333f2, enumC39333f3);
            float f13 = 4;
            float f14 = 0 * f13;
            C18250d c18250d = new C18250d(Function1.m60318a(C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51528p(C17919x.m51541c(0.3f, enumC39333f.getColor()), AbstractC16535b.f63626a)), new C17919x(AbstractC16535b.f63626a), new C17919x(AbstractC17918w0.m51528p(C17919x.m51541c(0.3f, enumC39333f3.getColor()), AbstractC16535b.f63626a))), 0.0f, 0.0f, 14)), 0.0f, 2, null);
            this.styleModifier = AbstractC18249c.m52567e(C2314t.f9131w, getBackground(), AbstractC33253j.m105489e(3 * f13), null, 4, null);
        }

        @Override // h01.EnumC16533a
        public Modifier getStyleModifier() {
            return this.styleModifier;
        }
    };
    public static final EnumC16533a ALERT = new EnumC16533a("ALERT", 3, null, new C11476k(EnumC39333f.BRAND_PRIMARY, 0.0f, 2, null), AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.p
        /* JADX INFO: renamed from: a */
        public final long m46702a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandPrimary();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46702a((C39336i) obj));
        }
    })), null, 0.0f, 25, null);
    public static final EnumC16533a DEFAULT = new EnumC16533a("DEFAULT", 5, null, null, null, null, 0.0f, 31, null);
    public static final EnumC16533a HAL = new EnumC16533a("HAL", 6) { // from class: h01.a.v

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Modifier styleModifier;

        /* JADX INFO: renamed from: h01.a$v$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements p715kotlin.jvm.functions.Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f63610w = new a();

            /* JADX INFO: renamed from: a */
            public final long m46707a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return AbstractC17918w0.m51517e(4287324927L);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46707a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: h01.a$v$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements p715kotlin.jvm.functions.Function1 {

            /* JADX INFO: renamed from: w */
            public static final b f63611w = new b();

            /* JADX INFO: renamed from: a */
            public final long m46708a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return AbstractC17918w0.m51517e(4283487743L);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46708a((C39336i) obj));
            }
        }

        {
            C11475j c11475j = new C11475j(Function1.m60318a(AbstractC15673b0.m43972A()), 0.0f, 2, null);
            List listM118959K = AbstractC37056f.m118959K(p745y81.Function1.m125323a(a.f63610w), p745y81.Function1.m125323a(b.f63611w));
            float f13 = 4;
            float f14 = 0 * f13;
            C18250d c18250d = new C18250d(Function1.m60318a(AbstractC15673b0.m43972A()), 0.0f, 2, null);
            this.styleModifier = AbstractC18249c.m52566d(C2314t.f9131w, getBackground(), AbstractC33253j.m105489e(3 * f13), Float.valueOf(0.1f));
        }

        @Override // h01.EnumC16533a
        public Modifier getStyleModifier() {
            return this.styleModifier;
        }
    };
    public static final EnumC16533a ONBOARDING_BG_GRADIENT = new EnumC16533a("ONBOARDING_BG_GRADIENT", 9) { // from class: h01.a.w

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Modifier styleModifier;

        /* JADX INFO: renamed from: h01.a$w$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements p715kotlin.jvm.functions.Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f63613w = new a();

            /* JADX INFO: renamed from: a */
            public final long m46709a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentOnboardingAction();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46709a((C39336i) obj));
            }
        }

        {
            C11475j c11475j = new C11475j(Function1.m60318a(AbstractC15673b0.m43983F0()), 0.0f, 2, null);
            List listM118958J = AbstractC37056f.m118958J(p745y81.Function1.m125323a(a.f63613w));
            float f13 = 4;
            float f14 = 0 * f13;
            C18250d c18250d = new C18250d(Function1.m60318a(AbstractC15673b0.m43985G0()), 0.0f, 2, null);
            this.styleModifier = AbstractC18249c.m52566d(C2314t.f9131w, getBackground(), AbstractC33253j.m105489e(3 * f13), Float.valueOf(0.1f));
        }

        @Override // h01.EnumC16533a
        public Modifier getStyleModifier() {
            return this.styleModifier;
        }
    };

    /* JADX INFO: renamed from: h01.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f63598w = new k();

        /* JADX INFO: renamed from: a */
        public final long m46697a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46697a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h01.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f63600w = new m();

        /* JADX INFO: renamed from: a */
        public final long m46699a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46699a((C39336i) obj));
        }
    }

    private static final /* synthetic */ EnumC16533a[] $values() {
        return new EnumC16533a[]{AI_COACH, ADVANCED_LABS, AMERICA_250, ALERT, CHALLENGE, DEFAULT, HAL, LOCKED, ONBOARDING, ONBOARDING_BG_GRADIENT, HEALTHSPAN_VOW_CARD, HEALTHSPAN_VOW_INLINE, REPORT, WARNING, PROMOTION, PROMOTION_ALT, PROMO_LINEAR, PROMO_LINEAR_TRANSPARENCY, SUFFICIENT, ELEVATED};
    }

    static {
        float f13 = 0;
        float f14 = f13 * 4;
        ADVANCED_LABS = new EnumC16533a("ADVANCED_LABS", 1, new C18252f(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.n
            /* JADX INFO: renamed from: a */
            public final long m46700a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite10();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46700a((C39336i) obj));
            }
        }), null, 2, null), null, AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.o
            /* JADX INFO: renamed from: a */
            public final long m46701a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getRecovery();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46701a((C39336i) obj));
            }
        })), null, f14, 8, null);
        CHALLENGE = new EnumC16533a("CHALLENGE", 4, null, new C11476k(EnumC39333f.BRAND_WHOOP_PRO, 0.0f, 2, null), AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.q
            /* JADX INFO: renamed from: a */
            public final long m46703a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhoopPro();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46703a((C39336i) obj));
            }
        })), null, f14, 9, null);
        LOCKED = new EnumC16533a("LOCKED", 7, new C18252f(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.r
            /* JADX INFO: renamed from: a */
            public final long m46704a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getTransparent();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46704a((C39336i) obj));
            }
        }), null, 2, null), new C11476k(EnumC39333f.WHITE_10, 0.0f, 2, null), null, null, f14, 12, null);
        ONBOARDING = new EnumC16533a("ONBOARDING", 8, null, new C11475j(Function1.m60318a(AbstractC15673b0.m43983F0()), 0.0f, 2, null), AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.s
            /* JADX INFO: renamed from: a */
            public final long m46705a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentOnboardingAction();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46705a((C39336i) obj));
            }
        })), null, f14, 9, null);
        C18250d c18250d = new C18250d(Function1.m60318a(AbstractC15673b0.m43979D0()), 0.0f, 2, null);
        List<C17919x> listM44049m = AbstractC15673b0.m44049m();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44049m, 10));
        Iterator<T> it = listM44049m.iterator();
        while (it.hasNext()) {
            final long j7 = ((C17919x) it.next()).f69639a;
            arrayList.add(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.t
                /* JADX INFO: renamed from: a */
                public final long m46706a(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return j7;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m46706a((C39336i) obj));
                }
            }));
        }
        HEALTHSPAN_VOW_CARD = new EnumC16533a("HEALTHSPAN_VOW_CARD", 10, c18250d, new C11475j(Function1.m60318a(AbstractC15673b0.m43979D0()), 1, null), arrayList, null, f14, 8, null);
        HEALTHSPAN_VOW_INLINE = new EnumC16533a("HEALTHSPAN_VOW_INLINE", 11, new C18252f(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.a
            /* JADX INFO: renamed from: a */
            public final long m46687a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getTransparent();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46687a((C39336i) obj));
            }
        }), null, 2, null), null, AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.b
            /* JADX INFO: renamed from: a */
            public final long m46688a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getRecovery();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46688a((C39336i) obj));
            }
        })), null, f14, 8, null);
        REPORT = new EnumC16533a("REPORT", 12, null, null, null, null, 0.0f, 31, null);
        WARNING = new EnumC16533a("WARNING", 13, null, new C11476k(EnumC39333f.ACCENT_NEGATIVE_TREND, 0.0f, 2, null), AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.c
            /* JADX INFO: renamed from: a */
            public final long m46689a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentNegativeTrend();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46689a((C39336i) obj));
            }
        })), null, 0.0f, 25, null);
        PROMOTION = new EnumC16533a("PROMOTION", 14, null, new C11475j(Function1.m60318a(AbstractC15673b0.m43977C0()), 0.0f, 2, null), AbstractC37056f.m118959K(p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4292594804L)), p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4287655729L))), null, 0.0f, 25, null);
        PROMOTION_ALT = new EnumC16533a("PROMOTION_ALT", 15, null, null, AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.d
            /* JADX INFO: renamed from: a */
            public final long m46690a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhite();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46690a((C39336i) obj));
            }
        })), null, 0.0f, 25, null);
        C11475j c11475j = new C11475j(Function1.m60318a(AbstractC15673b0.m43989I0()), 0.0f, 2, null);
        List<C17919x> listM44059r = AbstractC15673b0.m44059r();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM44059r, 10));
        Iterator<T> it3 = listM44059r.iterator();
        while (it3.hasNext()) {
            final long j13 = ((C17919x) it3.next()).f69639a;
            arrayList2.add(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.e
                /* JADX INFO: renamed from: a */
                public final long m46691a(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return j13;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m46691a((C39336i) obj));
                }
            }));
        }
        PROMO_LINEAR = new EnumC16533a("PROMO_LINEAR", 16, null, c11475j, arrayList2, null, f14, 9, null);
        C11475j c11475j2 = new C11475j(Function1.m60318a(AbstractC15673b0.m43989I0()), 0.0f, 2, null);
        List<C17919x> listM44059r2 = AbstractC15673b0.m44059r();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM44059r2, 10));
        Iterator<T> it4 = listM44059r2.iterator();
        while (it4.hasNext()) {
            final long j14 = ((C17919x) it4.next()).f69639a;
            arrayList3.add(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.f
                /* JADX INFO: renamed from: a */
                public final long m46692a(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return j14;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m46692a((C39336i) obj));
                }
            }));
        }
        PROMO_LINEAR_TRANSPARENCY = new EnumC16533a("PROMO_LINEAR_TRANSPARENCY", 17, new C18252f(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.g
            /* JADX INFO: renamed from: a */
            public final long m46693a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite10();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46693a((C39336i) obj));
            }
        }), null, 2, null), c11475j2, arrayList3, null, f14, 8, null);
        SUFFICIENT = new EnumC16533a("SUFFICIENT", 18, new C18252f(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.i
            /* JADX INFO: renamed from: a */
            public final long m46695a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return AbstractC17918w0.m51528p(whoopColor.getSufficientTrend15(), AbstractC16535b.f63626a);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46695a((C39336i) obj));
            }
        }), null, 2, null), new C11476k(EnumC39333f.SUFFICIENT_TREND, 0.0f, 2, null), AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.h
            /* JADX INFO: renamed from: a */
            public final long m46694a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getSufficientTrend();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46694a((C39336i) obj));
            }
        })), null, f13, 8, null);
        ELEVATED = new EnumC16533a("ELEVATED", 19, new C18252f(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.j
            /* JADX INFO: renamed from: a */
            public final long m46696a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite10();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46696a((C39336i) obj));
            }
        }), null, 2, null), null, AbstractC37056f.m118958J(p745y81.Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: h01.a.l
            /* JADX INFO: renamed from: a */
            public final long m46698a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getStrain();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m46698a((C39336i) obj));
            }
        })), null, f14, 8, null);
        EnumC16533a[] enumC16533aArr$values = $values();
        $VALUES = enumC16533aArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC16533aArr$values);
    }

    private EnumC16533a(String str, int i13, AbstractC18247a abstractC18247a, InterfaceC11466a interfaceC11466a, List list, InterfaceC39332e interfaceC39332e, float f13) {
        super(str, i13);
        this.background = abstractC18247a;
        this.borderInformation = interfaceC11466a;
        this.buttonColor = list;
        this.endIconColor = interfaceC39332e;
        this.elevation = f13;
        this.styleModifier = AbstractC18249c.m52565c(C2314t.f9131w, abstractC18247a);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC16533a valueOf(String str) {
        return (EnumC16533a) Enum.valueOf(EnumC16533a.class, str);
    }

    public static EnumC16533a[] values() {
        return (EnumC16533a[]) $VALUES.clone();
    }

    public final AbstractC18247a getBackground() {
        return this.background;
    }

    public final InterfaceC11466a getBorderInformation() {
        return this.borderInformation;
    }

    public final List<InterfaceC39332e> getButtonColor() {
        return this.buttonColor;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public final InterfaceC39332e getEndIconColor() {
        return this.endIconColor;
    }

    public Modifier getStyleModifier() {
        return this.styleModifier;
    }

    public EnumC16533a(String str, int i13, AbstractC18247a abstractC18247a, InterfaceC11466a interfaceC11466a, List list, InterfaceC39332e interfaceC39332e, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? new C18252f(p745y81.Function1.m125324b(AbstractC16535b.f63626a), null, 2, null) : abstractC18247a, (i14 & 2) != 0 ? new C11476k(EnumC39333f.RECOVERY, 0.0f, 2, null) : interfaceC11466a, (i14 & 4) != 0 ? AbstractC37056f.m118958J(p745y81.Function1.m125323a(k.f63598w)) : list, (i14 & 8) != 0 ? p745y81.Function1.m125323a(m.f63600w) : interfaceC39332e, (i14 & 16) != 0 ? 1 * 4 : f13);
    }
}
