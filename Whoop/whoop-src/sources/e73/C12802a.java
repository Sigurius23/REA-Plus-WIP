package e73;

import a73.AbstractC0529d;
import a73.C0527b;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0840p;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import b30.C2570m;
import i73.C18208a;
import java.util.ArrayList;
import java.util.Iterator;
import o20.C27456a;
import p171g9.C15594k;
import p408q.C29662f;
import ve3.C35931b;
import ve3.C35933d;
import ve3.C35934e;
import ve3.C35935f;
import ve3.EnumC35932c;
import z63.C40134f;
import z63.C40135g;
import z63.C40136h;
import z63.InterfaceC40130b;
import z63.InterfaceC40133e;

/* JADX INFO: renamed from: e73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12802a implements InterfaceC40130b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43822b;

    public /* synthetic */ C12802a(Object obj, int i13) {
        this.f43821a = i13;
        this.f43822b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    @Override // z63.InterfaceC40130b
    /* JADX INFO: renamed from: a */
    public final void mo1291a(C29662f c29662f, AbstractC0844t abstractC0844t) {
        C40134f c40134f;
        int i13;
        switch (this.f43821a) {
            case 0:
                C35933d c35933d = (C35933d) abstractC0844t;
                int iM91133w0 = c29662f.m91133w0();
                c29662f.m91103V0(c35933d);
                C12803b c12803b = (C12803b) this.f43822b;
                int i14 = 2;
                if (((ArrayList) c12803b.f43825c) == null) {
                    c12803b.f43825c = new ArrayList(2);
                }
                ArrayList arrayList = (ArrayList) c12803b.f43825c;
                EnumC35932c enumC35932c = c35933d.f153013h;
                if (enumC35932c == null) {
                    i14 = 0;
                } else {
                    int iOrdinal = enumC35932c.ordinal();
                    if (iOrdinal == 1) {
                        i14 = 1;
                    } else if (iOrdinal != 2) {
                        i14 = 0;
                    }
                }
                C40136h c40136h = (C40136h) c29662f.f121232z;
                StringBuilder sb4 = c40136h.f173190w;
                int length = sb4.length();
                C40135g c40135g = new C40135g(sb4.subSequence(iM91133w0, length));
                Iterator it = c40136h.f173191x.iterator();
                while (it.hasNext() && (c40134f = (C40134f) it.next()) != null) {
                    int i15 = c40134f.f173187b;
                    if (i15 >= iM91133w0 && (i13 = c40134f.f173188c) <= length) {
                        c40135g.setSpan(c40134f.f173186a, i15 - iM91133w0, i13 - iM91133w0, 33);
                        it.remove();
                    }
                }
                sb4.replace(iM91133w0, length, "");
                arrayList.add(new C12805d(i14, c40135g));
                c12803b.f43824b = c35933d.f153012g;
                break;
            case 1:
                C12803b.m35858e((C12803b) this.f43822b, c29662f, (C35934e) abstractC0844t);
                break;
            case 2:
                C12803b.m35858e((C12803b) this.f43822b, c29662f, (C35935f) abstractC0844t);
                break;
            case 3:
                c29662f.m91103V0((C35931b) abstractC0844t);
                ((C12803b) this.f43822b).f43826d = 0;
                break;
            default:
                String str = ((C0823a0) abstractC0844t).f3019g;
                C40136h c40136h2 = (C40136h) c29662f.f121232z;
                C2570m c2570m = (C2570m) c29662f.f121230x;
                c40136h2.f173190w.append(str);
                ArrayList<C18208a> arrayList2 = ((C0527b) this.f43822b).f1822a;
                if (!arrayList2.isEmpty()) {
                    int iM91133w1 = c29662f.m91133w0() - str.length();
                    for (C18208a c18208a : arrayList2) {
                        c18208a.getClass();
                        InterfaceC40133e interfaceC40133e = (InterfaceC40133e) ((C27456a) c2570m.f9985F).f110654a.get(C0840p.class);
                        if (interfaceC40133e != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            c18208a.getClass();
                            if (Linkify.addLinks(spannableStringBuilder, 1)) {
                                int i16 = 0;
                                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                                    C15594k c15594k = (C15594k) c29662f.f121231y;
                                    int length2 = uRLSpanArr.length;
                                    while (i16 < length2) {
                                        URLSpan uRLSpan = uRLSpanArr[i16];
                                        AbstractC0529d.f1830e.m128675b(c15594k, uRLSpan.getURL());
                                        Object objMo7932a = interfaceC40133e.mo7932a(c2570m, c15594k);
                                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan) + iM91133w1;
                                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan) + iM91133w1;
                                        String str2 = str;
                                        int length3 = c40136h2.f173190w.length();
                                        if (spanEnd > spanStart && spanStart >= 0 && spanEnd <= length3) {
                                            C40136h.m128678c(c40136h2, objMo7932a, spanStart, spanEnd);
                                        }
                                        i16++;
                                        str = str2;
                                    }
                                }
                            }
                        }
                        str = str;
                    }
                }
                break;
        }
    }
}
