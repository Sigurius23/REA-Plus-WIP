package ti0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import gb1.AbstractC15673b0;
import p088dc.AbstractC11895b;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ti0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lti0/l;", "theme", "a", "(Landroidx/compose/ui/Modifier;Lti0/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33846k {

    /* JADX INFO: renamed from: ti0.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f141747a;

        static {
            int[] iArr = new int[EnumC33847l.values().length];
            try {
                iArr[EnumC33847l.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33847l.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC33847l.AI_CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC33847l.DARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC33847l.AMERICA_250.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC33847l.WHOOP_BACKGROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC33847l.TREND_NEGATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC33847l.PROGRAM_HOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC33847l.MENSTRUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC33847l.FOLLICULAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC33847l.OVULATORY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC33847l.LUTEAL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC33847l.HORMONAL_BIRTH_CONTROL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC33847l.NO_PHASE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f141747a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Modifier m107049a(Modifier modifier, EnumC33847l theme, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(theme, "theme");
        switch (a.f141747a[theme.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(459411664);
                c28655q.m87173q(false);
                return modifier;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(459412976);
                c28655q2.m87173q(false);
                return modifier;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(459414569);
                c28655q3.m87173q(false);
                return AbstractC15673b0.m43980E(modifier);
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(459416841);
                c28655q4.m87173q(false);
                return AbstractC15673b0.m44028b0(modifier);
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(459419343);
                Modifier modifierM44016W = AbstractC15673b0.m44016W(modifier, c28655q5, i13 & 14);
                c28655q5.m87173q(false);
                return modifierM44016W;
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(459422185);
                c28655q6.m87173q(false);
                return AbstractC15673b0.m44028b0(modifier);
            case 7:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(459424786);
                Modifier modifierM44076z0 = AbstractC15673b0.m44076z0(modifier, c28655q7, i13 & 14);
                c28655q7.m87173q(false);
                return modifierM44076z0;
            case 8:
                C28655q c28655q8 = (C28655q) composer;
                c28655q8.m87150e0(459427600);
                Modifier modifierM44062s0 = AbstractC15673b0.m44062s0(modifier, c28655q8, i13 & 14);
                c28655q8.m87173q(false);
                return modifierM44062s0;
            case 9:
                C28655q c28655q9 = (C28655q) composer;
                c28655q9.m87150e0(459430254);
                Modifier modifierM44050m0 = AbstractC15673b0.m44050m0(modifier, c28655q9, i13 & 14);
                c28655q9.m87173q(false);
                return modifierM44050m0;
            case 10:
                C28655q c28655q10 = (C28655q) composer;
                c28655q10.m87150e0(459432879);
                Modifier modifierM44036f0 = AbstractC15673b0.m44036f0(modifier, c28655q10, i13 & 14);
                c28655q10.m87173q(false);
                return modifierM44036f0;
            case 11:
                C28655q c28655q11 = (C28655q) composer;
                c28655q11.m87150e0(459435502);
                Modifier modifierM44056p0 = AbstractC15673b0.m44056p0(modifier, c28655q11, i13 & 14);
                c28655q11.m87173q(false);
                return modifierM44056p0;
            case 12:
                C28655q c28655q12 = (C28655q) composer;
                c28655q12.m87150e0(459437995);
                Modifier modifierM44048l0 = AbstractC15673b0.m44048l0(modifier, c28655q12, i13 & 14);
                c28655q12.m87173q(false);
                return modifierM44048l0;
            case 13:
                C28655q c28655q13 = (C28655q) composer;
                c28655q13.m87150e0(459440921);
                Modifier modifierM44046k0 = AbstractC15673b0.m44046k0(modifier, c28655q13, i13 & 14);
                c28655q13.m87173q(false);
                return modifierM44046k0;
            case 14:
                C28655q c28655q14 = (C28655q) composer;
                c28655q14.m87150e0(459443820);
                Modifier modifierM44052n0 = AbstractC15673b0.m44052n0(modifier, c28655q14, i13 & 14);
                c28655q14.m87173q(false);
                return modifierM44052n0;
            default:
                throw AbstractC11895b.m32003v(459411024, (C28655q) composer, false);
        }
    }
}
