package p619xl;

import a33.C0352d;
import android.app.Application;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.RunnableC1319m;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1588h;
import androidx.viewpager.widget.ViewPager;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.C5057p;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5099k0;
import com.iterable.iterableapi.C5327g1;
import com.iterable.iterableapi.C5363q;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import cr.AbstractC11075m;
import cr.C11078p;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ed3.C13117a;
import g73.C15553a;
import gm.C15990r;
import hc3.AbstractC17176i;
import i20.C17970p0;
import i20.C17982v0;
import i20.InterfaceC17980u0;
import ih0.AbstractC18489d0;
import io.getstream.video.android.model.StreamCallId;
import j20.C21241c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jh3.AbstractC21702c;
import k83.InterfaceC22297a;
import kg.AbstractC22452f;
import kg.C22447a;
import kg.C22448b;
import kg.C22449c;
import kg.C22450d;
import kg.C22451e;
import kr.C22791j;
import l83.C23465k;
import l83.C23468n;
import m43.C25056b;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n30.C26212c;
import n30.InterfaceC26213d;
import no.nordicsemi.android.ble.AbstractC26903k0;
import no.nordicsemi.android.ble.InterfaceC26889d0;
import oa3.C27759b;
import oa3.C27775r;
import p000.AbstractC11266d;
import p002a0.C0006a1;
import p012ab.C0690l0;
import p027b3.AbstractC2417o0;
import p027b3.InterfaceC2418o1;
import p031b9.SurfaceHolderCallbackC2821c0;
import p088dc.AbstractC11895b;
import p127ev.C13668i;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p194hg.C17248i;
import p20.C28741c;
import p208i2.AbstractC17918w0;
import p208i2.C17896l0;
import p217ib.C18316m;
import p244j6.C21356a;
import p244j6.C21364i;
import p266jz.C22058f;
import p298l8.AbstractC23420c;
import p299l9.C23538y0;
import p303lg.AbstractC24026e;
import p303lg.AbstractC24027f;
import p303lg.C24022a;
import p303lg.C24023b;
import p303lg.C24024c;
import p309lo.AbstractC24543a;
import p332n3.InterfaceC26209d;
import p387oz.C28492a;
import p387oz.C28493b;
import p387oz.C28494c;
import p450r5.RunnableC30928b;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p470rv.AbstractC31834n;
import p479s4.AbstractC32123d;
import p499t9.AbstractC33618a;
import p499t9.C33642m;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p505ts.AbstractC34132o;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34629y0;
import p522uf.AbstractC34870c0;
import p530up.AbstractC35148d;
import p530up.C35147c;
import p543v4.C35643b;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p664yy.C39857f;
import p664yy.C39859g;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import qg3.C30352d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v03.InterfaceC35521h;
import va3.AbstractC35846d;
import va3.AbstractC35849g;
import va3.C35850h;
import wc3.InterfaceC37138c;
import y30.InterfaceC39190e;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39408l;
import yb3.C39410n;
import yb3.C39412p;

