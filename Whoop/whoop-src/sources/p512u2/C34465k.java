package p512u2;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import p133f1.C13968p1;

/* JADX INFO: renamed from: u2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C34465k {

    /* JADX INFO: renamed from: a */
    public final Object f144800a;

    /* JADX INFO: renamed from: b */
    public final C13968p1 f144801b;

    /* JADX INFO: renamed from: c */
    public final int f144802c;

    /* JADX INFO: renamed from: d */
    public final int f144803d;

    /* JADX INFO: renamed from: e */
    public final int f144804e;

    /* JADX INFO: renamed from: f */
    public int f144805f;

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public C34465k(List list, C13968p1 c13968p1) {
        int classification;
        this.f144800a = list;
        this.f144801b = c13968p1;
        int i13 = 0;
        if (Build.VERSION.SDK_INT < 29) {
            classification = 0;
        } else {
            MotionEvent motionEventM39756l = c13968p1 != null ? c13968p1.m39756l() : null;
            if (motionEventM39756l != null) {
                classification = motionEventM39756l.getClassification();
            } else {
                classification = 0;
            }
        }
        this.f144802c = classification;
        MotionEvent motionEventM39756l2 = c13968p1 != null ? c13968p1.m39756l() : null;
        this.f144803d = motionEventM39756l2 != null ? motionEventM39756l2.getButtonState() : 0;
        MotionEvent motionEventM39756l3 = c13968p1 != null ? c13968p1.m39756l() : null;
        this.f144804e = motionEventM39756l3 != null ? motionEventM39756l3.getMetaState() : 0;
        MotionEvent motionEventM39756l4 = c13968p1 != null ? c13968p1.m39756l() : null;
        if (motionEventM39756l4 != null) {
            int actionMasked = motionEventM39756l4.getActionMasked();
            if (actionMasked == 0) {
                i13 = 1;
            } else if (actionMasked == 1) {
                i13 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i13 = 1;
                        break;
                    case 6:
                        i13 = 2;
                        break;
                    case 7:
                        i13 = 3;
                        break;
                    case 8:
                        i13 = 6;
                        break;
                    case 9:
                        i13 = 4;
                        break;
                    case 10:
                        i13 = 5;
                        break;
                }
            } else {
                i13 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i13 < size) {
                    C34472r c34472r = (C34472r) list.get(i13);
                    if (AbstractC34454d0.m108914e(c34472r)) {
                        i13 = 2;
                    } else if (AbstractC34454d0.m108912c(c34472r)) {
                        i13 = 1;
                    } else {
                        i13++;
                    }
                } else {
                    i13 = 3;
                }
            }
        }
        this.f144805f = i13;
    }
}
