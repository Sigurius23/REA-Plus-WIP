package d33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3034m0;
import c93.InterfaceC4352n;
import io.getstream.video.android.core.call.utils.SessionFatalException;
import java.util.Map;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d33.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11627s0 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Map f37542E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11602h1 f37543F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f37544G;

    /* JADX INFO: renamed from: w */
    public int f37545w;

    /* JADX INFO: renamed from: x */
    public int f37546x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Throwable f37547y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ long f37548z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11627s0(Map map, C11602h1 c11602h1, String str, InterfaceC30057d interfaceC30057d) {
        super(4, interfaceC30057d);
        this.f37542E = map;
        this.f37543F = c11602h1;
        this.f37544G = str;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C11602h1 c11602h1 = this.f37543F;
        String str = this.f37544G;
        C11627s0 c11627s0 = new C11627s0(this.f37542E, c11602h1, str, (InterfaceC30057d) obj4);
        c11627s0.f37547y = (Throwable) obj2;
        c11627s0.f37548z = jLongValue;
        return c11627s0.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.StringBuilder] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        long j7;
        ?? r10;
        int i13;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f37546x;
        boolean z4 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Throwable th3 = this.f37547y;
            long j13 = this.f37548z;
            if (th3 instanceof SessionFatalException) {
                return Boolean.FALSE;
            }
            C11602h1 c11602h1 = this.f37543F;
            ?? r14 = (this.f37542E.equals(c11602h1.f37433M.getValue()) && AbstractC22676k.m65745e(this.f37544G, c11602h1.f37443e) && j13 < 30) ? 1 : 0;
            if (j13 <= 1) {
                j7 = 100;
            } else {
                j7 = j13 <= 3 ? 300L : 2500L;
            }
            C2345k c2345kM31043s = c11602h1.m31043s();
            InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
            String str = c2345kM31043s.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j = c2345kM31043s.f9274b;
                ?? sb4 = new StringBuilder("updating mute state failed with error ");
                sb4.append(th3);
                sb4.append(", retry attempt: ");
                sb4.append(j13);
                sb4.append(". will retry ");
                sb4.append(r14);
                sb4.append(" in ");
                interfaceC2344j.log(enumC2341g, str, AbstractC11266d.m30457k(j7, " ms", sb4), null);
            }
            this.f37545w = r14;
            this.f37546x = 1;
            if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                return enumC31071a;
            }
            r10 = r14;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f37545w;
            AbstractC34132o.m107864I(obj);
        }
        if (r10 != 0) {
            r10 = i13;
            z4 = true;
        }
        r10 = i13;
        return Boolean.valueOf(z4);
    }
}
