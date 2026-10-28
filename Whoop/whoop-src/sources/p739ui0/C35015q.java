package p739ui0;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.profile.view.components.ContextHubTileKt;
import com.whoop.profile.view.components.ContextHubTileViewState;
import com.whoop.profile.view.components.ReferralsTileKt;
import com.whoop.profile.view.components.ReferralsTileViewState;
import com.whoop.profile.view.components.StreaksTileKt;
import com.whoop.profile.view.components.StreaksTileViewState;
import com.whoop.weightlifting.StrengthTrainerDestination;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import ne3.AbstractC26604b;
import ne3.InterfaceC26620j;
import ol0.C28013c;
import p006a4.AbstractC0354a;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p390p1.InterfaceC28670t2;
import p470rv.AbstractC31834n;
import p477s2.AbstractC32072d;
import p552vh.AbstractC36037e;
import p552vh.C36036d;
import p579wc.C37105m0;
import p580wd.C37148a;
import p580wd.C37149b;
import p580wd.C37150c;
import p580wd.C37151d;
import p580wd.C37152e;
import p580wd.C37153f;
import p580wd.C37154g;
import p580wd.C37159l;
import p583wh.C37295a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import qy0.InterfaceC30768a;
import sh.C32497w;
import sh.InterfaceC32491q;
import so1.C32811e0;
import so1.C32829n0;
import te0.AbstractC33749h;
import te0.C33743b;
import tp1.C34065e;
import u60.C34551c;
import uu2.AbstractC35261l;
import uu2.AbstractC35272w;
import uu2.C35242b0;
import ux2.AbstractC35371a;
import ux2.InterfaceC35372b;
import uz1.AbstractC35439q;
import uz1.AbstractC35442t;
import uz1.C35440r;
import uz1.C35443u;
import v01.AbstractC35501c;
import v01.C35502d;
import v21.AbstractC35584b;
import v21.C35585c;
import v71.AbstractC35761b;
import v71.C35762c;
import v80.AbstractC35794b;
import v80.C35795c;
import va3.AbstractC35854l;
import ve0.AbstractC35927e;
import vf3.AbstractC35952b;
import vh2.C36050e;
import vl0.AbstractC36101d;
import vp1.AbstractC36268d;
import vz0.AbstractC36612a;
import vz0.C36613b;
import w11.AbstractC36695b;
import w11.C36696c;
import w60.AbstractC36857e;
import w61.AbstractC36863c;
import wc3.C37141f;
import wc3.C37142g;
import wo1.AbstractC37446f;
import wo1.AbstractC37467p0;
import wo1.C37438b;
import wo1.C37440c;
import wo1.C37455j0;
import y61.C39260a;
import yc3.C39439c;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ui0.q */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35015q implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148173w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f148174x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f148175y;

    public /* synthetic */ C35015q(int i13, Object obj, Object obj2) {
        this.f148173w = i13;
        this.f148174x = obj;
        this.f148175y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        String str;
        switch (this.f148173w) {
            case 0:
                return AbstractC35016r.m110640h((Function1) this.f148174x, (C6010p) this.f148175y);
            case 1:
                return AbstractC35261l.m111773R((Function1) this.f148174x, (C35242b0) this.f148175y);
            case 2:
                return AbstractC35272w.m111879N((StrengthTrainerDestination.C10742e.a) this.f148174x, (AbstractC12939a0) this.f148175y);
            case 3:
                return AbstractC35371a.m112247l((Function1) this.f148174x, (InterfaceC35372b) this.f148175y);
            case 4:
                return AbstractC35439q.m112500e((Function1) this.f148174x, (C35440r) this.f148175y);
            case 5:
                return AbstractC35442t.m112517e((Function1) this.f148174x, (C35443u) this.f148175y);
            case 6:
                return AbstractC35501c.m112577L((Function1) this.f148174x, (C35502d) this.f148175y);
            case 7:
                return AbstractC35584b.m112784k((C35585c) this.f148175y, (Function1) this.f148174x);
            case 8:
                return ContextHubTileKt.ContextHubTile$lambda$1$0((ContextHubTileViewState) this.f148175y, (Function1) this.f148174x);
            case 9:
                return ReferralsTileKt.ReferralsTile$lambda$1$0((ReferralsTileViewState) this.f148175y, (Function1) this.f148174x);
            case 10:
                return StreaksTileKt.StreaksTile$lambda$1$0((StreaksTileViewState) this.f148175y, (Function1) this.f148174x);
            case 11:
                return AbstractC35761b.m113305f((Function1) this.f148174x, (C35762c) this.f148175y);
            case 12:
                return AbstractC35794b.m113475t((Function1) this.f148174x, (C35795c) this.f148175y);
            case 13:
                return AbstractC35927e.m114104C((Function1) this.f148174x, (C33743b) this.f148175y);
            case 14:
                return AbstractC35927e.m114127Z((Function1) this.f148174x, (AbstractC33749h) this.f148175y);
            case 15:
                C36036d c36036d = (C36036d) this.f148174x;
                C22659b0 c22659b0 = (C22659b0) this.f148175y;
                InterfaceC32491q interfaceC32491qM99699h = c36036d.f153721a;
                if (c36036d.f153723c) {
                    InterfaceC26620j interfaceC26620jMo101470d1 = interfaceC32491qM99699h.mo101470d1();
                    if (interfaceC26620jMo101470d1.mo79202d0(0L, AbstractC36037e.f153725b) || interfaceC26620jMo101470d1.mo79202d0(0L, AbstractC36037e.f153724a)) {
                        interfaceC32491qM99699h = AbstractC32072d.m99699h(AbstractC26604b.m79158c(new C37295a(interfaceC32491qM99699h.mo101470d1())), interfaceC32491qM99699h.getFileSystem());
                    }
                }
                try {
                    ImageDecoder.Source sourceM958E = AbstractC0354a.m958E(interfaceC32491qM99699h, c36036d.f153722b, true);
                    if (sourceM958E == null) {
                        InterfaceC26620j interfaceC26620jMo101470d2 = interfaceC32491qM99699h.mo101470d1();
                        try {
                            interfaceC26620jMo101470d2.request(Long.MAX_VALUE);
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) interfaceC26620jMo101470d2.mo79205f().f105866x);
                            while (!interfaceC26620jMo101470d2.mo79205f().mo79222o()) {
                                interfaceC26620jMo101470d2.mo79205f().read(byteBufferAllocateDirect);
                            }
                            byteBufferAllocateDirect.flip();
                            interfaceC26620jMo101470d2.close();
                            sourceM958E = ImageDecoder.createSource(byteBufferAllocateDirect);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC35854l.m113829i(interfaceC26620jMo101470d2, th3);
                                throw th4;
                            }
                        }
                    }
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceM958E, new C32497w(c36036d, c22659b0, 1));
                    AbstractC21598x.m60698r(interfaceC32491qM99699h, null);
                    return drawableDecodeDrawable;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC21598x.m60698r(interfaceC32491qM99699h, th5);
                        throw th6;
                    }
                }
            case 16:
                return C36050e.m114460m((AtomicLong) this.f148174x, (C36050e) this.f148175y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36101d.m114728q((C28013c.a) this.f148175y, (Function1) this.f148174x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36268d.m115730i((Function1) this.f148174x, (C34065e) this.f148175y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return p743vy1.Function1.m117542D((Function1) this.f148174x, (InterfaceC28670t2) this.f148175y);
            case 20:
                return AbstractC36612a.m117608e((C36613b) this.f148175y, (Function1) this.f148174x);
            case 21:
                return AbstractC36695b.m117783t((C36696c) this.f148175y, (Function1) this.f148174x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36857e.m118180p((C34551c.d) this.f148175y, (Function1) this.f148174x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36863c.m118233f((C39260a) this.f148175y, (Function1) this.f148174x);
            case 24:
                C37105m0 c37105m0 = (C37105m0) this.f148174x;
                C37159l c37159l = (C37159l) this.f148175y;
                StringBuilder sb4 = new StringBuilder("Resolving credentials from ");
                AbstractC31834n abstractC31834nM119080a = c37159l.m119080a();
                c37105m0.getClass();
                if (abstractC31834nM119080a instanceof C37151d) {
                    str = "named source " + ((C37151d) abstractC31834nM119080a).m119070m();
                } else if (abstractC31834nM119080a instanceof C37148a) {
                    str = "static credentials";
                } else if (abstractC31834nM119080a instanceof C37154g) {
                    str = "web identity token";
                } else if (abstractC31834nM119080a instanceof C37153f) {
                    str = "single sign-on (session)";
                } else if (abstractC31834nM119080a instanceof C37149b) {
                    str = "single sign-on (legacy)";
                } else if (abstractC31834nM119080a instanceof C37150c) {
                    str = "aws login";
                } else {
                    if (!(abstractC31834nM119080a instanceof C37152e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "process";
                }
                sb4.append(str);
                return sb4.toString();
            case 25:
                return AbstractC35952b.m114196d((String) this.f148174x, C39439c.f169689b, new InterfaceC39443g[0], new C37141f((C37142g) this.f148175y, 0));
            case 26:
                return C37438b.m119854e((Function1) this.f148174x, (InterfaceC30768a) this.f148175y);
            case 27:
                return AbstractC37446f.m119895h((Function1) this.f148174x, (C37440c) this.f148175y);
            case 28:
                return C37455j0.m119961d((C32811e0) this.f148175y, (Function1) this.f148174x);
            default:
                return AbstractC37467p0.m120089u((C32829n0) this.f148175y, (Function1) this.f148174x);
        }
    }

    public /* synthetic */ C35015q(Object obj, Function1 function1, int i13) {
        this.f148173w = i13;
        this.f148175y = obj;
        this.f148174x = function1;
    }
}
