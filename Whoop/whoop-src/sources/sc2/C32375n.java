package sc2;

import android.net.Uri;
import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.p069ui.teams.LeaderActivityDto;
import com.whoop.settings.strap.StrapSettingsFragment;
import ii0.AbstractC18565u;
import jb1.C21536b;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import nl0.C26812n;
import oh0.C27935c;
import p134f2.C14015d;
import p164g2.InterfaceC15250v;
import p270k2.InterfaceC22129c;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import p734sl0.AbstractC32583a3;
import p734sl0.AbstractC32591c1;
import p734sl0.AbstractC32597d2;
import p734sl0.AbstractC32611g1;
import p734sl0.AbstractC32619i;
import p734sl0.AbstractC32624j;
import p734sl0.AbstractC32626j1;
import p734sl0.AbstractC32637l2;
import p734sl0.AbstractC32640m0;
import p734sl0.AbstractC32650o0;
import p734sl0.AbstractC32656p1;
import p734sl0.AbstractC32679u0;
import p734sl0.AbstractC32680u1;
import p734sl0.AbstractC32681u2;
import sg2.AbstractC32471v;
import si0.AbstractC32540f;

/* JADX INFO: renamed from: sc2.n */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32375n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133991w;

    public /* synthetic */ C32375n(int i13) {
        this.f133991w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f133991w) {
            case 0:
                return StrapSettingsFragment.m25772c0((AbstractC18565u) obj);
            case 1:
                return StrapSettingsFragment.m25779j0((View) obj);
            case 2:
                return LeadersEntry.toTeamUserListing$lambda$0((LeaderActivityDto) obj);
            case 3:
                return AbstractC32471v.m101452t(obj);
            case 4:
                return AbstractC32471v.m101424I((String) obj);
            case 5:
                return AbstractC32471v.m101426K(((Boolean) obj).booleanValue());
            case 6:
                return AbstractC32540f.m101562c((C21536b) obj);
            case 7:
                return AbstractC32619i.m101822N((Uri) obj);
            case 8:
                return AbstractC32619i.m101824P((InterfaceC15250v) obj);
            case 9:
                return AbstractC32619i.m101854z((InterfaceC39171c) obj);
            case 10:
                return AbstractC32619i.m101810B((InterfaceC39171c) obj);
            case 11:
                return AbstractC32624j.m101887d((C27935c) obj);
            case 12:
                return AbstractC32640m0.m102009b((C25308q) obj);
            case 13:
                return AbstractC32650o0.m102080r((AbstractC26802d) obj);
            case 14:
                return AbstractC32650o0.m102081s((AbstractC25669a) obj);
            case 15:
                return AbstractC32679u0.m102397r0((AbstractC25669a) obj);
            case 16:
                return AbstractC32679u0.m102358W((AbstractC25669a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32591c1.m101661p((InterfaceC22129c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC32611g1.m101758o((AbstractC26802d) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC32611g1.m101759p((AbstractC25669a) obj);
            case 20:
                return AbstractC32626j1.m101897g((String) obj);
            case 21:
                return AbstractC32626j1.m101899i((C14015d) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC32626j1.m101900j((InterfaceC22129c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC32656p1.m102153y((AbstractC26802d) obj);
            case 24:
                return AbstractC32656p1.m102150v((C26812n) obj);
            case 25:
                return AbstractC32680u1.m102426e((AbstractC26802d) obj);
            case 26:
                return AbstractC32597d2.m101686O((Uri) obj);
            case 27:
                return AbstractC32637l2.m101984v(((Boolean) obj).booleanValue());
            case 28:
                return AbstractC32681u2.m102462O((Modifier) obj);
            default:
                return AbstractC32583a3.m101641e((AbstractC26802d) obj);
        }
    }
}
