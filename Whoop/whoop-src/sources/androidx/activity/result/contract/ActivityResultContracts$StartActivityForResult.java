package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import p236j.C21062a;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"androidx/activity/result/contract/ActivityResultContracts$StartActivityForResult", "Lk/b;", "Landroid/content/Intent;", "Lj/a;", "<init>", "()V", "activity_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class ActivityResultContracts$StartActivityForResult extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        Intent input = (Intent) obj;
        AbstractC22676k.m65750j(input, "input");
        return input;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        return new C21062a(i13, intent);
    }
}
