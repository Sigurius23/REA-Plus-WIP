package live.hms.video.connection.publish;

import l83.C23454a0;
import live.hms.video.connection.IConnectionObserver;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/connection/publish/IPublishConnectionObserver;", "Llive/hms/video/connection/IConnectionObserver;", "Ll83/a0;", "onRenegotiationNeeded", "(Lq83/d;)Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface IPublishConnectionObserver extends IConnectionObserver {
    Object onRenegotiationNeeded(InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
