package or2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import androidx.core.content.FileProvider;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.k1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lor2/k1;", "", "<init>", "()V", "Ljava/io/File;", "file", "Landroid/content/Context;", "context", "Landroid/content/IntentSender;", "intentSender", "Ll83/a0;", "a", "(Ljava/io/File;Landroid/content/Context;Landroid/content/IntentSender;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28176k1 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m85289b(C28176k1 c28176k1, File file, Context context, IntentSender intentSender, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            intentSender = null;
        }
        c28176k1.m85290a(file, context, intentSender);
    }

    /* JADX INFO: renamed from: a */
    public final void m85290a(File file, Context context, IntentSender intentSender) {
        AbstractC22676k.m65750j(file, "file");
        AbstractC22676k.m65750j(context, "context");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.setType(MimeType.MIME_TYPE_PDF);
        intent.addFlags(1);
        intent.addFlags(2);
        context.startActivity(Intent.createChooser(intent, null, intentSender));
    }
}
