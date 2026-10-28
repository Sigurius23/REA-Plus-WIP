package live.hms.video.sdk;

import live.hms.video.sdk.models.FindPeerResponse;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/sdk/FindPeerListener;", "Llive/hms/video/sdk/IErrorListener;", "Llive/hms/video/sdk/models/FindPeerResponse;", "result", "Ll83/a0;", "onResult", "(Llive/hms/video/sdk/models/FindPeerResponse;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface FindPeerListener extends IErrorListener {
    void onResult(FindPeerResponse result);
}
