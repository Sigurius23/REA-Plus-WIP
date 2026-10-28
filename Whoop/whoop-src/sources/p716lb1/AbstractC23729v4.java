package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.TickMarkStyle;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.v4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/items/TickMarkStyle;", "style", "", "isLabel", "Ly81/f;", "a", "(Lcom/whoop/design/models/items/TickMarkStyle;Z)Ly81/f;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23729v4 {

    /* JADX INFO: renamed from: lb1.v4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94032a;

        static {
            int[] iArr = new int[TickMarkStyle.values().length];
            try {
                iArr[TickMarkStyle.MENSTRUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickMarkStyle.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TickMarkStyle.NO_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TickMarkStyle.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TickMarkStyle.FOLLICULAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TickMarkStyle.OVULATORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TickMarkStyle.LUTEAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TickMarkStyle.HORMONAL_BIRTH_CONTROL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TickMarkStyle.OVERDUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TickMarkStyle.NO_PHASE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TickMarkStyle.SYMPTOM_LOGGED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TickMarkStyle.EXPECTED_PERIOD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TickMarkStyle.PREDICTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TickMarkStyle.EXPECTED_FOLLICULAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TickMarkStyle.EXPECTED_OVULATORY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TickMarkStyle.EXPECTED_LUTEAL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TickMarkStyle.EXPECTED_HORMONAL_BIRTH_CONTROL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TickMarkStyle.PREGNANCY_FIRST_TRIMESTER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TickMarkStyle.PREGNANCY_SECOND_TRIMESTER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TickMarkStyle.PREGNANCY_THIRD_TRIMESTER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TickMarkStyle.PREGNANCY_POSTPARTUM.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f94032a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39333f m69593a(TickMarkStyle tickMarkStyle, boolean z4) {
        switch (tickMarkStyle == null ? -1 : a.f94032a[tickMarkStyle.ordinal()]) {
            case 1:
                return EnumC39333f.SURFACE_MCI_MENSTRUAL;
            case 2:
                return EnumC39333f.BRAND_WHITE;
            case 3:
                return EnumC39333f.WHITE_10;
            case 4:
                return z4 ? EnumC39333f.WHITE_70 : EnumC39333f.WHITE_30;
            case 5:
                return EnumC39333f.SURFACE_MCI_FOLLICULAR;
            case 6:
                return EnumC39333f.SURFACE_MCI_OVULATORY;
            case 7:
                return EnumC39333f.SURFACE_MCI_LUTEAL;
            case 8:
                return EnumC39333f.SLEEP;
            case 9:
                return EnumC39333f.RECOVERY;
            case 10:
                return EnumC39333f.WHITE_50;
            case 11:
                return EnumC39333f.BRAND_WHITE;
            case 12:
                return EnumC39333f.SURFACE_MCI_MENSTRUAL_DIM;
            case 13:
                return EnumC39333f.WHITE_10;
            case 14:
                return EnumC39333f.SURFACE_MCI_FOLLICULAR_DIM;
            case 15:
                return EnumC39333f.SURFACE_MCI_OVULATORY_DIM;
            case 16:
                return EnumC39333f.SURFACE_MCI_LUTEAL_DIM;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC39333f.SURFACE_MCI_BIRTH_CONTROL_DIM;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_1;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_2;
            case 20:
                return EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_3;
            case 21:
                return EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_4;
            default:
                return EnumC39333f.WHITE_50;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ EnumC39333f m69594b(TickMarkStyle tickMarkStyle, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return m69593a(tickMarkStyle, z4);
    }
}
