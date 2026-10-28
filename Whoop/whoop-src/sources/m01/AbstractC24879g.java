package m01;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g93.AbstractC15609a;
import g93.AbstractC15612d;
import g93.C15611c;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.C23465k;
import lt2.C24738a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "originX", "originY", "", "Li2/x;", "colors", "", "particleCount", "", "trigger", "Lkotlin/Function0;", "Ll83/a0;", "onComplete", "d", "(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24879g {

    /* JADX INFO: renamed from: m01.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.celebrationoverlay.ConfettiEffectKt$ConfettiEffect$2$1", m100430f = "ConfettiEffect.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f97470E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f97471F;

        /* JADX INFO: renamed from: w */
        int f97472w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f97473x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f97474y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C11344e> f97475z;

        /* JADX INFO: renamed from: m01.g$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.celebrationoverlay.ConfettiEffectKt$ConfettiEffect$2$1$1$1", m100430f = "ConfettiEffect.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41981a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f97476w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11344e f97477x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f97478y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41981a(C11344e c11344e, int i13, InterfaceC30057d<? super C41981a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f97477x = c11344e;
                this.f97478y = i13;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41981a(this.f97477x, this.f97478y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41981a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97476w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = this.f97477x;
                    Float f13 = new Float(1.0f);
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(this.f97478y, 0, AbstractC11333b0.f36312c, 2);
                    this.f97476w = 1;
                    if (C11344e.m30547d(c11344e, f13, c11347e2M30574v, null, this, 12) == enumC31071a) {
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
        public a(boolean z4, List<C11344e> list, int i13, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f97474y = z4;
            this.f97475z = list;
            this.f97470E = i13;
            this.f97471F = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f97474y, this.f97475z, this.f97470E, this.f97471F, interfaceC30057d);
            aVar.f97473x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f97473x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f97472w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f97474y) {
                    List<C11344e> list = this.f97475z;
                    int i14 = this.f97470E;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41981a((C11344e) it.next(), i14, null), 3);
                    }
                    long j7 = this.f97470E;
                    this.f97473x = null;
                    this.f97472w = 1;
                    if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f97471F.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: m01.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97479a;

        static {
            int[] iArr = new int[EnumC24881i.values().length];
            try {
                iArr[EnumC24881i.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24881i.CURVED_STRIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24881i.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24881i.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC24881i.DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f97479a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0162  */
    /* JADX WARN: Code duplicated, block: B:108:0x016d  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:121:0x01df  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x0205  */
    /* JADX WARN: Code duplicated, block: B:126:0x0213  */
    /* JADX WARN: Code duplicated, block: B:127:0x0227  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02dc A[LOOP:0: B:136:0x02d6->B:138:0x02dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x0309  */
    /* JADX WARN: Code duplicated, block: B:147:0x030c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0316  */
    /* JADX WARN: Code duplicated, block: B:157:0x034b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0360  */
    /* JADX WARN: Code duplicated, block: B:162:0x036d  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX INFO: renamed from: d */
    public static final void m72953d(Modifier modifier, final float f13, final float f14, final List<C17919x> colors, int i13, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a2;
        int i25;
        boolean z14;
        final InterfaceC4339a interfaceC4339a3;
        final Modifier modifier3;
        final int i26;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        int i27;
        boolean z16;
        int i28;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC39171c interfaceC39171c;
        boolean z17;
        boolean z18;
        boolean zM87153g;
        Object objM87133R;
        ArrayList arrayList;
        int i29;
        int i34;
        int i35;
        boolean z19;
        AbstractC15609a abstractC15609a;
        ArrayList arrayList2;
        float fMo43927e;
        float fMo43927e2;
        float f15;
        float fMo43927e3;
        int i36;
        float f16;
        float fSin;
        Object[] array;
        float fMo743q0;
        int i37;
        C23465k c23465k;
        List list;
        boolean zM87153g2;
        ArrayList arrayList3;
        Object obj;
        List list2;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R2;
        boolean zM87157i;
        Object objM87133R3;
        int i38;
        Object objM87133R4;
        AbstractC22676k.m65750j(colors, "colors");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1085930045);
        int i39 = i15 & 1;
        if (i39 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        float f17 = f13;
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87147d(f17) ? 32 : 16;
        }
        float f18 = f14;
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87147d(f18) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(colors) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i44 = i15 & 16;
        if (i44 == 0) {
            if ((i14 & 24576) == 0) {
                i17 = i13;
                i16 |= c28655q.m87149e(i17) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i18 = i15 & 32;
            if (i18 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i19;
                }
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 1572864;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i14 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
            }
            if ((i16 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                if (i39 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i44 != 0) {
                    i27 = 90;
                } else {
                    i27 = i17;
                }
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                i28 = 6;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C24738a(i28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                interfaceC4339a4 = interfaceC4339a2;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                if ((i16 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i16 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g = z17 | z18 | c28655q.m87153g(colors);
                objM87133R = c28655q.m87133R();
                if (!zM87153g || objM87133R == c28676v0) {
                    arrayList = new ArrayList(i27);
                    i29 = 0;
                    while (i29 < i27) {
                        C15611c c15611c = AbstractC15612d.f58612w;
                        abstractC15609a = AbstractC15612d.f58613x;
                        arrayList2 = arrayList;
                        double dMo43932d = abstractC15609a.mo43932d(6.283185307179586d);
                        fMo43927e = abstractC15609a.mo43927e();
                        if (fMo43927e < 0.3f) {
                            fMo43927e3 = (abstractC15609a.mo43927e() * 300.0f) + 400.0f;
                        } else {
                            if (fMo43927e < 0.7f) {
                                fMo43927e2 = abstractC15609a.mo43927e() * 400.0f;
                                f15 = 600.0f;
                            } else {
                                fMo43927e2 = abstractC15609a.mo43927e() * 500.0f;
                                f15 = 800.0f;
                            }
                            fMo43927e3 = fMo43927e2 + f15;
                        }
                        float fMo43927e4 = (abstractC15609a.mo43927e() * 0.8f) + 0.6f;
                        i36 = i27;
                        double d3 = fMo43927e3;
                        double dCos = Math.cos(dMo43932d) * d3;
                        double d14 = fMo43927e4;
                        f16 = (float) (dCos * d14);
                        fSin = (float) (Math.sin(dMo43932d) * d3 * d14);
                        array = EnumC24881i.getEntries().toArray(new EnumC24881i[0]);
                        AbstractC22676k.m65750j(array, "<this>");
                        if (array.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        EnumC24881i enumC24881i = (EnumC24881i) array[abstractC15609a.mo43929g(array.length)];
                        fMo743q0 = interfaceC39171c.mo743q0(abstractC15609a.mo43933h(6, 12));
                        i37 = b.f97479a[enumC24881i.ordinal()];
                        if (i37 == 1) {
                            c23465k = new C23465k(Float.valueOf((abstractC15609a.mo43927e() * fMo743q0 * 0.5f) + 0.5f), Float.valueOf(fMo743q0 * 1.8f));
                        } else if (i37 == 2) {
                            c23465k = new C23465k(Float.valueOf(0.6f * fMo743q0), Float.valueOf(fMo743q0 * 2.2f));
                        } else if (i37 == 3) {
                            c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0));
                        } else if (i37 == 4) {
                            c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0));
                        } else {
                            if (i37 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0 * 1.3f));
                        }
                        arrayList2.add(new C24880h(f17, f18, f16, fSin, ((C17919x) AbstractC25265s.m74131i1(colors)).f69639a, abstractC15609a.mo43927e() * 360.0f, (abstractC15609a.mo43927e() * 720.0f) - 360.0f, ((Number) c23465k.f92937w).floatValue(), ((Number) c23465k.f92938x).floatValue(), enumC24881i, (abstractC15609a.mo43927e() * 0.15f) + 0.8f, null));
                        i29++;
                        f17 = f13;
                        f18 = f14;
                        arrayList = arrayList2;
                        i27 = i36;
                        interfaceC39171c = interfaceC39171c;
                    }
                    i34 = i27;
                    ArrayList arrayList4 = arrayList;
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    z19 = true;
                    c28655q.m87172p0(arrayList4);
                    objM87133R = arrayList4;
                } else {
                    i34 = i27;
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    z19 = true;
                }
                list = (List) objM87133R;
                zM87153g2 = c28655q.m87153g(list);
                Object objM87133R5 = c28655q.m87133R();
                obj = objM87133R5;
                if (zM87153g2 || objM87133R5 == c28676v0) {
                    List<C24880h> list3 = list;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                    for (C24880h c24880h : list3) {
                        arrayList3.add(AbstractC11348f.m30553a(0.0f));
                    }
                    c28655q.m87172p0(arrayList3);
                    obj = arrayList3;
                }
                list2 = (List) obj;
                Boolean boolValueOf = Boolean.valueOf(z16);
                if ((458752 & i16) == i35) {
                    z24 = z19;
                } else {
                    z24 = false;
                }
                boolean zM87157i2 = c28655q.m87157i(list2) | z24;
                if ((3670016 & i16) == 1048576) {
                    z25 = z19;
                } else {
                    z25 = false;
                }
                z26 = zM87157i2 | z25;
                objM87133R2 = c28655q.m87133R();
                if (z26 || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(z16, list2, 2500, interfaceC4339a4, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, modifier3), "ConfettiEffect");
                zM87157i = c28655q.m87157i(list) | c28655q.m87157i(list2);
                objM87133R3 = c28655q.m87133R();
                if (!zM87157i || objM87133R3 == c28676v0) {
                    i38 = 0;
                    objM87133R3 = new C24877e(i38, list, list2);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    i38 = 0;
                }
                AbstractC21478l0.m60421a(modifierM3599a, (Function1) objM87133R3, c28655q, i38);
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                i26 = i34;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
                i26 = i17;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m01.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC24879g.m72956g(modifier3, f13, f14, colors, i26, z15, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        i17 = i13;
        i18 = i15 & 32;
        if (i18 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z13)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i19;
            }
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            i16 |= 1572864;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i14 & 1572864) == 0) {
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
        }
        if ((i16 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            if (i39 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i44 != 0) {
                i27 = 90;
            } else {
                i27 = i17;
            }
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            i28 = 6;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C24738a(i28);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            }
            interfaceC4339a4 = interfaceC4339a2;
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            if ((i16 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i16 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87153g = z17 | z18 | c28655q.m87153g(colors);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                arrayList = new ArrayList(i27);
                i29 = 0;
                while (i29 < i27) {
                    C15611c c15611c2 = AbstractC15612d.f58612w;
                    abstractC15609a = AbstractC15612d.f58613x;
                    arrayList2 = arrayList;
                    double dMo43932d2 = abstractC15609a.mo43932d(6.283185307179586d);
                    fMo43927e = abstractC15609a.mo43927e();
                    if (fMo43927e < 0.3f) {
                        fMo43927e3 = (abstractC15609a.mo43927e() * 300.0f) + 400.0f;
                    } else {
                        if (fMo43927e < 0.7f) {
                            fMo43927e2 = abstractC15609a.mo43927e() * 400.0f;
                            f15 = 600.0f;
                        } else {
                            fMo43927e2 = abstractC15609a.mo43927e() * 500.0f;
                            f15 = 800.0f;
                        }
                        fMo43927e3 = fMo43927e2 + f15;
                    }
                    float fMo43927e5 = (abstractC15609a.mo43927e() * 0.8f) + 0.6f;
                    i36 = i27;
                    double d15 = fMo43927e3;
                    double dCos2 = Math.cos(dMo43932d2) * d15;
                    double d16 = fMo43927e5;
                    f16 = (float) (dCos2 * d16);
                    fSin = (float) (Math.sin(dMo43932d2) * d15 * d16);
                    array = EnumC24881i.getEntries().toArray(new EnumC24881i[0]);
                    AbstractC22676k.m65750j(array, "<this>");
                    if (array.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    EnumC24881i enumC24881i2 = (EnumC24881i) array[abstractC15609a.mo43929g(array.length)];
                    fMo743q0 = interfaceC39171c.mo743q0(abstractC15609a.mo43933h(6, 12));
                    i37 = b.f97479a[enumC24881i2.ordinal()];
                    if (i37 == 1) {
                        c23465k = new C23465k(Float.valueOf((abstractC15609a.mo43927e() * fMo743q0 * 0.5f) + 0.5f), Float.valueOf(fMo743q0 * 1.8f));
                    } else if (i37 == 2) {
                        c23465k = new C23465k(Float.valueOf(0.6f * fMo743q0), Float.valueOf(fMo743q0 * 2.2f));
                    } else if (i37 == 3) {
                        c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0));
                    } else if (i37 == 4) {
                        c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0));
                    } else {
                        if (i37 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0 * 1.3f));
                    }
                    arrayList2.add(new C24880h(f17, f18, f16, fSin, ((C17919x) AbstractC25265s.m74131i1(colors)).f69639a, abstractC15609a.mo43927e() * 360.0f, (abstractC15609a.mo43927e() * 720.0f) - 360.0f, ((Number) c23465k.f92937w).floatValue(), ((Number) c23465k.f92938x).floatValue(), enumC24881i2, (abstractC15609a.mo43927e() * 0.15f) + 0.8f, null));
                    i29++;
                    f17 = f13;
                    f18 = f14;
                    arrayList = arrayList2;
                    i27 = i36;
                    interfaceC39171c = interfaceC39171c;
                }
                i34 = i27;
                ArrayList arrayList5 = arrayList;
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                z19 = true;
                c28655q.m87172p0(arrayList5);
                objM87133R = arrayList5;
            } else {
                arrayList = new ArrayList(i27);
                i29 = 0;
                while (i29 < i27) {
                    C15611c c15611c3 = AbstractC15612d.f58612w;
                    abstractC15609a = AbstractC15612d.f58613x;
                    arrayList2 = arrayList;
                    double dMo43932d3 = abstractC15609a.mo43932d(6.283185307179586d);
                    fMo43927e = abstractC15609a.mo43927e();
                    if (fMo43927e < 0.3f) {
                        fMo43927e3 = (abstractC15609a.mo43927e() * 300.0f) + 400.0f;
                    } else {
                        if (fMo43927e < 0.7f) {
                            fMo43927e2 = abstractC15609a.mo43927e() * 400.0f;
                            f15 = 600.0f;
                        } else {
                            fMo43927e2 = abstractC15609a.mo43927e() * 500.0f;
                            f15 = 800.0f;
                        }
                        fMo43927e3 = fMo43927e2 + f15;
                    }
                    float fMo43927e6 = (abstractC15609a.mo43927e() * 0.8f) + 0.6f;
                    i36 = i27;
                    double d17 = fMo43927e3;
                    double dCos3 = Math.cos(dMo43932d3) * d17;
                    double d18 = fMo43927e6;
                    f16 = (float) (dCos3 * d18);
                    fSin = (float) (Math.sin(dMo43932d3) * d17 * d18);
                    array = EnumC24881i.getEntries().toArray(new EnumC24881i[0]);
                    AbstractC22676k.m65750j(array, "<this>");
                    if (array.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    EnumC24881i enumC24881i3 = (EnumC24881i) array[abstractC15609a.mo43929g(array.length)];
                    fMo743q0 = interfaceC39171c.mo743q0(abstractC15609a.mo43933h(6, 12));
                    i37 = b.f97479a[enumC24881i3.ordinal()];
                    if (i37 == 1) {
                        c23465k = new C23465k(Float.valueOf((abstractC15609a.mo43927e() * fMo743q0 * 0.5f) + 0.5f), Float.valueOf(fMo743q0 * 1.8f));
                    } else if (i37 == 2) {
                        c23465k = new C23465k(Float.valueOf(0.6f * fMo743q0), Float.valueOf(fMo743q0 * 2.2f));
                    } else if (i37 == 3) {
                        c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0));
                    } else if (i37 == 4) {
                        c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0));
                    } else {
                        if (i37 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c23465k = new C23465k(Float.valueOf(fMo743q0), Float.valueOf(fMo743q0 * 1.3f));
                    }
                    arrayList2.add(new C24880h(f17, f18, f16, fSin, ((C17919x) AbstractC25265s.m74131i1(colors)).f69639a, abstractC15609a.mo43927e() * 360.0f, (abstractC15609a.mo43927e() * 720.0f) - 360.0f, ((Number) c23465k.f92937w).floatValue(), ((Number) c23465k.f92938x).floatValue(), enumC24881i3, (abstractC15609a.mo43927e() * 0.15f) + 0.8f, null));
                    i29++;
                    f17 = f13;
                    f18 = f14;
                    arrayList = arrayList2;
                    i27 = i36;
                    interfaceC39171c = interfaceC39171c;
                }
                i34 = i27;
                ArrayList arrayList6 = arrayList;
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                z19 = true;
                c28655q.m87172p0(arrayList6);
                objM87133R = arrayList6;
            }
            list = (List) objM87133R;
            zM87153g2 = c28655q.m87153g(list);
            Object objM87133R6 = c28655q.m87133R();
            obj = objM87133R6;
            if (zM87153g2) {
                List<C24880h> list4 = list;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                while (r2.hasNext()) {
                    arrayList3.add(AbstractC11348f.m30553a(0.0f));
                }
                c28655q.m87172p0(arrayList3);
                obj = arrayList3;
            } else {
                List<C24880h> list5 = list;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
                while (r2.hasNext()) {
                    arrayList3.add(AbstractC11348f.m30553a(0.0f));
                }
                c28655q.m87172p0(arrayList3);
                obj = arrayList3;
            }
            list2 = (List) obj;
            Boolean boolValueOf2 = Boolean.valueOf(z16);
            if ((458752 & i16) == i35) {
                z24 = z19;
            } else {
                z24 = false;
            }
            boolean zM87157i3 = c28655q.m87157i(list2) | z24;
            if ((3670016 & i16) == 1048576) {
                z25 = z19;
            } else {
                z25 = false;
            }
            z26 = zM87157i3 | z25;
            objM87133R2 = c28655q.m87133R();
            if (z26) {
                objM87133R2 = new a(z16, list2, 2500, interfaceC4339a4, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(z16, list2, 2500, interfaceC4339a4, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf2);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, modifier3), "ConfettiEffect");
            zM87157i = c28655q.m87157i(list) | c28655q.m87157i(list2);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                i38 = 0;
                objM87133R3 = new C24877e(i38, list, list2);
                c28655q.m87172p0(objM87133R3);
            } else {
                i38 = 0;
                objM87133R3 = new C24877e(i38, list, list2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3599a2, (Function1) objM87133R3, c28655q, i38);
            z15 = z16;
            interfaceC4339a3 = interfaceC4339a4;
            i26 = i34;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
            i26 = i17;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m01.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC24879g.m72956g(modifier3, f13, f14, colors, i26, z15, interfaceC4339a3, i14, i15, (Composer) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m72954e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m72955f(List list, List list2, InterfaceC22131e Canvas) throws Throwable {
        long j7;
        C0237p c0237p;
        long j13;
        C0237p c0237p2;
        C0237p c0237p3;
        long j14;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        int i13 = 0;
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C24880h c24880h = (C24880h) next;
            float fFloatValue = ((Number) ((C11344e) list2.get(i13)).m30549e()).floatValue();
            if (fFloatValue > 0.0f) {
                float f13 = 2.0f * fFloatValue;
                float fExp = 1 - ((float) Math.exp((-0.5f) * f13));
                float fM72965i = ((c24880h.getVelocityX() / 0.5f) * fExp) + c24880h.getStartX();
                float fM72966j = (1800.0f * f13) + (((c24880h.getVelocityY() - 1800.0f) / 0.5f) * fExp) + c24880h.getStartY();
                float fM72957a = c24880h.getBaseAlpha() * (fFloatValue >= 0.75f ? 1.0f - ((fFloatValue - 0.75f) / 0.25f) : 1.0f);
                float fM72961e = ((c24880h.getRotationSpeed() / 0.5f) * fExp) + c24880h.getRotation();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM72966j)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM72965i)) << 32);
                C0237p c0237pMo744t0 = Canvas.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2358v(fM72961e, jFloatToRawIntBits);
                    int i15 = b.f97479a[c24880h.getShape().ordinal()];
                    if (i15 == 1) {
                        j13 = jM670A;
                        i14 = i14;
                        c0237p = c0237pMo744t0;
                        float f14 = 2;
                        InterfaceC22131e.m63383i0(Canvas, C17919x.m51541c(fM72957a, c24880h.getColor()), (((long) Float.floatToRawIntBits(fM72965i - (c24880h.getWidth() / f14))) << 32) | (((long) Float.floatToRawIntBits(fM72966j - (c24880h.getHeight() / f14))) & 4294967295L), (((long) Float.floatToRawIntBits(c24880h.getWidth())) << 32) | (((long) Float.floatToRawIntBits(c24880h.getHeight())) & 4294967295L), 0.0f, null, 0, 120);
                    } else if (i15 != 2) {
                        if (i15 == 3) {
                            j13 = jM670A;
                            c0237p2 = c0237pMo744t0;
                            float f15 = 2;
                            InterfaceC22131e.m63383i0(Canvas, C17919x.m51541c(fM72957a, c24880h.getColor()), (((long) Float.floatToRawIntBits(fM72965i - (c24880h.getWidth() / f15))) << 32) | (((long) Float.floatToRawIntBits(fM72966j - (c24880h.getHeight() / f15))) & 4294967295L), (((long) Float.floatToRawIntBits(c24880h.getWidth())) << 32) | (((long) Float.floatToRawIntBits(c24880h.getHeight())) & 4294967295L), 0.0f, null, 0, 120);
                        } else if (i15 == 4) {
                            j13 = jM670A;
                            c0237p2 = c0237pMo744t0;
                            InterfaceC22131e.m63379M(Canvas, C17919x.m51541c(fM72957a, c24880h.getColor()), c24880h.getWidth() / 2, (((long) Float.floatToRawIntBits(fM72965i)) << 32) | (((long) Float.floatToRawIntBits(fM72966j)) & 4294967295L), 0.0f, null, 120);
                        } else {
                            if (i15 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            try {
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM72965i)) << 32) | (((long) Float.floatToRawIntBits(fM72966j)) & 4294967295L);
                                C0237p c0237pMo744t1 = Canvas.mo744t0();
                                try {
                                    long jM670A2 = c0237pMo744t1.m670A();
                                    c0237pMo744t1.m716w().mo51426q();
                                    try {
                                        ((C0929d) c0237pMo744t1.f812x).m2358v(45.0f, jFloatToRawIntBits2);
                                        float f16 = 2;
                                        j13 = jM670A;
                                        c0237p2 = c0237pMo744t0;
                                        j14 = jM670A2;
                                        try {
                                            InterfaceC22131e.m63383i0(Canvas, C17919x.m51541c(fM72957a, c24880h.getColor()), (((long) Float.floatToRawIntBits(fM72965i - (c24880h.getWidth() / f16))) << 32) | (((long) Float.floatToRawIntBits(fM72966j - (c24880h.getHeight() / f16))) & 4294967295L), (((long) Float.floatToRawIntBits(c24880h.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(c24880h.getWidth())) << 32), 0.0f, null, 0, 120);
                                            try {
                                                c0237pMo744t1.m716w().mo51417g();
                                                c0237pMo744t1.m690U(j14);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                c0237p = c0237p2;
                                                j7 = j13;
                                                AbstractC11266d.m30472z(c0237p, j7);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c0237p3 = c0237pMo744t1;
                                            c0237p3.m716w().mo51417g();
                                            c0237p3.m690U(j14);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c0237p3 = c0237pMo744t1;
                                        j14 = jM670A2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j13 = jM670A;
                                    c0237p2 = c0237pMo744t0;
                                    c0237p = c0237p2;
                                    j7 = j13;
                                    AbstractC11266d.m30472z(c0237p, j7);
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                j13 = jM670A;
                            }
                        }
                        c0237p = c0237p2;
                    } else {
                        j13 = jM670A;
                        i14 = i14;
                        float f17 = 2;
                        c0237p = c0237pMo744t0;
                        try {
                            InterfaceC22131e.m63374D(Canvas, C17919x.m51541c(fM72957a, c24880h.getColor()), (((long) Float.floatToRawIntBits(fM72965i - (c24880h.getWidth() / f17))) << 32) | (((long) Float.floatToRawIntBits(fM72966j - (c24880h.getHeight() / f17))) & 4294967295L), (((long) Float.floatToRawIntBits(c24880h.getWidth())) << 32) | (((long) Float.floatToRawIntBits(c24880h.getHeight())) & 4294967295L), (((long) Float.floatToRawIntBits(c24880h.getWidth() / f17)) << 32) | (((long) Float.floatToRawIntBits(c24880h.getWidth() / f17)) & 4294967295L), null, 0.0f, 240);
                        } catch (Throwable th8) {
                            th = th8;
                            j7 = j13;
                            AbstractC11266d.m30472z(c0237p, j7);
                            throw th;
                        }
                    }
                    AbstractC11266d.m30472z(c0237p, j13);
                } catch (Throwable th9) {
                    th = th9;
                    j7 = jM670A;
                    c0237p = c0237pMo744t0;
                }
            } else {
                i14 = i14;
            }
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m72956g(Modifier modifier, float f13, float f14, List list, int i13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m72953d(modifier, f13, f14, list, i13, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
