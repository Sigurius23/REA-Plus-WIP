package i20;

import android.app.Application;
import androidx.lifecycle.AbstractC1564b;
import androidx.lifecycle.AbstractC1640x1;
import androidx.room.C1778e;
import bc3.AbstractC3006f0;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import g40.C15339d3;
import g40.C15351f3;
import j20.C21240b;
import j20.C21241c;
import m83.C25271y;
import p026b2.C2319y;
import p337n8.C26444a;
import p479s4.AbstractC32128i;
import p708hb2.C17095c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y30.InterfaceC39190e;

/* JADX INFO: renamed from: i20.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17982v0 extends AbstractC1564b {

    /* JADX INFO: renamed from: E */
    public final C13045h2 f69811E;

    /* JADX INFO: renamed from: F */
    public final C13096w1 f69812F;

    /* JADX INFO: renamed from: G */
    public final C13078q1 f69813G;

    /* JADX INFO: renamed from: H */
    public final C15339d3 f69814H;

    /* JADX INFO: renamed from: I */
    public final C15351f3 f69815I;

    /* JADX INFO: renamed from: J */
    public final C13081r1 f69816J;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39190e f69817x;

    /* JADX INFO: renamed from: y */
    public final C17970p0 f69818y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f69819z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17982v0(InterfaceC39190e interfaceC39190e, C17970p0 autocompleteArgs, C21241c eventReporter, Application application) {
        super(application);
        AbstractC22676k.m65750j(autocompleteArgs, "autocompleteArgs");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        this.f69817x = interfaceC39190e;
        this.f69818y = autocompleteArgs;
        Object[] objArr = 0;
        this.f69819z = AbstractC13091v.m36593c(null);
        this.f69811E = AbstractC13091v.m36593c(Boolean.FALSE);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.f69812F = c13096w1M36592b;
        this.f69813G = AbstractC13091v.m36597g(c13096w1M36592b);
        C15339d3 c15339d3 = new C15339d3(AbstractC32128i.m100064s(R.string.stripe_address_label_address, new Object[0], C25271y.f99162w), 0, 0, AbstractC13091v.m36593c(null), false, 22);
        this.f69814H = c15339d3;
        int i13 = 6;
        C15351f3 c15351f3 = new C15351f3(c15339d3, null, 0 == true ? 1 : 0, i13);
        this.f69815I = c15351f3;
        C13081r1 queryFlow = c15351f3.f57715n;
        this.f69816J = queryFlow;
        C17972q0 c17972q0 = new C17972q0();
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        C17095c c17095c = new C17095c(this, i13);
        AbstractC22676k.m65750j(queryFlow, "queryFlow");
        AbstractC3006f0.m8732z(c26444aM5043b, null, null, new C2319y(queryFlow, c17972q0, c17095c, 0 == true ? 1 : 0, 15), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C17968o0(this, 0 == true ? 1 : 0, 0), 3);
        String str = autocompleteArgs.f69793a;
        if (str != null) {
            C21240b c21240b = new C21240b(str);
            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(eventReporter.f81100c), null, null, new C1778e(eventReporter, c21240b, objArr == true ? 1 : 0, 16), 3);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m51592g() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C17968o0(this, null, 1), 3);
    }
}
