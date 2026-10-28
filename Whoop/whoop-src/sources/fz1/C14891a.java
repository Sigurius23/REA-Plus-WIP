package fz1;

import com.whoop.design.models.celebration.AnimationModeModel;
import com.whoop.design.models.celebration.DynamicLottieModel;
import com.whoop.design.models.celebration.SlotConfigModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorValueModel;
import com.whoop.milestonepill.domain.model.MilestonePillResponse;
import cz1.C11262c;
import i51.AbstractC18125v;
import i51.C18122s;
import i51.EnumC18104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23623f0;
import p716lb1.AbstractC23638h1;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import t21.C33346d;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: fz1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfz1/a;", "", "<init>", "()V", "", "Ly81/f;", "f", "(Ljava/lang/String;)Ly81/f;", "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "Lv41/r0;", "e", "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lv41/r0;", "Lkd1/o;", "d", "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Lkd1/o;", "Li51/s;", "c", "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Li51/s;", "style", "a", "Lcz1/c;", "domainState", "Lt21/d;", "b", "(Lcz1/c;)Lt21/d;", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14891a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    private final EnumC39333f m42972a(String style) {
        String upperCase;
        if (style != null) {
            upperCase = style.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            switch (upperCase.hashCode()) {
                case -1848981747:
                    if (upperCase.equals("SILVER")) {
                        return EnumC39333f.SILVER;
                    }
                    break;
                case -1838664331:
                    if (upperCase.equals("STRAIN")) {
                        return EnumC39333f.STRAIN;
                    }
                    break;
                case -1637567956:
                    if (upperCase.equals("PLATINUM")) {
                        return EnumC39333f.PLATINUM;
                    }
                    break;
                case -1163907947:
                    if (upperCase.equals("STREAKS")) {
                        return EnumC39333f.STRAIN_ZONE_5;
                    }
                    break;
                case -946505377:
                    if (upperCase.equals("PURPLE_AQUA")) {
                        return EnumC39333f.COACH_BLUE;
                    }
                    break;
                case -873340145:
                    if (upperCase.equals("ACTIVITY")) {
                        return EnumC39333f.SURFACE_MCI_OVULATORY;
                    }
                    break;
                case -16486507:
                    if (upperCase.equals("RECOVERY")) {
                        return EnumC39333f.RECOVERY_HIGH_RECOVERY;
                    }
                    break;
                case 2193504:
                    if (upperCase.equals("GOLD")) {
                        return EnumC39333f.GOLD;
                    }
                    break;
                case 78984887:
                    if (upperCase.equals("SLEEP")) {
                        return EnumC39333f.SLEEP_LIGHT_SLEEP;
                    }
                    break;
                case 1393842086:
                    if (upperCase.equals("HEALTHSPAN")) {
                        return EnumC39333f.SUFFICIENT_TREND;
                    }
                    break;
                case 1967683994:
                    if (upperCase.equals("BRONZE")) {
                        return EnumC39333f.BRONZE;
                    }
                    break;
            }
        }
        return EnumC39333f.STRAIN;
    }

    /* JADX INFO: renamed from: c */
    private final C18122s m42973c(MilestonePillResponse milestonePillResponse) {
        DynamicLottieModel dynamicLottieProperties;
        EnumC18104a enumC18104aM68827a;
        if (!AbstractC22676k.m65745e(milestonePillResponse.getContentType(), "DYNAMIC_LOTTIE") || (dynamicLottieProperties = milestonePillResponse.getDynamicLottieProperties()) == null) {
            return null;
        }
        InterfaceC35689r0.e eVarM113134a = InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(milestonePillResponse.getContentUrl()));
        String overlayUrl = dynamicLottieProperties.getOverlayUrl();
        List<SlotConfigModel> slots = dynamicLottieProperties.getSlots();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = slots.iterator();
        while (it.hasNext()) {
            AbstractC18125v abstractC18125vM68828b = AbstractC23638h1.m68828b((SlotConfigModel) it.next());
            if (abstractC18125vM68828b != null) {
                arrayList.add(abstractC18125vM68828b);
            }
        }
        AnimationModeModel animationMode = dynamicLottieProperties.getAnimationMode();
        if (animationMode == null || (enumC18104aM68827a = AbstractC23638h1.m68827a(animationMode)) == null) {
            enumC18104aM68827a = !AbstractC22676k.m65745e(dynamicLottieProperties.getAnimated(), Boolean.FALSE) ? EnumC18104a.LOOP : EnumC18104a.OFF;
        }
        EnumC18104a enumC18104a = enumC18104aM68827a;
        List<String> highlightGradient = dynamicLottieProperties.getHighlightGradient();
        Boolean showLoadingShimmer = milestonePillResponse.getShowLoadingShimmer();
        return new C18122s(eVarM113134a, overlayUrl, arrayList, enumC18104a, highlightGradient, showLoadingShimmer != null ? showLoadingShimmer.booleanValue() : true);
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC22403o m42974d(MilestonePillResponse milestonePillResponse) {
        if (AbstractC22676k.m65745e(milestonePillResponse.getContentType(), "IMAGE")) {
            return new AbstractC22403o.c(milestonePillResponse.getContentUrl(), 0, 0, 0, 14, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC35689r0 m42975e(MilestonePillResponse milestonePillResponse) {
        if (AbstractC22676k.m65745e(milestonePillResponse.getContentType(), "LOTTIE") || (AbstractC22676k.m65745e(milestonePillResponse.getContentType(), "DYNAMIC_LOTTIE") && milestonePillResponse.getDynamicLottieProperties() == null)) {
            return InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(milestonePillResponse.getContentUrl()));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final EnumC39333f m42976f(String str) {
        return AbstractC22676k.m65745e(str, "PRIMARY") ? EnumC39333f.BRAND_WHITE : EnumC39333f.BRAND_WHITE;
    }

    /* JADX INFO: renamed from: b */
    public final C33346d m42977b(C11262c domainState) {
        InterfaceC39332e interfaceC39332eM42972a;
        ColorThemeModel colors;
        ColorValueModel accentColor;
        AbstractC22676k.m65750j(domainState, "domainState");
        MilestonePillResponse data = domainState.getData();
        boolean isLoading = domainState.getIsLoading();
        boolean isError = domainState.getIsError();
        String count = data != null ? data.getCount() : null;
        EnumC39333f enumC39333fM42976f = m42976f(data != null ? data.getTextStyle() : null);
        InterfaceC35689r0 interfaceC35689r0M42975e = data != null ? m42975e(data) : null;
        AbstractC22403o abstractC22403oM42974d = data != null ? m42974d(data) : null;
        C18122s c18122sM42973c = data != null ? m42973c(data) : null;
        if (data == null || (colors = data.getColors()) == null || (accentColor = colors.getAccentColor()) == null || (interfaceC39332eM42972a = AbstractC23623f0.m68737b(accentColor)) == null) {
            interfaceC39332eM42972a = m42972a(data != null ? data.getStyle() : null);
        }
        return new C33346d(isLoading, isError, count, enumC39333fM42976f, interfaceC35689r0M42975e, abstractC22403oM42974d, c18122sM42973c, interfaceC39332eM42972a, !domainState.getHasAnimationFinishedForThisValue(), data != null ? data.getNavigation() : null);
    }
}
