package tg3;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import java.io.EOFException;
import ne3.C26616h;
import p441qx.C30743y;
import pg3.InterfaceC29201n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import yb3.C39412p;

/* JADX INFO: renamed from: tg3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C33801b implements InterfaceC29201n {

    /* JADX INFO: renamed from: x */
    public static final C34818h0 f141575x;

    /* JADX INFO: renamed from: w */
    public final JsonAdapter f141576w;

    static {
        C39412p c39412p = C34818h0.f146589e;
        f141575x = AbstractC1772c1.m5403u("application/json; charset=UTF-8");
    }

    public C33801b(JsonAdapter jsonAdapter) {
        this.f141576w = jsonAdapter;
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) throws EOFException {
        C26616h c26616h = new C26616h();
        this.f141576w.toJson(new C30743y(c26616h), obj);
        return AbstractC34846v0.create(f141575x, c26616h.mo79218m0(c26616h.f105866x));
    }
}
