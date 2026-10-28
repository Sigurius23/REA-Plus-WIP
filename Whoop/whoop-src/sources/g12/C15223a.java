package g12;

import android.content.Context;
import android.content.Intent;
import com.whoop.domain.model.WhoopUri;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.api.QueryParams;
import or2.C28175k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g12.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lg12/a;", "", "Landroid/content/Context;", "context", "Lor2/k0;", "intentProvider", "Lg12/b;", "callbackBus", "<init>", "(Landroid/content/Context;Lor2/k0;Lg12/b;)V", "Lcom/whoop/domain/model/WhoopUri;", QueryParams.URL, "Ll83/a0;", "b", "(Lcom/whoop/domain/model/WhoopUri;)V", "a", "Landroid/content/Context;", "Lor2/k0;", "c", "Lg12/b;", "Lec3/t1;", "", "d", "Lec3/t1;", "()Lec3/t1;", "urlOpens", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15223a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28175k0 intentProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15224b callbackBus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13087t1 urlOpens;

    public C15223a(Context context, C28175k0 intentProvider, C15224b callbackBus) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intentProvider, "intentProvider");
        AbstractC22676k.m65750j(callbackBus, "callbackBus");
        this.context = context;
        this.intentProvider = intentProvider;
        this.callbackBus = callbackBus;
        this.urlOpens = callbackBus.getCallbacks();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC13087t1 getUrlOpens() {
        return this.urlOpens;
    }

    /* JADX INFO: renamed from: b */
    public void m43287b(WhoopUri url) {
        AbstractC22676k.m65750j(url, "url");
        Intent intentM85288a = this.intentProvider.m85288a("android.intent.action.VIEW", url);
        intentM85288a.addFlags(268435456);
        this.context.startActivity(intentM85288a);
    }
}
