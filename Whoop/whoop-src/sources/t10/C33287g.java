package t10;

import a20.C0168h;
import a30.C0307l0;
import android.content.Intent;
import android.os.Bundle;
import bc3.AbstractC3006f0;
import c10.C3831n;
import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.embedded.form.FormActivity;
import e10.C12553k;
import e10.InterfaceC12555l;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import l83.C23454a0;
import my.C26027a;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q83.InterfaceC30057d;
import s10.C32064f;
import s40.C32139c0;
import v00.C35459c0;

/* JADX INFO: renamed from: t10.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C33287g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138829w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FormActivity f138830x;

    public /* synthetic */ C33287g(FormActivity formActivity, int i13) {
        this.f138829w = i13;
        this.f138830x = formActivity;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C33298r c33298r;
        C12553k c12553k;
        int i13 = this.f138829w;
        FormActivity formActivity = this.f138830x;
        switch (i13) {
            case 0:
                int i14 = FormActivity.f22336G;
                Intent intent = formActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return (C33296p) AbstractC12350b.m34600u(extras, C33296p.class, "extra_activity_args");
                }
                return null;
            case 1:
                int i15 = FormActivity.f22336G;
                return new C0168h(new C33287g(formActivity, 2), 9);
            case 2:
                int i16 = FormActivity.f22336G;
                C33296p c33296p = (C33296p) formActivity.f22339w.getValue();
                if (c33296p != null) {
                    return c33296p;
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                C33284d c33284d = formActivity.f22338F;
                if (c33284d == null) {
                    AbstractC22676k.m65757q("confirmationHelper");
                    throw null;
                }
                C3831n c3831n = c33284d.f138813c;
                C32064f c32064f = c33284d.f138814d;
                InterfaceC4339a interfaceC4339a = c33284d.f138816f.f138867a;
                if (interfaceC4339a == null) {
                    C13081r1 c13081r1 = c32064f.f132973b;
                    InterfaceC13037f2 interfaceC13037f2 = c13081r1.f45200w;
                    InterfaceC13037f2 interfaceC13037f3 = c13081r1.f45200w;
                    AbstractC29840y abstractC29840y = (AbstractC29840y) interfaceC13037f2.getValue();
                    if (abstractC29840y != null) {
                        c33284d.f138817g.m63397q(abstractC29840y);
                    }
                    int iOrdinal = c3831n.f15682T.ordinal();
                    if (iOrdinal == 0) {
                        c33298r = new C33298r((AbstractC29840y) interfaceC13037f3.getValue(), false);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C35459c0 c35459c0 = c33284d.f138811a;
                        AbstractC29840y abstractC29840y2 = (AbstractC29840y) interfaceC13037f3.getValue();
                        if (abstractC29840y2 != null) {
                            C26027a c26027a = new C26027a(c3831n.f15686w, c3831n.f15687x, c3831n.f15688y, c3831n.f15681S, c3831n.f15689z, c3831n.f15667E, c3831n.f15668F, c3831n.f15669G, c3831n.f15672J, c3831n.f15673K, c3831n.f15674L, c3831n.f15675M, c3831n.f15676N, c3831n.f15677O, c3831n.f15678P, c3831n.f15679Q, null, null, null, c3831n.f15683U, null, c3831n.f15684V, c3831n.f15685W, c3831n.f15670H);
                            C0307l0 c0307l0 = c35459c0.f150995l0;
                            InterfaceC12555l interfaceC12555lM34319K = AbstractC12314q.m34319K(abstractC29840y2, c26027a, c0307l0 != null ? c0307l0.f1058w : null, c35459c0.f150982Y);
                            if (interfaceC12555lM34319K == null) {
                                c12553k = null;
                            } else {
                                c12553k = new C12553k(interfaceC12555lM34319K, c35459c0);
                            }
                        } else {
                            c12553k = null;
                        }
                        if (c12553k != null) {
                            AbstractC3006f0.m8732z(c33284d.f138818h, null, null, new C32139c0(c33284d, c12553k, (InterfaceC30057d) null, 4), 3);
                        }
                    }
                    if (c33298r != null) {
                        formActivity.m16851o(c33298r);
                        formActivity.finish();
                    }
                    return C23454a0.f92919a;
                }
                interfaceC4339a.invoke();
                c33298r = null;
                if (c33298r != null) {
                    formActivity.m16851o(c33298r);
                    formActivity.finish();
                }
                return C23454a0.f92919a;
        }
    }
}
