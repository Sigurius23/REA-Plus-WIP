package live.hms.video.sdk.managers;

import java.util.Iterator;
import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.transcripts.HmsTranscript;
import live.hms.video.sdk.transcripts.HmsTranscripts;
import live.hms.video.utils.GsonUtils;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnTranscriptionManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;", "Llive/hms/video/sdk/SDKStore;", "store", "Lkotlin/Function1;", "Llive/hms/video/sdk/transcripts/HmsTranscripts;", "Ll83/a0;", "onTranscript", "<init>", "(Llive/hms/video/sdk/SDKStore;Lkotlin/jvm/functions/Function1;)V", "params", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;)Ljava/util/List;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Lkotlin/jvm/functions/Function1;", "getOnTranscript", "()Lkotlin/jvm/functions/Function1;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnTranscriptionManager implements IManager<HMSNotifications.OnBroadcast> {
    private final Function1 onTranscript;
    private final SDKStore store;

    public OnTranscriptionManager(SDKStore store, Function1 onTranscript) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(onTranscript, "onTranscript");
        this.store = store;
        this.onTranscript = onTranscript;
    }

    public final Function1 getOnTranscript() {
        return this.onTranscript;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.OnBroadcast params) {
        AbstractC22676k.m65750j(params, "params");
        HmsTranscripts hmsTranscripts = (HmsTranscripts) GsonUtils.INSTANCE.getGson().fromJson(params.getInfo().getMessage(), HmsTranscripts.class);
        Iterator<T> it = hmsTranscripts.getTranscripts().iterator();
        while (it.hasNext()) {
            ((HmsTranscript) it.next()).setStore$lib_release(getStore());
        }
        this.onTranscript.invoke(hmsTranscripts);
        return C25271y.f99162w;
    }
}
