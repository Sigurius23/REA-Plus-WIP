package sg2;

import a81.InterfaceC0569t;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.net.Uri;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.settings.journalv2.AbstractC10114e;
import l83.C23454a0;
import nj1.AbstractC26751a;
import p096dq.C12266j;
import p236j.C21073l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33215r1;
import p739ui0.AbstractC35012n;
import p739ui0.AbstractC35016r;
import qu1.InterfaceC30626b;
import qu1.InterfaceC30627c;
import rv2.InterfaceC31846d;
import sj1.AbstractC32563a;
import su1.AbstractC33017c;
import sv2.AbstractC33042e;
import sx0.AbstractC33059a;
import t11.AbstractC33305e;
import t71.AbstractC33576m;
import t80.C33591a;
import te1.AbstractC33751b;
import tj1.AbstractC33867b;
import tu1.C34191d;
import tu2.AbstractC34197b;
import tx0.AbstractC34241d;
import ty1.AbstractC34264i;
import tz0.C34276a;
import u11.AbstractC34443i;
import u21.C34482b;
import uu2.AbstractC35268s;
import uz1.AbstractC35430h;

/* JADX INFO: renamed from: sg2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32451b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134431w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f134432x;

    public /* synthetic */ C32451b(Function1 function1, int i13) {
        this.f134431w = i13;
        this.f134432x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134431w) {
            case 0:
                return C32452c.m101336f(this.f134432x, (String) obj);
            case 1:
                return C32452c.m101338h(this.f134432x, ((Boolean) obj).booleanValue());
            case 2:
                return C32459j.m101357e(this.f134432x, (String) obj);
            case 3:
                return AbstractC32563a.m101596h(this.f134432x, (AbstractC26751a) obj);
            case 4:
                return AbstractC33017c.m104248f(this.f134432x, obj);
            case 5:
                return AbstractC33042e.m104499d0(this.f134432x, obj);
            case 6:
                return AbstractC33059a.m104682j(this.f134432x, obj);
            case 7:
                return AbstractC33215r1.m105367t(this.f134432x, obj);
            case 8:
                return AbstractC33305e.m105649r(this.f134432x, (String) obj);
            case 9:
                return AbstractC33576m.m106040j(this.f134432x, obj);
            case 10:
                return C33591a.m106091d(this.f134432x, obj);
            case 11:
                return AbstractC33751b.m106712m(this.f134432x, obj);
            case 12:
                return AbstractC33867b.m107093d(this.f134432x, obj);
            case 13:
                return C34191d.m108027e(this.f134432x, (InterfaceC30626b) obj);
            case 14:
                return C34191d.m108028f(this.f134432x, (InterfaceC30627c.a) obj);
            case 15:
                return AbstractC34197b.m108097w(this.f134432x, ((Boolean) obj).booleanValue());
            case 16:
                return AbstractC34197b.m108098x(this.f134432x, ((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC34241d.m108269r(this.f134432x, ((Boolean) obj).booleanValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC34264i.m108327D(this.f134432x, (String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C34276a.m108535d(this.f134432x, obj);
            case 20:
                return AbstractC34443i.m108826K(this.f134432x, obj);
            case 21:
                return AbstractC34443i.m108835T(this.f134432x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C34482b.m108974d(this.f134432x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC10114e.m25462l(this.f134432x, ((Boolean) obj).booleanValue());
            case 24:
                return AbstractC10114e.m25465o(this.f134432x, ((Boolean) obj).booleanValue());
            case 25:
                return AbstractC35012n.m110604z(this.f134432x, (InterfaceC0569t) obj);
            case 26:
                return AbstractC35016r.m110641i(this.f134432x, (Uri) obj);
            case 27:
                return AbstractC35268s.m111864f(this.f134432x, (InterfaceC31846d) obj);
            case 28:
                return AbstractC35430h.m112452t(this.f134432x, obj);
            default:
                PendingIntent pendingIntent = ((C12266j) obj).f41073w;
                AbstractC22676k.m65749i(pendingIntent, "getPaymentCardRecognitionPendingIntent(...)");
                IntentSender intentSender = pendingIntent.getIntentSender();
                AbstractC22676k.m65749i(intentSender, "getIntentSender(...)");
                this.f134432x.invoke(new C21073l(intentSender, null, 0, 0));
                return C23454a0.f92919a;
        }
    }
}
