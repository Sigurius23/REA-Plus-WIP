package kd1;

import b91.AbstractC2890e;
import b91.C2886a;
import gb1.AbstractC15673b0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import jp2.C21875f;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kd1.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkd1/j;", "", "<init>", "()V", "", "styleName", "Lb91/a;", "f", "(Ljava/lang/String;)Lb91/a;", "colorName", "Ly81/f;", "e", "(Ljava/lang/String;)Ly81/f;", "overlayName", "Li91/a;", "g", "(Ljava/lang/String;)Li91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22398j {

    /* JADX INFO: renamed from: a */
    public static final C22398j f87631a = new C22398j();

    private C22398j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final AbstractC17911t m64464h(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getBlack50()), new C17919x(brushBackground.getBrandBlack())), 1600.0f, 0.0f, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final AbstractC17911t m64465i(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return AbstractC15673b0.m44012U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final AbstractC17911t m64466j(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getBlack30()), new C17919x(brushBackground.getBlack30())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final AbstractC17911t m64467k(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getBrandBlack()), new C17919x(brushBackground.getBrandBlack())), 0.0f, 0.0f, 14);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e2 A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final EnumC39333f m64468e(String colorName) {
        AbstractC22676k.m65750j(colorName, "colorName");
        switch (colorName.hashCode()) {
            case -1348915567:
                if (colorName.equals("WHITE_50")) {
                    return EnumC39333f.WHITE_50;
                }
                break;
            case -1348915505:
                if (colorName.equals("WHITE_70")) {
                    return EnumC39333f.WHITE_70;
                }
                break;
            case -1348915443:
                if (colorName.equals("WHITE_90")) {
                    return EnumC39333f.WHITE_90;
                }
                break;
            case -1068657046:
                if (colorName.equals("STRAIN_ZONE_3")) {
                    return EnumC39333f.STRAIN_ZONE_3;
                }
                break;
            case -1043973524:
                if (colorName.equals("ACCENTS_ACTION")) {
                    return EnumC39333f.ACCENT_ACTION;
                }
                break;
            case -16486507:
                if (colorName.equals("RECOVERY")) {
                    return EnumC39333f.RECOVERY;
                }
                break;
            case 141110692:
                if (colorName.equals("DEEP_SLEEP")) {
                    return EnumC39333f.SLEEP_DEEP_SLEEP;
                }
                break;
            case 229511858:
                if (colorName.equals("REM_SLEEP")) {
                    return EnumC39333f.SLEEP_REM_SLEEP;
                }
                break;
            case 897762862:
                if (colorName.equals("LIGHT_SLEEP")) {
                    return EnumC39333f.SLEEP_LIGHT_SLEEP;
                }
                break;
            case 1152341056:
                if (colorName.equals("LOW_RECOVERY")) {
                    return EnumC39333f.RECOVERY_LOW_RECOVERY;
                }
                break;
            case 1231858931:
                if (colorName.equals("NEGATIVE_TREND")) {
                    return EnumC39333f.ACCENT_NEGATIVE_TREND;
                }
                break;
            case 1258357138:
                if (colorName.equals("HIGH_RECOVERY")) {
                    return EnumC39333f.RECOVERY_HIGH_RECOVERY;
                }
                break;
            case 1639962551:
                if (colorName.equals("POSITIVE_TREND")) {
                    return EnumC39333f.ACCENT_POSITIVE_TREND;
                }
                break;
            case 1655451935:
                if (colorName.equals("MEDIUM_RECOVERY")) {
                    return EnumC39333f.RECOVERY_MEDIUM_RECOVERY;
                }
                break;
            case 1761317119:
                if (colorName.equals("COACH_BLUE")) {
                    return EnumC39333f.COACH_BLUE;
                }
                break;
        }
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        for (EnumC39333f enumC39333f2 : EnumC39333f.values()) {
            if (AbstractC22676k.m65745e(enumC39333f2.name(), colorName)) {
                if (enumC39333f2 == null) {
                    return enumC39333f;
                }
                return enumC39333f2;
            }
        }
        enumC39333f2 = null;
        if (enumC39333f2 == null) {
            return enumC39333f;
        }
        return enumC39333f2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public final C2886a m64469f(String styleName) {
        AbstractC22676k.m65750j(styleName, "styleName");
        switch (styleName.hashCode()) {
            case -1087342139:
                if (styleName.equals("TITLE_T2")) {
                    return AbstractC2890e.m8450e().getT2();
                }
                break;
            case -1087342138:
                if (styleName.equals("TITLE_T3")) {
                    return AbstractC2890e.m8450e().getT3();
                }
                break;
            case 715468598:
                if (styleName.equals("HEADLINE_H3")) {
                    return AbstractC2890e.m8450e().getH3();
                }
                break;
            case 715468599:
                if (styleName.equals("HEADLINE_H4")) {
                    return AbstractC2890e.m8450e().getH4();
                }
                break;
            case 772947948:
                if (styleName.equals("BODY_B1")) {
                    return AbstractC2890e.m8450e().getB1();
                }
                break;
            case 772947949:
                if (styleName.equals("BODY_B2")) {
                    return AbstractC2890e.m8450e().getB2();
                }
                break;
        }
        return AbstractC2890e.m8450e().getH1();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    public final AbstractC18247a m64470g(String overlayName) {
        if (overlayName == null) {
            return null;
        }
        switch (overlayName.hashCode()) {
            case -1585322745:
                if (overlayName.equals("BRAND_BLACK")) {
                    return AbstractC18249c.m52572j(new C21875f(26));
                }
                return null;
            case -373305296:
                if (overlayName.equals("OVERLAY")) {
                    return AbstractC18249c.m52572j(new C21875f(25));
                }
                return null;
            case 1179746188:
                if (overlayName.equals("GRADIENT_LINEAR_45")) {
                    return AbstractC18249c.m52572j(new C21875f(24));
                }
                return null;
            case 1645603080:
                if (overlayName.equals("ENDCAP_OVERLAY")) {
                    return AbstractC18249c.m52572j(new C21875f(23));
                }
                return null;
            default:
                return null;
        }
    }
}
