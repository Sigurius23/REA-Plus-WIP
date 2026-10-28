package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final AbstractComponentCallbacksC1320m0 f5799w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(AbstractComponentCallbacksC1320m0 fragment, String str) {
        super(str);
        AbstractC22676k.m65750j(fragment, "fragment");
        this.f5799w = fragment;
    }
}
