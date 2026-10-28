package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC22997s1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import zq0.AbstractC40960c0;
import zq0.AbstractC40972m;

/* JADX INFO: renamed from: zc1.y0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40518y0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174436w;

    public /* synthetic */ C40518y0(int i13) {
        this.f174436w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f174436w) {
            case 0:
                return C40528z0.m131253k((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return C40528z0.m131251i((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return C40277b1.m129347l((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return C40277b1.m129350o((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return C40277b1.m129349n((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return C40277b1.m129348m((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return C40277b1.m129346k((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return C40299d1.m129496e((InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return C40310e1.m129621c(((Integer) obj).intValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return C40321f1.m129694q((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return C40321f1.m129696s((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return C40321f1.m129692o((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return C40321f1.m129695r((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return C40321f1.m129693p((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return C40321f1.m129698u((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return C40321f1.m129697t((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return C40343h1.m129849c((InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40972m.m133023j((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40960c0.m132918i((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue());
        }
    }
}
