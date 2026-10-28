package ql0;

import android.content.Context;
import com.whoop.data.repositories.LanguageChecker;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ql0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lql0/d;", "Lof3/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lql0/c;", "a", "(Landroid/content/Context;)Lql0/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30469d implements InterfaceC27903a {

    /* JADX INFO: renamed from: w */
    public static final C30469d f125195w = new C30469d();

    private C30469d() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC30468c m93232a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return new C30466a(context, (LanguageChecker) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageChecker.class), null));
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
