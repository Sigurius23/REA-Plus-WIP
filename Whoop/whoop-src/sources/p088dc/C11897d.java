package p088dc;

import android.os.Parcel;
import android.util.SparseIntArray;
import p002a0.C0022g;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: dc.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C11897d extends AbstractC11896c {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f38887d;

    /* JADX INFO: renamed from: e */
    public final Parcel f38888e;

    /* JADX INFO: renamed from: f */
    public final int f38889f;

    /* JADX INFO: renamed from: g */
    public final int f38890g;

    /* JADX INFO: renamed from: h */
    public final String f38891h;

    /* JADX INFO: renamed from: i */
    public int f38892i;

    /* JADX INFO: renamed from: j */
    public int f38893j;

    /* JADX INFO: renamed from: k */
    public int f38894k;

    public C11897d(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0022g(0), new C0022g(0), new C0022g(0));
    }

    @Override // p088dc.AbstractC11896c
    /* JADX INFO: renamed from: a */
    public final C11897d mo32008a() {
        Parcel parcel = this.f38888e;
        int iDataPosition = parcel.dataPosition();
        int i13 = this.f38893j;
        if (i13 == this.f38889f) {
            i13 = this.f38890g;
        }
        return new C11897d(parcel, iDataPosition, i13, AbstractC25012a.m73376i(this.f38891h, "  ", new StringBuilder()), this.f38884a, this.f38885b, this.f38886c);
    }

    @Override // p088dc.AbstractC11896c
    /* JADX INFO: renamed from: e */
    public final boolean mo32012e(int i13) {
        while (this.f38893j < this.f38890g) {
            int i14 = this.f38894k;
            if (i14 == i13) {
                return true;
            }
            if (String.valueOf(i14).compareTo(String.valueOf(i13)) > 0) {
                return false;
            }
            int i15 = this.f38893j;
            Parcel parcel = this.f38888e;
            parcel.setDataPosition(i15);
            int i16 = parcel.readInt();
            this.f38894k = parcel.readInt();
            this.f38893j += i16;
        }
        return this.f38894k == i13;
    }

    @Override // p088dc.AbstractC11896c
    /* JADX INFO: renamed from: i */
    public final void mo32016i(int i13) {
        int i14 = this.f38892i;
        SparseIntArray sparseIntArray = this.f38887d;
        Parcel parcel = this.f38888e;
        if (i14 >= 0) {
            int i15 = sparseIntArray.get(i14);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i15);
            parcel.writeInt(iDataPosition - i15);
            parcel.setDataPosition(iDataPosition);
        }
        this.f38892i = i13;
        sparseIntArray.put(i13, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i13);
    }

    public C11897d(Parcel parcel, int i13, int i14, String str, C0022g c0022g, C0022g c0022g2, C0022g c0022g3) {
        super(c0022g, c0022g2, c0022g3);
        this.f38887d = new SparseIntArray();
        this.f38892i = -1;
        this.f38894k = -1;
        this.f38888e = parcel;
        this.f38889f = i13;
        this.f38890g = i14;
        this.f38893j = i13;
        this.f38891h = str;
    }
}
