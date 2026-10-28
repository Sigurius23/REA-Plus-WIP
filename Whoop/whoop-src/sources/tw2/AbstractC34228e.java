package tw2;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: tw2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "longEdge", "maxEdge", "a", "(II)I", "whoop-action_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34228e {
    /* JADX INFO: renamed from: a */
    public static final int m108190a(int i13, int i14) {
        int i15 = 1;
        if (i13 > 0 && i14 > 0) {
            while (true) {
                int i16 = i15 * 2;
                if (i13 / i16 < i14) {
                    break;
                }
                i15 = i16;
            }
        }
        return i15;
    }
}
