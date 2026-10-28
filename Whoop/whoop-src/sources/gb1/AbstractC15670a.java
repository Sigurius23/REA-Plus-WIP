package gb1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.models.AchievementsBackgroundStyle;
import p088dc.AbstractC11895b;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: gb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "style", "a", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/AchievementsBackgroundStyle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15670a {

    /* JADX INFO: renamed from: gb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58823a;

        static {
            int[] iArr = new int[AchievementsBackgroundStyle.values().length];
            try {
                iArr[AchievementsBackgroundStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AchievementsBackgroundStyle.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AchievementsBackgroundStyle.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AchievementsBackgroundStyle.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AchievementsBackgroundStyle.LOW_RECOVERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AchievementsBackgroundStyle.STRAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AchievementsBackgroundStyle.ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AchievementsBackgroundStyle.PURPLE_AQUA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AchievementsBackgroundStyle.HEALTHSPAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AchievementsBackgroundStyle.BLUE_WHITE_RED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AchievementsBackgroundStyle.BRONZE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AchievementsBackgroundStyle.SILVER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AchievementsBackgroundStyle.GOLD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AchievementsBackgroundStyle.PLATINUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f58823a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Modifier m43971a(Modifier modifier, AchievementsBackgroundStyle style, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(style, "style");
        switch (a.f58823a[style.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1990684992);
                c28655q.m87173q(false);
                return AbstractC15673b0.m44028b0(modifier);
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(1990687265);
                c28655q2.m87173q(false);
                return AbstractC15673b0.m44034e0(modifier);
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(1990689569);
                c28655q3.m87173q(false);
                return AbstractC15673b0.m44068v0(modifier);
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(1990691977);
                c28655q4.m87173q(false);
                return AbstractC15673b0.m44066u0(modifier);
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(1990695053);
                c28655q5.m87173q(false);
                return AbstractC15673b0.m43984G(modifier, EnumC39333f.RECOVERY_LOW_RECOVERY);
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(1990698786);
                c28655q6.m87173q(false);
                return AbstractC15673b0.m44070w0(modifier);
            case 7:
            case 8:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(1990702660);
                c28655q7.m87173q(false);
                return AbstractC15673b0.m44014V(modifier);
            case 9:
                C28655q c28655q8 = (C28655q) composer;
                c28655q8.m87150e0(1990705254);
                c28655q8.m87173q(false);
                return AbstractC15673b0.m44044j0(modifier);
            case 10:
                C28655q c28655q9 = (C28655q) composer;
                c28655q9.m87150e0(1990708008);
                Modifier modifierM44025a0 = AbstractC15673b0.m44025a0(modifier, c28655q9, i13 & 14);
                c28655q9.m87173q(false);
                return modifierM44025a0;
            case 11:
                C28655q c28655q10 = (C28655q) composer;
                c28655q10.m87150e0(1990710590);
                c28655q10.m87173q(false);
                return AbstractC15673b0.m43984G(modifier, EnumC39333f.BRONZE);
            case 12:
                C28655q c28655q11 = (C28655q) composer;
                c28655q11.m87150e0(1990713854);
                c28655q11.m87173q(false);
                return AbstractC15673b0.m43984G(modifier, EnumC39333f.SILVER);
            case 13:
                C28655q c28655q12 = (C28655q) composer;
                c28655q12.m87150e0(1990717052);
                c28655q12.m87173q(false);
                return AbstractC15673b0.m43984G(modifier, EnumC39333f.GOLD);
            case 14:
                C28655q c28655q13 = (C28655q) composer;
                c28655q13.m87150e0(1990720320);
                c28655q13.m87173q(false);
                return AbstractC15673b0.m43984G(modifier, EnumC39333f.PLATINUM);
            default:
                throw AbstractC11895b.m32003v(1990684331, (C28655q) composer, false);
        }
    }
}
