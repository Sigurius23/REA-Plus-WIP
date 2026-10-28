package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"androidx/activity/result/contract/ActivityResultContracts$GetContent", "Lk/b;", "", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class ActivityResultContracts$GetContent extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        String input = (String) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        AbstractC22676k.m65749i(type, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type;
    }

    @Override // p267k.AbstractC22081b
    public final C22080a getSynchronousResult(Context context, Object obj) {
        String input = (String) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
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
