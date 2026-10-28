package io.getstream.chat.android.p226ui.utils;

import android.app.Activity;
import android.graphics.Point;
import android.os.CancellationSignal;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import ax.InterfaceC2116a;
import c93.InterfaceC4339a;
import cx.C11167c;
import java.util.List;
import java.util.concurrent.Executor;
import or2.C28217y0;
import p073cq.InterfaceC11036e;
import p236j.AbstractC21065d;
import p320m5.InterfaceC25063g;
import p361o9.C27670j;
import p361o9.C27676p;
import p361o9.InterfaceC27674n;
import p516u8.C34610p;
import p516u8.C34611p0;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.utils.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19902a implements InterfaceC2116a, InterfaceC27674n, InterfaceC11036e {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f74827E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74828w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74829x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74830y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f74831z;

    public /* synthetic */ C19902a(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f74828w = i13;
        this.f74830y = obj;
        this.f74831z = obj2;
        this.f74829x = obj3;
        this.f74827E = obj4;
    }

    @Override // ax.InterfaceC2116a
    /* JADX INFO: renamed from: a */
    public void mo6682a(C11167c c11167c, List list) {
        PermissionChecker.checkPermissions$lambda$9((PermissionChecker) this.f74830y, (View) this.f74831z, (String) this.f74829x, (String) this.f74827E, c11167c, list);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // p361o9.InterfaceC27674n
    /* JADX INFO: renamed from: c */
    public C41060w0 mo8620c(int i13, C34611p0 c34611p0, int[] iArr) {
        int i14;
        int i15;
        int i16;
        int i17;
        C34611p0 c34611p1 = c34611p0;
        C27670j c27670j = (C27670j) this.f74830y;
        String str = (String) this.f74829x;
        int[] iArr2 = (int[]) this.f74831z;
        Point point = (Point) this.f74827E;
        int i18 = iArr2[i13];
        int i19 = point != null ? point.x : c27670j.f145836e;
        int i24 = point != null ? point.y : c27670j.f145837f;
        boolean z4 = c27670j.f145839h;
        if (i19 == Integer.MAX_VALUE || i24 == Integer.MAX_VALUE) {
            i14 = Integer.MAX_VALUE;
        } else {
            int i25 = Integer.MAX_VALUE;
            for (int i26 = 0; i26 < c34611p1.f145796a; i26++) {
                C34610p c34610p = c34611p1.f145799d[i26];
                int i27 = c34610p.f145790u;
                int i28 = c34610p.f145791v;
                if (i27 > 0 && i28 > 0) {
                    if (!z4) {
                        i16 = i19;
                        i17 = i24;
                    } else if ((i27 > i28) != (i19 > i24)) {
                        i17 = i19;
                        i16 = i24;
                    } else {
                        i16 = i19;
                        i17 = i24;
                    }
                    int i29 = i27 * i17;
                    int i34 = i28 * i16;
                    Point point2 = i29 >= i34 ? new Point(i16, AbstractC38065t.m121912e(i34, i27)) : new Point(AbstractC38065t.m121912e(i29, i28), i17);
                    int i35 = c34610p.f145790u;
                    int i36 = i35 * i28;
                    if (i35 >= ((int) (point2.x * 0.98f)) && i28 >= ((int) (point2.y * 0.98f)) && i36 < i25) {
                        i25 = i36;
                    }
                }
            }
            i14 = i25;
        }
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        int i37 = 0;
        while (i37 < c34611p1.f145796a) {
            C34610p c34610p2 = c34611p1.f145799d[i37];
            int i38 = c34610p2.f145790u;
            int i39 = (i38 == -1 || (i15 = c34610p2.f145791v) == -1) ? -1 : i38 * i15;
            c41014d0M133251l.m133222a(new C27676p(i13, c34611p1, i37, c27670j, iArr[i37], str, i18, i14 == Integer.MAX_VALUE || (i39 != -1 && i39 <= i14)));
            i37++;
            c34611p1 = c34611p0;
        }
        return c41014d0M133251l.m133239f();
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        switch (this.f74828w) {
            case 2:
                C28217y0.m85442j((AbstractC21065d) this.f74830y, (Activity) this.f74831z, (C28217y0) this.f74829x, (InterfaceC4339a) this.f74827E, exc);
                break;
            default:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2((CredentialProviderPlayServicesImpl) this.f74830y, (CancellationSignal) this.f74831z, (Executor) this.f74829x, (InterfaceC25063g) this.f74827E, exc);
                break;
        }
    }

    public /* synthetic */ C19902a(C27670j c27670j, String str, int[] iArr, Point point) {
        this.f74828w = 1;
        this.f74830y = c27670j;
        this.f74829x = str;
        this.f74831z = iArr;
        this.f74827E = point;
    }
}
