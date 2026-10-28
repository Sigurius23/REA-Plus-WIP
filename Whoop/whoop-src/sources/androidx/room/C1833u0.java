package androidx.room;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p107e3.AbstractC12601b;
import p107e3.AbstractC12602c;
import p107e3.C12600a;
import p132f0.C13793i0;
import p161g.C14923z;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: androidx.room.u0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1833u0 extends C22672i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1833u0(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f7181w = i15;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Exception {
        ContentCaptureSession contentCaptureSessionM35315b;
        switch (this.f7181w) {
            case 0:
                AbstractC1848z0.access$onClosed((AbstractC1848z0) this.receiver);
                return C23454a0.f92919a;
            case 1:
                View view = (View) this.receiver;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    AbstractC12602c.m35325g(view);
                }
                if (i13 < 29 || (contentCaptureSessionM35315b = AbstractC12601b.m35315b(view)) == null) {
                    return null;
                }
                return new C12600a(contentCaptureSessionM35315b, view);
            case 2:
                return Boolean.valueOf(((C13793i0) this.receiver).f49225V.m43360b1(7));
            case 3:
                ((C14923z) this.receiver).m43020f();
                return C23454a0.f92919a;
            default:
                ((C14923z) this.receiver).m43020f();
                return C23454a0.f92919a;
        }
    }
}
