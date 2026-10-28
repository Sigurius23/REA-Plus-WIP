package io.getstream.chat.android.models;

import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/models/SearchWarning;", "", "channelSearchCids", "", "", "channelSearchCount", "", "warningCode", "warningDescription", "<init>", "(Ljava/util/List;IILjava/lang/String;)V", "getChannelSearchCids", "()Ljava/util/List;", "getChannelSearchCount", "()I", "getWarningCode", "getWarningDescription", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchWarning {
    private final List<String> channelSearchCids;
    private final int channelSearchCount;
    private final int warningCode;
    private final String warningDescription;

    public SearchWarning(List<String> channelSearchCids, int i13, int i14, String warningDescription) {
        AbstractC22676k.m65750j(channelSearchCids, "channelSearchCids");
        AbstractC22676k.m65750j(warningDescription, "warningDescription");
        this.channelSearchCids = channelSearchCids;
        this.channelSearchCount = i13;
        this.warningCode = i14;
        this.warningDescription = warningDescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchWarning copy$default(SearchWarning searchWarning, List list, int i13, int i14, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = searchWarning.channelSearchCids;
        }
        if ((i15 & 2) != 0) {
            i13 = searchWarning.channelSearchCount;
        }
        if ((i15 & 4) != 0) {
            i14 = searchWarning.warningCode;
        }
        if ((i15 & 8) != 0) {
            str = searchWarning.warningDescription;
        }
        return searchWarning.copy(list, i13, i14, str);
    }

    public final List<String> component1() {
        return this.channelSearchCids;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChannelSearchCount() {
        return this.channelSearchCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWarningCode() {
        return this.warningCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWarningDescription() {
        return this.warningDescription;
    }

    public final SearchWarning copy(List<String> channelSearchCids, int channelSearchCount, int warningCode, String warningDescription) {
        AbstractC22676k.m65750j(channelSearchCids, "channelSearchCids");
        AbstractC22676k.m65750j(warningDescription, "warningDescription");
        return new SearchWarning(channelSearchCids, channelSearchCount, warningCode, warningDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchWarning)) {
            return false;
        }
        SearchWarning searchWarning = (SearchWarning) other;
        return AbstractC22676k.m65745e(this.channelSearchCids, searchWarning.channelSearchCids) && this.channelSearchCount == searchWarning.channelSearchCount && this.warningCode == searchWarning.warningCode && AbstractC22676k.m65745e(this.warningDescription, searchWarning.warningDescription);
    }

    public final List<String> getChannelSearchCids() {
        return this.channelSearchCids;
    }

    public final int getChannelSearchCount() {
        return this.channelSearchCount;
    }

    public final int getWarningCode() {
        return this.warningCode;
    }

    public final String getWarningDescription() {
        return this.warningDescription;
    }

    public int hashCode() {
        return this.warningDescription.hashCode() + AbstractC11266d.m30448b(this.warningCode, AbstractC11266d.m30448b(this.channelSearchCount, this.channelSearchCids.hashCode() * 31, 31), 31);
    }

    public String toString() {
        List<String> list = this.channelSearchCids;
        int i13 = this.channelSearchCount;
        int i14 = this.warningCode;
        String str = this.warningDescription;
        StringBuilder sb4 = new StringBuilder("SearchWarning(channelSearchCids=");
        sb4.append(list);
        sb4.append(", channelSearchCount=");
        sb4.append(i13);
        sb4.append(", warningCode=");
        return AbstractC38963t7.m124376f(i14, ", warningDescription=", str, ")", sb4);
    }
}
