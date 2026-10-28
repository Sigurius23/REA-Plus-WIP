package p503tp;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4970a;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import np.C27004i;

/* JADX INFO: renamed from: tp.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C34027b0 extends AbstractC4970a {
    @Override // com.google.android.gms.common.api.AbstractC4970a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC4973d mo15595a(Context context, Looper looper, C5099k0 c5099k0, Object obj, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        return new C27004i(context, looper, interfaceC4978i, interfaceC4979j, "locationServices", c5099k0);
    }
}
