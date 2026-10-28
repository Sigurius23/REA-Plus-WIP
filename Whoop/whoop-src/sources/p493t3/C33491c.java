package p493t3;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import bp0.C3520h;
import c73.C4288d;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import l80.C23436m;
import l83.C23465k;
import m83.AbstractC25267u;
import p014aj.C0929d;
import p098dt.AbstractC12350b;
import p185h6.C16955j;
import p185h6.C16970y;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17922y0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p208i2.C17924z0;
import p270k2.AbstractC22132f;
import p294l3.AbstractC23256h;
import p294l3.AbstractC23278s;
import p294l3.C23245b0;
import p294l3.C23249d0;
import p294l3.C23250e;
import p294l3.C23251e0;
import p294l3.C23255g0;
import p294l3.C23264l;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p294l3.InterfaceC23243a0;
import p294l3.InterfaceC23244b;
import p318m3.C24974d;
import p318m3.C24977g;
import p318m3.C24978h;
import p356o3.C27491a;
import p356o3.C27494d;
import p356o3.C27495e;
import p356o3.C27496f;
import p356o3.C27497g;
import p356o3.C27498h;
import p356o3.C27499i;
import p356o3.C27500j;
import p356o3.C27501k;
import p390p1.InterfaceC28670t2;
import p392p3.AbstractC28771i;
import p392p3.C28765d0;
import p392p3.C28772j;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.InterfaceC28767e0;
import p392p3.InterfaceC28770h;
import p478s3.AbstractC32097c;
import p478s3.C32095a;
import p478s3.C32096b;
import p542v3.C35589b;
import p542v3.C35590c;
import p542v3.C35591d;
import p571w3.C36765a;
import p571w3.C36773i;
import p571w3.C36776l;
import p571w3.C36780p;
import p571w3.C36781q;
import p571w3.C36783s;
import p571w3.InterfaceC36779o;
import p636y3.C39183o;
import p636y3.C39184p;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import v63.AbstractC35745c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: t3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C33491c implements InterfaceC23243a0 {

    /* JADX INFO: renamed from: a */
    public final String f139819a;

    /* JADX INFO: renamed from: b */
    public final C23285v0 f139820b;

    /* JADX INFO: renamed from: c */
    public final List f139821c;

    /* JADX INFO: renamed from: d */
    public final List f139822d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC28770h f139823e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC39171c f139824f;

    /* JADX INFO: renamed from: g */
    public final C33492d f139825g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f139826h;

    /* JADX INFO: renamed from: i */
    public final C24978h f139827i;

    /* JADX INFO: renamed from: j */
    public C29938w0 f139828j;

    /* JADX INFO: renamed from: k */
    public final boolean f139829k;

    /* JADX INFO: renamed from: l */
    public final int f139830l;

    /* JADX WARN: Code duplicated, block: B:11:0x006c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0070  */
    /* JADX WARN: Code duplicated, block: B:218:0x0449  */
    /* JADX WARN: Code duplicated, block: B:224:0x0469  */
    /* JADX WARN: Code duplicated, block: B:230:0x0485  */
    /* JADX WARN: Code duplicated, block: B:231:0x048f  */
    /* JADX WARN: Code duplicated, block: B:233:0x049a  */
    /* JADX WARN: Code duplicated, block: B:234:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:241:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:245:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:247:0x0505  */
    /* JADX WARN: Code duplicated, block: B:255:0x0517  */
    /* JADX WARN: Code duplicated, block: B:259:0x0521  */
    /* JADX WARN: Code duplicated, block: B:269:0x0538  */
    /* JADX WARN: Code duplicated, block: B:275:0x0543  */
    /* JADX WARN: Code duplicated, block: B:278:0x057d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0583  */
    /* JADX WARN: Code duplicated, block: B:283:0x0591  */
    /* JADX WARN: Code duplicated, block: B:286:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:288:0x05c5 A[LOOP:9: B:287:0x05c3->B:288:0x05c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:293:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:295:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:297:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:298:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:300:0x0605  */
    /* JADX WARN: Code duplicated, block: B:311:0x063d  */
    /* JADX WARN: Code duplicated, block: B:316:0x065b  */
    /* JADX WARN: Code duplicated, block: B:318:0x0667  */
    /* JADX WARN: Code duplicated, block: B:325:0x067b  */
    /* JADX WARN: Code duplicated, block: B:377:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:379:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:381:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:388:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:401:0x081d  */
    /* JADX WARN: Code duplicated, block: B:403:0x082e  */
    /* JADX WARN: Code duplicated, block: B:404:0x0833  */
    /* JADX WARN: Code duplicated, block: B:406:0x083e  */
    /* JADX WARN: Code duplicated, block: B:407:0x0845  */
    /* JADX WARN: Code duplicated, block: B:409:0x0849  */
    /* JADX WARN: Code duplicated, block: B:412:0x0853  */
    /* JADX WARN: Code duplicated, block: B:414:0x085f  */
    /* JADX WARN: Code duplicated, block: B:415:0x0862  */
    /* JADX WARN: Code duplicated, block: B:417:0x0865  */
    /* JADX WARN: Code duplicated, block: B:427:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:429:0x08c4 A[LOOP:8: B:428:0x08c2->B:429:0x08c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:432:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:433:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:435:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:436:0x0901  */
    /* JADX WARN: Code duplicated, block: B:439:0x0919  */
    /* JADX WARN: Code duplicated, block: B:440:0x091c  */
    /* JADX WARN: Code duplicated, block: B:442:0x0922  */
    /* JADX WARN: Code duplicated, block: B:443:0x0925  */
    /* JADX WARN: Code duplicated, block: B:446:0x093c  */
    /* JADX WARN: Code duplicated, block: B:449:0x0941  */
    /* JADX WARN: Code duplicated, block: B:451:0x0948  */
    /* JADX WARN: Code duplicated, block: B:452:0x094b  */
    /* JADX WARN: Code duplicated, block: B:454:0x0952  */
    /* JADX WARN: Code duplicated, block: B:455:0x0955  */
    /* JADX WARN: Code duplicated, block: B:457:0x095c  */
    /* JADX WARN: Code duplicated, block: B:458:0x095f  */
    /* JADX WARN: Code duplicated, block: B:460:0x0966  */
    /* JADX WARN: Code duplicated, block: B:461:0x0969  */
    /* JADX WARN: Code duplicated, block: B:463:0x0970  */
    /* JADX WARN: Code duplicated, block: B:464:0x0973  */
    /* JADX WARN: Code duplicated, block: B:466:0x097a  */
    /* JADX WARN: Code duplicated, block: B:473:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:485:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x089a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x098c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t3.c] */
    /* JADX WARN: Type inference failed for: r0v15, types: [t3.c] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v42 */
    public C33491c(String str, C23285v0 c23285v0, List list, List list2, InterfaceC28770h interfaceC28770h, InterfaceC39171c interfaceC39171c) throws Throwable {
        Locale locale;
        int i13;
        Object obj;
        C28780r c28780r;
        int i14;
        Typeface typefaceM91572v;
        ?? arrayList;
        CharSequence charSequenceM47714g;
        float f13;
        long j7;
        int i15;
        C36781q c36781q;
        ArrayList arrayList2;
        Collection collection;
        int size;
        int i16;
        C23267m0 c23267m0;
        AbstractC28771i abstractC28771i;
        boolean z4;
        C23267m0 c23267m1;
        C3520h c3520h;
        int size2;
        int i17;
        int[] iArr;
        int size3;
        int i18;
        Collection collection2;
        int i19;
        int i24;
        int i25;
        int i26;
        int size4;
        int i27;
        ArrayList arrayList3;
        int i28;
        int i29;
        int i34;
        int i35;
        int size5;
        int i36;
        int i37;
        Spannable spannable;
        C36781q c36781q2;
        float f14;
        int size6;
        int i38;
        int size7;
        int i39;
        Object[] spans;
        int length;
        int i44;
        long jM124804b;
        long j13;
        int i45;
        long jM124804b2;
        int i46;
        int iM67311b;
        int i47;
        Object obj2;
        C23264l c23264l;
        float fM34562K;
        long j14;
        long jM124804b3;
        float fM124805c;
        int size8;
        int i48;
        C23250e c23250e;
        InterfaceC23244b interfaceC23244b;
        int i49;
        int i54;
        int i55;
        C23250e c23250e2;
        Object obj3;
        int i56;
        Spannable spannable2;
        int i57;
        int i58;
        C23250e c23250e3;
        Object obj4;
        C23267m0 c23267m2;
        boolean z13;
        long j15;
        long j16;
        int i59;
        long jM124804b4;
        float fM124805c2;
        long jM124804b5;
        float fM124805c3;
        C23251e0 c23251e0;
        ?? obj5 = new Object();
        obj5.f139819a = str;
        obj5.f139820b = c23285v0;
        obj5.f139821c = list;
        obj5.f139822d = list2;
        obj5.f139823e = interfaceC28770h;
        obj5.f139824f = interfaceC39171c;
        float density = interfaceC39171c.getDensity();
        int i64 = 1;
        C33492d c33492d = new C33492d(1);
        ((TextPaint) c33492d).density = density;
        c33492d.f139832b = C36776l.f157351b;
        c33492d.f139833c = 3;
        c33492d.f139834d = C17924z0.f69668d;
        obj5.f139825g = c33492d;
        C23255g0 c23255g0 = c23285v0.f92257c;
        C23267m0 c23267m3 = c23285v0.f92255a;
        C23245b0 c23245b0 = c23285v0.f92256b;
        C0929d c0929d = C33496h.f139844a;
        C0929d c0929d2 = C33496h.f139844a;
        InterfaceC28670t2 interfaceC28670t2M2351k = (InterfaceC28670t2) c0929d2.f3422w;
        if (interfaceC28670t2M2351k == null) {
            if (C16955j.m47709d()) {
                interfaceC28670t2M2351k = c0929d2.m2351k();
                c0929d2.f3422w = interfaceC28670t2M2351k;
            } else {
                interfaceC28670t2M2351k = AbstractC33497i.f139845a;
            }
        }
        obj5.f139829k = ((Boolean) interfaceC28670t2M2351k.getValue()).booleanValue();
        int i65 = c23245b0.f92105b;
        C32096b c32096b = c23267m3.f92201k;
        if (i65 == 4) {
            i13 = 2;
        } else if (i65 == 5) {
            i13 = 3;
        } else if (i65 == 1) {
            i13 = 0;
        } else if (i65 == 2) {
            i13 = 1;
        } else {
            if (i65 != 3 && i65 != Integer.MIN_VALUE) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((c32096b == null || (locale = c32096b.m99834a().f133097a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i13 = 2;
            } else {
                i13 = 3;
            }
        }
        obj5.f139830l = i13;
        C23436m c23436m = new C23436m(obj5, i64);
        C36783s c36783s = c23245b0.f92112i;
        c36783s = c36783s == null ? C36783s.f157364c : c36783s;
        c33492d.setFlags(c36783s.f157367b ? c33492d.getFlags() | 128 : c33492d.getFlags() & (-129));
        int i66 = c36783s.f157366a;
        if (i66 == 1) {
            c33492d.setFlags(c33492d.getFlags() | 64);
            c33492d.setHinting(0);
        } else if (i66 == 2) {
            c33492d.getFlags();
            c33492d.setHinting(1);
        } else if (i66 == 3) {
            c33492d.getFlags();
            c33492d.setHinting(0);
        } else {
            c33492d.getFlags();
        }
        int size9 = list.size();
        int i67 = 0;
        while (true) {
            if (i67 >= size9) {
                obj = null;
                break;
            }
            obj = list.get(i67);
            if (((C23250e) obj).f92125a instanceof C23267m0) {
                break;
            } else {
                i67++;
            }
        }
        boolean z14 = obj != null;
        long j17 = c23267m3.f92192b;
        C28780r c28780r2 = c23267m3.f92193c;
        C28776n c28776n = c23267m3.f92194d;
        String str2 = c23267m3.f92197g;
        C32096b c32096b2 = c23267m3.f92201k;
        InterfaceC36779o interfaceC36779o = c23267m3.f92191a;
        C36780p c36780p = c23267m3.f92200j;
        long j18 = c23267m3.f92198h;
        long jM124804b6 = C39183o.m124804b(j17);
        boolean z15 = z14;
        if (C39184p.m124808a(jM124804b6, 4294967296L)) {
            c33492d.setTextSize(interfaceC39171c.mo726K(j17));
        } else if (C39184p.m124808a(jM124804b6, 8589934592L)) {
            c33492d.setTextSize(C39183o.m124805c(j17) * c33492d.getTextSize());
        }
        AbstractC28771i abstractC28771i2 = c23267m3.f92196f;
        if (abstractC28771i2 != null || c28776n != null || c28780r2 != null) {
            if (c28780r2 == null) {
                c28780r = C28780r.f116539F;
            }
            if (c28776n != null) {
                c28780r = c28780r2;
                i14 = c28776n.f116535a;
            } else {
                c28780r = c28780r2;
                i14 = 0;
            }
            C28777o c28777o = c23267m3.f92195e;
            int i68 = c28777o != null ? c28777o.f116536a : 65535;
            C33491c c33491c = (C33491c) c23436m.f92857x;
            InterfaceC28767e0 interfaceC28767e0M87529b = ((C28772j) c33491c.f139823e).m87529b(abstractC28771i2, c28780r, i14, i68);
            if (interfaceC28767e0M87529b instanceof C28765d0) {
                Object obj6 = ((C28765d0) interfaceC28767e0M87529b).f116515w;
                AbstractC22676k.m65748h(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                typefaceM91572v = (Typeface) obj6;
            } else {
                C29938w0 c29938w0 = new C29938w0(interfaceC28767e0M87529b, c33491c.f139828j);
                c33491c.f139828j = c29938w0;
                typefaceM91572v = c29938w0.m91572v();
            }
            c33492d.setTypeface(typefaceM91572v);
        }
        if (c32096b2 != null) {
            C32096b c32096b3 = C32096b.f133098y;
            if (!c32096b2.equals(AbstractC32097c.f133101a.m99485i())) {
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(c32096b2, 10));
                Iterator it = c32096b2.f133099w.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((C32095a) it.next()).f133097a);
                }
                Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                c33492d.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            c33492d.setFontFeatureSettings(str2);
        }
        if (c36780p != null && !c36780p.equals(C36780p.f157357c)) {
            c33492d.setTextScaleX(c33492d.getTextScaleX() * c36780p.f157358a);
            c33492d.setTextSkewX(c33492d.getTextSkewX() + c36780p.f157359b);
        }
        c33492d.m105880d(interfaceC36779o.mo117875b());
        c33492d.m105879c(interfaceC36779o.mo117876c(), 9205357640488583168L, interfaceC36779o.mo117874a());
        c33492d.m105882f(c23267m3.f92204n);
        c33492d.m105883g(c23267m3.f92203m);
        c33492d.m105881e(c23267m3.f92206p);
        if (C39184p.m124808a(C39183o.m124804b(j18), 4294967296L) && C39183o.m124805c(j18) != 0.0f) {
            float textScaleX = c33492d.getTextScaleX() * c33492d.getTextSize();
            float fMo726K = interfaceC39171c.mo726K(j18);
            if (textScaleX != 0.0f) {
                c33492d.setLetterSpacing(fMo726K / textScaleX);
            }
        } else if (C39184p.m124808a(C39183o.m124804b(j18), 8589934592L)) {
            c33492d.setLetterSpacing(C39183o.m124805c(j18));
        }
        long j19 = c23267m3.f92202l;
        C36765a c36765a = c23267m3.f92199i;
        boolean z16 = z15 && C39184p.m124808a(C39183o.m124804b(j18), 4294967296L) && C39183o.m124805c(j18) != 0.0f;
        long j24 = C17919x.f69637n;
        boolean z17 = (C17919x.m51542d(j19, j24) || C17919x.m51542d(j19, C17919x.f69636m)) ? false : true;
        boolean z18 = (c36765a == null || Float.compare(c36765a.f157332a, 0.0f) == 0) ? false : true;
        C23267m0 c23267m4 = (z16 || z17 || z18) ? new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, z16 ? j18 : C39183o.f168428c, z18 ? c36765a : null, (C36780p) null, (C32096b) null, z17 ? j19 : j24, (C36776l) null, (C17924z0) null, 63103) : null;
        if (c23267m4 != null) {
            int size10 = obj5.f139821c.size() + 1;
            arrayList = new ArrayList(size10);
            int i69 = 0;
            while (i69 < size10) {
                arrayList.add(i69 == 0 ? new C23250e(c23267m4, 0, obj5.f139819a.length()) : (C23250e) obj5.f139821c.get(i69 - 1));
                i69++;
            }
        } else {
            arrayList = obj5.f139821c;
        }
        String str3 = obj5.f139819a;
        float textSize = obj5.f139825g.getTextSize();
        C23285v0 c23285v1 = obj5.f139820b;
        List list3 = obj5.f139822d;
        InterfaceC39171c interfaceC39171c2 = obj5.f139824f;
        boolean z19 = obj5.f139829k;
        C33489a c33489a = AbstractC33490b.f139818a;
        if (z19 && C16955j.m47709d()) {
            C23255g0 c23255g1 = c23285v1.f92257c;
            if (c23255g1 != null) {
                C23251e0 c23251e1 = c23255g1.f92139b;
            }
            charSequenceM47714g = C16955j.m47708a().m47714g(0, str3.length(), 0, str3);
            AbstractC22676k.m65747g(charSequenceM47714g);
        } else {
            charSequenceM47714g = str3;
        }
        if (arrayList.isEmpty() && list3.isEmpty()) {
            f13 = 0.0f;
            if (!AbstractC22676k.m65745e(c23285v1.f92256b.f92107d, C36781q.f157360c) || (c23285v1.f92256b.f92106c & 1095216660480L) != 0) {
            }
            ?? r10 = obj5;
            r10.f139826h = charSequenceM47714g;
            r10.f139827i = new C24978h(charSequenceM47714g, r10.f139825g, r10.f139830l);
        }
        f13 = 0.0f;
        ?? r14 = obj5;
        Spannable spannableString = charSequenceM47714g instanceof Spannable ? (Spannable) charSequenceM47714g : new SpannableString(charSequenceM47714g);
        C23267m0 c23267m5 = c23285v1.f92255a;
        C23245b0 c23245b1 = c23285v1.f92256b;
        if (AbstractC22676k.m65745e(c23267m5.f92203m, C36776l.f157352c)) {
            spannableString.setSpan(AbstractC33490b.f139818a, 0, str3.length(), 33);
        }
        C23255g0 c23255g2 = c23285v1.f92257c;
        if (!((c23255g2 == null || (c23251e0 = c23255g2.f92139b) == null) ? false : c23251e0.f92130a) || c23245b1.f92109f != null) {
            C36773i c36773i = c23245b1.f92109f;
            c36773i = c36773i == null ? C36773i.f157344c : c36773i;
            j7 = 1095216660480L;
            float fM34563L = AbstractC12350b.m34563L(textSize, c23245b1.f92106c, interfaceC39171c2);
            if (!Float.isNaN(fM34563L)) {
                int length2 = (spannableString.length() == 0 || AbstractC39414r.m125891j0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                int i74 = c36773i.f157346b;
                i15 = 0;
                spannableString.setSpan(new C27497g(fM34563L, length2, (i74 & 1) > 0, (i74 & 16) > 0, c36773i.f157345a, false), 0, spannableString.length(), 33);
            }
            c36781q = c23245b1.f92107d;
            if (c36781q != null) {
                j15 = c36781q.f157361a;
                j16 = c36781q.f157362b;
                i59 = i15;
                if ((C39183o.m124803a(j15, AbstractC35745c.m113246h(i59)) || !C39183o.m124803a(j16, AbstractC35745c.m113246h(i59))) && (j15 & j7) != 0 && (j16 & j7) != 0) {
                    jM124804b4 = C39183o.m124804b(j15);
                    if (C39184p.m124808a(jM124804b4, 4294967296L)) {
                        fM124805c2 = interfaceC39171c2.mo726K(j15);
                    } else if (C39184p.m124808a(jM124804b4, 8589934592L)) {
                        fM124805c2 = C39183o.m124805c(j15) * textSize;
                    } else {
                        fM124805c2 = f13;
                    }
                    jM124804b5 = C39183o.m124804b(j16);
                    if (C39184p.m124808a(jM124804b5, 4294967296L)) {
                        fM124805c3 = interfaceC39171c2.mo726K(j16);
                    } else if (C39184p.m124808a(jM124804b5, 8589934592L)) {
                        fM124805c3 = C39183o.m124805c(j16) * textSize;
                    } else {
                        fM124805c3 = f13;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM124805c2), (int) Math.ceil(fM124805c3)), 0, spannableString.length(), 33);
                }
            }
            arrayList2 = new ArrayList(arrayList.size());
            collection = (Collection) arrayList;
            size = collection.size();
            for (i16 = 0; i16 < size; i16++) {
                c23250e3 = (C23250e) arrayList.get(i16);
                obj4 = c23250e3.f92125a;
                if (obj4 instanceof C23267m0) {
                    c23267m2 = (C23267m0) obj4;
                    if (c23267m2.f92196f != null && c23267m2.f92194d == null && c23267m2.f92193c == null) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13 || ((C23267m0) obj4).f92195e != null) {
                        arrayList2.add(c23250e3);
                    }
                }
            }
            c23267m0 = c23285v1.f92255a;
            abstractC28771i = c23267m0.f92196f;
            if (abstractC28771i != null && c23267m0.f92194d == null && c23267m0.f92193c == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4 && c23267m0.f92195e == null) {
                c23267m1 = null;
            } else {
                c23267m1 = new C23267m0(0L, 0L, c23267m0.f92193c, c23267m0.f92194d, c23267m0.f92195e, abstractC28771i, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65475);
            }
            c3520h = new C3520h(3, spannableString, c23436m);
            if (arrayList2.size() <= 1) {
                if (!arrayList2.isEmpty()) {
                    C23267m0 c23267m6 = (C23267m0) ((C23250e) arrayList2.get(0)).f92125a;
                    c3520h.invoke(c23267m1 != null ? c23267m1.m67328d(c23267m6) : c23267m6, Integer.valueOf(((C23250e) arrayList2.get(0)).f92126b), Integer.valueOf(((C23250e) arrayList2.get(0)).f92127c));
                }
                collection2 = collection;
                i19 = 0;
            } else {
                size2 = arrayList2.size();
                i17 = size2 * 2;
                iArr = new int[i17];
                size3 = arrayList2.size();
                i18 = 0;
                while (i18 < size3) {
                    C23250e c23250e4 = (C23250e) arrayList2.get(i18);
                    iArr[i18] = c23250e4.f92126b;
                    iArr[i18 + size2] = c23250e4.f92127c;
                    i18++;
                    collection = collection;
                }
                collection2 = collection;
                if (i17 > 1) {
                    Arrays.sort(iArr);
                }
                if (i17 != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                i19 = 0;
                i24 = iArr[0];
                i25 = 0;
                while (i25 < i17) {
                    i26 = iArr[i25];
                    if (i26 == i24) {
                        arrayList3 = arrayList2;
                        i28 = i25;
                        i29 = i17;
                    } else {
                        size4 = arrayList2.size();
                        i27 = 0;
                        while (i27 < size4) {
                            ArrayList arrayList5 = arrayList2;
                            C23250e c23250e5 = (C23250e) arrayList2.get(i27);
                            int i75 = i25;
                            i34 = c23250e5.f92126b;
                            int i76 = i17;
                            i35 = c23250e5.f92127c;
                            if (i34 == i35 && AbstractC23256h.m67320b(i24, i26, i34, i35)) {
                                C23267m0 c23267m7 = (C23267m0) c23250e5.f92125a;
                                c23267m1 = c23267m1 != null ? c23267m1.m67328d(c23267m7) : c23267m7;
                            }
                            i27++;
                            i25 = i75;
                            arrayList2 = arrayList5;
                            i17 = i76;
                        }
                        arrayList3 = arrayList2;
                        i28 = i25;
                        i29 = i17;
                        if (c23267m1 != null) {
                            c3520h.invoke(c23267m1, Integer.valueOf(i24), Integer.valueOf(i26));
                        }
                        i24 = i26;
                    }
                    i25 = i28 + 1;
                    c23267m1 = c23267m1;
                    arrayList2 = arrayList3;
                    i17 = i29;
                }
            }
            size5 = collection2.size();
            i36 = i19;
            i37 = i36;
            while (i36 < size5) {
                c23250e2 = (C23250e) arrayList.get(i36);
                obj3 = c23250e2.f92125a;
                if (obj3 instanceof C23267m0) {
                    i57 = c23250e2.f92126b;
                    int i77 = c23250e2.f92127c;
                    if (i57 >= 0 || i57 >= spannableString.length() || i77 <= i57 || i77 > spannableString.length()) {
                        size5 = size5;
                        i56 = i36;
                        i37 = i37;
                        spannable2 = spannableString;
                    } else {
                        C23267m0 c23267m8 = (C23267m0) obj3;
                        long j25 = c23267m8.f92198h;
                        C36765a c36765a2 = c23267m8.f92199i;
                        InterfaceC36779o interfaceC36779o2 = c23267m8.f92191a;
                        if (c36765a2 != null) {
                            spannableString.setSpan(new C27491a(c36765a2.f157332a), i57, i77, 33);
                        }
                        i56 = i36;
                        AbstractC12350b.m34567P(spannableString, interfaceC36779o2.mo117875b(), i57, i77);
                        AbstractC17911t abstractC17911tMo117876c = interfaceC36779o2.mo117876c();
                        float fMo117874a = interfaceC36779o2.mo117874a();
                        if (abstractC17911tMo117876c != null) {
                            if (abstractC17911tMo117876c instanceof C17875c1) {
                                AbstractC12350b.m34567P(spannableString, ((C17875c1) abstractC17911tMo117876c).f69559c, i57, i77);
                            } else {
                                spannableString.setSpan(new C35591d((AbstractC17922y0) abstractC17911tMo117876c, fMo117874a), i57, i77, 33);
                            }
                        }
                        C36776l c36776l = c23267m8.f92203m;
                        if (c36776l != null) {
                            int i78 = c36776l.f157354a;
                            C27501k c27501k = new C27501k((i78 | 1) == i78 ? 1 : i19, (i78 | 2) == i78 ? 1 : i19);
                            i58 = 33;
                            spannableString.setSpan(c27501k, i57, i77, 33);
                        } else {
                            i58 = 33;
                        }
                        AbstractC12350b.m34568Q(spannableString, c23267m8.f92192b, interfaceC39171c2, i57, i77);
                        spannable2 = spannableString;
                        String str4 = c23267m8.f92197g;
                        if (str4 != null) {
                            spannable2.setSpan(new C4288d(str4, 1), i57, i77, i58);
                        }
                        C36780p c36780p2 = c23267m8.f92200j;
                        if (c36780p2 != null) {
                            spannable2.setSpan(new ScaleXSpan(c36780p2.f157358a), i57, i77, i58);
                            spannable2.setSpan(new C27500j(c36780p2.f157359b), i57, i77, i58);
                        }
                        AbstractC12350b.m34569R(spannable2, c23267m8.f92201k, i57, i77);
                        long j26 = c23267m8.f92202l;
                        if (j26 != 16) {
                            spannable2.setSpan(new BackgroundColorSpan(AbstractC17918w0.m51506H(j26)), i57, i77, i58);
                        }
                        C17924z0 c17924z0 = c23267m8.f92204n;
                        if (c17924z0 != null) {
                            long j27 = c17924z0.f69670b;
                            int iM51506H = AbstractC17918w0.m51506H(c17924z0.f69669a);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j27 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j27 & 4294967295L));
                            float f15 = c17924z0.f69671c;
                            C27499i c27499i = new C27499i(iM51506H, fIntBitsToFloat, fIntBitsToFloat2, f15 == f13 ? Float.MIN_VALUE : f15);
                            spannable2 = spannable2;
                            i58 = 33;
                            spannable2.setSpan(c27499i, i57, i77, 33);
                        }
                        AbstractC22132f abstractC22132f = c23267m8.f92206p;
                        if (abstractC22132f != null) {
                            spannable2.setSpan(new C35590c(abstractC22132f), i57, i77, i58);
                        }
                        i37 = (C39184p.m124808a(C39183o.m124804b(j25), 4294967296L) || C39184p.m124808a(C39183o.m124804b(j25), 8589934592L)) ? 1 : i37;
                    }
                    i37 = i37;
                } else {
                    size5 = size5;
                    i56 = i36;
                    i37 = i37;
                    spannable2 = spannableString;
                    i37 = i37;
                }
                spannableString = spannable2;
                i36 = i56 + 1;
                size5 = size5;
            }
            spannable = spannableString;
            if (i37 != 0) {
                size8 = collection2.size();
                i48 = i19;
                while (i48 < size8) {
                    c23250e = (C23250e) arrayList.get(i48);
                    interfaceC23244b = (InterfaceC23244b) c23250e.f92125a;
                    if (interfaceC23244b instanceof C23267m0) {
                        i55 = c23250e.f92126b;
                        int i79 = c23250e.f92127c;
                        if (i55 >= 0 || i55 >= spannable.length() || i79 <= i55 || i79 > spannable.length()) {
                            i49 = size8;
                            i54 = i48;
                        } else {
                            long j28 = ((C23267m0) interfaceC23244b).f92198h;
                            i54 = i48;
                            long jM124804b7 = C39183o.m124804b(j28);
                            i49 = size8;
                            Object c27495e = C39184p.m124808a(jM124804b7, 4294967296L) ? new C27495e(interfaceC39171c2.mo726K(j28)) : C39184p.m124808a(jM124804b7, 8589934592L) ? new C27494d(C39183o.m124805c(j28)) : null;
                            if (c27495e != null) {
                                spannable.setSpan(c27495e, i55, i79, 33);
                            }
                        }
                    } else {
                        i49 = size8;
                        i54 = i48;
                    }
                    i48 = i54 + 1;
                    size8 = i49;
                }
            }
            c36781q2 = c23245b1.f92107d;
            if (c36781q2 != null) {
                j14 = c36781q2.f157361a;
                jM124804b3 = C39183o.m124804b(j14);
                if (C39184p.m124808a(jM124804b3, 4294967296L)) {
                    fM124805c = interfaceC39171c2.mo726K(j14);
                } else if (C39184p.m124808a(jM124804b3, 8589934592L)) {
                    fM124805c = C39183o.m124805c(j14) * textSize;
                } else {
                    fM124805c = f13;
                }
                f14 = fM124805c;
            } else {
                f14 = f13;
            }
            size6 = collection2.size();
            for (i38 = i19; i38 < size6; i38++) {
                C23250e c23250e6 = (C23250e) arrayList.get(i38);
                obj2 = c23250e6.f92125a;
                if (obj2 instanceof C23264l) {
                    c23264l = (C23264l) obj2;
                } else {
                    c23264l = null;
                }
                if (c23264l != null) {
                    fM34562K = AbstractC12350b.m34562K(textSize, c23264l.f92162a, interfaceC39171c2);
                    float fM34562K2 = AbstractC12350b.m34562K(textSize, c23264l.f92163b, interfaceC39171c2);
                    float fM34562K3 = AbstractC12350b.m34562K(textSize, c23264l.f92164c, interfaceC39171c2);
                    if (Float.isNaN(fM34562K) && !Float.isNaN(fM34562K2) && !Float.isNaN(fM34562K3)) {
                        InterfaceC39171c interfaceC39171c3 = interfaceC39171c2;
                        interfaceC39171c2 = interfaceC39171c3;
                        spannable.setSpan(new C35589b(fM34562K, fM34562K2, fM34562K3, interfaceC39171c3, f14), c23250e6.f92126b, c23250e6.f92127c, 33);
                    }
                }
            }
            size7 = list3.size();
            i39 = i19;
            while (i39 < size7) {
                List list4 = list3;
                C23250e c23250e7 = (C23250e) list4.get(i39);
                C23249d0 c23249d0 = (C23249d0) c23250e7.f92125a;
                int i83 = c23250e7.f92126b;
                int i84 = c23250e7.f92127c;
                spans = spannable.getSpans(i83, i84, C16970y.class);
                length = spans.length;
                for (i44 = i19; i44 < length; i44++) {
                    spannable.removeSpan((C16970y) spans[i44]);
                }
                float fM124805c4 = C39183o.m124805c(c23249d0.m67312c());
                jM124804b = C39183o.m124804b(c23249d0.m67312c());
                if (C39184p.m124808a(jM124804b, 4294967296L)) {
                    i45 = i19;
                    j13 = 8589934592L;
                } else {
                    j13 = 8589934592L;
                    if (C39184p.m124808a(jM124804b, 8589934592L)) {
                        i45 = 1;
                    } else {
                        i45 = 2;
                    }
                }
                float fM124805c5 = C39183o.m124805c(c23249d0.m67310a());
                jM124804b2 = C39183o.m124804b(c23249d0.m67310a());
                if (C39184p.m124808a(jM124804b2, 4294967296L)) {
                    i46 = i19;
                } else if (C39184p.m124808a(jM124804b2, j13)) {
                    i46 = 1;
                } else {
                    i46 = 2;
                }
                float density2 = interfaceC39171c2.getDensity() * interfaceC39171c2.getFontScale();
                iM67311b = c23249d0.m67311b();
                if (AbstractC23278s.m67344a(iM67311b, 1)) {
                    i47 = i19;
                } else {
                    if (AbstractC23278s.m67344a(iM67311b, 2)) {
                        i47 = 1;
                    } else if (AbstractC23278s.m67344a(iM67311b, 3)) {
                        i47 = 2;
                    } else if (AbstractC23278s.m67344a(iM67311b, 4)) {
                        i47 = 3;
                    } else if (AbstractC23278s.m67344a(iM67311b, 5)) {
                        i47 = 4;
                    } else if (AbstractC23278s.m67344a(iM67311b, 6)) {
                        i47 = 5;
                    } else {
                        if (AbstractC23278s.m67344a(iM67311b, 7)) {
                            throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                        }
                        i47 = 6;
                    }
                    spannable.setSpan(new C27498h(fM124805c4, i45, fM124805c5, i46, density2, i47), i83, i84, 33);
                    i39++;
                    list3 = list4;
                }
                spannable.setSpan(new C27498h(fM124805c4, i45, fM124805c5, i46, density2, i47), i83, i84, 33);
                i39++;
                list3 = list4;
            }
            r14 = this;
            charSequenceM47714g = spannable;
            ?? r15 = obj5;
            r15.f139826h = charSequenceM47714g;
            r15.f139827i = new C24978h(charSequenceM47714g, r15.f139825g, r15.f139830l);
        }
        float fM34563L2 = AbstractC12350b.m34563L(textSize, c23245b1.f92106c, interfaceC39171c2);
        if (!Float.isNaN(fM34563L2)) {
            spannableString.setSpan(new C27496f(fM34563L2), 0, spannableString.length(), 33);
        }
        j7 = 1095216660480L;
        i15 = 0;
        c36781q = c23245b1.f92107d;
        if (c36781q != null) {
            j15 = c36781q.f157361a;
            j16 = c36781q.f157362b;
            i59 = i15;
            if (C39183o.m124803a(j15, AbstractC35745c.m113246h(i59))) {
                jM124804b4 = C39183o.m124804b(j15);
                if (C39184p.m124808a(jM124804b4, 4294967296L)) {
                    fM124805c2 = interfaceC39171c2.mo726K(j15);
                } else if (C39184p.m124808a(jM124804b4, 8589934592L)) {
                    fM124805c2 = C39183o.m124805c(j15) * textSize;
                } else {
                    fM124805c2 = f13;
                }
                jM124804b5 = C39183o.m124804b(j16);
                if (C39184p.m124808a(jM124804b5, 4294967296L)) {
                    fM124805c3 = interfaceC39171c2.mo726K(j16);
                } else if (C39184p.m124808a(jM124804b5, 8589934592L)) {
                    fM124805c3 = C39183o.m124805c(j16) * textSize;
                } else {
                    fM124805c3 = f13;
                }
                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM124805c2), (int) Math.ceil(fM124805c3)), 0, spannableString.length(), 33);
            } else {
                jM124804b4 = C39183o.m124804b(j15);
                if (C39184p.m124808a(jM124804b4, 4294967296L)) {
                    fM124805c2 = interfaceC39171c2.mo726K(j15);
                } else if (C39184p.m124808a(jM124804b4, 8589934592L)) {
                    fM124805c2 = C39183o.m124805c(j15) * textSize;
                } else {
                    fM124805c2 = f13;
                }
                jM124804b5 = C39183o.m124804b(j16);
                if (C39184p.m124808a(jM124804b5, 4294967296L)) {
                    fM124805c3 = interfaceC39171c2.mo726K(j16);
                } else if (C39184p.m124808a(jM124804b5, 8589934592L)) {
                    fM124805c3 = C39183o.m124805c(j16) * textSize;
                } else {
                    fM124805c3 = f13;
                }
                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM124805c2), (int) Math.ceil(fM124805c3)), 0, spannableString.length(), 33);
            }
        }
        arrayList2 = new ArrayList(arrayList.size());
        collection = (Collection) arrayList;
        size = collection.size();
        while (i16 < size) {
            c23250e3 = (C23250e) arrayList.get(i16);
            obj4 = c23250e3.f92125a;
            if (obj4 instanceof C23267m0) {
                c23267m2 = (C23267m0) obj4;
                if (c23267m2.f92196f != null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (z13) {
                    arrayList2.add(c23250e3);
                } else {
                    arrayList2.add(c23250e3);
                }
            }
        }
        c23267m0 = c23285v1.f92255a;
        abstractC28771i = c23267m0.f92196f;
        if (abstractC28771i != null) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z4) {
            c23267m1 = new C23267m0(0L, 0L, c23267m0.f92193c, c23267m0.f92194d, c23267m0.f92195e, abstractC28771i, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65475);
        } else {
            c23267m1 = new C23267m0(0L, 0L, c23267m0.f92193c, c23267m0.f92194d, c23267m0.f92195e, abstractC28771i, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65475);
        }
        c3520h = new C3520h(3, spannableString, c23436m);
        if (arrayList2.size() <= 1) {
            if (!arrayList2.isEmpty()) {
                C23267m0 c23267m9 = (C23267m0) ((C23250e) arrayList2.get(0)).f92125a;
                c3520h.invoke(c23267m1 != null ? c23267m1.m67328d(c23267m9) : c23267m9, Integer.valueOf(((C23250e) arrayList2.get(0)).f92126b), Integer.valueOf(((C23250e) arrayList2.get(0)).f92127c));
            }
            collection2 = collection;
            i19 = 0;
        } else {
            size2 = arrayList2.size();
            i17 = size2 * 2;
            iArr = new int[i17];
            size3 = arrayList2.size();
            i18 = 0;
            while (i18 < size3) {
                C23250e c23250e8 = (C23250e) arrayList2.get(i18);
                iArr[i18] = c23250e8.f92126b;
                iArr[i18 + size2] = c23250e8.f92127c;
                i18++;
                collection = collection;
            }
            collection2 = collection;
            if (i17 > 1) {
                Arrays.sort(iArr);
            }
            if (i17 != 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            i19 = 0;
            i24 = iArr[0];
            i25 = 0;
            while (i25 < i17) {
                i26 = iArr[i25];
                if (i26 == i24) {
                    arrayList3 = arrayList2;
                    i28 = i25;
                    i29 = i17;
                } else {
                    size4 = arrayList2.size();
                    i27 = 0;
                    while (i27 < size4) {
                        ArrayList arrayList6 = arrayList2;
                        C23250e c23250e9 = (C23250e) arrayList2.get(i27);
                        int i710 = i25;
                        i34 = c23250e9.f92126b;
                        int i711 = i17;
                        i35 = c23250e9.f92127c;
                        if (i34 == i35) {
                        }
                        i27++;
                        i25 = i710;
                        arrayList2 = arrayList6;
                        i17 = i711;
                    }
                    arrayList3 = arrayList2;
                    i28 = i25;
                    i29 = i17;
                    if (c23267m1 != null) {
                        c3520h.invoke(c23267m1, Integer.valueOf(i24), Integer.valueOf(i26));
                    }
                    i24 = i26;
                }
                i25 = i28 + 1;
                c23267m1 = c23267m1;
                arrayList2 = arrayList3;
                i17 = i29;
            }
        }
        size5 = collection2.size();
        i36 = i19;
        i37 = i36;
        while (i36 < size5) {
            c23250e2 = (C23250e) arrayList.get(i36);
            obj3 = c23250e2.f92125a;
            if (obj3 instanceof C23267m0) {
                i57 = c23250e2.f92126b;
                int i712 = c23250e2.f92127c;
                if (i57 >= 0) {
                    size5 = size5;
                    i56 = i36;
                    i37 = i37;
                    spannable2 = spannableString;
                    i37 = i37;
                } else {
                    size5 = size5;
                    i56 = i36;
                    i37 = i37;
                    spannable2 = spannableString;
                    i37 = i37;
                }
            } else {
                size5 = size5;
                i56 = i36;
                i37 = i37;
                spannable2 = spannableString;
                i37 = i37;
            }
            spannableString = spannable2;
            i36 = i56 + 1;
            size5 = size5;
        }
        spannable = spannableString;
        if (i37 != 0) {
            size8 = collection2.size();
            i48 = i19;
            while (i48 < size8) {
                c23250e = (C23250e) arrayList.get(i48);
                interfaceC23244b = (InterfaceC23244b) c23250e.f92125a;
                if (interfaceC23244b instanceof C23267m0) {
                    i55 = c23250e.f92126b;
                    int i713 = c23250e.f92127c;
                    if (i55 >= 0) {
                        i49 = size8;
                        i54 = i48;
                    } else {
                        i49 = size8;
                        i54 = i48;
                    }
                } else {
                    i49 = size8;
                    i54 = i48;
                }
                i48 = i54 + 1;
                size8 = i49;
            }
        }
        c36781q2 = c23245b1.f92107d;
        if (c36781q2 != null) {
            j14 = c36781q2.f157361a;
            jM124804b3 = C39183o.m124804b(j14);
            if (C39184p.m124808a(jM124804b3, 4294967296L)) {
                fM124805c = interfaceC39171c2.mo726K(j14);
            } else if (C39184p.m124808a(jM124804b3, 8589934592L)) {
                fM124805c = C39183o.m124805c(j14) * textSize;
            } else {
                fM124805c = f13;
            }
            f14 = fM124805c;
        } else {
            f14 = f13;
        }
        size6 = collection2.size();
        while (i38 < size6) {
            C23250e c23250e10 = (C23250e) arrayList.get(i38);
            obj2 = c23250e10.f92125a;
            if (obj2 instanceof C23264l) {
                c23264l = (C23264l) obj2;
            } else {
                c23264l = null;
            }
            if (c23264l != null) {
                fM34562K = AbstractC12350b.m34562K(textSize, c23264l.f92162a, interfaceC39171c2);
                float fM34562K4 = AbstractC12350b.m34562K(textSize, c23264l.f92163b, interfaceC39171c2);
                float fM34562K5 = AbstractC12350b.m34562K(textSize, c23264l.f92164c, interfaceC39171c2);
                if (Float.isNaN(fM34562K)) {
                }
            }
        }
        size7 = list3.size();
        i39 = i19;
        while (i39 < size7) {
            List list5 = list3;
            C23250e c23250e11 = (C23250e) list5.get(i39);
            C23249d0 c23249d1 = (C23249d0) c23250e11.f92125a;
            int i85 = c23250e11.f92126b;
            int i86 = c23250e11.f92127c;
            spans = spannable.getSpans(i85, i86, C16970y.class);
            length = spans.length;
            while (i44 < length) {
                spannable.removeSpan((C16970y) spans[i44]);
            }
            float fM124805c6 = C39183o.m124805c(c23249d1.m67312c());
            jM124804b = C39183o.m124804b(c23249d1.m67312c());
            if (C39184p.m124808a(jM124804b, 4294967296L)) {
                i45 = i19;
                j13 = 8589934592L;
            } else {
                j13 = 8589934592L;
                if (C39184p.m124808a(jM124804b, 8589934592L)) {
                    i45 = 1;
                } else {
                    i45 = 2;
                }
            }
            float fM124805c7 = C39183o.m124805c(c23249d1.m67310a());
            jM124804b2 = C39183o.m124804b(c23249d1.m67310a());
            if (C39184p.m124808a(jM124804b2, 4294967296L)) {
                i46 = i19;
            } else if (C39184p.m124808a(jM124804b2, j13)) {
                i46 = 1;
            } else {
                i46 = 2;
            }
            float density3 = interfaceC39171c2.getDensity() * interfaceC39171c2.getFontScale();
            iM67311b = c23249d1.m67311b();
            if (AbstractC23278s.m67344a(iM67311b, 1)) {
                i47 = i19;
            } else {
                if (AbstractC23278s.m67344a(iM67311b, 2)) {
                    i47 = 1;
                } else if (AbstractC23278s.m67344a(iM67311b, 3)) {
                    i47 = 2;
                } else if (AbstractC23278s.m67344a(iM67311b, 4)) {
                    i47 = 3;
                } else if (AbstractC23278s.m67344a(iM67311b, 5)) {
                    i47 = 4;
                } else if (AbstractC23278s.m67344a(iM67311b, 6)) {
                    i47 = 5;
                } else {
                    if (AbstractC23278s.m67344a(iM67311b, 7)) {
                        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                    }
                    i47 = 6;
                }
                spannable.setSpan(new C27498h(fM124805c6, i45, fM124805c7, i46, density3, i47), i85, i86, 33);
                i39++;
                list3 = list5;
            }
            spannable.setSpan(new C27498h(fM124805c6, i45, fM124805c7, i46, density3, i47), i85, i86, 33);
            i39++;
            list3 = list5;
        }
        r15 = this;
        charSequenceM47714g = spannable;
        ?? r16 = obj5;
        r16.f139826h = charSequenceM47714g;
        r16.f139827i = new C24978h(charSequenceM47714g, r16.f139825g, r16.f139830l);
    }

    @Override // p294l3.InterfaceC23243a0
    /* JADX INFO: renamed from: b */
    public final boolean mo1618b() {
        C29938w0 c29938w0 = this.f139828j;
        if (c29938w0 != null ? c29938w0.m91575y() : false) {
            return true;
        }
        if (!this.f139829k) {
            C23255g0 c23255g0 = this.f139820b.f92257c;
            C0929d c0929d = C33496h.f139844a;
            C0929d c0929d2 = C33496h.f139844a;
            InterfaceC28670t2 interfaceC28670t2M2351k = (InterfaceC28670t2) c0929d2.f3422w;
            if (interfaceC28670t2M2351k == null) {
                if (C16955j.m47709d()) {
                    interfaceC28670t2M2351k = c0929d2.m2351k();
                    c0929d2.f3422w = interfaceC28670t2M2351k;
                } else {
                    interfaceC28670t2M2351k = AbstractC33497i.f139845a;
                }
            }
            if (((Boolean) interfaceC28670t2M2351k.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p294l3.InterfaceC23243a0
    /* JADX INFO: renamed from: c */
    public final float mo1619c() {
        return this.f139827i.m73303c();
    }

    @Override // p294l3.InterfaceC23243a0
    /* JADX INFO: renamed from: g */
    public final float mo1623g() {
        float f13;
        C24978h c24978h = this.f139827i;
        float f14 = c24978h.f97756e;
        TextPaint textPaint = c24978h.f97753b;
        if (!Float.isNaN(f14)) {
            return c24978h.f97756e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c24978h.f97752a;
        lineInstance.setText(new C24974d(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C24977g(0));
        int i13 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C23465k(Integer.valueOf(i13), Integer.valueOf(next)));
            } else {
                C23465k c23465k = (C23465k) priorityQueue.peek();
                if (c23465k != null && ((Number) c23465k.f92938x).intValue() - ((Number) c23465k.f92937w).intValue() < next - i13) {
                    priorityQueue.poll();
                    priorityQueue.add(new C23465k(Integer.valueOf(i13), Integer.valueOf(next)));
                }
            }
            i13 = next;
        }
        if (priorityQueue.isEmpty()) {
            f13 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C23465k c23465k2 = (C23465k) it.next();
            float desiredWidth = Layout.getDesiredWidth(c24978h.m73302b(), ((Number) c23465k2.f92937w).intValue(), ((Number) c23465k2.f92938x).intValue(), textPaint);
            while (it.hasNext()) {
                C23465k c23465k3 = (C23465k) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c24978h.m73302b(), ((Number) c23465k3.f92937w).intValue(), ((Number) c23465k3.f92938x).intValue(), textPaint));
            }
            f13 = desiredWidth;
        }
        c24978h.f97756e = f13;
        return f13;
    }
}
