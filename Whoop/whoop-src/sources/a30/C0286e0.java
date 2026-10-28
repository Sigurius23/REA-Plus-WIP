package a30;

import h20.C16671i1;
import my.C26027a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38929q0;
import z20.C40013g;
import z20.C40014h;

/* JADX INFO: renamed from: a30.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0286e0 {

    /* JADX INFO: renamed from: a */
    public final C40013g f1012a;

    public C0286e0(C40013g customerRepository) {
        AbstractC22676k.m65750j(customerRepository, "customerRepository");
        this.f1012a = customerRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m818a(C26027a c26027a, C40014h c40014h, AbstractC32269c abstractC32269c) {
        C0283d0 c0283d0;
        String str;
        if (abstractC32269c instanceof C0283d0) {
            c0283d0 = (C0283d0) abstractC32269c;
            int i13 = c0283d0.f1002y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0283d0.f1002y = i13 - Integer.MIN_VALUE;
            } else {
                c0283d0 = new C0283d0(this, abstractC32269c);
            }
        } else {
            c0283d0 = new C0283d0(this, abstractC32269c);
        }
        Object objM128242d = c0283d0.f1000w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0283d0.f1002y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM128242d);
            C16671i1 c16671i1 = c26027a.f102950E;
            if (c16671i1 != null && (str = c16671i1.f64115x) != null) {
                return str;
            }
            if (c40014h == null) {
                return null;
            }
            c0283d0.f1002y = 1;
            objM128242d = this.f1012a.m128242d(c40014h, c0283d0);
            if (objM128242d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM128242d);
        }
        C38929q0 c38929q0 = (C38929q0) objM128242d;
        if (c38929q0 != null) {
            return c38929q0.f167584I;
        }
        return null;
    }
}
