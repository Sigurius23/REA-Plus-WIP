package p291l0;

import android.view.View;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bp0.C3526n;
import java.util.WeakHashMap;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C22949e implements InterfaceC22965i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90582a;

    public /* synthetic */ C22949e(int i13) {
        this.f90582a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static final C22937b m66710b(int i13, String str) {
        WeakHashMap weakHashMap = C22944c2.f90553v;
        return new C22937b(i13, str);
    }

    /* JADX INFO: renamed from: d */
    public static final C23018z1 m66711d(int i13, String str) {
        WeakHashMap weakHashMap = C22944c2.f90553v;
        return new C23018z1(new C23014y0(0, 0, 0, 0), str);
    }

    /* JADX INFO: renamed from: e */
    public static C22944c2 m66712e(Composer composer) {
        C22944c2 c22944c2;
        C28655q c28655q = (C28655q) composer;
        View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
        WeakHashMap weakHashMap = C22944c2.f90553v;
        synchronized (weakHashMap) {
            try {
                Object c22944c3 = weakHashMap.get(view);
                if (c22944c3 == null) {
                    c22944c3 = new C22944c2(view);
                    weakHashMap.put(view, c22944c3);
                }
                c22944c2 = (C22944c2) c22944c3;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        boolean zM87157i = c28655q.m87157i(c22944c2) | c28655q.m87157i(view);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C3526n(26, c22944c2, view);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87251e(c22944c2, (Function1) objM87133R, c28655q);
        return c22944c2;
    }

    @Override // p291l0.InterfaceC22965i
    /* JADX INFO: renamed from: c */
    public void mo66713c(InterfaceC39171c interfaceC39171c, int i13, int[] iArr, EnumC39181m enumC39181m, int[] iArr2) {
        switch (this.f90582a) {
            case 0:
                AbstractC22977m.m66741d(iArr, iArr2, false);
                break;
            case 1:
                AbstractC22977m.m66742e(i13, iArr, iArr2, false);
                break;
            case 2:
                AbstractC22977m.m66744g(i13, iArr, iArr2, false);
                break;
            case 3:
                if (enumC39181m != EnumC39181m.f168423w) {
                    AbstractC22977m.m66741d(iArr, iArr2, true);
                } else {
                    AbstractC22977m.m66742e(i13, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC39181m != EnumC39181m.f168423w) {
                    AbstractC22977m.m66742e(i13, iArr, iArr2, true);
                } else {
                    AbstractC22977m.m66741d(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f90582a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "AbsoluteArrangement#SpaceBetween";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
