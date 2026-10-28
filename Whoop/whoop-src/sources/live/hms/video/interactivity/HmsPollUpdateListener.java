package live.hms.video.interactivity;

import live.hms.video.polls.models.HMSPollUpdateType;
import live.hms.video.polls.models.HmsPoll;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/interactivity/HmsPollUpdateListener;", "", "Llive/hms/video/polls/models/HmsPoll;", "hmsPoll", "Llive/hms/video/polls/models/HMSPollUpdateType;", "hmsPollUpdateType", "Ll83/a0;", "onPollUpdate", "(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/polls/models/HMSPollUpdateType;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HmsPollUpdateListener {
    void onPollUpdate(HmsPoll hmsPoll, HMSPollUpdateType hmsPollUpdateType);
}
