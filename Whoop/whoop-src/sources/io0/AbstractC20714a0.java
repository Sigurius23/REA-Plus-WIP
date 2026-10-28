package io0;

import ad3.AbstractC0757c;
import ad3.C0764g;
import ad3.C0775r;
import com.whoop.clinicianintheloop.api.MultiSelectScreen;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectInput;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectResponseBody;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeScreen;
import go0.InterfaceC16013c;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io0.a0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "screens", "", "", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;", "intakeResponsesByScreenId", "b", "(Ljava/util/List;Ljava/util/Map;)Ljava/lang/String;", HMSTrackSource.SCREEN, "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;", "d", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Ljava/util/Map;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectInput;", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20714a0 {
    /* JADX INFO: renamed from: b */
    public static final String m56906b(List<VideoSchedulingIntakeScreen> screens, Map<String, VideoSchedulingIntakeMultiSelectResponseBody> intakeResponsesByScreenId) {
        AbstractC22676k.m65750j(screens, "screens");
        AbstractC22676k.m65750j(intakeResponsesByScreenId, "intakeResponsesByScreenId");
        C0775r c0775rM107878b = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C19616a(29));
        ArrayListSerializer arrayListSerializerM122333a = AbstractC38195a.m122333a(VideoSchedulingIntakeMultiSelectInput.INSTANCE.serializer());
        ArrayList arrayList = new ArrayList();
        for (VideoSchedulingIntakeScreen videoSchedulingIntakeScreen : screens) {
            VideoSchedulingIntakeMultiSelectInput videoSchedulingIntakeMultiSelectInputM56908d = videoSchedulingIntakeScreen.getContent() instanceof MultiSelectScreen ? m56908d(videoSchedulingIntakeScreen, intakeResponsesByScreenId) : null;
            if (videoSchedulingIntakeMultiSelectInputM56908d != null) {
                arrayList.add(videoSchedulingIntakeMultiSelectInputM56908d);
            }
        }
        return c0775rM107878b.m1833d(arrayListSerializerM122333a, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m56907c(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2774a = false;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final VideoSchedulingIntakeMultiSelectInput m56908d(VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, Map<String, VideoSchedulingIntakeMultiSelectResponseBody> map) {
        String text;
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        if (!(content instanceof MultiSelectScreen)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody = map.get(videoSchedulingIntakeScreen.getId());
        String text2 = null;
        if (videoSchedulingIntakeMultiSelectResponseBody == null) {
            videoSchedulingIntakeMultiSelectResponseBody = new VideoSchedulingIntakeMultiSelectResponseBody(C25271y.f99162w, null);
        }
        if (((MultiSelectScreen) content).getTextInput() != null && (text = videoSchedulingIntakeMultiSelectResponseBody.getText()) != null && (!AbstractC39414r.m125890i0(text))) {
            text2 = videoSchedulingIntakeMultiSelectResponseBody.getText();
        }
        return new VideoSchedulingIntakeMultiSelectInput(videoSchedulingIntakeScreen.getId(), new VideoSchedulingIntakeMultiSelectResponseBody(videoSchedulingIntakeMultiSelectResponseBody.getSelectedOptionIds(), text2));
    }
}
