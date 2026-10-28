package p092dh;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import bc3.AbstractC3006f0;
import d30.C11546l;
import java.nio.ByteBuffer;
import mh.C25545m;
import mh.C25546n;
import ne3.C26611e0;
import p000.AbstractC30802r;
import p098dt.AbstractC12350b;
import p149fh.C14478b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dh.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12036w implements InterfaceC12023j {

    /* JADX INFO: renamed from: a */
    public final AbstractC12037x f39804a;

    /* JADX INFO: renamed from: b */
    public final C25545m f39805b;

    public C12036w(AbstractC12037x abstractC12037x, C25545m c25545m) {
        this.f39804a = abstractC12037x;
        this.f39805b = c25545m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p092dh.InterfaceC12023j
    /* JADX INFO: renamed from: a */
    public final Object mo33148a(InterfaceC30057d interfaceC30057d) {
        C12033t c12033t;
        C22659b0 c22659b0;
        C12036w c12036w;
        C22659b0 c22659b1;
        if (interfaceC30057d instanceof C12033t) {
            c12033t = (C12033t) interfaceC30057d;
            int i13 = c12033t.f39793E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12033t.f39793E = i13 - Integer.MIN_VALUE;
            } else {
                c12033t = new C12033t(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c12033t = new C12033t(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM33155c = c12033t.f39796y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12033t.f39793E;
        if (i14 != 0) {
            if (i14 == 1) {
                c22659b0 = c12033t.f39795x;
                c12036w = (C12036w) c12033t.f39794w;
                AbstractC34132o.m107864I(objM33155c);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22659b1 = (C22659b0) c12033t.f39794w;
                AbstractC34132o.m107864I(objM33155c);
            }
            return new C12021h((Drawable) objM33155c, c22659b1.f89329w);
        }
        AbstractC34132o.m107864I(objM33155c);
        C22659b0 c22659b2 = new C22659b0();
        C11546l c11546l = new C11546l(6, this, c22659b2);
        c12033t.f39794w = this;
        c12033t.f39795x = c22659b2;
        c12033t.f39793E = 1;
        Object objM8701G = AbstractC3006f0.m8701G(c11546l, c12033t);
        if (objM8701G != enumC31071a) {
            c22659b0 = c22659b2;
            objM33155c = objM8701G;
            c12036w = this;
        }
        return enumC31071a;
        c12033t.f39794w = c22659b0;
        c12033t.f39795x = null;
        c12033t.f39793E = 2;
        objM33155c = c12036w.m33155c((Drawable) objM33155c, c12033t);
        if (objM33155c != enumC31071a) {
            c22659b1 = c22659b0;
            return new C12021h((Drawable) objM33155c, c22659b1.f89329w);
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: b */
    public final ImageDecoder.Source m33154b(AbstractC12037x abstractC12037x) {
        C26611e0 c26611e0Mo33150V0 = abstractC12037x.mo33150V0();
        if (c26611e0Mo33150V0 != null) {
            return ImageDecoder.createSource(c26611e0Mo33150V0.toFile());
        }
        AbstractC12350b abstractC12350bMo33151b = abstractC12037x.mo33151b();
        boolean z4 = abstractC12350bMo33151b instanceof C12014a;
        C25545m c25545m = this.f39805b;
        if (z4) {
            return ImageDecoder.createSource(c25545m.f100135a.getAssets(), ((C12014a) abstractC12350bMo33151b).f39745a);
        }
        if (abstractC12350bMo33151b instanceof C12019f) {
            return ImageDecoder.createSource(c25545m.f100135a.getContentResolver(), ((C12019f) abstractC12350bMo33151b).f39759a);
        }
        if (abstractC12350bMo33151b instanceof C12038y) {
            C12038y c12038y = (C12038y) abstractC12350bMo33151b;
            if (c12038y.f39806a.equals(c25545m.f100135a.getPackageName())) {
                return ImageDecoder.createSource(c25545m.f100135a.getResources(), c12038y.f39807b);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            return ImageDecoder.createSource(abstractC12037x.mo33152d1().mo79220n());
        }
        return i13 == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(abstractC12037x.mo33152d1().mo79220n())) : ImageDecoder.createSource(abstractC12037x.mo33149D0().toFile());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Drawable m33155c(Drawable drawable, AbstractC32269c abstractC32269c) {
        C12035v c12035v;
        C12036w c12036w;
        if (abstractC32269c instanceof C12035v) {
            c12035v = (C12035v) abstractC32269c;
            int i13 = c12035v.f39803y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12035v.f39803y = i13 - Integer.MIN_VALUE;
            } else {
                c12035v = new C12035v(this, abstractC32269c);
            }
        } else {
            c12035v = new C12035v(this, abstractC32269c);
        }
        Object obj = c12035v.f39801w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12035v.f39803y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            C25545m c25545m = this.f39805b;
            C25546n c25546n = c25545m.f100146l;
            C25546n c25546n2 = c25545m.f100146l;
            AbstractC30802r.m94771t(c25546n.f100151w.get("coil#repeat_count"));
            ((AnimatedImageDrawable) drawable).setRepeatCount(-1);
            AbstractC30802r.m94771t(c25546n2.f100151w.get("coil#animation_start_callback"));
            AbstractC30802r.m94771t(c25546n2.f100151w.get("coil#animation_end_callback"));
            c12036w = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            drawable = null;
            c12036w = null;
        }
        return new C14478b(drawable, c12036w.f39805b.f100139e);
    }
}
