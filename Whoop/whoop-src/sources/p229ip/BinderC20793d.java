package p229ip;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import jp.AbstractC21843a;
import p073cq.C11040i;
import p073cq.C11048q;
import p478s3.AbstractC32098d;
import to.InterfaceC33973g;

/* JADX INFO: renamed from: ip.d */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC20793d extends AbstractBinderC20797h implements InterfaceC33973g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f78080g;

    /* JADX INFO: renamed from: h */
    public final Object f78081h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC20793d(int i13, C11040i c11040i) {
        this();
        this.f78080g = i13;
        this.f78081h = c11040i;
    }

    @Override // to.InterfaceC33973g
    /* JADX INFO: renamed from: J */
    public final void mo57328J(Status status) {
        switch (this.f78080g) {
            case 0:
                AbstractC32098d.m99850q(status, null, (C11040i) this.f78081h);
                break;
            case 1:
                AbstractC32098d.m99850q(status, null, (C11040i) this.f78081h);
                break;
            default:
                ((C11048q) this.f78081h).m29697b(status);
                break;
        }
    }

    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: j0 */
    public final boolean mo5672j0(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Status status = (Status) AbstractC21843a.m61826a(parcel, Status.CREATOR);
        AbstractC21843a.m61827b(parcel);
        mo57328J(status);
        return true;
    }

    public BinderC20793d() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC20793d(C11048q c11048q) {
        this();
        this.f78080g = 2;
        this.f78081h = c11048q;
    }
}
