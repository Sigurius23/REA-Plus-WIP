package ih0;

import ah0.C0882c;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC3027k1;
import gh1.InterfaceC15852b;
import ih1.AbstractC18524h;
import ih1.AbstractC18525i;
import ih2.AbstractC18527b;
import ij0.C18595a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.models.SearchMessagesResult;
import java.util.List;
import java.util.Set;
import kb1.C22325e;
import p040c0.InterfaceC3770q;
import p209i3.InterfaceC18044z;
import p710im1.AbstractC18668f;
import p710im1.AbstractC18672h;
import p710im1.AbstractC18697t0;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import ul1.EnumC35066c;
import xs0.C38637a;

/* JADX INFO: renamed from: ih0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18510t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72127w;

    public /* synthetic */ C18510t(int i13) {
        this.f72127w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72127w) {
            case 0:
                return AbstractC18491e0.m53471c1(obj);
            case 1:
                return AbstractC18491e0.m53497l0((Set) obj);
            case 2:
                return AbstractC18491e0.m53498l1((C18488d) obj);
            case 3:
                return AbstractC18491e0.m53504n1((Set) obj);
            case 4:
                return AbstractC18491e0.m53513q1(obj);
            case 5:
                return AbstractC18491e0.m53432P0((InterfaceC18044z) obj);
            case 6:
                return AbstractC18491e0.m53438R0((InterfaceC18044z) obj);
            case 7:
                return AbstractC18491e0.m53515r0((InterfaceC3770q) obj);
            case 8:
                return AbstractC18491e0.m53530w0((C0882c) obj);
            case 9:
                return AbstractC18524h.m53682w(obj);
            case 10:
                return AbstractC18524h.m53683x((C25308q) obj);
            case 11:
                return AbstractC18525i.m53696k((InterfaceC15852b) obj);
            case 12:
                return AbstractC18527b.m53708I(((Boolean) obj).booleanValue());
            case 13:
                return Boolean.valueOf(C18595a.m53810f((C38637a) obj));
            case 14:
                return AbstractC18668f.m54183g(((Integer) obj).intValue());
            case 15:
                return AbstractC18668f.m54184h((C22325e) obj);
            case 16:
                return AbstractC18672h.m54208g(((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18697t0.m54363r0((EnumC35066c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18697t0.m54366s0((EnumC35066c) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ChatClient.getMessagesWithAttachments$lambda$72((SearchMessagesResult) obj);
            case 20:
                return ChatClient.m54524g((InterfaceC3027k1) obj);
            case 21:
                return ChatClient.queryChannels$lambda$109((QueryChannelsResult) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ChatClient.updateUser$lambda$115((List) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((QueryChannelsResult) obj).getChannels();
            case 24:
                return ChatClientExtensions.m54558f((InterfaceC3027k1) obj);
            case 25:
                return ChatClientExtensions.m54555c((InterfaceC3027k1) obj);
            case 26:
                return ChatClientExtensions.m54557e((InterfaceC3027k1) obj);
            case 27:
                return ChatClientExtensions.m54553a((InterfaceC3027k1) obj);
            case 28:
                return ChatClientExtensions.m54561i((InterfaceC3027k1) obj);
            default:
                return ChatClientExtensions.m54560h((InterfaceC3027k1) obj);
        }
    }
}
