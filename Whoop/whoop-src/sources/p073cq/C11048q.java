package p073cq;

import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p478s3.AbstractC32098d;
import p503tp.C34040k;
import p503tp.C34041l;
import p503tp.InterfaceC34050u;
import p557vo.AbstractC36219a;

/* JADX INFO: renamed from: cq.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C11048q implements InterfaceC11038g, InterfaceC11033b, InterfaceC34050u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34661w;

    /* JADX INFO: renamed from: x */
    public final C11040i f34662x;

    public /* synthetic */ C11048q(int i13, C11040i c11040i) {
        this.f34661w = i13;
        this.f34662x = c11040i;
    }

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) {
        switch (this.f34661w) {
            case 1:
                boolean zIsSuccessful = task.isSuccessful();
                C11040i c11040i = this.f34662x;
                if (!zIsSuccessful) {
                    if (task.getException() != null) {
                        Exception exception = task.getException();
                        if (exception != null) {
                            c11040i.m29686a(exception);
                        }
                    } else {
                        c11040i.m29689d(null);
                    }
                }
                return c11040i.f34644a;
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                C11040i c11040i2 = this.f34662x;
                if (zIsSuccessful2) {
                    c11040i2.m29689d((Location) task.getResult());
                } else {
                    Exception exception2 = task.getException();
                    if (exception2 != null) {
                        c11040i2.m29686a(exception2);
                    }
                }
                return c11040i2.f34644a;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m29697b(AbstractC36219a abstractC36219a) {
        switch (this.f34661w) {
            case 3:
                C34041l c34041l = (C34041l) abstractC36219a;
                Status status = c34041l.f142708w;
                boolean zM15593b = status.m15593b();
                C11040i c11040i = this.f34662x;
                if (zM15593b) {
                    C34040k c34040k = new C34040k();
                    c34040k.f142707a = c34041l;
                    c11040i.m29687b(c34040k);
                } else if (status.f20495y == null) {
                    c11040i.m29686a(new ApiException(status));
                } else {
                    c11040i.m29686a(new ResolvableApiException(status));
                }
                break;
            default:
                AbstractC32098d.m99850q((Status) abstractC36219a, null, this.f34662x);
                break;
        }
    }

    @Override // p073cq.InterfaceC11038g
    /* JADX INFO: renamed from: d */
    public void mo29685d() {
        this.f34662x.f34644a.m29705d();
    }

    @Override // p503tp.InterfaceC34050u
    /* JADX INFO: renamed from: s */
    public void mo29698s() {
        this.f34662x.m29689d(null);
    }
}
