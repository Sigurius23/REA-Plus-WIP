package h32;

import android.content.Context;
import android.content.Intent;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import k71.AbstractC22243b0;
import kz.AbstractC22907d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.AbstractC40319f;
import p748zc1.AbstractC40344h2;
import p748zc1.AbstractC40346h4;
import p748zc1.AbstractC40374k;
import p748zc1.AbstractC40409n1;
import p748zc1.AbstractC40438q0;
import vy0.AbstractC36597y;
import y30.C39189d;

/* JADX INFO: renamed from: h32.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16829b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64642w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f64643x;

    public /* synthetic */ C16829b(Context context, int i13) {
        this.f64642w = i13;
        this.f64643x = context;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f64642w;
        Context context = this.f64643x;
        switch (i13) {
            case 0:
                return C16830c.m47428d(context, (String) obj);
            case 1:
                return AbstractC22243b0.m63781i(context, obj);
            case 2:
                return AbstractC22243b0.m63784l(context, obj);
            case 3:
                AbstractC22907d args = (AbstractC22907d) obj;
                AbstractC22676k.m65750j(args, "args");
                int i14 = FinancialConnectionsSheetLiteActivity.f22170z;
                AbstractC22676k.m65750j(context, "context");
                Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetLiteActivity.class);
                intent.addFlags(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
                intent.putExtra("FinancialConnectionsSheetActivityArgs", args);
                return intent;
            case 4:
                return C39189d.m124824c(context, (Context) obj);
            case 5:
                return AbstractC40319f.m129677g(context, obj);
            case 6:
                return AbstractC40319f.m129678h(context, obj);
            case 7:
                return AbstractC40319f.m129679i(context, obj);
            case 8:
                return AbstractC40319f.m129680j(context, obj);
            case 9:
                return AbstractC40374k.m130146i(context, obj);
            case 10:
                return AbstractC40374k.m130147j(context, obj);
            case 11:
                return AbstractC40438q0.m130652f(context, obj);
            case 12:
                return AbstractC40409n1.m130420l(context, obj);
            case 13:
                return AbstractC40409n1.m130421m(context, obj);
            case 14:
                return AbstractC40409n1.m130422n(context, obj);
            case 15:
                return AbstractC40409n1.m130423o(context, obj);
            case 16:
                return AbstractC40409n1.m130424p(context, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40409n1.m130425q(context, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40409n1.m130426r(context, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40409n1.m130427s(context, obj);
            case 20:
                return AbstractC40409n1.m130428t(context, obj);
            case 21:
                return AbstractC40344h2.m129859i(context, ((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40344h2.m129860j(context, ((Boolean) obj).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40344h2.m129862l(context, ((Boolean) obj).booleanValue());
            case 24:
                return AbstractC40344h2.m129864n(context, (AbstractC36597y) obj);
            case 25:
                return AbstractC40346h4.m129894h(context, obj);
            case 26:
                return AbstractC40346h4.m129895i(context, obj);
            case 27:
                return AbstractC40346h4.m129896j(context, obj);
            case 28:
                return AbstractC40346h4.m129897k(context, obj);
            default:
                return AbstractC40346h4.m129898l(context, obj);
        }
    }
}
