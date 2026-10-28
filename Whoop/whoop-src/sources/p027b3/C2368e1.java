package p027b3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: b3.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2368e1 implements InterfaceC2355b3 {

    /* JADX INFO: renamed from: a */
    public final Context f9349a;

    public C2368e1(Context context) {
        this.f9349a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m7301a(String str) {
        try {
            this.f9349a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e5) {
            throw new IllegalArgumentException(AbstractC31061c.m95633i('.', "Can't open ", str), e5);
        }
    }
}
