package vl2;

import n21.EnumC26195i;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: vl2.r */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lvl2/q;", "style", "Ln21/i;", "a", "(Lvl2/q;)Ln21/i;", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36125r {

    /* JADX INFO: renamed from: vl2.r$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154410a;

        static {
            int[] iArr = new int[EnumC36124q.values().length];
            try {
                iArr[EnumC36124q.MANUAL_ENTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36124q.STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36124q.MENSTRUAL_PHASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36124q.FOLLICULAR_PHASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC36124q.OVULATORY_PHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC36124q.LUTEAL_PHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f154410a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC26195i m114800a(EnumC36124q enumC36124q) {
        switch (enumC36124q == null ? -1 : a.f154410a[enumC36124q.ordinal()]) {
            case 1:
            case 2:
                return EnumC26195i.MEDIUM_CIRCLE;
            case 3:
            case 4:
            case 5:
            case 6:
                return EnumC26195i.CAPSULE;
            default:
                return EnumC26195i.SQUARE;
        }
    }
}
