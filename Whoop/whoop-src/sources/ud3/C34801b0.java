package ud3;

import androidx.room.AbstractC1772c1;
import java.util.ArrayList;
import java.util.List;
import ne3.C26616h;
import ne3.InterfaceC26618i;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;
import yb3.C39412p;

/* JADX INFO: renamed from: ud3.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34801b0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: c */
    public static final C34818h0 f146524c;

    /* JADX INFO: renamed from: a */
    public final List f146525a;

    /* JADX INFO: renamed from: b */
    public final List f146526b;

    static {
        C39412p c39412p = C34818h0.f146589e;
        f146524c = AbstractC1772c1.m5403u("application/x-www-form-urlencoded");
    }

    public C34801b0(ArrayList encodedNames, ArrayList encodedValues) {
        AbstractC22676k.m65750j(encodedNames, "encodedNames");
        AbstractC22676k.m65750j(encodedValues, "encodedValues");
        this.f146525a = AbstractC37174h.m119143j(encodedNames);
        this.f146526b = AbstractC37174h.m119143j(encodedValues);
    }

    /* JADX INFO: renamed from: a */
    public final long m109861a(InterfaceC26618i interfaceC26618i, boolean z4) {
        C26616h c26616hMo79205f;
        if (z4) {
            c26616hMo79205f = new C26616h();
        } else {
            AbstractC22676k.m65747g(interfaceC26618i);
            c26616hMo79205f = interfaceC26618i.mo79205f();
        }
        List list = this.f146525a;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 > 0) {
                c26616hMo79205f.m79219m1(38);
            }
            c26616hMo79205f.m79232u1((String) list.get(i13));
            c26616hMo79205f.m79219m1(61);
            c26616hMo79205f.m79232u1((String) this.f146526b.get(i13));
        }
        if (!z4) {
            return 0L;
        }
        long j7 = c26616hMo79205f.f105866x;
        c26616hMo79205f.m79200b();
        return j7;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return m109861a(null, true);
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return f146524c;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) {
        m109861a(interfaceC26618i, false);
    }
}
