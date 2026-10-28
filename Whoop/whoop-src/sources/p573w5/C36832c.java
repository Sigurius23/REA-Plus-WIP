package p573w5;

import android.graphics.Rect;
import java.util.Comparator;
import p211i5.C18093f;
import p499t9.C33623c0;

/* JADX INFO: renamed from: w5.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C36832c implements Comparator {

    /* JADX INFO: renamed from: w */
    public final Rect f157560w = new Rect();

    /* JADX INFO: renamed from: x */
    public final Rect f157561x = new Rect();

    /* JADX INFO: renamed from: y */
    public final boolean f157562y;

    /* JADX INFO: renamed from: z */
    public final C33623c0 f157563z;

    public C36832c(boolean z4, C33623c0 c33623c0) {
        this.f157562y = z4;
        this.f157563z = c33623c0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f157563z.getClass();
        Rect rect = this.f157560w;
        ((C18093f) obj).m51951f(rect);
        Rect rect2 = this.f157561x;
        ((C18093f) obj2).m51951f(rect2);
        int i13 = rect.top;
        int i14 = rect2.top;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.left;
        int i16 = rect2.left;
        boolean z4 = this.f157562y;
        if (i15 < i16) {
            return z4 ? 1 : -1;
        }
        if (i15 > i16) {
            return z4 ? -1 : 1;
        }
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        if (i17 < i18) {
            return -1;
        }
        if (i17 > i18) {
            return 1;
        }
        int i19 = rect.right;
        int i24 = rect2.right;
        if (i19 < i24) {
            return z4 ? 1 : -1;
        }
        if (i19 > i24) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