/* JADX INFO: renamed from: xl.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38445a implements InterfaceC2418o1, InterfaceC16915u, InterfaceC17980u0, InterfaceC26209d, InterfaceC26889d0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f164635w;

    /* JADX INFO: renamed from: x */
    public Object f164636x;

    /* JADX INFO: renamed from: y */
    public Object f164637y;

    public /* synthetic */ C38445a(int i13, Object obj, Object obj2) {
        this.f164635w = i13;
        this.f164636x = obj;
        this.f164637y = obj2;
    }

    /* JADX INFO: renamed from: q */
    public static void m123162q(C38445a c38445a, C30352d c30352d) {
        C0352d c0352d = (C0352d) c38445a.f164636x;
        long[] jArr = (long[]) c0352d.f1237x;
        C0352d c0352d2 = (C0352d) c30352d.f124535x;
        long[] jArr2 = (long[]) c0352d2.f1237x;
        long[] jArr3 = (long[]) c30352d.f124536y;
        AbstractC5078a.m15938k(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c0352d.f1238y;
        long[] jArr5 = (long[]) c0352d2.f1238y;
        long[] jArr6 = (long[]) c0352d2.f1239z;
        AbstractC5078a.m15938k(jArr4, jArr5, jArr6);
        AbstractC5078a.m15938k((long[]) c0352d.f1239z, jArr6, jArr3);
        AbstractC5078a.m15938k((long[]) c38445a.f164637y, (long[]) c0352d2.f1237x, (long[]) c0352d2.f1238y);
    }

    /* JADX INFO: renamed from: u */
    public static int m123163u(int i13, int i14) {
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            i15++;
            if (i15 == i14) {
                i16++;
                i15 = 0;
            } else if (i15 > i14) {
                i16++;
                i15 = 1;
            }
        }
        return i15 + 1 > i14 ? i16 + 1 : i16;
    }

    /* JADX INFO: renamed from: A */
    public char[] m123164A() {
        C5363q c5363q = (C5363q) this.f164636x;
        String strM16512e = c5363q.m16512e(";", "trying to read a char/entity reference");
        c5363q.m16508a(1, "trying to read the end of a char/entity reference");
        C39410n c39410nM125850d = AbstractC24027f.f94897a.m125850d(strM16512e);
        if (c39410nM125850d != null) {
            return AbstractC31834n.m98897f(Integer.parseInt((String) ((C39408l) c39410nM125850d.m125843a()).get(1)));
        }
        C39410n c39410nM125850d2 = AbstractC24027f.f94898b.m125850d(strM16512e);
        if (c39410nM125850d2 != null) {
            String str = (String) ((C39408l) c39410nM125850d2.m125843a()).get(1);
            AbstractC35846d.m113779c(16);
            return AbstractC31834n.m98897f(Integer.parseInt(str, 16));
        }
        Object obj = AbstractC24027f.f94899c.get(strM16512e);
        if (obj != null) {
            return (char[]) obj;
        }
        String strM95633i = AbstractC31061c.m95633i('\'', "Unknown reference '", strM16512e);
        int iMax = Math.max(0, c5363q.f21807c - 3);
        int iMin = Math.min(c5363q.f21806b - 1, c5363q.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strM95633i, "At offset " + c5363q.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, c5363q.f21805a, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax, " ") + '^')));
    }

    /* JADX INFO: renamed from: B */
    public AbstractC22452f m123165B() {
        int i13;
        boolean z4;
        boolean z13;
        AbstractC34870c0 c24024c;
        C5363q c5363q = (C5363q) this.f164636x;
        String str = c5363q.f21805a;
        int i14 = c5363q.f21806b;
        char cM16511d = c5363q.m16511d("looking for the start of a tag");
        String str2 = "):\n";
        if (cM16511d != '<') {
            String str3 = "Unexpected character '" + cM16511d + "' while looking for the start of a tag";
            int iMax = Math.max(0, c5363q.f21807c - 3);
            int iMin = Math.min(i14 - 1, c5363q.f21807c + 3);
            throw new DeserializationException(AbstractC11895b.m31992k('\n', str3, "At offset " + c5363q.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, str, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax, " ") + '^')));
        }
        if (c5363q.m16509b("!--")) {
            m123166C();
            AbstractC22452f abstractC22452fM123186x = m123186x();
            AbstractC22676k.m65747g(abstractC22452fM123186x);
            return abstractC22452fM123186x;
        }
        if (c5363q.m16509b("/")) {
            C24024c c24024c2 = (C24024c) ((AbstractC34870c0) this.f164637y);
            C22450d c22450d = c24024c2.f94893x;
            C22450d c22450dM123188z = m123188z();
            if (!c22450dM123188z.equals(c22450d)) {
                String str4 = "Unexpected '/" + c22450dM123188z + "' tag while looking for '/" + c22450d + "' tag";
                int iMax2 = Math.max(0, c5363q.f21807c - 3);
                int iMin2 = Math.min(i14 - 1, c5363q.f21807c + 3);
                throw new DeserializationException(AbstractC11895b.m31992k('\n', str4, "At offset " + c5363q.f21807c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin2, str, 1, iMax2, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax2, " ") + '^')));
            }
            m123167D();
            char cM16511d2 = c5363q.m16511d("looking for the end of a tag");
            if (cM16511d2 == '>') {
                Object obj = c24024c2.f94894y;
                if (obj == null) {
                    obj = C24022a.f94887z;
                }
                this.f164637y = obj;
                return new C22448b(c24024c2.f94892E, c22450dM123188z);
            }
            String str5 = "Unexpected character '" + cM16511d2 + "' while looking for the end of a tag";
            int iMax3 = Math.max(0, c5363q.f21807c - 3);
            int iMin3 = Math.min(i14 - 1, c5363q.f21807c + 3);
            throw new DeserializationException(AbstractC11895b.m31992k('\n', str5, "At offset " + c5363q.f21807c + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin3, str, 1, iMax3, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax3, " ") + '^')));
        }
        AbstractC34870c0 abstractC34870c0 = (AbstractC34870c0) this.f164637y;
        C24024c c24024c3 = abstractC34870c0 instanceof C24024c ? (C24024c) abstractC34870c0 : null;
        C24024c c24024cM70880r0 = c24024c3 != null ? C24024c.m70880r0(c24024c3) : null;
        C22450d c22450dM123188z2 = m123188z();
        m123167D();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            char cM16511d3 = c5363q.m16511d("looking for the end of a tag");
            i13 = i14;
            if (cM16511d3 == '/') {
                z4 = true;
                break;
            }
            if (cM16511d3 == '>') {
                z4 = false;
                break;
            }
            c5363q.m16513f("looking for the beginning of an attribute");
            C23465k c23465kM123187y = m123187y();
            linkedHashMap.put(c23465kM123187y.f92937w, c23465kM123187y.f92938x);
            m123167D();
            i14 = i13;
        }
        C39412p c39412p = AbstractC24027f.f94897a;
        List listM73999h0 = AbstractC25247g0.m73999h0(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM73999h0.iterator();
        while (true) {
            z13 = z4;
            if (!it.hasNext()) {
                break;
            }
            Iterator it3 = it;
            Object next = it3.next();
            C22450d c22450d2 = (C22450d) ((C23465k) next).f92937w;
            String str6 = str2;
            String str7 = c22450d2.f87883a;
            String str8 = c22450d2.f87884b;
            if ((AbstractC22676k.m65745e(str7, "xmlns") && str8 == null) || AbstractC22676k.m65745e(str8, "xmlns")) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
            it = it3;
            z4 = z13;
            str2 = str6;
        }
        String str9 = str2;
        Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList2);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C23465k c23465k = (C23465k) it4.next();
            Map map = mapM74000i0;
            String str10 = (String) c23465k.f92938x;
            C22450d c22450d3 = (C22450d) c23465k.f92937w;
            Iterator it5 = it4;
            arrayList3.add(new C22449c(str10, AbstractC22676k.m65745e(c22450d3.f87883a, "xmlns") ? null : c22450d3.f87883a));
            mapM74000i0 = map;
            it4 = it5;
        }
        Map map2 = mapM74000i0;
        if (!z13) {
            c24024c = new C24024c(c22450dM123188z2, c24024cM70880r0, false);
        } else {
            if (c5363q.m16511d("looking for the end of a tag") != '>') {
                int iMax4 = Math.max(0, c5363q.f21807c - 3);
                int iMin4 = Math.min(i13 - 1, c5363q.f21807c + 3);
                throw new DeserializationException(AbstractC11266d.m30461o("Unexpected characters while looking for the end of a tag\n", "At offset " + c5363q.f21807c + " (showing range " + iMax4 + '-' + iMin4 + str9 + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin4, str, 1, iMax4, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax4, " ") + '^')));
            }
            c24024c = new C24023b(c22450dM123188z2, c24024cM70880r0);
        }
        this.f164637y = c24024c;
        return new C22447a(c24024c.mo70879Q(), c22450dM123188z2, map2, arrayList3);
    }

    /* JADX INFO: renamed from: C */
    public void m123166C() {
        C5363q c5363q = (C5363q) this.f164636x;
        String str = c5363q.f21805a;
        int iM125888g0 = AbstractC39414r.m125888g0(str, "-->", c5363q.f21807c, false, 4);
        if (iM125888g0 >= 0) {
            int i13 = 3 + iM125888g0;
            c5363q.m16514g(i13);
            c5363q.f21807c = i13;
            return;
        }
        String strConcat = "Unexpected end-of-doc while ".concat("looking for the end of a comment");
        int iMax = Math.max(0, c5363q.f21807c - 3);
        int iMin = Math.min(c5363q.f21806b - 1, c5363q.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strConcat, "At offset " + c5363q.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, str, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax, " ") + '^')));
    }

    /* JADX INFO: renamed from: D */
    public void m123167D() {
        C5363q c5363q = (C5363q) this.f164636x;
        while (true) {
            int i13 = c5363q.f21807c;
            if (i13 >= c5363q.f21806b) {
                return;
            }
            char cCharAt = c5363q.f21805a.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') {
                return;
            } else {
                c5363q.f21807c++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public Object m123168E(C22058f c22058f, String str, AbstractC32269c abstractC32269c) {
        C28494c c28494c;
        if (abstractC32269c instanceof C28494c) {
            c28494c = (C28494c) abstractC32269c;
            int i13 = c28494c.f115379y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28494c.f115379y = i13 - Integer.MIN_VALUE;
            } else {
                c28494c = new C28494c(this, abstractC32269c);
            }
        } else {
            c28494c = new C28494c(this, abstractC32269c);
        }
        Object obj = c28494c.f115377w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28494c.f115379y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C15990r c15990r = (C15990r) this.f164636x;
        C29938w0 c29938w0 = (C29938w0) this.f164637y;
        AbstractC22676k.m65750j(c22058f, "<this>");
        C39859g c39859gM91543n = C29938w0.m91543n(c29938w0, "https://api.stripe.com/v1/financial_connections/sessions/synchronize", new C39857f(new C28492a(c22058f, 0), new C28492a(c22058f, 1)), AbstractC25247g0.m73990Y(new C23465k("locale", Locale.getDefault().toLanguageTag()), new C23465k("mobile", AbstractC25247g0.m73990Y(new C23465k("fullscreen", Boolean.TRUE), new C23465k("hide_close_button", Boolean.FALSE), new C23465k("application_id", str), new C23465k("mobile_sdk_type", "fc_lite"))), new C23465k("client_secret", c22058f.f85568w)), 8);
        InterfaceC37138c interfaceC37138cSerializer = SynchronizeSessionResponse.Companion.serializer();
        c28494c.f115379y = 1;
        Object objM45140C = c15990r.m45140C(c39859gM91543n, interfaceC37138cSerializer, c28494c);
        return objM45140C == enumC31071a ? enumC31071a : objM45140C;
    }

    /* JADX INFO: renamed from: F */
    public InterfaceC33639k0 m123169F(int i13) {
        int i14 = 0;
        while (true) {
            int[] iArr = (int[]) this.f164636x;
            if (i14 >= iArr.length) {
                AbstractC38046a.m121812g("BaseMediaChunkOutput", "Unmatched track of type: " + i13);
                return new C33642m();
            }
            if (i13 == iArr[i14]) {
                return ((C23538y0[]) this.f164637y)[i14];
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m123170G(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f164636x;
        Object parent = view.getParent();
        if (parent instanceof View) {
            m123170G((View) parent, fArr);
            float f13 = -view.getScrollX();
            float f14 = -view.getScrollY();
            C17896l0.m51474d(fArr2);
            C17896l0.m51477g(fArr2, f13, f14);
            AbstractC2417o0.m7422n(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C17896l0.m51474d(fArr2);
            C17896l0.m51477g(fArr2, left, top);
            AbstractC2417o0.m7422n(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f164637y;
            view.getLocationInWindow(iArr);
            float f15 = -view.getScrollX();
            float f16 = -view.getScrollY();
            C17896l0.m51474d(fArr2);
            C17896l0.m51477g(fArr2, f15, f16);
            AbstractC2417o0.m7422n(fArr, fArr2);
            float f17 = iArr[0];
            float f18 = iArr[1];
            C17896l0.m51474d(fArr2);
            C17896l0.m51477g(fArr2, f17, f18);
            AbstractC2417o0.m7422n(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC17918w0.m51500B(matrix, fArr2);
        AbstractC2417o0.m7422n(fArr, fArr2);
    }

    /* JADX INFO: renamed from: H */
    public void m123171H(C34629y0 c34629y0) {
        Handler handler = (Handler) this.f164636x;
        if (handler != null) {
            handler.post(new RunnableC30928b(3, this, c34629y0));
        }
    }

    /* JADX INFO: renamed from: I */
    public C15990r m123172I(C35850h c35850h, String desc) {
        AbstractC22676k.m65750j(desc, "desc");
        String strM113817b = c35850h.m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return new C15990r(this, new C27775r(AbstractC11895b.m31992k('#', strM113817b, desc)));
    }

    /* JADX INFO: renamed from: J */
    public C27759b m123173J(C35850h name, String str) {
        AbstractC22676k.m65750j(name, "name");
        String strM113817b = name.m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return new C27759b(this, new C27775r(strM113817b.concat(str)));
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26889d0
    /* JADX INFO: renamed from: a */
    public void mo80329a(Runnable runnable) {
        Handler handler = (Handler) this.f164636x;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        } else {
            ((AbstractC26903k0) this.f164637y).f107382a.mo80329a(runnable);
        }
    }

    @Override // p332n3.InterfaceC26209d
    /* JADX INFO: renamed from: b */
    public int mo77821b(int i13) {
        CharSequence charSequence = (CharSequence) this.f164636x;
        do {
            i13 = ((C5057p) this.f164637y).m15867j(i13);
            if (i13 == -1 || i13 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i13)));
        return i13;
    }

    @Override // p332n3.InterfaceC26209d
    /* JADX INFO: renamed from: c */
    public int mo77822c(int i13) {
        do {
            i13 = ((C5057p) this.f164637y).m15868k(i13);
            if (i13 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f164636x).charAt(i13)));
        return i13;
    }

    @Override // i20.InterfaceC17980u0
    public C17982v0 create(Class cls, AbstractC23420c extras) {
        AbstractC22676k.m65750j(extras, "extras");
        C28741c c28741c = (C28741c) ((InterfaceC22297a) this.f164636x).get();
        Application applicationM111160K = AbstractC35148d.m111160K(extras);
        C17970p0 c17970p0 = (C17970p0) this.f164637y;
        c28741c.getClass();
        C22791j c22791j = c28741c.f116330a;
        return new C17982v0((InterfaceC39190e) ((InterfaceC35521h) c22791j.f89764l).get(), c17970p0, (C21241c) ((InterfaceC35521h) c22791j.f89763k).get(), applicationM111160K);
    }

    @Override // p332n3.InterfaceC26209d
    /* JADX INFO: renamed from: d */
    public int mo77823d(int i13) {
        do {
            i13 = ((C5057p) this.f164637y).m15867j(i13);
            if (i13 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f164636x).charAt(i13 - 1)));
        return i13;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26889d0
    /* JADX INFO: renamed from: e */
    public void mo80334e(Runnable runnable) {
        Handler handler = (Handler) this.f164636x;
        if (handler != null) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // p332n3.InterfaceC26209d
    /* JADX INFO: renamed from: f */
    public int mo77824f(int i13) {
        do {
            i13 = ((C5057p) this.f164637y).m15868k(i13);
            if (i13 == -1 || i13 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f164636x).charAt(i13 - 1)));
        return i13;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26889d0
    /* JADX INFO: renamed from: g */
    public void mo80337g(Runnable runnable, long j7) {
        Handler handler = (Handler) this.f164636x;
        if (handler != null) {
            handler.postDelayed(runnable, j7);
        } else {
            ((AbstractC26903k0) this.f164637y).f107382a.mo80337g(runnable, j7);
        }
    }

    @Override // p027b3.InterfaceC2418o1
    /* JADX INFO: renamed from: h */
    public void mo7425h(View view, float[] fArr) {
        C17896l0.m51474d(fArr);
        m123170G(view, fArr);
    }

    /* JADX INFO: renamed from: i */
    public C1588h m123174i() {
        C18316m c18316m = (C18316m) this.f164636x;
        AbstractC5583n abstractC5583n = (AbstractC5583n) this.f164637y;
        C13668i c13668i = new C13668i();
        c13668i.f48461h = abstractC5583n;
        c13668i.f48462i = c18316m;
        c13668i.f48454a = new C1588h(c13668i);
        c13668i.f48455b = new AtomicBoolean(true);
        c13668i.f48456c = new AtomicBoolean(false);
        c13668i.f48457d = new RunnableC1319m(c13668i, 4);
        c13668i.f48460g = new C15553a(7);
        return (C1588h) c13668i.f48454a;
    }

    /* JADX INFO: renamed from: j */
    public void m123175j() {
        this.f164636x = null;
        this.f164637y = null;
    }

    /* JADX INFO: renamed from: k */
    public void m123176k(long j7, C13117a c13117a) {
        if (c13117a.m36692a() < 9) {
            return;
        }
        int iM36699i = c13117a.m36699i();
        int iM36699i2 = c13117a.m36699i();
        int iM36715y = c13117a.m36715y();
        if (iM36699i == 434 && iM36699i2 == 1195456820 && iM36715y == 3) {
            AbstractC32123d.m100023c(j7, c13117a, (InterfaceC37377s[]) this.f164637y);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m123177l(long j7, C38059n c38059n) {
        if (c38059n.m121848a() < 9) {
            return;
        }
        int iM121854g = c38059n.m121854g();
        int iM121854g2 = c38059n.m121854g();
        int iM121867t = c38059n.m121867t();
        if (iM121854g == 434 && iM121854g2 == 1195456820 && iM121867t == 3) {
            AbstractC33618a.m106213e(j7, c38059n, (InterfaceC33639k0[]) this.f164637y);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m123178m(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        InterfaceC33639k0[] interfaceC33639k0Arr = (InterfaceC33639k0[]) this.f164637y;
        for (int i13 = 0; i13 < interfaceC33639k0Arr.length; i13++) {
            c0690l0.m1733c();
            c0690l0.m1738h();
            InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 3);
            C34610p c34610p = (C34610p) ((List) this.f164636x).get(i13);
            String str = c34610p.f145783n;
            AbstractC35849g.m113803e("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            C34608o c34608o = new C34608o();
            c0690l0.m1738h();
            c34608o.f145729a = (String) c0690l0.f2495f;
            c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
            c34608o.f145741m = AbstractC34587d0.m109382o(str);
            c34608o.f145733e = c34610p.f145774e;
            c34608o.f145732d = c34610p.f145773d;
            c34608o.f145724H = c34610p.f145764I;
            c34608o.f145744p = c34610p.f145786q;
            AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o);
            interfaceC33639k0Arr[i13] = interfaceC33639k0Mo3101o;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m123179n(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        InterfaceC37377s[] interfaceC37377sArr = (InterfaceC37377s[]) this.f164637y;
        for (int i13 = 0; i13 < interfaceC37377sArr.length; i13++) {
            c0690l0.m1733c();
            c0690l0.m1738h();
            InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 3);
            C31521c0 c31521c0 = (C31521c0) ((List) this.f164636x).get(i13);
            String str = c31521c0.f130077L;
            boolean z4 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            AbstractC24543a.m71570f(z4, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            C31518b0 c31518b0 = new C31518b0();
            c0690l0.m1738h();
            c31518b0.f130037a = (String) c0690l0.f2495f;
            c31518b0.f130047k = str;
            c31518b0.f130040d = c31521c0.f130101z;
            c31518b0.f130039c = c31521c0.f130100y;
            c31518b0.f130035C = c31521c0.f130095d0;
            c31518b0.f130049m = c31521c0.f130079N;
            interfaceC37377sMo3102o.mo102730a(new C31521c0(c31518b0));
            interfaceC37377sArr[i13] = interfaceC37377sMo3102o;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        boolean z4;
        switch (this.f164635w) {
            case 8:
                C5327g1 c5327g1 = (C5327g1) this.f164636x;
                C11078p c11078p = (C11078p) this.f164637y;
                int i13 = c11078p.f35038a;
                int i14 = c11078p.f35039b;
                int i15 = c11078p.f35040c;
                C16899o1 c16899o1 = c16905q1.f64864a;
                C35643b c35643bMo47530g = c16899o1.mo47530g(7);
                C35643b c35643bMo47530g2 = c16899o1.mo47530g(32);
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c5327g1.f21695x;
                int i16 = c35643bMo47530g.f151450b;
                int i17 = c35643bMo47530g.f151451c;
                int i18 = c35643bMo47530g.f151449a;
                bottomSheetBehavior.f20826w = i16;
                boolean zM29872f = AbstractC11075m.m29872f(view);
                int paddingBottom = view.getPaddingBottom();
                int paddingLeft = view.getPaddingLeft();
                int paddingRight = view.getPaddingRight();
                boolean z13 = bottomSheetBehavior.f20818o;
                if (z13) {
                    int iM47597a = c16905q1.m47597a();
                    bottomSheetBehavior.f20825v = iM47597a;
                    paddingBottom = iM47597a + i15;
                }
                if (bottomSheetBehavior.f20819p) {
                    paddingLeft = (zM29872f ? i14 : i13) + i18;
                }
                if (bottomSheetBehavior.f20820q) {
                    if (!zM29872f) {
                        i13 = i14;
                    }
                    paddingRight = i13 + i17;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                boolean z14 = true;
                if (!bottomSheetBehavior.f20822s || marginLayoutParams.leftMargin == i18) {
                    z4 = false;
                } else {
                    marginLayoutParams.leftMargin = i18;
                    z4 = true;
                }
                if (bottomSheetBehavior.f20823t && marginLayoutParams.rightMargin != i17) {
                    marginLayoutParams.rightMargin = i17;
                    z4 = true;
                }
                if (bottomSheetBehavior.f20824u) {
                    int i19 = marginLayoutParams.topMargin;
                    int i24 = c35643bMo47530g.f151450b;
                    if (i19 != i24) {
                        marginLayoutParams.topMargin = i24;
                    } else {
                        z14 = z4;
                    }
                } else {
                    z14 = z4;
                }
                if (z14) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                boolean z15 = c5327g1.f21694w;
                if (z15) {
                    bottomSheetBehavior.f20816m = c35643bMo47530g2.f151452d;
                }
                if (z13 || z15) {
                    bottomSheetBehavior.m15712d0();
                }
                return c16905q1;
            default:
                ViewPager viewPager = (ViewPager) this.f164637y;
                C16905q1 c16905q1M47578i = AbstractC16901p0.m47578i(view, c16905q1);
                if (c16905q1M47578i.f64864a.mo47545o()) {
                    return c16905q1M47578i;
                }
                Rect rect = (Rect) this.f164636x;
                rect.left = c16905q1M47578i.m47598b();
                rect.top = c16905q1M47578i.m47600d();
                rect.right = c16905q1M47578i.m47599c();
                rect.bottom = c16905q1M47578i.m47597a();
                int childCount = viewPager.getChildCount();
                for (int i25 = 0; i25 < childCount; i25++) {
                    C16905q1 c16905q1M47571b = AbstractC16901p0.m47571b(viewPager.getChildAt(i25), c16905q1M47578i);
                    rect.left = Math.min(c16905q1M47571b.m47598b(), rect.left);
                    rect.top = Math.min(c16905q1M47571b.m47600d(), rect.top);
                    rect.right = Math.min(c16905q1M47571b.m47599c(), rect.right);
                    rect.bottom = Math.min(c16905q1M47571b.m47597a(), rect.bottom);
                }
                return c16905q1M47578i.m47601f(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m123180p(C17248i c17248i) {
        ArrayList arrayList = (ArrayList) this.f164636x;
        c17248i.f66267b = arrayList.size();
        arrayList.add(c17248i);
    }

    /* JADX INFO: renamed from: r */
    public Object m123181r() {
        return this.f164636x;
    }

    /* JADX INFO: renamed from: s */
    public StreamCallId m123182s() {
        return ((C25056b) ((C13045h2) this.f164637y).getValue()).f98184a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public Object m123183t(C22058f c22058f, AbstractC32269c abstractC32269c) {
        C28493b c28493b;
        if (abstractC32269c instanceof C28493b) {
            c28493b = (C28493b) abstractC32269c;
            int i13 = c28493b.f115376y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28493b.f115376y = i13 - Integer.MIN_VALUE;
            } else {
                c28493b = new C28493b(this, abstractC32269c);
            }
        } else {
            c28493b = new C28493b(this, abstractC32269c);
        }
        Object obj = c28493b.f115374w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28493b.f115376y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C29938w0 c29938w0 = (C29938w0) this.f164637y;
        AbstractC22676k.m65750j(c22058f, "<this>");
        C39859g c39859gM91542m = C29938w0.m91542m(c29938w0, "https://api.stripe.com/v1/link_account_sessions/session_receipt", new C39857f(new C28492a(c22058f, 0), new C28492a(c22058f, 1)), AbstractC31061c.m95645u("client_secret", c22058f.f85568w), 8);
        C15990r c15990r = (C15990r) this.f164636x;
        InterfaceC37138c interfaceC37138cSerializer = FinancialConnectionsSession.Companion.serializer();
        c28493b.f115376y = 1;
        Object objM45140C = c15990r.m45140C(c39859gM91542m, interfaceC37138cSerializer, c28493b);
        return objM45140C == enumC31071a ? enumC31071a : objM45140C;
    }

    public String toString() {
        switch (this.f164635w) {
            case 16:
                StringBuilder sb4 = new StringBuilder("NetworkBody{body=");
                sb4.append(this.f164636x);
                sb4.append(", warnings=");
                return AbstractC17176i.m48506h(sb4, (List) this.f164637y, '}');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public List m123184v() {
        return (List) this.f164637y;
    }

    /* JADX INFO: renamed from: w */
    public void m123185w() {
        ((SparseIntArray) this.f164636x).clear();
    }

    /* JADX INFO: renamed from: x */
    public AbstractC22452f m123186x() {
        char cCharAt;
        C24022a c24022a = C24022a.f94886y;
        C5363q c5363q = (C5363q) this.f164636x;
        AbstractC34870c0 abstractC34870c0 = (AbstractC34870c0) this.f164637y;
        Object obj = C24022a.f94887z;
        if (abstractC34870c0.equals(obj)) {
            return null;
        }
        if (abstractC34870c0 instanceof C24023b) {
            C24023b c24023b = (C24023b) abstractC34870c0;
            C24024c c24024c = c24023b.f94890y;
            if (c24024c != null) {
                obj = c24024c;
            }
            this.f164637y = obj;
            return new C22448b(c24023b.f94891z, c24023b.f94889x);
        }
        boolean z4 = true;
        if (!(abstractC34870c0 instanceof C24024c)) {
            if (!abstractC34870c0.equals(C24022a.f94885E)) {
                if (!abstractC34870c0.equals(c24022a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m123167D();
                return m123165B();
            }
            m123167D();
            while (c5363q.m16509b("<?")) {
                while (true) {
                    int i13 = c5363q.f21807c;
                    if (i13 >= c5363q.f21806b || (cCharAt = c5363q.f21805a.charAt(i13)) == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ') {
                        break;
                    }
                    c5363q.f21807c++;
                }
                m123167D();
                while (!c5363q.m16509b("?>")) {
                    m123187y();
                    m123167D();
                }
                m123167D();
            }
            this.f164637y = c24022a;
            return m123186x();
        }
        if (c5363q.m16510c("<") && !c5363q.m16510c("<![CDATA[")) {
            return m123165B();
        }
        StringBuilder sb4 = new StringBuilder();
        while (true) {
            char cM16511d = c5363q.m16511d("reading text node");
            if (cM16511d == '\t' || cM16511d == '\n' || cM16511d == '\r' || cM16511d == ' ') {
                sb4.append(cM16511d);
            } else {
                if (cM16511d == '&') {
                    sb4.append(m123164A());
                } else if (cM16511d == '<') {
                    if (!c5363q.m16509b("!--")) {
                        if (!c5363q.m16509b("![CDATA[")) {
                            break;
                        }
                        String strM16512e = c5363q.m16512e("]]>", "trying to read CDATA content");
                        c5363q.m16508a(3, "trying to read end of CATA");
                        sb4.append(strM16512e);
                    } else {
                        m123166C();
                    }
                } else {
                    sb4.append(cM16511d);
                }
                z4 = false;
            }
        }
        c5363q.m16513f("looking for the beginning of a tag");
        String string = sb4.toString();
        C24024c c24024c2 = (C24024c) ((AbstractC34870c0) this.f164637y);
        boolean z13 = c24024c2.f94895z;
        boolean zM16510c = c5363q.m16510c("</");
        C24024c c24024cM70880r0 = C24024c.m70880r0(c24024c2);
        this.f164637y = c24024cM70880r0;
        if (!z4 || (!z13 && zM16510c)) {
            return new C22451e(c24024cM70880r0.f94892E, string);
        }
        AbstractC22452f abstractC22452fM123186x = m123186x();
        AbstractC22676k.m65747g(abstractC22452fM123186x);
        return abstractC22452fM123186x;
    }

    /* JADX INFO: renamed from: y */
    public C23465k m123187y() {
        C22450d c22450dM123188z = m123188z();
        m123167D();
        C5363q c5363q = (C5363q) this.f164636x;
        int i13 = c5363q.f21806b;
        String str = c5363q.f21805a;
        char cM16511d = c5363q.m16511d("trying to read attribute equals");
        int i14 = 1;
        if (cM16511d != '=') {
            String str2 = "Unexpected '" + cM16511d + "' while trying to read attribute equals";
            int iMax = Math.max(0, c5363q.f21807c - 3);
            int iMin = Math.min(i13 - 1, c5363q.f21807c + 3);
            throw new DeserializationException(AbstractC11895b.m31992k('\n', str2, "At offset " + c5363q.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, str, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax, " ") + '^')));
        }
        m123167D();
        char cM16511d2 = c5363q.m16511d("trying to read attribute value");
        if (cM16511d2 != '\'' && cM16511d2 != '\"') {
            String str3 = "Unexpected '" + cM16511d2 + "' while trying to read attribute value";
            int iMax2 = Math.max(0, c5363q.f21807c - 3);
            int iMin2 = Math.min(i13 - 1, c5363q.f21807c + 3);
            throw new DeserializationException(AbstractC11895b.m31992k('\n', str3, "At offset " + c5363q.f21807c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin2, str, 1, iMax2, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax2, " ") + '^')));
        }
        StringBuilder sb4 = new StringBuilder();
        while (true) {
            char cM16511d3 = c5363q.m16511d("trying to read a string");
            int i15 = i14;
            if (cM16511d3 == '&') {
                sb4.append(m123164A());
            } else {
                if (cM16511d3 == '<') {
                    int iMax3 = Math.max(0, c5363q.f21807c - 3);
                    int iMin3 = Math.min(i13 - 1, c5363q.f21807c + 3);
                    throw new DeserializationException(AbstractC11266d.m30461o("Unexpected '<' while trying to read a string\n", "At offset " + c5363q.f21807c + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin3, str, i15, iMax3, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax3, " ") + '^')));
                }
                if (cM16511d3 == cM16511d2) {
                    return new C23465k(c22450dM123188z, sb4.toString());
                }
                sb4.append(cM16511d3);
            }
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: z */
    public C22450d m123188z() {
        C5363q c5363q = (C5363q) this.f164636x;
        String str = c5363q.f21805a;
        int i13 = c5363q.f21806b;
        char cCharAt = str.charAt(c5363q.f21807c);
        int i14 = 65;
        if ((AbstractC22676k.m65751k(97, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 122) > 0) && ((AbstractC22676k.m65751k(65, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 90) > 0) && cCharAt != ':' && cCharAt != '_' && ((AbstractC22676k.m65751k(192, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 214) > 0) && ((AbstractC22676k.m65751k(216, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 246) > 0) && ((AbstractC22676k.m65751k(248, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 767) > 0) && ((AbstractC22676k.m65751k(880, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 893) > 0) && ((AbstractC22676k.m65751k(895, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 8191) > 0) && ((AbstractC22676k.m65751k(8204, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 8205) > 0) && ((AbstractC22676k.m65751k(8304, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 8591) > 0) && ((AbstractC22676k.m65751k(11264, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 12271) > 0) && (AbstractC22676k.m65751k(12289, cCharAt) > 0 || AbstractC22676k.m65751k(cCharAt, 55295) > 0))))))))))) {
            String str2 = "Found '" + cCharAt + "' but expected a valid XML start name character";
            int iMax = Math.max(0, c5363q.f21807c - 3);
            int iMin = Math.min(i13 - 1, c5363q.f21807c + 3);
            throw new DeserializationException(AbstractC11895b.m31992k('\n', str2, "At offset " + c5363q.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, str, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax, " ") + '^')));
        }
        int i15 = c5363q.f21807c + 1;
        while (i15 < i13) {
            char cCharAt2 = str.charAt(i15);
            if ((AbstractC22676k.m65751k(97, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 122) > 0) && ((AbstractC22676k.m65751k(i14, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 90) > 0) && ((AbstractC22676k.m65751k(48, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 57) > 0) && cCharAt2 != ':' && cCharAt2 != '-' && cCharAt2 != '.' && cCharAt2 != '_' && cCharAt2 != 183 && ((AbstractC22676k.m65751k(192, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 214) > 0) && ((AbstractC22676k.m65751k(216, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 246) > 0) && ((AbstractC22676k.m65751k(248, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 767) > 0) && ((AbstractC22676k.m65751k(768, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 879) > 0) && ((AbstractC22676k.m65751k(880, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 893) > 0) && ((AbstractC22676k.m65751k(895, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 8191) > 0) && ((AbstractC22676k.m65751k(8204, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 8205) > 0) && ((AbstractC22676k.m65751k(8255, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 8256) > 0) && ((AbstractC22676k.m65751k(8304, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 8591) > 0) && (AbstractC22676k.m65751k(11264, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 12271) > 0))))))))))))) {
                if (AbstractC22676k.m65751k(12289, cCharAt2) > 0 || AbstractC22676k.m65751k(cCharAt2, 55295) > 0) {
                    break;
                }
            }
            i15++;
            i14 = 65;
        }
        String strM16514g = c5363q.m16514g(i15);
        c5363q.f21807c = i15;
        List listM125905x0 = AbstractC39414r.m125905x0(strM16514g, new char[]{':'}, 0, 6);
        List list = listM125905x0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    String strM95633i = AbstractC31061c.m95633i('\'', "Cannot understand qualified name '", strM16514g);
                    int iMax2 = Math.max(0, c5363q.f21807c - 3);
                    int iMin2 = Math.min(i13 - 1, c5363q.f21807c + 3);
                    throw new DeserializationException(AbstractC11895b.m31992k('\n', strM95633i, "At offset " + c5363q.f21807c + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin2, str, 1, iMax2, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax2, " ") + '^')));
                }
            }
        }
        int size = listM125905x0.size();
        if (size == 1) {
            return new C22450d((String) listM125905x0.get(0), null);
        }
        if (size == 2) {
            return new C22450d((String) listM125905x0.get(1), (String) listM125905x0.get(0));
        }
        String strM95633i2 = AbstractC31061c.m95633i('\'', "Cannot understand qualified name '", strM16514g);
        int iMax3 = Math.max(0, c5363q.f21807c - 3);
        int iMin3 = Math.min(i13 - 1, c5363q.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strM95633i2, "At offset " + c5363q.f21807c + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin3, str, 1, iMax3, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(c5363q.f21807c - iMax3, " ") + '^')));
    }

    public /* synthetic */ C38445a(int i13, boolean z4) {
        this.f164635w = i13;
    }

    public C38445a(InterfaceC26213d errorReporter) {
        Object objM107888l;
        this.f164635w = 23;
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f164636x = errorReporter;
        try {
            objM107888l = KeyFactory.getInstance("EC");
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) ((InterfaceC26213d) this.f164636x)).m77828c(thM68037a);
        }
        Throwable thM68037a2 = C23468n.m68037a(objM107888l);
        if (thM68037a2 != null) {
            throw new SDKRuntimeException(thM68037a2);
        }
        AbstractC22676k.m65749i(objM107888l, "getOrElse(...)");
        this.f164637y = (KeyFactory) objM107888l;
    }

    public C38445a(C15990r c15990r, C29938w0 apiRequestFactory) {
        this.f164635w = 25;
        AbstractC22676k.m65750j(apiRequestFactory, "apiRequestFactory");
        this.f164636x = c15990r;
        this.f164637y = apiRequestFactory;
    }

    public C38445a(C5363q c5363q) {
        this.f164635w = 19;
        this.f164636x = c5363q;
        this.f164637y = C24022a.f94885E;
    }

    public C38445a(List list, int i13) {
        this.f164635w = i13;
        switch (i13) {
            case 11:
                this.f164636x = list;
                this.f164637y = new InterfaceC37377s[list.size()];
                break;
            default:
                this.f164636x = list;
                this.f164637y = new InterfaceC33639k0[list.size()];
                break;
        }
    }

    public C38445a(C35147c mapView, C0006a1 c0006a1) {
        this.f164635w = 9;
        AbstractC22676k.m65750j(mapView, "mapView");
        this.f164636x = mapView;
        this.f164637y = c0006a1;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[Catch: IOException -> 0x005a, SYNTHETIC, TRY_LEAVE, TryCatch #0 {IOException -> 0x005a, blocks: (B:5:0x000f, B:16:0x004a, B:34:0x0074, B:33:0x0071, B:6:0x001b, B:15:0x0047, B:27:0x0068, B:26:0x0065, B:29:0x006b), top: B:47:0x000f, inners: #3, #4 }] */
    public C38445a(int i13) {
        this.f164635w = i13;
        switch (i13) {
            case 3:
                this.f164636x = new SparseIntArray();
                this.f164637y = new SparseIntArray();
                return;
            case 7:
                this(7, new C0352d(9), new long[10]);
                return;
            case 12:
                this.f164636x = new Handler(Looper.getMainLooper());
                return;
            case 13:
                this.f164636x = new ArrayList();
                this.f164637y = new LinkedHashSet();
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C25056b(null, null, null, null, false, null));
                this.f164636x = c13045h2M36593c;
                this.f164637y = c13045h2M36593c;
                return;
            default:
                this.f164636x = new TreeSet();
                try {
                    InputStream resourceAsStream = C38445a.class.getClassLoader().getResourceAsStream("leap_second_dates.csv");
                    try {
                        Objects.requireNonNull(resourceAsStream, "leap_second_dates.csv was not found on the classpath");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    if (!line.isEmpty()) {
                                        ((TreeSet) this.f164636x).add(YearMonth.parse(line));
                                    }
                                } else {
                                    bufferedReader.close();
                                    resourceAsStream.close();
                                    this.f164637y = (YearMonth) ((TreeSet) this.f164636x).last();
                                    return;
                                }
                            } catch (Throwable th3) {
                                try {
                                    bufferedReader.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                            if (resourceAsStream != null) {
                                throw th;
                            }
                            try {
                                resourceAsStream.close();
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        if (resourceAsStream != null) {
                            throw th6;
                        }
                        resourceAsStream.close();
                        throw th6;
                    }
                } catch (IOException e5) {
                    throw new UncheckedIOException(e5);
                }
        }
    }

    public C38445a(AbstractC5583n abstractC5583n, C18316m c18316m) {
        this.f164635w = 15;
        if (abstractC5583n != null) {
            this.f164637y = abstractC5583n;
            this.f164636x = c18316m;
            return;
        }
        throw new IllegalArgumentException("DataSource.Factory must be provided");
    }

    public C38445a(C5099k0 c5099k0, HashMap map, HashMap map2) {
        this.f164635w = 24;
        this.f164636x = c5099k0;
        this.f164637y = map;
    }

    public C38445a(Handler handler, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0) {
        this.f164635w = 28;
        if (surfaceHolderCallbackC2821c0 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f164636x = handler;
        this.f164637y = surfaceHolderCallbackC2821c0;
    }

    public C38445a(AbstractC26903k0 abstractC26903k0, Handler handler) {
        this.f164635w = 22;
        this.f164637y = abstractC26903k0;
        this.f164636x = handler;
    }

    public C38445a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f164635w = 1;
        this.f164636x = cryptoInfo;
        this.f164637y = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public C38445a(InterfaceC22297a autoCompleteViewModelSubcomponentFactoryProvider, C17970p0 c17970p0) {
        this.f164635w = 14;
        AbstractC22676k.m65750j(autoCompleteViewModelSubcomponentFactoryProvider, "autoCompleteViewModelSubcomponentFactoryProvider");
        this.f164636x = autoCompleteViewModelSubcomponentFactoryProvider;
        this.f164637y = c17970p0;
    }

    public C38445a(EditText editText) {
        this.f164635w = 17;
        this.f164636x = editText;
        C21364i c21364i = new C21364i(editText);
        this.f164637y = c21364i;
        editText.addTextChangedListener(c21364i);
        if (C21356a.f81697b == null) {
            synchronized (C21356a.f81696a) {
                try {
                    if (C21356a.f81697b == null) {
                        C21356a c21356a = new C21356a();
                        try {
                            C21356a.f81698c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C21356a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C21356a.f81697b = c21356a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        editText.setEditableFactory(C21356a.f81697b);
    }

    public C38445a(ViewPager viewPager) {
        this.f164635w = 10;
        this.f164637y = viewPager;
        this.f164636x = new Rect();
    }

    public C38445a(float[] fArr) {
        this.f164635w = 4;
        this.f164636x = fArr;
        this.f164637y = new int[2];
    }
}
