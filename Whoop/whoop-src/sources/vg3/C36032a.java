package vg3;

import androidx.room.AbstractC1772c1;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import java.io.IOException;
import ne3.C26616h;
import pg3.InterfaceC29201n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import yb3.C39412p;

/* JADX INFO: renamed from: vg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C36032a implements InterfaceC29201n {

    /* JADX INFO: renamed from: x */
    public static final C34818h0 f153708x;

    /* JADX INFO: renamed from: w */
    public final AbstractC5586q f153709w;

    static {
        C39412p c39412p = C34818h0.f146589e;
        f153708x = AbstractC1772c1.m5403u("application/x-protobuf");
    }

    public C36032a(AbstractC5586q abstractC5586q) {
        this.f153709w = abstractC5586q;
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) throws IOException {
        C26616h c26616h = new C26616h();
        this.f153709w.encode(c26616h, (AbstractC5581l) obj);
        return AbstractC34846v0.create(f153708x, c26616h.m79197X0());
    }
}
