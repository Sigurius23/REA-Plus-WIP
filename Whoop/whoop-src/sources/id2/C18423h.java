package id2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.models.colortheme.ColorBackgroundModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.share.model.ShareBackground;
import f01.C13845b;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import m51.AbstractC25080b;
import m51.InterfaceC25079a;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23623f0;
import x81.C38072d;

/* JADX INFO: renamed from: id2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lid2/h;", "", "<init>", "()V", "Lcom/whoop/share/model/ShareBackground;", "Landroidx/compose/ui/Modifier;", "d", "(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "config", "Ll83/a0;", "b", "(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)V", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18423h {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m53021c(C18423h c18423h, ShareBackground shareBackground, int i13, Composer composer, int i14) {
        c18423h.m53023b(shareBackground, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final Modifier m53022d(ShareBackground shareBackground, Composer composer, int i13) {
        String style = shareBackground.getStyle();
        C2314t c2314t = C2314t.f9131w;
        if (style != null) {
            switch (style.hashCode()) {
                case -2032180703:
                    if (style.equals("DEFAULT")) {
                        C28655q c28655q = (C28655q) composer;
                        c28655q.m87150e0(-1633405982);
                        Modifier modifierM53037n = AbstractC18424i.m53037n(c2314t, c28655q, 6);
                        c28655q.m87173q(false);
                        return modifierM53037n;
                    }
                    break;
                case -1848981747:
                    if (style.equals("SILVER")) {
                        C28655q c28655q2 = (C28655q) composer;
                        c28655q2.m87150e0(-1633445119);
                        Modifier modifierM43988I = AbstractC15673b0.m43988I(c2314t, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getSilver(), 0.0f, 0.0f, 6, null);
                        c28655q2.m87173q(false);
                        return modifierM43988I;
                    }
                    break;
                case -1838664331:
                    if (style.equals("STRAIN")) {
                        C28655q c28655q3 = (C28655q) composer;
                        c28655q3.m87150e0(-1633438559);
                        Modifier modifierM53041r = AbstractC18424i.m53041r(c2314t, c28655q3, 6);
                        c28655q3.m87173q(false);
                        return modifierM53041r;
                    }
                    break;
                case -1637567956:
                    if (style.equals("PLATINUM")) {
                        C28655q c28655q4 = (C28655q) composer;
                        c28655q4.m87150e0(-1633459453);
                        Modifier modifierM43988I2 = AbstractC15673b0.m43988I(c2314t, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getPlatinum(), 0.0f, 0.0f, 6, null);
                        c28655q4.m87173q(false);
                        return modifierM43988I2;
                    }
                    break;
                case -1525970417:
                    if (style.equals("STREAK_ORANGE")) {
                        C28655q c28655q5 = (C28655q) composer;
                        c28655q5.m87150e0(-1633431258);
                        Modifier modifierM53033j = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q5, C38072d.f163054b).getStrainZone5());
                        c28655q5.m87173q(false);
                        return modifierM53033j;
                    }
                    break;
                case -1494062179:
                    if (style.equals("STREAK_PURPLE")) {
                        C28655q c28655q6 = (C28655q) composer;
                        c28655q6.m87150e0(-1633422520);
                        Modifier modifierM53033j2 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q6, C38072d.f163054b).getSleepRemSleep());
                        c28655q6.m87173q(false);
                        return modifierM53033j2;
                    }
                    break;
                case -1251358635:
                    if (style.equals("STREAK_YELLOW")) {
                        C28655q c28655q7 = (C28655q) composer;
                        c28655q7.m87150e0(-1633435482);
                        Modifier modifierM53033j3 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q7, C38072d.f163054b).getStrainZone4());
                        c28655q7.m87173q(false);
                        return modifierM53033j3;
                    }
                    break;
                case -946505377:
                    if (style.equals("PURPLE_AQUA")) {
                        C28655q c28655q8 = (C28655q) composer;
                        c28655q8.m87150e0(-1633455421);
                        c28655q8.m87173q(false);
                        return AbstractC15673b0.m44014V(c2314t);
                    }
                    break;
                case -873340145:
                    if (style.equals("ACTIVITY")) {
                        C28655q c28655q9 = (C28655q) composer;
                        c28655q9.m87150e0(-1633473053);
                        Modifier modifierM53035l = AbstractC18424i.m53035l(c2314t, c28655q9, 6);
                        c28655q9.m87173q(false);
                        return modifierM53035l;
                    }
                    break;
                case -542761861:
                    if (style.equals("STREAK_BLUE")) {
                        C28655q c28655q10 = (C28655q) composer;
                        c28655q10.m87150e0(-1633418301);
                        Modifier modifierM53033j4 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q10, C38072d.f163054b).getRecovery());
                        c28655q10.m87173q(false);
                        return modifierM53033j4;
                    }
                    break;
                case -542610303:
                    if (style.equals("STREAK_GOLD")) {
                        C28655q c28655q11 = (C28655q) composer;
                        c28655q11.m87150e0(-1633414232);
                        Modifier modifierM53033j5 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q11, C38072d.f163054b).getBrandWhoopPro());
                        c28655q11.m87173q(false);
                        return modifierM53033j5;
                    }
                    break;
                case -542347881:
                    if (style.equals("STREAK_PINK")) {
                        C28655q c28655q12 = (C28655q) composer;
                        c28655q12.m87150e0(-1633427087);
                        Modifier modifierM53033j6 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q12, C38072d.f163054b).getAccentOnboardingAction());
                        c28655q12.m87173q(false);
                        return modifierM53033j6;
                    }
                    break;
                case -16486507:
                    if (style.equals("RECOVERY")) {
                        C28655q c28655q13 = (C28655q) composer;
                        c28655q13.m87150e0(-1633452477);
                        Modifier modifierM53039p = AbstractC18424i.m53039p(c2314t, c28655q13, 6);
                        c28655q13.m87173q(false);
                        return modifierM53039p;
                    }
                    break;
                case 2193504:
                    if (style.equals("GOLD")) {
                        C28655q c28655q14 = (C28655q) composer;
                        c28655q14.m87150e0(-1633466369);
                        Modifier modifierM43988I3 = AbstractC15673b0.m43988I(c2314t, C38072d.f163053a.m121949b(c28655q14, C38072d.f163054b).getGold(), 0.0f, 0.0f, 6, null);
                        c28655q14.m87173q(false);
                        return modifierM43988I3;
                    }
                    break;
                case 78984887:
                    if (style.equals("SLEEP")) {
                        C28655q c28655q15 = (C28655q) composer;
                        c28655q15.m87150e0(-1633441344);
                        Modifier modifierM53040q = AbstractC18424i.m53040q(c2314t, c28655q15, 6);
                        c28655q15.m87173q(false);
                        return modifierM53040q;
                    }
                    break;
                case 373515272:
                    if (style.equals("STREAK_WHITE")) {
                        C28655q c28655q16 = (C28655q) composer;
                        c28655q16.m87150e0(-1633409978);
                        Modifier modifierM53033j7 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q16, C38072d.f163054b).getStrainZone1());
                        c28655q16.m87173q(false);
                        return modifierM53033j7;
                    }
                    break;
                case 1152341056:
                    if (style.equals("LOW_RECOVERY")) {
                        C28655q c28655q17 = (C28655q) composer;
                        c28655q17.m87150e0(-1633449362);
                        Modifier modifierM53033j8 = AbstractC18424i.m53033j(c2314t, C38072d.f163053a.m121949b(c28655q17, C38072d.f163054b).getRecoveryLowRecovery());
                        c28655q17.m87173q(false);
                        return modifierM53033j8;
                    }
                    break;
                case 1393842086:
                    if (style.equals("HEALTHSPAN")) {
                        C28655q c28655q18 = (C28655q) composer;
                        c28655q18.m87150e0(-1633462491);
                        Modifier modifierM53038o = AbstractC18424i.m53038o(c2314t, c28655q18, 6);
                        c28655q18.m87173q(false);
                        return modifierM53038o;
                    }
                    break;
                case 1967683994:
                    if (style.equals("BRONZE")) {
                        C28655q c28655q19 = (C28655q) composer;
                        c28655q19.m87150e0(-1633470143);
                        Modifier modifierM43988I4 = AbstractC15673b0.m43988I(c2314t, C38072d.f163053a.m121949b(c28655q19, C38072d.f163054b).getBronze(), 0.0f, 0.0f, 6, null);
                        c28655q19.m87173q(false);
                        return modifierM43988I4;
                    }
                    break;
            }
        }
        C28655q c28655q20 = (C28655q) composer;
        c28655q20.m87150e0(-1633404310);
        c28655q20.m87173q(false);
        return c2314t;
    }

    /* JADX INFO: renamed from: b */
    public final void m53023b(ShareBackground config, Composer composer, int i13) {
        int i14;
        ColorBackgroundModel background;
        Modifier modifierM53022d;
        AbstractC22676k.m65750j(config, "config");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(11179853);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(config) : c28655q.m87157i(config) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(this) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (AbstractC22676k.m65745e(config.getType(), "RADIAL_GRADIENT")) {
            c28655q.m87150e0(-1948311622);
            boolean zM87153g = c28655q.m87153g(config.getColors());
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                ColorThemeModel colors = config.getColors();
                objM87133R = (colors == null || (background = colors.getBackground()) == null) ? null : AbstractC23623f0.m68736a(background);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC25079a interfaceC25079a = (InterfaceC25079a) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC25079a != null) {
                c28655q.m87150e0(-2141053365);
                modifierM53022d = AbstractC25080b.m73578b(c2314t, interfaceC25079a, 0.6f, c28655q, 390, 0);
            } else {
                c28655q.m87150e0(-2141051001);
                modifierM53022d = m53022d(config, c28655q, (i14 & 112) | ColorThemeModel.$stable | (i14 & 14));
            }
            c28655q.m87173q(false);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3407d(1.0f, c2314t), 3, 4), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a).mo3471e(modifierM53022d), c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1947722219);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(this, config, i13, 29);
        }
    }
}
