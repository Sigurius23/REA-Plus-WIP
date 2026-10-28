package p077d0;

import f53.C14122j;
import g53.AbstractC15508m;
import g53.C15498c;
import h53.C16940e;
import io.getstream.android.video.generated.models.ConnectedEvent;
import l83.C23454a0;
import n00.C26083k;
import n00.EnumC26076d;
import p408q.C29662f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.event.HealthCheckRequest;
import stream.video.sfu.event.SfuRequest;
import v33.C35639x;

/* JADX INFO: renamed from: d0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C11340d extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36333w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36334x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11340d(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f36333w = i13;
        this.f36334x = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f36333w) {
            case 0:
                return new C11340d((C11344e) this.f36334x, interfaceC30057d, 0);
            case 1:
                return new C11340d((C14122j) this.f36334x, interfaceC30057d, 1);
            case 2:
                return new C11340d((C16940e) this.f36334x, interfaceC30057d, 2);
            default:
                return new C11340d((C26083k) this.f36334x, interfaceC30057d, 3);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f36333w) {
            case 0:
                C11340d c11340d = (C11340d) create(interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c11340d.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C11340d c11340d2 = (C11340d) create(interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c11340d2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C11340d c11340d3 = (C11340d) create(interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c11340d3.invokeSuspend(c23454a2);
                return c23454a2;
            default:
                C11340d c11340d4 = (C11340d) create(interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c11340d4.invokeSuspend(c23454a3);
                return c23454a3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        ConnectedEvent connectedEvent;
        C29662f c29662f;
        int i13 = this.f36333w;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f36334x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C11344e.m30546b((C11344e) obj2);
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C14122j c14122j = (C14122j) obj2;
                AbstractC15508m abstractC15508m = (AbstractC15508m) c14122j.f50758l.m56594w().f168689d.getValue();
                C15498c c15498c = abstractC15508m instanceof C15498c ? (C15498c) abstractC15508m : null;
                if (c15498c != null && (connectedEvent = c15498c.f58168a) != null && (c29662f = c14122j.f50754h) != null) {
                    c29662f.m91079C0(connectedEvent);
                }
                break;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C16940e) obj2).m47700e(new C35639x(new SfuRequest(null, new HealthCheckRequest(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0), null, null, 13, null)));
                break;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C26083k c26083k = (C26083k) obj2;
                EnumC26076d enumC26076d = EnumC26076d.f103268y;
                int i14 = C26083k.f103293R;
                c26083k.m77577q(enumC26076d);
                c26083k.m77576o(null, null);
                break;
        }
        return c23454a0;
    }
}
