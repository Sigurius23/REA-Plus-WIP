package uz0;

import androidx.compose.runtime.Composer;
import p088dc.AbstractC11895b;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: uz0.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Luz0/k;", "zoneStyle", "Li2/x;", "a", "(Luz0/k;Landroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35416j {

    /* JADX INFO: renamed from: uz0.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f150866a;

        static {
            int[] iArr = new int[EnumC35417k.values().length];
            try {
                iArr[EnumC35417k.STRAIN_ZONE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35417k.STRAIN_ZONE_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35417k.STRAIN_ZONE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC35417k.STRAIN_ZONE_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC35417k.STRAIN_ZONE_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC35417k.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f150866a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m112370a(EnumC35417k zoneStyle, Composer composer, int i13) {
        AbstractC22676k.m65750j(zoneStyle, "zoneStyle");
        switch (a.f150866a[zoneStyle.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(-2135851884);
                long strainZone1 = C38072d.f163053a.m121949b(c28655q, 6).getStrainZone1();
                c28655q.m87173q(false);
                return strainZone1;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(-2135849548);
                long strainZone2 = C38072d.f163053a.m121949b(c28655q2, 6).getStrainZone2();
                c28655q2.m87173q(false);
                return strainZone2;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(-2135847212);
                long strainZone3 = C38072d.f163053a.m121949b(c28655q3, 6).getStrainZone3();
                c28655q3.m87173q(false);
                return strainZone3;
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(-2135844876);
                long strainZone4 = C38072d.f163053a.m121949b(c28655q4, 6).getStrainZone4();
                c28655q4.m87173q(false);
                return strainZone4;
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(-2135842540);
                long strainZone5 = C38072d.f163053a.m121949b(c28655q5, 6).getStrainZone5();
                c28655q5.m87173q(false);
                return strainZone5;
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(-2135840400);
                long black20 = C38072d.f163053a.m121949b(c28655q6, 6).getBlack20();
                c28655q6.m87173q(false);
                return black20;
            default:
                throw AbstractC11895b.m32003v(-2135853985, (C28655q) composer, false);
        }
    }
}
