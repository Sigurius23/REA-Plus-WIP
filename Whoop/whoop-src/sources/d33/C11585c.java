package d33;

import a30.C0332w0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import io.getstream.video.android.model.User;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;
import z23.C40033c;

/* JADX INFO: renamed from: d33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11585c {

    /* JADX INFO: renamed from: a */
    public final C13045h2 f37369a;

    public C11585c(InterfaceC13037f2 activeCall, InterfaceC13037f2 ringingCall) {
        AbstractC22676k.m65750j(activeCall, "activeCall");
        AbstractC22676k.m65750j(ringingCall, "ringingCall");
        this.f37369a = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: a */
    public User m31011a() {
        return (User) this.f37369a.getValue();
    }

    public C11585c(String str, String callType, InterfaceC13037f2 myParticipantState, C40033c clientEventReporter, C32800q c32800q, C0332w0 c0332w0) {
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(myParticipantState, "myParticipantState");
        AbstractC22676k.m65750j(clientEventReporter, "clientEventReporter");
        this.f37369a = AbstractC13091v.m36593c("");
    }

    public C11585c(User initial) {
        AbstractC22676k.m65750j(initial, "initial");
        this.f37369a = AbstractC13091v.m36593c(initial);
    }
}
