package p716lb1;

import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.celebration.AnimationModeModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.DynamicLottieModel;
import com.whoop.design.models.celebration.SlotConfigModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorValueModel;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i51.AbstractC18125v;
import i51.C18122s;
import i51.EnumC18104a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import tz0.C34278c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: lb1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\f\"\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/design/models/items/AchievementProgressCardModel;", "Lkd1/o;", "i", "(Lcom/whoop/design/models/items/AchievementProgressCardModel;)Lkd1/o;", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "Li51/s;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/s;", "", "style", "Ly81/f;", "g", "(Ljava/lang/String;)Ly81/f;", "backgroundStyle", "f", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "achievementProgressCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23594b {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93672a = Function1.m68251a(new C23587a(0));

    /* JADX INFO: renamed from: lb1.b$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93673a;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.DYNAMIC_LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentType.LOTTIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContentType.ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93673a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93674w;

        public b(Function1 function1) {
            this.f93674w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93674w.invoke((AchievementProgressCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68504c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AchievementProgressCardModel.class), new b(new C23587a(1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C34278c m68505d(AchievementProgressCardModel model) {
        InterfaceC39332e interfaceC39332eM68508g;
        ColorValueModel accentColor;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getNumerator());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getDenominator());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getDescription());
        ColorThemeModel colors = model.getColors();
        if (colors == null || (accentColor = colors.getAccentColor()) == null || (interfaceC39332eM68508g = AbstractC23623f0.m68737b(accentColor)) == null) {
            interfaceC39332eM68508g = m68508g(model.getStyle());
        }
        InterfaceC39332e interfaceC39332e = interfaceC39332eM68508g;
        EnumC39333f enumC39333fM68507f = m68507f(model.getBackgroundStyle());
        AbstractC22403o abstractC22403oM68510i = m68510i(model);
        CelebrationMediaModel media = model.getMedia();
        return new C34278c(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, interfaceC39332e, enumC39333fM68507f, abstractC22403oM68510i, media != null ? m68509h(media) : null, model.getProgressPercent(), model.getShowArrowIcon(), model.getDestination());
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68506e() {
        return f93672a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    private static final EnumC39333f m68507f(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1848981747:
                if (upperCase.equals("SILVER")) {
                    return EnumC39333f.SILVER;
                }
                break;
            case -1637567956:
                if (upperCase.equals("PLATINUM")) {
                    return EnumC39333f.PLATINUM;
                }
                break;
            case -946505377:
                if (upperCase.equals("PURPLE_AQUA")) {
                    return EnumC39333f.COACH_BLUE;
                }
                break;
            case 2193504:
                if (upperCase.equals("GOLD")) {
                    return EnumC39333f.GOLD;
                }
                break;
            case 63281119:
                if (upperCase.equals("BLACK")) {
                    return EnumC39333f.BRAND_BLACK;
                }
                break;
            case 66096429:
                if (upperCase.equals("EMPTY")) {
                    return EnumC39333f.TRANSPARENT;
                }
                break;
            case 1967683994:
                if (upperCase.equals("BRONZE")) {
                    return EnumC39333f.BRONZE;
                }
                break;
        }
        return EnumC39333f.BRAND_BLACK;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    public static final EnumC39333f m68508g(String style) {
        AbstractC22676k.m65750j(style, "style");
        String upperCase = style.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
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
            case -1525970417:
                if (upperCase.equals("STREAK_ORANGE")) {
                    return EnumC39333f.STRAIN_ZONE_5;
                }
                break;
            case -1494062179:
                if (upperCase.equals("STREAK_PURPLE")) {
                    return EnumC39333f.SLEEP_REM_SLEEP;
                }
                break;
            case -1251358635:
                if (upperCase.equals("STREAK_YELLOW")) {
                    return EnumC39333f.STRAIN_ZONE_4;
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
            case -542761861:
                if (upperCase.equals("STREAK_BLUE")) {
                    return EnumC39333f.RECOVERY;
                }
                break;
            case -542610303:
                if (upperCase.equals("STREAK_GOLD")) {
                    return EnumC39333f.BRAND_WHOOP_PRO;
                }
                break;
            case -542347881:
                if (upperCase.equals("STREAK_PINK")) {
                    return EnumC39333f.ACCENT_ONBOARDING_ACTION;
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
            case 373515272:
                if (upperCase.equals("STREAK_WHITE")) {
                    return EnumC39333f.STRAIN_ZONE_1;
                }
                break;
            case 1152341056:
                if (upperCase.equals("LOW_RECOVERY")) {
                    return EnumC39333f.RECOVERY_LOW_RECOVERY;
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
        return EnumC39333f.STRAIN;
    }

    /* JADX INFO: renamed from: h */
    private static final C18122s m68509h(CelebrationMediaModel celebrationMediaModel) {
        DynamicLottieModel dynamicLottieProperties;
        EnumC18104a enumC18104aM68827a;
        if (celebrationMediaModel.getContentType() != ContentType.DYNAMIC_LOTTIE || (dynamicLottieProperties = celebrationMediaModel.getDynamicLottieProperties()) == null) {
            return null;
        }
        InterfaceC35689r0.e eVarM113134a = InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(celebrationMediaModel.getContentUrl()));
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
        Boolean showLoadingShimmer = celebrationMediaModel.getShowLoadingShimmer();
        return new C18122s(eVarM113134a, overlayUrl, arrayList, enumC18104a, highlightGradient, showLoadingShimmer != null ? showLoadingShimmer.booleanValue() : true);
    }

    /* JADX INFO: renamed from: i */
    private static final AbstractC22403o m68510i(AchievementProgressCardModel achievementProgressCardModel) {
        CelebrationMediaModel media = achievementProgressCardModel.getMedia();
        if (media == null) {
            String iconUrl = achievementProgressCardModel.getIconUrl();
            if (iconUrl != null) {
                return new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null);
            }
            return null;
        }
        int i13 = a.f93673a[media.getContentType().ordinal()];
        if (i13 == 1) {
            String iconUrl2 = achievementProgressCardModel.getIconUrl();
            if (iconUrl2 != null) {
                return new AbstractC22403o.c(iconUrl2, 0, 0, 0, 14, null);
            }
            return null;
        }
        if (i13 == 2 || i13 == 3) {
            return new AbstractC22403o.c(media.getContentUrl(), 0, 0, 0, 14, null);
        }
        if (i13 != 4 && i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String iconUrl3 = achievementProgressCardModel.getIconUrl();
        if (iconUrl3 != null) {
            return new AbstractC22403o.c(iconUrl3, 0, 0, 0, 14, null);
        }
        return null;
    }
}
