package fs2;

import live.hms.video.error.HMSException;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: fs2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/error/HMSException;", "", "b", "(Llive/hms/video/error/HMSException;)Ljava/lang/String;", "summary", "video-call_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14754g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m42312b(HMSException hMSException) {
        return hMSException.getName() + " (" + hMSException.getCode() + ")";
    }
}
