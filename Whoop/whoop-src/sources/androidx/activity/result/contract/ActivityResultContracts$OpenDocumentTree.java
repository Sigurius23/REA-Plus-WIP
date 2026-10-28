package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"androidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree", "Lk/b;", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class ActivityResultContracts$OpenDocumentTree extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        Uri uri = (Uri) obj;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }

    @Override // p267k.AbstractC22081b
    public final C22080a getSynchronousResult(Context context, Object obj) {
        AbstractC22676k.m65750j(context, "context");
        return null;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        if (i13 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
