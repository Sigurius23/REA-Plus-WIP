package p000;

import a01.AbstractC0087g;
import a41.AbstractC0376l;
import a61.AbstractC0470c;
import a80.AbstractC0548l;
import a80.AbstractC0549m;
import a81.AbstractC0568s;
import a90.AbstractC0585b;
import aa2.C0597f;
import ad3.C0764g;
import ag0.AbstractC0858b;
import am0.AbstractC1000d;
import am2.AbstractC1026k;
import am2.AbstractC1035o0;
import am2.AbstractC1046w;
import an2.AbstractC1058a;
import androidx.health.platform.client.proto.C1533u;
import aq0.C1906q;
import cm2.C4823k;
import cm2.C4828p;
import com.whoop.p069ui.login.ImportantAppInfo;
import com.whoop.p069ui.login.MissingImportantAppInfoException;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import com.whoop.util.TrendKey;
import h80.InterfaceC17002b;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoViewState;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelAttachmentsViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelAttachmentsViewModelFactory;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelInfoViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelInfoViewModelFactory;
import iq0.C20839r;
import jb1.C21536b;
import l83.C23454a0;
import p270k2.InterfaceC22131e;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import y70.InterfaceC39265a;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28503p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115388w;

    public /* synthetic */ C28503p(int i13) {
        this.f115388w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f115388w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                return C23454a0.f92919a;
            case 1:
                return AbstractC0087g.m221h(it);
            case 2:
                ChannelAttachmentsViewModel._init_$lambda$0((Attachment) it);
                return Boolean.TRUE;
            case 3:
                ChannelAttachmentsViewModelFactory._init_$lambda$0((Attachment) it);
                return Boolean.TRUE;
            case 4:
                ChannelInfoViewModel._init_$lambda$0((ChannelInfoViewState.Content.Option) it);
                return Boolean.TRUE;
            case 5:
                ChannelInfoViewModelFactory._init_$lambda$0((ChannelInfoViewState.Content.Option) it);
                return Boolean.TRUE;
            case 6:
                return AbstractC0376l.m1027t(it);
            case 7:
                return AbstractC0470c.m1138i(it);
            case 8:
                return AbstractC0470c.m1142m(it);
            case 9:
                return AbstractC0548l.m1357s(it);
            case 10:
                return AbstractC0549m.m1369k((InterfaceC39265a) it);
            case 11:
                return AbstractC0568s.m1466c((C21536b) it);
            case 12:
                return AbstractC0585b.m1517f((InterfaceC17002b) it);
            case 13:
                return C0597f.m1577v((InterfaceC33687a) it);
            case 14:
                return C0597f.m1576u((InterfaceC33687a) it);
            case 15:
                return AbstractC0858b.m2073c((C21536b) it);
            case 16:
                return AbstractC1000d.m2695m((InterfaceC22131e) it);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC1026k.m2741O((C4828p) it);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC1046w.m3007S((C4823k) it);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC1035o0.m2822G0(it);
            case 20:
                return AbstractC1035o0.m2904o0((TrendKey) it);
            case 21:
                return AbstractC1035o0.m2824H0(it);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC1035o0.m2910q0(it);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC1035o0.m2912r0(it);
            case 24:
                return AbstractC1035o0.m2908p1((C25308q) it);
            case 25:
                return AbstractC1035o0.m2836N0(it);
            case 26:
                return MissingImportantAppInfoException.m27333c((ImportantAppInfo) it);
            case 27:
                return AbstractC1058a.m3133c((ImportantAppInfo) it);
            case 28:
                return CartAddIntent.Companion.m27606e((C0764g) it);
            default:
                return Boolean.valueOf(C1906q.m5674A1((C20839r) it));
        }
    }
}
