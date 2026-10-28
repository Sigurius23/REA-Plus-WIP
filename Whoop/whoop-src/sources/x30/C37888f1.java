package x30;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.ChatHeaderMetadata;
import l83.C23454a0;
import p077d0.C11393q0;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p477s2.AbstractC32069a;
import p601x0.C37792c;
import p601x0.InterfaceC37796g;
import p636y3.EnumC39181m;
import p667z0.AbstractC39927i;
import p667z0.C39931m;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import p748zc1.AbstractC40402m5;
import ri0.C31446e;
import s30.AbstractC32103e;
import ti0.C33842g;
import tk2.C33895m;
import xd2.C38209e;
import xl0.AbstractC38449c;
import xl0.C38450d;
import xq2.AbstractC38586q0;
import xz0.AbstractC38754e;
import xz0.C38755f;
import y12.AbstractC39070c;
import y12.C39068a;
import yd2.AbstractC39464f;
import yk2.AbstractC39612l;
import yo1.AbstractC39690c;
import yo1.C39691d;
import za2.C40234j;
import za2.C40236l;
import zi0.AbstractC40662a;
import zi0.AbstractC40664c;
import zq0.AbstractC40960c0;
import zq0.AbstractC40972m;
import zq0.C40962d0;
import zt2.AbstractC41134c;
import zt2.C41133b;

/* JADX INFO: renamed from: x30.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37888f1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162237w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f162238x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f162239y;

    public /* synthetic */ C37888f1(int i13, Object obj, Object obj2) {
        this.f162237w = i13;
        this.f162239y = obj;
        this.f162238x = obj2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f162237w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC32069a.m99664b((C37885e1) this.f162239y, (Modifier) this.f162238x, (Composer) obj, AbstractC28683x.m87244L(9));
                return C23454a0.f92919a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC32103e.m99880b((C37924r1) this.f162239y, (Modifier) this.f162238x, (Composer) obj, AbstractC28683x.m87244L(9));
                return C23454a0.f92919a;
            case 2:
                return AbstractC38449c.m123201g((Function1) this.f162239y, (C38450d) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC38586q0.m123749n((C11393q0) this.f162239y, (InterfaceC4351m) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC38754e.m124208w((EnumC39181m) this.f162239y, (C38755f) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC39070c.m124606o((ChatHeaderMetadata) this.f162239y, (C39068a) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC39464f.m126060r((InterfaceC4339a) this.f162239y, (C38209e) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC39612l.m126516O((C33895m.a) this.f162239y, (Function1) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC39690c.m127016e((Function1) this.f162239y, (C39691d) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                ((Integer) obj2).getClass();
                AbstractC39927i.m128085a((InterfaceC37796g) this.f162239y, (C37792c) this.f162238x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 10:
                ((Integer) obj2).getClass();
                ((C39931m) this.f162239y).m128089a((Drawable) this.f162238x, (Composer) obj, AbstractC28683x.m87244L(49));
                return C23454a0.f92919a;
            case 11:
                return C40234j.m129211X((C40234j) this.f162239y, (InterfaceC28670t2) this.f162238x, (C40236l) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC40402m5.m130312t((InterfaceC28601c1) this.f162239y, (Context) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return AbstractC40662a.m131949E((C31446e.a) this.f162239y, (Function1) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC40664c.m131990h((C33842g) this.f162239y, (Function1) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC40972m.m133022i((InterfaceC25312u) this.f162239y, (Function1) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC40960c0.m132917h((TextResource) this.f162239y, (C40962d0) this.f162238x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC41134c.m133555h((Modifier) this.f162238x, (C41133b) this.f162239y, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C37888f1(Modifier modifier, C41133b c41133b) {
        this.f162237w = 17;
        this.f162238x = modifier;
        this.f162239y = c41133b;
    }

    public /* synthetic */ C37888f1(Object obj, Object obj2, int i13, int i14) {
        this.f162237w = i14;
        this.f162239y = obj;
        this.f162238x = obj2;
    }
}
