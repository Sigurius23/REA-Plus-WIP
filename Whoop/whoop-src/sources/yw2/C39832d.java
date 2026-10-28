package yw2;

import android.webkit.JavascriptInterface;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yw2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyw2/d;", "", "Lkotlin/Function0;", "Ll83/a0;", "onTypeFormCompleted", "<init>", "(Lc93/a;)V", "", "formId", "onFormSubmitted", "(Ljava/lang/String;)V", "a", "Lc93/a;", "getOnTypeFormCompleted", "()Lc93/a;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39832d {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a onTypeFormCompleted;

    public C39832d(InterfaceC4339a onTypeFormCompleted) {
        AbstractC22676k.m65750j(onTypeFormCompleted, "onTypeFormCompleted");
        this.onTypeFormCompleted = onTypeFormCompleted;
    }

    public final InterfaceC4339a getOnTypeFormCompleted() {
        return this.onTypeFormCompleted;
    }

    @JavascriptInterface
    public final void onFormSubmitted(String formId) {
        AbstractC22676k.m65750j(formId, "formId");
        this.onTypeFormCompleted.invoke();
    }
}
