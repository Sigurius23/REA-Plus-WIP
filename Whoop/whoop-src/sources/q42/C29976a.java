package q42;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.profile.p067di.ProfileModule;
import q60.C29996a;
import q82.C30053a;
import qg1.C30347b;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: q42.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C29976a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122436w;

    public /* synthetic */ C29976a(int i13) {
        this.f122436w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38266c c38266c = (C38266c) obj;
        C34911a c34911a = (C34911a) obj2;
        switch (this.f122436w) {
            case 0:
                return ProfileModule.define$lambda$0$10(c38266c, c34911a);
            case 1:
                return ProfileModule.define$lambda$0$11(c38266c, c34911a);
            case 2:
                return ProfileModule.define$lambda$0$12(c38266c, c34911a);
            case 3:
                return ProfileModule.define$lambda$0$1(c38266c, c34911a);
            case 4:
                return ProfileModule.define$lambda$0$2(c38266c, c34911a);
            case 5:
                return ProfileModule.define$lambda$0$3(c38266c, c34911a);
            case 6:
                return ProfileModule.define$lambda$0$4(c38266c, c34911a);
            case 7:
                return ProfileModule.define$lambda$0$5(c38266c, c34911a);
            case 8:
                return C29996a.m91733F(c38266c, c34911a);
            case 9:
                return C29996a.m91765w(c38266c, c34911a);
            case 10:
                return C29996a.m91734G(c38266c, c34911a);
            case 11:
                return C29996a.m91735H(c38266c, c34911a);
            case 12:
                return C29996a.m91737J(c38266c, c34911a);
            case 13:
                return C29996a.m91738K(c38266c, c34911a);
            case 14:
                return C29996a.m91739L(c38266c, c34911a);
            case 15:
                return C29996a.m91740M(c38266c, c34911a);
            case 16:
                return C29996a.m91741N(c38266c, c34911a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C29996a.m91742O(c38266c, c34911a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C29996a.m91764v(c38266c, c34911a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C29996a.m91768z(c38266c, c34911a);
            case 20:
                return C29996a.m91728A(c38266c, c34911a);
            case 21:
                return C29996a.m91729B(c38266c, c34911a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C29996a.m91730C(c38266c, c34911a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C29996a.m91732E(c38266c, c34911a);
            case 24:
                return C30053a.m92078g(c38266c, c34911a);
            case 25:
                return C30053a.m92080i(c38266c, c34911a);
            case 26:
                return C30053a.m92081j(c38266c, c34911a);
            case 27:
                return C30053a.m92082k(c38266c, c34911a);
            case 28:
                return C30347b.m92777u(c38266c, c34911a);
            default:
                return C30347b.m92778v(c38266c, c34911a);
        }
    }
}
