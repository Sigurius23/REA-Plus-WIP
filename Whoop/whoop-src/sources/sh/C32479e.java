package sh;

import bc3.AbstractC3006f0;
import fi.C14509o;
import mc3.C25442h;
import mc3.C25443i;
import mc3.InterfaceC25439e;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sc0.C32355c;

/* JADX INFO: renamed from: sh.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32479e implements InterfaceC32485k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32491q f134499a;

    /* JADX INFO: renamed from: b */
    public final C14509o f134500b;

    /* JADX INFO: renamed from: c */
    public final C25443i f134501c;

    /* JADX INFO: renamed from: d */
    public final C32488n f134502d;

    public C32479e(InterfaceC32491q interfaceC32491q, C14509o c14509o, C25443i c25443i, C32488n c32488n) {
        this.f134499a = interfaceC32491q;
        this.f134500b = c14509o;
        this.f134501c = c25443i;
        this.f134502d = c32488n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sh.InterfaceC32485k
    /* JADX INFO: renamed from: a */
    public final Object mo71006a(InterfaceC30057d interfaceC30057d) throws Throwable {
        C32478d c32478d;
        C25443i c25443i;
        C32479e c32479e;
        Object obj;
        Throwable th3;
        if (interfaceC30057d instanceof C32478d) {
            c32478d = (C32478d) interfaceC30057d;
            int i13 = c32478d.f134494E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c32478d.f134494E = i13 - Integer.MIN_VALUE;
            } else {
                c32478d = new C32478d(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c32478d = new C32478d(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj2 = c32478d.f134497y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c32478d.f134494E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj2);
                c32478d.f134495w = this;
                c25443i = this.f134501c;
                c32478d.f134496x = c25443i;
                c32478d.f134494E = 1;
                if (c25443i.m74671a(c32478d) != enumC31071a) {
                    c32479e = this;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = (InterfaceC25439e) c32478d.f134495w;
                try {
                    AbstractC34132o.m107864I(obj2);
                    C32483i c32483i = (C32483i) obj2;
                    ((C25442h) obj).m74673d();
                    return c32483i;
                } catch (Throwable th4) {
                    th3 = th4;
                    ((C25442h) obj).m74673d();
                    throw th3;
                }
            }
            C25443i c25443i2 = c32478d.f134496x;
            c32479e = (C32479e) c32478d.f134495w;
            AbstractC34132o.m107864I(obj2);
            c25443i = c25443i2;
            C32355c c32355c = new C32355c(c32479e, 1);
            c32478d.f134495w = c25443i;
            c32478d.f134496x = null;
            c32478d.f134494E = 2;
            Object objM8701G = AbstractC3006f0.m8701G(c32355c, c32478d);
            if (objM8701G != enumC31071a) {
                obj = c25443i;
                obj2 = objM8701G;
                C32483i c32483i2 = (C32483i) obj2;
                ((C25442h) obj).m74673d();
                return c32483i2;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            obj = c25443i;
            th3 = th5;
            ((C25442h) obj).m74673d();
            throw th3;
        }
    }
}
