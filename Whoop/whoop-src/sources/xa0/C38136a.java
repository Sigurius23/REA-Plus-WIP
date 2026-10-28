package xa0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.CtaTileModel;
import gv1.InterfaceC16239m;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import o02.C27354e;
import oi2.AbstractC27950a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import si2.InterfaceC32548b;
import ti2.InterfaceC33858e;
import ua0.AbstractC34718a;
import uc0.AbstractC34758a;
import uh0.AbstractC34963a;
import va0.AbstractC35839a;
import vc0.AbstractC35874a;
import vh0.InterfaceC36040a;
import xb0.C38161a;
import xb3.InterfaceC38174i;
import xc0.AbstractC38186a;
import xd2.AbstractC38216l;
import xf1.AbstractC38262b;
import xh0.AbstractC38307c;
import xi0.AbstractC38319a;
import xi1.C38322b;
import xi2.AbstractC38326d;
import xi2.AbstractC38327e;
import xi2.AbstractC38328f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: xa0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38136a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163251w;

    public /* synthetic */ C38136a(int i13) {
        this.f163251w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f163251w) {
            case 0:
                return AbstractC38137b.m122143k((AbstractC34718a) obj);
            case 1:
                return AbstractC38137b.m122144l((AbstractC35839a) obj);
            case 2:
                return C38161a.m122234j((C21536b) obj);
            case 3:
                InterfaceC38174i it = (InterfaceC38174i) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.iterator();
            case 4:
                return obj;
            case 5:
                Iterable it3 = (Iterable) obj;
                AbstractC22676k.m65750j(it3, "it");
                return it3.iterator();
            case 6:
                return Boolean.valueOf(MessageListItem.MessageItem.class.isInstance(obj));
            case 7:
                return AbstractC38186a.m122309r((InterfaceC22381a.c) obj);
            case 8:
                return AbstractC38186a.m122310s((AbstractC35874a) obj);
            case 9:
                return AbstractC38186a.m122311t((AbstractC34758a) obj);
            case 10:
                return AbstractC38186a.m122303l((AbstractC35874a) obj);
            case 11:
                return AbstractC38186a.m122304m((AbstractC34758a) obj);
            case 12:
                return AbstractC38216l.m122482e((C21536b) obj);
            case 13:
                return AbstractC38216l.m122483f((C23749z0) obj);
            case 14:
                return AbstractC38216l.m122484g((CtaTileModel) obj);
            case 15:
                String v13 = (String) obj;
                AbstractC22676k.m65750j(v13, "v");
                return AbstractC39414r.m125869O0(v13).toString();
            case 16:
                return AbstractC38262b.m122599c((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC38307c.m122726s((InterfaceC36040a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC38307c.m122727t((AbstractC34963a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC38319a.m122793g(((Integer) obj).intValue());
            case 20:
                return C38322b.m122811b((C27354e) obj);
            case 21:
                return AbstractC38326d.m122837d(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC38327e.m122848i((InterfaceC33858e) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC38327e.m122849j((InterfaceC32548b) obj);
            case 24:
                return AbstractC38327e.m122850k((AbstractC27950a) obj);
            case 25:
                return AbstractC38327e.m122851l((InterfaceC16239m) obj);
            case 26:
                return AbstractC38328f.m122883u((InterfaceC33858e) obj);
            case 27:
                return AbstractC38328f.m122884v((InterfaceC32548b) obj);
            case 28:
                return AbstractC38328f.m122885w((AbstractC27950a) obj);
            default:
                return AbstractC38328f.m122886x((InterfaceC16239m) obj);
        }
    }
}
