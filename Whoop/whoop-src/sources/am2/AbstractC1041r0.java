package am2;

import java.util.Arrays;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: am2.r0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "", "b", "(F)Ljava/lang/String;", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1041r0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m2988b(float f13) {
        int i13 = (int) ((f13 / 1000) / 60);
        return ((i13 / 60) % 24) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13 % 60)}, 1));
    }
}
