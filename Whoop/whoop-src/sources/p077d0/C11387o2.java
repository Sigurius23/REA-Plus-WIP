package p077d0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.whoop.android.R;
import f93.InterfaceC14291c;
import g40.C15426t3;
import g40.C15431u3;
import g40.C15436v3;
import g40.C15446x3;
import g40.C15451y3;
import g40.InterfaceC15421s3;
import ih0.AbstractC18489d0;
import j93.InterfaceC21493z;
import java.util.List;
import java.util.Locale;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p095dp.InterfaceC12237a;
import p429ql.C30456b;
import p464rl.InterfaceC31508c;
import p479s4.AbstractC32128i;
import p516u8.C34586d;
import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31196d;
import uc3.InterfaceC34767e;
import y00.EnumC38853i;

/* JADX INFO: renamed from: d0.o2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11387o2 implements InterfaceC11363i2, InterfaceC12237a, InterfaceC14291c, InterfaceC31508c, InterfaceC34767e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36514w;

    /* JADX INFO: renamed from: x */
    public int f36515x;

    public C11387o2(int i13) {
        this.f36514w = i13;
        switch (i13) {
            case 4:
                this.f36515x = Build.VERSION.SDK_INT;
                break;
            case 7:
                this.f36515x = 0;
                break;
            case 10:
                AbstractC32128i.m100064s(R.string.stripe_cvc_number_hint, new Object[0], C25271y.f99162w);
                this.f36515x = 8;
                break;
            default:
                this.f36515x = 3;
                break;
        }
    }

    @Override // uc3.InterfaceC34767e
    /* JADX INFO: renamed from: b */
    public String mo30616b() {
        switch (this.f36514w) {
            case 8:
                return AbstractC18489d0.m53371l(new StringBuilder("expected at least "), this.f36515x, " digits");
            default:
                return AbstractC18489d0.m53371l(new StringBuilder("expected at most "), this.f36515x, " digits");
        }
    }

    @Override // p095dp.InterfaceC12237a
    /* JADX INFO: renamed from: d */
    public int mo30617d(Context context, String str, boolean z4) {
        return 0;
    }

    @Override // p464rl.InterfaceC31508c
    /* JADX INFO: renamed from: e */
    public boolean mo30618e(Object obj, C30456b c30456b) {
        Drawable drawable = (Drawable) obj;
        View view = c30456b.f125176x;
        Drawable drawable2 = ((ImageView) view).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(this.f36515x);
        ((ImageView) view).setImageDrawable(transitionDrawable);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public C34586d m30619g() {
        return new C34586d(this.f36515x);
    }

    @Override // f93.InterfaceC14291c
    public Object getValue(Object obj, InterfaceC21493z property) {
        AbstractC31196d thisRef = (AbstractC31196d) obj;
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        return thisRef.f128521w.get(this.f36515x);
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return j7 < ((long) this.f36515x) * 1000000 ? abstractC11395r : abstractC11395r2;
    }

    @Override // p077d0.InterfaceC11363i2
    /* JADX INFO: renamed from: i */
    public int mo14111i() {
        return this.f36515x;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC15421s3 m30620j(EnumC38853i brand, List list, String number, int i13) {
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(number, "number");
        boolean z4 = brand.m124353b() != -1;
        if (number.length() == 0) {
            return C15426t3.f57978b;
        }
        if (brand == EnumC38853i.Unknown) {
            if (number.length() == i13) {
                return new C15446x3(null);
            }
        } else {
            if (z4 && number.length() == i13) {
                return new C15446x3(null);
            }
            if (!z4 || !brand.f167253F.contains(Integer.valueOf(number.length()))) {
                if (!z4 || number.length() >= i13) {
                    return (!z4 || number.length() <= i13) ? new C15436v3(R.string.stripe_invalid_cvc, 6, (List) null) : new C15436v3(R.string.stripe_invalid_cvc, 6, (List) null);
                }
                return new C15431u3(R.string.stripe_invalid_cvc);
            }
        }
        return C15451y3.f58039a;
    }

    @Override // p095dp.InterfaceC12237a
    /* JADX INFO: renamed from: k */
    public int mo30621k(Context context, String str) {
        return this.f36515x;
    }

    @Override // p077d0.InterfaceC11363i2
    /* JADX INFO: renamed from: l */
    public int mo14112l() {
        return 0;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return abstractC11395r3;
    }

    /* JADX INFO: renamed from: n */
    public void m30622n() {
        this.f36515x = 2;
    }

    /* JADX INFO: renamed from: o */
    public void m30623o(int i13) {
        if (i13 != 0) {
            if (i13 == 0) {
                i13 = 0;
            } else if (i13 != 2 && i13 != 1 && i13 != 23 && i13 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid environment value "));
            }
        }
        this.f36515x = i13;
    }

    public /* synthetic */ C11387o2(int i13, int i14) {
        this.f36514w = i14;
        this.f36515x = i13;
    }
}
