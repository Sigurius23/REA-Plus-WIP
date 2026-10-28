package mx1;

import ad3.C0764g;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.whoopaction.domain.models.Action;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.extensions.StringExtensionsKt;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import mx2.AbstractC26019f;
import mx2.C26021h;
import n01.AbstractC26087d;
import n21.AbstractC26194h;
import n21.C26191e;
import n31.AbstractC26217b;
import n31.AbstractC26223h;
import n51.AbstractC26300g;
import n71.AbstractC26434o;
import n71.EnumC26437r;
import n72.AbstractC26440c;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11385o0;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p329n0.C26061n;
import p330n1.C26115o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p721n22.Function0;
import p745y81.C39336i;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: mx1.o */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26009o implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102802w;

    public /* synthetic */ C26009o(int i13) {
        this.f102802w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102802w) {
            case 0:
                return AbstractC26010p.m77286i((Modifier) obj);
            case 1:
                return AbstractC26010p.m77287j((Modifier) obj);
            case 2:
                return C26021h.m77369q((AbstractC26019f.a) obj);
            case 3:
                return C26021h.m77373u((AbstractC26019f.a) obj);
            case 4:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                return C23454a0.f92919a;
            case 5:
                return C23454a0.f92919a;
            case 6:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51812k("CircularProgressIndicator", semantics);
                return C23454a0.f92919a;
            case 7:
                return AbstractC26087d.m77589f((List) obj);
            case 8:
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                C0237p c0237pMo744t0 = c0238p0.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2346d(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c0238p0.m728a();
                    return C23454a0.f92919a;
                } finally {
                    AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                }
            case 9:
                Float f13 = (Float) obj;
                f13.getClass();
                return new C26115o(new C11344e(f13, AbstractC11348f.f36367i, null, 12));
            case 10:
                return StringExtensionsKt.m54977a((InterfaceC39407k) obj);
            case 11:
                return StringExtensionsKt.m54978b((InterfaceC39407k) obj);
            case 12:
                return C26191e.m77753b(((Boolean) obj).booleanValue());
            case 13:
                return AbstractC26194h.m77781o(((Boolean) obj).booleanValue());
            case 14:
                return Function0.m77806k((C11385o0) obj);
            case 15:
                C23465k c23465k = (C23465k) obj;
                AbstractC22676k.m65750j(c23465k, "<destruct>");
                return AbstractC18489d0.m53370k((String) c23465k.f92937w, "=", (String) c23465k.f92938x);
            case 16:
                return AbstractC26217b.m77847p((String) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC26217b.m77848q(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC26217b.m77854w((Action) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC26223h.m77881h(obj);
            case 20:
                return AbstractC26300g.m78044j(obj);
            case 21:
                return AbstractC26434o.m78215N((C11385o0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC26434o.m78252y((InterfaceC22129c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EnumC26437r._init_$lambda$0((C39336i) obj);
            case 24:
                return EnumC26437r._init_$lambda$1((C39336i) obj);
            case 25:
                return EnumC26437r._init_$lambda$2((C39336i) obj);
            case 26:
                return EnumC26437r._init_$lambda$3((C39336i) obj);
            case 27:
                return EnumC26437r._init_$lambda$4((C39336i) obj);
            case 28:
                return EnumC26437r._init_$lambda$5((C39336i) obj);
            default:
                return AbstractC26440c.m78273h((C23749z0) obj);
        }
    }

    public /* synthetic */ C26009o(int i13, C26061n c26061n) {
        this.f102802w = 5;
    }
}
