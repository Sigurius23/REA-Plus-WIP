package pm2;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.p069ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment;
import p715kotlin.jvm.functions.Function1;
import td1.EnumC33707e;

/* JADX INFO: renamed from: pm2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29360a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119035w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f119036x;

    public /* synthetic */ C29360a(Object obj, int i13) {
        this.f119035w = i13;
        this.f119036x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119035w) {
            case 0:
                return AdvancedStrapFragment.m26874F0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 1:
                return AdvancedStrapFragment.m26894P0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 2:
                return AdvancedStrapFragment.m26928o0((AdvancedStrapFragment) this.f119036x, (WhoopStrapInfo) obj);
            case 3:
                return AdvancedStrapFragment.m26933t0((AdvancedStrapFragment) this.f119036x, (String) obj);
            case 4:
                return AdvancedStrapFragment.m26934u0((AdvancedStrapFragment) this.f119036x, ((Boolean) obj).booleanValue());
            case 5:
                return AdvancedStrapFragment.m26935v0((AdvancedStrapFragment) this.f119036x, ((Boolean) obj).booleanValue());
            case 6:
                return AdvancedStrapFragment.m26936w0((AdvancedStrapFragment) this.f119036x, (EnumC29366g) obj);
            case 7:
                return AdvancedStrapFragment.m26878H0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 8:
                return AdvancedStrapFragment.m26939z0((AdvancedStrapFragment) this.f119036x, ((Boolean) obj).booleanValue());
            case 9:
                return AdvancedStrapFragment.m26867A0((AdvancedStrapFragment) this.f119036x, ((Boolean) obj).booleanValue());
            case 10:
                return AdvancedStrapFragment.m26869C0((AdvancedStrapFragment) this.f119036x, (String) obj);
            case 11:
                return AdvancedStrapFragment.m26876G0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 12:
                return AdvancedStrapFragment.m26880I0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 13:
                return AdvancedStrapFragment.m26882J0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 14:
                return AdvancedStrapFragment.m26884K0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 15:
                return AdvancedStrapFragment.m26886L0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case 16:
                return AdvancedStrapFragment.m26888M0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AdvancedStrapFragment.m26890N0((AdvancedStrapFragment) this.f119036x, (View) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AdvancedStrapFragment.m26892O0((AdvancedStrapFragment) this.f119036x, (View) obj);
            default:
                return C29363d.k.m89528i((C29363d) this.f119036x, (EnumC33707e) obj);
        }
    }
}
