package p667z0;

import a33.C0351c;
import android.view.ActionMode;
import android.view.View;
import androidx.fragment.app.RunnableC1283d;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p025b1.InterfaceC2215f;
import p025b1.InterfaceC2216g;
import p132f0.C13776c1;
import p668z1.C39973v;
import p715kotlin.jvm.functions.Function1;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: z0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C39924f implements InterfaceC2216g {

    /* JADX INFO: renamed from: a */
    public final View f172350a;

    /* JADX INFO: renamed from: b */
    public final Function1 f172351b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f172352c;

    /* JADX INFO: renamed from: d */
    public final C13776c1 f172353d = new C13776c1();

    /* JADX INFO: renamed from: e */
    public final C39973v f172354e = new C39973v(new C39919a(this, 0));

    /* JADX INFO: renamed from: f */
    public final C39919a f172355f = new C39919a(this, 1);

    /* JADX INFO: renamed from: g */
    public final C39919a f172356g = new C39919a(this, 2);

    /* JADX INFO: renamed from: h */
    public ActionMode f172357h;

    /* JADX INFO: renamed from: i */
    public RunnableC1283d f172358i;

    public C39924f(View view, Function1 function1, InterfaceC4339a interfaceC4339a) {
        this.f172350a = view;
        this.f172351b = function1;
        this.f172352c = interfaceC4339a;
    }

    @Override // p025b1.InterfaceC2216g
    /* JADX INFO: renamed from: a */
    public final Object mo7049a(InterfaceC2215f interfaceC2215f, AbstractC32275i abstractC32275i) {
        Object objM39137b = C13776c1.m39137b(this.f172353d, new C0351c(this, interfaceC2215f, null, 15), abstractC32275i);
        return objM39137b == EnumC31071a.f128113w ? objM39137b : C23454a0.f92919a;
    }
}
