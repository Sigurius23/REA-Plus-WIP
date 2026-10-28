package p092dh;

import bc3.AbstractC3006f0;
import mc3.C25442h;
import mc3.C25443i;
import mc3.InterfaceC25439e;
import mh.C25545m;
import p007a6.C0438l0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12018e implements InterfaceC12023j {

    /* JADX INFO: renamed from: a */
    public final AbstractC12037x f39755a;

    /* JADX INFO: renamed from: b */
    public final C25545m f39756b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC25439e f39757c;

    /* JADX INFO: renamed from: d */
    public final EnumC12026m f39758d;

    public C12018e(AbstractC12037x abstractC12037x, C25545m c25545m, C25443i c25443i, EnumC12026m enumC12026m) {
        this.f39755a = abstractC12037x;
        this.f39756b = c25545m;
        this.f39757c = c25443i;
        this.f39758d = enumC12026m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p092dh.InterfaceC12023j
    /* JADX INFO: renamed from: a */
    public final Object mo33148a(InterfaceC30057d interfaceC30057d) throws Throwable {
        C12017d c12017d;
        C12018e c12018e;
        Object obj;
        Object obj2;
        Throwable th3;
        if (interfaceC30057d instanceof C12017d) {
            c12017d = (C12017d) interfaceC30057d;
            int i13 = c12017d.f39750E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12017d.f39750E = i13 - Integer.MIN_VALUE;
            } else {
                c12017d = new C12017d(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c12017d = new C12017d(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj3 = c12017d.f39753y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12017d.f39750E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj3);
                c12017d.f39751w = this;
                InterfaceC25439e interfaceC25439e = this.f39757c;
                c12017d.f39752x = interfaceC25439e;
                c12017d.f39750E = 1;
                if (((C25442h) interfaceC25439e).m74671a(c12017d) != enumC31071a) {
                    c12018e = this;
                    obj = interfaceC25439e;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = (InterfaceC25439e) c12017d.f39751w;
                try {
                    AbstractC34132o.m107864I(obj3);
                    obj2 = obj2;
                    C12021h c12021h = (C12021h) obj3;
                    ((C25442h) obj2).m74673d();
                    return c12021h;
                } catch (Throwable th4) {
                    th3 = th4;
                    ((C25442h) obj2).m74673d();
                    throw th3;
                }
            }
            Object obj4 = c12017d.f39752x;
            c12018e = (C12018e) c12017d.f39751w;
            AbstractC34132o.m107864I(obj3);
            obj = obj4;
            C0438l0 c0438l0 = new C0438l0(c12018e, 8);
            c12017d.f39751w = obj;
            c12017d.f39752x = null;
            c12017d.f39750E = 2;
            Object objM8701G = AbstractC3006f0.m8701G(c0438l0, c12017d);
            if (objM8701G != enumC31071a) {
                obj2 = obj;
                obj3 = objM8701G;
                C12021h c12021h2 = (C12021h) obj3;
                ((C25442h) obj2).m74673d();
                return c12021h2;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            obj2 = obj;
            th3 = th5;
            ((C25442h) obj2).m74673d();
            throw th3;
        }
    }
}
