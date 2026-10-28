package yl2;

import android.net.Uri;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.squareup.wire.AbstractC5583n;
import p114eb.C12969k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yl2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lyl2/a;", "", "<init>", "()V", "Landroidx/fragment/app/m0;", "fragment", "", "education", "trendName", "Ll83/a0;", "a", "(Landroidx/fragment/app/m0;Ljava/lang/String;Ljava/lang/String;)V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39634a {

    /* JADX INFO: renamed from: a */
    public static final C39634a f170518a = new C39634a();

    private C39634a() {
    }

    /* JADX INFO: renamed from: a */
    public final void m126697a(AbstractComponentCallbacksC1320m0 fragment, String education, String trendName) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(education, "education");
        AbstractC22676k.m65750j(trendName, "trendName");
        Uri uri = Uri.parse("android-app://com.whoop/education?path=" + education + "&entryPoint=" + trendName);
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC5583n.m16799z(fragment).m36404s(new C12969k0(uri, null, null));
    }
}
