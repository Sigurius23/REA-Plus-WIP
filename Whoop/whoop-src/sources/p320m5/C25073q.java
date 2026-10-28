package p320m5;

import android.os.Bundle;
import p108e4.AbstractC12667a;

/* JADX INFO: renamed from: m5.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C25073q extends AbstractC12667a {

    /* JADX INFO: renamed from: f */
    public final String f98207f;

    public C25073q(Bundle bundle, String str) {
        this.f98207f = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    /* JADX INFO: renamed from: U */
    public final String m73539U() {
        return this.f98207f;
    }
}
