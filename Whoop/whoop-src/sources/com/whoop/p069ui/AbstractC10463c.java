package com.whoop.p069ui;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.profile.view.edit.form.C9779c;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ui.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "T", "Landroidx/fragment/app/m0;", "Lkotlin/Function1;", "Ll83/a0;", "cleanup", "Lcom/whoop/ui/b;", "b", "(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)Lcom/whoop/ui/b;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10463c {
    /* JADX INFO: renamed from: b */
    public static final <T> C10462b<T> m26725b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Function1 cleanup) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(cleanup, "cleanup");
        return new C10462b<>(abstractComponentCallbacksC1320m0, cleanup);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C10462b m26726c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = new C9779c(4);
        }
        return m26725b(abstractComponentCallbacksC1320m0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m26727d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
