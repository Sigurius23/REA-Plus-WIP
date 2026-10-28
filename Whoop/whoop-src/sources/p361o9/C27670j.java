package p361o9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Map;
import java.util.Objects;
import p299l9.C23501g1;
import p516u8.C34619t0;
import p607x8.AbstractC38065t;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: o9.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C27670j extends C34619t0 {

    /* JADX INFO: renamed from: D */
    public static final C27670j f111376D = new C27670j(new C27669i());

    /* JADX INFO: renamed from: A */
    public final boolean f111377A;

    /* JADX INFO: renamed from: B */
    public final SparseArray f111378B;

    /* JADX INFO: renamed from: C */
    public final SparseBooleanArray f111379C;

    /* JADX INFO: renamed from: u */
    public final boolean f111380u;

    /* JADX INFO: renamed from: v */
    public final boolean f111381v;

    /* JADX INFO: renamed from: w */
    public final boolean f111382w;

    /* JADX INFO: renamed from: x */
    public final boolean f111383x;

    /* JADX INFO: renamed from: y */
    public final boolean f111384y;

    /* JADX INFO: renamed from: z */
    public final boolean f111385z;

    static {
        AbstractC33745d.m106663v(1000, 1001, 1002, 1003, MessageListItemViewType.CUSTOM_ATTACHMENTS);
        AbstractC33745d.m106663v(MessageListItemViewType.LOADING_INDICATOR, MessageListItemViewType.THREAD_SEPARATOR, MessageListItemViewType.TYPING_INDICATOR, MessageListItemViewType.GIPHY, MessageListItemViewType.SYSTEM_MESSAGE);
        AbstractC33745d.m106663v(MessageListItemViewType.ERROR_MESSAGE, MessageListItemViewType.THREAD_PLACEHOLDER, MessageListItemViewType.GIPHY_ATTACHMENT, MessageListItemViewType.MEDIA_ATTACHMENT, MessageListItemViewType.FILE_ATTACHMENTS);
        AbstractC38065t.m121892F(MessageListItemViewType.LINK_ATTACHMENTS);
        AbstractC38065t.m121892F(MessageListItemViewType.UNREAD_SEPARATOR);
        AbstractC38065t.m121892F(MessageListItemViewType.START_OF_THE_CHANNEL);
        AbstractC38065t.m121892F(MessageListItemViewType.POLL);
    }

    public C27670j(C27669i c27669i) {
        super(c27669i);
        this.f111380u = c27669i.f111370u;
        this.f111381v = c27669i.f111371v;
        this.f111382w = c27669i.f111372w;
        this.f111383x = c27669i.f111373x;
        this.f111384y = c27669i.f111374y;
        this.f111385z = c27669i.f111375z;
        this.f111377A = c27669i.f111367A;
        this.f111378B = c27669i.f111368B;
        this.f111379C = c27669i.f111369C;
    }

    @Override // p516u8.C34619t0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C27670j.class == obj.getClass()) {
            C27670j c27670j = (C27670j) obj;
            if (super.equals(c27670j) && this.f111380u == c27670j.f111380u && this.f111381v == c27670j.f111381v && this.f111382w == c27670j.f111382w && this.f111383x == c27670j.f111383x && this.f111384y == c27670j.f111384y && this.f111385z == c27670j.f111385z && this.f111377A == c27670j.f111377A) {
                SparseBooleanArray sparseBooleanArray = c27670j.f111379C;
                SparseBooleanArray sparseBooleanArray2 = this.f111379C;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i13 = 0; i13 < size; i13++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i13)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c27670j.f111378B;
                    SparseArray sparseArray2 = this.f111378B;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i14 = 0; i14 < size2; i14++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i14));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i14);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C23501g1 c23501g1 = (C23501g1) entry.getKey();
                                        if (!map2.containsKey(c23501g1) || !Objects.equals(entry.getValue(), map2.get(c23501g1))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p516u8.C34619t0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f111380u ? 1 : 0)) * 961) + (this.f111381v ? 1 : 0)) * 961) + (this.f111382w ? 1 : 0)) * 28629151) + (this.f111383x ? 1 : 0)) * 31) + (this.f111384y ? 1 : 0)) * 31) + (this.f111385z ? 1 : 0)) * 961) + (this.f111377A ? 1 : 0)) * 31;
    }
}
