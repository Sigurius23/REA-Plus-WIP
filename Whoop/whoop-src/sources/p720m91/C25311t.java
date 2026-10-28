package p720m91;

import j93.InterfaceC21461d;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m91.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, m65681d2 = {"Lm91/t;", "", "<init>", "()V", "Lm91/p;", "b", "()Lm91/p;", "", "Lj93/d;", "Lm91/f;", "Ljava/util/Map;", "registeredItems", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25311t {

    /* JADX INFO: renamed from: a */
    public static final C25311t f99303a = new C25311t();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Map<InterfaceC21461d, InterfaceC25297f<?>> registeredItems = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public static final int f99305c = 8;

    private C25311t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m74327c(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().putAll(registeredItems);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C25307p m74328b() {
        return Function1.m74306g(new C25293d(4));
    }
}
