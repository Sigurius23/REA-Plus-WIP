package l02;

import ad3.AbstractC0757c;
import ad3.C0764g;
import kg2.C22459e;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: l02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Ll02/a;", "", "Lad3/c;", "json", "<init>", "(Lad3/c;)V", "a", "Lad3/c;", "c", "()Lad3/c;", "Ltr2/n;", "b", "Ltr2/n;", "d", "()Ltr2/n;", "logger", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23050a {

    /* JADX INFO: renamed from: c */
    public static final int f90903c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C23050a(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        this.json = json;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("NavigationQueryParamDeserializer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m66985b(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        Json.f2780g = true;
        Json.f2785l = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC0757c getJson() {
        return this.json;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C23050a(AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            abstractC0757c = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C22459e(6));
        }
        this(abstractC0757c);
    }
}
