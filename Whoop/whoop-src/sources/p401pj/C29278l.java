package p401pj;

import a73.AbstractC0529d;
import af3.C0840p;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import b30.C2570m;
import p171g9.C15594k;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import z63.AbstractC40129a;
import z63.InterfaceC40133e;

/* JADX INFO: renamed from: pj.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C29278l extends AbstractC40129a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f118486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f118487b;

    public C29278l(long j7, Function1 function1) {
        this.f118486a = function1;
        this.f118487b = j7;
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: d */
    public final void mo1293d(C15594k c15594k) {
        final long j7 = this.f118487b;
        final Function1 function1 = this.f118486a;
        c15594k.m43894b(C0840p.class, new InterfaceC40133e() { // from class: pj.j
            @Override // z63.InterfaceC40133e
            /* JADX INFO: renamed from: a */
            public final Object mo7932a(C2570m c2570m, C15594k props) {
                AbstractC22676k.m65750j(c2570m, "<anonymous parameter 0>");
                AbstractC22676k.m65750j(props, "props");
                String str = (String) props.f58544a.get(AbstractC0529d.f1830e);
                Function1 function2 = function1;
                long j13 = j7;
                return function2 != null ? new C29277k[]{new C29277k(str, function2, j13)} : new Object[]{new URLSpan(str), new ForegroundColorSpan(AbstractC17918w0.m51506H(j13))};
            }
        });
    }
}
