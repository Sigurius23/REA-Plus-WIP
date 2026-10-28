package eu;

import android.os.Parcel;
import android.os.RemoteException;
import c93.InterfaceC4339a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p181h2.C16617b;
import p375op.AbstractBinderC28070b;
import p375op.AbstractC28076h;
import p375op.InterfaceC28071c;
import p390p1.C28647o;
import p530up.C35146b;
import p558vp.C36261e;
import p591wp.C37480a;
import p591wp.C37481b;
import p591wp.C37487h;
import p591wp.C37488i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13613g0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f48194E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f48195F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f48196G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ float f48197H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ long f48198I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C37481b f48199J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ long f48200K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ String f48201L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean f48202M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C13635v f48203w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28647o f48204x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13619j0 f48205y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f48206z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13613g0(C13635v c13635v, C28647o c28647o, C13619j0 c13619j0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, float f13, long j7, C37481b c37481b, long j13, String str, boolean z4) {
        super(0);
        this.f48203w = c13635v;
        this.f48204x = c28647o;
        this.f48205y = c13619j0;
        this.f48206z = function1;
        this.f48194E = function2;
        this.f48195F = function3;
        this.f48196G = function4;
        this.f48197H = f13;
        this.f48198I = j7;
        this.f48199J = c37481b;
        this.f48200K = j13;
        this.f48201L = str;
        this.f48202M = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C35146b c35146b;
        C37487h c37480a;
        C13635v c13635v = this.f48203w;
        if (c13635v != null && (c35146b = c13635v.f48320E) != null) {
            C37488i c37488i = new C37488i();
            c37488i.f160332E = 0.5f;
            c37488i.f160333F = 1.0f;
            c37488i.f160335H = true;
            c37488i.f160336I = false;
            c37488i.f160337J = 0.0f;
            c37488i.f160338K = 0.5f;
            c37488i.f160339L = 0.0f;
            c37488i.f160342O = 0;
            c37488i.f160340M = this.f48197H;
            long j7 = this.f48198I;
            float fM47189e = C16617b.m47189e(j7);
            float fM47190f = C16617b.m47190f(j7);
            c37488i.f160332E = fM47189e;
            c37488i.f160333F = fM47190f;
            c37488i.f160334G = false;
            c37488i.f160336I = false;
            c37488i.f160350z = this.f48199J;
            long j13 = this.f48200K;
            float fM47189e2 = C16617b.m47189e(j13);
            float fM47190f2 = C16617b.m47190f(j13);
            c37488i.f160338K = fM47189e2;
            c37488i.f160339L = fM47190f2;
            LatLng latLng = (LatLng) this.f48205y.f48237a.getValue();
            if (latLng == null) {
                throw new IllegalArgumentException("latlng cannot be null - a position is required.");
            }
            c37488i.f160347w = latLng;
            c37488i.f160337J = 0.0f;
            c37488i.f160349y = null;
            c37488i.f160348x = this.f48201L;
            c37488i.f160335H = this.f48202M;
            c37488i.f160341N = 0.0f;
            try {
                C36261e c36261e = c35146b.f149130a;
                Parcel parcelM57322k0 = c36261e.m57322k0();
                AbstractC28076h.m84851c(parcelM57322k0, c37488i);
                Parcel parcelM57321j0 = c36261e.m57321j0(parcelM57322k0, 11);
                InterfaceC28071c interfaceC28071cM84848n0 = AbstractBinderC28070b.m84848n0(parcelM57321j0.readStrongBinder());
                parcelM57321j0.recycle();
                if (interfaceC28071cM84848n0 != null) {
                    c37480a = c37488i.f160344Q == 1 ? new C37480a(interfaceC28071cM84848n0) : new C37487h(interfaceC28071cM84848n0);
                } else {
                    c37480a = null;
                }
                if (c37480a != null) {
                    c37480a.m120174c(null);
                    return new C13617i0(this.f48204x, c37480a, this.f48205y, this.f48206z, this.f48194E, this.f48195F, this.f48196G);
                }
            } catch (RemoteException e5) {
                throw new RuntimeRemoteException(e5);
            }
        }
        throw new IllegalStateException("Error adding marker");
    }
}
