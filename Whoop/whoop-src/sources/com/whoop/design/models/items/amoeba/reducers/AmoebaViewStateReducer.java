package com.whoop.design.models.items.amoeba.reducers;

import a51.C0388c;
import a51.C0389d;
import a51.C0391f;
import a51.C0392g;
import android.os.Build;
import b51.InterfaceC2739c;
import c51.C4235l;
import c51.C4236m;
import c51.C4237n;
import c51.C4238o;
import c51.C4241r;
import c51.C4242s;
import c51.EnumC4225b0;
import c51.EnumC4239p;
import com.whoop.design.models.items.amoeba.AmoebaDomainResult;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoebaStyleValues;
import d51.AbstractC11717e;
import d51.C11716d;
import e93.AbstractC12889b;
import i93.C18279e;
import i93.C18284j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23465k;
import m83.AbstractC25247g0;
import p077d0.AbstractC11333b0;
import p077d0.InterfaceC11419z;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p543v4.AbstractC35642a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import p745y81.EnumC39333f;
import va3.AbstractC35849g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.C39410n;
import z41.AbstractC40076k;
import z41.C40071f;
import z41.C40072g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u0002002\u0006\u0010\u0007\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020*2\u0006\u00103\u001a\u00020,¢\u0006\u0004\b4\u00105J!\u00108\u001a\u0004\u0018\u0001072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u00106\u001a\u00020\u001d¢\u0006\u0004\b8\u00109J!\u0010;\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0 2\u0006\u0010:\u001a\u00020,¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u000200¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010A¨\u0006C"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;", "", "Lc51/n;", "amoebaSettings", "<init>", "(Lc51/n;)V", "Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;", "domainResult", "Lc51/o;", "getAmoebaTextViewState", "(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;)Lc51/o;", "Lc51/p;", "showTransitionAnimation", "", "paceOfAgingAnimationScore", "La51/d;", "getEmitterAnimationConfig", "(Lc51/p;D)La51/d;", "Li2/t;", "getCenterShadowBrush", "(D)Li2/t;", "emitterAnimationConfig", "Lc51/m;", "getAmoebaParticleViewState", "(DLa51/d;)Lc51/m;", "Lc51/l;", "getAmoebaOutlineViewState", "(D)Lc51/l;", "yearsDifferenceAnimationScore", "", "isOnboarding", "settings", "Ll83/k;", "Li2/x;", "getBlendedColors", "(DZLc51/n;)Ll83/k;", "colorA", "colorB", "ratio", "blendColors-2_19RoU", "(JJD)J", "blendColors", "Ly81/f;", "subtitleColor", "", "getStyleFromColor", "(Ly81/f;)Ljava/lang/String;", "Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;", "Lc51/s;", "reduce", "(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;", "textStyle", "amoebaTextStyleToWhoopColor", "(Ljava/lang/String;)Ly81/f;", "didYearsDifferenceImprove", "Lc51/r;", "getTransitionViewState", "(Lc51/p;Z)Lc51/r;", "input", "extractFirstNumber", "(Ljava/lang/String;)Ll83/k;", "viewState", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "toWhoopAgeAmoeba", "(Lc51/s;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "Lc51/n;", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AmoebaViewStateReducer {
    private final C4237n amoebaSettings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C4237n.f17198m;
    private static final Map<EnumC4225b0, EnumC39333f> textStyleMap = AbstractC25247g0.m73990Y(new C23465k(EnumC4225b0.NEUTRAL, EnumC39333f.HEALTH_NEUTRAL), new C23465k(EnumC4225b0.YOUNGER, EnumC39333f.HEALTH_YOUNG), new C23465k(EnumC4225b0.OLDER, EnumC39333f.HEALTH_OLD), new C23465k(EnumC4225b0.CALIBRATING, EnumC39333f.HEALTH_CALIBRATING));

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;", "", "<init>", "()V", "", "Lc51/b0;", "Ly81/f;", "textStyleMap", "Ljava/util/Map;", "getTextStyleMap", "()Ljava/util/Map;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<EnumC4225b0, EnumC39333f> getTextStyleMap() {
            return AmoebaViewStateReducer.textStyleMap;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AmoebaViewStateReducer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: blendColors-2_19RoU, reason: not valid java name */
    private final long m134159blendColors2_19RoU(long colorA, long colorB, double ratio) {
        return AbstractC17918w0.m51515c(AbstractC35642a.m112833b((float) ratio, AbstractC17918w0.m51506H(colorA), AbstractC17918w0.m51506H(colorB)));
    }

    private final C4235l getAmoebaOutlineViewState(double paceOfAgingAnimationScore) {
        return new C4235l(AbstractC11717e.m31314c(this.amoebaSettings.getOutline().getSegmentCountRange(), paceOfAgingAnimationScore), this.amoebaSettings.getOutline().m13266i(paceOfAgingAnimationScore), this.amoebaSettings.getOutline().getSegmentCountRange(), this.amoebaSettings.getOutline().getMinTransformValue(), this.amoebaSettings.getOutline().getMaxTransformValue(), this.amoebaSettings.getOutline().getAnimationIntervalPerGroup(), this.amoebaSettings.getOutline().getTransformUpdatesPerInterval(), this.amoebaSettings.getOutline().getAnimationEasing(), this.amoebaSettings.getOutline().getStrokeWidth(), this.amoebaSettings.getOutline().getAnimationGroups(), null);
    }

    private final C4236m getAmoebaParticleViewState(double paceOfAgingAnimationScore, C0389d emitterAnimationConfig) {
        float fM31308c = (float) this.amoebaSettings.getParticles().getMinSpeedRange().m31308c(paceOfAgingAnimationScore);
        float fM31308c2 = (float) this.amoebaSettings.getParticles().getMaxSpeedRange().m31308c(paceOfAgingAnimationScore);
        float fM31308c3 = (float) this.amoebaSettings.getParticles().getDampingRange().m31308c(paceOfAgingAnimationScore);
        float fM31308c4 = (float) this.amoebaSettings.getParticles().getRotationAnimationSpeed().m31308c(paceOfAgingAnimationScore);
        long jM31308c = (long) this.amoebaSettings.getParticles().getTimeToLiveRange().m31308c(paceOfAgingAnimationScore);
        List listM118958J = AbstractC37056f.m118958J(InterfaceC2739c.a.f10770a);
        return new C4236m(new C40072g(360, 0, fM31308c, fM31308c2, fM31308c3, new C40071f(0.18f, (float) this.amoebaSettings.getParticles().getEndOfLifeSizeMultiplierRange().m31308c(paceOfAgingAnimationScore), AbstractC11333b0.f36312c, new C18279e(1.0f, 4.5f)), AbstractC37056f.m118958J(new C17919x(AbstractC17918w0.m51517e(4026531839L))), listM118958J, jM31308c, false, 2.0f, null, (float) this.amoebaSettings.getParticles().getRadiusRange().m31308c(paceOfAgingAnimationScore), 0, fM31308c4, new C0391f(null, (float) this.amoebaSettings.getParticles().getParticlesPerSecondRange().m31308c(paceOfAgingAnimationScore), emitterAnimationConfig, null), null, (float) this.amoebaSettings.getParticles().getGravityFactorRange().m31308c(paceOfAgingAnimationScore), 76290, null), (float) this.amoebaSettings.getParticles().getRotationAnimationSpeed().m31308c(paceOfAgingAnimationScore));
    }

    private final C4238o getAmoebaTextViewState(AmoebaDomainResult.Result domainResult) {
        if (domainResult.isOnboarding()) {
            return null;
        }
        C23465k c23465kExtractFirstNumber = extractFirstNumber(domainResult.getWhoopAgeAmoeba().getAgeSubtitleDisplay());
        String str = (String) c23465kExtractFirstNumber.f92937w;
        return new C4238o(domainResult.getWhoopAgeAmoeba().getAgeValueDisplay(), domainResult.getWhoopAgeAmoeba().getAgeTitleDisplay(), (String) c23465kExtractFirstNumber.f92938x, str, amoebaTextStyleToWhoopColor(domainResult.getWhoopAgeAmoeba().getAgeSubtitleStyle()), null, false, 96, null);
    }

    private final C23465k getBlendedColors(double yearsDifferenceAnimationScore, boolean isOnboarding, C4237n settings) {
        if (isOnboarding) {
            return settings.getOnboardingColors();
        }
        double size = yearsDifferenceAnimationScore * ((double) this.amoebaSettings.m13202f().size());
        int iM36285o = AbstractC12889b.m36285o((int) size, new C18284j(0, this.amoebaSettings.m13202f().size() - 1, 1));
        int iM36285o2 = AbstractC12889b.m36285o(AbstractC12889b.m36257W(Math.ceil(size)), new C18284j(0, this.amoebaSettings.m13202f().size() - 1, 1));
        C23465k c23465k = this.amoebaSettings.m13202f().get(iM36285o);
        C23465k c23465k2 = this.amoebaSettings.m13202f().get(iM36285o2);
        double d3 = size - ((double) iM36285o);
        return new C23465k(new C17919x(m134159blendColors2_19RoU(((C17919x) c23465k.f92937w).f69639a, ((C17919x) c23465k2.f92937w).f69639a, d3)), new C17919x(m134159blendColors2_19RoU(((C17919x) c23465k.f92938x).f69639a, ((C17919x) c23465k2.f92938x).f69639a, d3)));
    }

    private final AbstractC17911t getCenterShadowBrush(double paceOfAgingAnimationScore) {
        return C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(this.amoebaSettings.getCenterShadow().getColor())), new C23465k(Float.valueOf((float) this.amoebaSettings.getCenterShadow().getStartRange().m31308c(paceOfAgingAnimationScore)), new C17919x(this.amoebaSettings.getCenterShadow().getColor())), new C23465k(Float.valueOf((float) this.amoebaSettings.getCenterShadow().getStopRange().m31308c(paceOfAgingAnimationScore)), new C17919x(AbstractC17918w0.m51515c(0)))}, 0L, 0.0f, 14);
    }

    private final C0389d getEmitterAnimationConfig(EnumC4239p showTransitionAnimation, double paceOfAgingAnimationScore) {
        Float fValueOf = Float.valueOf(-2.5f);
        Float fValueOf2 = Float.valueOf(1.0f);
        if (showTransitionAnimation == null) {
            return null;
        }
        AbstractC40076k.b bVar = new AbstractC40076k.b(0.5d, 0.5d);
        long easeInDuration = this.amoebaSettings.getTransition().getEaseInDuration();
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return new C0389d(new C0392g(bVar, new C0388c(1.0f, new C18279e(0.0f, ((float) Duration.m134298toDoubleimpl(easeInDuration, durationUnit)) * 1.05f), new C11716d(new C23465k[]{new C23465k(Float.valueOf(0.0f), Float.valueOf(0.5f)), new C23465k(Float.valueOf(0.94f), fValueOf2), new C23465k(Float.valueOf(0.95f), fValueOf), new C23465k(fValueOf2, fValueOf)}, (InterfaceC11419z) null, 2, (DefaultConstructorMarker) null), null, 8, null)), new C0388c(this.amoebaSettings.getCenterShadow().getStartRange().m31309d((float) paceOfAgingAnimationScore) * 600, new C18279e(0.0f, (float) Duration.m134298toDoubleimpl(this.amoebaSettings.getTransition().getEaseInDuration(), durationUnit)), null, null, 12, null));
    }

    private final String getStyleFromColor(EnumC39333f subtitleColor) {
        Object next;
        EnumC4225b0 enumC4225b0;
        Iterator<T> it = textStyleMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((EnumC39333f) ((Map.Entry) next).getValue()).name(), subtitleColor.name()));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (enumC4225b0 = (EnumC4225b0) entry.getKey()) == null) {
            return null;
        }
        return enumC4225b0.name();
    }

    public final EnumC39333f amoebaTextStyleToWhoopColor(String textStyle) {
        EnumC4225b0 enumC4225b0;
        AbstractC22676k.m65750j(textStyle, "textStyle");
        EnumC4225b0 enumC4225b1 = EnumC4225b0.NEUTRAL;
        EnumC4225b0[] enumC4225b0ArrValues = EnumC4225b0.values();
        int length = enumC4225b0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC4225b0 = null;
                break;
            }
            enumC4225b0 = enumC4225b0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC4225b0.name(), textStyle)) {
                break;
            }
            i13++;
        }
        if (enumC4225b0 != null) {
            enumC4225b1 = enumC4225b0;
        }
        return textStyleMap.getOrDefault(enumC4225b1, EnumC39333f.HEALTH_NEUTRAL);
    }

    public final C23465k extractFirstNumber(String input) {
        AbstractC22676k.m65750j(input, "input");
        Pattern patternCompile = Pattern.compile("[+-]?(\\d+(\\.\\d+)?|\\.\\d+)");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(input);
        AbstractC22676k.m65749i(matcher, "matcher(...)");
        C39410n c39410nM113800b = AbstractC35849g.m113800b(matcher, 0, input);
        String strM125845c = c39410nM113800b != null ? c39410nM113800b.m125845c() : "";
        if (c39410nM113800b != null) {
            C18284j range = c39410nM113800b.m125844b();
            AbstractC22676k.m65750j(range, "range");
            String string = AbstractC39414r.m125899r0(range.f71133w, range.f71134x + 1, input).toString();
            if (string != null) {
                input = string;
            }
        }
        return new C23465k(input, strM125845c);
    }

    public final C4241r getTransitionViewState(EnumC4239p showTransitionAnimation, boolean didYearsDifferenceImprove) {
        if (showTransitionAnimation != null) {
            return new C4241r(showTransitionAnimation, this.amoebaSettings.getTransition().getEaseInDuration(), this.amoebaSettings.getTransition().getEaseOutDuration(), didYearsDifferenceImprove ? this.amoebaSettings.getTransition().getPositivePulseColor() : this.amoebaSettings.getTransition().getNegativePulseColor(), this.amoebaSettings.getTransition().getPercentTimeInColorPulse(), this.amoebaSettings.getTransition().getColorPulseAnimationDuration(), null);
        }
        return null;
    }

    public final C4242s reduce(AmoebaDomainResult domainResult) {
        WhoopAgeAmoebaStyleValues styleValues;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (!(domainResult instanceof AmoebaDomainResult.Result)) {
            throw new NoWhenBranchMatchedException();
        }
        AmoebaDomainResult.Result result = (AmoebaDomainResult.Result) domainResult;
        double paceOfAgingAnimationScore = result.getWhoopAgeAmoeba().getStyleValues().getPaceOfAgingAnimationScore();
        double yearsDifferenceAnimationScore = result.getWhoopAgeAmoeba().getStyleValues().getYearsDifferenceAnimationScore();
        EnumC4239p playTransition = result.getPreviousWhoopAgeAmoeba() != null ? result.getPlayTransition() : null;
        WhoopAgeAmoeba previousWhoopAgeAmoeba = result.getPreviousWhoopAgeAmoeba();
        C4241r transitionViewState = getTransitionViewState(playTransition, ((previousWhoopAgeAmoeba == null || (styleValues = previousWhoopAgeAmoeba.getStyleValues()) == null) ? 0.0d : styleValues.getYearsDifference()) > result.getWhoopAgeAmoeba().getStyleValues().getYearsDifference());
        C0389d emitterAnimationConfig = getEmitterAnimationConfig(playTransition, paceOfAgingAnimationScore);
        return new C4242s(this.amoebaSettings.getRadius(), this.amoebaSettings.getPadding(), this.amoebaSettings.getGradientPadding(), paceOfAgingAnimationScore, yearsDifferenceAnimationScore, getBlendedColors(yearsDifferenceAnimationScore, result.isOnboarding(), this.amoebaSettings), getCenterShadowBrush(paceOfAgingAnimationScore), getAmoebaOutlineViewState(paceOfAgingAnimationScore), Build.VERSION.SDK_INT < 31, this.amoebaSettings.getEdgeFade(), this.amoebaSettings.getPrimitiveEdgeFade(), getAmoebaParticleViewState(paceOfAgingAnimationScore, emitterAnimationConfig), transitionViewState, getAmoebaTextViewState(result), null);
    }

    public final WhoopAgeAmoeba toWhoopAgeAmoeba(C4242s viewState) {
        String ageSubtitleValueDisplay;
        String ageSubtitleDisplay;
        EnumC39333f subtitleColor;
        String styleFromColor;
        String ageTitleDisplay;
        String ageValueDisplay;
        AbstractC22676k.m65750j(viewState, "viewState");
        WhoopAgeAmoebaStyleValues whoopAgeAmoebaStyleValues = new WhoopAgeAmoebaStyleValues(0.0d, viewState.getPaceOfAgingAnimationScore(), viewState.getYearsDifferenceAnimationScore(), viewState.getYearsDifferenceAnimationScore(), viewState.getPaceOfAgingAnimationScore());
        C4238o text = viewState.getText();
        String str = (text == null || (ageValueDisplay = text.getAgeValueDisplay()) == null) ? "" : ageValueDisplay;
        C4238o text2 = viewState.getText();
        String str2 = (text2 == null || (ageTitleDisplay = text2.getAgeTitleDisplay()) == null) ? "" : ageTitleDisplay;
        C4238o text3 = viewState.getText();
        if (text3 == null || (ageSubtitleValueDisplay = text3.getAgeSubtitleValueDisplay()) == null) {
            ageSubtitleValueDisplay = "";
        }
        C4238o text4 = viewState.getText();
        if (text4 == null || (ageSubtitleDisplay = text4.getAgeSubtitleDisplay()) == null) {
            ageSubtitleDisplay = "";
        }
        String strConcat = ageSubtitleValueDisplay.concat(ageSubtitleDisplay);
        C4238o text5 = viewState.getText();
        return new WhoopAgeAmoeba(whoopAgeAmoebaStyleValues, str, str2, strConcat, (text5 == null || (subtitleColor = text5.getSubtitleColor()) == null || (styleFromColor = getStyleFromColor(subtitleColor)) == null) ? "" : styleFromColor, "", "", "", "", "", false);
    }

    public AmoebaViewStateReducer(C4237n amoebaSettings) {
        AbstractC22676k.m65750j(amoebaSettings, "amoebaSettings");
        this.amoebaSettings = amoebaSettings;
    }

    public /* synthetic */ AmoebaViewStateReducer(C4237n c4237n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C4237n(0.0f, 0.0f, null, null, null, null, null, null, 0.0f, null, null, 2047, null) : c4237n);
    }
}
