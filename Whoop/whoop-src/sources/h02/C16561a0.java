package h02;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordingAttachmentsGroupView;
import kw1.AbstractC22859j;
import l83.C23454a0;
import lw1.C24773i;
import p390p1.InterfaceC28593a1;
import p409q0.AbstractC29701y;
import p411q2.InterfaceC29805a;
import p715kotlin.jvm.functions.Function1;
import p736sz0.AbstractC33231x0;
import uc3.AbstractC34765c;
import uc3.C34768f;
import uc3.InterfaceC34767e;

/* JADX INFO: renamed from: h02.a0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16561a0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f63739E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63740w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f63741x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f63742y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f63743z;

    public /* synthetic */ C16561a0(int i13, Function1 function1, C24773i c24773i, InterfaceC28593a1 interfaceC28593a1) {
        this.f63741x = i13;
        this.f63742y = function1;
        this.f63743z = c24773i;
        this.f63739E = interfaceC28593a1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f63740w) {
            case 0:
                return AbstractC16563b0.m46909q((Function1) this.f63742y, this.f63741x, (InterfaceC2994c0) this.f63743z, (AbstractC29701y) this.f63739E);
            case 1:
                AudioRecordingAttachmentsGroupView.registerButtonsListeners$lambda$36((AudioRecordingAttachmentsGroupView) this.f63742y, (AudioPlayer) this.f63743z, (Attachment) this.f63739E, this.f63741x);
                return C23454a0.f92919a;
            case 2:
                return AbstractC22859j.m66359M(this.f63741x, (Function1) this.f63742y, (C24773i) this.f63743z, (InterfaceC28593a1) this.f63739E);
            case 3:
                return AbstractC33231x0.m105427l((InterfaceC29805a) this.f63743z, this.f63741x, (Function1) this.f63742y, (InterfaceC28593a1) this.f63739E);
            default:
                String str = (String) this.f63742y;
                C34768f c34768f = (C34768f) this.f63743z;
                InterfaceC34767e interfaceC34767e = (InterfaceC34767e) this.f63739E;
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Can not interpret the string '", str, "' as ");
                sbM53375p.append(((AbstractC34765c) c34768f.f146433a.get(this.f63741x)).f146431b);
                sbM53375p.append(": ");
                sbM53375p.append(interfaceC34767e.mo30616b());
                return sbM53375p.toString();
        }
    }

    public /* synthetic */ C16561a0(AudioRecordingAttachmentsGroupView audioRecordingAttachmentsGroupView, AudioPlayer audioPlayer, Attachment attachment, int i13) {
        this.f63742y = audioRecordingAttachmentsGroupView;
        this.f63743z = audioPlayer;
        this.f63739E = attachment;
        this.f63741x = i13;
    }

    public /* synthetic */ C16561a0(String str, C34768f c34768f, int i13, InterfaceC34767e interfaceC34767e) {
        this.f63742y = str;
        this.f63743z = c34768f;
        this.f63741x = i13;
        this.f63739E = interfaceC34767e;
    }

    public /* synthetic */ C16561a0(Function1 function1, int i13, InterfaceC2994c0 interfaceC2994c0, AbstractC29701y abstractC29701y) {
        this.f63742y = function1;
        this.f63741x = i13;
        this.f63743z = interfaceC2994c0;
        this.f63739E = abstractC29701y;
    }

    public /* synthetic */ C16561a0(InterfaceC29805a interfaceC29805a, int i13, Function1 function1, InterfaceC28593a1 interfaceC28593a1) {
        this.f63743z = interfaceC29805a;
        this.f63741x = i13;
        this.f63742y = function1;
        this.f63739E = interfaceC28593a1;
    }
}
