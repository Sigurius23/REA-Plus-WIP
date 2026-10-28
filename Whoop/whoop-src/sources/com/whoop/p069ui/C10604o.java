package com.whoop.p069ui;

import android.content.Context;
import android.widget.Toast;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ui.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/ui/o;", "Lcom/whoop/ui/n;", "<init>", "()V", "Landroid/content/Context;", "context", "", "resId", "length", "Landroid/widget/Toast;", "a", "(Landroid/content/Context;II)Landroid/widget/Toast;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10604o implements InterfaceC10603n {
    @Override // com.whoop.p069ui.InterfaceC10603n
    /* JADX INFO: renamed from: a */
    public Toast mo27349a(Context context, int resId, int length) {
        AbstractC22676k.m65750j(context, "context");
        Toast toastMakeText = Toast.makeText(context, resId, length);
        AbstractC22676k.m65749i(toastMakeText, "makeText(...)");
        return toastMakeText;
    }
}
