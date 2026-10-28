package fl0;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fl0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lfl0/e;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14560e {

    /* JADX INFO: renamed from: a */
    public static final C14560e f53516a = new C14560e();

    private C14560e() {
    }

    /* JADX INFO: renamed from: a */
    public final String m41682a(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        AbstractC22676k.m65749i(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
