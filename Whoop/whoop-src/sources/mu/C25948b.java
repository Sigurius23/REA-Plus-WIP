package mu;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import og3.AbstractC27931j;
import og3.C27925d;

/* JADX INFO: renamed from: mu.b */
/* JADX INFO: loaded from: classes.dex */
public final class C25948b extends AbstractC27931j {

    /* JADX INFO: renamed from: c */
    public final Context f102490c;

    public C25948b(Context context) {
        this.f102490c = context;
    }

    @Override // og3.AbstractC27931j
    /* JADX INFO: renamed from: a */
    public final void mo76789a() {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.f102490c.getAssets().open("org/threeten/bp/TZDB.dat");
                C27925d c27925d = new C27925d(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                C27925d.m84273c(c27925d);
            } catch (IOException e5) {
                throw new IllegalStateException("org/threeten/bp/TZDB.dat missing from assets", e5);
            }
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th3;
        }
    }
}
