package w23;

import a30.C0332w0;
import hc3.C17171d;
import java.util.List;
import org.webrtc.PeerConnection;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;
import wb3.AbstractC37056f;
import z23.C40033c;

/* JADX INFO: renamed from: w23.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C36758p {

    /* JADX INFO: renamed from: a */
    public final String f157308a;

    /* JADX INFO: renamed from: b */
    public final String f157309b;

    /* JADX INFO: renamed from: c */
    public final C17171d f157310c;

    /* JADX INFO: renamed from: d */
    public final C40033c f157311d;

    /* JADX INFO: renamed from: e */
    public final C32800q f157312e;

    /* JADX INFO: renamed from: f */
    public final C0332w0 f157313f;

    /* JADX INFO: renamed from: g */
    public final C36760r f157314g;

    /* JADX INFO: renamed from: h */
    public final List f157315h;

    public C36758p(String str, String callType, C17171d c17171d, C40033c reporter, C32800q c32800q, C0332w0 c0332w0) {
        C36760r c36760r = new C36760r();
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(reporter, "reporter");
        this.f157308a = str;
        this.f157309b = callType;
        this.f157310c = c17171d;
        this.f157311d = reporter;
        this.f157312e = c32800q;
        this.f157313f = c0332w0;
        this.f157314g = c36760r;
        this.f157315h = AbstractC37056f.m118959K(PeerConnection.PeerConnectionState.CONNECTING, PeerConnection.PeerConnectionState.FAILED, PeerConnection.PeerConnectionState.CONNECTED);
    }
}
