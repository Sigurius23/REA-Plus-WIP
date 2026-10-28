package me;

import o73.C27648a;
import p048ce.C4470k;
import p147ff.InterfaceC14422a;
import p474s.C31983m2;
import p505ts.AbstractC34132o;
import p646yd.AbstractC39455f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import vg.C35971r;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: me.c */
/* JADX INFO: loaded from: classes.dex */
public final class C25462c implements InterfaceC14422a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99698w;

    /* JADX INFO: renamed from: x */
    public final Object f99699x;

    public /* synthetic */ C25462c(Object obj, int i13) {
        this.f99698w = i13;
        this.f99699x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p147ff.InterfaceC14422a
    /* JADX INFO: renamed from: b */
    public final Object mo41126b(AbstractC32269c abstractC32269c) throws Throwable {
        C25465f c25465f;
        switch (this.f99698w) {
            case 0:
                return ((C35971r) ((InterfaceC35967n) this.f99699x)).m114207b(AbstractC39455f.m126000f().f83067c);
            default:
                if (abstractC32269c instanceof C25465f) {
                    c25465f = (C25465f) abstractC32269c;
                    int i13 = c25465f.f99705y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c25465f.f99705y = i13 - Integer.MIN_VALUE;
                    } else {
                        c25465f = new C25465f(this, abstractC32269c);
                    }
                } else {
                    c25465f = new C25465f(this, abstractC32269c);
                }
                Object objM99483g = c25465f.f99703w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c25465f.f99705y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objM99483g);
                    C31983m2 c31983m2 = (C31983m2) this.f99699x;
                    c25465f.f99705y = 1;
                    objM99483g = c31983m2.m99483g(c25465f);
                    if (objM99483g == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM99483g);
                }
                return C27648a.m83562M((C4470k) objM99483g);
        }
    }
}
