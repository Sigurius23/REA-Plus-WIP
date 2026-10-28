package gj2;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC3008f2;
import c93.InterfaceC4351m;
import h82.C17015a;
import hc3.C17170c0;
import hf2.C17238b;
import q83.InterfaceC30061h;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: gj2.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15920a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60220w;

    public /* synthetic */ C15920a(int i13) {
        this.f60220w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f60220w) {
            case 0:
                return C15921b.m44902A((C38266c) obj, (C34911a) obj2);
            case 1:
                return C17015a.m47989g((C38266c) obj, (C34911a) obj2);
            case 2:
                return C17015a.m47990h((C38266c) obj, (C34911a) obj2);
            case 3:
                return C17015a.m47991i((C38266c) obj, (C34911a) obj2);
            case 4:
                return C17015a.m47992j((C38266c) obj, (C34911a) obj2);
            case 5:
                return C17015a.m47993k((C38266c) obj, (C34911a) obj2);
            case 6:
                InterfaceC30061h interfaceC30061h = (InterfaceC30061h) obj2;
                if (!(interfaceC30061h instanceof InterfaceC3008f2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC30061h : Integer.valueOf(iIntValue + 1);
            case 7:
                InterfaceC3008f2 interfaceC3008f2 = (InterfaceC3008f2) obj;
                InterfaceC30061h interfaceC30061h2 = (InterfaceC30061h) obj2;
                if (interfaceC3008f2 != null) {
                    return interfaceC3008f2;
                }
                if (interfaceC30061h2 instanceof InterfaceC3008f2) {
                    return (InterfaceC3008f2) interfaceC30061h2;
                }
                return null;
            case 8:
                C17170c0 c17170c0 = (C17170c0) obj;
                InterfaceC30061h interfaceC30061h3 = (InterfaceC30061h) obj2;
                if (interfaceC30061h3 instanceof InterfaceC3008f2) {
                    InterfaceC3008f2 interfaceC3008f3 = (InterfaceC3008f2) interfaceC30061h3;
                    Object objMo8734J = interfaceC3008f3.mo8734J(c17170c0.f65967a);
                    Object[] objArr = c17170c0.f65968b;
                    int i13 = c17170c0.f65970d;
                    objArr[i13] = objMo8734J;
                    InterfaceC3008f2[] interfaceC3008f2Arr = c17170c0.f65969c;
                    c17170c0.f65970d = i13 + 1;
                    interfaceC3008f2Arr[i13] = interfaceC3008f3;
                }
                return c17170c0;
            case 9:
                return C17238b.m48759K((C38266c) obj, (C34911a) obj2);
            case 10:
                return C17238b.m48772X((C38266c) obj, (C34911a) obj2);
            case 11:
                return C17238b.m48761M((C38266c) obj, (C34911a) obj2);
            case 12:
                return C17238b.m48774Z((C38266c) obj, (C34911a) obj2);
            case 13:
                return C17238b.m48776a0((C38266c) obj, (C34911a) obj2);
            case 14:
                return C17238b.m48778b0((C38266c) obj, (C34911a) obj2);
            case 15:
                return C17238b.m48780c0((C38266c) obj, (C34911a) obj2);
            case 16:
                return C17238b.m48782d0((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C17238b.m48784e0((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C17238b.m48786f0((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C17238b.m48788g0((C38266c) obj, (C34911a) obj2);
            case 20:
                return C17238b.m48763O((C38266c) obj, (C34911a) obj2);
            case 21:
                return C17238b.m48792i0((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C17238b.m48794j0((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C17238b.m48773Y((C38266c) obj, (C34911a) obj2);
            case 24:
                return C17238b.m48798l0((C38266c) obj, (C34911a) obj2);
            case 25:
                return C17238b.m48796k0((C38266c) obj, (C34911a) obj2);
            case 26:
                return C17238b.m48800m0((C38266c) obj, (C34911a) obj2);
            case 27:
                return C17238b.m48802n0((C38266c) obj, (C34911a) obj2);
            case 28:
                return C17238b.m48804o0((C38266c) obj, (C34911a) obj2);
            default:
                return C17238b.m48808q0((C38266c) obj, (C34911a) obj2);
        }
    }
}
