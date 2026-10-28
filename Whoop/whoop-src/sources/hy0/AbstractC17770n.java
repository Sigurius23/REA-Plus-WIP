package hy0;

import a01.C0084d;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import bc3.InterfaceC2994c0;
import bh.InterfaceC3242e;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.AbstractC4590k;
import ch.AbstractC4596q;
import ch.AbstractC4601v;
import ch.C4591l;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Success;
import com.squareup.wire.AbstractC5583n;
import dp0.C12253i;
import f01.C13845b;
import f01.C13849c0;
import fy1.C14873i;
import gy0.AbstractC16272a;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import h02.C16574h;
import h02.C16576i;
import hb1.C17089l;
import hu1.C17650g;
import java.io.File;
import java.util.ArrayList;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22409u;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.C25235a0;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p341nh.C26711e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39127r0;
import p698au1.C2061f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import v41.AbstractC35661d0;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: hy0.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u001e\u001a\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u001e\u001a\u000f\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\u001e\u001a\u000f\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\u001e\u001a\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\u001e\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhy0/r;", "itemState", "Ll83/a0;", "s", "(Landroidx/compose/ui/Modifier;Lhy0/r;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "imageSource", "u", "(Landroidx/compose/ui/Modifier;Lhy0/r;Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "Ln2/a;", "painter", "Ly2/k;", "contentScale", "Lb2/h;", "alignment", "B", "(Ln2/a;Ly2/k;Lb2/h;Landroidx/compose/runtime/Composer;I)V", "Lkd1/u;", "pdfCacheManager", "H", "(Landroidx/compose/ui/Modifier;Lhy0/r;Lkd1/u;Landroidx/compose/runtime/Composer;I)V", "", "filePath", "", "isLoadingComplete", "N", "(Landroidx/compose/ui/Modifier;Lhy0/r;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "D", "(Landroidx/compose/runtime/Composer;I)V", "Q", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "i0", "(Lhy0/r;)Lb2/h;", "U", "S", "W", "Y", "a0", "Ltr2/n;", "a", "Ltr2/n;", "logger", "b", "Lhy0/r;", "sampleImageState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17770n {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f69103a = InterfaceC34116n.INSTANCE.m107848a("FileViewer");

    /* JADX INFO: renamed from: b */
    private static final C17782r f69104b = new C17782r("https://example.com/sample.png", null, EnumC17752i.IMAGE, null, null, null, null, 122, null);

    /* JADX INFO: renamed from: hy0.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.atom.FileViewerKt$FileViewerPdf$1$1", m100430f = "FileViewer.kt", m100431l = {126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f69105E;

        /* JADX INFO: renamed from: w */
        int f69106w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22409u f69107x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17782r f69108y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f69109z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22409u c22409u, C17782r c17782r, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f69107x = c22409u;
            this.f69108y = c17782r;
            this.f69109z = interfaceC28601c1;
            this.f69105E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f69107x, this.f69108y, this.f69109z, this.f69105E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM64531j;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f69106w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22409u c22409u = this.f69107x;
                String fileUrl = this.f69108y.getFileUrl();
                EnumC17776p fileUrlType = this.f69108y.getFileUrlType();
                this.f69106w = 1;
                objM64531j = c22409u.m64531j(fileUrl, fileUrlType, this);
                if (objM64531j == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM64531j = ((C23468n) obj).f92940w;
            }
            InterfaceC28601c1 interfaceC28601c1 = this.f69109z;
            if (!(objM64531j instanceof C23467m)) {
                AbstractC17770n.m50982J(interfaceC28601c1, ((File) objM64531j).getAbsolutePath());
            }
            C17782r c17782r = this.f69108y;
            Throwable thM68037a = C23468n.m68037a(objM64531j);
            if (thM68037a != null) {
                AbstractC17770n.f69103a.mo85213c(AbstractC11266d.m30461o("Failed to download PDF at ", c17782r.getFileUrl()), thM68037a, new AbstractC30556a.a[0]);
            }
            AbstractC17770n.m50984L(this.f69105E, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51034a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-2137362829);
            AbstractC17770n.m51028u(C2314t.f9131w, C17782r.m51090b(AbstractC17770n.f69104b, null, null, null, EnumC17773o.FILL, EnumC17785s.NONE, EnumC17756j.LEADING, EnumC17779q.BOTTOM, 7, null), new AbstractC22403o.a(AbstractC16272a.f61976O4), c28655q, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51034a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51035a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1778724409);
            AbstractC17770n.m51028u(C2314t.f9131w, C17782r.m51090b(AbstractC17770n.f69104b, null, null, null, EnumC17773o.FIT, EnumC17785s.NONE, EnumC17756j.CENTER, EnumC17779q.CENTER, 7, null), new AbstractC22403o.a(AbstractC16272a.f61976O4), c28655q, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51035a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51036a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(211178246);
            AbstractC17770n.m51028u(C2314t.f9131w, C17782r.m51090b(AbstractC17770n.f69104b, null, null, null, EnumC17773o.FIT, EnumC17785s.PINCH, null, null, 103, null), new AbstractC22403o.a(AbstractC16272a.f61976O4), c28655q, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51036a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51037a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1159653523);
            AbstractC17770n.m50986N(C2314t.f9131w, new C17782r("https://example.com/sample.pdf", null, EnumC17752i.PDF, EnumC17773o.FIT, EnumC17785s.NONE, null, null, 98, null), null, false, c28655q, 3462);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51037a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51038a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1810719260);
            AbstractC17770n.m50989Q(C2314t.f9131w, c28655q, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51038a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69110a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f69111b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f69112c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f69113d;

        static {
            int[] iArr = new int[EnumC17752i.values().length];
            try {
                iArr[EnumC17752i.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17752i.PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17752i.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69110a = iArr;
            int[] iArr2 = new int[EnumC17773o.values().length];
            try {
                iArr2[EnumC17773o.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC17773o.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f69111b = iArr2;
            int[] iArr3 = new int[EnumC17779q.values().length];
            try {
                iArr3[EnumC17779q.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC17779q.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EnumC17779q.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f69112c = iArr3;
            int[] iArr4 = new int[EnumC17756j.values().length];
            try {
                iArr4[EnumC17756j.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[EnumC17756j.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[EnumC17756j.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f69113d = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m50973A(Modifier modifier, C17782r c17782r, AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m51028u(modifier, c17782r, abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m50974B(AbstractC26165a abstractC26165a, InterfaceC39105k interfaceC39105k, InterfaceC2302h interfaceC2302h, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1066913165);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(abstractC26165a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(interfaceC39105k) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(interfaceC2302h) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC29125c.m88522c(abstractC26165a, null, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), interfaceC2302h, interfaceC39105k, 0.0f, null, c28655q, (i14 & 14) | 432 | ((i14 << 3) & 7168) | ((i14 << 9) & 57344), 96);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(abstractC26165a, interfaceC39105k, interfaceC2302h, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m50975C(AbstractC26165a abstractC26165a, InterfaceC39105k interfaceC39105k, InterfaceC2302h interfaceC2302h, int i13, Composer composer, int i14) {
        m50974B(abstractC26165a, interfaceC39105k, interfaceC2302h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m50976D(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(693487340);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C17089l(23);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C17650g(2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35684p.m113047h(null, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769472, 413);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m50977E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m50978F(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m50979G(int i13, Composer composer, int i14) {
        m50976D(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final void m50980H(Modifier modifier, C17782r itemState, C22409u pdfCacheManager, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object aVar;
        InterfaceC28601c1 interfaceC28601c1;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(pdfCacheManager, "pdfCacheManager");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1565890840);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(pdfCacheManager) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            boolean zM87153g = c28655q2.m87153g(itemState.getFileUrl());
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g2 = c28655q2.m87153g(itemState.getFileUrl());
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            String fileUrl = itemState.getFileUrl();
            boolean zM87157i = c28655q2.m87157i(pdfCacheManager) | ((i15 & 112) == 32) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(interfaceC28601c3);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c3;
                aVar = new a(pdfCacheManager, itemState, interfaceC28601c2, interfaceC28601c1, null);
                c28655q2.m87172p0(aVar);
            } else {
                aVar = objM87133R3;
                interfaceC28601c1 = interfaceC28601c3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) aVar, fileUrl);
            c28655q = c28655q2;
            m50986N(modifier, itemState, m50981I(interfaceC28601c2), m50983K(interfaceC28601c1), c28655q, i15 & 126);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(modifier, itemState, pdfCacheManager, i13, 5);
        }
    }

    /* JADX INFO: renamed from: I */
    private static final String m50981I(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m50982J(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: K */
    private static final boolean m50983K(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m50984L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m50985M(Modifier modifier, C17782r c17782r, C22409u c22409u, int i13, Composer composer, int i14) {
        m50980H(modifier, c17782r, c22409u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: N */
    public static final void m50986N(Modifier modifier, C17782r c17782r, String str, boolean z4, Composer composer, int i13) {
        int i14;
        C17782r c17782r2;
        ?? r10;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1238595961);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            c17782r2 = c17782r;
            i14 |= c28655q.m87153g(c17782r2) ? 32 : 16;
        } else {
            c17782r2 = c17782r;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            if (str != null) {
                c28655q.m87150e0(1102585103);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C17764l(str, 0);
                    c28655q.m87172p0(objM87133R);
                }
                r10 = 0;
                AbstractC35661d0.m112931y(modifierM3407d2, str, null, null, (Function1) objM87133R, c17782r2.getZoom() != EnumC17785s.NONE, false, true, false, 0, null, c28655q, ((i14 >> 3) & 112) | 113246214, 0, 1612);
                c28655q.m87173q(false);
            } else {
                r10 = 0;
                c28655q.m87150e0(1102973347);
                c28655q.m87173q(false);
            }
            if (z4) {
                c28655q.m87150e0(1103055683);
                c28655q.m87173q(r10);
            } else {
                c28655q.m87150e0(1103007633);
                m50976D(c28655q, r10);
                c28655q.m87173q(r10);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(modifier, c17782r, str, z4, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m50987O(String str, Throwable it) {
        AbstractC22676k.m65750j(it, "it");
        f69103a.mo85213c(AbstractC11266d.m30461o("PdfViewer render error for ", str), it, new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m50988P(Modifier modifier, C17782r c17782r, String str, boolean z4, int i13, Composer composer, int i14) {
        m50986N(modifier, c17782r, str, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m50989Q(Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1236670498);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62214A0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM92103Y, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2061f(modifier, i13, 4, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m50990R(Modifier modifier, int i13, Composer composer, int i14) {
        m50989Q(modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final void m50991S(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1278280577);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m50992T(int i13, Composer composer, int i14) {
        m50991S(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    public static final void m50993U(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-482474705);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m50994V(int i13, Composer composer, int i14) {
        m50993U(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    public static final void m50995W(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2101863331);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new d()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m50996X(int i13, Composer composer, int i14) {
        m50995W(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m50997Y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-797455304);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new e()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m50998Z(int i13, Composer composer, int i14) {
        m50997Y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m51000a0(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1227017303);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new f()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m51002b0(int i13, Composer composer, int i14) {
        m51000a0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i0 */
    private static final InterfaceC2302h m51016i0(C17782r c17782r) {
        int i13 = g.f69113d[c17782r.getHorizontalAlignment().ordinal()];
        if (i13 == 1) {
            int i14 = g.f69112c[c17782r.getVerticalAlignment().ordinal()];
            if (i14 == 1) {
                return C2299e.f9114w;
            }
            if (i14 == 2) {
                return C2299e.f9117z;
            }
            if (i14 == 3) {
                return C2299e.f9104G;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 == 2) {
            int i15 = g.f69112c[c17782r.getVerticalAlignment().ordinal()];
            if (i15 == 1) {
                return C2299e.f9115x;
            }
            if (i15 == 2) {
                return C2299e.f9102E;
            }
            if (i15 == 3) {
                return C2299e.f9105H;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i16 = g.f69112c[c17782r.getVerticalAlignment().ordinal()];
        if (i16 == 1) {
            return C2299e.f9116y;
        }
        if (i16 == 2) {
            return C2299e.f9103F;
        }
        if (i16 == 3) {
            return C2299e.f9106I;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: s */
    public static final void m51026s(Modifier modifier, C17782r itemState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1332053009);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = g.f69110a[itemState.getFileType().ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(-202682902);
                m51028u(modifier, itemState, new AbstractC22403o.c(itemState.getFileUrl(), 0, 0, 0, 14, null), c28655q, i14 & 126);
                c28655q.m87173q(false);
            } else if (i15 == 2) {
                c28655q.m87150e0(-202676849);
                c28655q.m87152f0(-909571169);
                C26669a c26669a = C29155a.f118017b;
                if (c26669a == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                C38266c c38266c = c26669a.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22409u.class), null);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                m50980H(modifier, itemState, (C22409u) objM87133R, c28655q, i14 & 126);
                c28655q.m87173q(false);
            } else {
                if (i15 != 3) {
                    throw AbstractC11895b.m32003v(-202684647, c28655q, false);
                }
                c28655q.m87150e0(-202671602);
                m50989Q(modifier, c28655q, i14 & 14);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(modifier, itemState, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m51027t(Modifier modifier, C17782r c17782r, int i13, Composer composer, int i14) {
        m51026s(modifier, c17782r, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m51028u(Modifier modifier, C17782r itemState, AbstractC22403o imageSource, Composer composer, int i13) {
        int i14;
        AbstractC26165a abstractC26165aM64500i;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(imageSource, "imageSource");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1684007784);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(imageSource) ? 256 : 128;
        }
        int i15 = 0;
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM87153g = c28655q.m87153g(itemState.getFileUrl());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(!(imageSource instanceof AbstractC22403o.c), c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean z4 = imageSource instanceof AbstractC22403o.c;
            C39077b1 c39077b1 = C39102j.f168200b;
            if (z4) {
                c28655q.m87150e0(-871180520);
                Object data = ((AbstractC22403o.c) imageSource).getData();
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C17767m(i15, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function1 = (Function1) objM87133R2;
                boolean zM87153g3 = ((i14 & 112) == 32) | c28655q.m87153g(interfaceC28601c1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C16574h(9, itemState, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87152f0(533921043);
                InterfaceC3242e interfaceC3242eM16747F = AbstractC5583n.m16747F(AbstractC4596q.f18485a, c28655q);
                c28655q.m87152f0(-79978785);
                C4591l c4591l = new C4591l(data, AbstractC4590k.f18473b, interfaceC3242eM16747F);
                C26711e c26711e = AbstractC4601v.f18506b;
                abstractC26165aM64500i = AbstractC4590k.m14259b(c4591l, AsyncImagePainter.f20210T, AbstractC4601v.m14263a(function1, (Function1) objM87133R3), c39077b1, c28655q);
                AbstractC25012a.m73392y(c28655q, false, false, false);
            } else {
                c28655q.m87150e0(-871170146);
                abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q, (i14 >> 6) & 14, 3);
                c28655q.m87173q(false);
            }
            int i16 = g.f69111b[itemState.getScaling().ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c39077b1 = C39102j.f168199a;
            }
            InterfaceC2302h interfaceC2302hM51016i0 = m51016i0(itemState);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(interfaceC2302hM51016i0, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            if (itemState.getZoom() == EnumC17785s.PINCH) {
                c28655q.m87150e0(-663238340);
                AbstractC35661d0.m112894J(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), 0.0f, 0.0f, false, null, AbstractC37817c.m121344e(-1548112809, c28655q, new C0084d(abstractC26165aM64500i, c39077b1, interfaceC2302hM51016i0, 23)), c28655q, 199686, 22);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-663022332);
                m50974B(abstractC26165aM64500i, c39077b1, interfaceC2302hM51016i0, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (m51029v(interfaceC28601c1)) {
                c28655q.m87150e0(-662863116);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-662911166);
                m50976D(c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(modifier, itemState, imageSource, i13, 6);
        }
    }

    /* JADX INFO: renamed from: v */
    private static final boolean m51029v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m51030w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m51031x(InterfaceC28601c1 interfaceC28601c1, AsyncImagePainter$State$Success it) {
        AbstractC22676k.m65750j(it, "it");
        m51030w(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m51032y(C17782r c17782r, InterfaceC28601c1 interfaceC28601c1, AsyncImagePainter$State$Error it) {
        AbstractC22676k.m65750j(it, "it");
        f69103a.mo85213c(AbstractC11266d.m30461o("Failed to load image at ", c17782r.getFileUrl()), it.f20226a.f100074c, new AbstractC30556a.a[0]);
        m51030w(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m51033z(AbstractC26165a abstractC26165a, InterfaceC39105k interfaceC39105k, InterfaceC2302h interfaceC2302h, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m50974B(abstractC26165a, interfaceC39105k, interfaceC2302h, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
