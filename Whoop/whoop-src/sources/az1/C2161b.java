package az1;

import a31.C0343e;
import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import b01.AbstractC2195p;
import c31.EnumC3919c;
import c41.AbstractC4117t;
import c41.AbstractC4157y4;
import c93.InterfaceC4339a;
import coil.compose.AsyncImagePainter$State$Success;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.view.ProfileHeaderKt;
import d11.AbstractC11471f;
import d42.AbstractC11686b;
import d62.AbstractC11737c;
import e93.AbstractC12889b;
import eg2.AbstractC13172e;
import eg2.AbstractC13177j;
import ep1.AbstractC13410e;
import ep1.AbstractC13424s;
import f01.AbstractC13907w;
import fg2.AbstractC14471m;
import fh0.AbstractC14482d;
import l83.C23454a0;
import p025b1.C2214e;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p181h2.C16617b;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p236j.C21062a;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: az1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2161b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8583w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f8584x;

    public /* synthetic */ C2161b(InterfaceC4339a interfaceC4339a, int i13) {
        this.f8583w = i13;
        this.f8584x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8583w) {
            case 0:
                return AbstractC2162c.m6736k(this.f8584x, (EnumC3919c) obj);
            case 1:
                return AbstractC2167h.m6789r(this.f8584x, (EnumC3919c) obj);
            case 2:
                return AbstractC2195p.m6913O(this.f8584x, obj);
            case 3:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51804c(semantics, new C0343e(this.f8584x, 2));
                return C23454a0.f92919a;
            case 4:
                InterfaceC15250v state = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(state, "state");
                if (((EnumC15251w) state).m43353a()) {
                    this.f8584x.invoke();
                }
                return C23454a0.f92919a;
            case 5:
                return AbstractC4117t.m12691h(this.f8584x, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC4157y4.m12959k(this.f8584x, obj);
            case 7:
                return AbstractC4157y4.m12960l(this.f8584x, obj);
            case 8:
                return p701ce2.Function1.m14106x(this.f8584x, (AsyncImagePainter$State$Success) obj);
            case 9:
                return ProfileHeaderKt.ProfileHeader$lambda$2$1$1$0$0(this.f8584x, (Modifier) obj);
            case 10:
                return WhoopNewToolbar.m26683q(this.f8584x, (View) obj);
            case 11:
                return WhoopNewToolbar.m26684s(this.f8584x, (View) obj);
            case 12:
                return AbstractC11471f.m30796u(this.f8584x, obj);
            case 13:
                C28624i0 DisposableEffect = (C28624i0) obj;
                AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
                return new C2214e(this.f8584x, 3);
            case 14:
                return AbstractC11686b.m31165f(this.f8584x, obj);
            case 15:
                return AbstractC11737c.m31384t(this.f8584x, obj);
            case 16:
                return AbstractC13172e.m36937i(this.f8584x, (EnumC3919c) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13172e.m36941m(this.f8584x, (EnumC3919c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13177j.m36993A(this.f8584x, (C21062a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13410e.m37927d(this.f8584x, (EnumC3919c) obj);
            case 20:
                return AbstractC13424s.m38065h(this.f8584x, obj);
            case 21:
                return AbstractC13907w.m39599h(this.f8584x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return (C16617b) this.f8584x.invoke();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (C16617b) this.f8584x.invoke();
            case 24:
                return AbstractC14471m.m41290j(this.f8584x, (InterfaceC26064q) obj);
            case 25:
                return AbstractC14471m.m41292l(this.f8584x, obj);
            case 26:
                return AbstractC14482d.m41363f(this.f8584x, ((Boolean) obj).booleanValue());
            case 27:
                this.f8584x.invoke();
                return C23454a0.f92919a;
            case 28:
                this.f8584x.invoke();
                return C23454a0.f92919a;
            default:
                return new C39178j((((long) AbstractC12889b.m36258X(((Number) this.f8584x.invoke()).floatValue())) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
