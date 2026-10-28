package ya2;

import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ya2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lya2/a;", "", "Lj02/o0;", "navigator", "<init>", "(Lj02/o0;)V", "Ll83/a0;", "a", "()V", "Lj02/o0;", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39357a {

    /* JADX INFO: renamed from: c */
    public static final int f169407c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C39357a(InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m125514a() {
        this.navigator.mo59393b(new AbstractC21155m0.m1(new ApiRequest("language-service/v1/language-beta/optout", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null));
    }
}
