package q20;

import y00.EnumC38910o;

/* JADX INFO: renamed from: q20.z */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29841z {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f121960a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f121961b;

    static {
        int[] iArr = new int[EnumC29836u.values().length];
        try {
            iArr[EnumC29836u.Link.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            EnumC29836u enumC29836u = EnumC29836u.Link;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121960a = iArr;
        int[] iArr2 = new int[EnumC38910o.values().length];
        try {
            EnumC38910o enumC38910o = EnumC38910o.OnSession;
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f121961b = iArr2;
    }
}
