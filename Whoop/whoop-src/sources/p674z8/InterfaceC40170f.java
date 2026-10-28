package p674z8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import p516u8.InterfaceC34594h;

/* JADX INFO: renamed from: z8.f */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC40170f extends InterfaceC34594h {
    void addTransferListener(InterfaceC40178n interfaceC40178n);

    void close();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(C40171g c40171g);
}
