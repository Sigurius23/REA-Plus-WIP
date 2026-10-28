package sz;

import com.google.android.gms.tasks.Task;
import com.squareup.wire.AbstractC5583n;
import e73.C12803b;
import p096dq.C12262f;
import p096dq.C12272p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;
import to.AbstractC33993q;

/* JADX INFO: renamed from: sz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C33121b {

    /* JADX INFO: renamed from: a */
    public final C12272p f138162a;

    public C33121b(C12272p c12272p) {
        this.f138162a = c12272p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m105015a(C12262f c12262f, AbstractC32269c abstractC32269c) throws Exception {
        C33119a c33119a;
        if (abstractC32269c instanceof C33119a) {
            c33119a = (C33119a) abstractC32269c;
            int i13 = c33119a.f138158y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33119a.f138158y = i13 - Integer.MIN_VALUE;
            } else {
                c33119a = new C33119a(this, abstractC32269c);
            }
        } else {
            c33119a = new C33119a(this, abstractC32269c);
        }
        Object objM16789o = c33119a.f138156w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33119a.f138158y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM16789o);
            C12803b c12803bM107465a = AbstractC33993q.m107465a();
            c12803bM107465a.f43826d = 23705;
            c12803bM107465a.f43827e = new C31624i(c12262f, 27);
            Task taskDoRead = this.f138162a.doRead(c12803bM107465a.m35864g());
            AbstractC22676k.m65749i(taskDoRead, "isReadyToPay(...)");
            c33119a.f138158y = 1;
            objM16789o = AbstractC5583n.m16789o(taskDoRead, c33119a);
            if (objM16789o == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM16789o);
        }
        AbstractC22676k.m65749i(objM16789o, "await(...)");
        return objM16789o;
    }
}
