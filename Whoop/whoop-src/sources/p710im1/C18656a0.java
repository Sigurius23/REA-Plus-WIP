package p710im1;

import a13.C0150h;
import android.net.ConnectivityManager;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.iterable.iterableapi.C5368r1;
import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.home.view.HomeFragment;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.trackactivity.domain.SessionTargetsFetcher;
import cp1.EnumC11017d;
import eq2.C13564b;
import hp1.C17544d;
import hp1.C17545e;
import i93.C18279e;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.GetThreadOptions;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.notifications.ChatPushDelegate;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.feature.threads.ThreadListController;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.PollViewHolder;
import io2.AbstractC20773m0;
import io2.C20777o0;
import is0.AbstractC20889j0;
import is0.AbstractC20917x0;
import is0.InterfaceC20880f;
import it1.InterfaceC20929c;
import j72.AbstractC21405j;
import j72.C21408m;
import java.util.Map;
import jg2.AbstractC21671c;
import ji2.C21727f;
import jp1.AbstractC21855g;
import jp1.AbstractC21856h;
import jp1.AbstractC21861m;
import jt1.AbstractC21938c;
import kd0.C22383c;
import kf0.AbstractC22431f;
import kk1.AbstractC22546g;
import l72.AbstractC23408o;
import l72.AbstractC23409p;
import l83.C23454a0;
import ld0.C23858q;
import lf0.AbstractC23952o1;
import lw1.AbstractC24768d;
import lw1.AbstractC24770f;
import lw1.C24775k;
import m80.AbstractC25222d;
import mc.AbstractC25412i;
import mi2.AbstractC25586i;
import ny0.C27256h;
import p132f0.C13821r1;
import p218ic.C18389w;
import p292l1.C23123k2;
import p292l1.C23196w3;
import p292l1.C23203x4;
import p292l1.EnumC23202x3;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import p717lq2.AbstractC24686r;
import p720m91.C25314w;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: im1.a0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18656a0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73197w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73198x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73199y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f73200z;

    public /* synthetic */ C18656a0(int i13, Object obj, Object obj2, String str) {
        this.f73197w = i13;
        this.f73198x = str;
        this.f73199y = obj;
        this.f73200z = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f73197w;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f73200z;
        Object obj2 = this.f73199y;
        Object obj3 = this.f73198x;
        switch (i13) {
            case 0:
                return HomeFragment.m21874y1((HomeFragment) obj2, (String) obj3, (AppScreen) obj);
            case 1:
                return Integer.valueOf(ChatClient.sendMessage$lambda$90((String) obj3, (String) obj2, (Message) obj));
            case 2:
                return MoshiChatApi.m54602h((MoshiChatApi) obj2, (String) obj3, (String) obj);
            case 3:
                return MoshiChatApi.m54622r((MoshiChatApi) obj2, (String) obj3, (GetThreadOptions) obj);
            case 4:
                return ChatPushDelegate.handlePushMessage$lambda$1((ChatPushDelegate) obj2, (Map) obj3, (Map) obj);
            case 5:
                ThreadListController.Companion companion = ThreadListController.INSTANCE;
                return ChatClientExtensions.queryThreadsAsState((ChatClient) obj2, (QueryThreadsRequest) obj3, (InterfaceC2994c0) obj);
            case 6:
                PollViewHolder.bindData$lambda$8$lambda$4((PollViewHolder) obj2, (MessageListItem.MessageItem) obj3, (Poll) obj);
                return c23454a0;
            case 7:
                return AbstractC20773m0.m57202D((Function1) obj2, (C20777o0) obj3, (InterfaceC28601c1) obj);
            case 8:
                return AbstractC20889j0.m57782m0((C25314w) obj2, (InterfaceC4339a) obj3, (InterfaceC28593a1) obj);
            case 9:
                return AbstractC20917x0.m57988n((InterfaceC4339a) obj2, (Function1) obj3, (InterfaceC20880f) obj);
            case 10:
                return AbstractC21671c.m60951j((Function1) obj2, (GenericInteraction) obj3, (InterfaceC28601c1) obj);
            case 11:
                return AbstractC21855g.m61877p((C17544d) obj2, (EnumC11017d) obj3, (Function1) obj);
            case 12:
                return AbstractC21856h.m61906o((Function1) obj2, (C17545e) obj3, (InterfaceC28601c1) obj);
            case 13:
                return AbstractC21861m.m61925q((Function1) obj2, (InterfaceC28601c1) obj3, (Function1) obj);
            case 14:
                return AbstractC21938c.m62518v((InterfaceC20929c.b) obj2, (InterfaceC28601c1) obj3, (Function1) obj);
            case 15:
                return AbstractC22431f.m64629D((C13821r1) obj2, (Function1) obj3, (InterfaceC28601c1) obj);
            case 16:
                return AbstractC22431f.m64633H((C22383c.g) obj2, (Function1) obj3, (C27256h) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Float.valueOf(AbstractC22546g.m65191C0((C18279e) obj2, 0.001f, (C13821r1) obj3, (InterfaceC28601c1) obj));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj3;
                C23196w3 c23196w3 = (C23196w3) obj;
                if (((Boolean) ((C23196w3) obj2).f91787e.f97544d.invoke(EnumC23202x3.f91821x)).booleanValue()) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w3, interfaceC30057d, 6), 3);
                }
                return Boolean.TRUE;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23408o.m67842e0((Function1) obj2, (Function1) obj3, (AbstractC21405j) obj);
            case 20:
                return AbstractC23409p.m67901q((Function1) obj2, (C21408m) obj3, (C39967p) obj);
            case 21:
                return AbstractC23952o1.m70571o((C23858q) obj2, (InterfaceC28601c1) obj3, (InterfaceC28670t2) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC24686r.m72203Z((C13564b) obj2, (InterfaceC4339a) obj3, (InterfaceC28601c1) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC24768d.m72533h((Function1) obj2, (OrderOption) obj3, (InterfaceC28601c1) obj);
            case 24:
                return AbstractC24770f.m72567o((C24775k) obj2, (Function1) obj3, (InterfaceC28601c1) obj);
            case 25:
                C23203x4 c23203x4 = (C23203x4) obj2;
                InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) obj3;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj;
                if (c23203x4.m67160b()) {
                    AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C0150h(c23203x4, interfaceC30057d, 15), 3);
                    interfaceC28601c1.setValue(Boolean.FALSE);
                }
                return c23454a0;
            case 26:
                return AbstractC25222d.m73895t((EmailDialogInfo) obj2, (Function1) obj3, (InterfaceC28601c1) obj);
            case 27:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj3;
                C5368r1 c5368r1 = (C5368r1) obj;
                if (((C22659b0) obj2).f89329w) {
                    C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(c5368r1);
                }
                return c23454a0;
            case 28:
                return AbstractC25586i.m75254M((Function1) obj2, (C21727f) obj, (String) obj3);
            default:
                return SessionTargetsFetcher.m26505f((String) obj3, (SessionTargetsFetcher) obj2, (String) obj);
        }
    }

    public /* synthetic */ C18656a0(Object obj, Object obj2, Object obj3, int i13) {
        this.f73197w = i13;
        this.f73199y = obj;
        this.f73198x = obj2;
        this.f73200z = obj3;
    }

    public /* synthetic */ C18656a0(Function1 function1, C21727f c21727f, String str) {
        this.f73197w = 28;
        this.f73199y = function1;
        this.f73200z = c21727f;
        this.f73198x = str;
    }
}
