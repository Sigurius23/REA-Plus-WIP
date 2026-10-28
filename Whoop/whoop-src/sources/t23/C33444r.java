package t23;

import android.content.Context;
import c93.InterfaceC4339a;
import hc3.C17171d;
import org.webrtc.EglBase;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t23.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C33444r extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C33368c0 f139599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33444r(C33368c0 c33368c0) {
        super(0);
        this.f139599w = c33368c0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C33368c0 c33368c0 = this.f139599w;
        C33366b4 c33366b4 = c33368c0.f139293g;
        Context context = c33366b4.f139259w;
        C17171d c17171d = c33368c0.f139300n;
        Object value = c33368c0.f139274I.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        EglBase.Context eglBaseContext = ((EglBase) value).getEglBaseContext();
        AbstractC22676k.m65749i(eglBaseContext, "getEglBaseContext(...)");
        return new C33476x1(context, c33368c0, c17171d, eglBaseContext, c33366b4.f139238K.m9548b(c33368c0.f139288b).f81522b, new C33414l(c33368c0, 1));
    }
}
