package com.whoop.p069ui;

import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.profile.view.edit.form.C9779c;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ui.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroid/view/View;", "T", "Landroidx/fragment/app/m0;", "", "id", "Lkotlin/Function1;", "Ll83/a0;", "cleanup", "Lcom/whoop/ui/d;", "b", "(Landroidx/fragment/app/m0;ILkotlin/jvm/functions/Function1;)Lcom/whoop/ui/d;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10537e {
    /* JADX INFO: renamed from: b */
    public static final <T extends View> C10464d<T> m27173b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13, Function1 cleanup) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(cleanup, "cleanup");
        return new C10464d<>(i13, abstractComponentCallbacksC1320m0, cleanup);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C10464d m27174c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13, Function1 function1, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            function1 = new C9779c(5);
        }
        return m27173b(abstractComponentCallbacksC1320m0, i13, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m27175d(View it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
