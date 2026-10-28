package l82;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import v11.C35544b;
import v11.C35552j;

/* JADX INFO: renamed from: l82.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "Lm91/o;", "wrappers", "", "followerRequestId", "b", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lv11/j;", "c", "(Lv11/j;)Lv11/j;", "search-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23452b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final List<C25306o> m68033b(List<C25306o> list, String str) {
        List<C25306o> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C25306o c25306oM74314b : list2) {
            InterfaceC25312u state = c25306oM74314b.getState();
            if (state instanceof C35552j) {
                C35552j c35552j = (C35552j) state;
                if (AbstractC22676k.m65745e(c35552j.getId(), str)) {
                    c25306oM74314b = C25306o.m74314b(c25306oM74314b, m68034c(c35552j), null, 2, null);
                }
            }
            arrayList.add(c25306oM74314b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static final C35552j m68034c(C35552j c35552j) {
        C35544b startButton = c35552j.getStartButton();
        C35544b c35544bM112692b = startButton != null ? C35544b.m112692b(startButton, null, null, null, null, false, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null) : null;
        C35544b endButton = c35552j.getEndButton();
        return C35552j.m112746b(c35552j, null, null, null, null, null, c35544bM112692b, endButton != null ? C35544b.m112692b(endButton, null, null, null, null, false, null, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null) : null, null, 159, null);
    }
}
