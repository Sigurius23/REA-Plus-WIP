package g00;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import p408q.C29660d;

/* JADX INFO: renamed from: g00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14935f extends C29660d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f55701g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f55702h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Configuration f55703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14935f(Context context, boolean z4, Configuration configuration, Resources.Theme theme) {
        super(context, theme);
        this.f55701g = context;
        this.f55702h = z4;
        this.f55703i = configuration;
    }

    @Override // p408q.C29660d, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (!this.f55702h) {
            return super.getResources();
        }
        Resources resources = this.f55701g.getResources();
        return new Resources(resources.getAssets(), resources.getDisplayMetrics(), this.f55703i);
    }
}
