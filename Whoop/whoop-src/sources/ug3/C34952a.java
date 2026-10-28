package ug3;

import androidx.room.AbstractC1772c1;
import pg3.InterfaceC29201n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import yb3.C39412p;

/* JADX INFO: renamed from: ug3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C34952a implements InterfaceC29201n {

    /* JADX INFO: renamed from: w */
    public static final C34952a f147906w = new C34952a();

    /* JADX INFO: renamed from: x */
    public static final C34818h0 f147907x;

    static {
        C39412p c39412p = C34818h0.f146589e;
        f147907x = AbstractC1772c1.m5403u("text/plain; charset=UTF-8");
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) {
        return AbstractC34846v0.create(f147907x, String.valueOf(obj));
    }
}
