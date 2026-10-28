package p320m5;

import android.os.Bundle;
import org.json.JSONObject;
import p108e4.AbstractC12667a;

/* JADX INFO: renamed from: m5.m */
/* JADX INFO: loaded from: classes5.dex */
public class C25069m extends AbstractC12667a {
    public C25069m(String str, int i13, Bundle bundle) {
        switch (i13) {
            case 1:
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
            default:
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("type should not be empty");
                }
                return;
        }
    }
}
