package x43;

import a13.C0150h;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import c53.C4255a;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.ChatClient;
import java.util.concurrent.CancellationException;
import l83.C23470p;
import live.hms.video.error.ErrorCodes;
import p180h0.C16417l1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x43.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C37976h {

    /* JADX INFO: renamed from: a */
    public final long f162623a;

    /* JADX INFO: renamed from: b */
    public final long f162624b;

    /* JADX INFO: renamed from: c */
    public final C4255a f162625c;

    /* JADX INFO: renamed from: d */
    public final AbstractC32275i f162626d;

    /* JADX INFO: renamed from: e */
    public final AbstractC32275i f162627e;

    /* JADX INFO: renamed from: f */
    public final AbstractC22680m f162628f;

    /* JADX INFO: renamed from: g */
    public int f162629g;

    /* JADX INFO: renamed from: h */
    public long f162630h;

    /* JADX INFO: renamed from: i */
    public C2996c2 f162631i;

    /* JADX INFO: renamed from: j */
    public C2996c2 f162632j;

    /* JADX INFO: renamed from: k */
    public C2996c2 f162633k;

    /* JADX INFO: renamed from: l */
    public final C23470p f162634l;

    /* JADX WARN: Multi-variable type inference failed */
    public C37976h(C4255a c4255a, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13) {
        long j7 = (i13 & 2) != 0 ? ChatClient.RESOLVE_DEPENDENCY_TIMEOUT : 5000L;
        long j13 = (i13 & 4) != 0 ? 30000L : 15000L;
        this.f162623a = j7;
        this.f162624b = j13;
        this.f162625c = c4255a;
        this.f162626d = (AbstractC32275i) function1;
        this.f162627e = (AbstractC32275i) function2;
        this.f162628f = (AbstractC22680m) interfaceC4339a;
        this.f162634l = AbstractC1772c1.m5382S(this, "Video:SocketMonitor");
    }

    /* JADX INFO: renamed from: a */
    public final void m121613a() {
        m121616d();
        this.f162630h = System.currentTimeMillis();
        this.f162629g = 0;
        m121614b();
    }

    /* JADX INFO: renamed from: b */
    public final void m121614b() {
        C2996c2 c2996c2 = this.f162631i;
        InterfaceC30057d interfaceC30057d = null;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f162631i = AbstractC3006f0.m8732z(this.f162625c, null, null, new C16417l1(this.f162623a, new C0150h(this, interfaceC30057d, 22), null), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m121615c() {
        C2996c2 c2996c2 = this.f162633k;
        InterfaceC30057d interfaceC30057d = null;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        int i13 = this.f162629g;
        this.f162629g = i13 + 1;
        int iMin = Math.min((i13 * ErrorCodes.InitAPIErrors.cServerErrors) + 500, 25000);
        int iMin2 = Math.min(Math.max(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, (i13 - 1) * ErrorCodes.InitAPIErrors.cServerErrors), 25000);
        long jFloor = (long) Math.floor((Math.random() * ((double) (iMin - iMin2))) + ((double) iMin2));
        C2345k c2345k = (C2345k) this.f162634l.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        String str = c2345k.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC31061c.m95636l(jFloor, "Next connection attempt in ", " ms"), null);
        }
        this.f162633k = AbstractC3006f0.m8732z(this.f162625c, null, null, new C16417l1(jFloor, new C37975g(this, interfaceC30057d, 1), null), 3);
    }

    /* JADX INFO: renamed from: d */
    public final void m121616d() {
        C2996c2 c2996c2 = this.f162633k;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        C2996c2 c2996c3 = this.f162632j;
        if (c2996c3 != null) {
            c2996c3.cancel((CancellationException) null);
        }
        C2996c2 c2996c4 = this.f162631i;
        if (c2996c4 != null) {
            c2996c4.cancel((CancellationException) null);
        }
    }
}
