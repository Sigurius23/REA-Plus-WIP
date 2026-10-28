package io.getstream.chat.android.client.api2.model.dto;

import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/SearchWarningDto;", "", "channel_search_cids", "", "", "channel_search_count", "", "warning_code", "warning_description", "<init>", "(Ljava/util/List;IILjava/lang/String;)V", "getChannel_search_cids", "()Ljava/util/List;", "getChannel_search_count", "()I", "getWarning_code", "getWarning_description", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchWarningDto {
    private final List<String> channel_search_cids;
    private final int channel_search_count;
    private final int warning_code;
    private final String warning_description;

    public SearchWarningDto(List<String> channel_search_cids, int i13, int i14, String warning_description) {
        AbstractC22676k.m65750j(channel_search_cids, "channel_search_cids");
        AbstractC22676k.m65750j(warning_description, "warning_description");
        this.channel_search_cids = channel_search_cids;
        this.channel_search_count = i13;
        this.warning_code = i14;
        this.warning_description = warning_description;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchWarningDto copy$default(SearchWarningDto searchWarningDto, List list, int i13, int i14, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = searchWarningDto.channel_search_cids;
        }
        if ((i15 & 2) != 0) {
            i13 = searchWarningDto.channel_search_count;
        }
        if ((i15 & 4) != 0) {
            i14 = searchWarningDto.warning_code;
        }
        if ((i15 & 8) != 0) {
            str = searchWarningDto.warning_description;
        }
        return searchWarningDto.copy(list, i13, i14, str);
    }

    public final List<String> component1() {
        return this.channel_search_cids;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChannel_search_count() {
        return this.channel_search_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWarning_code() {
        return this.warning_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWarning_description() {
        return this.warning_description;
    }

    public final SearchWarningDto copy(List<String> channel_search_cids, int channel_search_count, int warning_code, String warning_description) {
        AbstractC22676k.m65750j(channel_search_cids, "channel_search_cids");
        AbstractC22676k.m65750j(warning_description, "warning_description");
        return new SearchWarningDto(channel_search_cids, channel_search_count, warning_code, warning_description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchWarningDto)) {
            return false;
        }
        SearchWarningDto searchWarningDto = (SearchWarningDto) other;
        return AbstractC22676k.m65745e(this.channel_search_cids, searchWarningDto.channel_search_cids) && this.channel_search_count == searchWarningDto.channel_search_count && this.warning_code == searchWarningDto.warning_code && AbstractC22676k.m65745e(this.warning_description, searchWarningDto.warning_description);
    }

    public final List<String> getChannel_search_cids() {
        return this.channel_search_cids;
    }

    public final int getChannel_search_count() {
        return this.channel_search_count;
    }

    public final int getWarning_code() {
        return this.warning_code;
    }

    public final String getWarning_description() {
        return this.warning_description;
    }

    public int hashCode() {
        return this.warning_description.hashCode() + AbstractC11266d.m30448b(this.warning_code, AbstractC11266d.m30448b(this.channel_search_count, this.channel_search_cids.hashCode() * 31, 31), 31);
    }

    public String toString() {
        List<String> list = this.channel_search_cids;
        int i13 = this.channel_search_count;
        int i14 = this.warning_code;
        String str = this.warning_description;
        StringBuilder sb4 = new StringBuilder("SearchWarningDto(channel_search_cids=");
        sb4.append(list);
        sb4.append(", channel_search_count=");
        sb4.append(i13);
        sb4.append(", warning_code=");
        return AbstractC38963t7.m124376f(i14, ", warning_description=", str, ")", sb4);
    }
}
