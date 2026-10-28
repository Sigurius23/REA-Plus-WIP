package l43;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c43.C4202r;
import c93.InterfaceC4351m;
import j43.C21323g;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33368c0;

/* JADX INFO: renamed from: l43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C23335a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92520w;

    /* JADX INFO: renamed from: x */
    public int f92521x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33368c0 f92522y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C21323g f92523z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23335a(C33368c0 c33368c0, C21323g c21323g, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f92520w = i13;
        this.f92522y = c33368c0;
        this.f92523z = c21323g;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f92520w) {
            case 0:
                return new C23335a(this.f92522y, this.f92523z, interfaceC30057d, 0);
            default:
                return new C23335a(this.f92522y, this.f92523z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f92520w) {
            case 0:
                break;
        }
        return ((C23335a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f92520w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f92521x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C4202r c4202r = new C4202r("Android Service Task Removed");
                    this.f92521x = 1;
                    if (this.f92522y.m105829x("CallService.EndCall", c4202r, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C2345k c2345kM59853c = this.f92523z.m59853c();
                InterfaceC2339e interfaceC2339e = c2345kM59853c.f9275c;
                String str = c2345kM59853c.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM59853c.f9274b.log(enumC2341g, str, "[onTaskRemoved] Ended outgoing call for all users", null);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f92521x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f92521x = 1;
                    if (this.f92522y.m105829x("memberCount == 2", null, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C2345k c2345kM59853c2 = this.f92523z.m59853c();
                InterfaceC2339e interfaceC2339e2 = c2345kM59853c2.f9275c;
                String str2 = c2345kM59853c2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.INFO;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    c2345kM59853c2.f9274b.log(enumC2341g2, str2, "[handleIncomingCallTaskRemoved] Ended incoming call for both users", null);
                }
                return C23454a0.f92919a;
        }
    }
}
