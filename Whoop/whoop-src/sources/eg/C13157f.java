package eg;

import ae3.C0803k;
import gg.AbstractC15818e;
import gg.C15815b;
import gg.EnumC15819f;
import l83.C23454a0;
import p148fg.C14435e;
import p148fg.InterfaceC14443m;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import u00.C34377e;

/* JADX INFO: renamed from: eg.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C13157f extends C13166o {

    /* JADX INFO: renamed from: d */
    public static final C34377e f45580d = new C34377e(26);

    /* JADX INFO: renamed from: c */
    public final C13153b f45581c;

    public C13157f(C13153b c13153b) {
        super(c13153b);
        this.f45581c = c13153b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eg.C13166o
    /* JADX INFO: renamed from: a */
    public final Object mo36841a(int i13, AbstractC15818e abstractC15818e, InterfaceC30057d interfaceC30057d) {
        C13154c c13154c;
        if (interfaceC30057d instanceof C13154c) {
            c13154c = (C13154c) interfaceC30057d;
            int i14 = c13154c.f45568E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c13154c.f45568E = i14 - Integer.MIN_VALUE;
            } else {
                c13154c = new C13154c(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c13154c = new C13154c(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c13154c.f45571y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c13154c.f45568E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            c13154c.f45570x = abstractC15818e;
            c13154c.f45569w = i13;
            c13154c.f45568E = 1;
            if (c23454a0 != enumC31071a) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        i13 = c13154c.f45569w;
        abstractC15818e = c13154c.f45570x;
        AbstractC34132o.m107864I(obj);
        C15815b c15815b = abstractC15818e instanceof C15815b ? (C15815b) abstractC15818e : null;
        EnumC15819f enumC15819f = c15815b != null ? c15815b.f59707a : null;
        InterfaceC14443m interfaceC14443m = this.f45581c.f45567e;
        c13154c.f45570x = null;
        c13154c.f45569w = i13;
        c13154c.f45568E = 2;
        return ((C14435e) interfaceC14443m).m41164c(enumC15819f, c13154c) == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eg.C13166o
    /* JADX INFO: renamed from: b */
    public final Object mo36842b(InterfaceC30057d interfaceC30057d) {
        C13155d c13155d;
        if (interfaceC30057d instanceof C13155d) {
            c13155d = (C13155d) interfaceC30057d;
            int i13 = c13155d.f45575y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13155d.f45575y = i13 - Integer.MIN_VALUE;
            } else {
                c13155d = new C13155d(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c13155d = new C13155d(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c13155d.f45573w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13155d.f45575y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c13155d.f45575y = 1;
            if (c23454a0 != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        InterfaceC14443m interfaceC14443m = this.f45581c.f45567e;
        c13155d.f45575y = 2;
        return ((C14435e) interfaceC14443m).m41162a(1, c13155d) == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eg.C13166o
    /* JADX INFO: renamed from: c */
    public final Object mo36843c(int i13, InterfaceC30057d interfaceC30057d) {
        C13156e c13156e;
        if (interfaceC30057d instanceof C13156e) {
            c13156e = (C13156e) interfaceC30057d;
            int i14 = c13156e.f45579z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c13156e.f45579z = i14 - Integer.MIN_VALUE;
            } else {
                c13156e = new C13156e(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c13156e = new C13156e(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c13156e.f45577x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c13156e.f45579z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            c13156e.f45576w = i13;
            c13156e.f45579z = 1;
            if (c23454a0 != enumC31071a) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        i13 = c13156e.f45576w;
        AbstractC34132o.m107864I(obj);
        InterfaceC14443m interfaceC14443m = this.f45581c.f45567e;
        c13156e.f45576w = i13;
        c13156e.f45579z = 2;
        return ((C14435e) interfaceC14443m).m41162a(1, c13156e) == enumC31071a ? enumC31071a : c23454a0;
    }

    @Override // eg.C13166o
    /* JADX INFO: renamed from: e */
    public final C0803k mo36844e() {
        return this.f45581c;
    }

    @Override // eg.C13166o
    /* JADX INFO: renamed from: f */
    public final C0803k mo36845f() {
        return this.f45581c;
    }
}
