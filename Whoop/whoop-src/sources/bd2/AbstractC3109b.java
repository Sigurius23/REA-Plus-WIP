package bd2;

import android.content.Context;
import android.provider.Telephony;
import android.widget.Toast;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bd2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroid/content/Context;", "context", "", "message", "", AttachmentExtensionsKt.EXTRA_DURATION, "Landroid/widget/Toast;", "d", "(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/Toast;", "c", "(Landroid/content/Context;)Ljava/lang/String;", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3109b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final String m8940c(Context context) {
        try {
            return Telephony.Sms.getDefaultSmsPackage(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Toast m8941d(Context context, String str, int i13) {
        Toast toastMakeText = Toast.makeText(context, str, i13);
        AbstractC22676k.m65749i(toastMakeText, "makeText(...)");
        return toastMakeText;
    }
}
