package b30;

import a30.C0332w0;
import a73.C0530e;
import ab3.C0709a;
import ab3.C0714f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.room.C1836v0;
import b33.AbstractC2687h;
import b33.C2689j;
import b33.EnumC2682c;
import b33.EnumC2683d;
import b33.EnumC2686g;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.google.crypto.tink.internal.AbstractC5079a0;
import com.google.crypto.tink.internal.C5097j0;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5583n;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5588s;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import dj.AbstractC12058c;
import do0.C12229c;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import fo.C14655a;
import fo.C14659e;
import fo.C14660f;
import g40.C15333c3;
import g40.C15351f3;
import g40.C15383l0;
import g40.C15384l1;
import g73.C15553a;
import gf.C15762c;
import gm.C15990r;
import h20.EnumC16677j1;
import hc3.AbstractC17182o;
import hc3.C17171d;
import hm.C17418e;
import im.InterfaceC18653b;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import k83.InterfaceC22297a;
import kc3.C22365e;
import l40.C23328a;
import l83.C23465k;
import l83.C23470p;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25258m;
import m83.C25271y;
import m83.C25272z;
import mg.InterfaceC25526h;
import n53.C26318e;
import ne3.C26616h;
import ne3.C26624l;
import no.nordicsemi.android.dfu.DfuBaseService;
import o20.C27456a;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import om.InterfaceC28023b;
import org.webrtc.PeerConnection;
import p007a6.C0456u;
import p031b9.C2867u;
import p075ct.C11105a;
import p078d1.C11457j;
import p154fs.AbstractC14724b;
import p307lm.C24504a;
import p309lo.AbstractC24567y;
import p318m3.C24976f;
import p320m5.C25067k;
import p344nm.InterfaceC26822d;
import p352ny.C27232d;
import p368og.EnumC27905b;
import p368og.InterfaceC27908e;
import p450r5.C30929c;
import p461rh.C31414c;
import p461rh.C31415d;
import p479s4.AbstractC32128i;
import p522uf.C34893t;
import p523uh.InterfaceC34959e;
import p530up.AbstractC35148d;
import p560vs.C36433t3;
import p560vs.EnumC36397n3;
import p576w8.C36931a;
import p576w8.C36932b;
import p577wa.C36974a;
import p577wa.C36976c;
import p577wa.C36978e;
import p588wm.C37365g;
import p607x8.AbstractC38065t;
import p607x8.C38061p;
import p616xi.C38313a;
import p616xi.C38314b;
import p621xn.C38464a;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;
import p671z5.C40084b;
import p681zh.C40637a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import pc3.C29096r;
import pg.C29156a;
import pg3.C29205p;
import q80.C30036h;
import q83.AbstractC30060g;
import qa.InterfaceC30100e;
import s93.InterfaceC32300b;
import sh.InterfaceC32484j;
import so.C32800q;
import ss.C32945a;
import stream.video.sfu.models.PeerType;
import u30.C34498c;
import u30.EnumC34497b;
import v00.C35459c0;
import va3.C35845c;
import va3.C35850h;
import w23.AbstractC36749g;
import w23.C36750h;
import wb3.AbstractC37056f;
import x23.EnumC37870f;
import x30.C37913o;
import y00.C38793c;
import y00.C38977v3;
import yb3.AbstractC39414r;
import z23.C40031a;
import z23.C40033c;

