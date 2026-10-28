package b30;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.InterfaceC1585g0;
import aws.smithy.kotlin.runtime.time.ParseException;
import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import com.stripe.android.view.CardMultilineWidget;
import dl1.AbstractC12170d;
import h00.AbstractC16518o;
import h20.EnumC16701n1;
import ih0.AbstractC18489d0;
import j93.InterfaceC21493z;
import k03.AbstractC22109n;
import l00.AbstractC23024f;
import l83.C23454a0;
import n03.C26096g;
import n03.C26097h;
import n03.C26098i;
import p095dp.AbstractC12240d;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32139c0;
import s40.C32142d0;
import se.AbstractC32417h;
import ug.AbstractC34924m;
import ug.C34917f;

/* JADX INFO: renamed from: b30.z */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2665z implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10429w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f10430x;

    public /* synthetic */ C2665z(String str, int i13) {
        this.f10429w = 4;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        this.f10430x = str;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x003e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f10429w;
        C34917f c34917f = null;
        Object[] objArr = 0;
        int i14 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String str = this.f10430x;
        switch (i13) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC34870c0.m110004k(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC34924m.m110148i(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC12240d.m34063b(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 3:
                return AbstractC12170d.m33664n(str, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                ((Integer) obj2).getClass();
                AbstractC16518o.m46683g(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 5:
                return AbstractC22109n.m63280Q(str, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                ((Integer) obj2).getClass();
                AbstractC23024f.m66786e(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC23024f.m66793l(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 8:
                return C26096g.m77633w(str, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return C26097h.m77641w(str, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return C26098i.m77649w(str, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                ((Integer) obj2).getClass();
                AbstractC32417h.m101204m(str, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 12:
                InterfaceC1585g0 doWithCardWidgetViewModel = (InterfaceC1585g0) obj;
                C32142d0 viewModel = (C32142d0) obj2;
                InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                AbstractC22676k.m65750j(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                AbstractC22676k.m65750j(viewModel, "viewModel");
                viewModel.f133181F = str;
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(viewModel), viewModel.f133184y, null, new C32139c0(viewModel, objArr == true ? 1 : 0, i14), 2);
                return c23454a0;
            case 13:
                String str2 = (String) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(str2, "str");
                AbstractC34924m.m110128J(iIntValue, str.length(), str2);
                int length = str.length();
                while (i14 < length) {
                    if (str2.charAt(iIntValue + i14) != str.charAt(i14)) {
                        StringBuilder sbM53375p = AbstractC18489d0.m53375p("expected `", str, "` found `");
                        String strSubstring = str2.substring(iIntValue, str.length() + iIntValue);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        throw new ParseException(str2, AbstractC25012a.m73377j(sbM53375p, strSubstring, '`'), iIntValue);
                    }
                    i14++;
                }
                return new C34917f(str.length() + iIntValue, str);
            default:
                String str3 = (String) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(str3, "str");
                AbstractC34924m.m110128J(iIntValue2, 1, str3);
                char cCharAt = str3.charAt(iIntValue2);
                int length2 = str.length();
                while (i14 < length2) {
                    char cCharAt2 = str.charAt(i14);
                    if (cCharAt2 == cCharAt) {
                        c34917f = new C34917f(iIntValue2 + 1, Character.valueOf(cCharAt2));
                        if (c34917f != null) {
                            return c34917f;
                        }
                        throw new ParseException(str3, "expected one of `" + str + "` found " + cCharAt, iIntValue2);
                    }
                    i14++;
                }
                if (c34917f != null) {
                    return c34917f;
                }
                throw new ParseException(str3, "expected one of `" + str + "` found " + cCharAt, iIntValue2);
        }
    }

    public /* synthetic */ C2665z(String str, int i13, byte b) {
        this.f10429w = i13;
        this.f10430x = str;
    }

    public /* synthetic */ C2665z(String str, int i13, int i14) {
        this.f10429w = i14;
        this.f10430x = str;
    }
}
