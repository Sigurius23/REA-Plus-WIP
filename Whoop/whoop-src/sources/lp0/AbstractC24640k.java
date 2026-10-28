package lp0;

import android.graphics.Rect;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: lp0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Landroid/graphics/Rect;", "b", "(Landroid/graphics/Rect;)Landroid/graphics/Rect;", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24640k {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Rect m71992b(Rect rect) {
        return new Rect(rect.left, rect.top, (rect.width() / 10) + rect.right, rect.bottom);
    }
}
