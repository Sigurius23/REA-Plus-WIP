package io.sentry.android.replay;

import android.graphics.Rect;
import ge3.AbstractC15751g;
import io.sentry.C20513q6;
import io.sentry.C20542s6;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.capture.C20190f;
import io.sentry.android.replay.capture.C20193i;
import java.io.File;
import l83.C23454a0;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22131e;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: io.sentry.android.replay.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20211j extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75919w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f75920x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f75921y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f75922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20211j(Object obj, long j7, Object obj2, int i13) {
        super(1);
        this.f75919w = i13;
        this.f75920x = j7;
        this.f75921y = obj;
        this.f75922z = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75919w) {
            case 0:
                C20213l it = (C20213l) obj;
                AbstractC22676k.m65750j(it, "it");
                if (it.f75935b < this.f75920x) {
                    ((C20212k) this.f75921y).m56136h(it.f75934a);
                    return Boolean.TRUE;
                }
                C22669g0 c22669g0 = (C22669g0) this.f75922z;
                if (c22669g0.f89336w == null) {
                    c22669g0.f89336w = it.f75936c;
                }
                return Boolean.FALSE;
            case 1:
                C20193i it3 = (C20193i) obj;
                C20190f c20190f = (C20190f) this.f75921y;
                AbstractC22676k.m65750j(it3, "it");
                C20542s6 c20542s6 = it3.f75861a;
                if (c20542s6.f76991U.getTime() >= this.f75920x) {
                    return Boolean.FALSE;
                }
                c20190f.m56110k(c20190f.m56107h() - 1);
                File file = c20542s6.f76986P;
                C20513q6 c20513q6 = c20190f.f75856r;
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    } catch (Throwable th3) {
                        c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Failed to delete replay segment: %s", file.getAbsolutePath());
                    }
                    break;
                }
                ((C22659b0) this.f75922z).f89329w = true;
                return Boolean.TRUE;
            default:
                InterfaceC22131e Canvas = (InterfaceC22131e) obj;
                AbstractC22676k.m65750j(Canvas, "$this$Canvas");
                InterfaceC22131e.m63383i0(Canvas, this.f75920x, 0L, Canvas.mo731d(), 0.0f, null, 0, 122);
                Rect rect = (Rect) this.f75921y;
                if (rect != null) {
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) this.f75922z;
                    float f13 = 12.0f * 2;
                    InterfaceC22131e.m63374D(Canvas, C17919x.f69636m, AbstractC15751g.m44450c(interfaceC39171c.mo743q0(rect.left) - 12.0f, interfaceC39171c.mo743q0(rect.top) - 12.0f), AbstractC21598x.m60672b(interfaceC39171c.mo743q0(rect.width()) + f13, interfaceC39171c.mo743q0(rect.height()) + f13), (((long) Float.floatToRawIntBits(8.0f)) << 32) | (((long) Float.floatToRawIntBits(8.0f)) & 4294967295L), null, 0.0f, 112);
                }
                return C23454a0.f92919a;
        }
    }
}
