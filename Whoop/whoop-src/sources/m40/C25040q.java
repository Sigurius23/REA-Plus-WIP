package m40;

import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: m40.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C25040q extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f98101E;

    /* JADX INFO: renamed from: w */
    public int f98102w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25046w f98103x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f98104y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f98105z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25040q(C25046w c25046w, String str, int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f98103x = c25046w;
        this.f98104y = str;
        this.f98105z = i13;
        this.f98101E = i14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C25040q(this.f98103x, this.f98104y, this.f98105z, this.f98101E, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C25040q) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM73483c;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f98102w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C25046w c25046w = this.f98103x;
            String str = this.f98104y;
            C23468n c23468nM73482b = C25046w.m73482b(c25046w, str);
            if (c23468nM73482b == null && (c23468nM73482b = C25046w.m73481a(c25046w, str)) == null) {
                this.f98102w = 1;
                objM73483c = C25046w.m73483c(c25046w, str, this.f98105z, this.f98101E, this);
                if (objM73483c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                objM73483c = c23468nM73482b.f92940w;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM73483c = ((C23468n) obj).f92940w;
        }
        return new C23468n(objM73483c);
    }
}
