package m40;

import android.graphics.Bitmap;
import androidx.compose.p018ui.graphics.painter.BitmapPainter;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.image.StripeImageState$Success;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p208i2.C17885g;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: m40.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C25036m extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f98075E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f98076F;

    /* JADX INFO: renamed from: w */
    public int f98077w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25046w f98078x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f98079y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f98080z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25036m(C25046w c25046w, String str, int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f98078x = c25046w;
        this.f98079y = str;
        this.f98080z = i13;
        this.f98075E = i14;
        this.f98076F = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C25036m(this.f98078x, this.f98079y, this.f98080z, this.f98075E, this.f98076F, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C25036m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM73487g;
        Bitmap bitmap;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f98077w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f98077w = 1;
            objM73487g = this.f98078x.m73487g(this.f98079y, this.f98080z, this.f98075E, this);
            if (objM73487g == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM73487g = ((C23468n) obj).f92940w;
        }
        boolean z4 = objM73487g instanceof C23467m;
        InterfaceC28601c1 interfaceC28601c1 = this.f98076F;
        if (!z4 && (bitmap = (Bitmap) objM73487g) != null) {
            interfaceC28601c1.setValue(new StripeImageState$Success(new BitmapPainter(new C17885g(bitmap))));
        }
        if (C23468n.m68037a(objM73487g) != null) {
            interfaceC28601c1.setValue(C25047x.f98137a);
        }
        return C23454a0.f92919a;
    }
}
