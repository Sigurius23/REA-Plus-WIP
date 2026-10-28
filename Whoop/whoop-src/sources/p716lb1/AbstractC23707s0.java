package p716lb1;

import com.whoop.design.models.items.CyclePhaseStyle;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.s0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/CyclePhaseStyle;", "style", "Ly81/f;", "a", "(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23707s0 {

    /* JADX INFO: renamed from: lb1.s0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93956a;

        static {
            int[] iArr = new int[CyclePhaseStyle.values().length];
            try {
                iArr[CyclePhaseStyle.MENSTRUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CyclePhaseStyle.FOLLICULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CyclePhaseStyle.LUTEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CyclePhaseStyle.OVULATORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CyclePhaseStyle.NO_PHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CyclePhaseStyle.HORMONAL_BIRTH_CONTROL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f93956a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39333f m69376a(CyclePhaseStyle cyclePhaseStyle) {
        switch (cyclePhaseStyle == null ? -1 : a.f93956a[cyclePhaseStyle.ordinal()]) {
            case 1:
                return EnumC39333f.SURFACE_MCI_MENSTRUAL;
            case 2:
                return EnumC39333f.SURFACE_MCI_FOLLICULAR;
            case 3:
                return EnumC39333f.SURFACE_MCI_LUTEAL;
            case 4:
                return EnumC39333f.SURFACE_MCI_OVULATORY;
            case 5:
                return EnumC39333f.STRAIN_ZONE_1;
            case 6:
                return EnumC39333f.SLEEP;
            default:
                return EnumC39333f.WHITE_70;
        }
    }
}
