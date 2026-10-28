package t10;

import b30.C2511e4;
import b30.C2598p3;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c10.C3831n;
import c10.EnumC3832o;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import k20.C22136a;
import p479s4.AbstractC32128i;
import p522uf.AbstractC34870c0;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s10.C32064f;
import sz.C33151q;
import u30.C34496a;
import v00.C35459c0;
import y00.C38887l3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: t10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C33285e {

    /* JADX INFO: renamed from: a */
    public final C35459c0 f138819a;

    /* JADX INFO: renamed from: b */
    public final C32064f f138820b;

    /* JADX INFO: renamed from: c */
    public final C3831n f138821c;

    /* JADX INFO: renamed from: d */
    public final C33300t f138822d;

    /* JADX INFO: renamed from: e */
    public final C22136a f138823e;

    /* JADX INFO: renamed from: f */
    public final C13045h2 f138824f;

    /* JADX INFO: renamed from: g */
    public final C13045h2 f138825g;

    /* JADX INFO: renamed from: h */
    public C2598p3 f138826h;

    public C33285e(C35459c0 paymentMethodMetadata, C32064f selectionHolder, C3831n configuration, C33300t onClickDelegate, C22136a eventReporter, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(selectionHolder, "selectionHolder");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(onClickDelegate, "onClickDelegate");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.f138819a = paymentMethodMetadata;
        this.f138820b = selectionHolder;
        this.f138821c = configuration;
        this.f138822d = onClickDelegate;
        this.f138823e = eventReporter;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C33290j(m105601a(paymentMethodMetadata.f150996w, configuration), false, new C2511e4(), false, configuration.f15682T == EnumC3832o.f15690w, null, null));
        this.f138824f = c13045h2M36593c;
        this.f138825g = c13045h2M36593c;
        AbstractC3006f0.m8732z(coroutineScope, null, null, new C33151q(this, null, 3), 3);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC41211c m105601a(InterfaceC38802c8 interfaceC38802c8, C3831n c3831n) {
        AbstractC22676k.m65750j(interfaceC38802c8, "<this>");
        boolean z4 = interfaceC38802c8 instanceof C38887l3;
        C34496a c34496a = null;
        Long l7 = z4 ? ((C38887l3) interfaceC38802c8).f167393y : null;
        String strM109981P = AbstractC34870c0.m109981P(interfaceC38802c8);
        if (l7 != null && strM109981P != null) {
            c34496a = new C34496a(l7.longValue(), strM109981P);
        }
        String str = c3831n.f15671I;
        int iOrdinal = c3831n.f15682T.ordinal();
        if (iOrdinal == 0) {
            return str != null ? AbstractC32128i.m100055i(str) : AbstractC32128i.m100054h(R.string.stripe_continue_button_label);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            return AbstractC32128i.m100055i(str);
        }
        if (z4) {
            return c34496a != null ? c34496a.m109035b() : AbstractC32128i.m100054h(R.string.stripe_paymentsheet_pay_button_label);
        }
        return AbstractC32128i.m100054h(R.string.stripe_setup_button_label);
    }
}
