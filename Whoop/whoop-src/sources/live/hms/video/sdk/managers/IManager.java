package live.hms.video.sdk.managers;

import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.SDKUpdate;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m65681d2 = {"Llive/hms/video/sdk/managers/IManager;", "NotificationParamsType", "", "store", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "(Ljava/lang/Object;)Ljava/util/List;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface IManager<NotificationParamsType> {
    SDKStore getStore();

    List<SDKUpdate> manage(NotificationParamsType params);
}
