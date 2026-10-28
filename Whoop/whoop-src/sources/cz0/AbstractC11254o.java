package cz0;

import a71.C0520a;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4006d0;
import d71.AbstractC11758d;
import e61.AbstractC12765h;
import e71.C12800a;
import e71.C12801b;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.EnumC21393a;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p181h2.C16618c;
import p208i2.C17893k;
import p208i2.C17919x;
import p208i2.InterfaceC17912t0;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import p91.C29007a;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: cz0.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0005*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c0\u00110\u0005H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0003¢\u0006\u0004\b!\u0010\"\u001a%\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0003¢\u0006\u0004\b#\u0010\"\"\u001a\u0010(\u001a\u00020\u00038\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lh2/c;", "contentRect", "scrubberRect", "", "xPositionOfScrubber", "", "Lcz0/s;", "scrubberState", "Ll83/a0;", "j", "(Lh2/c;Lh2/c;FLjava/util/List;Landroidx/compose/runtime/Composer;I)V", "xPercent", "l", "(FLjava/util/List;Lh2/c;Lh2/c;Landroidx/compose/runtime/Composer;I)V", "Lk2/e;", "Lcz0/q;", "lineExclusionBound", "Ll83/k;", "u", "(Lk2/e;Lcz0/q;)Ljava/util/List;", "t", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcz0/q;", "Lcz0/h;", "dots", "Le71/a;", "barGroups", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(FLjava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "dotsWithColors", "p", "(FLjava/util/List;Landroidx/compose/runtime/Composer;I)V", "states", "v", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "s", "a", "F", "getBandPlotCenterPointHeightPercent", "()F", "bandPlotCenterPointHeightPercent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/util/List;)Ljava/util/List;", "scrubberDots", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11254o {

    /* JADX INFO: renamed from: a */
    private static final float f36107a = 0.028f;

    /* JADX INFO: renamed from: cz0.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Float.valueOf(((C11247h) ((C23465k) t15).f92937w).getYPercent()), Float.valueOf(((C11247h) ((C23465k) t14).f92937w).getYPercent()));
        }
    }

    /* JADX INFO: renamed from: cz0.o$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f36108w = new b();

        /* JADX INFO: renamed from: a */
        public final long m30392a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30392a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cz0.o$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f36109w = new c();

        /* JADX INFO: renamed from: a */
        public final long m30393a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30393a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cz0.o$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f36110w = new d();

        /* JADX INFO: renamed from: a */
        public final long m30394a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30394a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cz0.o$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f36111w = new e();

        /* JADX INFO: renamed from: a */
        public final long m30395a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30395a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[LOOP:0: B:44:0x007c->B:46:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df A[LOOP:1: B:54:0x00d9->B:56:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    private static final void m30376h(float f13, List<C11247h> list, List<C12800a> list2, Composer composer, int i13, int i14) {
        List<C11247h> list3;
        int i15;
        Iterable iterable;
        int i16;
        boolean z4;
        List<C11247h> list4;
        Iterable iterable2;
        C28677v1 c28677v1M87180u;
        C25271y c25271y;
        Iterator it;
        LinkedHashMap linkedHashMap;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1347582136);
        int i17 = (i13 & 6) == 0 ? (c28655q.m87147d(f13) ? 4 : 2) | i13 : i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                list3 = list;
                i17 |= c28655q.m87157i(list3) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    iterable = list2;
                    if (c28655q.m87157i(iterable)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i17 |= i16;
                }
                if ((i17 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i17 & 1, z4)) {
                    c25271y = C25271y.f99162w;
                    if (i18 != 0) {
                        list3 = c25271y;
                    }
                    if (i15 != 0) {
                        iterable = c25271y;
                    }
                    c28655q.m87150e0(-2053684544);
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        AbstractC11758d.m31457j(C2314t.f9131w, C12800a.m35840b((C12800a) it.next(), null, null, 0.0f, 0.0f, null, null, null, null, false, 415, null), c28655q, 6, 0);
                    }
                    c28655q.m87173q(false);
                    if (list3.isEmpty()) {
                        c28655q.m87150e0(760639498);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(760453064);
                        c28655q.m87150e0(-2053678234);
                        List<C11247h> list5 = list3;
                        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list5, 10));
                        linkedHashMap = new LinkedHashMap(iM73988W >= 16 ? iM73988W : 16);
                        for (Object obj : list5) {
                            linkedHashMap.put(obj, new C17919x(((C11247h) obj).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0)));
                        }
                        c28655q.m87173q(false);
                        m30384p(f13, AbstractC25265s.m74152u1(AbstractC25247g0.m73999h0(linkedHashMap), new a()), c28655q, i17 & 14);
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q.m87138X();
                }
                list4 = list3;
                iterable2 = iterable;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4006d0(f13, list4, iterable2, i13, i14, 2);
                }
            }
            i17 |= 384;
            iterable = list2;
            if ((i17 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                c25271y = C25271y.f99162w;
                if (i18 != 0) {
                    list3 = c25271y;
                }
                if (i15 != 0) {
                    iterable = c25271y;
                }
                c28655q.m87150e0(-2053684544);
                it = iterable.iterator();
                while (it.hasNext()) {
                    AbstractC11758d.m31457j(C2314t.f9131w, C12800a.m35840b((C12800a) it.next(), null, null, 0.0f, 0.0f, null, null, null, null, false, 415, null), c28655q, 6, 0);
                }
                c28655q.m87173q(false);
                if (list3.isEmpty()) {
                    c28655q.m87150e0(760453064);
                    c28655q.m87150e0(-2053678234);
                    List<C11247h> list6 = list3;
                    int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list6, 10));
                    linkedHashMap = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
                    while (r3.hasNext()) {
                        linkedHashMap.put(obj, new C17919x(((C11247h) obj).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0)));
                    }
                    c28655q.m87173q(false);
                    m30384p(f13, AbstractC25265s.m74152u1(AbstractC25247g0.m73999h0(linkedHashMap), new a()), c28655q, i17 & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(760639498);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
            }
            list4 = list3;
            iterable2 = iterable;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4006d0(f13, list4, iterable2, i13, i14, 2);
            }
        }
        i17 |= 48;
        list3 = list;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                iterable = list2;
                if (c28655q.m87157i(iterable)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i17 |= i16;
            }
            if ((i17 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                c25271y = C25271y.f99162w;
                if (i18 != 0) {
                    list3 = c25271y;
                }
                if (i15 != 0) {
                    iterable = c25271y;
                }
                c28655q.m87150e0(-2053684544);
                it = iterable.iterator();
                while (it.hasNext()) {
                    AbstractC11758d.m31457j(C2314t.f9131w, C12800a.m35840b((C12800a) it.next(), null, null, 0.0f, 0.0f, null, null, null, null, false, 415, null), c28655q, 6, 0);
                }
                c28655q.m87173q(false);
                if (list3.isEmpty()) {
                    c28655q.m87150e0(760453064);
                    c28655q.m87150e0(-2053678234);
                    List<C11247h> list7 = list3;
                    int iM73988W3 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list7, 10));
                    linkedHashMap = new LinkedHashMap(iM73988W3 >= 16 ? iM73988W3 : 16);
                    while (r3.hasNext()) {
                        linkedHashMap.put(obj, new C17919x(((C11247h) obj).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0)));
                    }
                    c28655q.m87173q(false);
                    m30384p(f13, AbstractC25265s.m74152u1(AbstractC25247g0.m73999h0(linkedHashMap), new a()), c28655q, i17 & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(760639498);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
            }
            list4 = list3;
            iterable2 = iterable;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4006d0(f13, list4, iterable2, i13, i14, 2);
            }
        }
        i17 |= 384;
        iterable = list2;
        if ((i17 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i17 & 1, z4)) {
            c25271y = C25271y.f99162w;
            if (i18 != 0) {
                list3 = c25271y;
            }
            if (i15 != 0) {
                iterable = c25271y;
            }
            c28655q.m87150e0(-2053684544);
            it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC11758d.m31457j(C2314t.f9131w, C12800a.m35840b((C12800a) it.next(), null, null, 0.0f, 0.0f, null, null, null, null, false, 415, null), c28655q, 6, 0);
            }
            c28655q.m87173q(false);
            if (list3.isEmpty()) {
                c28655q.m87150e0(760453064);
                c28655q.m87150e0(-2053678234);
                List<C11247h> list8 = list3;
                int iM73988W4 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list8, 10));
                linkedHashMap = new LinkedHashMap(iM73988W4 >= 16 ? iM73988W4 : 16);
                while (r3.hasNext()) {
                    linkedHashMap.put(obj, new C17919x(((C11247h) obj).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0)));
                }
                c28655q.m87173q(false);
                m30384p(f13, AbstractC25265s.m74152u1(AbstractC25247g0.m73999h0(linkedHashMap), new a()), c28655q, i17 & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(760639498);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        list4 = list3;
        iterable2 = iterable;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4006d0(f13, list4, iterable2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m30377i(float f13, List list, List list2, int i13, int i14, Composer composer, int i15) {
        m30376h(f13, list, list2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m30378j(C16618c contentRect, C16618c scrubberRect, float f13, List<? extends AbstractC11258s> scrubberState, Composer composer, int i13) {
        int i14;
        float f14;
        AbstractC22676k.m65750j(contentRect, "contentRect");
        AbstractC22676k.m65750j(scrubberRect, "scrubberRect");
        AbstractC22676k.m65750j(scrubberState, "scrubberState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1635512446);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(contentRect) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(scrubberRect) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            f14 = f13;
            i14 |= c28655q.m87147d(f14) ? 256 : 128;
        } else {
            f14 = f13;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(scrubberState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM30390v = m30390v(scrubberState, c28655q, (i14 >> 9) & 14);
            boolean zM87153g = c28655q.m87153g(scrubberState);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = m30391w(scrubberState);
                c28655q.m87172p0(objM87133R);
            }
            List list = (List) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(scrubberState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                c28655q.m87172p0(objM30390v);
            } else {
                objM30390v = objM87133R2;
            }
            List list2 = (List) objM30390v;
            int i15 = i14 >> 6;
            int i16 = i15 & 14;
            m30380l(f14, scrubberState, scrubberRect, contentRect, c28655q, (i15 & 126) | ((i14 << 3) & 896) | ((i14 << 9) & 7168));
            Modifier modifierM35718G = AbstractC12765h.m35718G(C2314t.f9131w, contentRect, null, 2, null);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM35718G);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m30376h(f13, list, list2, c28655q, i16, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11249j(contentRect, scrubberRect, f13, scrubberState, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m30379k(C16618c c16618c, C16618c c16618c2, float f13, List list, int i13, Composer composer, int i14) {
        m30378j(c16618c, c16618c2, f13, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    private static final void m30380l(float f13, List<? extends AbstractC11258s> list, C16618c c16618c, C16618c c16618c2, Composer composer, int i13) {
        int i14;
        C16618c c16618c3;
        C2307m c2307m = C2299e.f9114w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-691530632);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c16618c) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            c16618c3 = c16618c2;
            i14 |= c28655q.m87153g(c16618c3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c16618c3 = c16618c2;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float f14 = 2;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f14);
            float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f14);
            final float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(1);
            C38072d c38072d = C38072d.f163053a;
            final long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            final C17893k c17893k = new C17893k(new DashPathEffect(new float[]{fMo743q0, fMo743q1}, 0.0f));
            final C11256q c11256qM30388t = m30388t(list, c28655q, (i14 >> 3) & 14);
            C16618c c16618c4 = c11256qM30388t != null ? c16618c3 : c16618c;
            boolean zIsFeatureEnabled = c38072d.m121950c(c28655q, 6).isFeatureEnabled("android-partial-line-scrubbing");
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(1569897196);
                Modifier modifierM35718G = AbstractC12765h.m35718G(c2314t, c16618c4, null, 2, null);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM35718G);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                Modifier modifierM3399u = AbstractC1099a.m3399u(AbstractC1102d.m3406c(1.0f, AbstractC29011e.m88149j(c2314t, f13, 0.0f, C29007a.INSTANCE.m88137b())), EnumC22935a1.f90537w);
                boolean zM87153g = c28655q.m87153g(c11256qM30388t) | c28655q.m87151f(jM125430y) | c28655q.m87147d(fMo743q2) | c28655q.m87157i(c17893k);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    Function1 function1 = new Function1() { // from class: cz0.k
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC11254o.m30381m(c11256qM30388t, jM125430y, fMo743q2, c17893k, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(function1);
                    objM87133R = function1;
                }
                AbstractC21478l0.m60421a(modifierM3399u, (Function1) objM87133R, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1570594727);
                Modifier modifierM35718G2 = AbstractC12765h.m35718G(c2314t, c16618c, null, 2, null);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM35718G2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Modifier modifierM3399u2 = AbstractC1099a.m3399u(AbstractC1102d.m3406c(1.0f, AbstractC29011e.m88149j(c2314t, f13, 0.0f, C29007a.INSTANCE.m88137b())), EnumC22935a1.f90537w);
                boolean zM87151f = c28655q.m87151f(jM125430y) | c28655q.m87147d(fMo743q2) | c28655q.m87157i(c17893k);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87151f || objM87133R2 == c28676v0) {
                    C11251l c11251l = new C11251l(jM125430y, fMo743q2, c17893k, 0);
                    c28655q.m87172p0(c11251l);
                    objM87133R2 = c11251l;
                }
                AbstractC21478l0.m60421a(modifierM3399u2, (Function1) objM87133R2, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11249j(f13, list, c16618c, c16618c2, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m30381m(C11256q c11256q, long j7, float f13, InterfaceC17912t0 interfaceC17912t0, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        for (C23465k c23465k : m30389u(Canvas, c11256q)) {
            float fFloatValue = ((Number) c23465k.f92937w).floatValue();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L);
            float fFloatValue2 = ((Number) c23465k.f92938x).floatValue();
            Canvas.mo732d0(j7, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (496 & 8) != 0 ? 0.0f : f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : interfaceC17912t0);
            Canvas = interfaceC22131e;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m30382n(long j7, float f13, InterfaceC17912t0 interfaceC17912t0, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : interfaceC17912t0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m30383o(float f13, List list, C16618c c16618c, C16618c c16618c2, int i13, Composer composer, int i14) {
        m30380l(f13, list, c16618c, c16618c2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m30384p(float f13, List<C23465k> list, Composer composer, int i13) {
        int i14;
        List<C23465k> list2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1344084952);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(4);
            float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(2);
            long jM125424v = C38072d.f163053a.m121949b(c28655q, 6).getBlack90();
            Modifier modifierM3399u = AbstractC1099a.m3399u(AbstractC1102d.m3406c(1.0f, AbstractC29011e.m88149j(C2314t.f9131w, f13, 0.0f, C29007a.INSTANCE.m88137b())), EnumC22935a1.f90537w);
            boolean zM87157i = c28655q.m87157i(list) | c28655q.m87151f(jM125424v) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                list2 = list;
                C11252m c11252m = new C11252m(list2, jM125424v, fMo743q0, fMo743q1);
                c28655q.m87172p0(c11252m);
                objM87133R = c11252m;
            } else {
                list2 = list;
            }
            AbstractC21478l0.m60421a(modifierM3399u, (Function1) objM87133R, c28655q, 0);
        } else {
            list2 = list;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11253n(f13, list2, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m30385q(List list, long j7, float f13, float f14, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23465k c23465k = (C23465k) it.next();
            float fM30367b = (1 - ((C11247h) c23465k.f92937w).getYPercent()) * Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
            InterfaceC22131e.m63379M(Canvas, j7, f13 + f14, (((long) Float.floatToRawIntBits(fM30367b)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 0.0f, null, 120);
            Canvas = interfaceC22131e;
            InterfaceC22131e.m63379M(Canvas, ((C17919x) c23465k.f92938x).f69639a, f13, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM30367b)) & 4294967295L), 0.0f, null, 120);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m30386r(float f13, List list, int i13, Composer composer, int i14) {
        m30384p(f13, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final List<C12800a> m30387s(List<? extends AbstractC11258s> list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(12780955);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC11258s.a) {
                arrayList.add(obj);
            }
        }
        ArrayList<AbstractC11258s.a> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((AbstractC11258s.a) obj2).getScrubberShape() == EnumC21393a.CENTER_DOT) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        for (AbstractC11258s.a aVar : arrayList2) {
            C0520a c0520a = (C0520a) AbstractC25265s.m74100H0(aVar.mo30408a());
            InterfaceC39332e interfaceC39332eM1226f = c0520a != null ? c0520a.getScrubberColor() : null;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (interfaceC39332eM1226f == null) {
                c28655q.m87150e0(-1212858716);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = b.f36108w;
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC39332eM1226f = p745y81.Function1.m125323a((Function1) objM87133R);
            } else {
                c28655q.m87150e0(-1212860049);
            }
            c28655q.m87173q(false);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = c.f36109w;
                c28655q.m87172p0(objM87133R2);
            }
            float f13 = 10;
            C12800a c12800a = new C12800a(null, AbstractC37056f.m118958J(new C12801b(aVar.getYBottom(), aVar.getYTop() - aVar.getYBottom(), AbstractC18249c.m52575m(p745y81.Function1.m125323a((Function1) objM87133R2)), f13, f13, null, false, 96, null)), aVar.getX(), 0.005f, null, null, null, null, false, 497, null);
            float fMo30411d = aVar.getX();
            float fM30413f = aVar.getYBottom();
            float fM30414g = aVar.getYTop() - aVar.getYBottom();
            float f14 = 2;
            float f15 = f36107a;
            arrayList3.add(AbstractC37056f.m118959K(c12800a, new C12800a(null, AbstractC37056f.m118958J(new C12801b(((fM30414g / f14) + fM30413f) - (f15 / f14), f15, AbstractC18249c.m52575m(interfaceC39332eM1226f), f13, f13, null, false, 96, null)), fMo30411d, 0.01f, null, null, null, null, false, 497, null)));
        }
        c28655q.m87173q(false);
        return AbstractC25267u.m74164j0(arrayList3);
    }

    /* JADX INFO: renamed from: t */
    private static final C11256q m30388t(List<? extends AbstractC11258s> list, Composer composer, int i13) {
        List<? extends AbstractC11258s> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC11258s) it.next()).m30410c());
        }
        ArrayList arrayListM74092D0 = AbstractC25265s.m74092D0(arrayList);
        if (arrayListM74092D0.isEmpty()) {
            return null;
        }
        Iterator it3 = arrayListM74092D0.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            C11256q c11256q = (C11256q) it3.next();
            C11256q c11256q2 = (C11256q) next;
            next = new C11256q(Math.min(c11256q2.getBottomPercent(), c11256q.getBottomPercent()), Math.max(c11256q2.getTopPercent(), c11256q.getTopPercent()));
        }
        return (C11256q) next;
    }

    /* JADX INFO: renamed from: u */
    private static final List<C23465k> m30389u(InterfaceC22131e interfaceC22131e, C11256q c11256q) {
        Float fValueOf = Float.valueOf(0.0f);
        if (c11256q == null) {
            return AbstractC37056f.m118958J(new C23465k(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (4294967295L & interfaceC22131e.mo731d())))));
        }
        return AbstractC37056f.m118959K(new C23465k(Float.valueOf(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L))), Float.valueOf(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) - (c11256q.getBottomPercent() * Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L))))), new C23465k(Float.valueOf(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) - (c11256q.getTopPercent() * Float.intBitsToFloat((int) (4294967295L & interfaceC22131e.mo731d())))), fValueOf));
    }

    /* JADX INFO: renamed from: v */
    private static final List<C12800a> m30390v(List<? extends AbstractC11258s> list, Composer composer, int i13) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC11258s.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC11258s.b) it.next()).getGroup());
        }
        return AbstractC25265s.m74129g1(arrayList2, m30387s(list, composer, i13 & 14));
    }

    /* JADX INFO: renamed from: w */
    private static final List<C11247h> m30391w(List<? extends AbstractC11258s> list) {
        InterfaceC39332e interfaceC39332eM125323a;
        InterfaceC39332e interfaceC39332eM125323a2;
        List<? extends AbstractC11258s> list2 = list;
        ArrayList<AbstractC11258s.c> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof AbstractC11258s.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (AbstractC11258s.c cVar : arrayList) {
            C0520a c0520a = (C0520a) AbstractC25265s.m74102I0(0, cVar.mo30408a());
            if (c0520a == null || (interfaceC39332eM125323a2 = c0520a.getScrubberColor()) == null) {
                interfaceC39332eM125323a2 = p745y81.Function1.m125323a(e.f36111w);
            }
            arrayList2.add(new C11247h(interfaceC39332eM125323a2, cVar.getY()));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof AbstractC11258s.a) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<AbstractC11258s.a> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((AbstractC11258s.a) obj3).getScrubberShape() == EnumC21393a.TWO_DOTS) {
                arrayList5.add(obj3);
            }
        }
        for (AbstractC11258s.a aVar : arrayList5) {
            C0520a c0520a2 = (C0520a) AbstractC25265s.m74102I0(0, aVar.mo30408a());
            if (c0520a2 == null || (interfaceC39332eM125323a = c0520a2.getScrubberColor()) == null) {
                interfaceC39332eM125323a = p745y81.Function1.m125323a(d.f36110w);
            }
            arrayList3.add(new C11247h(interfaceC39332eM125323a, aVar.getYTop()));
            arrayList3.add(new C11247h(interfaceC39332eM125323a, aVar.getYBottom()));
        }
        return AbstractC25265s.m74129g1(arrayList2, arrayList3);
    }
}
