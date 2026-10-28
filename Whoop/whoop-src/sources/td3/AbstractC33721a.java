package td3;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p036bq.RunnableC3543b;
import p097ds.RunnableC12316s;

/* JADX INFO: renamed from: td3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC33721a {

    /* JADX INFO: renamed from: b */
    public final boolean f141039b;

    /* JADX INFO: renamed from: c */
    public final boolean f141040c;

    /* JADX INFO: renamed from: d */
    public final boolean f141041d;

    /* JADX INFO: renamed from: f */
    public final List f141043f;

    /* JADX INFO: renamed from: g */
    public final C33734n f141044g;

    /* JADX INFO: renamed from: h */
    public final AbstractC33729i f141045h;

    /* JADX INFO: renamed from: i */
    public final Handler f141046i;

    /* JADX INFO: renamed from: a */
    public final Object f141038a = new Object();

    /* JADX INFO: renamed from: j */
    public final ArrayList f141047j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final HashSet f141048k = new HashSet();

    /* JADX INFO: renamed from: l */
    public final HashMap f141049l = new HashMap();

    /* JADX INFO: renamed from: m */
    public final RunnableC3543b f141050m = new RunnableC3543b(this, 25);

    /* JADX INFO: renamed from: e */
    public boolean f141042e = false;

    public AbstractC33721a(boolean z4, boolean z13, List list, C33734n c33734n, AbstractC33729i abstractC33729i, Handler handler) {
        this.f141043f = Collections.unmodifiableList(list);
        this.f141044g = c33734n;
        this.f141045h = abstractC33729i;
        this.f141046i = handler;
        boolean z14 = false;
        this.f141041d = (c33734n.f141114z == 1 || c33734n.f141106J) ? false : true;
        this.f141039b = (list.isEmpty() || (z13 && c33734n.f141104H)) ? false : true;
        long j7 = c33734n.f141101E;
        if (j7 > 0 && (!z4 || !c33734n.f141105I)) {
            z14 = true;
        }
        this.f141040c = z14;
        if (z14) {
            handler.postDelayed(new RunnableC12316s(this, handler, false, 14), j7);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m106603a(int i13, C33733m c33733m) {
        boolean zIsEmpty;
        C33733m c33733m2;
        if (this.f141042e) {
            return;
        }
        if (this.f141043f.isEmpty() || m106605c(c33733m)) {
            String address = c33733m.f141097w.getAddress();
            if (!this.f141041d) {
                if (!this.f141040c) {
                    this.f141045h.mo18125c(i13, c33733m);
                    return;
                }
                synchronized (this.f141038a) {
                    try {
                        if (!this.f141048k.contains(address)) {
                            this.f141047j.add(c33733m);
                            this.f141048k.add(address);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            }
            synchronized (this.f141049l) {
                zIsEmpty = this.f141049l.isEmpty();
                c33733m2 = (C33733m) this.f141049l.put(address, c33733m);
            }
            if (c33733m2 == null && (this.f141044g.f141114z & 2) > 0) {
                this.f141045h.mo18125c(2, c33733m);
            }
            if (!zIsEmpty || (this.f141044g.f141114z & 4) <= 0) {
                return;
            }
            this.f141046i.removeCallbacks(this.f141050m);
            this.f141046i.postDelayed(this.f141050m, this.f141044g.f141108L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m106604b(ArrayList arrayList) {
        if (this.f141042e) {
            return;
        }
        if (this.f141039b) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C33733m c33733m = (C33733m) it.next();
                if (m106605c(c33733m)) {
                    arrayList2.add(c33733m);
                }
            }
            arrayList = arrayList2;
        }
        this.f141045h.mo18123a(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX INFO: renamed from: c */
    public final boolean m106605c(C33733m c33733m) {
        boolean z4;
        C33732l c33732l;
        ParcelUuid parcelUuid;
        int i13;
        boolean zEquals;
        boolean z13;
        Iterator it = this.f141043f.iterator();
        do {
            z4 = false;
            if (!it.hasNext()) {
                return false;
            }
            C33731k c33731k = (C33731k) it.next();
            byte[] bArr = c33731k.f141075F;
            byte[] bArr2 = c33731k.f141078I;
            ParcelUuid parcelUuid2 = c33731k.f141082y;
            String str = c33731k.f141080w;
            if (c33733m != null) {
                BluetoothDevice bluetoothDevice = c33733m.f141097w;
                String str2 = c33731k.f141081x;
                if ((str2 == null || str2.equals(bluetoothDevice.getAddress())) && (((c33732l = c33733m.f141098x) != null || (str == null && parcelUuid2 == null && bArr2 == null && bArr == null)) && (str == null || str.equals(c33732l.f141089f)))) {
                    if (parcelUuid2 != null) {
                        ParcelUuid parcelUuid3 = c33731k.f141083z;
                        List list = c33732l.f141085b;
                        if (list != null) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z13 = false;
                                    break;
                                }
                                ParcelUuid parcelUuid4 = (ParcelUuid) it3.next();
                                UUID uuid = parcelUuid3 == null ? null : parcelUuid3.getUuid();
                                UUID uuid2 = parcelUuid2.getUuid();
                                UUID uuid3 = parcelUuid4.getUuid();
                                if (uuid == null) {
                                    zEquals = uuid2.equals(uuid3);
                                } else {
                                    zEquals = (uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits());
                                }
                                if (zEquals) {
                                    z13 = true;
                                    break;
                                }
                            }
                        } else {
                            z13 = false;
                            break;
                        }
                        if (z13) {
                            parcelUuid = c33731k.f141074E;
                            if (parcelUuid != null || c33732l == null) {
                                i13 = c33731k.f141077H;
                                if (i13 >= 0 || c33732l == null) {
                                    z4 = true;
                                } else {
                                    byte[] bArr3 = c33731k.f141079J;
                                    SparseArray sparseArray = c33732l.f141086c;
                                    if (C33731k.m106615b(bArr2, bArr3, sparseArray != null ? (byte[]) sparseArray.get(i13) : null)) {
                                        z4 = true;
                                    }
                                }
                            } else {
                                byte[] bArr4 = c33731k.f141076G;
                                Map map = c33732l.f141087d;
                                if (C33731k.m106615b(bArr, bArr4, map == null ? null : (byte[]) map.get(parcelUuid))) {
                                    i13 = c33731k.f141077H;
                                    if (i13 >= 0) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                }
                            }
                        }
                    } else {
                        parcelUuid = c33731k.f141074E;
                        if (parcelUuid != null) {
                            i13 = c33731k.f141077H;
                            if (i13 >= 0) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                        } else {
                            i13 = c33731k.f141077H;
                            if (i13 >= 0) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                        }
                    }
                }
            }
        } while (!z4);
        return true;
    }
}
