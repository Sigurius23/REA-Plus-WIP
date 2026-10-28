package a41;

import bb2.AbstractC2933i;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dl1.AbstractC12170d;
import g40.AbstractC15448y0;
import g40.C15413r0;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordingAttachmentsGroupView;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p409q0.C29674b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import vo1.AbstractC36249x;
import wz0.AbstractC37777d;
import xk1.C38429c;
import za2.C40236l;

/* JADX INFO: renamed from: a41.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0372h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1268w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f1269x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1270y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1271z;

    public /* synthetic */ C0372h(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f1268w = 7;
        this.f1269x = i13;
        this.f1270y = interfaceC28601c1;
        this.f1271z = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f1268w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f1271z;
        Object obj2 = this.f1270y;
        int i14 = this.f1269x;
        switch (i13) {
            case 0:
                return AbstractC0376l.m1031x((InterfaceC2994c0) obj2, (C29674b) obj, i14);
            case 1:
                return AbstractC2933i.m8562p((Function3) obj2, (C40236l) obj, i14);
            case 2:
                return AbstractC12170d.m33670t((InterfaceC4351m) obj2, (C38429c) obj, i14);
            case 3:
                float f13 = AbstractC15448y0.f58036a;
                ((InterfaceC28601c1) obj).setValue(Boolean.FALSE);
                ((C15413r0) obj2).m43603u(Integer.valueOf(i14));
                return c23454a0;
            case 4:
                return DistinctChatApi.m54545e((DistinctChatApi) obj2, (String) obj, i14);
            case 5:
                AudioRecordingAttachmentsGroupView.registerButtonsListeners$lambda$34((AudioRecordingAttachmentsGroupView) obj2, (AudioPlayer) obj, i14);
                return c23454a0;
            case 6:
                return AbstractC36249x.m115620R((Function1) obj2, i14, (Function1) obj);
            default:
                return AbstractC37777d.m121216q(i14, (InterfaceC28601c1) obj2, (InterfaceC28601c1) obj);
        }
    }

    public /* synthetic */ C0372h(Object obj, int i13, Object obj2, int i14) {
        this.f1268w = i14;
        this.f1270y = obj;
        this.f1269x = i13;
        this.f1271z = obj2;
    }

    public /* synthetic */ C0372h(Object obj, Object obj2, int i13, int i14) {
        this.f1268w = i14;
        this.f1270y = obj;
        this.f1271z = obj2;
        this.f1269x = i13;
    }
}
