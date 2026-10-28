package v41;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bh.C3238a;
import bh.C3247j;
import bh.InterfaceC3242e;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.mapbox.maps.MapboxMap;
import gy0.AbstractC16276e;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kh.C22467a;
import kh.C22469c;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import oq1.C28119c;
import p000.AbstractC11266d;
import p000.C33241t;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p095dp.AbstractC12240d;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p180h0.InterfaceC16361a4;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22974l;
import p291l0.InterfaceC23004v;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28662r2;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28661r1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r51.C30936d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v01.C35509k;
import v40.C35652d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v41.d0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0093\u0001\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0087\u0001\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b$\u0010%\u001aY\u0010+\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n0\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0007¢\u0006\u0004\b+\u0010,¨\u00062²\u0006\u000e\u0010 \u001a\u0004\u0018\u00010\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u0010\u0010.\u001a\u0004\u0018\u00010-8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u0002008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "filePath", "Lv41/t;", "rendererFactory", "Ll0/l;", "verticalArrangement", "Lkotlin/Function1;", "", "Ll83/a0;", "onExceptionHandler", "", "zoomEnabled", "fixedBitMapHeight", "useIntrinsicPageAspect", "useZoomableRoundedCornerShape", "", "bitmapResolutionMultiplier", "onZoomChanged", "y", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv41/t;Ll0/l;Lkotlin/jvm/functions/Function1;ZZZZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "pageCount", "Lbh/e;", "imageLoader", "Lbc3/c0;", "imageLoadingScope", "width", "height", "Lmc3/a;", "mutex", "Landroid/graphics/pdf/PdfRenderer;", "renderer", "Landroid/content/Context;", "context", "useFixedHeight", "q", "(Ll0/l;ILjava/lang/String;Lbh/e;Lbc3/c0;IILmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;Landroid/content/Context;ZZLandroidx/compose/runtime/Composer;II)V", "", "maxScale", "minScale", "Lkotlin/Function0;", "content", "J", "(Landroidx/compose/ui/Modifier;FFZLkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Landroid/graphics/Bitmap;", "bitmap", "scale", "Lh2/b;", MapboxMap.QFE_OFFSET, "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35661d0 {

    /* JADX INFO: renamed from: v41.d0$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$PdfContent$1$1$2$1$1$job$1", m100430f = "PdfViewer.kt", m100431l = {309}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f151531E;

        /* JADX INFO: renamed from: F */
        int f151532F;

        /* JADX INFO: renamed from: G */
        int f151533G;

        /* JADX INFO: renamed from: H */
        int f151534H;

        /* JADX INFO: renamed from: I */
        boolean f151535I;

        /* JADX INFO: renamed from: J */
        int f151536J;

        /* JADX INFO: renamed from: K */
        private /* synthetic */ Object f151537K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC25435a f151538L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ PdfRenderer f151539M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ Function1 f151540N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ int f151541O;

        /* JADX INFO: renamed from: P */
        final /* synthetic */ boolean f151542P;

        /* JADX INFO: renamed from: Q */
        final /* synthetic */ int f151543Q;

        /* JADX INFO: renamed from: R */
        final /* synthetic */ int f151544R;

        /* JADX INFO: renamed from: S */
        final /* synthetic */ InterfaceC28601c1 f151545S;

        /* JADX INFO: renamed from: w */
        Object f151546w;

        /* JADX INFO: renamed from: x */
        Object f151547x;

        /* JADX INFO: renamed from: y */
        Object f151548y;

        /* JADX INFO: renamed from: z */
        Object f151549z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC25435a interfaceC25435a, PdfRenderer pdfRenderer, Function1 function1, int i13, boolean z4, int i14, int i15, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151538L = interfaceC25435a;
            this.f151539M = pdfRenderer;
            this.f151540N = function1;
            this.f151541O = i13;
            this.f151542P = z4;
            this.f151543Q = i14;
            this.f151544R = i15;
            this.f151545S = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f151538L, this.f151539M, this.f151540N, this.f151541O, this.f151542P, this.f151543Q, this.f151544R, this.f151545S, interfaceC30057d);
            aVar.f151537K = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25435a interfaceC25435a;
            PdfRenderer pdfRenderer;
            Function1 function1;
            int i13;
            boolean z4;
            int i14;
            int i15;
            InterfaceC28601c1 interfaceC28601c1;
            Bitmap bitmapCreateBitmap;
            int height;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f151537K;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i16 = this.f151536J;
            if (i16 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.f151538L;
                pdfRenderer = this.f151539M;
                function1 = this.f151540N;
                i13 = this.f151541O;
                z4 = this.f151542P;
                int i17 = this.f151543Q;
                int i18 = this.f151544R;
                InterfaceC28601c1 interfaceC28601c2 = this.f151545S;
                this.f151537K = interfaceC2994c0;
                this.f151546w = interfaceC25435a;
                this.f151547x = pdfRenderer;
                this.f151548y = function1;
                this.f151549z = interfaceC28601c2;
                this.f151531E = i13;
                this.f151535I = z4;
                this.f151532F = i17;
                this.f151533G = i18;
                this.f151534H = 0;
                this.f151536J = 1;
                if (interfaceC25435a.mo68211b(this) == enumC31071a) {
                    return enumC31071a;
                }
                i14 = i17;
                i15 = i18;
                interfaceC28601c1 = interfaceC28601c2;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = this.f151533G;
                i14 = this.f151532F;
                z4 = this.f151535I;
                i13 = this.f151531E;
                interfaceC28601c1 = (InterfaceC28601c1) this.f151549z;
                function1 = (Function1) this.f151548y;
                pdfRenderer = (PdfRenderer) this.f151547x;
                interfaceC25435a = (InterfaceC25435a) this.f151546w;
                AbstractC34132o.m107864I(obj);
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            try {
                if (pdfRenderer != null) {
                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i13);
                    try {
                        if (z4) {
                            if (pageOpenPage.getWidth() > 0) {
                                height = (int) ((i14 * pageOpenPage.getHeight()) / pageOpenPage.getWidth());
                                if (height < 1) {
                                    height = 1;
                                }
                            } else {
                                height = i14;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(i14, height, Bitmap.Config.ARGB_8888);
                        } else {
                            bitmapCreateBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                        }
                        AbstractC22676k.m65747g(bitmapCreateBitmap);
                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                        AbstractC35661d0.m112928v(interfaceC28601c1, bitmapCreateBitmap);
                        AbstractC21598x.m60698r(pageOpenPage, null);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC21598x.m60698r(pageOpenPage, th3);
                            throw th4;
                        }
                    }
                } else {
                    AbstractC35661d0.m112928v(interfaceC28601c1, Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888));
                }
                interfaceC25435a.mo68214i(null);
                return c23454a0;
            } catch (Exception e5) {
                function1.invoke(e5);
                return c23454a0;
            } finally {
                interfaceC25435a.mo68214i(null);
            }
        }
    }

    /* JADX INFO: renamed from: v41.d0$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"v41/d0$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3027k1 f151550a;

        public b(InterfaceC3027k1 interfaceC3027k1) {
            this.f151550a = interfaceC3027k1;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f151550a.cancel((CancellationException) null);
        }
    }

    /* JADX INFO: renamed from: v41.d0$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$PdfViewer$2$renderer$2$1", m100430f = "PdfViewer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lp1/r1;", "Landroid/graphics/pdf/PdfRenderer;", "Ll83/a0;", "<anonymous>", "(Lp1/r1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f151551E;

        /* JADX INFO: renamed from: w */
        int f151552w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f151553x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f151554y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35691t f151555z;

        /* JADX INFO: renamed from: v41.d0$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$PdfViewer$2$renderer$2$1$1", m100430f = "PdfViewer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f151556w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28661r1 f151557x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C35691t f151558y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f151559z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC28661r1 interfaceC28661r1, C35691t c35691t, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151557x = interfaceC28661r1;
                this.f151558y = c35691t;
                this.f151559z = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f151557x, this.f151558y, this.f151559z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f151556w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                try {
                    this.f151557x.setValue(this.f151558y.m113140a(this.f151559z));
                } catch (Exception unused) {
                    this.f151557x.setValue(null);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2994c0 interfaceC2994c0, C35691t c35691t, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151554y = interfaceC2994c0;
            this.f151555z = c35691t;
            this.f151551E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f151554y, this.f151555z, this.f151551E, interfaceC30057d);
            cVar.f151553x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC28661r1 interfaceC28661r1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC28661r1, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC28661r1 interfaceC28661r1 = (InterfaceC28661r1) this.f151553x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f151552w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC2994c0 interfaceC2994c0 = this.f151554y;
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(interfaceC2994c0, ExecutorC22364d.f87316w, null, new a(interfaceC28661r1, this.f151555z, this.f151551E, null), 2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v41.d0$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC2994c0 f151560w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f151561x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC16361a4 f151562y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f151563z;

        /* JADX INFO: renamed from: v41.d0$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$ZoomableBox$2$1$1$1", m100430f = "PdfViewer.kt", m100431l = {255}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f151564w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC16361a4 f151565x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f151566y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151565x = interfaceC16361a4;
                this.f151566y = interfaceC28601c1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f151565x, this.f151566y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f151564w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16361a4 interfaceC16361a4 = this.f151565x;
                    float fM112897M = 1 / AbstractC35661d0.m112897M(this.f151566y);
                    this.f151564w = 1;
                    if (AbstractC16444q3.m46623e(interfaceC16361a4, fM112897M, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: v41.d0$d$b */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$ZoomableBox$2$1$1$2", m100430f = "PdfViewer.kt", m100431l = {260}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f151567w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC16361a4 f151568x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC16361a4 interfaceC16361a4, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151568x = interfaceC16361a4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f151568x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f151567w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16361a4 interfaceC16361a4 = this.f151568x;
                    this.f151567w = 1;
                    if (AbstractC16444q3.m46623e(interfaceC16361a4, 2.0f, this) == enumC31071a) {
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

        public d(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c2) {
            this.f151560w = interfaceC2994c0;
            this.f151561x = interfaceC28601c1;
            this.f151562y = interfaceC16361a4;
            this.f151563z = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m112935b(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c2, C16617b c16617b) {
            if (AbstractC35661d0.m112897M(interfaceC28601c1) == 1.0f) {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(interfaceC16361a4, null), 3);
            } else {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(interfaceC16361a4, interfaceC28601c1, null), 3);
                AbstractC35661d0.m112900P(interfaceC28601c2, 0L);
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final InterfaceC2994c0 interfaceC2994c0 = this.f151560w;
            final InterfaceC28601c1 interfaceC28601c1 = this.f151561x;
            final InterfaceC16361a4 interfaceC16361a4 = this.f151562y;
            final InterfaceC28601c1 interfaceC28601c2 = this.f151563z;
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, new Function1() { // from class: v41.e0
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC35661d0.d.m112935b(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4, interfaceC28601c2, (C16617b) obj);
                }
            }, null, null, null, interfaceC30057d, 14);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v41.d0$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f151569w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f151570x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f151571y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f151572z;

        /* JADX INFO: renamed from: v41.d0$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$ZoomableBox$3$1$1", m100430f = "PdfViewer.kt", m100431l = {268, 270}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32274h implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ float f151573E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC28601c1 f151574F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC28601c1 f151575G;

            /* JADX INFO: renamed from: x */
            int f151576x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f151577y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ float f151578z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(float f13, float f14, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151578z = f13;
                this.f151573E = f14;
                this.f151574F = interfaceC28601c1;
                this.f151575G = interfaceC28601c2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f151578z, this.f151573E, this.f151574F, this.f151575G, interfaceC30057d);
                aVar.f151577y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:50:0x013c  */
            /* JADX WARN: Code duplicated, block: B:58:0x0130 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:59:0x0146 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:1: B:48:0x0136->B:60:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:16:0x003d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // s83.AbstractC32267a
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 336
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: v41.AbstractC35661d0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public e(float f13, float f14, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f151569w = f13;
            this.f151570x = f14;
            this.f151571y = interfaceC28601c1;
            this.f151572z = interfaceC28601c2;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new a(this.f151569w, this.f151570x, this.f151571y, this.f151572z, null), interfaceC30057d);
            return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v41.d0$f */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.PdfViewerKt$ZoomableBox$5$1", m100430f = "PdfViewer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f151579w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f151580x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f151581y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151580x = function1;
            this.f151581y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f151580x, this.f151581y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f151579w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f151580x.invoke(new Float(AbstractC35661d0.m112897M(this.f151581y)));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final PdfRenderer m112885A(InterfaceC28670t2 interfaceC28670t2) {
        return (PdfRenderer) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m112886B(int i13, final boolean z4, boolean z13, boolean z14, Function1 function1, final InterfaceC28670t2 interfaceC28670t2, final InterfaceC22974l interfaceC22974l, final String str, final InterfaceC3242e interfaceC3242e, final InterfaceC2994c0 interfaceC2994c0, final InterfaceC25435a interfaceC25435a, final Function1 function2, final Context context, final boolean z15, InterfaceC23004v BoxWithConstraints, Composer composer, int i14) {
        int i15;
        int iMo743q0;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i14 & 6) == 0) {
            i15 = i14 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            C1101c c1101c = (C1101c) BoxWithConstraints;
            final int iMo743q1 = ((int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3403d())) * i13;
            if (z4) {
                c28655q.m87150e0(-1047354527);
                c28655q.m87173q(false);
                iMo743q0 = (int) (iMo743q1 * ((float) Math.sqrt(2.0f)));
            } else {
                c28655q.m87150e0(-1047290140);
                iMo743q0 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3402c());
                c28655q.m87173q(false);
            }
            final int i16 = iMo743q0 * i13;
            boolean zM87153g = c28655q.m87153g(m112885A(interfaceC28670t2));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C33241t(interfaceC28670t2, 8));
                c28655q.m87172p0(objM87133R);
            }
            final InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R;
            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C35652d(6);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C35509k(6);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC35684p.m113047h(null, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R3, null, null, c28655q, 1769472, 413);
            C2314t c2314t = C2314t.f9131w;
            if (z13) {
                c28655q.m87150e0(-1046794078);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "zoomableBox");
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87153g2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C35657b0(function1, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                m112894J(modifierM3599a, 0.0f, 0.0f, z14, (Function1) objM87133R4, AbstractC37817c.m121344e(-2094573282, c28655q, new InterfaceC4351m() { // from class: v41.c0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35661d0.m112892H(interfaceC22974l, str, interfaceC3242e, interfaceC2994c0, iMo743q1, i16, interfaceC25435a, function2, context, z4, z15, interfaceC28670t3, interfaceC28670t2, (Composer) obj, iIntValue);
                    }
                }), c28655q, 196614, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1046166576);
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC33253j.m105489e(15));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
                m112923q(interfaceC22974l, m112888D(interfaceC28670t3), str, interfaceC3242e, interfaceC2994c0, iMo743q1, i16, interfaceC25435a, m112885A(interfaceC28670t2), function2, context, z4, z15, c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final int m112887C(InterfaceC28670t2 interfaceC28670t2) {
        PdfRenderer pdfRendererM112885A = m112885A(interfaceC28670t2);
        if (pdfRendererM112885A != null) {
            return pdfRendererM112885A.getPageCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    private static final int m112888D(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m112889E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m112890F(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m112891G(Function1 function1, float f13) {
        function1.invoke(Boolean.valueOf(f13 > 1.1f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m112892H(InterfaceC22974l interfaceC22974l, String str, InterfaceC3242e interfaceC3242e, InterfaceC2994c0 interfaceC2994c0, int i13, int i14, InterfaceC25435a interfaceC25435a, Function1 function1, Context context, boolean z4, boolean z13, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, Composer composer, int i15) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            m112923q(interfaceC22974l, m112888D(interfaceC28670t2), str, interfaceC3242e, interfaceC2994c0, i13, i14, interfaceC25435a, m112885A(interfaceC28670t3), function1, context, z4, z13, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m112893I(Modifier modifier, String str, C35691t c35691t, InterfaceC22974l interfaceC22974l, Function1 function1, boolean z4, boolean z13, boolean z14, boolean z15, int i13, Function1 function2, int i14, int i15, int i16, Composer composer, int i17) {
        m112931y(modifier, str, c35691t, interfaceC22974l, function1, z4, z13, z14, z15, i13, function2, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:101:0x015b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0164  */
    /* JADX WARN: Code duplicated, block: B:105:0x0166  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0174  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:124:0x021a  */
    /* JADX WARN: Code duplicated, block: B:127:0x023a  */
    /* JADX WARN: Code duplicated, block: B:128:0x023c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0243 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:135:0x0259  */
    /* JADX WARN: Code duplicated, block: B:138:0x0266  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0143  */
    /* JADX INFO: renamed from: J */
    public static final void m112894J(Modifier modifier, float f13, float f14, boolean z4, Function1 function1, InterfaceC4351m content, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f15;
        int i16;
        float f16;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z13;
        Modifier modifier3;
        float f17;
        Function1 function3;
        float f18;
        C28677v1 c28677v1M87180u;
        Modifier modifierM118994r;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        InterfaceC16361a4 interfaceC16361a4M46633o;
        boolean zM87157i;
        Object objM87133R5;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R6;
        float f19;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        Object objM87133R7;
        Object objM87133R8;
        int i24;
        int i25;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-421553968);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                f15 = f13;
                i15 |= c28655q.m87147d(f15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    f16 = f14;
                    if (c28655q.m87147d(f16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i25;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(content)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i24;
                    }
                    if ((i15 & 74899) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        modifierM118994r = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier2 = modifierM118994r;
                        }
                        if (i27 != 0) {
                            f15 = 3.0f;
                        }
                        if (i16 != 0) {
                            f16 = 1.0f;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C35509k(7);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function4 = (Function1) objM87133R8;
                        } else {
                            function4 = function2;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i || objM87133R5 == c28676v0) {
                            objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        C23454a0 c23454a0 = C23454a0.f92919a;
                        Modifier modifierM108903b = AbstractC34452c0.m108903b(modifier2, c23454a0, (PointerInputEventHandler) objM87133R5);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        Modifier modifier4 = modifier2;
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R6 = c28655q.m87133R();
                        if (!z16 || objM87133R6 == c28676v0) {
                            f19 = f16;
                            objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            f19 = f16;
                        }
                        Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b, c23454a0, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                        if (m112897M(interfaceC28601c1) == 1.0f && z4) {
                            modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                        }
                        Modifier modifierMo3471e = modifierM3488c.mo3471e(modifierM118994r);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                        AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                        Float fValueOf = Float.valueOf(m112897M(interfaceC28601c1));
                        if ((i15 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17 || objM87133R7 == c28676v0) {
                            objM87133R7 = new f(function4, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf);
                        f17 = f19;
                        function3 = function4;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        f17 = f16;
                        function3 = function2;
                    }
                    f18 = f15;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(content)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i24;
                }
                if ((i15 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    modifierM118994r = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = modifierM118994r;
                    }
                    if (i27 != 0) {
                        f15 = 3.0f;
                    }
                    if (i16 != 0) {
                        f16 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35509k(7);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    C23454a0 c23454a1 = C23454a0.f92919a;
                    Modifier modifierM108903b2 = AbstractC34452c0.m108903b(modifier2, c23454a1, (PointerInputEventHandler) objM87133R5);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Modifier modifier5 = modifier2;
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        f19 = f16;
                        objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        f19 = f16;
                        objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b2, c23454a1, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                    if (m112897M(interfaceC28601c1) == 1.0f) {
                        modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                    }
                    Modifier modifierMo3471e2 = modifierM3488c2.mo3471e(modifierM118994r);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
                    AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                    Float fValueOf2 = Float.valueOf(m112897M(interfaceC28601c1));
                    if ((i15 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        objM87133R7 = new f(function4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new f(function4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf2);
                    f17 = f19;
                    function3 = function4;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f17 = f16;
                    function3 = function2;
                }
                f18 = f15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
                }
            }
            i15 |= 384;
            f16 = f14;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87155h(z4)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(content)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i24;
                }
                if ((i15 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    modifierM118994r = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = modifierM118994r;
                    }
                    if (i27 != 0) {
                        f15 = 3.0f;
                    }
                    if (i16 != 0) {
                        f16 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35509k(7);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    C23454a0 c23454a2 = C23454a0.f92919a;
                    Modifier modifierM108903b3 = AbstractC34452c0.m108903b(modifier2, c23454a2, (PointerInputEventHandler) objM87133R5);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Modifier modifier6 = modifier2;
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        f19 = f16;
                        objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        f19 = f16;
                        objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3488c3 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b3, c23454a2, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                    if (m112897M(interfaceC28601c1) == 1.0f) {
                        modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                    }
                    Modifier modifierMo3471e3 = modifierM3488c3.mo3471e(modifierM118994r);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                    Float fValueOf3 = Float.valueOf(m112897M(interfaceC28601c1));
                    if ((i15 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        objM87133R7 = new f(function4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new f(function4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf3);
                    f17 = f19;
                    function3 = function4;
                    modifier3 = modifier6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f17 = f16;
                    function3 = function2;
                }
                f18 = f15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(content)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i24;
            }
            if ((i15 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                modifierM118994r = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = modifierM118994r;
                }
                if (i27 != 0) {
                    f15 = 3.0f;
                }
                if (i16 != 0) {
                    f16 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35509k(7);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                C23454a0 c23454a3 = C23454a0.f92919a;
                Modifier modifierM108903b4 = AbstractC34452c0.m108903b(modifier2, c23454a3, (PointerInputEventHandler) objM87133R5);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Modifier modifier7 = modifier2;
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    f19 = f16;
                    objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    f19 = f16;
                    objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM3488c4 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b4, c23454a3, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                if (m112897M(interfaceC28601c1) == 1.0f) {
                    modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                }
                Modifier modifierMo3471e4 = modifierM3488c4.mo3471e(modifierM118994r);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                Float fValueOf4 = Float.valueOf(m112897M(interfaceC28601c1));
                if ((i15 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    objM87133R7 = new f(function4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new f(function4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf4);
                f17 = f19;
                function3 = function4;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f17 = f16;
                function3 = function2;
            }
            f18 = f15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
            }
        }
        i15 |= 48;
        f15 = f13;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                f16 = f14;
                if (c28655q.m87147d(f16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87155h(z4)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(content)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i24;
                }
                if ((i15 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    modifierM118994r = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = modifierM118994r;
                    }
                    if (i27 != 0) {
                        f15 = 3.0f;
                    }
                    if (i16 != 0) {
                        f16 = 1.0f;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35509k(7);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    C23454a0 c23454a4 = C23454a0.f92919a;
                    Modifier modifierM108903b5 = AbstractC34452c0.m108903b(modifier2, c23454a4, (PointerInputEventHandler) objM87133R5);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Modifier modifier8 = modifier2;
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        f19 = f16;
                        objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        f19 = f16;
                        objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3488c5 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b5, c23454a4, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                    if (m112897M(interfaceC28601c1) == 1.0f) {
                        modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                    }
                    Modifier modifierMo3471e5 = modifierM3488c5.mo3471e(modifierM118994r);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                    Float fValueOf5 = Float.valueOf(m112897M(interfaceC28601c1));
                    if ((i15 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        objM87133R7 = new f(function4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new f(function4, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf5);
                    f17 = f19;
                    function3 = function4;
                    modifier3 = modifier8;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f17 = f16;
                    function3 = function2;
                }
                f18 = f15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(content)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i24;
            }
            if ((i15 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                modifierM118994r = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = modifierM118994r;
                }
                if (i27 != 0) {
                    f15 = 3.0f;
                }
                if (i16 != 0) {
                    f16 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35509k(7);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                C23454a0 c23454a5 = C23454a0.f92919a;
                Modifier modifierM108903b6 = AbstractC34452c0.m108903b(modifier2, c23454a5, (PointerInputEventHandler) objM87133R5);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Modifier modifier9 = modifier2;
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    f19 = f16;
                    objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    f19 = f16;
                    objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM3488c6 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b6, c23454a5, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                if (m112897M(interfaceC28601c1) == 1.0f) {
                    modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                }
                Modifier modifierMo3471e6 = modifierM3488c6.mo3471e(modifierM118994r);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                Float fValueOf6 = Float.valueOf(m112897M(interfaceC28601c1));
                if ((i15 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    objM87133R7 = new f(function4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new f(function4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf6);
                f17 = f19;
                function3 = function4;
                modifier3 = modifier9;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f17 = f16;
                function3 = function2;
            }
            f18 = f15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
            }
        }
        i15 |= 384;
        f16 = f14;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87155h(z4)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i25;
        }
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(content)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i24;
            }
            if ((i15 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                modifierM118994r = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = modifierM118994r;
                }
                if (i27 != 0) {
                    f15 = 3.0f;
                }
                if (i16 != 0) {
                    f16 = 1.0f;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35509k(7);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                C23454a0 c23454a6 = C23454a0.f92919a;
                Modifier modifierM108903b7 = AbstractC34452c0.m108903b(modifier2, c23454a6, (PointerInputEventHandler) objM87133R5);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Modifier modifier10 = modifier2;
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R6 = c28655q.m87133R();
                if (z16) {
                    f19 = f16;
                    objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    f19 = f16;
                    objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM3488c7 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b7, c23454a6, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
                if (m112897M(interfaceC28601c1) == 1.0f) {
                    modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
                }
                Modifier modifierMo3471e7 = modifierM3488c7.mo3471e(modifierM118994r);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
                Float fValueOf7 = Float.valueOf(m112897M(interfaceC28601c1));
                if ((i15 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    objM87133R7 = new f(function4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new f(function4, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf7);
                f17 = f19;
                function3 = function4;
                modifier3 = modifier10;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f17 = f16;
                function3 = function2;
            }
            f18 = f15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(content)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i24;
        }
        if ((i15 & 74899) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            modifierM118994r = C2314t.f9131w;
            if (i26 != 0) {
                modifier2 = modifierM118994r;
            }
            if (i27 != 0) {
                f15 = 3.0f;
            }
            if (i16 != 0) {
                f16 = 1.0f;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C35509k(7);
                    c28655q.m87172p0(objM87133R8);
                }
                function4 = (Function1) objM87133R8;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC3855a.m11831o(1.0f, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C16617b(0L));
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C28119c(26, interfaceC28601c1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R4, c28655q);
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new d(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4M46633o, interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            }
            C23454a0 c23454a7 = C23454a0.f92919a;
            Modifier modifierM108903b8 = AbstractC34452c0.m108903b(modifier2, c23454a7, (PointerInputEventHandler) objM87133R5);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            Modifier modifier11 = modifier2;
            if ((i15 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R6 = c28655q.m87133R();
            if (z16) {
                f19 = f16;
                objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R6);
            } else {
                f19 = f16;
                objM87133R6 = new e(f19, f15, interfaceC28601c1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifierM3488c8 = AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM108903b8, c23454a7, (PointerInputEventHandler) objM87133R6), m112897M(interfaceC28601c1), m112897M(interfaceC28601c1), 0.0f, Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m112899O(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 524260);
            if (m112897M(interfaceC28601c1) == 1.0f) {
                modifierM118994r = AbstractC37056f.m118994r(modifierM118994r, AbstractC33253j.m105489e(15));
            }
            Modifier modifierMo3471e8 = modifierM3488c8.mo3471e(modifierM118994r);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            AbstractC11895b.m32007z((i15 >> 15) & 14, content, c28655q, true);
            Float fValueOf8 = Float.valueOf(m112897M(interfaceC28601c1));
            if ((i15 & 57344) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R7 = c28655q.m87133R();
            if (z17) {
                objM87133R7 = new f(function4, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new f(function4, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, fValueOf8);
            f17 = f19;
            function3 = function4;
            modifier3 = modifier11;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            f17 = f16;
            function3 = function2;
        }
        f18 = f15;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35692u(modifier3, f18, f17, z4, function3, content, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m112895K(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m112896L(Modifier modifier, float f13, float f14, boolean z4, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m112894J(modifier, f13, f14, z4, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final float m112897M(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m112898N(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final long m112899O(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16617b) interfaceC28601c1.getValue()).f63937a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m112900P(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16617b(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m112901Q(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13, C16617b c16617b, float f14) {
        m112898N(interfaceC28601c1, m112897M(interfaceC28601c1) * f13);
        m112900P(interfaceC28601c2, C16617b.m47192h(m112899O(interfaceC28601c2), c16617b.f63937a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m112923q(final InterfaceC22974l interfaceC22974l, final int i13, final String str, final InterfaceC3242e interfaceC3242e, final InterfaceC2994c0 interfaceC2994c0, final int i14, final int i15, final InterfaceC25435a interfaceC25435a, final PdfRenderer pdfRenderer, final Function1 function1, final Context context, final boolean z4, final boolean z13, Composer composer, final int i16, final int i17) {
        int i18;
        String str2;
        int i19;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-365768424);
        if ((i16 & 6) == 0) {
            i18 = (c28655q2.m87153g(interfaceC22974l) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            str2 = str;
            i18 |= c28655q2.m87153g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i16 & 3072) == 0) {
            i18 |= c28655q2.m87157i(interfaceC3242e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i16 & 24576) == 0) {
            i18 |= c28655q2.m87157i(interfaceC2994c0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i16) == 0) {
            i18 |= c28655q2.m87149e(i14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i16 & 1572864) == 0) {
            i18 |= c28655q2.m87149e(i15) ? 1048576 : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i18 |= c28655q2.m87157i(interfaceC25435a) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i18 |= c28655q2.m87157i(pdfRenderer) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i16 & 805306368) == 0) {
            i18 |= c28655q2.m87157i(function1) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i19 = i17 | (c28655q2.m87157i(context) ? 4 : 2);
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i19 |= c28655q2.m87155h(z13) ? 256 : 128;
        }
        int i24 = i19;
        if (c28655q2.m87135U(i18 & 1, ((i18 & 306783379) == 306783378 && (i24 & 147) == 146) ? false : true)) {
            Modifier modifierM7154a = AbstractC2294a.m7154a(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), AbstractC17918w0.f69621a));
            boolean zM87157i = ((i18 & 112) == 32) | ((i18 & 896) == 256) | c28655q2.m87157i(interfaceC3242e) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC25435a) | c28655q2.m87157i(pdfRenderer) | ((i24 & 896) == 256) | ((458752 & i18) == 131072) | ((3670016 & i18) == 1048576) | ((1879048192 & i18) == 536870912) | ((i24 & 112) == 32) | c28655q2.m87157i(context);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                final String str3 = str2;
                Function1 function2 = new Function1() { // from class: v41.v
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC35661d0.m112924r(i13, str3, interfaceC2994c0, interfaceC25435a, pdfRenderer, z13, i14, i15, function1, z4, context, interfaceC3242e, (InterfaceC26064q) obj);
                    }
                };
                c28655q2.m87172p0(function2);
                objM87133R = function2;
            }
            c28655q = c28655q2;
            AbstractC22674j.m65717c(modifierM7154a, null, null, interfaceC22974l, null, null, false, null, (Function1) objM87133R, c28655q, (i18 << 12) & 57344, 494);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.w
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35661d0.m112930x(interfaceC22974l, i13, str, interfaceC3242e, interfaceC2994c0, i14, i15, interfaceC25435a, pdfRenderer, function1, context, z4, z13, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m112924r(final int i13, final String str, final InterfaceC2994c0 interfaceC2994c0, final InterfaceC25435a interfaceC25435a, final PdfRenderer pdfRenderer, final boolean z4, final int i14, final int i15, final Function1 function1, final boolean z13, final Context context, final InterfaceC3242e interfaceC3242e, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77555a(LazyColumn, i13, new C30936d(str, 9), new C37816b(new InterfaceC4352n() { // from class: v41.x
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC35661d0.m112926t(str, interfaceC2994c0, interfaceC25435a, pdfRenderer, z4, i14, i15, function1, z13, context, i13, interfaceC3242e, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
            }
        }, true, -373764810), 4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Object m112925s(String str, int i13) {
        return AbstractC25012a.m73373f(i13, str, "-");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m112926t(String str, final InterfaceC2994c0 interfaceC2994c0, final InterfaceC25435a interfaceC25435a, final PdfRenderer pdfRenderer, final boolean z4, final int i13, final int i14, final Function1 function1, boolean z13, Context context, int i15, InterfaceC3242e interfaceC3242e, InterfaceC1103a items, final int i16, Composer composer, int i17) {
        int i18;
        ?? r10;
        AbstractC22676k.m65750j(items, "$this$items");
        if ((i17 & 48) == 0) {
            i18 = i17 | (((C28655q) composer).m87149e(i16) ? 32 : 16);
        } else {
            i18 = i17;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i18 & 1, (i18 & 145) != 144)) {
            C22467a c22467a = new C22467a(AbstractC25012a.m73373f(i16, str, "-"));
            Object objM87133R = c28655q.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                C22469c c22469c = (C22469c) ((C3247j) interfaceC3242e).f12728c.getValue();
                if (c22469c != null && c22469c.f88020a.mo16070p(c22467a) == null) {
                    c22469c.f88021b.m9038g(c22467a);
                }
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Bitmap bitmapM112927u = m112927u(interfaceC28601c1);
            Modifier modifierM3384f = C2314t.f9131w;
            if (bitmapM112927u == null) {
                c28655q.m87150e0(2023059245);
                Integer numValueOf = Integer.valueOf(i16);
                boolean zM87157i = ((i18 & 112) == 32) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC25435a) | c28655q.m87157i(pdfRenderer) | c28655q.m87155h(z4) | c28655q.m87149e(i13) | c28655q.m87149e(i14) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == obj) {
                    Function1 function2 = new Function1() { // from class: v41.y
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC35661d0.m112929w(interfaceC2994c0, interfaceC25435a, pdfRenderer, function1, i16, z4, i13, i14, interfaceC28601c1, (C28624i0) obj2);
                        }
                    };
                    c28655q.m87172p0(function2);
                    objM87133R2 = function2;
                }
                AbstractC28683x.m87250d(str, numValueOf, (Function1) objM87133R2, c28655q);
                if (z13 || z4) {
                    r10 = 0;
                    modifierM3384f = AbstractC1099a.m3384f(modifierM3384f, false, 1.0f / ((float) Math.sqrt(2.0f)));
                } else {
                    r10 = 0;
                }
                AbstractC22989q.m66760a(AbstractC1102d.m3409f(1.0f, modifierM3384f), c28655q, r10);
                c28655q.m87173q(r10);
            } else {
                c28655q.m87150e0(2025306187);
                if (z4) {
                    modifierM3384f = AbstractC1099a.m3384f(modifierM3384f, false, bitmapM112927u.getWidth() / bitmapM112927u.getHeight());
                } else if (z13) {
                    modifierM3384f = AbstractC1099a.m3384f(modifierM3384f, false, 1.0f / ((float) Math.sqrt(2.0f)));
                }
                C25540h c25540h = new C25540h(context);
                c25540h.m75120d(bitmapM112927u.getWidth(), bitmapM112927u.getHeight());
                c25540h.f100082f = c22467a;
                c25540h.f100079c = bitmapM112927u;
                AbstractC29125c.m88522c(AbstractC12240d.m34054T(c25540h.m75117a(), c28655q, 0), AbstractC2875y.m8294g(i16 + 1, i15, "Page ", " of "), AbstractC1102d.m3409f(1.0f, modifierM3384f), null, C39102j.f168200b, 0.0f, null, c28655q, 24576, 104);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final Bitmap m112927u(InterfaceC28601c1 interfaceC28601c1) {
        return (Bitmap) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m112928v(InterfaceC28601c1 interfaceC28601c1, Bitmap bitmap) {
        interfaceC28601c1.setValue(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC28620h0 m112929w(InterfaceC2994c0 interfaceC2994c0, InterfaceC25435a interfaceC25435a, PdfRenderer pdfRenderer, Function1 function1, int i13, boolean z4, int i14, int i15, InterfaceC28601c1 interfaceC28601c1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new b(AbstractC3006f0.m8732z(interfaceC2994c0, ExecutorC22364d.f87316w, null, new a(interfaceC25435a, pdfRenderer, function1, i13, z4, i14, i15, interfaceC28601c1, null), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112930x(InterfaceC22974l interfaceC22974l, int i13, String str, InterfaceC3242e interfaceC3242e, InterfaceC2994c0 interfaceC2994c0, int i14, int i15, InterfaceC25435a interfaceC25435a, PdfRenderer pdfRenderer, Function1 function1, Context context, boolean z4, boolean z13, int i16, int i17, Composer composer, int i18) {
        m112923q(interfaceC22974l, i13, str, interfaceC3242e, interfaceC2994c0, i14, i15, interfaceC25435a, pdfRenderer, function1, context, z4, z13, composer, AbstractC28683x.m87244L(i16 | 1), AbstractC28683x.m87244L(i17));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0191  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x01de  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:162:0x0207  */
    /* JADX WARN: Code duplicated, block: B:165:0x0216  */
    /* JADX WARN: Code duplicated, block: B:168:0x022d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0233  */
    /* JADX WARN: Code duplicated, block: B:176:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x024a  */
    /* JADX WARN: Code duplicated, block: B:180:0x025a  */
    /* JADX WARN: Code duplicated, block: B:183:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0273  */
    /* JADX WARN: Code duplicated, block: B:189:0x029c  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:195:0x030d  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    /* JADX INFO: renamed from: y */
    public static final void m112931y(Modifier modifier, final String str, C35691t c35691t, InterfaceC22974l interfaceC22974l, final Function1 onExceptionHandler, boolean z4, boolean z13, boolean z14, boolean z15, int i13, Function1 function1, Composer composer, final int i14, final int i15, final int i16) {
        Modifier modifier2;
        int i17;
        C35691t c35691t2;
        InterfaceC22974l interfaceC22974lM66746i;
        int i18;
        boolean z16;
        int i19;
        int i24;
        boolean z17;
        int i25;
        int i26;
        boolean z18;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z19;
        boolean z24;
        C28655q c28655q;
        final int i39;
        final Function1 function2;
        final boolean z25;
        final Modifier modifier3;
        final C35691t c35691t3;
        final InterfaceC22974l interfaceC22974l2;
        final boolean z26;
        final boolean z27;
        final boolean z28;
        C28677v1 c28677v1M87180u;
        int i44;
        C28676v0 c28676v0;
        boolean z29;
        int i45;
        final Function1 function3;
        int i46;
        boolean z34;
        C35691t c35691t4;
        boolean z35;
        Modifier modifier4;
        final InterfaceC22974l interfaceC22974l3;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R3;
        boolean zM87153g;
        Object objM87133R4;
        InterfaceC4351m interfaceC4351m;
        Object objM87133R5;
        final InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i;
        Object objM87133R6;
        Object objM87133R7;
        final boolean z36;
        Modifier modifier5;
        final boolean z37;
        final boolean z38;
        final int i47;
        final boolean z39;
        int i48;
        AbstractC22676k.m65750j(onExceptionHandler, "onExceptionHandler");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(867156539);
        int i49 = i16 & 1;
        if (i49 != 0) {
            i17 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i16 & 4) == 0) {
                c35691t2 = c35691t;
                int i54 = c28655q2.m87153g(c35691t2) ? 256 : 128;
                i17 |= i54;
            } else {
                c35691t2 = c35691t;
            }
            i17 |= i54;
        } else {
            c35691t2 = c35691t;
        }
        int i55 = i16 & 8;
        if (i55 == 0) {
            if ((i14 & 3072) == 0) {
                interfaceC22974lM66746i = interfaceC22974l;
                i17 |= c28655q2.m87153g(interfaceC22974lM66746i) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87157i(onExceptionHandler)) {
                    i48 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i48 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i17 |= i48;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                if ((196608 & i14) == 0) {
                    z16 = z4;
                    if (c28655q2.m87155h(z16)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 64;
                if (i24 != 0) {
                    i17 |= 1572864;
                    z17 = z13;
                } else {
                    z17 = z13;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q2.m87155h(z17)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i17 |= i25;
                    }
                }
                i26 = i16 & 128;
                if (i26 != 0) {
                    i17 |= 12582912;
                    z18 = z14;
                } else {
                    z18 = z14;
                    if ((i14 & 12582912) == 0) {
                        if (c28655q2.m87155h(z18)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 256;
                if (i28 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i29 = 67108864;
                        } else {
                            i29 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i17 |= i29;
                    }
                    i34 = i16 & 512;
                    if (i34 != 0) {
                        if ((i14 & 805306368) == 0) {
                            if (c28655q2.m87149e(i13)) {
                                i35 = 536870912;
                            } else {
                                i35 = 268435456;
                            }
                            i17 |= i35;
                        }
                        i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        if (i36 != 0) {
                            i37 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (c28655q2.m87157i(function1)) {
                                i38 = 4;
                            } else {
                                i38 = 2;
                            }
                            i37 = i15 | i38;
                        } else {
                            i37 = i15;
                        }
                        z19 = true;
                        if ((i17 & 306783379) == 306783378 || (i37 & 3) != 2) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if (c28655q2.m87135U(i17 & 1, z24)) {
                            c28655q2.m87140Z();
                            i44 = i14 & 1;
                            c28676v0 = C28635l.f115821a;
                            if (i44 != 0 || c28655q2.m87118C()) {
                                if (i49 != 0) {
                                    modifier2 = C2314t.f9131w;
                                }
                                if ((i16 & 4) != 0) {
                                    i17 &= -897;
                                    c35691t2 = new C35691t();
                                }
                                if (i55 != 0) {
                                    interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i24 != 0) {
                                    z17 = true;
                                }
                                if (i26 != 0) {
                                    z18 = false;
                                }
                                if (i28 != 0) {
                                    z29 = true;
                                } else {
                                    z29 = z15;
                                }
                                if (i34 != 0) {
                                    i45 = 1;
                                } else {
                                    i45 = i13;
                                }
                                if (i36 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C35509k(5);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    function3 = (Function1) objM87133R;
                                } else {
                                    function3 = function1;
                                }
                                i46 = i17;
                                z34 = z18;
                                c35691t4 = c35691t2;
                                z35 = z29;
                                modifier4 = modifier2;
                                interfaceC22974l3 = interfaceC22974lM66746i;
                            } else {
                                c28655q2.m87138X();
                                if ((i16 & 4) != 0) {
                                    i17 &= -897;
                                }
                                i45 = i13;
                                function3 = function1;
                                modifier4 = modifier2;
                                i46 = i17;
                                interfaceC22974l3 = interfaceC22974lM66746i;
                                z34 = z18;
                                c35691t4 = c35691t2;
                                z35 = z15;
                            }
                            c28655q2.m87175r();
                            if (str == null) {
                                c28655q2.m87150e0(-767232829);
                                c28655q2.m87173q(false);
                                modifier5 = modifier4;
                                c28655q = c28655q2;
                                c35691t4 = c35691t4;
                                z39 = z17;
                                z36 = z35;
                                i47 = i45;
                                z37 = z16;
                                z38 = z34;
                            } else {
                                c28655q2.m87150e0(-767232828);
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = AbstractC25438d.m74669a();
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                final InterfaceC25435a interfaceC25435a = (InterfaceC25435a) objM87133R3;
                                boolean zM87157i2 = c28655q2.m87157i(interfaceC2994c0);
                                Function1 function4 = function3;
                                if ((((i46 & 896) ^ 384) > 256 || !c28655q2.m87153g(c35691t4)) && (i46 & 384) != 256) {
                                }
                                zM87153g = zM87157i2 | z19 | c28655q2.m87153g(str);
                                objM87133R4 = c28655q2.m87133R();
                                if (zM87153g || objM87133R4 == c28676v0) {
                                    objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC4351m = (InterfaceC4351m) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                                zM87157i = c28655q2.m87157i(interfaceC4351m);
                                objM87133R6 = c28655q2.m87133R();
                                if (zM87157i || objM87133R6 == c28676v0) {
                                    objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                                C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                                final Context context = (Context) c28655q2.m87161k(c28674u2);
                                final InterfaceC3242e interfaceC3242eM9378a = C3238a.m9378a((Context) c28655q2.m87161k(c28674u2));
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                final InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R7;
                                z36 = z35;
                                modifier5 = modifier4;
                                z37 = z16;
                                c28655q = c28655q2;
                                z38 = z34;
                                i47 = i45;
                                z39 = z17;
                                function3 = function4;
                                AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                                    @Override // p715kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int iIntValue = ((Integer) obj3).intValue();
                                        return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a, interfaceC2994c1, interfaceC25435a, onExceptionHandler, context, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                    }
                                }), c28655q, 3120, 4);
                                c28655q.m87173q(false);
                            }
                            i39 = i47;
                            z28 = z37;
                            z26 = z36;
                            function2 = function3;
                            interfaceC22974l2 = interfaceC22974l3;
                            z25 = z38;
                            c35691t3 = c35691t4;
                            modifier3 = modifier5;
                            z27 = z39;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            i39 = i13;
                            function2 = function1;
                            z25 = z18;
                            modifier3 = modifier2;
                            c35691t3 = c35691t2;
                            interfaceC22974l2 = interfaceC22974lM66746i;
                            z26 = z15;
                            z27 = z17;
                            z28 = z16;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i17 |= 805306368;
                    i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    z19 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z24)) {
                        c28655q2.m87140Z();
                        i44 = i14 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i44 != 0) {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        } else {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        }
                        c28655q2.m87175r();
                        if (str == null) {
                            c28655q2.m87150e0(-767232829);
                            c28655q2.m87173q(false);
                            modifier5 = modifier4;
                            c28655q = c28655q2;
                            c35691t4 = c35691t4;
                            z39 = z17;
                            z36 = z35;
                            i47 = i45;
                            z37 = z16;
                            z38 = z34;
                        } else {
                            c28655q2.m87150e0(-767232828);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC25438d.m74669a();
                                c28655q2.m87172p0(objM87133R3);
                            }
                            final InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) objM87133R3;
                            boolean zM87157i3 = c28655q2.m87157i(interfaceC2994c0);
                            Function1 function5 = function3;
                            z19 = ((i46 & 896) ^ 384) > 256 ? false : false;
                            zM87153g = zM87157i3 | z19 | c28655q2.m87153g(str);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87153g) {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4351m = (InterfaceC4351m) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                            zM87157i = c28655q2.m87157i(interfaceC4351m);
                            objM87133R6 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                            C28674u2 c28674u3 = AndroidCompositionLocals_androidKt.f4976b;
                            final Context context2 = (Context) c28655q2.m87161k(c28674u3);
                            final InterfaceC3242e interfaceC3242eM9378a2 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u3));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            final InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R7;
                            z36 = z35;
                            modifier5 = modifier4;
                            z37 = z16;
                            c28655q = c28655q2;
                            z38 = z34;
                            i47 = i45;
                            z39 = z17;
                            function3 = function5;
                            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a2, interfaceC2994c2, interfaceC25435a2, onExceptionHandler, context2, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q, 3120, 4);
                            c28655q.m87173q(false);
                        }
                        i39 = i47;
                        z28 = z37;
                        z26 = z36;
                        function2 = function3;
                        interfaceC22974l2 = interfaceC22974l3;
                        z25 = z38;
                        c35691t3 = c35691t4;
                        modifier3 = modifier5;
                        z27 = z39;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        i39 = i13;
                        function2 = function1;
                        z25 = z18;
                        modifier3 = modifier2;
                        c35691t3 = c35691t2;
                        interfaceC22974l2 = interfaceC22974lM66746i;
                        z26 = z15;
                        z27 = z17;
                        z28 = z16;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 |= 100663296;
                i34 = i16 & 512;
                if (i34 != 0) {
                    if ((i14 & 805306368) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    z19 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z24)) {
                        c28655q2.m87140Z();
                        i44 = i14 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i44 != 0) {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        } else {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        }
                        c28655q2.m87175r();
                        if (str == null) {
                            c28655q2.m87150e0(-767232829);
                            c28655q2.m87173q(false);
                            modifier5 = modifier4;
                            c28655q = c28655q2;
                            c35691t4 = c35691t4;
                            z39 = z17;
                            z36 = z35;
                            i47 = i45;
                            z37 = z16;
                            z38 = z34;
                        } else {
                            c28655q2.m87150e0(-767232828);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC25438d.m74669a();
                                c28655q2.m87172p0(objM87133R3);
                            }
                            final InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) objM87133R3;
                            boolean zM87157i4 = c28655q2.m87157i(interfaceC2994c0);
                            Function1 function6 = function3;
                            if (((i46 & 896) ^ 384) > 256) {
                            }
                            zM87153g = zM87157i4 | z19 | c28655q2.m87153g(str);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87153g) {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4351m = (InterfaceC4351m) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                            zM87157i = c28655q2.m87157i(interfaceC4351m);
                            objM87133R6 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                            C28674u2 c28674u4 = AndroidCompositionLocals_androidKt.f4976b;
                            final Context context3 = (Context) c28655q2.m87161k(c28674u4);
                            final InterfaceC3242e interfaceC3242eM9378a3 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u4));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            final InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R7;
                            z36 = z35;
                            modifier5 = modifier4;
                            z37 = z16;
                            c28655q = c28655q2;
                            z38 = z34;
                            i47 = i45;
                            z39 = z17;
                            function3 = function6;
                            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a3, interfaceC2994c3, interfaceC25435a3, onExceptionHandler, context3, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q, 3120, 4);
                            c28655q.m87173q(false);
                        }
                        i39 = i47;
                        z28 = z37;
                        z26 = z36;
                        function2 = function3;
                        interfaceC22974l2 = interfaceC22974l3;
                        z25 = z38;
                        c35691t3 = c35691t4;
                        modifier3 = modifier5;
                        z27 = z39;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        i39 = i13;
                        function2 = function1;
                        z25 = z18;
                        modifier3 = modifier2;
                        c35691t3 = c35691t2;
                        interfaceC22974l2 = interfaceC22974lM66746i;
                        z26 = z15;
                        z27 = z17;
                        z28 = z16;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 |= 805306368;
                i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                z19 = true;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z24)) {
                    c28655q2.m87140Z();
                    i44 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    } else {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    }
                    c28655q2.m87175r();
                    if (str == null) {
                        c28655q2.m87150e0(-767232829);
                        c28655q2.m87173q(false);
                        modifier5 = modifier4;
                        c28655q = c28655q2;
                        c35691t4 = c35691t4;
                        z39 = z17;
                        z36 = z35;
                        i47 = i45;
                        z37 = z16;
                        z38 = z34;
                    } else {
                        c28655q2.m87150e0(-767232828);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC25438d.m74669a();
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) objM87133R3;
                        boolean zM87157i5 = c28655q2.m87157i(interfaceC2994c0);
                        Function1 function7 = function3;
                        if (((i46 & 896) ^ 384) > 256) {
                        }
                        zM87153g = zM87157i5 | z19 | c28655q2.m87153g(str);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        zM87157i = c28655q2.m87157i(interfaceC4351m);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                        C28674u2 c28674u5 = AndroidCompositionLocals_androidKt.f4976b;
                        final Context context4 = (Context) c28655q2.m87161k(c28674u5);
                        final InterfaceC3242e interfaceC3242eM9378a4 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u5));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c4 = (InterfaceC2994c0) objM87133R7;
                        z36 = z35;
                        modifier5 = modifier4;
                        z37 = z16;
                        c28655q = c28655q2;
                        z38 = z34;
                        i47 = i45;
                        z39 = z17;
                        function3 = function7;
                        AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a4, interfaceC2994c4, interfaceC25435a4, onExceptionHandler, context4, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3120, 4);
                        c28655q.m87173q(false);
                    }
                    i39 = i47;
                    z28 = z37;
                    z26 = z36;
                    function2 = function3;
                    interfaceC22974l2 = interfaceC22974l3;
                    z25 = z38;
                    c35691t3 = c35691t4;
                    modifier3 = modifier5;
                    z27 = z39;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    i39 = i13;
                    function2 = function1;
                    z25 = z18;
                    modifier3 = modifier2;
                    c35691t3 = c35691t2;
                    interfaceC22974l2 = interfaceC22974lM66746i;
                    z26 = z15;
                    z27 = z17;
                    z28 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z16 = z4;
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                z17 = z13;
            } else {
                z17 = z13;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
                z18 = z14;
            } else {
                z18 = z14;
                if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87155h(z18)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i17 |= i29;
                }
                i34 = i16 & 512;
                if (i34 != 0) {
                    if ((i14 & 805306368) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    z19 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z24)) {
                        c28655q2.m87140Z();
                        i44 = i14 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i44 != 0) {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        } else {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        }
                        c28655q2.m87175r();
                        if (str == null) {
                            c28655q2.m87150e0(-767232829);
                            c28655q2.m87173q(false);
                            modifier5 = modifier4;
                            c28655q = c28655q2;
                            c35691t4 = c35691t4;
                            z39 = z17;
                            z36 = z35;
                            i47 = i45;
                            z37 = z16;
                            z38 = z34;
                        } else {
                            c28655q2.m87150e0(-767232828);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC25438d.m74669a();
                                c28655q2.m87172p0(objM87133R3);
                            }
                            final InterfaceC25435a interfaceC25435a5 = (InterfaceC25435a) objM87133R3;
                            boolean zM87157i6 = c28655q2.m87157i(interfaceC2994c0);
                            Function1 function8 = function3;
                            if (((i46 & 896) ^ 384) > 256) {
                            }
                            zM87153g = zM87157i6 | z19 | c28655q2.m87153g(str);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87153g) {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4351m = (InterfaceC4351m) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                            zM87157i = c28655q2.m87157i(interfaceC4351m);
                            objM87133R6 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                            C28674u2 c28674u6 = AndroidCompositionLocals_androidKt.f4976b;
                            final Context context5 = (Context) c28655q2.m87161k(c28674u6);
                            final InterfaceC3242e interfaceC3242eM9378a5 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u6));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            final InterfaceC2994c0 interfaceC2994c5 = (InterfaceC2994c0) objM87133R7;
                            z36 = z35;
                            modifier5 = modifier4;
                            z37 = z16;
                            c28655q = c28655q2;
                            z38 = z34;
                            i47 = i45;
                            z39 = z17;
                            function3 = function8;
                            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a5, interfaceC2994c5, interfaceC25435a5, onExceptionHandler, context5, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q, 3120, 4);
                            c28655q.m87173q(false);
                        }
                        i39 = i47;
                        z28 = z37;
                        z26 = z36;
                        function2 = function3;
                        interfaceC22974l2 = interfaceC22974l3;
                        z25 = z38;
                        c35691t3 = c35691t4;
                        modifier3 = modifier5;
                        z27 = z39;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        i39 = i13;
                        function2 = function1;
                        z25 = z18;
                        modifier3 = modifier2;
                        c35691t3 = c35691t2;
                        interfaceC22974l2 = interfaceC22974lM66746i;
                        z26 = z15;
                        z27 = z17;
                        z28 = z16;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 |= 805306368;
                i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                z19 = true;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z24)) {
                    c28655q2.m87140Z();
                    i44 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    } else {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    }
                    c28655q2.m87175r();
                    if (str == null) {
                        c28655q2.m87150e0(-767232829);
                        c28655q2.m87173q(false);
                        modifier5 = modifier4;
                        c28655q = c28655q2;
                        c35691t4 = c35691t4;
                        z39 = z17;
                        z36 = z35;
                        i47 = i45;
                        z37 = z16;
                        z38 = z34;
                    } else {
                        c28655q2.m87150e0(-767232828);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC25438d.m74669a();
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC25435a interfaceC25435a6 = (InterfaceC25435a) objM87133R3;
                        boolean zM87157i7 = c28655q2.m87157i(interfaceC2994c0);
                        Function1 function9 = function3;
                        if (((i46 & 896) ^ 384) > 256) {
                        }
                        zM87153g = zM87157i7 | z19 | c28655q2.m87153g(str);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        zM87157i = c28655q2.m87157i(interfaceC4351m);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                        C28674u2 c28674u7 = AndroidCompositionLocals_androidKt.f4976b;
                        final Context context6 = (Context) c28655q2.m87161k(c28674u7);
                        final InterfaceC3242e interfaceC3242eM9378a6 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u7));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c6 = (InterfaceC2994c0) objM87133R7;
                        z36 = z35;
                        modifier5 = modifier4;
                        z37 = z16;
                        c28655q = c28655q2;
                        z38 = z34;
                        i47 = i45;
                        z39 = z17;
                        function3 = function9;
                        AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a6, interfaceC2994c6, interfaceC25435a6, onExceptionHandler, context6, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3120, 4);
                        c28655q.m87173q(false);
                    }
                    i39 = i47;
                    z28 = z37;
                    z26 = z36;
                    function2 = function3;
                    interfaceC22974l2 = interfaceC22974l3;
                    z25 = z38;
                    c35691t3 = c35691t4;
                    modifier3 = modifier5;
                    z27 = z39;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    i39 = i13;
                    function2 = function1;
                    z25 = z18;
                    modifier3 = modifier2;
                    c35691t3 = c35691t2;
                    interfaceC22974l2 = interfaceC22974lM66746i;
                    z26 = z15;
                    z27 = z17;
                    z28 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 100663296;
            i34 = i16 & 512;
            if (i34 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                z19 = true;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z24)) {
                    c28655q2.m87140Z();
                    i44 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    } else {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    }
                    c28655q2.m87175r();
                    if (str == null) {
                        c28655q2.m87150e0(-767232829);
                        c28655q2.m87173q(false);
                        modifier5 = modifier4;
                        c28655q = c28655q2;
                        c35691t4 = c35691t4;
                        z39 = z17;
                        z36 = z35;
                        i47 = i45;
                        z37 = z16;
                        z38 = z34;
                    } else {
                        c28655q2.m87150e0(-767232828);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC25438d.m74669a();
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC25435a interfaceC25435a7 = (InterfaceC25435a) objM87133R3;
                        boolean zM87157i8 = c28655q2.m87157i(interfaceC2994c0);
                        Function1 function10 = function3;
                        if (((i46 & 896) ^ 384) > 256) {
                        }
                        zM87153g = zM87157i8 | z19 | c28655q2.m87153g(str);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        zM87157i = c28655q2.m87157i(interfaceC4351m);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                        C28674u2 c28674u8 = AndroidCompositionLocals_androidKt.f4976b;
                        final Context context7 = (Context) c28655q2.m87161k(c28674u8);
                        final InterfaceC3242e interfaceC3242eM9378a7 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u8));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c7 = (InterfaceC2994c0) objM87133R7;
                        z36 = z35;
                        modifier5 = modifier4;
                        z37 = z16;
                        c28655q = c28655q2;
                        z38 = z34;
                        i47 = i45;
                        z39 = z17;
                        function3 = function10;
                        AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a7, interfaceC2994c7, interfaceC25435a7, onExceptionHandler, context7, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3120, 4);
                        c28655q.m87173q(false);
                    }
                    i39 = i47;
                    z28 = z37;
                    z26 = z36;
                    function2 = function3;
                    interfaceC22974l2 = interfaceC22974l3;
                    z25 = z38;
                    c35691t3 = c35691t4;
                    modifier3 = modifier5;
                    z27 = z39;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    i39 = i13;
                    function2 = function1;
                    z25 = z18;
                    modifier3 = modifier2;
                    c35691t3 = c35691t2;
                    interfaceC22974l2 = interfaceC22974lM66746i;
                    z26 = z15;
                    z27 = z17;
                    z28 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 805306368;
            i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            z19 = true;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z24)) {
                c28655q2.m87140Z();
                i44 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                } else {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                }
                c28655q2.m87175r();
                if (str == null) {
                    c28655q2.m87150e0(-767232829);
                    c28655q2.m87173q(false);
                    modifier5 = modifier4;
                    c28655q = c28655q2;
                    c35691t4 = c35691t4;
                    z39 = z17;
                    z36 = z35;
                    i47 = i45;
                    z37 = z16;
                    z38 = z34;
                } else {
                    c28655q2.m87150e0(-767232828);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC25438d.m74669a();
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC25435a interfaceC25435a8 = (InterfaceC25435a) objM87133R3;
                    boolean zM87157i9 = c28655q2.m87157i(interfaceC2994c0);
                    Function1 function11 = function3;
                    if (((i46 & 896) ^ 384) > 256) {
                    }
                    zM87153g = zM87157i9 | z19 | c28655q2.m87153g(str);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4351m = (InterfaceC4351m) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    zM87157i = c28655q2.m87157i(interfaceC4351m);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                    C28674u2 c28674u9 = AndroidCompositionLocals_androidKt.f4976b;
                    final Context context8 = (Context) c28655q2.m87161k(c28674u9);
                    final InterfaceC3242e interfaceC3242eM9378a8 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u9));
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final InterfaceC2994c0 interfaceC2994c8 = (InterfaceC2994c0) objM87133R7;
                    z36 = z35;
                    modifier5 = modifier4;
                    z37 = z16;
                    c28655q = c28655q2;
                    z38 = z34;
                    i47 = i45;
                    z39 = z17;
                    function3 = function11;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a8, interfaceC2994c8, interfaceC25435a8, onExceptionHandler, context8, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3120, 4);
                    c28655q.m87173q(false);
                }
                i39 = i47;
                z28 = z37;
                z26 = z36;
                function2 = function3;
                interfaceC22974l2 = interfaceC22974l3;
                z25 = z38;
                c35691t3 = c35691t4;
                modifier3 = modifier5;
                z27 = z39;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i39 = i13;
                function2 = function1;
                z25 = z18;
                modifier3 = modifier2;
                c35691t3 = c35691t2;
                interfaceC22974l2 = interfaceC22974lM66746i;
                z26 = z15;
                z27 = z17;
                z28 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 3072;
        interfaceC22974lM66746i = interfaceC22974l;
        if ((i14 & 24576) == 0) {
            if (c28655q2.m87157i(onExceptionHandler)) {
                i48 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i48 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 |= i48;
        }
        i18 = i16 & 32;
        if (i18 != 0) {
            if ((196608 & i14) == 0) {
                z16 = z4;
                if (c28655q2.m87155h(z16)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i19;
            }
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                z17 = z13;
            } else {
                z17 = z13;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87155h(z17)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
                z18 = z14;
            } else {
                z18 = z14;
                if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87155h(z18)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i17 |= i29;
                }
                i34 = i16 & 512;
                if (i34 != 0) {
                    if ((i14 & 805306368) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    z19 = true;
                    if ((i17 & 306783379) == 306783378) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z24)) {
                        c28655q2.m87140Z();
                        i44 = i14 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i44 != 0) {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        } else {
                            if (i49 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                c35691t2 = new C35691t();
                            }
                            if (i55 != 0) {
                                interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                z29 = true;
                            } else {
                                z29 = z15;
                            }
                            if (i34 != 0) {
                                i45 = 1;
                            } else {
                                i45 = i13;
                            }
                            if (i36 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35509k(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function3 = (Function1) objM87133R;
                            } else {
                                function3 = function1;
                            }
                            i46 = i17;
                            z34 = z18;
                            c35691t4 = c35691t2;
                            z35 = z29;
                            modifier4 = modifier2;
                            interfaceC22974l3 = interfaceC22974lM66746i;
                        }
                        c28655q2.m87175r();
                        if (str == null) {
                            c28655q2.m87150e0(-767232829);
                            c28655q2.m87173q(false);
                            modifier5 = modifier4;
                            c28655q = c28655q2;
                            c35691t4 = c35691t4;
                            z39 = z17;
                            z36 = z35;
                            i47 = i45;
                            z37 = z16;
                            z38 = z34;
                        } else {
                            c28655q2.m87150e0(-767232828);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC25438d.m74669a();
                                c28655q2.m87172p0(objM87133R3);
                            }
                            final InterfaceC25435a interfaceC25435a9 = (InterfaceC25435a) objM87133R3;
                            boolean zM87157i10 = c28655q2.m87157i(interfaceC2994c0);
                            Function1 function12 = function3;
                            if (((i46 & 896) ^ 384) > 256) {
                            }
                            zM87153g = zM87157i10 | z19 | c28655q2.m87153g(str);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87153g) {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4351m = (InterfaceC4351m) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                            zM87157i = c28655q2.m87157i(interfaceC4351m);
                            objM87133R6 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                            C28674u2 c28674u10 = AndroidCompositionLocals_androidKt.f4976b;
                            final Context context9 = (Context) c28655q2.m87161k(c28674u10);
                            final InterfaceC3242e interfaceC3242eM9378a9 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u10));
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            final InterfaceC2994c0 interfaceC2994c9 = (InterfaceC2994c0) objM87133R7;
                            z36 = z35;
                            modifier5 = modifier4;
                            z37 = z16;
                            c28655q = c28655q2;
                            z38 = z34;
                            i47 = i45;
                            z39 = z17;
                            function3 = function12;
                            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a9, interfaceC2994c9, interfaceC25435a9, onExceptionHandler, context9, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q, 3120, 4);
                            c28655q.m87173q(false);
                        }
                        i39 = i47;
                        z28 = z37;
                        z26 = z36;
                        function2 = function3;
                        interfaceC22974l2 = interfaceC22974l3;
                        z25 = z38;
                        c35691t3 = c35691t4;
                        modifier3 = modifier5;
                        z27 = z39;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        i39 = i13;
                        function2 = function1;
                        z25 = z18;
                        modifier3 = modifier2;
                        c35691t3 = c35691t2;
                        interfaceC22974l2 = interfaceC22974lM66746i;
                        z26 = z15;
                        z27 = z17;
                        z28 = z16;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 |= 805306368;
                i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                z19 = true;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z24)) {
                    c28655q2.m87140Z();
                    i44 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    } else {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    }
                    c28655q2.m87175r();
                    if (str == null) {
                        c28655q2.m87150e0(-767232829);
                        c28655q2.m87173q(false);
                        modifier5 = modifier4;
                        c28655q = c28655q2;
                        c35691t4 = c35691t4;
                        z39 = z17;
                        z36 = z35;
                        i47 = i45;
                        z37 = z16;
                        z38 = z34;
                    } else {
                        c28655q2.m87150e0(-767232828);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC25438d.m74669a();
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC25435a interfaceC25435a10 = (InterfaceC25435a) objM87133R3;
                        boolean zM87157i11 = c28655q2.m87157i(interfaceC2994c0);
                        Function1 function13 = function3;
                        if (((i46 & 896) ^ 384) > 256) {
                        }
                        zM87153g = zM87157i11 | z19 | c28655q2.m87153g(str);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        zM87157i = c28655q2.m87157i(interfaceC4351m);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                        C28674u2 c28674u11 = AndroidCompositionLocals_androidKt.f4976b;
                        final Context context10 = (Context) c28655q2.m87161k(c28674u11);
                        final InterfaceC3242e interfaceC3242eM9378a10 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u11));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c10 = (InterfaceC2994c0) objM87133R7;
                        z36 = z35;
                        modifier5 = modifier4;
                        z37 = z16;
                        c28655q = c28655q2;
                        z38 = z34;
                        i47 = i45;
                        z39 = z17;
                        function3 = function13;
                        AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a10, interfaceC2994c10, interfaceC25435a10, onExceptionHandler, context10, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3120, 4);
                        c28655q.m87173q(false);
                    }
                    i39 = i47;
                    z28 = z37;
                    z26 = z36;
                    function2 = function3;
                    interfaceC22974l2 = interfaceC22974l3;
                    z25 = z38;
                    c35691t3 = c35691t4;
                    modifier3 = modifier5;
                    z27 = z39;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    i39 = i13;
                    function2 = function1;
                    z25 = z18;
                    modifier3 = modifier2;
                    c35691t3 = c35691t2;
                    interfaceC22974l2 = interfaceC22974lM66746i;
                    z26 = z15;
                    z27 = z17;
                    z28 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 100663296;
            i34 = i16 & 512;
            if (i34 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                z19 = true;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z24)) {
                    c28655q2.m87140Z();
                    i44 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    } else {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    }
                    c28655q2.m87175r();
                    if (str == null) {
                        c28655q2.m87150e0(-767232829);
                        c28655q2.m87173q(false);
                        modifier5 = modifier4;
                        c28655q = c28655q2;
                        c35691t4 = c35691t4;
                        z39 = z17;
                        z36 = z35;
                        i47 = i45;
                        z37 = z16;
                        z38 = z34;
                    } else {
                        c28655q2.m87150e0(-767232828);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC25438d.m74669a();
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC25435a interfaceC25435a11 = (InterfaceC25435a) objM87133R3;
                        boolean zM87157i12 = c28655q2.m87157i(interfaceC2994c0);
                        Function1 function14 = function3;
                        if (((i46 & 896) ^ 384) > 256) {
                        }
                        zM87153g = zM87157i12 | z19 | c28655q2.m87153g(str);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        zM87157i = c28655q2.m87157i(interfaceC4351m);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                        C28674u2 c28674u12 = AndroidCompositionLocals_androidKt.f4976b;
                        final Context context11 = (Context) c28655q2.m87161k(c28674u12);
                        final InterfaceC3242e interfaceC3242eM9378a11 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u12));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c11 = (InterfaceC2994c0) objM87133R7;
                        z36 = z35;
                        modifier5 = modifier4;
                        z37 = z16;
                        c28655q = c28655q2;
                        z38 = z34;
                        i47 = i45;
                        z39 = z17;
                        function3 = function14;
                        AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a11, interfaceC2994c11, interfaceC25435a11, onExceptionHandler, context11, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3120, 4);
                        c28655q.m87173q(false);
                    }
                    i39 = i47;
                    z28 = z37;
                    z26 = z36;
                    function2 = function3;
                    interfaceC22974l2 = interfaceC22974l3;
                    z25 = z38;
                    c35691t3 = c35691t4;
                    modifier3 = modifier5;
                    z27 = z39;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    i39 = i13;
                    function2 = function1;
                    z25 = z18;
                    modifier3 = modifier2;
                    c35691t3 = c35691t2;
                    interfaceC22974l2 = interfaceC22974lM66746i;
                    z26 = z15;
                    z27 = z17;
                    z28 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 805306368;
            i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            z19 = true;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z24)) {
                c28655q2.m87140Z();
                i44 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                } else {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                }
                c28655q2.m87175r();
                if (str == null) {
                    c28655q2.m87150e0(-767232829);
                    c28655q2.m87173q(false);
                    modifier5 = modifier4;
                    c28655q = c28655q2;
                    c35691t4 = c35691t4;
                    z39 = z17;
                    z36 = z35;
                    i47 = i45;
                    z37 = z16;
                    z38 = z34;
                } else {
                    c28655q2.m87150e0(-767232828);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC25438d.m74669a();
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC25435a interfaceC25435a12 = (InterfaceC25435a) objM87133R3;
                    boolean zM87157i13 = c28655q2.m87157i(interfaceC2994c0);
                    Function1 function15 = function3;
                    if (((i46 & 896) ^ 384) > 256) {
                    }
                    zM87153g = zM87157i13 | z19 | c28655q2.m87153g(str);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4351m = (InterfaceC4351m) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    zM87157i = c28655q2.m87157i(interfaceC4351m);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                    C28674u2 c28674u13 = AndroidCompositionLocals_androidKt.f4976b;
                    final Context context12 = (Context) c28655q2.m87161k(c28674u13);
                    final InterfaceC3242e interfaceC3242eM9378a12 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u13));
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final InterfaceC2994c0 interfaceC2994c12 = (InterfaceC2994c0) objM87133R7;
                    z36 = z35;
                    modifier5 = modifier4;
                    z37 = z16;
                    c28655q = c28655q2;
                    z38 = z34;
                    i47 = i45;
                    z39 = z17;
                    function3 = function15;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a12, interfaceC2994c12, interfaceC25435a12, onExceptionHandler, context12, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3120, 4);
                    c28655q.m87173q(false);
                }
                i39 = i47;
                z28 = z37;
                z26 = z36;
                function2 = function3;
                interfaceC22974l2 = interfaceC22974l3;
                z25 = z38;
                c35691t3 = c35691t4;
                modifier3 = modifier5;
                z27 = z39;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i39 = i13;
                function2 = function1;
                z25 = z18;
                modifier3 = modifier2;
                c35691t3 = c35691t2;
                interfaceC22974l2 = interfaceC22974lM66746i;
                z26 = z15;
                z27 = z17;
                z28 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z16 = z4;
        i24 = i16 & 64;
        if (i24 != 0) {
            i17 |= 1572864;
            z17 = z13;
        } else {
            z17 = z13;
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87155h(z17)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 128;
        if (i26 != 0) {
            i17 |= 12582912;
            z18 = z14;
        } else {
            z18 = z14;
            if ((i14 & 12582912) == 0) {
                if (c28655q2.m87155h(z18)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i17 |= i27;
            }
        }
        i28 = i16 & 256;
        if (i28 != 0) {
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i29 = 67108864;
                } else {
                    i29 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i29;
            }
            i34 = i16 & 512;
            if (i34 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                z19 = true;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z24)) {
                    c28655q2.m87140Z();
                    i44 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i44 != 0) {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    } else {
                        if (i49 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            c35691t2 = new C35691t();
                        }
                        if (i55 != 0) {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            z29 = true;
                        } else {
                            z29 = z15;
                        }
                        if (i34 != 0) {
                            i45 = 1;
                        } else {
                            i45 = i13;
                        }
                        if (i36 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function3 = (Function1) objM87133R;
                        } else {
                            function3 = function1;
                        }
                        i46 = i17;
                        z34 = z18;
                        c35691t4 = c35691t2;
                        z35 = z29;
                        modifier4 = modifier2;
                        interfaceC22974l3 = interfaceC22974lM66746i;
                    }
                    c28655q2.m87175r();
                    if (str == null) {
                        c28655q2.m87150e0(-767232829);
                        c28655q2.m87173q(false);
                        modifier5 = modifier4;
                        c28655q = c28655q2;
                        c35691t4 = c35691t4;
                        z39 = z17;
                        z36 = z35;
                        i47 = i45;
                        z37 = z16;
                        z38 = z34;
                    } else {
                        c28655q2.m87150e0(-767232828);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC25438d.m74669a();
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC25435a interfaceC25435a13 = (InterfaceC25435a) objM87133R3;
                        boolean zM87157i14 = c28655q2.m87157i(interfaceC2994c0);
                        Function1 function16 = function3;
                        if (((i46 & 896) ^ 384) > 256) {
                        }
                        zM87153g = zM87157i14 | z19 | c28655q2.m87153g(str);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4351m = (InterfaceC4351m) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        zM87157i = c28655q2.m87157i(interfaceC4351m);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                        C28674u2 c28674u14 = AndroidCompositionLocals_androidKt.f4976b;
                        final Context context13 = (Context) c28655q2.m87161k(c28674u14);
                        final InterfaceC3242e interfaceC3242eM9378a13 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u14));
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c13 = (InterfaceC2994c0) objM87133R7;
                        z36 = z35;
                        modifier5 = modifier4;
                        z37 = z16;
                        c28655q = c28655q2;
                        z38 = z34;
                        i47 = i45;
                        z39 = z17;
                        function3 = function16;
                        AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a13, interfaceC2994c13, interfaceC25435a13, onExceptionHandler, context13, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q, 3120, 4);
                        c28655q.m87173q(false);
                    }
                    i39 = i47;
                    z28 = z37;
                    z26 = z36;
                    function2 = function3;
                    interfaceC22974l2 = interfaceC22974l3;
                    z25 = z38;
                    c35691t3 = c35691t4;
                    modifier3 = modifier5;
                    z27 = z39;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    i39 = i13;
                    function2 = function1;
                    z25 = z18;
                    modifier3 = modifier2;
                    c35691t3 = c35691t2;
                    interfaceC22974l2 = interfaceC22974lM66746i;
                    z26 = z15;
                    z27 = z17;
                    z28 = z16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 805306368;
            i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            z19 = true;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z24)) {
                c28655q2.m87140Z();
                i44 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                } else {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                }
                c28655q2.m87175r();
                if (str == null) {
                    c28655q2.m87150e0(-767232829);
                    c28655q2.m87173q(false);
                    modifier5 = modifier4;
                    c28655q = c28655q2;
                    c35691t4 = c35691t4;
                    z39 = z17;
                    z36 = z35;
                    i47 = i45;
                    z37 = z16;
                    z38 = z34;
                } else {
                    c28655q2.m87150e0(-767232828);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC25438d.m74669a();
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC25435a interfaceC25435a14 = (InterfaceC25435a) objM87133R3;
                    boolean zM87157i15 = c28655q2.m87157i(interfaceC2994c0);
                    Function1 function17 = function3;
                    if (((i46 & 896) ^ 384) > 256) {
                    }
                    zM87153g = zM87157i15 | z19 | c28655q2.m87153g(str);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4351m = (InterfaceC4351m) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    zM87157i = c28655q2.m87157i(interfaceC4351m);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                    C28674u2 c28674u15 = AndroidCompositionLocals_androidKt.f4976b;
                    final Context context14 = (Context) c28655q2.m87161k(c28674u15);
                    final InterfaceC3242e interfaceC3242eM9378a14 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u15));
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final InterfaceC2994c0 interfaceC2994c14 = (InterfaceC2994c0) objM87133R7;
                    z36 = z35;
                    modifier5 = modifier4;
                    z37 = z16;
                    c28655q = c28655q2;
                    z38 = z34;
                    i47 = i45;
                    z39 = z17;
                    function3 = function17;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a14, interfaceC2994c14, interfaceC25435a14, onExceptionHandler, context14, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3120, 4);
                    c28655q.m87173q(false);
                }
                i39 = i47;
                z28 = z37;
                z26 = z36;
                function2 = function3;
                interfaceC22974l2 = interfaceC22974l3;
                z25 = z38;
                c35691t3 = c35691t4;
                modifier3 = modifier5;
                z27 = z39;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i39 = i13;
                function2 = function1;
                z25 = z18;
                modifier3 = modifier2;
                c35691t3 = c35691t2;
                interfaceC22974l2 = interfaceC22974lM66746i;
                z26 = z15;
                z27 = z17;
                z28 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 100663296;
        i34 = i16 & 512;
        if (i34 != 0) {
            if ((i14 & 805306368) == 0) {
                if (c28655q2.m87149e(i13)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i17 |= i35;
            }
            i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            z19 = true;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z24)) {
                c28655q2.m87140Z();
                i44 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i44 != 0) {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                } else {
                    if (i49 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        c35691t2 = new C35691t();
                    }
                    if (i55 != 0) {
                        interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z15;
                    }
                    if (i34 != 0) {
                        i45 = 1;
                    } else {
                        i45 = i13;
                    }
                    if (i36 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    i46 = i17;
                    z34 = z18;
                    c35691t4 = c35691t2;
                    z35 = z29;
                    modifier4 = modifier2;
                    interfaceC22974l3 = interfaceC22974lM66746i;
                }
                c28655q2.m87175r();
                if (str == null) {
                    c28655q2.m87150e0(-767232829);
                    c28655q2.m87173q(false);
                    modifier5 = modifier4;
                    c28655q = c28655q2;
                    c35691t4 = c35691t4;
                    z39 = z17;
                    z36 = z35;
                    i47 = i45;
                    z37 = z16;
                    z38 = z34;
                } else {
                    c28655q2.m87150e0(-767232828);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC25438d.m74669a();
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC25435a interfaceC25435a15 = (InterfaceC25435a) objM87133R3;
                    boolean zM87157i16 = c28655q2.m87157i(interfaceC2994c0);
                    Function1 function18 = function3;
                    if (((i46 & 896) ^ 384) > 256) {
                    }
                    zM87153g = zM87157i16 | z19 | c28655q2.m87153g(str);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4351m = (InterfaceC4351m) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    zM87157i = c28655q2.m87157i(interfaceC4351m);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                    C28674u2 c28674u16 = AndroidCompositionLocals_androidKt.f4976b;
                    final Context context15 = (Context) c28655q2.m87161k(c28674u16);
                    final InterfaceC3242e interfaceC3242eM9378a15 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u16));
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final InterfaceC2994c0 interfaceC2994c15 = (InterfaceC2994c0) objM87133R7;
                    z36 = z35;
                    modifier5 = modifier4;
                    z37 = z16;
                    c28655q = c28655q2;
                    z38 = z34;
                    i47 = i45;
                    z39 = z17;
                    function3 = function18;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a15, interfaceC2994c15, interfaceC25435a15, onExceptionHandler, context15, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3120, 4);
                    c28655q.m87173q(false);
                }
                i39 = i47;
                z28 = z37;
                z26 = z36;
                function2 = function3;
                interfaceC22974l2 = interfaceC22974l3;
                z25 = z38;
                c35691t3 = c35691t4;
                modifier3 = modifier5;
                z27 = z39;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i39 = i13;
                function2 = function1;
                z25 = z18;
                modifier3 = modifier2;
                c35691t3 = c35691t2;
                interfaceC22974l2 = interfaceC22974lM66746i;
                z26 = z15;
                z27 = z17;
                z28 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 805306368;
        i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i36 != 0) {
            i37 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (c28655q2.m87157i(function1)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i37 = i15 | i38;
        } else {
            i37 = i15;
        }
        z19 = true;
        if ((i17 & 306783379) == 306783378) {
            z24 = true;
        } else {
            z24 = true;
        }
        if (c28655q2.m87135U(i17 & 1, z24)) {
            c28655q2.m87140Z();
            i44 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i44 != 0) {
                if (i49 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    c35691t2 = new C35691t();
                }
                if (i55 != 0) {
                    interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    z29 = true;
                } else {
                    z29 = z15;
                }
                if (i34 != 0) {
                    i45 = 1;
                } else {
                    i45 = i13;
                }
                if (i36 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35509k(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                i46 = i17;
                z34 = z18;
                c35691t4 = c35691t2;
                z35 = z29;
                modifier4 = modifier2;
                interfaceC22974l3 = interfaceC22974lM66746i;
            } else {
                if (i49 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    c35691t2 = new C35691t();
                }
                if (i55 != 0) {
                    interfaceC22974lM66746i = AbstractC22977m.m66746i(8);
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    z29 = true;
                } else {
                    z29 = z15;
                }
                if (i34 != 0) {
                    i45 = 1;
                } else {
                    i45 = i13;
                }
                if (i36 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35509k(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                i46 = i17;
                z34 = z18;
                c35691t4 = c35691t2;
                z35 = z29;
                modifier4 = modifier2;
                interfaceC22974l3 = interfaceC22974lM66746i;
            }
            c28655q2.m87175r();
            if (str == null) {
                c28655q2.m87150e0(-767232829);
                c28655q2.m87173q(false);
                modifier5 = modifier4;
                c28655q = c28655q2;
                c35691t4 = c35691t4;
                z39 = z17;
                z36 = z35;
                i47 = i45;
                z37 = z16;
                z38 = z34;
            } else {
                c28655q2.m87150e0(-767232828);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC25438d.m74669a();
                    c28655q2.m87172p0(objM87133R3);
                }
                final InterfaceC25435a interfaceC25435a16 = (InterfaceC25435a) objM87133R3;
                boolean zM87157i17 = c28655q2.m87157i(interfaceC2994c0);
                Function1 function19 = function3;
                if (((i46 & 896) ^ 384) > 256) {
                }
                zM87153g = zM87157i17 | z19 | c28655q2.m87153g(str);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new c(interfaceC2994c0, c35691t4, str, null);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC4351m = (InterfaceC4351m) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                zM87157i = c28655q2.m87157i(interfaceC4351m);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 0);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, str);
                C28674u2 c28674u17 = AndroidCompositionLocals_androidKt.f4976b;
                final Context context16 = (Context) c28655q2.m87161k(c28674u17);
                final InterfaceC3242e interfaceC3242eM9378a16 = C3238a.m9378a((Context) c28655q2.m87161k(c28674u17));
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R7);
                }
                final InterfaceC2994c0 interfaceC2994c16 = (InterfaceC2994c0) objM87133R7;
                z36 = z35;
                modifier5 = modifier4;
                z37 = z16;
                c28655q = c28655q2;
                z38 = z34;
                i47 = i45;
                z39 = z17;
                function3 = function19;
                AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9102E, false, AbstractC37817c.m121344e(-1855935065, c28655q, new Function3() { // from class: v41.z
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC35661d0.m112886B(i47, z39, z37, z36, function3, interfaceC28601c1, interfaceC22974l3, str, interfaceC3242eM9378a16, interfaceC2994c16, interfaceC25435a16, onExceptionHandler, context16, z38, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3120, 4);
                c28655q.m87173q(false);
            }
            i39 = i47;
            z28 = z37;
            z26 = z36;
            function2 = function3;
            interfaceC22974l2 = interfaceC22974l3;
            z25 = z38;
            c35691t3 = c35691t4;
            modifier3 = modifier5;
            z27 = z39;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            i39 = i13;
            function2 = function1;
            z25 = z18;
            modifier3 = modifier2;
            c35691t3 = c35691t2;
            interfaceC22974l2 = interfaceC22974lM66746i;
            z26 = z15;
            z27 = z17;
            z28 = z16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.a0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35661d0.m112893I(modifier3, str, c35691t3, interfaceC22974l2, onExceptionHandler, z28, z27, z25, z26, i39, function2, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m112932z(boolean z4) {
        return C23454a0.f92919a;
    }
}
