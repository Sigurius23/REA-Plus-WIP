package androidx.fragment.app;

import android.view.View;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1315l {

    /* JADX INFO: renamed from: a */
    public final C1334p2 f5663a;

    public AbstractC1315l(C1334p2 operation) {
        AbstractC22676k.m65750j(operation, "operation");
        this.f5663a = operation;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4119a() {
        int i13;
        C1334p2 c1334p2 = this.f5663a;
        View view = c1334p2.f5751c.mView;
        if (view != null) {
            i13 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i13 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(visibility, "Unknown visibility "));
                    }
                    i13 = 3;
                }
            }
        } else {
            i13 = 0;
        }
        int i14 = c1334p2.f5749a;
        if (i13 != i14) {
            return (i13 == 2 || i14 == 2) ? false : true;
        }
        return true;
    }
}
