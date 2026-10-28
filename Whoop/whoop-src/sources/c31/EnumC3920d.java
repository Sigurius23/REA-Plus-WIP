package c31;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: c31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lc31/d;", "", "<init>", "(Ljava/lang/String;I)V", "Lc31/c;", "toButtonClickType", "()Lc31/c;", "ERROR", "LOADING", "FILLED", "PROGRESS", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC3920d {
    ERROR,
    LOADING,
    FILLED,
    PROGRESS;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: c31.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16008a;

        static {
            int[] iArr = new int[EnumC3920d.values().length];
            try {
                iArr[EnumC3920d.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3920d.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3920d.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16008a = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC3919c toButtonClickType() {
        int i13 = a.f16008a[ordinal()];
        if (i13 == 1) {
            return EnumC3919c.ERROR_BUTTON;
        }
        if (i13 != 2) {
            return i13 != 3 ? EnumC3919c.PROGRESS_BUTTON : EnumC3919c.PROGRESS_BUTTON;
        }
        return EnumC3919c.FILLED_BUTTON;
    }
}
