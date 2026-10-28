package v23;

import a30.C0332w0;
import android.content.Context;
import androidx.room.AbstractC1772c1;
import b30.C2570m;
import d33.C11585c;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import hc3.C17171d;
import io.sentry.android.replay.video.C20245d;
import java.util.concurrent.atomic.AtomicBoolean;
import p320m5.C25067k;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;
import w23.C36758p;
import z23.C40033c;

/* JADX INFO: renamed from: v23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C35587a {

    /* JADX INFO: renamed from: a */
    public final C40033c f151338a;

    /* JADX INFO: renamed from: b */
    public final C2570m f151339b;

    /* JADX INFO: renamed from: c */
    public final C2570m f151340c;

    /* JADX INFO: renamed from: d */
    public final C36758p f151341d;

    /* JADX INFO: renamed from: e */
    public final C2570m f151342e;

    /* JADX INFO: renamed from: f */
    public final C20245d f151343f;

    /* JADX INFO: renamed from: g */
    public final C11585c f151344g;

    public C35587a(Context context, String str, String callType, InterfaceC13037f2 myParticipantState, InterfaceC13037f2 connectionFlow, C13045h2 participants, C40033c clientEventReporter, C17171d c17171d) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(myParticipantState, "myParticipantState");
        AbstractC22676k.m65750j(connectionFlow, "connectionFlow");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(clientEventReporter, "eventReporter");
        this.f151338a = clientEventReporter;
        AbstractC1772c1.m5382S(this, "CallAnalyticsHooks");
        C32800q c32800q = new C32800q(5);
        C0332w0 c0332w0 = new C0332w0();
        this.f151339b = new C2570m(str, callType, clientEventReporter, c32800q, new C25067k(this, 11));
        this.f151340c = new C2570m(str, callType, connectionFlow, c17171d, clientEventReporter, c32800q, c0332w0);
        this.f151341d = new C36758p(str, callType, c17171d, clientEventReporter, c32800q, c0332w0);
        this.f151342e = new C2570m(context, str, callType, clientEventReporter, c32800q);
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(clientEventReporter, "clientEventReporter");
        C20245d c20245d = new C20245d();
        c20245d.f76045a = str;
        c20245d.f76046b = callType;
        c20245d.f76047c = clientEventReporter;
        c20245d.f76048d = c32800q;
        c20245d.f76049e = c0332w0;
        c20245d.f76050f = c17171d;
        c20245d.f76051g = new AtomicBoolean(false);
        this.f151343f = c20245d;
        this.f151344g = new C11585c(str, callType, myParticipantState, clientEventReporter, c32800q, c0332w0);
    }
}
