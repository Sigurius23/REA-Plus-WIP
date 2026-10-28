package g71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import e61.AbstractC12765h;
import hg3.AbstractC17269i;
import i71.C18204h;
import ih0.AbstractC18489d0;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p163g1.C15079m3;
import p181h2.C16618c;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import p91.C29007a;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yy0.C39889c;

/* JADX INFO: renamed from: g71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"", "Lg71/d;", "zoomBuckets", "Li71/h;", "scrollPosition", "Lg71/a;", "zoomer", "Lh2/c;", "customRect", "Ll83/a0;", "b", "(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;Landroidx/compose/runtime/Composer;II)V", "a", "Lg71/d;", "bucketOne", "bucketTwo", "c", "Li71/h;", "Lj71/b$m;", "d", "Lj71/b$m;", "getXAxisPlot", "()Lj71/b$m;", "xAxisPlot", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15545c {

    /* JADX INFO: renamed from: a */
    private static final C15546d f58291a;

    /* JADX INFO: renamed from: b */
    private static final C15546d f58292b;

    /* JADX INFO: renamed from: c */
    private static final C18204h f58293c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC21394b.m f58294d;

    /* JADX INFO: renamed from: g71.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.graph.plot.xlabel.XAxisPlotKt$XAxisLabelPlot$1$1", m100430f = "XAxisLabelPlot.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<C11344e> f58295E;

        /* JADX INFO: renamed from: w */
        int f58296w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f58297x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C39889c> f58298y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C39889c> f58299z;

        /* JADX INFO: renamed from: g71.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.graph.plot.xlabel.XAxisPlotKt$XAxisLabelPlot$1$1$1$1", m100430f = "XAxisLabelPlot.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41624a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ List<C11344e> f58300E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ int f58301F;

            /* JADX INFO: renamed from: w */
            float f58302w;

            /* JADX INFO: renamed from: x */
            int f58303x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<C39889c> f58304y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C39889c f58305z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41624a(List<C39889c> list, C39889c c39889c, List<C11344e> list2, int i13, InterfaceC30057d<? super C41624a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f58304y = list;
                this.f58305z = c39889c;
                this.f58300E = list2;
                this.f58301F = i13;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41624a(this.f58304y, this.f58305z, this.f58300E, this.f58301F, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41624a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f58303x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    float f13 = this.f58304y.contains(this.f58305z) ? 1.0f : 0.0f;
                    C11344e c11344e = this.f58300E.get(this.f58301F);
                    Float f14 = new Float(f13);
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(200, 0, null, 6);
                    this.f58302w = f13;
                    this.f58303x = 1;
                    if (C11344e.m30547d(c11344e, f14, c11347e2M30574v, null, this, 12) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C39889c> list, List<C39889c> list2, List<C11344e> list3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58298y = list;
            this.f58299z = list2;
            this.f58295E = list3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f58298y, this.f58299z, this.f58295E, interfaceC30057d);
            aVar.f58297x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f58297x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f58296w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<C39889c> list = this.f58298y;
            List<C39889c> list2 = this.f58299z;
            List<C11344e> list3 = this.f58295E;
            int i13 = 0;
            for (Object obj2 : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41624a(list2, (C39889c) obj2, list3, i13, null), 3);
                i13 = i14;
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g71.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f58306w = new b();

        /* JADX INFO: renamed from: a */
        public final long m43746a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m43746a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: g71.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f58307w = new c();

        /* JADX INFO: renamed from: a */
        public final long m43747a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m43747a((C39336i) obj));
        }
    }

    static {
        C15546d c15546d = new C15546d(1.0d, AbstractC37056f.m118958J(new C39889c(AbstractC8693b.m21278l("Label_1"), null, p745y81.Function1.m125323a(b.f58306w), 0.25f, 0.0f, null, 50, null)));
        f58291a = c15546d;
        C15546d c15546d2 = new C15546d(2.0d, AbstractC37056f.m118958J(new C39889c(AbstractC8693b.m21278l("Label_3"), null, p745y81.Function1.m125323a(c.f58307w), 0.5f, 0.0f, null, 50, null)));
        f58292b = c15546d2;
        f58293c = new C18204h((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(1080.0f)) << 32) | (((long) Float.floatToRawIntBits(400.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(400.0f)) & 4294967295L) | (Float.floatToRawIntBits(1080.0f) << 32), 0.0f, 8, null);
        f58294d = new AbstractC21394b.m(AbstractC37056f.m118959K(c15546d, c15546d2), null, false, false, 14, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:103:0x0247  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:116:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103 A[LOOP:0: B:68:0x00fd->B:70:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130 A[LOOP:1: B:74:0x012a->B:76:0x0130, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0227  */
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
    /* JADX INFO: renamed from: b */
    public static final void m43744b(List<C15546d> zoomBuckets, C18204h c18204h, C15543a c15543a, C16618c c16618c, Composer composer, int i13, int i14) {
        C18204h c18204h2;
        C15543a c15543a2;
        C16618c c16618c2;
        boolean z4;
        C18204h c18204h3;
        C15543a c15543a3;
        C16618c c16618c3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        float f13;
        C18204h c18204h4;
        C15543a c15543a4;
        C16618c c16618cM48894h;
        ArrayList<C39889c> arrayList;
        Iterator<T> it;
        Object objM87133R;
        C28676v0 c28676v0;
        Object obj;
        List list;
        List<C39889c> listM43739a;
        boolean zM87157i;
        Object objM87133R2;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i15;
        C28655q c28655q2;
        int i16;
        InterfaceC39332e color;
        C17919x c17919xM31989h;
        long jM53358D;
        ArrayList arrayList2;
        AbstractC22676k.m65750j(zoomBuckets, "zoomBuckets");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1396060195);
        int i17 = (i13 & 6) == 0 ? (c28655q3.m87157i(zoomBuckets) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c18204h2 = c18204h;
                int i18 = c28655q3.m87153g(c18204h2) ? 32 : 16;
                i17 |= i18;
            } else {
                c18204h2 = c18204h;
            }
            i17 |= i18;
        } else {
            c18204h2 = c18204h;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c15543a2 = c15543a;
                int i19 = c28655q3.m87157i(c15543a2) ? 256 : 128;
                i17 |= i19;
            } else {
                c15543a2 = c15543a;
            }
            i17 |= i19;
        } else {
            c15543a2 = c15543a;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                c16618c2 = c16618c;
                i17 |= c28655q3.m87153g(c16618c2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i17 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i17 & 1, z4)) {
                c28655q3.m87140Z();
                f13 = 0.0f;
                if ((i13 & 1) != 0 || c28655q3.m87118C()) {
                    if ((i14 & 2) != 0) {
                        c18204h4 = new C18204h(0L, 0L, 0L, 0.0f, 15, null);
                    } else {
                        c18204h4 = c18204h2;
                    }
                    if ((i14 & 4) != 0) {
                        c15543a4 = new C15543a(zoomBuckets);
                    } else {
                        c15543a4 = c15543a2;
                    }
                    if (i24 != 0) {
                        c16618cM48894h = AbstractC17269i.m48894h((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                    } else {
                        c16618cM48894h = c16618c2;
                    }
                    c18204h2 = c18204h4;
                } else {
                    c28655q3.m87138X();
                    c15543a4 = c15543a2;
                    c16618cM48894h = c16618c2;
                }
                c28655q3.m87175r();
                arrayList = new ArrayList();
                it = zoomBuckets.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList, ((C15546d) it.next()).m43748a());
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    for (C39889c c39889c : arrayList) {
                        arrayList2.add(AbstractC11348f.m30553a(0.0f));
                    }
                    c28655q3.m87172p0(arrayList2);
                    obj = arrayList2;
                }
                list = (List) obj;
                listM43739a = c15543a4.m43739a(c18204h2.getZoomScale());
                zM87157i = c28655q3.m87157i(arrayList) | c28655q3.m87157i(listM43739a) | c28655q3.m87157i(list);
                objM87133R2 = c28655q3.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(arrayList, listM43739a, list, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, listM43739a);
                c2314t = C2314t.f9131w;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC12765h.m35718G(c2314t, c16618cM48894h, null, 2, null), ((float) 0.5d) * 8, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                c28655q3.m87150e0(1208585429);
                i15 = 0;
                c28655q2 = c28655q3;
                for (Object obj2 : arrayList) {
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C39889c c39889c2 = (C39889c) obj2;
                    Modifier modifierM107879c = AbstractC34132o.m107879c(((Number) ((C11344e) list.get(i15)).m30549e()).floatValue(), AbstractC29011e.m88149j(c2314t, c39889c2.getXPercent(), f13, C29007a.INSTANCE.m88137b()));
                    String strM21274h = AbstractC8693b.m21274h(c39889c2.getLabel(), c28655q2, 0);
                    color = c39889c2.getColor();
                    if (color == null) {
                        c28655q2.m87150e0(-184159926);
                        c28655q2.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        c28655q2.m87150e0(1933722007);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, color.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                    }
                    if (c17919xM31989h == null) {
                        c28655q2.m87150e0(1933723307);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, 6, false);
                    } else {
                        c28655q2.m87150e0(1933721509);
                        c28655q2.m87173q(false);
                        jM53358D = c17919xM31989h.f69639a;
                    }
                    C38072d c38072d = C38072d.f163053a;
                    C28655q c28655q4 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h, modifierM107879c, jM53358D, AbstractC31061c.m95626b(C39183o.m124805c(c38072d.m121952e(c28655q2, 6).getN9().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN9(), null, c28655q4, 0, 0, 196592);
                    c16618cM48894h = c16618cM48894h;
                    c28655q2 = c28655q4;
                    i15 = i16;
                    list = list;
                    c2314t = c2314t;
                    f13 = 0.0f;
                }
                C16618c c16618c4 = c16618cM48894h;
                C28655q c28655q5 = c28655q2;
                c28655q5.m87173q(false);
                c28655q5.m87173q(true);
                c15543a3 = c15543a4;
                c18204h3 = c18204h2;
                c16618c3 = c16618c4;
                c28655q = c28655q5;
            } else {
                C28655q c28655q6 = c28655q3;
                c28655q6.m87138X();
                c18204h3 = c18204h2;
                c15543a3 = c15543a2;
                c16618c3 = c16618c2;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(zoomBuckets, c18204h3, c15543a3, c16618c3, i13, i14, 2);
            }
        }
        i17 |= 3072;
        c16618c2 = c16618c;
        if ((i17 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i17 & 1, z4)) {
            c28655q3.m87140Z();
            f13 = 0.0f;
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c18204h4 = new C18204h(0L, 0L, 0L, 0.0f, 15, null);
                } else {
                    c18204h4 = c18204h2;
                }
                if ((i14 & 4) != 0) {
                    c15543a4 = new C15543a(zoomBuckets);
                } else {
                    c15543a4 = c15543a2;
                }
                if (i24 != 0) {
                    c16618cM48894h = AbstractC17269i.m48894h((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                } else {
                    c16618cM48894h = c16618c2;
                }
                c18204h2 = c18204h4;
            } else {
                if ((i14 & 2) != 0) {
                    c18204h4 = new C18204h(0L, 0L, 0L, 0.0f, 15, null);
                } else {
                    c18204h4 = c18204h2;
                }
                if ((i14 & 4) != 0) {
                    c15543a4 = new C15543a(zoomBuckets);
                } else {
                    c15543a4 = c15543a2;
                }
                if (i24 != 0) {
                    c16618cM48894h = AbstractC17269i.m48894h((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                } else {
                    c16618cM48894h = c16618c2;
                }
                c18204h2 = c18204h4;
            }
            c28655q3.m87175r();
            arrayList = new ArrayList();
            it = zoomBuckets.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C15546d) it.next()).m43748a());
            }
            objM87133R = c28655q3.m87133R();
            c28676v0 = C28635l.f115821a;
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                while (r12.hasNext()) {
                    arrayList2.add(AbstractC11348f.m30553a(0.0f));
                }
                c28655q3.m87172p0(arrayList2);
                obj = arrayList2;
            }
            list = (List) obj;
            listM43739a = c15543a4.m43739a(c18204h2.getZoomScale());
            zM87157i = c28655q3.m87157i(arrayList) | c28655q3.m87157i(listM43739a) | c28655q3.m87157i(list);
            objM87133R2 = c28655q3.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(arrayList, listM43739a, list, null);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(arrayList, listM43739a, list, null);
                c28655q3.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, listM43739a);
            c2314t = C2314t.f9131w;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC12765h.m35718G(c2314t, c16618cM48894h, null, 2, null), ((float) 0.5d) * 8, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9104G, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            c28655q3.m87150e0(1208585429);
            i15 = 0;
            c28655q2 = c28655q3;
            while (r3.hasNext()) {
                i16 = i15 + 1;
                if (i15 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C39889c c39889c3 = (C39889c) obj2;
                Modifier modifierM107879c2 = AbstractC34132o.m107879c(((Number) ((C11344e) list.get(i15)).m30549e()).floatValue(), AbstractC29011e.m88149j(c2314t, c39889c3.getXPercent(), f13, C29007a.INSTANCE.m88137b()));
                String strM21274h2 = AbstractC8693b.m21274h(c39889c3.getLabel(), c28655q2, 0);
                color = c39889c3.getColor();
                if (color == null) {
                    c28655q2.m87150e0(-184159926);
                    c28655q2.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q2.m87150e0(1933722007);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, color.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                }
                if (c17919xM31989h == null) {
                    c28655q2.m87150e0(1933723307);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, 6, false);
                } else {
                    c28655q2.m87150e0(1933721509);
                    c28655q2.m87173q(false);
                    jM53358D = c17919xM31989h.f69639a;
                }
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q7 = c28655q2;
                AbstractC30795n.m94707h(strM21274h2, modifierM107879c2, jM53358D, AbstractC31061c.m95626b(C39183o.m124805c(c38072d2.m121952e(c28655q2, 6).getN9().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getN9(), null, c28655q7, 0, 0, 196592);
                c16618cM48894h = c16618cM48894h;
                c28655q2 = c28655q7;
                i15 = i16;
                list = list;
                c2314t = c2314t;
                f13 = 0.0f;
            }
            C16618c c16618c5 = c16618cM48894h;
            C28655q c28655q8 = c28655q2;
            c28655q8.m87173q(false);
            c28655q8.m87173q(true);
            c15543a3 = c15543a4;
            c18204h3 = c18204h2;
            c16618c3 = c16618c5;
            c28655q = c28655q8;
        } else {
            C28655q c28655q9 = c28655q3;
            c28655q9.m87138X();
            c18204h3 = c18204h2;
            c15543a3 = c15543a2;
            c16618c3 = c16618c2;
            c28655q = c28655q9;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(zoomBuckets, c18204h3, c15543a3, c16618c3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m43745c(List list, C18204h c18204h, C15543a c15543a, C16618c c16618c, int i13, int i14, Composer composer, int i15) {
        m43744b(list, c18204h, c15543a, c16618c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
