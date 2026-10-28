package p710im1;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import b11.C2281h;
import com.whoop.journalhometile.domain.model.JournalHomeTileModel;
import com.whoop.navigation.AiAction;
import com.whoop.startactivity.dropdown.DropdownModel;
import em1.AbstractC13341o;
import em1.InterfaceC13346t;
import fm1.EnumC14603g;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.client.utils.observable.ChatEventsObservable;
import io.getstream.chat.android.models.PushMessage;
import is1.AbstractC20922a;
import j02.C21132b0;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jg2.AbstractC21672d;
import kd1.EnumC22400l;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p239j1.AbstractC21189g;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import ul1.EnumC35066c;

/* JADX INFO: renamed from: im1.p0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18689p0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73347w;

    public /* synthetic */ C18689p0(int i13) {
        this.f73347w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73347w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC18697t0.m54340j1(((Integer) obj).intValue());
            case 1:
                return AbstractC18697t0.m54346l1((C2281h) obj);
            case 2:
                return AbstractC18697t0.m54349m1((EnumC22400l) obj);
            case 3:
                return AbstractC18697t0.m54352n1(((Boolean) obj).booleanValue());
            case 4:
                return AbstractC18697t0.m54266D0((AbstractC13341o) obj);
            case 5:
                return AbstractC18697t0.m54345l0((EnumC35066c) obj);
            case 6:
                return AbstractC18697t0.m54348m0((EnumC35066c) obj);
            case 7:
                return AbstractC18697t0.m54268E0((EnumC35066c) obj);
            case 8:
                return AbstractC18697t0.m54270F0((EnumC35066c) obj);
            case 9:
                return AbstractC18697t0.m54272G0((InterfaceC13346t) obj);
            case 10:
                return AbstractC18697t0.m54274H0((EnumC14603g) obj);
            case 11:
                return AbstractC18697t0.m54276I0((String) obj);
            case 12:
                return AbstractC18697t0.m54278J0((String) obj);
            case 13:
                return Boolean.valueOf(NotificationConfig._init_$lambda$0((String) obj));
            case 14:
                NotificationHandlerFactory.createNotificationHandler$lambda$1((PushMessage) obj);
                return Boolean.FALSE;
            case 15:
                ChatEventsObservable.subscribeSuspend$lambda$1((ChatEvent) obj);
                return Boolean.TRUE;
            case 16:
                return AbstractC20922a.m58041e((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC20922a.m58042f((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC20922a.m58043g((JournalHomeTileModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AiAction.json$lambda$0((C0764g) obj);
            case 20:
                return C21132b0.m58966b((C0764g) obj);
            case 21:
                float f13 = AbstractC21189g.f80739a;
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                C0237p c0237pMo744t0 = c0238p0.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2346d(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c0238p0.m728a();
                    return c23454a0;
                } finally {
                    AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                }
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C21535a.m60534d((InterfaceC25312u) obj);
            case 24:
                return AbstractC21537c.m60556f((C21536b) obj);
            case 25:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                return it;
            case 26:
                return AbstractC21672d.m60957e((C21536b) obj);
            case 27:
                return AbstractC21672d.m60960h((C25308q) obj);
            case 28:
                return AbstractC21672d.m60958f((C23749z0) obj);
            default:
                return AbstractC21672d.m60959g((DropdownModel) obj);
        }
    }
}
