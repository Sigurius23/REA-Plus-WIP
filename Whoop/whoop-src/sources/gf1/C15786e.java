package gf1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import h51.AbstractC16932d;
import h90.AbstractC17024b;
import hb1.AbstractC17090m;
import he1.AbstractC17212a;
import hy0.C17749h0;
import i31.AbstractC18048c;
import ie1.C18443a;
import ig0.C18462b;
import ih1.C18519c;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationState;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.User;
import iw0.AbstractC20992x;
import java.util.List;
import jr1.AbstractC21896d;
import l01.AbstractC23035g;
import l01.AbstractC23041m;
import l21.AbstractC23238b;
import lf0.AbstractC23951o0;
import lh2.C24070a;
import m71.AbstractC25199b;
import n01.AbstractC26087d;
import n31.AbstractC26217b;
import nh0.AbstractC26718b;
import no0.AbstractC26979w;
import no0.C26968q0;
import ny0.C27256h;
import p040c0.InterfaceC3747i0;
import p291l0.C23000t1;
import p291l0.InterfaceC22997s1;
import p710im1.C18670g;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import p736sz0.C33210q;

/* JADX INFO: renamed from: gf1.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15786e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59490w;

    public /* synthetic */ C15786e(int i13) {
        this.f59490w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f59490w) {
            case 0:
                return AbstractC15788g.m44495A((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC16932d.m47650n((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC16932d.m47658v((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return AbstractC17024b.m48016H((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC17090m.m48249x((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return AbstractC17212a.m48614C((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AbstractC18048c.m51831k((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return C18443a.m53141e((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return C18462b.m53205d((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return C18519c.m53637d((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return C18670g.m54200c((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return ChannelStateImpl.pendingMessagesInRange$lambda$3(((Boolean) obj).booleanValue(), (List) obj2, (MessagesPaginationState) obj3);
            case 12:
                return ChannelStateImpl.messages$lambda$6((List) obj, (List) obj2, (List) obj3);
            case 13:
                return ChannelStateLegacyImpl.lastSentMessageDate$lambda$39((User) obj, (Config) obj2, (List) obj3);
            case 14:
                return AbstractC20992x.m58345D1((C33210q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return AbstractC21896d.m62177E((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return AbstractC21896d.m62179G((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23035g.m66826l((C27256h) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23041m.m66850M(C23000t1.f90727a, (C27256h) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23041m.m66852O(C23000t1.f90727a, (C27256h) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return AbstractC23041m.m66856S((C27256h) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return AbstractC23238b.m67278h((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23951o0.m70555j((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C24070a.m70989e((InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 24:
                return AbstractC25199b.m73787j((C17749h0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 25:
                return AbstractC26087d.m77590g((String) obj, ((Boolean) obj2).booleanValue(), (List) obj3);
            case 26:
                return AbstractC26217b.m77852u((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 27:
                return AbstractC26718b.m79439n((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return AbstractC26979w.m80856X((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return C26968q0.m80770c((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
