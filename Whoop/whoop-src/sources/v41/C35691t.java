package v41;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v41.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lv41/t;", "", "<init>", "()V", "", "filePath", "Landroid/graphics/pdf/PdfRenderer;", "a", "(Ljava/lang/String;)Landroid/graphics/pdf/PdfRenderer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35691t {

    /* JADX INFO: renamed from: a */
    public static final int f151823a = 0;

    /* JADX INFO: renamed from: a */
    public final PdfRenderer m113140a(String filePath) {
        AbstractC22676k.m65750j(filePath, "filePath");
        return new PdfRenderer(ParcelFileDescriptor.open(new File(filePath), 268435456));
    }
}
