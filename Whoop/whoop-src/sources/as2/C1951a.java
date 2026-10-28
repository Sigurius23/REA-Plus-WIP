package as2;

import android.view.View;
import bh3.InterfaceC3255b;
import l83.C23454a0;
import p003a1.C0103b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: as2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Las2/a;", "Las2/b;", "Lbh3/b;", "Landroid/view/View;", "onSafeClick", "<init>", "(Lbh3/b;)V", "y", "Lbh3/b;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1951a extends ViewOnClickListenerC1952b {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC3255b onSafeClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1951a(InterfaceC3255b onSafeClick) {
        super(new C0103b(onSafeClick, 9));
        AbstractC22676k.m65750j(onSafeClick, "onSafeClick");
        this.onSafeClick = onSafeClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m5962b(InterfaceC3255b interfaceC3255b, View v13) {
        AbstractC22676k.m65750j(v13, "v");
        interfaceC3255b.mo9472b(v13);
        return C23454a0.f92919a;
    }
}
