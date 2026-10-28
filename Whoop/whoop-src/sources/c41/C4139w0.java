package c41;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.AiFeedbackType;
import cp0.AbstractC10969j0;
import cp0.C10949c1;
import cs0.C11097a;
import dd1.C11951e;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import p007a6.C0415d1;
import p249jc.C21567b;
import p702ch0.AbstractC4609c0;
import p702ch0.C4625h1;
import p702ch0.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import xf3.C38266c;
import xk0.C38423a;

/* JADX INFO: renamed from: c41.w0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4139w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16838w;

    public /* synthetic */ C4139w0(int i13) {
        this.f16838w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16838w) {
            case 0:
                return C4146x0.m12903f((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                C26611e0 path = (C26611e0) obj;
                AbstractC22676k.m65750j(path, "path");
                AbstractC22676k.m65750j((AbstractC26632p) obj2, "<unused var>");
                return new C0415d1(C21567b.m60606o(path.f105849w.m79265s(), true).f105849w.m79265s());
            case 2:
                return AbstractC4609c0.m14325v((String) obj, ((Float) obj2).floatValue());
            case 3:
                return AbstractC4609c0.m14286D((String) obj, ((Float) obj2).floatValue());
            case 4:
                return AbstractC4609c0.m14288F((String) obj, (AiFeedbackType) obj2);
            case 5:
                return Function1.m14411T((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case 6:
                return C4625h1.m14383c((Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC10969j0.m29121J((String) obj, ((Boolean) obj2).booleanValue());
            case 8:
                return AbstractC10969j0.m29123K((String) obj, ((Boolean) obj2).booleanValue());
            case 9:
                return C10949c1.m29040f((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return C10949c1.m29039e((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return C11097a.m29969p((C38266c) obj, (C34911a) obj2);
            case 12:
                return C11097a.m29970q((C38266c) obj, (C34911a) obj2);
            case 13:
                return C11097a.m29971r((C38266c) obj, (C34911a) obj2);
            case 14:
                return C11097a.m29972s((C38266c) obj, (C34911a) obj2);
            case 15:
                return C11097a.m29973t((C38266c) obj, (C34911a) obj2);
            case 16:
                return C11097a.m29974u((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C11097a.m29975v((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C11097a.m29977x((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C11097a.m29951A((C38266c) obj, (C34911a) obj2);
            case 20:
                return C11097a.m29952B((C38266c) obj, (C34911a) obj2);
            case 21:
                return C11951e.m32321U1((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C11951e.m32391s1((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C11951e.m32349f2((Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return C11951e.m32352g2((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C11951e.m32305M1((Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return C11951e.m32346e2((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return C11951e.m32371l2((Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return C11951e.m32291F1((Composer) obj, ((Integer) obj2).intValue());
            default:
                return C11951e.m32393t1((Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
