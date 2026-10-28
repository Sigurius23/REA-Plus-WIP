package qm2;

import android.app.Activity;
import android.content.Intent;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.C1466g2;
import androidx.health.platform.client.proto.C1476i2;
import androidx.health.platform.client.proto.C1545w1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.amplitude.android.engagement.C4861a;
import com.google.android.gms.tasks.Task;
import com.google.android.material.datepicker.C5020n;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;
import dc3.InterfaceC11936u;
import ec3.C13045h2;
import io.C20039s;
import io.getstream.android.video.generated.models.VideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p073cq.InterfaceC11035d;
import p097ds.C12320w;
import p111e8.C12808a;
import p111e8.C12809b;
import p111e8.C12810c;
import p111e8.C12811d;
import p111e8.C12812e;
import p111e8.C12813f;
import p170g8.C15557a;
import p170g8.InterfaceC15559c;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p294l3.C23250e;
import p294l3.C23277r0;
import p309lo.InterfaceC24550h;
import p465rm.C31574v0;
import p465rm.InterfaceC31582z0;
import p479s4.AbstractC32120a;
import p510u0.C34352r1;
import p510u0.C34370y0;
import p546v7.BinderC35751a;
import p546v7.C35752b;
import p557vo.AbstractC36221c;
import p636y3.C39179k;
import p673z7.InterfaceC40139c;
import p692zt.AbstractServiceC41104h;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc0.C32355c;
import stream.video.sfu.models.ParticipantSource;
import stream.video.sfu.models.TrackType;
import t23.C33392g2;
import t23.C33410k0;
import t23.C33450s0;
import ty1.C34260e;
import v33.C35615a0;
import v33.C35641z;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: qm2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30486c implements InterfaceC16915u, InterfaceC24550h, InterfaceC40139c, InterfaceC11035d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125273w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f125274x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f125275y;

    public /* synthetic */ C30486c(int i13, Object obj, Object obj2) {
        this.f125273w = i13;
        this.f125274x = obj;
        this.f125275y = obj2;
    }

    /* JADX INFO: renamed from: a */
    public C5020n m93344a(C34370y0 c34370y0) {
        C34352r1 c34352r1 = (C34352r1) this.f125274x;
        C23250e c23250e = (C23250e) this.f125275y;
        C23277r0 c23277r0 = (C23277r0) c34352r1.f144301a.getValue();
        if (c23277r0 == null) {
            return new C5020n(0, 0, new C34260e(5));
        }
        C23250e c23250eM108656c = C34352r1.m108656c(c23250e, c23277r0);
        if (c23250eM108656c == null) {
            return new C5020n(0, 0, new C34260e(4));
        }
        C39179k c39179kM115322c = AbstractC36221c.m115322c(c23277r0.m67341j(c23250eM108656c.f92126b, c23250eM108656c.f92127c).m51460g());
        return new C5020n(c39179kM115322c.m124798c(), c39179kM115322c.m124796a(), new C32355c(c39179kM115322c, 13));
    }

    /* JADX INFO: renamed from: b */
    public void m93345b(VideoEvent videoEvent) {
        C33450s0 c33450s0 = (C33450s0) this.f125274x;
        InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f125275y;
        C2345k c2345kM105860b = c33450s0.m105860b();
        InterfaceC2339e interfaceC2339e = c2345kM105860b.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = c2345kM105860b.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM105860b.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[livestreamFlow] #track; event.type: ", videoEvent.getType()), null);
        }
        if (videoEvent instanceof C35641z) {
            C35641z c35641z = (C35641z) videoEvent;
            C33392g2 c33392g2M105862d = c33450s0.m105862d(c35641z.f151444b, c35641z.f151443a, ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
            TrackType trackType = c35641z.f151445c;
            if (trackType == TrackType.TRACK_TYPE_VIDEO) {
                C13045h2 c13045h2 = c33392g2M105862d.f139432k;
                Boolean bool = Boolean.TRUE;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
            } else if (trackType == TrackType.TRACK_TYPE_AUDIO) {
                C13045h2 c13045h3 = c33392g2M105862d.f139436o;
                Boolean bool2 = Boolean.TRUE;
                c13045h3.getClass();
                c13045h3.m36571k(null, bool2);
            }
        }
        if (videoEvent instanceof C35615a0) {
            C35615a0 c35615a0 = (C35615a0) videoEvent;
            C33392g2 c33392g2M105862d2 = c33450s0.m105862d(c35615a0.f151400b, c35615a0.f151399a, ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
            TrackType trackType2 = c35615a0.f151401c;
            if (trackType2 == TrackType.TRACK_TYPE_VIDEO) {
                C13045h2 c13045h4 = c33392g2M105862d2.f139432k;
                Boolean bool3 = Boolean.FALSE;
                c13045h4.getClass();
                c13045h4.m36571k(null, bool3);
            } else if (trackType2 == TrackType.TRACK_TYPE_AUDIO) {
                C13045h2 c13045h5 = c33392g2M105862d2.f139436o;
                Boolean bool4 = Boolean.FALSE;
                c13045h5.getClass();
                c13045h5.m36571k(null, bool4);
            }
        }
        C33410k0.m105855f(c33450s0, interfaceC11936u);
    }

    @Override // p673z7.InterfaceC40139c
    /* JADX INFO: renamed from: c */
    public void mo93346c(IInterface iInterface, C12320w c12320w) {
        switch (this.f125273w) {
            case 4:
                C35752b this$0 = (C35752b) this.f125274x;
                Set set = (Set) this.f125275y;
                InterfaceC15559c interfaceC15559c = (InterfaceC15559c) iInterface;
                AbstractC22676k.m65750j(this$0, "this$0");
                C12812e c12812eM113280b = this$0.m113280b();
                Set set2 = set;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Permission((C1545w1) it.next()));
                }
                List listM74093D1 = AbstractC25265s.m74093D1(arrayList);
                BinderC35751a binderC35751a = new BinderC35751a(c12320w, 1);
                C15557a c15557a = (C15557a) interfaceC15559c;
                c15557a.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    AbstractC37926s0.m121462N(parcelObtain, c12812eM113280b);
                    int size = listM74093D1.size();
                    parcelObtain.writeInt(size);
                    for (int i13 = 0; i13 < size; i13++) {
                        AbstractC37926s0.m121462N(parcelObtain, (Parcelable) listM74093D1.get(i13));
                    }
                    parcelObtain.writeStrongInterface(binderC35751a);
                    c15557a.f58385f.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            case 5:
                C35752b this$1 = (C35752b) this.f125274x;
                C12813f c12813f = (C12813f) this.f125275y;
                AbstractC22676k.m65750j(this$1, "this$0");
                C12812e c12812eM113280b2 = this$1.m113280b();
                BinderC35751a binderC35751a2 = new BinderC35751a(c12320w, 4);
                C15557a c15557a2 = (C15557a) ((InterfaceC15559c) iInterface);
                c15557a2.getClass();
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    parcelObtain3.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    AbstractC37926s0.m121462N(parcelObtain3, c12812eM113280b2);
                    AbstractC37926s0.m121462N(parcelObtain3, c12813f);
                    parcelObtain3.writeStrongInterface(binderC35751a2);
                    c15557a2.f58385f.transact(10, parcelObtain3, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return;
                } finally {
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                }
            case 6:
                C35752b this$2 = (C35752b) this.f125274x;
                C12808a c12808a = (C12808a) this.f125275y;
                AbstractC22676k.m65750j(this$2, "this$0");
                C12812e c12812eM113280b3 = this$2.m113280b();
                BinderC35751a binderC35751a3 = new BinderC35751a(c12320w, 0);
                C15557a c15557a3 = (C15557a) ((InterfaceC15559c) iInterface);
                c15557a3.getClass();
                Parcel parcelObtain5 = Parcel.obtain();
                Parcel parcelObtain6 = Parcel.obtain();
                try {
                    parcelObtain5.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    AbstractC37926s0.m121462N(parcelObtain5, c12812eM113280b3);
                    AbstractC37926s0.m121462N(parcelObtain5, c12808a);
                    parcelObtain5.writeStrongInterface(binderC35751a3);
                    c15557a3.f58385f.transact(11, parcelObtain5, parcelObtain6, 0);
                    parcelObtain6.readException();
                    return;
                } finally {
                    parcelObtain6.recycle();
                    parcelObtain5.recycle();
                }
            case 7:
                C35752b this$3 = (C35752b) this.f125274x;
                C12811d c12811d = (C12811d) this.f125275y;
                AbstractC22676k.m65750j(this$3, "this$0");
                C12812e c12812eM113280b4 = this$3.m113280b();
                BinderC35751a binderC35751a4 = new BinderC35751a(c12320w, 5);
                C15557a c15557a4 = (C15557a) ((InterfaceC15559c) iInterface);
                c15557a4.getClass();
                Parcel parcelObtain7 = Parcel.obtain();
                Parcel parcelObtain8 = Parcel.obtain();
                try {
                    parcelObtain7.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    AbstractC37926s0.m121462N(parcelObtain7, c12812eM113280b4);
                    AbstractC37926s0.m121462N(parcelObtain7, c12811d);
                    parcelObtain7.writeStrongInterface(binderC35751a4);
                    c15557a4.f58385f.transact(16, parcelObtain7, parcelObtain8, 0);
                    parcelObtain8.readException();
                    return;
                } finally {
                    parcelObtain8.recycle();
                    parcelObtain7.recycle();
                }
            case 8:
                C35752b this$4 = (C35752b) this.f125274x;
                C1466g2 c1466g2 = (C1466g2) this.f125275y;
                AbstractC22676k.m65750j(this$4, "this$0");
                C12812e c12812eM113280b5 = this$4.m113280b();
                C12809b c12809b = new C12809b(c1466g2);
                BinderC35751a binderC35751a5 = new BinderC35751a(c12320w, 2);
                C15557a c15557a5 = (C15557a) ((InterfaceC15559c) iInterface);
                c15557a5.getClass();
                Parcel parcelObtain9 = Parcel.obtain();
                Parcel parcelObtain10 = Parcel.obtain();
                try {
                    parcelObtain9.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    AbstractC37926s0.m121462N(parcelObtain9, c12812eM113280b5);
                    AbstractC37926s0.m121462N(parcelObtain9, c12809b);
                    parcelObtain9.writeStrongInterface(binderC35751a5);
                    c15557a5.f58385f.transact(18, parcelObtain9, parcelObtain10, 0);
                    parcelObtain10.readException();
                    return;
                } finally {
                    parcelObtain10.recycle();
                    parcelObtain9.recycle();
                }
            default:
                C35752b this$5 = (C35752b) this.f125274x;
                C1476i2 c1476i2 = (C1476i2) this.f125275y;
                AbstractC22676k.m65750j(this$5, "this$0");
                C12812e c12812eM113280b6 = this$5.m113280b();
                C12810c c12810c = new C12810c(c1476i2);
                BinderC35751a binderC35751a6 = new BinderC35751a(c12320w, 3);
                C15557a c15557a6 = (C15557a) ((InterfaceC15559c) iInterface);
                c15557a6.getClass();
                Parcel parcelObtain11 = Parcel.obtain();
                Parcel parcelObtain12 = Parcel.obtain();
                try {
                    parcelObtain11.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    AbstractC37926s0.m121462N(parcelObtain11, c12812eM113280b6);
                    AbstractC37926s0.m121462N(parcelObtain11, c12810c);
                    parcelObtain11.writeStrongInterface(binderC35751a6);
                    c15557a6.f58385f.transact(17, parcelObtain11, parcelObtain12, 0);
                    parcelObtain12.readException();
                    return;
                } finally {
                    parcelObtain12.recycle();
                    parcelObtain11.recycle();
                }
        }
    }

    @Override // p309lo.InterfaceC24550h
    public void invoke(Object obj) {
        C31574v0 c31574v0 = (C31574v0) this.f125274x;
        ((InterfaceC31582z0) obj).mo97305e(c31574v0.f130448h, (C20039s) this.f125275y);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        return BleChooseStrapActivity.m27021r0((BleChooseStrapActivity) this.f125274x, (View) this.f125275y, view, c16905q1);
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task launchTask) {
        switch (this.f125273w) {
            case 10:
                String str = (String) this.f125274x;
                Activity activity = (Activity) this.f125275y;
                AbstractC22676k.m65750j(launchTask, "launchTask");
                if (!launchTask.isSuccessful()) {
                    C5101l0 c5101l0 = C4861a.f20259o;
                    StringBuilder sb4 = new StringBuilder("Failed to request review flow: ");
                    Exception exception = launchTask.getException();
                    sb4.append(exception != null ? exception.getMessage() : null);
                    c5101l0.m16032K(sb4.toString());
                    if (str != null) {
                        AbstractC32120a.m99982h(activity, str);
                    }
                } else {
                    C4861a.f20259o.m16047a0("PlayStoreHandler: Play Store review requested via ReviewManagerFactory.");
                }
                break;
            default:
                ((AbstractServiceC41104h) this.f125274x).m133439b((Intent) this.f125275y);
                break;
        }
    }
}
