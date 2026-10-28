package aq;

import android.os.Parcel;
import jp.AbstractC21843a;
import p097ds.RunnableC12316s;
import p229ip.AbstractBinderC20797h;
import to.BinderC33978i0;

/* JADX INFO: renamed from: aq.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractBinderC1886c extends AbstractBinderC20797h {
    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: j0 */
    public final boolean mo5672j0(int i13, Parcel parcel, Parcel parcel2) {
        switch (i13) {
            case 3:
                AbstractC21843a.m61827b(parcel);
                break;
            case 4:
                AbstractC21843a.m61827b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC21843a.m61827b(parcel);
                break;
            case 7:
                AbstractC21843a.m61827b(parcel);
                break;
            case 8:
                C1889f c1889f = (C1889f) AbstractC21843a.m61826a(parcel, C1889f.CREATOR);
                AbstractC21843a.m61827b(parcel);
                BinderC33978i0 binderC33978i0 = (BinderC33978i0) this;
                binderC33978i0.f142441h.post(new RunnableC12316s(binderC33978i0, c1889f, false, 16));
                break;
            case 9:
                AbstractC21843a.m61827b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
