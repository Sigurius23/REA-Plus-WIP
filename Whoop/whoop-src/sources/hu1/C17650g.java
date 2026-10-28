package hu1;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.access.programgoaltile.models.ProgramGoalTileModel;
import com.whoop.activation.domain.models.steps.BillingFrequencyStepModel;
import com.whoop.activation.domain.models.steps.DeidentifiedStepModel;
import com.whoop.activation.domain.models.steps.DeviceEducationStepModel;
import com.whoop.activation.domain.models.steps.GenderStepModel;
import com.whoop.activation.domain.models.steps.JoinTeamStepModel;
import com.whoop.activation.domain.models.steps.PrivacyConsentModel;
import hw0.C17697b;
import hy0.AbstractC17741f0;
import hy0.AbstractC17746g1;
import hy0.AbstractC17770n;
import hy0.AbstractC17795v0;
import hy0.AbstractC17803y;
import i01.AbstractC17843f;
import i11.AbstractC17862e;
import i21.AbstractC17993c;
import i21.AbstractC17999i;
import i21.AbstractC18004n;
import i21.AbstractC18009s;
import i21.AbstractC18010t;
import i21.C17991a;
import i31.AbstractC18048c;
import i51.AbstractC18114k;
import i60.AbstractC18151a;
import i80.AbstractC18211b;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao_Impl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jb1.C21536b;
import l40.C23328a;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p208i2.InterfaceC17886g0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hu1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C17650g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68428w;

    public /* synthetic */ C17650g(int i13) {
        this.f68428w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f68428w) {
            case 0:
                return C17651h.m50288k((InterfaceC33687a) obj);
            case 1:
                return C17697b.m50583b((C21536b) obj);
            case 2:
                return AbstractC17770n.m50978F(((Float) obj).floatValue());
            case 3:
                return AbstractC17803y.m51165j(obj);
            case 4:
                return AbstractC17741f0.m50858t((Modifier) obj);
            case 5:
                return AbstractC17741f0.m50860v((Modifier) obj);
            case 6:
                return AbstractC17795v0.m51128k(((Boolean) obj).booleanValue());
            case 7:
                return AbstractC17746g1.m50879o((InterfaceC17886g0) obj);
            case 8:
                return AbstractC17746g1.m50880p((InterfaceC17886g0) obj);
            case 9:
                return AbstractC17843f.m51286m(obj);
            case 10:
                return AbstractC17862e.m51355n(((Float) obj).floatValue());
            case 11:
                AttachmentDao_Impl.deleteAll$lambda$1("DELETE FROM attachment_inner_entity", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 12:
                List entries = (List) obj;
                AbstractC22676k.m65750j(entries, "entries");
                return AbstractC25247g0.m74000i0(entries);
            case 13:
                Map entries2 = (Map) obj;
                AbstractC22676k.m65750j(entries2, "entries");
                if (entries2.isEmpty()) {
                    return entries2;
                }
                Iterator it = entries2.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((C23328a) ((Map.Entry) it.next()).getValue()).f92492b) {
                        return null;
                    }
                }
                return entries2;
            case 14:
                List textFieldControllerIds = (List) obj;
                AbstractC22676k.m65750j(textFieldControllerIds, "textFieldControllerIds");
                return (IdentifierSpec) AbstractC25265s.m74114R0(textFieldControllerIds);
            case 15:
                return AbstractC17993c.m51604h((UUID) obj);
            case 16:
                return AbstractC17999i.m51633j((C17991a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18004n.m51675k((UUID) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18009s.m51699h(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18009s.m51701j(obj);
            case 20:
                return AbstractC18010t.m51711g(obj);
            case 21:
                return AbstractC18048c.m51829i(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18114k.m52000l((Modifier) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18151a.m52111x((ProgramGoalTileModel) obj);
            case 24:
                return AbstractC18211b.m52292Q((BillingFrequencyStepModel) obj);
            case 25:
                return AbstractC18211b.m52293R((GenderStepModel) obj);
            case 26:
                return AbstractC18211b.m52294S((PrivacyConsentModel) obj);
            case 27:
                return AbstractC18211b.m52295T((DeidentifiedStepModel) obj);
            case 28:
                return AbstractC18211b.m52285J((DeviceEducationStepModel) obj);
            default:
                return AbstractC18211b.m52297V((JoinTeamStepModel) obj);
        }
    }
}
