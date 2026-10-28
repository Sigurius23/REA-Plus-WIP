package sm;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import nh3.AbstractC26725a;
import p309lo.AbstractC24543a;
import p309lo.InterfaceC24550h;
import p465rm.C31521c0;
import p465rm.InterfaceC31526e;
import p465rm.InterfaceC31529f;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33649r;
import p516u8.C34612q;
import p517u9.C34652a;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.C30097b;
import sn.C32750o0;
import sn.C32766w0;
import sn.C32768x0;
import tn.C33955a;
import tn.C33956b;

/* JADX INFO: renamed from: sm.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32710c implements InterfaceC24550h, InterfaceC31526e, InterfaceC39718e, InterfaceC33649r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135985w;

    public /* synthetic */ C32710c(int i13) {
        this.f135985w = i13;
    }

    /* JADX INFO: renamed from: a */
    public void m102661a(Object obj) {
        ((C32750o0) obj).f136194b.getClass();
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        C34612q c34612q = (C34612q) obj;
        return c34612q.f145801a + ": " + c34612q.f145802b;
    }

    @Override // p499t9.InterfaceC33649r
    /* JADX INFO: renamed from: d */
    public InterfaceC33644n[] mo1656d() {
        return new InterfaceC33644n[]{new C34652a(0)};
    }

    @Override // p465rm.InterfaceC31526e
    /* JADX INFO: renamed from: e */
    public InterfaceC31529f mo52217e(Bundle bundle) {
        C33955a[] c33955aArr;
        switch (this.f135985w) {
            case 24:
                C30097b c30097b = C31521c0.f130069h0;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                C41060w0 c41060w0M71581q = C41060w0.f177067E;
                if (parcelableArrayList != null) {
                    c41060w0M71581q = AbstractC24543a.m71581q(c30097b, parcelableArrayList);
                }
                return new C32766w0(bundle.getString(Integer.toString(1, 36), ""), (C31521c0[]) c41060w0M71581q.toArray(new C31521c0[0]));
            case 25:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                C41017e0 c41017e1 = AbstractC41023g0.f176998x;
                C41060w0 c41060w0M71581q2 = C41060w0.f177067E;
                if (parcelableArrayList2 != null) {
                    c41060w0M71581q2 = AbstractC24543a.m71581q(C32766w0.f136259E, parcelableArrayList2);
                }
                return new C32768x0((C32766w0[]) c41060w0M71581q2.toArray(new C32766w0[0]));
            case 26:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList3 == null) {
                    c33955aArr = new C33955a[0];
                } else {
                    C33955a[] c33955aArr2 = new C33955a[parcelableArrayList3.size()];
                    for (int i13 = 0; i13 < parcelableArrayList3.size(); i13++) {
                        c33955aArr2[i13] = (C33955a) C33955a.f142370H.mo52217e((Bundle) parcelableArrayList3.get(i13));
                    }
                    c33955aArr = c33955aArr2;
                }
                return new C33956b(c33955aArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j7 = bundle.getLong(Integer.toString(0, 36));
                int i14 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j13 = bundle.getLong(Integer.toString(5, 36));
                boolean z4 = bundle.getBoolean(Integer.toString(6, 36));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                Uri[] uriArr = new Uri[0];
                if (parcelableArrayList4 != null) {
                    uriArr = (Uri[]) parcelableArrayList4.toArray(uriArr);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new C33955a(j7, i14, iArr, uriArr2, longArray, j13, z4);
        }
    }

    @Override // p309lo.InterfaceC24550h
    public void invoke(Object obj) {
        int i13 = this.f135985w;
        throw AbstractC26725a.m79500d(obj);
    }
}
