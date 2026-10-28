package o72;

import a72.AbstractC0524a;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.models.items.avatarpill.AvatarPillModel;
import com.whoop.design.models.items.ratingpicker.RatingPickerModel;
import com.whoop.gifting.feature.gifting.domain.models.QuantitySelectorModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyDisclaimer;
import f72.AbstractC14227b;
import jb1.C21536b;
import m72.AbstractC25206e;
import ne3.C26611e0;
import o02.C27354e;
import ob1.AbstractC27790a;
import oc1.AbstractC27817a;
import oe3.C27887g;
import oe3.C27889i;
import oh1.AbstractC27937b;
import ok2.AbstractC28001g;
import oo2.C28068c;
import op1.AbstractC28099d;
import op1.C28097b;
import op2.AbstractC28101b;
import oq1.AbstractC28118b;
import oq1.AbstractC28120d;
import oq2.AbstractC28126d;
import ot2.AbstractC28336e;
import ot2.C28341j;
import ot2.C28342k;
import ov2.AbstractC28400d;
import p134f2.C14015d;
import p249jc.C21565a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: o72.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27644e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111232w;

    public /* synthetic */ C27644e(int i13) {
        this.f111232w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111232w) {
            case 0:
                return AbstractC27645f.m83479k((AbstractC25206e) obj);
            case 1:
                return AbstractC27645f.m83480l((AbstractC14227b) obj);
            case 2:
                return AbstractC27645f.m83481m((AbstractC0524a) obj);
            case 3:
                return AbstractC27647h.m83490A((AbstractC25206e) obj);
            case 4:
                return AbstractC27647h.m83506Q((AbstractC25206e) obj);
            case 5:
                return AbstractC27790a.m83882c((C23749z0) obj);
            case 6:
                return AbstractC27790a.m83883d((AvatarPillModel) obj);
            case 7:
                return AbstractC27817a.m83897d((C23749z0) obj);
            case 8:
                return AbstractC27817a.m83898e((RatingPickerModel) obj);
            case 9:
                C27889i entry = (C27889i) obj;
                AbstractC22676k.m65750j(entry, "entry");
                C26611e0 c26611e0 = C27887g.f112443F;
                return Boolean.valueOf(C21565a.m60596g(entry.f112448a));
            case 10:
                C27889i it = (C27889i) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.TRUE;
            case 11:
                return AbstractC27937b.m84296g((C21536b) obj);
            case 12:
                return AbstractC27937b.m84297h((C23749z0) obj);
            case 13:
                return AbstractC27937b.m84298i((QuantitySelectorModel) obj);
            case 14:
                return AbstractC27937b.m84299j((CountrySelectorModel) obj);
            case 15:
                return AbstractC28001g.m84461c((C25308q) obj);
            case 16:
                return C28068c.m84846c((C27354e) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C28097b.m84889i((PregnancyDisclaimer) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC28099d.m84913m((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC28101b.m84937c((C21536b) obj);
            case 20:
                return AbstractC28118b.m85023b((C25308q) obj);
            case 21:
                return AbstractC28120d.m85055y(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC28120d.m85048r((C14015d) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC28120d.m85051u(obj);
            case 24:
                return AbstractC28126d.m85117z(obj);
            case 25:
                return AbstractC28336e.m85892c((C25308q) obj);
            case 26:
                return C28341j.m85926d((C21536b) obj);
            case 27:
                return C28342k.m85934d((C21536b) obj);
            case 28:
                return AbstractC28400d.m86108k(obj);
            default:
                return AbstractC28400d.m86113p(obj);
        }
    }
}
