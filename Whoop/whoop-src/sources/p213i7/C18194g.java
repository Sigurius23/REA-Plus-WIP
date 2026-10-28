package p213i7;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3260g;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.geofencing.GeofencingError;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.MapboxLogger;
import hn.C17508p;
import i92.C18256a;
import if1.C18453a;
import io.C20708t;
import io.C20709u;
import io.getstream.chat.android.client.notifications.ChatNotifications;
import io.getstream.chat.android.client.notifications.PushNotificationReceivedListener;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.helper.ClipboardHandler;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.helper.StyleTransformer;
import io.sentry.C20265b7;
import io.sentry.C20513q6;
import io.sentry.InterfaceC20045a4;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20320e4;
import io.sentry.protocol.C20501v;
import io.sentry.transport.InterfaceC20556f;
import io.sentry.util.InterfaceC20583e;
import java.util.ArrayList;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;
import p012ab.C0682h0;
import p299l9.C23536x0;
import p299l9.InterfaceC23482a0;
import p309lo.AbstractC24543a;
import p465rm.C31521c0;
import p465rm.InterfaceC31526e;
import p465rm.InterfaceC31529f;
import p499t9.InterfaceC33644n;
import p516u8.C34611p0;
import p550vd.AbstractC35903f;
import p607x8.InterfaceC38049d;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import pg3.InterfaceC29201n;
import qa.C30097b;
import sn.C32766w0;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: i7.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18194g implements InterfaceC3260g, InterfaceC29201n, InterfaceC31526e, PushNotificationReceivedListener, ChannelListView.ChannelListItemPredicate, StyleTransformer, ClipboardHandler, InterfaceC27471a, InterfaceC20583e, InterfaceC20045a4, InterfaceC20556f, InterfaceC20320e4, GeofencingUtilsUserConsentResponseCallback, InterfaceC39718e, InterfaceC38049d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f70576w;

    public /* synthetic */ C18194g(int i13) {
        this.f70576w = i13;
    }

    @Override // io.sentry.InterfaceC20045a4
    /* JADX INFO: renamed from: a */
    public void mo8618a(C20265b7 c20265b7) {
    }

    @Override // p607x8.InterfaceC38049d
    public void accept(Object obj) {
        ((C23536x0) obj).f93205b.getClass();
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        switch (this.f70576w) {
            case 26:
                InterfaceC33644n interfaceC33644n = (InterfaceC33644n) obj;
                interfaceC33644n.getClass();
                return interfaceC33644n.getClass().getSimpleName();
            case 27:
                return AbstractC41023g0.m133252m(AbstractC41047q.m133290t(((InterfaceC23482a0) obj).mo36128k().f93028b, new C18194g(29)));
            default:
                return Integer.valueOf(((C34611p0) obj).f145798c);
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return C18256a.m52588d((C29218v0) obj);
    }

    @Override // io.sentry.transport.InterfaceC20556f
    /* JADX INFO: renamed from: c */
    public long mo52216c() {
        return SystemClock.uptimeMillis();
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        return C18453a.m53196b((AbstractC34799a1) obj);
    }

    @Override // io.getstream.chat.android.p226ui.common.helper.ClipboardHandler
    public void copyMessage(Message message) {
        AbstractC22676k.m65750j(message, "it");
    }

    @Override // p465rm.InterfaceC31526e
    /* JADX INFO: renamed from: e */
    public InterfaceC31529f mo52217e(Bundle bundle) {
        switch (this.f70576w) {
            case 7:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                C41060w0 c41060w0M71581q = C41060w0.f177067E;
                if (parcelableArrayList != null) {
                    c41060w0M71581q = AbstractC24543a.m71581q(C20708t.f77526y, parcelableArrayList);
                }
                C0682h0 c0682h0 = new C0682h0(4);
                for (int i13 = 0; i13 < c41060w0M71581q.f177069z; i13++) {
                    C20708t c20708t = (C20708t) c41060w0M71581q.get(i13);
                    c0682h0.m1704t(c20708t.f77527w, c20708t);
                }
                return new C20709u(c0682h0.m1694i());
            default:
                Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                bundle2.getClass();
                C30097b c30097b = C31521c0.f130069h0;
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                C41017e0 c41017e1 = AbstractC41023g0.f176998x;
                C41060w0 c41060w0M71581q2 = C41060w0.f177067E;
                if (parcelableArrayList2 != null) {
                    c41060w0M71581q2 = AbstractC24543a.m71581q(c30097b, parcelableArrayList2);
                }
                C32766w0 c32766w0 = new C32766w0(bundle2.getString(Integer.toString(1, 36), ""), (C31521c0[]) c41060w0M71581q2.toArray(new C31521c0[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                return intArray == null ? new C20708t(c32766w0) : new C20708t(c32766w0, AbstractC35903f.m114014i(intArray));
        }
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 it) {
        switch (this.f70576w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(it, "it");
                it.mo56209t(C20501v.f76802x);
                break;
            default:
                it.mo56191M(new C17508p(it, 20));
                break;
        }
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        return C20513q6.empty();
    }

    @Override // io.getstream.chat.android.client.notifications.PushNotificationReceivedListener
    public void onPushNotificationReceived(String str, String str2) {
        ChatNotifications.onPushMessage$lambda$0(str, str2);
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h abstractC26205h) {
        AbstractC22676k.m65750j(abstractC26205h, "it");
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelListItemPredicate
    public boolean predicate(ChannelListItem channelListItem) {
        ChannelListView.channelListItemPredicate$lambda$0(channelListItem);
        return true;
    }

    @Override // com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback
    public void run(Expected result) {
        AbstractC22676k.m65750j(result, "result");
        GeofencingError geofencingError = (GeofencingError) result.getError();
        if (geofencingError != null) {
            MapboxLogger.logW("GeofencingConsent", "Unable to set user consent: " + geofencingError.getType());
        }
    }

    @Override // io.getstream.chat.android.p226ui.helper.StyleTransformer
    public Object transform(Object obj) {
        return obj;
    }
}
