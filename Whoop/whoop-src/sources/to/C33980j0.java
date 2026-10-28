package to;

import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.InterfaceC4973d;
import e73.C12803b;
import java.util.ArrayList;
import java.util.Objects;
import p073cq.C11040i;
import p403pp.AbstractC29405a;
import p403pp.C29408d;
import p656yp.C39694a;
import p656yp.C39697d;
import p656yp.C39698e;

/* JADX INFO: renamed from: to.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33980j0 extends AbstractC33993q {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f142449d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f142450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33980j0(C12803b c12803b, C4986c[] c4986cArr, boolean z4, int i13) {
        super(c4986cArr, z4, i13);
        this.f142450e = c12803b;
    }

    @Override // to.AbstractC33993q
    /* JADX INFO: renamed from: b */
    public final void mo107449b(InterfaceC4973d interfaceC4973d, C11040i c11040i) {
        C39694a c39694a;
        String string;
        C39694a c39694a2;
        String string2;
        C39694a c39694a3;
        ArrayList arrayList;
        switch (this.f142449d) {
            case 0:
                ((InterfaceC33987n) ((C12803b) this.f142450e).f43827e).accept(interfaceC4973d, c11040i);
                return;
            case 1:
                C39698e c39698e = (C39698e) interfaceC4973d;
                String str = (String) this.f142450e;
                synchronized (c39698e) {
                    try {
                        c39694a = (C39694a) c39698e.m111061j();
                    } catch (DeadObjectException | IllegalStateException unused) {
                        c39694a = null;
                    }
                    if (c39694a == null) {
                        throw new RemoteException("no service for getLicenseDetail call");
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                    parcelObtain.writeString(str);
                    Parcel parcelM127033s = c39694a.m127033s(parcelObtain, 2);
                    string = parcelM127033s.readString();
                    parcelM127033s.recycle();
                    break;
                }
                c11040i.m29687b(string);
                return;
            case 2:
                C39698e c39698e2 = (C39698e) interfaceC4973d;
                C29408d c29408d = (C29408d) this.f142450e;
                synchronized (c39698e2) {
                    try {
                        c39694a2 = (C39694a) c39698e2.m111061j();
                    } catch (DeadObjectException | IllegalStateException unused2) {
                        c39694a2 = null;
                    }
                    if (c39694a2 == null) {
                        throw new RemoteException("no service for getLicenseDetail call");
                    }
                    String str2 = c29408d.f119430w;
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                    parcelObtain2.writeString(str2);
                    Parcel parcelM127033s2 = c39694a2.m127033s(parcelObtain2, 4);
                    string2 = parcelM127033s2.readString();
                    parcelM127033s2.recycle();
                    break;
                }
                c11040i.m29687b(string2);
                return;
            default:
                C39698e c39698e3 = (C39698e) interfaceC4973d;
                ArrayList arrayList2 = (ArrayList) this.f142450e;
                synchronized (c39698e3) {
                    try {
                        c39694a3 = (C39694a) c39698e3.m111061j();
                    } catch (DeadObjectException | IllegalStateException unused3) {
                        c39694a3 = null;
                    }
                    if (c39694a3 == null) {
                        throw new RemoteException("no service for getLicenseDetail call");
                    }
                    Parcel parcelObtain3 = Parcel.obtain();
                    parcelObtain3.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                    parcelObtain3.writeList(arrayList2);
                    Parcel parcelM127033s3 = c39694a3.m127033s(parcelObtain3, 5);
                    arrayList = parcelM127033s3.readArrayList(AbstractC29405a.f119428a);
                    parcelM127033s3.recycle();
                    break;
                }
                c11040i.m29687b(arrayList);
                return;
        }
    }

    public C33980j0(C39697d c39697d, String str) {
        this.f142450e = str;
        Objects.requireNonNull(c39697d);
    }

    public C33980j0(C39697d c39697d, ArrayList arrayList) {
        this.f142450e = arrayList;
        Objects.requireNonNull(c39697d);
    }

    public C33980j0(C39697d c39697d, C29408d c29408d) {
        this.f142450e = c29408d;
        Objects.requireNonNull(c39697d);
    }
}
