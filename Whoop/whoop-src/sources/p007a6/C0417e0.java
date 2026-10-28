package p007a6;

import androidx.datastore.core.CorruptionException;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.android.video.generated.models.RejectCallRequest;
import java.io.Serializable;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33366b4;

/* JADX INFO: renamed from: a6.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0417e0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f1434E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1435F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1436w = 0;

    /* JADX INFO: renamed from: x */
    public int f1437x;

    /* JADX INFO: renamed from: y */
    public Object f1438y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Serializable f1439z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417e0(C22669g0 c22669g0, C0429i0 c0429i0, C22665e0 c22665e0, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f1439z = c22669g0;
        this.f1434E = c0429i0;
        this.f1435F = c22665e0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f1436w) {
            case 0:
                return new C0417e0((C22669g0) this.f1439z, (C0429i0) this.f1434E, (C22665e0) this.f1435F, interfaceC30057d);
            default:
                return new C0417e0((C33366b4) this.f1438y, (String) this.f1439z, (String) this.f1434E, (AbstractC34235f) this.f1435F, interfaceC30057d);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f1436w) {
            case 0:
                break;
        }
        return ((C0417e0) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C22669g0 c22669g0;
        C22665e0 c22665e0;
        switch (this.f1436w) {
            case 0:
                C22665e0 c22665e1 = (C22665e0) this.f1435F;
                C22669g0 c22669g1 = (C22669g0) this.f1439z;
                C0429i0 c0429i0 = (C0429i0) this.f1434E;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f1437x;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            c22669g0 = (C22669g0) ((Serializable) this.f1438y);
                            AbstractC34132o.m107864I(obj);
                        } else {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c22665e1 = (C22665e0) ((Serializable) this.f1438y);
                                AbstractC34132o.m107864I(obj);
                                c22665e1.f89334w = ((Number) obj).intValue();
                                return C23454a0.f92919a;
                            }
                            c22665e0 = (C22665e0) ((Serializable) this.f1438y);
                            AbstractC34132o.m107864I(obj);
                        }
                        c22665e0.f89334w = ((Number) obj).intValue();
                        return C23454a0.f92919a;
                    }
                    AbstractC34132o.m107864I(obj);
                    this.f1438y = c22669g1;
                    this.f1437x = 1;
                    obj = c0429i0.m1113i(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    c22669g0 = c22669g1;
                    c22669g0.f89336w = obj;
                    C0415d1 c0415d1M1112h = c0429i0.m1112h();
                    this.f1438y = c22665e1;
                    this.f1437x = 2;
                    obj = c0415d1M1112h.m1098a();
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    c22665e0 = c22665e1;
                    c22665e0.f89334w = ((Number) obj).intValue();
                    return C23454a0.f92919a;
                } catch (CorruptionException unused) {
                    Object obj2 = c22669g1.f89336w;
                    this.f1438y = c22665e1;
                    this.f1437x = 3;
                    obj = c0429i0.m1114j(obj2, true, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f1437x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ProductvideoApi productvideoApiM124884a = ((C33366b4) this.f1438y).f139232E.m124884a();
                String str = (String) this.f1439z;
                String str2 = (String) this.f1434E;
                AbstractC34235f abstractC34235f = (AbstractC34235f) this.f1435F;
                RejectCallRequest rejectCallRequest = new RejectCallRequest(abstractC34235f != null ? abstractC34235f.mo13074M() : null);
                this.f1437x = 1;
                Object objRejectCall = productvideoApiM124884a.rejectCall(str, str2, rejectCallRequest, this);
                return objRejectCall == enumC31071a2 ? enumC31071a2 : objRejectCall;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417e0(C33366b4 c33366b4, String str, String str2, AbstractC34235f abstractC34235f, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f1438y = c33366b4;
        this.f1439z = str;
        this.f1434E = str2;
        this.f1435F = abstractC34235f;
    }
}
