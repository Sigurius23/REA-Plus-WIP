package p195hh;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bh.C3240c;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import mh.C25542j;
import mh.C25545m;
import p341nh.C26714h;
import p425qh.AbstractC30358d;
import p477s2.AbstractC32073e;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: hh.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17275f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f66409E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f66410F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C17276g f66411G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C17270a f66412H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C25545m f66413I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ List f66414J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C3240c f66415K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C25542j f66416L;

    /* JADX INFO: renamed from: w */
    public List f66417w;

    /* JADX INFO: renamed from: x */
    public C25545m f66418x;

    /* JADX INFO: renamed from: y */
    public int f66419y;

    /* JADX INFO: renamed from: z */
    public int f66420z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17275f(C17276g c17276g, C17270a c17270a, C25545m c25545m, List list, C3240c c3240c, C25542j c25542j, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f66411G = c17276g;
        this.f66412H = c17270a;
        this.f66413I = c25545m;
        this.f66414J = list;
        this.f66415K = c3240c;
        this.f66416L = c25542j;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C17275f c17275f = new C17275f(this.f66411G, this.f66412H, this.f66413I, this.f66414J, this.f66415K, this.f66416L, interfaceC30057d);
        c17275f.f66410F = obj;
        return c17275f;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C17275f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2994c0 interfaceC2994c0;
        C25545m c25545m;
        Bitmap bitmapM99759r;
        List list;
        int size;
        int i13;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f66409E;
        C3240c c3240c = this.f66415K;
        C17270a c17270a = this.f66412H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC2994c0 = (InterfaceC2994c0) this.f66410F;
            Drawable drawable = c17270a.f66368a;
            boolean z4 = drawable instanceof BitmapDrawable;
            c25545m = this.f66413I;
            if (z4) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (AbstractC25260n.m74056a0(AbstractC30358d.f124548a, config)) {
                    bitmapM99759r = bitmap;
                } else {
                    bitmapM99759r = AbstractC32073e.m99759r(drawable, c25545m.f100136b, c25545m.f100138d, c25545m.f100139e, c25545m.f100140f);
                }
            } else {
                bitmapM99759r = AbstractC32073e.m99759r(drawable, c25545m.f100136b, c25545m.f100138d, c25545m.f100139e, c25545m.f100140f);
            }
            c3240c.getClass();
            list = this.f66414J;
            size = list.size();
            i13 = 0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f66420z;
            int i15 = this.f66419y;
            c25545m = this.f66418x;
            list = this.f66417w;
            interfaceC2994c0 = (InterfaceC2994c0) this.f66410F;
            AbstractC34132o.m107864I(obj);
            bitmapM99759r = (Bitmap) obj;
            AbstractC3006f0.m8720n(interfaceC2994c0);
            i13 = i15 + 1;
        }
        if (i13 >= size) {
            c3240c.getClass();
            return new C17270a(new BitmapDrawable(this.f66416L.f100108a.getResources(), bitmapM99759r), c17270a.f66369b, c17270a.f66370c, c17270a.f66371d);
        }
        if (list.get(i13) != null) {
            throw new ClassCastException();
        }
        C26714h c26714h = c25545m.f100138d;
        this.f66410F = interfaceC2994c0;
        this.f66417w = list;
        this.f66418x = c25545m;
        this.f66419y = i13;
        this.f66420z = size;
        this.f66409E = 1;
        throw null;
    }
}
