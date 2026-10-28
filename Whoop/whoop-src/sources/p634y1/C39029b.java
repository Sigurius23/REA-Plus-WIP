package p634y1;

import m83.C25262p;
import p390p1.C28676v0;
import p390p1.InterfaceC28691z1;
import p474s.C31983m2;
import p668z1.InterfaceC39965n;

/* JADX INFO: renamed from: y1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C39029b implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: E */
    public Object[] f167989E;

    /* JADX INFO: renamed from: F */
    public InterfaceC39032e f167990F;

    /* JADX INFO: renamed from: G */
    public final C25262p f167991G = new C25262p(this, 25);

    /* JADX INFO: renamed from: w */
    public InterfaceC39037j f167992w;

    /* JADX INFO: renamed from: x */
    public InterfaceC39033f f167993x;

    /* JADX INFO: renamed from: y */
    public String f167994y;

    /* JADX INFO: renamed from: z */
    public Object f167995z;

    public C39029b(InterfaceC39037j interfaceC39037j, InterfaceC39033f interfaceC39033f, String str, Object obj, Object[] objArr) {
        this.f167992w = interfaceC39037j;
        this.f167993x = interfaceC39033f;
        this.f167994y = str;
        this.f167995z = obj;
        this.f167989E = objArr;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() throws Throwable {
        m124454b();
    }

    /* JADX INFO: renamed from: b */
    public final void m124454b() throws Throwable {
        String strM124455a;
        InterfaceC39033f interfaceC39033f = this.f167993x;
        if (this.f167990F != null) {
            throw new IllegalArgumentException(("entry(" + this.f167990F + ") is not null").toString());
        }
        if (interfaceC39033f != null) {
            C25262p c25262p = this.f167991G;
            Object objInvoke = c25262p.invoke();
            if (objInvoke == null || interfaceC39033f.mo7446d(objInvoke)) {
                this.f167990F = interfaceC39033f.mo7445b(c25262p, this.f167994y);
                return;
            }
            if (objInvoke instanceof InterfaceC39965n) {
                InterfaceC39965n interfaceC39965n = (InterfaceC39965n) objInvoke;
                if (interfaceC39965n.mo87021h() == C28676v0.f115976y || interfaceC39965n.mo87021h() == C28676v0.f115974F || interfaceC39965n.mo87021h() == C28676v0.f115977z) {
                    strM124455a = "MutableState containing " + interfaceC39965n.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM124455a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM124455a = AbstractC39038k.m124455a(objInvoke);
            }
            throw new IllegalArgumentException(strM124455a);
        }
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
        InterfaceC39032e interfaceC39032e = this.f167990F;
        if (interfaceC39032e != null) {
            ((C31983m2) interfaceC39032e).m99494u();
        }
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        InterfaceC39032e interfaceC39032e = this.f167990F;
        if (interfaceC39032e != null) {
            ((C31983m2) interfaceC39032e).m99494u();
        }
    }
}
