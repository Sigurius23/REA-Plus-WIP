package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorValueModel;
import com.whoop.design.models.items.MilestoneItem;
import com.whoop.design.models.items.MilestoneProgressCardModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i51.AbstractC18111h;
import i51.C18112i;
import i51.EnumC18110g;
import java.util.Locale;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import u21.C34484d;
import u21.C34485e;

/* JADX INFO: renamed from: lb1.d3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneItem;", "Lu21/e;", "g", "(Lcom/whoop/design/models/items/MilestoneItem;)Lu21/e;", "", "style", "Ly81/f;", "d", "(Ljava/lang/String;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "milestoneProgressCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23612d3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93717a = Function1.m68251a(new C23715t2(22));

    /* JADX INFO: renamed from: lb1.d3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93718w;

        public a(Function1 function1) {
            this.f93718w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93718w.invoke((MilestoneProgressCardModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68645c() {
        return f93717a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private static final EnumC39333f m68646d(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68647e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MilestoneProgressCardModel.class), new a(new C23715t2(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C34484d m68648f(MilestoneProgressCardModel model) {
        InterfaceC39332e interfaceC39332eM68646d;
        ColorValueModel accentColor;
        AbstractC22676k.m65750j(model, "model");
        TextResource title = model.getTitle();
        TextResource description = model.getDescription();
        ColorThemeModel colors = model.getColors();
        if (colors == null || (accentColor = colors.getAccentColor()) == null || (interfaceC39332eM68646d = AbstractC23623f0.m68737b(accentColor)) == null) {
            interfaceC39332eM68646d = m68646d(model.getStyle());
        }
        InterfaceC39332e interfaceC39332e = interfaceC39332eM68646d;
        MilestoneItem currentMilestone = model.getCurrentMilestone();
        C34485e c34485eM68649g = currentMilestone != null ? m68649g(currentMilestone) : null;
        MilestoneItem nextMilestone = model.getNextMilestone();
        return new C34484d(title, description, interfaceC39332e, c34485eM68649g, nextMilestone != null ? m68649g(nextMilestone) : null, model.getProgressPercent());
    }

    /* JADX INFO: renamed from: g */
    private static final C34485e m68649g(MilestoneItem milestoneItem) {
        CelebrationMediaModel media = milestoneItem.getMedia();
        C18112i c18112i = null;
        C18112i c18112iM68237e = media != null ? AbstractC23588a0.m68237e(media) : null;
        String iconUrl = milestoneItem.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        AbstractC22403o.c cVar = new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null);
        if (c18112iM68237e == null) {
            String text = milestoneItem.getText();
            if (text != null) {
                String iconUrl2 = milestoneItem.getIconUrl();
                c18112i = new C18112i(new AbstractC18111h.c(new AbstractC22403o.c(iconUrl2 == null ? "" : iconUrl2, 0, 0, 0, 14, null)), EnumC18110g.SMALL, AbstractC8693b.m21278l(text), null, null, false, 56, null);
            }
        } else {
            c18112i = c18112iM68237e;
        }
        return new C34485e(cVar, c18112i);
    }
}
