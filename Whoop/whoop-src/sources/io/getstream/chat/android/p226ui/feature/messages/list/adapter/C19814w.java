package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.w */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19814w implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74723w;

    public /* synthetic */ C19814w(int i13) {
        this.f74723w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74723w) {
            case 0:
                MessageListListenersImpl.EmptyFunctions.ONE_PARAM$lambda$0(obj);
                return Boolean.FALSE;
            case 1:
                return MessageListListenersImpl.m55466v((InterfaceC4339a) obj);
            case 2:
                return MessageListListenersImpl.m55441J((InterfaceC4339a) obj);
            case 3:
                return MessageListListenersImpl.m55464t((InterfaceC4339a) obj);
            case 4:
                return MessageListListenersImpl.m55444M((InterfaceC4339a) obj);
            case 5:
                return MessageListListenersImpl.m55449e((InterfaceC4339a) obj);
            case 6:
                return MessageListListenersImpl.m55432A((InterfaceC4339a) obj);
            case 7:
                return MessageListListenersImpl.m55447c((InterfaceC4339a) obj);
            case 8:
                return MessageListListenersImpl.m55458n((InterfaceC4339a) obj);
            case 9:
                return MessageListListenersImpl.m55463s((InterfaceC4339a) obj);
            case 10:
                return MessageListListenersImpl.m55457m((InterfaceC4339a) obj);
            case 11:
                return MessageListListenersImpl.m55470z((InterfaceC4339a) obj);
            case 12:
                return MessageListListenersImpl.m55468x((InterfaceC4339a) obj);
            case 13:
                return MessageListListenersImpl.m55453i((InterfaceC4339a) obj);
            case 14:
                return MessageListListenersImpl.m55437F((InterfaceC4339a) obj);
            case 15:
                return MessageListListenersImpl.m55448d((InterfaceC4339a) obj);
            case 16:
                return MessageListListenersImpl.m55460p((InterfaceC4339a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MessageListListenersImpl.m55456l((InterfaceC4339a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MessageListListenersImpl.m55440I((InterfaceC4339a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MessageListListenersImpl.m55436E((InterfaceC4339a) obj);
            default:
                return MessageListListenersImpl.m55469y((InterfaceC4339a) obj);
        }
    }
}
