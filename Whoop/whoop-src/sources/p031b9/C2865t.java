package p031b9;

import android.view.View;
import com.whoop.community.CommunityLandingHostFragment;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import p047c9.C4310a;
import p047c9.C4321l;
import p047c9.InterfaceC4311b;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p309lo.InterfaceC24550h;
import p465rm.InterfaceC31582z0;
import p516u8.C34597i0;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.t */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2865t implements InterfaceC38051f, InterfaceC16915u, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11401w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f11402x;

    public /* synthetic */ C2865t(int i13, int i14) {
        this.f11401w = i14;
        this.f11402x = i13;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        switch (this.f11401w) {
            case 0:
                ((InterfaceC34595h0) obj).onRepeatModeChanged(this.f11402x);
                break;
            case 1:
                ((InterfaceC34595h0) obj).onAudioSessionIdChanged(this.f11402x);
                break;
            case 2:
                InterfaceC4311b interfaceC4311b = (InterfaceC4311b) obj;
                interfaceC4311b.getClass();
                C4321l c4321l = (C4321l) interfaceC4311b;
                int i13 = this.f11402x;
                if (i13 == 1) {
                    c4321l.f17566v = true;
                }
                c4321l.f17556l = i13;
                break;
            default:
                ((InterfaceC31582z0) obj).onRepeatModeChanged(this.f11402x);
                break;
        }
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        switch (this.f11401w) {
            case 3:
                return ViewKt.applyEdgeToEdgePadding$lambda$0(this.f11402x, view, c16905q1);
            default:
                return CommunityLandingHostFragment.m18915H1(this.f11402x, view, c16905q1);
        }
    }

    public /* synthetic */ C2865t(C4310a c4310a, int i13, C34597i0 c34597i0, C34597i0 c34597i1) {
        this.f11401w = 2;
        this.f11402x = i13;
    }
}
