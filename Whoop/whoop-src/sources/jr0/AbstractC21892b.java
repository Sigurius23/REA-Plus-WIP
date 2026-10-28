package jr0;

import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FollowerRequestModel;
import gr0.AbstractC16090e;
import gr0.EnumC16091f;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import v11.C35544b;
import v11.C35552j;

/* JADX INFO: renamed from: jr0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/DesignSystemModel;", "model", "", "", "Lgr0/f;", "stages", "d", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;", "", "Lm91/o;", "wrappers", "followerRequestId", "c", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lv11/j;", "e", "(Lv11/j;)Lv11/j;", "community-follower-lookup-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21892b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final List<C25306o> m62154c(List<C25306o> list, String str) {
        List<C25306o> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C25306o c25306oM74314b : list2) {
            InterfaceC25312u state = c25306oM74314b.getState();
            if (state instanceof C35552j) {
                C35552j c35552j = (C35552j) state;
                if (AbstractC22676k.m65745e(c35552j.getId(), str)) {
                    c25306oM74314b = C25306o.m74314b(c25306oM74314b, m62156e(c35552j), null, 2, null);
                }
            }
            arrayList.add(c25306oM74314b);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final DesignSystemModel m62155d(DesignSystemModel designSystemModel, Map<String, ? extends EnumC16091f> map) {
        DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap(designSystemModel);
        FollowerRequestModel followerRequestModel = designSystemModelUnwrap instanceof FollowerRequestModel ? (FollowerRequestModel) designSystemModelUnwrap : null;
        if (followerRequestModel == null) {
            return designSystemModel;
        }
        FollowerRequestModel followerRequestModelM45492e = AbstractC16090e.m45492e(followerRequestModel, map.get(followerRequestModel.getId()));
        return designSystemModel instanceof DesignModelWrapper ? DesignModelWrapper.copy$default((DesignModelWrapper) designSystemModel, followerRequestModelM45492e, null, null, null, null, 30, null) : followerRequestModelM45492e;
    }

    /* JADX INFO: renamed from: e */
    private static final C35552j m62156e(C35552j c35552j) {
        C35544b startButton = c35552j.getStartButton();
        C35544b c35544bM112692b = startButton != null ? C35544b.m112692b(startButton, null, null, null, null, false, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null) : null;
        C35544b endButton = c35552j.getEndButton();
        return C35552j.m112746b(c35552j, null, null, null, null, null, c35544bM112692b, endButton != null ? C35544b.m112692b(endButton, null, null, null, null, false, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null) : null, null, 159, null);
    }
}
