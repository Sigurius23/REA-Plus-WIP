package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamUserBlockDto;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryBlockedUsersResponse;", "", "blocks", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserBlockDto;", "<init>", "(Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryBlockedUsersResponse {
    private final List<DownstreamUserBlockDto> blocks;

    public QueryBlockedUsersResponse(List<DownstreamUserBlockDto> blocks) {
        AbstractC22676k.m65750j(blocks, "blocks");
        this.blocks = blocks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryBlockedUsersResponse copy$default(QueryBlockedUsersResponse queryBlockedUsersResponse, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryBlockedUsersResponse.blocks;
        }
        return queryBlockedUsersResponse.copy(list);
    }

    public final List<DownstreamUserBlockDto> component1() {
        return this.blocks;
    }

    public final QueryBlockedUsersResponse copy(List<DownstreamUserBlockDto> blocks) {
        AbstractC22676k.m65750j(blocks, "blocks");
        return new QueryBlockedUsersResponse(blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QueryBlockedUsersResponse) && AbstractC22676k.m65745e(this.blocks, ((QueryBlockedUsersResponse) other).blocks);
    }

    public final List<DownstreamUserBlockDto> getBlocks() {
        return this.blocks;
    }

    public int hashCode() {
        return this.blocks.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("QueryBlockedUsersResponse(blocks=", ")", this.blocks);
    }
}