/* JADX INFO: renamed from: b30.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2570m implements InterfaceC38468e, InterfaceC18653b, InterfaceC27771n, InterfaceC27908e, InterfaceC30100e {

    /* JADX INFO: renamed from: E */
    public Object f9984E;

    /* JADX INFO: renamed from: F */
    public Object f9985F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9986w;

    /* JADX INFO: renamed from: x */
    public Object f9987x;

    /* JADX INFO: renamed from: y */
    public Object f9988y;

    /* JADX INFO: renamed from: z */
    public Object f9989z;

    public /* synthetic */ C2570m(int i13) {
        this.f9986w = i13;
    }

    /* JADX INFO: renamed from: f */
    public static final C23328a m7472f(C2570m c2570m, List list, IdentifierSpec identifierSpec, Set set) {
        Object next;
        if (!set.contains(identifierSpec)) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C23465k) next).f92937w, identifierSpec));
            C23465k c23465k = (C23465k) next;
            if (c23465k != null) {
                return (C23328a) c23465k.f92938x;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m7473o(AbstractC5579j builder, int i13, EnumC5573d fieldEncoding, Object obj) throws IOException {
        AbstractC22676k.m65750j(builder, "builder");
        AbstractC22676k.m65750j(fieldEncoding, "fieldEncoding");
        if (builder.f22101b == null) {
            C26616h c26616h = new C26616h();
            builder.f22101b = c26616h;
            C5588s c5588s = new C5588s(c26616h);
            builder.f22102c = c5588s;
            c5588s.m16818a(builder.f22100a);
            builder.f22100a = C26624l.f105881E;
        }
        AbstractC5586q abstractC5586qM16739a = fieldEncoding.m16739a();
        AbstractC22676k.m65748h(abstractC5586qM16739a, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        C5588s c5588s2 = builder.f22102c;
        AbstractC22676k.m65747g(c5588s2);
        abstractC5586qM16739a.encodeWithTag(c5588s2, i13, obj);
    }

    /* JADX INFO: renamed from: A */
    public C38314b m7474A() {
        return (C38314b) this.f9988y;
    }

    /* JADX INFO: renamed from: B */
    public int m7475B(int i13, boolean z4) {
        ArrayList arrayList = (ArrayList) this.f9988y;
        int iM118986i = AbstractC37056f.m118986i(arrayList, Integer.valueOf(i13));
        int i14 = iM118986i < 0 ? -(iM118986i + 1) : iM118986i + 1;
        if (z4 && i14 > 0) {
            int i15 = i14 - 1;
            if (i13 == ((Number) arrayList.get(i15)).intValue()) {
                return i15;
            }
        }
        return i14;
    }

    /* JADX INFO: renamed from: C */
    public int m7476C(int i13) {
        if (i13 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f9988y).get(i13 - 1)).intValue();
    }

    /* JADX INFO: renamed from: D */
    public C38314b m7477D() {
        return (C38314b) this.f9985F;
    }

    /* JADX INFO: renamed from: E */
    public int m7478E(int i13, int i14) {
        while (i13 > i14) {
            char cCharAt = ((Layout) this.f9987x).getText().charAt(i13 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC22676k.m65751k(cCharAt, DfuBaseService.ERROR_REMOTE_MASK) < 0 || AbstractC22676k.m65751k(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i13;
            }
            i13--;
        }
        return i13;
    }

    /* JADX INFO: renamed from: F */
    public void m7479F(int i13, String str, String message) {
        AbstractC22676k.m65750j(message, "message");
        C32800q c32800q = (C32800q) this.f9984E;
        C13081r1 c13081r1 = (C13081r1) c32800q.f136505x;
        if (AbstractC36749g.f157280a[((C36750h) c13081r1.f45200w.getValue()).f157284d.ordinal()] == 3) {
            if (((C36750h) c13081r1.f45200w.getValue()).f157283c.length() > 0) {
                C40033c.m128363b((C40033c) this.f9989z, ((C36750h) c13081r1.f45200w.getValue()).f157283c, false, i13, message, str, null, 32);
            }
            c32800q.m102865i(EnumC37870f.f162185y);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m7480G(String str, int i13, String str2, boolean z4) {
        C0332w0 c0332w0 = (C0332w0) this.f9985F;
        C13081r1 c13081r1 = (C13081r1) c0332w0.f1166G;
        if (((C13081r1) c0332w0.f1164E).f45200w.getValue() == EnumC37870f.f162184x) {
            if (((CharSequence) c13081r1.f45200w.getValue()).length() > 0) {
                C40033c c40033c = (C40033c) this.f9989z;
                String stageId = (String) c13081r1.f45200w.getValue();
                String str3 = ((C36750h) ((C13081r1) ((C32800q) this.f9984E).f136505x).f45200w.getValue()).f157282b;
                if (str3 == null) {
                    str3 = "unknown";
                }
                String str4 = str3;
                c40033c.getClass();
                AbstractC22676k.m65750j(stageId, "stageId");
                AbstractC2687h abstractC2687h = (AbstractC2687h) c40033c.f172742d.remove(stageId);
                if (abstractC2687h != null && (abstractC2687h instanceof C2689j)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - abstractC2687h.mo7577a();
                    C2689j c2689j = (C2689j) abstractC2687h;
                    C40031a c40031a = c40033c.f172741c;
                    String str5 = c2689j.f10576a;
                    String str6 = c2689j.f10577b;
                    EnumC2683d enumC2683d = EnumC2683d.WS_JOIN;
                    EnumC2686g enumC2686g = EnumC2686g.COMPLETED;
                    EnumC2682c enumC2682c = z4 ? EnumC2682c.SUCCESS : EnumC2682c.FAILURE;
                    String str7 = !z4 ? str : null;
                    String str8 = !z4 ? str2 : null;
                    EnumC2682c enumC2682c2 = enumC2682c;
                    c40033c.f172739a.m927P(C40031a.m128361a(c40031a, str5, str6, enumC2683d, enumC2686g, stageId, c2689j.f10582g, str4, Long.valueOf(jCurrentTimeMillis), enumC2682c2, Integer.valueOf(i13), str7, str8, c2689j.f10584i, c2689j.f10583h, null, null, null, null, null, 8372224));
                }
            }
            EnumC37870f enumC37870f = EnumC37870f.f162185y;
            C13045h2 c13045h2 = (C13045h2) c0332w0.f1170z;
            c13045h2.getClass();
            c13045h2.m36571k(null, enumC37870f);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m7481H(C15762c c15762c) {
        AbstractC22676k.m65750j(c15762c, "<set-?>");
        this.f9989z = c15762c;
    }

    /* JADX INFO: renamed from: I */
    public void m7482I(String str) {
        this.f9985F = str;
    }

    /* JADX INFO: renamed from: J */
    public void m7483J(C34893t c34893t) {
        AbstractC22676k.m65750j(c34893t, "<set-?>");
        this.f9984E = c34893t;
    }

    /* JADX INFO: renamed from: K */
    public void m7484K(InterfaceC25526h interfaceC25526h) {
        AbstractC22676k.m65750j(interfaceC25526h, "<set-?>");
        this.f9987x = interfaceC25526h;
    }

    /* JADX INFO: renamed from: L */
    public void m7485L(String str) {
        this.f9985F = str;
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: a */
    public void mo7486a(Throwable ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        this.f9984E = ex3;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public int mo1673b(long j7) {
        switch (this.f9986w) {
            case 4:
                long[] jArr = (long[]) this.f9988y;
                int iM71671b = AbstractC24567y.m71671b(jArr, j7, false);
                if (iM71671b < jArr.length) {
                    return iM71671b;
                }
                return -1;
            default:
                long[] jArr2 = (long[]) this.f9988y;
                int iM121908a = AbstractC38065t.m121908a(jArr2, j7, false);
                if (iM121908a < jArr2.length) {
                    return iM121908a;
                }
                return -1;
        }
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: c */
    public void mo7487c(String key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        ((Map) ((C23470p) this.f9985F).getValue()).put(key, value);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public List mo1674d(long j7) {
        switch (this.f9986w) {
            case 4:
                C14659e c14659e = (C14659e) this.f9987x;
                Map map = (Map) this.f9989z;
                HashMap map2 = (HashMap) this.f9984E;
                HashMap map3 = (HashMap) this.f9985F;
                ArrayList<Pair> arrayList = new ArrayList();
                c14659e.m41880g(j7, c14659e.f54112h, arrayList);
                TreeMap treeMap = new TreeMap();
                c14659e.m41882i(j7, false, c14659e.f54112h, treeMap);
                c14659e.m41881h(j7, map, map2, c14659e.f54112h, treeMap);
                ArrayList arrayList2 = new ArrayList();
                for (Pair pair : arrayList) {
                    String str = (String) map3.get(pair.second);
                    if (str != null) {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        C14660f c14660f = (C14660f) map2.get(pair.first);
                        c14660f.getClass();
                        arrayList2.add(new C38465b(null, null, null, bitmapDecodeByteArray, c14660f.f54120c, 0, c14660f.f54122e, c14660f.f54119b, 0, Integer.MIN_VALUE, -3.4028235E38f, c14660f.f54123f, c14660f.f54124g, false, -16777216, c14660f.f54127j, 0.0f));
                    }
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    C14660f c14660f2 = (C14660f) map2.get(entry.getKey());
                    c14660f2.getClass();
                    C38464a c38464a = (C38464a) entry.getValue();
                    CharSequence charSequence = c38464a.f164706a;
                    charSequence.getClass();
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    for (C14655a c14655a : (C14655a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C14655a.class)) {
                        spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c14655a), spannableStringBuilder.getSpanEnd(c14655a), (CharSequence) "");
                    }
                    for (int i13 = 0; i13 < spannableStringBuilder.length(); i13++) {
                        if (spannableStringBuilder.charAt(i13) == ' ') {
                            int i14 = i13 + 1;
                            int i15 = i14;
                            while (i15 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i15) == ' ') {
                                i15++;
                            }
                            int i16 = i15 - i14;
                            if (i16 > 0) {
                                spannableStringBuilder.delete(i13, i16 + i13);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                        spannableStringBuilder.delete(0, 1);
                    }
                    for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
                        if (spannableStringBuilder.charAt(i17) == '\n') {
                            int i18 = i17 + 1;
                            if (spannableStringBuilder.charAt(i18) == ' ') {
                                spannableStringBuilder.delete(i18, i17 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    for (int i19 = 0; i19 < spannableStringBuilder.length() - 1; i19++) {
                        if (spannableStringBuilder.charAt(i19) == ' ') {
                            int i24 = i19 + 1;
                            if (spannableStringBuilder.charAt(i24) == '\n') {
                                spannableStringBuilder.delete(i19, i24);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    float f13 = c14660f2.f54120c;
                    int i25 = c14660f2.f54121d;
                    c38464a.f164710e = f13;
                    c38464a.f164711f = i25;
                    c38464a.f164712g = c14660f2.f54122e;
                    c38464a.f164713h = c14660f2.f54119b;
                    c38464a.f164717l = c14660f2.f54123f;
                    float f14 = c14660f2.f54126i;
                    int i26 = c14660f2.f54125h;
                    c38464a.f164716k = f14;
                    c38464a.f164715j = i26;
                    c38464a.f164721p = c14660f2.f54127j;
                    arrayList2.add(c38464a.m123258a());
                }
                return arrayList2;
            default:
                C36976c c36976c = (C36976c) this.f9987x;
                Map map4 = (Map) this.f9989z;
                HashMap map5 = (HashMap) this.f9984E;
                HashMap map6 = (HashMap) this.f9985F;
                ArrayList<Pair> arrayList3 = new ArrayList();
                c36976c.m118699g(j7, c36976c.f158250h, arrayList3);
                TreeMap treeMap2 = new TreeMap();
                c36976c.m118701i(j7, false, c36976c.f158250h, treeMap2);
                c36976c.m118700h(j7, map4, map5, c36976c.f158250h, treeMap2);
                ArrayList arrayList4 = new ArrayList();
                for (Pair pair2 : arrayList3) {
                    String str2 = (String) map6.get(pair2.second);
                    if (str2 != null) {
                        byte[] bArrDecode2 = Base64.decode(str2, 0);
                        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
                        C36978e c36978e = (C36978e) map5.get(pair2.first);
                        c36978e.getClass();
                        arrayList4.add(new C36932b(null, null, null, bitmapDecodeByteArray2, c36978e.f158267c, 0, c36978e.f158269e, c36978e.f158266b, 0, Integer.MIN_VALUE, -3.4028235E38f, c36978e.f158270f, c36978e.f158271g, false, -16777216, c36978e.f158274j, 0.0f));
                    }
                }
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    C36978e c36978e2 = (C36978e) map5.get(entry2.getKey());
                    c36978e2.getClass();
                    C36931a c36931a = (C36931a) entry2.getValue();
                    CharSequence charSequence2 = c36931a.f158009a;
                    charSequence2.getClass();
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence2;
                    for (C36974a c36974a : (C36974a[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), C36974a.class)) {
                        spannableStringBuilder2.replace(spannableStringBuilder2.getSpanStart(c36974a), spannableStringBuilder2.getSpanEnd(c36974a), (CharSequence) "");
                    }
                    for (int i27 = 0; i27 < spannableStringBuilder2.length(); i27++) {
                        if (spannableStringBuilder2.charAt(i27) == ' ') {
                            int i28 = i27 + 1;
                            int i29 = i28;
                            while (i29 < spannableStringBuilder2.length() && spannableStringBuilder2.charAt(i29) == ' ') {
                                i29++;
                            }
                            int i34 = i29 - i28;
                            if (i34 > 0) {
                                spannableStringBuilder2.delete(i27, i34 + i27);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(0) == ' ') {
                        spannableStringBuilder2.delete(0, 1);
                    }
                    for (int i35 = 0; i35 < spannableStringBuilder2.length() - 1; i35++) {
                        if (spannableStringBuilder2.charAt(i35) == '\n') {
                            int i36 = i35 + 1;
                            if (spannableStringBuilder2.charAt(i36) == ' ') {
                                spannableStringBuilder2.delete(i36, i35 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == ' ') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    for (int i37 = 0; i37 < spannableStringBuilder2.length() - 1; i37++) {
                        if (spannableStringBuilder2.charAt(i37) == ' ') {
                            int i38 = i37 + 1;
                            if (spannableStringBuilder2.charAt(i38) == '\n') {
                                spannableStringBuilder2.delete(i37, i38);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == '\n') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    float f15 = c36978e2.f158267c;
                    int i39 = c36978e2.f158268d;
                    c36931a.f158013e = f15;
                    c36931a.f158014f = i39;
                    c36931a.f158015g = c36978e2.f158269e;
                    c36931a.f158016h = c36978e2.f158266b;
                    c36931a.f158020l = c36978e2.f158270f;
                    float f16 = c36978e2.f158273i;
                    int i44 = c36978e2.f158272h;
                    c36931a.f158019k = f16;
                    c36931a.f158018j = i44;
                    c36931a.f158024p = c36978e2.f158274j;
                    arrayList4.add(c36931a.m118550a());
                }
                return arrayList4;
        }
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: e */
    public void mo7488e() {
        C1836v0 c1836v0;
        C23470p c23470p = (C23470p) this.f9985F;
        C29156a c29156a = (C29156a) this.f9987x;
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f9989z;
        if (interfaceC4339a == null) {
            throw new IllegalArgumentException("no message provided to LogRecordBuilder");
        }
        int iOrdinal = ((EnumC27905b) this.f9988y).ordinal();
        if (iOrdinal == 0) {
            c1836v0 = new C1836v0(2, c29156a, C29156a.class, "error", "error(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 13);
        } else if (iOrdinal == 1) {
            c1836v0 = new C1836v0(2, c29156a, C29156a.class, "warn", "warn(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 14);
        } else if (iOrdinal == 2) {
            c1836v0 = new C1836v0(2, c29156a, C29156a.class, "info", "info(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 15);
        } else if (iOrdinal == 3) {
            c1836v0 = new C1836v0(2, c29156a, C29156a.class, "debug", "debug(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 16);
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c1836v0 = new C1836v0(2, c29156a, C29156a.class, "trace", "trace(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 17);
        }
        if (((Map) c23470p.getValue()).isEmpty()) {
            c1836v0.invoke((Throwable) this.f9984E, interfaceC4339a);
            return;
        }
        if (AbstractC35148d.m111191v() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapMo11168f = AbstractC35148d.m111191v().mo11168f();
        try {
            for (Map.Entry entry : ((Map) c23470p.getValue()).entrySet()) {
                String str = (String) entry.getKey();
                String string = entry.getValue().toString();
                if (str == null) {
                    throw new IllegalArgumentException("key parameter cannot be null");
                }
                if (AbstractC35148d.m111191v() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                AbstractC35148d.m111191v().mo11165c(str, string);
            }
            c1836v0.invoke((Throwable) this.f9984E, interfaceC4339a);
            if (mapMo11168f == null) {
                if (AbstractC35148d.m111191v() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                AbstractC35148d.m111191v().clear();
            } else {
                if (AbstractC35148d.m111191v() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                AbstractC35148d.m111191v().mo11174v(mapMo11168f);
            }
        } catch (Throwable th3) {
            if (mapMo11168f == null) {
                if (AbstractC35148d.m111191v() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                AbstractC35148d.m111191v().clear();
            } else {
                if (AbstractC35148d.m111191v() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                AbstractC35148d.m111191v().mo11174v(mapMo11168f);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7489g(InterfaceC34959e interfaceC34959e, InterfaceC21461d interfaceC21461d) {
        ((ArrayList) this.f9984E).add(new C30599e(16, interfaceC34959e, interfaceC21461d));
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return new C24504a((Executor) ((InterfaceC22297a) this.f9987x).get(), (C17418e) ((InterfaceC22297a) this.f9988y).get(), (C15990r) ((C15990r) this.f9989z).get(), (InterfaceC26822d) ((InterfaceC22297a) this.f9984E).get(), (InterfaceC28023b) ((InterfaceC22297a) this.f9985F).get());
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public long mo1675h(int i13) {
        switch (this.f9986w) {
            case 4:
                break;
        }
        return ((long[]) this.f9988y)[i13];
    }

    /* JADX INFO: renamed from: i */
    public void m7490i(C40637a c40637a, InterfaceC21461d interfaceC21461d) {
        ((ArrayList) this.f9988y).add(new C23465k(c40637a, interfaceC21461d));
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public int mo1676j() {
        switch (this.f9986w) {
            case 4:
                break;
        }
        return ((long[]) this.f9988y).length;
    }

    /* JADX INFO: renamed from: k */
    public void m7491k(Object obj, C36433t3 c36433t3, boolean z4) throws GeneralSecurityException {
        byte[] bArrM30035b;
        if (((HashMap) this.f9988y) == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (c36433t3.m116648G() != EnumC36397n3.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = c36433t3.m116647F().ordinal();
        if (iOrdinal == 1) {
            bArrM30035b = AbstractC5079a0.m15952b(c36433t3.m116646E()).m30035b();
        } else if (iOrdinal == 2) {
            bArrM30035b = AbstractC5079a0.m15951a(c36433t3.m116646E()).m30035b();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrM30035b = AbstractC5079a0.m15951a(c36433t3.m116646E()).m30035b();
        } else {
            bArrM30035b = AbstractC14724b.f54463a;
        }
        C11105a c11105aM30034a = C11105a.m30034a(bArrM30035b);
        C5097j0 c5097j0 = new C5097j0(obj, c11105aM30034a, c36433t3.m116648G(), c36433t3.m116647F(), c36433t3.m116646E(), c36433t3.m116645D().m116435E());
        HashMap map = (HashMap) this.f9988y;
        ArrayList arrayList = (ArrayList) this.f9989z;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c5097j0);
        List list = (List) map.put(c11105aM30034a, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(c5097j0);
            map.put(c11105aM30034a, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(c5097j0);
        if (z4) {
            if (((C5097j0) this.f9984E) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f9984E = c5097j0;
        }
    }

    @Override // oa3.InterfaceC27771n, oa3.InterfaceC27772o
    /* JADX INFO: renamed from: l */
    public void mo195l() {
        ((C25126d) this.f9988y).mo195l();
        C25126d c25126d = (C25126d) this.f9989z;
        ((HashMap) c25126d.f98485y).put((C35850h) this.f9984E, new C0709a((InterfaceC32300b) AbstractC25265s.m74142p1((ArrayList) this.f9985F)));
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: m */
    public InterfaceC27772o mo196m(C35850h c35850h) {
        return ((C25126d) this.f9987x).mo196m(c35850h);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: n */
    public void mo197n(C35850h c35850h, C0714f c0714f) {
        ((C25126d) this.f9987x).mo197n(c35850h, c0714f);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: p */
    public void mo198p(C35850h c35850h, Object obj) {
        ((C25126d) this.f9987x).mo198p(c35850h, obj);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: q */
    public void mo199q(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
        ((C25126d) this.f9987x).mo199q(c35850h, c35845c, c35850h2);
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: r */
    public void mo7492r(InterfaceC4339a interfaceC4339a) {
        this.f9989z = interfaceC4339a;
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: s */
    public InterfaceC27771n mo201s(C35845c c35845c, C35850h c35850h) {
        return ((C25126d) this.f9987x).mo201s(c35845c, c35850h);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX INFO: renamed from: t */
    public Bidi m7493t(int i13) {
        Bidi bidi;
        Layout layout = (Layout) this.f9987x;
        ArrayList arrayList = (ArrayList) this.f9988y;
        ArrayList arrayList2 = (ArrayList) this.f9989z;
        boolean[] zArr = (boolean[]) this.f9984E;
        if (zArr[i13]) {
            return (Bidi) arrayList2.get(i13);
        }
        int iIntValue = i13 == 0 ? 0 : ((Number) arrayList.get(i13 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i13)).intValue();
        int i14 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f9985F;
        if (cArr == null || cArr.length < i14) {
            cArr = new char[i14];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i14)) {
            bidi = new Bidi(cArr2, 0, null, 0, i14, layout.getParagraphDirection(layout.getLineForOffset(m7476C(i13))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i13, bidi);
        zArr[i13] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f9985F;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f9985F = cArr2;
        return bidi;
    }

    /* JADX INFO: renamed from: u */
    public C38313a m7494u() {
        return (C38313a) this.f9987x;
    }

    /* JADX INFO: renamed from: v */
    public C38314b m7495v() {
        return (C38314b) this.f9989z;
    }

    /* JADX INFO: renamed from: w */
    public C38314b m7496w() {
        return (C38314b) this.f9984E;
    }

    /* JADX INFO: renamed from: x */
    public float m7497x(int i13, boolean z4) {
        Layout layout = (Layout) this.f9987x;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i13));
        if (i13 > lineEnd) {
            i13 = lineEnd;
        }
        return z4 ? layout.getPrimaryHorizontal(i13) : layout.getSecondaryHorizontal(i13);
    }

    /* JADX INFO: renamed from: y */
    public float m7498y(int i13, boolean z4, boolean z13) {
        int i14;
        int i15;
        int iM7478E = i13;
        Layout layout = (Layout) this.f9987x;
        if (!z13) {
            return m7497x(i13, z4);
        }
        int iM16750I = AbstractC5583n.m16750I(layout, iM7478E, z13);
        int lineStart = layout.getLineStart(iM16750I);
        int lineEnd = layout.getLineEnd(iM16750I);
        if (iM7478E != lineStart && iM7478E != lineEnd) {
            return m7497x(i13, z4);
        }
        if (iM7478E == 0 || iM7478E == layout.getText().length()) {
            return m7497x(i13, z4);
        }
        int iM7475B = m7475B(iM7478E, z13);
        boolean z14 = layout.getParagraphDirection(layout.getLineForOffset(m7476C(iM7475B))) == -1;
        int iM7478E2 = m7478E(lineEnd, lineStart);
        int iM7476C = m7476C(iM7475B);
        int i16 = lineStart - iM7476C;
        int i17 = iM7478E2 - iM7476C;
        Bidi bidiM7493t = m7493t(iM7475B);
        Bidi bidiCreateLineBidi = bidiM7493t != null ? bidiM7493t.createLineBidi(i16, i17) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z4 || z14 == zIsRtlCharAt) {
                z14 = !z14;
            }
            return iM7478E == lineStart ? z14 : !z14 ? layout.getLineLeft(iM16750I) : layout.getLineRight(iM16750I);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C24976f[] c24976fArr = new C24976f[runCount];
        for (int i18 = 0; i18 < runCount; i18++) {
            c24976fArr[i18] = new C24976f(bidiCreateLineBidi.getRunStart(i18) + lineStart, bidiCreateLineBidi.getRunLimit(i18) + lineStart, bidiCreateLineBidi.getRunLevel(i18) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i19 = 0; i19 < runCount2; i19++) {
            bArr[i19] = (byte) bidiCreateLineBidi.getRunLevel(i19);
        }
        Bidi.reorderVisually(bArr, 0, c24976fArr, 0, runCount);
        if (iM7478E == lineStart) {
            int i24 = 0;
            while (true) {
                if (i24 >= runCount) {
                    i15 = -1;
                    break;
                }
                if (c24976fArr[i24].f97748a == iM7478E) {
                    i15 = i24;
                    break;
                }
                i24++;
            }
            boolean z15 = (z4 || z14 == c24976fArr[i15].f97750c) ? !z14 : z14;
            if (i15 == 0 && z15) {
                return layout.getLineLeft(iM16750I);
            }
            if (i15 != runCount - 1 || z15) {
                return z15 ? layout.getPrimaryHorizontal(c24976fArr[i15 - 1].f97748a) : layout.getPrimaryHorizontal(c24976fArr[i15 + 1].f97748a);
            }
            return layout.getLineRight(iM16750I);
        }
        if (iM7478E > iM7478E2) {
            iM7478E = m7478E(iM7478E, lineStart);
        }
        int i25 = 0;
        while (true) {
            if (i25 >= runCount) {
                i14 = -1;
                break;
            }
            if (c24976fArr[i25].f97749b == iM7478E) {
                i14 = i25;
                break;
            }
            i25++;
        }
        boolean z16 = (z4 || z14 == c24976fArr[i14].f97750c) ? z14 : !z14;
        if (i14 == 0 && z16) {
            return layout.getLineLeft(iM16750I);
        }
        if (i14 != runCount - 1 || z16) {
            return z16 ? layout.getPrimaryHorizontal(c24976fArr[i14 - 1].f97749b) : layout.getPrimaryHorizontal(c24976fArr[i14 + 1].f97749b);
        }
        return layout.getLineRight(iM16750I);
    }

    /* JADX INFO: renamed from: z */
    public int m7499z(int i13) {
        Layout layout = (Layout) this.f9987x;
        return m7478E(layout.getLineEnd(i13), layout.getLineStart(i13));
    }

    public /* synthetic */ C2570m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f9986w = i13;
        this.f9987x = obj;
        this.f9988y = obj2;
        this.f9989z = obj3;
        this.f9984E = obj4;
        this.f9985F = obj5;
    }

    public C2570m(C38977v3 c38977v3, EnumC16677j1 addressCollectionMode, EnumC2625t1 enumC2625t1, boolean z4, boolean z13, Set allowedBillingCountries) {
        C15333c3 c15333c3;
        EnumC34497b enumC34497b;
        InterfaceC13058l c0456u;
        int i13 = 0;
        this.f9986w = 0;
        AbstractC22676k.m65750j(addressCollectionMode, "addressCollectionMode");
        AbstractC22676k.m65750j(allowedBillingCountries, "allowedBillingCountries");
        this.f9987x = enumC2625t1;
        C12229c c12229c = null;
        if (enumC2625t1 == EnumC2625t1.f10218y) {
            IdentifierSpec.Companion.getClass();
            c15333c3 = new C15333c3(IdentifierSpec.Name, new C15351f3(new C15384l1(), c38977v3 != null ? c38977v3.f167775y : null, c12229c, 4));
        } else {
            c15333c3 = null;
        }
        this.f9988y = c15333c3;
        IdentifierSpec.Companion.getClass();
        IdentifierSpec identifierSpec = IdentifierSpec.BillingAddress;
        int iOrdinal = addressCollectionMode.ordinal();
        if (iOrdinal == 0) {
            enumC34497b = EnumC34497b.f144990w;
        } else if (iOrdinal == 1) {
            enumC34497b = EnumC34497b.f144991x;
        } else if (iOrdinal == 2) {
            enumC34497b = EnumC34497b.f144992y;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        EnumC34497b enumC34497b2 = enumC34497b;
        EnumC2625t1 enumC2625t2 = EnumC2625t1.f10217x;
        C34498c c34498c = new C34498c(enumC2625t1 == enumC2625t2, z4, z13, enumC34497b2, 16);
        C38793c c38793c = c38977v3 != null ? c38977v3.f167773w : null;
        C37913o c37913o = new C37913o(identifierSpec, AbstractC25247g0.m74000i0(AbstractC25260n.m74077r0(new C23465k[]{enumC2625t1 == enumC2625t2 ? new C23465k(IdentifierSpec.Name, c38977v3 != null ? c38977v3.f167775y : null) : null, new C23465k(IdentifierSpec.Line1, c38793c != null ? c38793c.f166962y : null), new C23465k(IdentifierSpec.Line2, c38793c != null ? c38793c.f166963z : null), new C23465k(IdentifierSpec.State, c38793c != null ? c38793c.f166959F : null), new C23465k(IdentifierSpec.City, c38793c != null ? c38793c.f166960w : null), new C23465k(IdentifierSpec.Country, c38793c != null ? c38793c.f166961x : null), new C23465k(IdentifierSpec.PostalCode, c38793c != null ? c38793c.f166958E : null), z4 ? new C23465k(IdentifierSpec.Email, c38977v3 != null ? c38977v3.f167774x : null) : null, z13 ? new C23465k(IdentifierSpec.Phone, c38977v3 != null ? c38977v3.f167776z : null) : null})), allowedBillingCountries, null, null, null, c34498c, 8);
        C25271y c25271y = C25271y.f99162w;
        this.f9989z = C15383l0.m43594b(c37913o, AbstractC32128i.m100064s(R.string.stripe_billing_details, new Object[0], c25271y));
        C26318e c26318e = c37913o.f162325h;
        this.f9984E = c26318e;
        if (c15333c3 != null) {
            c0456u = c15333c3.mo43535e();
        } else {
            c0456u = new C0456u(c25271y, 1);
        }
        C13052j1 c13052j1M36606p = AbstractC13091v.m36606p(c0456u, c37913o.f162320c.mo43535e(), c26318e, new C2562l(this, null, i13));
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f9985F = AbstractC13091v.m36580F(c13052j1M36606p, AbstractC17182o.f65999a);
    }

    public C2570m(String str, String callType, C40033c eventReporter, C32800q c32800q, C25067k c25067k) {
        this.f9986w = 22;
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        this.f9987x = str;
        this.f9988y = callType;
        this.f9989z = eventReporter;
        this.f9984E = c32800q;
        this.f9985F = c25067k;
    }

    public C2570m(C29156a c29156a, EnumC27905b enumC27905b) {
        this.f9986w = 12;
        this.f9987x = c29156a;
        this.f9988y = enumC27905b;
        this.f9985F = AbstractC30060g.m92088H(new C29096r(2));
    }

    public C2570m(Context context, String str, String callType, C40033c eventReporter, C32800q c32800q) {
        this.f9986w = 23;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        this.f9987x = context;
        this.f9988y = str;
        this.f9989z = callType;
        this.f9984E = eventReporter;
        this.f9985F = c32800q;
    }

    public C2570m(InterfaceC2994c0 interfaceC2994c0, C40033c c40033c, C29205p c29205p) {
        this.f9986w = 28;
        this.f9987x = interfaceC2994c0;
        this.f9988y = c40033c;
        this.f9989z = c29205p;
        this.f9985F = AbstractC13091v.m36593c("");
    }

    public C2570m(String str, String callType, InterfaceC13037f2 connectionFlow, C17171d c17171d, C40033c reporter, C32800q c32800q, C0332w0 c0332w0) {
        this.f9986w = 24;
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(connectionFlow, "connectionFlow");
        AbstractC22676k.m65750j(reporter, "reporter");
        this.f9987x = str;
        this.f9988y = callType;
        this.f9989z = reporter;
        this.f9984E = c32800q;
        this.f9985F = c0332w0;
    }

    public C2570m(Drawable.Callback callback) {
        this.f9986w = 21;
        this.f9987x = new C29205p(11, false);
        this.f9988y = new HashMap();
        this.f9989z = new HashMap();
        this.f9985F = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC12058c.m33239b("LottieDrawable must be inside of a view for images to work.");
            this.f9984E = null;
        } else {
            this.f9984E = ((View) callback).getContext().getAssets();
        }
    }

    public C2570m(Layout layout) {
        this.f9986w = 8;
        this.f9987x = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM125887f0 = AbstractC39414r.m125887f0(((Layout) this.f9987x).getText(), '\n', length, false, 4);
            length = iM125887f0 < 0 ? ((Layout) this.f9987x).getText().length() : iM125887f0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f9987x).getText().length());
        this.f9988y = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(null);
        }
        this.f9989z = arrayList2;
        this.f9984E = new boolean[((ArrayList) this.f9988y).size()];
        ((ArrayList) this.f9988y).size();
    }

    public C2570m(C25126d c25126d) {
        this.f9986w = 29;
        this.f9987x = (C0530e) c25126d.f98484x;
        this.f9988y = (C15553a) c25126d.f98486z;
        this.f9989z = (C40084b) c25126d.f98479E;
        this.f9984E = (C15553a) c25126d.f98480F;
        this.f9985F = (C27456a) c25126d.f98482H;
    }

    public C2570m(C14659e c14659e, HashMap map, HashMap map2, HashMap map3) {
        this.f9986w = 4;
        this.f9987x = c14659e;
        this.f9984E = map2;
        this.f9985F = map3;
        this.f9989z = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i13 = 0;
        c14659e.m41878d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i13] = ((Long) it.next()).longValue();
            i13++;
        }
        this.f9988y = jArr;
    }

    public C2570m(C36976c c36976c, HashMap map, HashMap map2, HashMap map3) {
        this.f9986w = 25;
        this.f9987x = c36976c;
        this.f9984E = map2;
        this.f9985F = map3;
        this.f9989z = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i13 = 0;
        c36976c.m118697d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i13] = ((Long) it.next()).longValue();
            i13++;
        }
        this.f9988y = jArr;
    }

    public C2570m(PeerConnection peerConnection, PeerType peerType) {
        this.f9986w = 6;
        AbstractC22676k.m65750j(peerType, "peerType");
        this.f9987x = peerConnection;
        this.f9988y = peerType;
        this.f9989z = C25272z.f99163w;
        this.f9984E = new C25258m();
        this.f9985F = new C25258m();
    }

    public C2570m(InterfaceC2994c0 coroutineScope, C27232d tapToAddCollectionHandler, C35459c0 paymentMethodMetadata, Function1 function1, Function1 function2) {
        this.f9986w = 10;
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(tapToAddCollectionHandler, "tapToAddCollectionHandler");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        this.f9987x = coroutineScope;
        this.f9988y = tapToAddCollectionHandler;
        this.f9989z = function1;
        this.f9984E = function2;
        this.f9985F = AbstractC13091v.m36598h(AbstractC13091v.m36593c(null));
    }

    public C2570m(Object obj, Looper looper, Looper looper2, C38061p c38061p, C2867u c2867u) {
        this.f9986w = 26;
        this.f9987x = c38061p.m121874a(looper, null);
        this.f9988y = c38061p.m121874a(looper2, null);
        this.f9984E = obj;
        this.f9985F = obj;
        this.f9989z = c2867u;
    }

    public C2570m(InterfaceC21461d messageType, Class cls, C30929c c30929c, Map map, String str, EnumC5593x enumC5593x) {
        this.f9986w = 18;
        AbstractC22676k.m65750j(messageType, "messageType");
        this.f9987x = messageType;
        this.f9988y = c30929c;
        this.f9989z = map;
        this.f9984E = str;
        this.f9985F = enumC5593x;
    }

    public C2570m(C31415d c31415d) {
        this.f9986w = 16;
        this.f9987x = AbstractC25265s.m74097F1(c31415d.f129275a);
        this.f9988y = AbstractC25265s.m74097F1(c31415d.f129276b);
        this.f9989z = AbstractC25265s.m74097F1(c31415d.f129277c);
        List list = (List) c31415d.f129280f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C30036h((C23465k) it.next(), 14));
        }
        this.f9984E = arrayList;
        List list2 = (List) c31415d.f129281g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new C31414c((InterfaceC32484j) it3.next(), 1));
        }
        this.f9985F = arrayList2;
    }

    public C2570m(C25126d c25126d, C25126d c25126d2, C35850h c35850h, ArrayList arrayList) {
        this.f9986w = 11;
        this.f9988y = c25126d;
        this.f9989z = c25126d2;
        this.f9984E = c35850h;
        this.f9985F = arrayList;
        this.f9987x = c25126d;
    }

    public C2570m(Class cls) {
        this.f9986w = 3;
        this.f9988y = new HashMap();
        this.f9989z = new ArrayList();
        this.f9987x = cls;
        this.f9985F = C32945a.f137237b;
    }

    public C2570m(C11457j c11457j, C37365g c37365g) {
        this.f9986w = 17;
        this.f9987x = c11457j;
        this.f9988y = c37365g;
        this.f9989z = new HashMap();
        this.f9984E = new HashSet();
        this.f9985F = new HashMap();
    }
}
