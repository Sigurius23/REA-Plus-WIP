package in2;

import android.graphics.Color;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: in2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lin2/c;", "", "<init>", "()V", "", "color1", "color2", "", "ratio", "a", "(IIF)I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18731c {

    /* JADX INFO: renamed from: a */
    public static final C18731c f73602a = new C18731c();

    private C18731c() {
    }

    /* JADX INFO: renamed from: a */
    public static final int m54471a(int color1, int color2, float ratio) {
        float f13 = 1.0f - ratio;
        return Color.argb((int) ((Color.alpha(color1) * f13) + (Color.alpha(color2) * ratio)), (int) ((Color.red(color1) * f13) + (Color.red(color2) * ratio)), (int) ((Color.green(color1) * f13) + (Color.green(color2) * ratio)), (int) ((Color.blue(color1) * f13) + (Color.blue(color2) * ratio)));
    }
}
