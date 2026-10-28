package p479s4;

import al.C0960g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import cc.C4409p;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.C13045h2;
import gl.C15956u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p005a3.AbstractC0262w0;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p474s.AbstractC32004s;
import p508ty.C34252f;
import p572w4.AbstractC36797c;
import p572w4.InterfaceC36796b;
import p586wk.InterfaceC37326d;
import p598wy.InterfaceC37689b;
import p635y2.C39136u0;
import p635y2.C39138v;
import p635y2.EnumC39142w0;
import p635y2.EnumC39145x0;
import p635y2.InterfaceC39080c0;
import p635y2.InterfaceC39124q0;
import p636y3.AbstractC39170b;
import p692zt.C41100d;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import v00.C35463e0;
import v00.C35465f0;
import v00.C35469h0;
import v00.C35479m0;
import v00.C35484p;
import v00.InterfaceC35471i0;
import vc.C35873a;
import x30.C37897i1;
import x30.C37912n1;
import y00.AbstractC38833g;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38793c;
import y00.C38829f5;
import y00.C38840g6;
import y00.C38849h5;
import y00.C38859i5;
import y00.C38887l3;
import y00.C38977v3;
import y00.C38985w2;
import y00.C38994x2;
import y00.EnumC38828f4;
import y00.EnumC38910o;
import y00.InterfaceC38802c8;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s4.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32121b implements InterfaceC37689b {
    /* JADX INFO: renamed from: A */
    public static void m99988A(Drawable drawable, float f13, float f14) {
        drawable.setHotspot(f13, f14);
    }

    /* JADX INFO: renamed from: B */
    public static void m99989B(Drawable drawable, int i13, int i14, int i15, int i16) {
        drawable.setHotspotBounds(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: C */
    public static void m99990C(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i13 = 0; i13 < length; i13++) {
                            if (charSequence.charAt(i13) == text.charAt(i13)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m99991D(int i13, Drawable drawable) {
        drawable.setTint(i13);
    }

    /* JADX INFO: renamed from: E */
    public static void m99992E(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: F */
    public static void m99993F(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX INFO: renamed from: G */
    public static byte[] m99994G(C41100d c41100d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(DfuBaseService.ERROR_REMOTE_MASK, Math.max(128, Integer.highestOneBit(0) * 2));
        int i13 = 0;
        while (i13 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i13);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i14 = 0;
            while (i14 < iMin2) {
                int i15 = c41100d.read(bArr, i14, iMin2 - i14);
                if (i15 == -1) {
                    return m100000e(arrayDeque, i13);
                }
                i14 += i15;
                i13 += i15;
            }
            long j7 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j7 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j7 < -2147483648L ? Integer.MIN_VALUE : (int) j7;
            }
        }
        if (c41100d.read() == -1) {
            return m100000e(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static Drawable m99995H(Drawable drawable) {
        if (!(drawable instanceof InterfaceC36796b)) {
            return drawable;
        }
        ((AbstractC36797c) ((InterfaceC36796b) drawable)).getClass();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final Boolean m99996a(AbstractC38869j5 abstractC38869j5) {
        if (abstractC38869j5 instanceof C38829f5) {
            return ((C38829f5) abstractC38869j5).f167136x;
        }
        if (abstractC38869j5 instanceof C38859i5) {
            return ((C38859i5) abstractC38869j5).f167279x;
        }
        if (abstractC38869j5 instanceof C38849h5) {
            return ((C38849h5) abstractC38869j5).f167226x;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m99997b(AbstractList abstractList, C35459c0 c35459c0, C35479m0 c35479m0) {
        Object next;
        String str;
        String v13;
        C37897i1 c37897i1 = new C37897i1(c35479m0.f151037f, c35479m0.f151038g);
        C13045h2 c13045h2 = (C13045h2) c37897i1.f162265c.f58004f;
        C35484p c35484p = c35459c0.f150973P;
        boolean z4 = false;
        boolean z13 = c35484p != null ? c35484p.f151062z : false;
        abstractList.add(c37897i1);
        if (z13) {
            Iterator it = c35479m0.f151034c.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    v13 = ((IdentifierSpec) ((Map.Entry) next).getKey()).getV1();
                    IdentifierSpec.Companion.getClass();
                }
            } while (!AbstractC39414r.m125876U(v13, IdentifierSpec.SetAsDefaultPaymentMethod.getV1(), false));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (str = (String) entry.getValue()) != null) {
                z4 = Boolean.parseBoolean(str);
            }
            abstractList.add(new C37912n1(z4, c13045h2, c35479m0.f151045n));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m99998c(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX INFO: renamed from: d */
    public static void m99999d(Drawable drawable) {
        drawable.canApplyTheme();
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m100000e(ArrayDeque arrayDeque, int i13) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i13) {
            return bArr;
        }
        int length = i13 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i13 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: f */
    public static int m100001f(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: g */
    public static ColorFilter m100002g(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX INFO: renamed from: h */
    public static int m100003h(C4409p c4409p) {
        return c4409p.getLayoutDirection();
    }

    /* JADX INFO: renamed from: i */
    public static Executor m100004i(Context context) {
        return context.getMainExecutor();
    }

    /* JADX INFO: renamed from: j */
    public static int m100005j(List list, InputStream inputStream, C0960g c0960g) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C15956u(inputStream, c0960g);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                int iMo45008c = ((InterfaceC37326d) list.get(i13)).mo45008c(inputStream, c0960g);
                inputStream.reset();
                if (iMo45008c != -1) {
                    return iMo45008c;
                }
            } catch (Throwable th3) {
                inputStream.reset();
                throw th3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static final String m100006k(Throwable th3) {
        AbstractC22676k.m65750j(th3, "<this>");
        if (th3 instanceof StripeException) {
            return ((StripeException) th3).getF22331G();
        }
        return th3 instanceof IOException ? "ioException" : "unknown";
    }

    /* JADX INFO: renamed from: l */
    public static ImageHeaderParser$ImageType m100007l(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo45006a = ((InterfaceC37326d) arrayList.get(i13)).mo45006a(byteBuffer);
            if (imageHeaderParser$ImageTypeMo45006a != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeMo45006a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: n */
    public static ImageHeaderParser$ImageType m100008n(List list, InputStream inputStream, C0960g c0960g) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C15956u(inputStream, c0960g);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo45007b = ((InterfaceC37326d) list.get(i13)).mo45007b(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo45007b != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo45007b;
                }
            } catch (Throwable th3) {
                inputStream.reset();
                throw th3;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: o */
    public static void m100009o(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m100010p(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m100011q(String code, InterfaceC35471i0 paymentMethodSaveConsentBehavior, InterfaceC38802c8 intent, boolean z4) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC22676k.m65750j(intent, "intent");
        if (paymentMethodSaveConsentBehavior instanceof C35463e0) {
            return false;
        }
        if (paymentMethodSaveConsentBehavior instanceof C35465f0) {
            return z4;
        }
        if (!(paymentMethodSaveConsentBehavior instanceof C35469h0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (intent instanceof C38887l3) {
            if (((C38887l3) intent).m124359b(code)) {
                return false;
            }
            return z4;
        }
        if (intent instanceof C38840g6) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: r */
    public static void m100012r(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: s */
    public static final C38994x2 m100013s(EnumC38828f4 enumC38828f4, boolean z4, AbstractC38970u5 abstractC38970u5, EnumC38910o enumC38910o) {
        EnumC38910o enumC38910oM124348d;
        if (enumC38828f4 == null) {
            return null;
        }
        boolean z13 = true;
        if (!z4 && !enumC38828f4.f167135z && ((abstractC38970u5 == null || (enumC38910oM124348d = AbstractC38833g.m124348d(abstractC38970u5)) == null || !AbstractC11894a.m31936D(enumC38910oM124348d)) && (enumC38910o == null || !AbstractC11894a.m31936D(enumC38910o)))) {
            z13 = false;
        }
        C38994x2 c38994x2 = new C38994x2(C38985w2.f167816z);
        if (z13 && enumC38828f4.f167134y) {
            return c38994x2;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m100014t(InterfaceC39080c0 interfaceC39080c0, AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return interfaceC39080c0.mo14262b(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C39136u0(interfaceC39124q0, EnumC39142w0.f168291x, EnumC39145x0.f168299x), AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: u */
    public static int m100015u(InterfaceC39080c0 interfaceC39080c0, AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return interfaceC39080c0.mo14262b(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C39136u0(interfaceC39124q0, EnumC39142w0.f168291x, EnumC39145x0.f168298w), AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }

    /* JADX INFO: renamed from: v */
    public static int m100016v(InterfaceC39080c0 interfaceC39080c0, AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return interfaceC39080c0.mo14262b(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C39136u0(interfaceC39124q0, EnumC39142w0.f168290w, EnumC39145x0.f168299x), AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: w */
    public static int m100017w(InterfaceC39080c0 interfaceC39080c0, AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return interfaceC39080c0.mo14262b(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C39136u0(interfaceC39124q0, EnumC39142w0.f168290w, EnumC39145x0.f168298w), AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }

    /* JADX INFO: renamed from: x */
    public static C35873a m100018x(String arn) {
        AbstractC22676k.m65750j(arn, "arn");
        List listM125905x0 = AbstractC39414r.m125905x0(arn, new char[]{':'}, 6, 2);
        if (listM125905x0.size() != 6) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("Malformed ARN (", arn, ") does not have the expected number of components").toString());
        }
        if (!AbstractC22676k.m65745e(listM125905x0.get(0), "arn")) {
            throw new IllegalArgumentException("Malformed ARN - does not start with `arn:`");
        }
        if (AbstractC39414r.m125890i0((CharSequence) listM125905x0.get(1))) {
            throw new IllegalArgumentException("Malformed ARN - no AWS partition specified");
        }
        if (AbstractC39414r.m125890i0((CharSequence) listM125905x0.get(2))) {
            throw new IllegalArgumentException("Malformed ARN - no AWS service specified");
        }
        C34252f c34252f = new C34252f();
        c34252f.f143668a = (String) listM125905x0.get(1);
        c34252f.f143669b = (String) listM125905x0.get(2);
        Object obj = listM125905x0.get(3);
        if (AbstractC39414r.m125890i0((String) obj)) {
            obj = null;
        }
        c34252f.f143670c = (String) obj;
        Object obj2 = listM125905x0.get(4);
        c34252f.f143671d = (String) (AbstractC39414r.m125890i0((String) obj2) ? null : obj2);
        c34252f.f143672e = (String) listM125905x0.get(5);
        String str = c34252f.f143668a;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("ARN partition must not be null or blank");
        }
        String str2 = c34252f.f143669b;
        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
            throw new IllegalArgumentException("ARN service must not be null or blank");
        }
        if (c34252f.f143672e != null) {
            return new C35873a(c34252f);
        }
        throw new IllegalArgumentException("ARN resource must not be null");
    }

    /* JADX INFO: renamed from: y */
    public static C38977v3 m100019y(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("address");
        return new C38977v3(jSONObjectOptJSONObject != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject)) : null, AbstractC32004s.m99551t(NotificationCompat.CATEGORY_EMAIL, jSONObject), AbstractC32004s.m99551t("name", jSONObject), AbstractC32004s.m99551t("phone", jSONObject));
    }

    /* JADX INFO: renamed from: z */
    public static void m100020z(Drawable drawable, boolean z4) {
        drawable.setAutoMirrored(z4);
    }
}
