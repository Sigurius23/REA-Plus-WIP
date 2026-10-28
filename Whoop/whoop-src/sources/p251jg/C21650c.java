package p251jg;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.healthspan.domain.models.HealthspanVowModel;
import hp1.AbstractC17546f;
import java.util.List;
import jb1.C21536b;
import jh0.AbstractC21694b;
import ji0.C21715c;
import jk1.AbstractC21757b;
import jk2.AbstractC21762c;
import jm1.AbstractC21792c;
import jm2.AbstractC21795b;
import jp1.AbstractC21849a;
import jp1.AbstractC21854f;
import jp1.AbstractC21855g;
import jp1.AbstractC21856h;
import jp1.AbstractC21861m;
import jp1.AbstractC21863o;
import jp1.AbstractC21866r;
import jp1.AbstractC21869u;
import jp2.AbstractC21873d;
import l83.C23454a0;
import m83.AbstractC25265s;
import p095dp.AbstractC12240d;
import p134f2.C14015d;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p500tb.InterfaceC33687a;
import p713jm0.AbstractC21789d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: jg.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C21650c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83162w;

    public /* synthetic */ C21650c(int i13) {
        this.f83162w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f83162w) {
            case 0:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                return "`" + it + '`';
            case 1:
                List it3 = (List) obj;
                AbstractC22676k.m65750j(it3, "it");
                AbstractC12240d.m34055U(it3, EnumC21664q.f83178E);
                return C23454a0.f92919a;
            case 2:
                List it4 = (List) obj;
                AbstractC22676k.m65750j(it4, "it");
                AbstractC25265s.m74134l1(it4);
                return C23454a0.f92919a;
            case 3:
                List it5 = (List) obj;
                AbstractC22676k.m65750j(it5, "it");
                AbstractC25265s.m74134l1(it5);
                return C23454a0.f92919a;
            case 4:
                List it6 = (List) obj;
                AbstractC22676k.m65750j(it6, "it");
                AbstractC12240d.m34055U(it6, EnumC21664q.f83179F);
                return C23454a0.f92919a;
            case 5:
                return AbstractC21694b.m61095f((InterfaceC17886g0) obj);
            case 6:
                return AbstractC21694b.m61096g((C14015d) obj);
            case 7:
                return AbstractC21694b.m61097h((InterfaceC22129c) obj);
            case 8:
                return C21715c.m61169g((InterfaceC33687a) obj);
            case 9:
                return AbstractC21757b.m61408p((C21536b) obj);
            case 10:
                return AbstractC21757b.m61409q((C23749z0) obj);
            case 11:
                return AbstractC21757b.m61404l((HealthspanVowModel) obj);
            case 12:
                return AbstractC21762c.m61469r(((Float) obj).floatValue());
            case 13:
                return AbstractC21789d.m61640s((Modifier) obj);
            case 14:
                return AbstractC21789d.m61647z((InterfaceC22131e) obj);
            case 15:
                return AbstractC21792c.m61657g(obj);
            case 16:
                return AbstractC21795b.m61676c((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC21849a.m61837e((AbstractC17546f) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC21854f.m61850k(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC21855g.m61876o(obj);
            case 20:
                return AbstractC21856h.m61900i((AbstractC17546f) obj);
            case 21:
                return AbstractC21856h.m61905n(((Integer) obj).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC21861m.m61919k((AbstractC39672a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC21861m.m61920l((AbstractC17546f) obj);
            case 24:
                return AbstractC21863o.m61937j((AbstractC39672a) obj);
            case 25:
                return AbstractC21863o.m61938k((AbstractC17546f) obj);
            case 26:
                return AbstractC21866r.m61962i((AbstractC17546f) obj);
            case 27:
                return AbstractC21869u.m61985o((AbstractC17546f) obj);
            case 28:
                return AbstractC21873d.m62018h(obj);
            default:
                return AbstractC21873d.m62023m((String) obj);
        }
    }
}
