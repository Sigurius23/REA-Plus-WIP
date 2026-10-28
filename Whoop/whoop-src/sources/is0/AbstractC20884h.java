package is0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: is0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0018\u001a1\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001c\"\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$\"\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$\"\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$\" \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0014\"\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0014¨\u00068²\u0006\f\u00100\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00107\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Lis0/e;", "comments", "", "surfacedIndex", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ILandroidx/compose/runtime/Composer;II)V", "commentCount", "Ly3/f;", "q", "(I)F", "Lis0/b;", "slots", "Lis0/a;", "p", "(Ljava/util/List;)Lis0/a;", "a", "Ljava/util/List;", "AVATAR_SIZES", "b", "F", "o", "()F", "SURFACED_AVATAR_SIZE", "Ld0/e2;", "Ld0/e2;", "n", "()Ld0/e2;", "AVATAR_ROTATION_DP_SPEC", "", "d", "AVATAR_ROTATION_FLOAT_SPEC", "e", "Lis0/b;", "SLOT_SINGLE", "f", "SLOT_LARGE", "g", "SLOT_MEDIUM", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "SLOT_SMALL", "i", "AVATAR_SLOTS", "j", "PILE_BOUNDS", "left", "top", "width", "height", "size", "alpha", "x", "y", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20884h {

    /* JADX INFO: renamed from: a */
    private static final List<C39174f> f78588a;

    /* JADX INFO: renamed from: b */
    private static final float f78589b;

    /* JADX INFO: renamed from: c */
    private static final C11347e2 f78590c;

    /* JADX INFO: renamed from: d */
    private static final C11347e2 f78591d;

    /* JADX INFO: renamed from: e */
    private static final C20872b f78592e;

    /* JADX INFO: renamed from: f */
    private static final C20872b f78593f;

    /* JADX INFO: renamed from: g */
    private static final C20872b f78594g;

    /* JADX INFO: renamed from: h */
    private static final C20872b f78595h;

    /* JADX INFO: renamed from: i */
    private static final List<List<C20872b>> f78596i;

    /* JADX INFO: renamed from: j */
    private static final List<C20870a> f78597j;

    static {
        float f13 = 4;
        List<C39174f> listM118959K = AbstractC37056f.m118959K(new C39174f(8 * f13), new C39174f(6 * f13), new C39174f(f13 * f13));
        f78588a = listM118959K;
        f78589b = ((C39174f) AbstractC25265s.m74096F0(listM118959K)).f168413w;
        f78590c = AbstractC11348f.m30574v(400, 0, null, 6);
        f78591d = AbstractC11348f.m30574v(400, 0, null, 6);
        float f14 = 0;
        C20872b c20872b = new C20872b(f14, f14, listM118959K.get(0).f168413w, 1.0f, null);
        f78592e = c20872b;
        C20872b c20872b2 = new C20872b(21, f14, listM118959K.get(0).f168413w, 1.0f, null);
        f78593f = c20872b2;
        C20872b c20872b3 = new C20872b(3, -21, listM118959K.get(1).f168413w, 0.5f, null);
        f78594g = c20872b3;
        C20872b c20872b4 = new C20872b(-1, 9, listM118959K.get(2).f168413w, 0.5f, null);
        f78595h = c20872b4;
        List<List<C20872b>> listM118959K2 = AbstractC37056f.m118959K(AbstractC37056f.m118958J(c20872b), AbstractC37056f.m118959K(c20872b2, c20872b3), AbstractC37056f.m118959K(c20872b2, c20872b3, c20872b4));
        f78596i = listM118959K2;
        List<List<C20872b>> list = listM118959K2;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m57714p((List) it.next()));
        }
        f78597j = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167 A[LOOP:0: B:61:0x0159->B:65:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0249  */
    /* JADX WARN: Code duplicated, block: B:72:0x0254  */
    /* JADX WARN: Code duplicated, block: B:73:0x0262 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m57701c(Modifier modifier, final List<C20878e> comments, int i13, Composer composer, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        boolean z4;
        final Modifier modifier3;
        final int i18;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C2314t c2314t;
        final int i19;
        List listM74156w1;
        int i24;
        List<C20872b> list;
        InterfaceC28670t2 interfaceC28670t2M30587a;
        InterfaceC28670t2 interfaceC28670t2M30587a2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i25;
        int i26;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(comments, "comments");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1684111906);
        int i27 = i15 & 1;
        if (i27 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(comments) ? 32 : 16;
        }
        int i28 = i15 & 4;
        if (i28 == 0) {
            if ((i14 & 384) == 0) {
                i17 = i13;
                i16 |= c28655q.m87149e(i17) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    i19 = 0;
                } else {
                    i19 = i17;
                }
                listM74156w1 = AbstractC25265s.m74156w1(comments, f78588a.size());
                if (listM74156w1.isEmpty()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i29 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: is0.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i29) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC20884h.m57702d(modifier3, comments, i19, i14, i15, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC20884h.m57711m(modifier3, comments, i19, i14, i15, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    i24 = i19;
                    list = f78596i.get(listM74156w1.size() - 1);
                    C20870a c20870a = f78597j.get(listM74156w1.size() - 1);
                    float left = c20870a.getLeft();
                    C11347e2 c11347e2 = f78590c;
                    interfaceC28670t2M30587a = AbstractC11352g.m30587a(left, c11347e2, "reactionsPileLeft", c28655q, 432, 8);
                    interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(c20870a.getTop(), c11347e2, "reactionsPileTop", c28655q, 432, 8);
                    Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC1136a.m3599a(modifier3, "ReactionsAvatarPile"), m57705g(AbstractC11352g.m30587a(c20870a.getWidth(), c11347e2, "reactionsPileWidth", c28655q, 432, 8)), m57706h(AbstractC11352g.m30587a(c20870a.getHeight(), c11347e2, "reactionsPileHeight", c28655q, 432, 8)));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3421r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    c28655q.m87150e0(-300310587);
                    i25 = 0;
                    for (Object obj : listM74156w1) {
                        i26 = i25 + 1;
                        if (i25 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C20878e c20878e = (C20878e) obj;
                        c28655q.m87144b0(-1473238640, c20878e.getId());
                        int size = listM74156w1.size();
                        int i34 = (i25 - i24) % size;
                        int i35 = i34 + (size & (((i34 ^ size) & ((-i34) | i34)) >> 31));
                        C20872b c20872b = list.get(i35);
                        float size2 = c20872b.getSize();
                        C11347e2 c11347e3 = f78590c;
                        C28655q c28655q2 = c28655q;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(c20878e.getAvatar(), null, null, c28655q2, AbstractC22403o.f87638a, 3), AbstractC8693b.m21274h(c20878e.getName(), c28655q2, TextResource.$stable), AbstractC34132o.m107879c(m57708j(AbstractC11352g.m30588b(c20872b.getAlpha(), f78591d, "reactionsAvatarAlpha", null, c28655q2, 3120, 20)), AbstractC37056f.m118994r(AbstractC1102d.m3419p(m57707i(AbstractC11352g.m30587a(size2, c11347e3, "reactionsAvatarSize", c28655q, 432, 8)), AbstractC1099a.m3391m(AbstractC2294a.m7154a(listM74156w1.size() - i35, C1100b.f4583a.mo3400a(c2314t, c2307m)), m57709k(AbstractC11352g.m30587a(c20872b.getX(), c11347e3, "reactionsAvatarX", c28655q2, 432, 8)) - m57703e(interfaceC28670t2M30587a), m57710l(AbstractC11352g.m30587a(c20872b.getY(), c11347e3, "reactionsAvatarY", c28655q2, 432, 8)) - m57704f(interfaceC28670t2M30587a2))), AbstractC33253j.f138651a)), null, C39102j.f168199a, 0.0f, null, c28655q2, 24576, 104);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        i25 = i26;
                        list = list;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    i18 = i24;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            i18 = i17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i36 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: is0.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i36) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC20884h.m57702d(modifier3, comments, i18, i14, i15, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC20884h.m57711m(modifier3, comments, i18, i14, i15, (Composer) obj2, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i16 |= 384;
        i17 = i13;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i28 != 0) {
                i19 = 0;
            } else {
                i19 = i17;
            }
            listM74156w1 = AbstractC25265s.m74156w1(comments, f78588a.size());
            if (listM74156w1.isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i210 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: is0.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i210) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC20884h.m57702d(modifier3, comments, i19, i14, i15, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC20884h.m57711m(modifier3, comments, i19, i14, i15, (Composer) obj2, iIntValue2);
                        }
                    }
                };
            } else {
                i24 = i19;
                list = f78596i.get(listM74156w1.size() - 1);
                C20870a c20870a2 = f78597j.get(listM74156w1.size() - 1);
                float left2 = c20870a2.getLeft();
                C11347e2 c11347e4 = f78590c;
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(left2, c11347e4, "reactionsPileLeft", c28655q, 432, 8);
                interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(c20870a2.getTop(), c11347e4, "reactionsPileTop", c28655q, 432, 8);
                Modifier modifierM3421r2 = AbstractC1102d.m3421r(AbstractC1136a.m3599a(modifier3, "ReactionsAvatarPile"), m57705g(AbstractC11352g.m30587a(c20870a2.getWidth(), c11347e4, "reactionsPileWidth", c28655q, 432, 8)), m57706h(AbstractC11352g.m30587a(c20870a2.getHeight(), c11347e4, "reactionsPileHeight", c28655q, 432, 8)));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3421r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c28655q.m87150e0(-300310587);
                i25 = 0;
                while (r19.hasNext()) {
                    i26 = i25 + 1;
                    if (i25 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C20878e c20878e2 = (C20878e) obj;
                    c28655q.m87144b0(-1473238640, c20878e2.getId());
                    int size3 = listM74156w1.size();
                    int i37 = (i25 - i24) % size3;
                    int i38 = i37 + (size3 & (((i37 ^ size3) & ((-i37) | i37)) >> 31));
                    C20872b c20872b2 = list.get(i38);
                    float size4 = c20872b2.getSize();
                    C11347e2 c11347e5 = f78590c;
                    C28655q c28655q3 = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(c20878e2.getAvatar(), null, null, c28655q3, AbstractC22403o.f87638a, 3), AbstractC8693b.m21274h(c20878e2.getName(), c28655q3, TextResource.$stable), AbstractC34132o.m107879c(m57708j(AbstractC11352g.m30588b(c20872b2.getAlpha(), f78591d, "reactionsAvatarAlpha", null, c28655q3, 3120, 20)), AbstractC37056f.m118994r(AbstractC1102d.m3419p(m57707i(AbstractC11352g.m30587a(size4, c11347e5, "reactionsAvatarSize", c28655q, 432, 8)), AbstractC1099a.m3391m(AbstractC2294a.m7154a(listM74156w1.size() - i38, C1100b.f4583a.mo3400a(c2314t, c2307m)), m57709k(AbstractC11352g.m30587a(c20872b2.getX(), c11347e5, "reactionsAvatarX", c28655q3, 432, 8)) - m57703e(interfaceC28670t2M30587a), m57710l(AbstractC11352g.m30587a(c20872b2.getY(), c11347e5, "reactionsAvatarY", c28655q3, 432, 8)) - m57704f(interfaceC28670t2M30587a2))), AbstractC33253j.f138651a)), null, C39102j.f168199a, 0.0f, null, c28655q3, 24576, 104);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                    i25 = i26;
                    list = list;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                i18 = i24;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        i18 = i17;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i39 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: is0.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i39) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC20884h.m57702d(modifier3, comments, i18, i14, i15, (Composer) obj2, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return AbstractC20884h.m57711m(modifier3, comments, i18, i14, i15, (Composer) obj2, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m57702d(Modifier modifier, List list, int i13, int i14, int i15, Composer composer, int i16) {
        m57701c(modifier, list, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final float m57703e(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: f */
    private static final float m57704f(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: g */
    private static final float m57705g(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: h */
    private static final float m57706h(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: i */
    private static final float m57707i(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: j */
    private static final float m57708j(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: k */
    private static final float m57709k(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: l */
    private static final float m57710l(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m57711m(Modifier modifier, List list, int i13, int i14, int i15, Composer composer, int i16) {
        m57701c(modifier, list, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final C11347e2 m57712n() {
        return f78590c;
    }

    /* JADX INFO: renamed from: o */
    public static final float m57713o() {
        return f78589b;
    }

    /* JADX INFO: renamed from: p */
    private static final C20870a m57714p(List<C20872b> list) {
        float fMax = Float.NEGATIVE_INFINITY;
        float fMin = Float.POSITIVE_INFINITY;
        float fMin2 = Float.POSITIVE_INFINITY;
        float fMax2 = Float.NEGATIVE_INFINITY;
        for (C20872b c20872b : list) {
            fMin = Math.min(fMin, c20872b.getX());
            fMax = Math.max(fMax, c20872b.getX() + c20872b.getSize());
            fMin2 = Math.min(fMin2, c20872b.getY());
            fMax2 = Math.max(fMax2, c20872b.getY() + c20872b.getSize());
        }
        return new C20870a(fMin, fMin2, fMax - fMin, fMax2 - fMin2, null);
    }

    /* JADX INFO: renamed from: q */
    public static final float m57715q(int i13) {
        if (i13 <= 0) {
            return 0;
        }
        int size = f78588a.size();
        if (i13 > size) {
            i13 = size;
        }
        int i14 = i13 - 1;
        return f78596i.get(i14).get(0).getY() - f78597j.get(i14).getTop();
    }
}
