package live.hms.video.transport;

import live.hms.video.error.HMSException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/transport/ITransportListener;", "", "Ll83/a0;", "onSignalConnected", "()V", "onICEConnected", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ITransportListener {
    void onError(HMSException error);

    void onICEConnected();

    void onSignalConnected();
}
