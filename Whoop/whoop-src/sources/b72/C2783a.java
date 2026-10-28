package b72;

import androidx.health.platform.client.proto.C1533u;
import b81.AbstractC2797d;
import b90.AbstractC2881c;
import b90.AbstractC2884f;
import bf0.AbstractC3199k;
import bg0.AbstractC3225g;
import bg0.AbstractC3227i;
import bh0.C3248a;
import bj0.AbstractC3329b;
import bk1.C3352b;
import bm0.AbstractC3409l;
import bm0.AbstractC3415r;
import bm2.AbstractC3435e;
import bm2.AbstractC3436e0;
import bm2.AbstractC3487z0;
import bp0.AbstractC3531s;
import bq1.AbstractC3552d;
import bs0.C3577a;
import cm2.AbstractC4835w;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import h80.InterfaceC17002b;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import l83.C23472r;
import nl0.AbstractC26802d;
import p163g1.EnumC15207z1;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import p745y81.C39336i;
import ze0.InterfaceC40582a;
import zf0.InterfaceC40609a;

/* JADX INFO: renamed from: b72.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C2783a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10934w;

    public /* synthetic */ C2783a(int i13) {
        this.f10934w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10934w) {
            case 0:
                return AbstractC2784b.m7888A((C39336i) obj);
            case 1:
                return AbstractC2784b.m7890C((C39336i) obj);
            case 2:
                return AbstractC2784b.m7889B((C39336i) obj);
            case 3:
                return AbstractC2784b.m7891D((C39336i) obj);
            case 4:
                return AbstractC2797d.m7965f(obj);
            case 5:
                return AbstractC2881c.m8331f((InterfaceC17002b) obj);
            case 6:
                return AbstractC2884f.m8365m(obj);
            case 7:
                return AbstractC2884f.m8371s((InterfaceC18044z) obj);
            case 8:
                return AbstractC3199k.m9229u((InterfaceC22381a.c) obj);
            case 9:
                return AbstractC3199k.m9230v((InterfaceC40582a) obj);
            case 10:
                return AbstractC3199k.m9199B((InterfaceC22381a.c) obj);
            case 11:
                return AbstractC3199k.m9200C((InterfaceC40582a) obj);
            case 12:
                return C23472r.m68039a(((Byte) obj).byteValue());
            case 13:
                return AbstractC3225g.m9307s(obj);
            case 14:
                return AbstractC3225g.m9308t((C25308q) obj);
            case 15:
                return AbstractC3227i.m9325k((InterfaceC40609a) obj);
            case 16:
                return C3248a.m9391e((MarkdownTextWidget) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC3329b.m9628f(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C3352b.m9681j((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC3409l.m9809p((AbstractC26802d) obj);
            case 20:
                return AbstractC3415r.m9852w(obj);
            case 21:
                return AbstractC3415r.m9829F((InterfaceC22129c) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3415r.m9826C((InterfaceC22129c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3435e.m9914h(obj);
            case 24:
                return AbstractC3436e0.m9935G((AbstractC4835w) obj);
            case 25:
                return AbstractC3487z0.m10243Z(((Integer) obj).intValue());
            case 26:
                return AbstractC3487z0.m10231N((AbstractC4835w) obj);
            case 27:
                return AbstractC3531s.m10434N((EnumC15207z1) obj);
            case 28:
                return AbstractC3552d.m10604c((C25308q) obj);
            default:
                return C3577a.m10731b((C21536b) obj);
        }
    }
}
