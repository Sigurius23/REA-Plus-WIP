package bd3;

import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23455b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: bd3.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3111a0 extends AbstractC32274h implements Function3 {

    /* JADX INFO: renamed from: x */
    public int f12214x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ C23455b f12215y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3115c0 f12216z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3111a0(C3115c0 c3115c0, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f12216z = c3115c0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3111a0 c3111a0 = new C3111a0(this.f12216z, (InterfaceC30057d) obj3);
        c3111a0.f12215y = (C23455b) obj;
        return c3111a0.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C3115c0 c3115c0 = this.f12216z;
        AbstractC3110a abstractC3110a = c3115c0.f12232a;
        C23455b c23455b = this.f12215y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f12214x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            byte bM8968w = abstractC3110a.m8968w();
            if (bM8968w == 1) {
                return c3115c0.m8981d(true);
            }
            if (bM8968w == 0) {
                return c3115c0.m8981d(false);
            }
            if (bM8968w != 6) {
                if (bM8968w == 8) {
                    return c3115c0.m8980c();
                }
                AbstractC3110a.m8942r(abstractC3110a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f12215y = null;
            this.f12214x = 1;
            obj = C3115c0.m8978a(c3115c0, c23455b, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return (JsonElement) obj;
    }
}
