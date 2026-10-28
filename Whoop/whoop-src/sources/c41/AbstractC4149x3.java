package c41;

import androidx.compose.runtime.Composer;
import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: c41.x3 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, m65681d2 = {"Lc41/w3;", "Li2/x;", "c", "(Lc41/w3;Landroidx/compose/runtime/Composer;I)J", "e", "d", "", "a", "(Lc41/w3;Landroidx/compose/runtime/Composer;I)F", "b", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4149x3 {

    /* JADX INFO: renamed from: c41.x3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16890a;

        static {
            int[] iArr = new int[EnumC4142w3.values().length];
            try {
                iArr[EnumC4142w3.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4142w3.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4142w3.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4142w3.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4142w3.ALERT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC4142w3.LOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC4142w3.CALIBRATING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC4142w3.NO_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC4142w3.DATA_HIDDEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC4142w3.PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f16890a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final float m12912a(EnumC4142w3 enumC4142w3, Composer composer, int i13) {
        AbstractC22676k.m65750j(enumC4142w3, "<this>");
        switch (a.f16890a[enumC4142w3.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
                return 0.1f;
            default:
                return 1.0f;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m12913b(EnumC4142w3 enumC4142w3, Composer composer, int i13) {
        AbstractC22676k.m65750j(enumC4142w3, "<this>");
        switch (a.f16890a[enumC4142w3.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1270064352);
                return AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            case 7:
            case 8:
            case 9:
            case 10:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(1270066877);
                long white30 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite30();
                c28655q2.m87173q(false);
                return white30;
            default:
                throw AbstractC11895b.m32003v(1270062043, (C28655q) composer, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m12914c(EnumC4142w3 enumC4142w3, Composer composer, int i13) {
        AbstractC22676k.m65750j(enumC4142w3, "<this>");
        switch (a.f16890a[enumC4142w3.ordinal()]) {
            case 1:
            case 2:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(2064183995);
                long accentPositiveTrend15 = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend15();
                c28655q.m87173q(false);
                return accentPositiveTrend15;
            case 3:
            case 4:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(2064185947);
                long accentNegativeTrend15 = C38072d.f163053a.m121949b(c28655q2, 6).getAccentNegativeTrend15();
                c28655q2.m87173q(false);
                return accentNegativeTrend15;
            case 5:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(2064187640);
                long accentAlertTrend15 = C38072d.f163053a.m121949b(c28655q3, 6).getAccentAlertTrend15();
                c28655q3.m87173q(false);
                return accentAlertTrend15;
            case 6:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(2064189465);
                long jM51541c = C17919x.m51541c(0.15f, C38072d.f163053a.m121949b(c28655q4, 6).getRecovery());
                c28655q4.m87173q(false);
                return jM51541c;
            case 7:
            case 8:
            case 9:
            case 10:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(2064192269);
                return AbstractC31061c.m95628d(C38072d.f163053a, c28655q5, 6, false);
            default:
                throw AbstractC11895b.m32003v(2064182692, (C28655q) composer, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m12915d(EnumC4142w3 enumC4142w3, Composer composer, int i13) {
        long accentPositiveTrend;
        AbstractC22676k.m65750j(enumC4142w3, "<this>");
        switch (a.f16890a[enumC4142w3.ordinal()]) {
            case 1:
            case 2:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(109127001);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend();
                c28655q.m87173q(false);
                break;
            case 3:
            case 4:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(109128889);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q2, 6).getAccentNegativeTrend();
                c28655q2.m87173q(false);
                break;
            case 5:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(109130513);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q3, 6).getAccentAlert();
                c28655q3.m87173q(false);
                break;
            case 6:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(109131822);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q4, 6).getRecovery();
                c28655q4.m87173q(false);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(109134288);
                return AbstractC31061c.m95624D(C38072d.f163053a, c28655q5, 6, false);
            default:
                throw AbstractC11895b.m32003v(109125672, (C28655q) composer, false);
        }
        return accentPositiveTrend;
    }

    /* JADX INFO: renamed from: e */
    public static final long m12916e(EnumC4142w3 enumC4142w3, Composer composer, int i13) {
        long accentPositiveTrend;
        AbstractC22676k.m65750j(enumC4142w3, "<this>");
        switch (a.f16890a[enumC4142w3.ordinal()]) {
            case 1:
            case 2:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1910394062);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend();
                c28655q.m87173q(false);
                break;
            case 3:
            case 4:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(1910395950);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q2, 6).getAccentNegativeTrend();
                c28655q2.m87173q(false);
                break;
            case 5:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(1910397574);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q3, 6).getAccentAlert();
                c28655q3.m87173q(false);
                break;
            case 6:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(1910398883);
                accentPositiveTrend = C38072d.f163053a.m121949b(c28655q4, 6).getRecovery();
                c28655q4.m87173q(false);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(1910401346);
                return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q5, 6, false);
            default:
                throw AbstractC11895b.m32003v(1910392730, (C28655q) composer, false);
        }
        return accentPositiveTrend;
    }
}
