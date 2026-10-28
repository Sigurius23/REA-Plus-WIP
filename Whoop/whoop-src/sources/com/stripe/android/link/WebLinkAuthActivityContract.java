package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import p029b5.AbstractC2724c;
import p267k.AbstractC22081b;
import p599wz.C37758t1;
import p599wz.C37761u1;
import p599wz.C37764v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/link/WebLinkAuthActivityContract;", "Lk/b;", "", "Lwz/w1;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class WebLinkAuthActivityContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public static final WebLinkAuthActivityContract f22207a = new WebLinkAuthActivityContract();

    private WebLinkAuthActivityContract() {
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        String input = (String) obj;
        AbstractC22676k.m65750j(input, "input");
        int i13 = LinkForegroundActivity.f22201x;
        Intent intentPutExtra = new Intent(context, (Class<?>) LinkForegroundActivity.class).putExtra("LinkPopupUrl", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Uri data;
        String queryParameter;
        Bundle extras;
        if (i13 != 0) {
            if (i13 != 49871) {
                if (i13 == 91367) {
                    Exception exc = null;
                    Serializable serializableM7691c = null;
                    exc = null;
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            serializableM7691c = AbstractC2724c.m7691c(extras);
                        } else {
                            Serializable serializable = extras.getSerializable("LinkFailure");
                            if (Exception.class.isInstance(serializable)) {
                                serializableM7691c = serializable;
                            }
                        }
                        exc = (Exception) serializableM7691c;
                    }
                    if (exc != null) {
                        return new C37764v1(exc);
                    }
                }
            } else if (intent != null && (data = intent.getData()) != null && (queryParameter = data.getQueryParameter("link_status")) != null && queryParameter.hashCode() == -599445191 && queryParameter.equals("complete")) {
                return C37761u1.f161739a;
            }
        }
        return C37758t1.f161733a;
    }
}
