package ps1;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.File;
import java.io.IOException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import ns1.C27103a;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ps1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lps1/b;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "filePath", "Lns1/a;", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29504b {

    /* JADX INFO: renamed from: c */
    public static final int f119995c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ps1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labfileupload.processor.TestUploadPdfProcessor$processPdfForPreview$2", m100430f = "TestUploadPdfProcessor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lns1/a;", "<anonymous>", "(Lbc3/c0;)Lns1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119997w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f119998x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29504b f119999y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, C29504b c29504b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119998x = str;
            this.f119999y = c29504b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f119998x, this.f119999y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C27103a> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmapCreateBitmap;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119997w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                File file = new File(this.f119998x);
                if (!file.exists()) {
                    this.f119999y.logger.mo85226q("PDF file not found for preview processing: " + this.f119998x, new AbstractC30556a.a[0]);
                    return new C27103a(null, 0);
                }
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                if (parcelFileDescriptorOpen == null) {
                    this.f119999y.logger.mo85226q("Failed to open PDF file descriptor for preview: " + this.f119998x, new AbstractC30556a.a[0]);
                    return new C27103a(null, 0);
                }
                PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                int pageCount = pdfRenderer.getPageCount();
                for (int i13 = 0; i13 < pageCount; i13++) {
                    try {
                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i13);
                        AbstractC22676k.m65749i(pageOpenPage, "openPage(...)");
                        float fMin = Math.min(400.0f / pageOpenPage.getWidth(), Math.min(400.0f / pageOpenPage.getHeight(), 1.0f));
                        bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * fMin), (int) (pageOpenPage.getHeight() * fMin), Bitmap.Config.ARGB_8888);
                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                        pageOpenPage.close();
                        pdfRenderer.close();
                        parcelFileDescriptorOpen.close();
                        return new C27103a(bitmapCreateBitmap, pageCount);
                    } catch (Exception e5) {
                        this.f119999y.logger.mo85213c("Failed to render PDF page " + i13 + " for TestUpload preview, trying next: " + this.f119998x, e5, new AbstractC30556a.a[0]);
                    }
                }
                bitmapCreateBitmap = null;
                pdfRenderer.close();
                parcelFileDescriptorOpen.close();
                return new C27103a(bitmapCreateBitmap, pageCount);
            } catch (IOException e13) {
                this.f119999y.logger.mo85213c(AbstractC11266d.m30461o("I/O error processing PDF file: ", this.f119998x), e13, new AbstractC30556a.a[0]);
                return new C27103a(null, 0);
            } catch (SecurityException e14) {
                this.f119999y.logger.mo85213c(AbstractC11266d.m30461o("Permission denied accessing PDF file: ", this.f119998x), e14, new AbstractC30556a.a[0]);
                return new C27103a(null, 0);
            } catch (Exception e15) {
                this.f119999y.logger.mo85213c(AbstractC11266d.m30461o("Failed to process TestUpload PDF: ", this.f119998x), e15, new AbstractC30556a.a[0]);
                return new C27103a(null, 0);
            }
        }
    }

    public C29504b(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    public final Object m90150b(String str, InterfaceC30057d<? super C27103a> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new b(str, this, null), interfaceC30057d);
    }

    public /* synthetic */ C29504b(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TestUploadPdfProcessor") : interfaceC34116n);
    }
}
