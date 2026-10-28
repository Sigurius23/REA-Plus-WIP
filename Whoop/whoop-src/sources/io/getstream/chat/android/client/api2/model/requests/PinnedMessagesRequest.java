package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 72\u00020\u0001:\u00017B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u001b\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J§\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 ¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;", "", MapboxMap.QFE_LIMIT, "", "sort", "", "", "", "id_around", "id_gt", "id_gte", "id_lt", "id_lte", "pinned_at_around", "Ljava/util/Date;", "pinned_at_after", "pinned_at_after_or_equal", "pinned_at_before", "pinned_at_before_or_equal", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getLimit", "()I", "getSort", "()Ljava/util/List;", "getId_around", "()Ljava/lang/String;", "getId_gt", "getId_gte", "getId_lt", "getId_lte", "getPinned_at_around", "()Ljava/util/Date;", "getPinned_at_after", "getPinned_at_after_or_equal", "getPinned_at_before", "getPinned_at_before_or_equal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PinnedMessagesRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id_around;
    private final String id_gt;
    private final String id_gte;
    private final String id_lt;
    private final String id_lte;
    private final int limit;
    private final Date pinned_at_after;
    private final Date pinned_at_after_or_equal;
    private final Date pinned_at_around;
    private final Date pinned_at_before;
    private final Date pinned_at_before_or_equal;
    private final List<Map<String, Object>> sort;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;", "", "<init>", "()V", "create", "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;", MapboxMap.QFE_LIMIT, "", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "pagination", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PinnedMessagesRequest create(int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
            AbstractC22676k.m65750j(sort, "sort");
            AbstractC22676k.m65750j(pagination, "pagination");
            if (pagination instanceof PinnedMessagesPagination.AroundDate) {
                return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, null, null, ((PinnedMessagesPagination.AroundDate) pagination).getDate(), null, null, null, null, 3964, null);
            }
            if (pagination instanceof PinnedMessagesPagination.BeforeDate) {
                PinnedMessagesPagination.BeforeDate beforeDate = (PinnedMessagesPagination.BeforeDate) pagination;
                if (beforeDate.getInclusive()) {
                    return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, null, null, null, null, null, null, beforeDate.getDate(), 2044, null);
                }
                return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, null, null, null, null, null, beforeDate.getDate(), null, 3068, null);
            }
            if (pagination instanceof PinnedMessagesPagination.AfterDate) {
                PinnedMessagesPagination.AfterDate afterDate = (PinnedMessagesPagination.AfterDate) pagination;
                if (afterDate.getInclusive()) {
                    return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, null, null, null, null, afterDate.getDate(), null, null, 3580, null);
                }
                return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, null, null, null, afterDate.getDate(), null, null, null, 3836, null);
            }
            if (pagination instanceof PinnedMessagesPagination.AroundMessage) {
                return new PinnedMessagesRequest(limit, sort.toDto(), ((PinnedMessagesPagination.AroundMessage) pagination).getMessageId(), null, null, null, null, null, null, null, null, null, 4088, null);
            }
            if (pagination instanceof PinnedMessagesPagination.BeforeMessage) {
                PinnedMessagesPagination.BeforeMessage beforeMessage = (PinnedMessagesPagination.BeforeMessage) pagination;
                if (beforeMessage.getInclusive()) {
                    return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, null, beforeMessage.getMessageId(), null, null, null, null, null, 4028, null);
                }
                return new PinnedMessagesRequest(limit, sort.toDto(), null, null, null, beforeMessage.getMessageId(), null, null, null, null, null, null, 4060, null);
            }
            if (!(pagination instanceof PinnedMessagesPagination.AfterMessage)) {
                throw new NoWhenBranchMatchedException();
            }
            PinnedMessagesPagination.AfterMessage afterMessage = (PinnedMessagesPagination.AfterMessage) pagination;
            if (afterMessage.getInclusive()) {
                return new PinnedMessagesRequest(limit, sort.toDto(), null, null, afterMessage.getMessageId(), null, null, null, null, null, null, null, 4076, null);
            }
            return new PinnedMessagesRequest(limit, sort.toDto(), null, afterMessage.getMessageId(), null, null, null, null, null, null, null, null, 4084, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PinnedMessagesRequest(int i13, List<? extends Map<String, ? extends Object>> sort, String str, String str2, String str3, String str4, String str5, Date date, Date date2, Date date3, Date date4, Date date5) {
        AbstractC22676k.m65750j(sort, "sort");
        this.limit = i13;
        this.sort = sort;
        this.id_around = str;
        this.id_gt = str2;
        this.id_gte = str3;
        this.id_lt = str4;
        this.id_lte = str5;
        this.pinned_at_around = date;
        this.pinned_at_after = date2;
        this.pinned_at_after_or_equal = date3;
        this.pinned_at_before = date4;
        this.pinned_at_before_or_equal = date5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PinnedMessagesRequest copy$default(PinnedMessagesRequest pinnedMessagesRequest, int i13, List list, String str, String str2, String str3, String str4, String str5, Date date, Date date2, Date date3, Date date4, Date date5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = pinnedMessagesRequest.limit;
        }
        if ((i14 & 2) != 0) {
            list = pinnedMessagesRequest.sort;
        }
        if ((i14 & 4) != 0) {
            str = pinnedMessagesRequest.id_around;
        }
        if ((i14 & 8) != 0) {
            str2 = pinnedMessagesRequest.id_gt;
        }
        if ((i14 & 16) != 0) {
            str3 = pinnedMessagesRequest.id_gte;
        }
        if ((i14 & 32) != 0) {
            str4 = pinnedMessagesRequest.id_lt;
        }
        if ((i14 & 64) != 0) {
            str5 = pinnedMessagesRequest.id_lte;
        }
        if ((i14 & 128) != 0) {
            date = pinnedMessagesRequest.pinned_at_around;
        }
        if ((i14 & 256) != 0) {
            date2 = pinnedMessagesRequest.pinned_at_after;
        }
        if ((i14 & 512) != 0) {
            date3 = pinnedMessagesRequest.pinned_at_after_or_equal;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            date4 = pinnedMessagesRequest.pinned_at_before;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            date5 = pinnedMessagesRequest.pinned_at_before_or_equal;
        }
        Date date6 = date4;
        Date date7 = date5;
        Date date8 = date2;
        Date date9 = date3;
        String str6 = str5;
        Date date10 = date;
        String str7 = str3;
        String str8 = str4;
        return pinnedMessagesRequest.copy(i13, list, str, str2, str7, str8, str6, date10, date8, date9, date6, date7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getPinned_at_after_or_equal() {
        return this.pinned_at_after_or_equal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getPinned_at_before() {
        return this.pinned_at_before;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getPinned_at_before_or_equal() {
        return this.pinned_at_before_or_equal;
    }

    public final List<Map<String, Object>> component2() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId_around() {
        return this.id_around;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId_gt() {
        return this.id_gt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId_gte() {
        return this.id_gte;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId_lt() {
        return this.id_lt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getId_lte() {
        return this.id_lte;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getPinned_at_around() {
        return this.pinned_at_around;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getPinned_at_after() {
        return this.pinned_at_after;
    }

    public final PinnedMessagesRequest copy(int limit, List<? extends Map<String, ? extends Object>> sort, String id_around, String id_gt, String id_gte, String id_lt, String id_lte, Date pinned_at_around, Date pinned_at_after, Date pinned_at_after_or_equal, Date pinned_at_before, Date pinned_at_before_or_equal) {
        AbstractC22676k.m65750j(sort, "sort");
        return new PinnedMessagesRequest(limit, sort, id_around, id_gt, id_gte, id_lt, id_lte, pinned_at_around, pinned_at_after, pinned_at_after_or_equal, pinned_at_before, pinned_at_before_or_equal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedMessagesRequest)) {
            return false;
        }
        PinnedMessagesRequest pinnedMessagesRequest = (PinnedMessagesRequest) other;
        return this.limit == pinnedMessagesRequest.limit && AbstractC22676k.m65745e(this.sort, pinnedMessagesRequest.sort) && AbstractC22676k.m65745e(this.id_around, pinnedMessagesRequest.id_around) && AbstractC22676k.m65745e(this.id_gt, pinnedMessagesRequest.id_gt) && AbstractC22676k.m65745e(this.id_gte, pinnedMessagesRequest.id_gte) && AbstractC22676k.m65745e(this.id_lt, pinnedMessagesRequest.id_lt) && AbstractC22676k.m65745e(this.id_lte, pinnedMessagesRequest.id_lte) && AbstractC22676k.m65745e(this.pinned_at_around, pinnedMessagesRequest.pinned_at_around) && AbstractC22676k.m65745e(this.pinned_at_after, pinnedMessagesRequest.pinned_at_after) && AbstractC22676k.m65745e(this.pinned_at_after_or_equal, pinnedMessagesRequest.pinned_at_after_or_equal) && AbstractC22676k.m65745e(this.pinned_at_before, pinnedMessagesRequest.pinned_at_before) && AbstractC22676k.m65745e(this.pinned_at_before_or_equal, pinnedMessagesRequest.pinned_at_before_or_equal);
    }

    public final String getId_around() {
        return this.id_around;
    }

    public final String getId_gt() {
        return this.id_gt;
    }

    public final String getId_gte() {
        return this.id_gte;
    }

    public final String getId_lt() {
        return this.id_lt;
    }

    public final String getId_lte() {
        return this.id_lte;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final Date getPinned_at_after() {
        return this.pinned_at_after;
    }

    public final Date getPinned_at_after_or_equal() {
        return this.pinned_at_after_or_equal;
    }

    public final Date getPinned_at_around() {
        return this.pinned_at_around;
    }

    public final Date getPinned_at_before() {
        return this.pinned_at_before;
    }

    public final Date getPinned_at_before_or_equal() {
        return this.pinned_at_before_or_equal;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Integer.hashCode(this.limit) * 31, 31, this.sort);
        String str = this.id_around;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id_gt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id_gte;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id_lt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id_lte;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date = this.pinned_at_around;
        int iHashCode6 = (iHashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.pinned_at_after;
        int iHashCode7 = (iHashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.pinned_at_after_or_equal;
        int iHashCode8 = (iHashCode7 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.pinned_at_before;
        int iHashCode9 = (iHashCode8 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.pinned_at_before_or_equal;
        return iHashCode9 + (date5 != null ? date5.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.limit;
        List<Map<String, Object>> list = this.sort;
        String str = this.id_around;
        String str2 = this.id_gt;
        String str3 = this.id_gte;
        String str4 = this.id_lt;
        String str5 = this.id_lte;
        Date date = this.pinned_at_around;
        Date date2 = this.pinned_at_after;
        Date date3 = this.pinned_at_after_or_equal;
        Date date4 = this.pinned_at_before;
        Date date5 = this.pinned_at_before_or_equal;
        StringBuilder sb4 = new StringBuilder("PinnedMessagesRequest(limit=");
        sb4.append(i13);
        sb4.append(", sort=");
        sb4.append(list);
        sb4.append(", id_around=");
        AbstractC11266d.m30444B(sb4, str, ", id_gt=", str2, ", id_gte=");
        AbstractC11266d.m30444B(sb4, str3, ", id_lt=", str4, ", id_lte=");
        AbstractC13673n.m38579z(sb4, str5, ", pinned_at_around=", date, ", pinned_at_after=");
        AbstractC17176i.m48512n(sb4, date2, ", pinned_at_after_or_equal=", date3, ", pinned_at_before=");
        sb4.append(date4);
        sb4.append(", pinned_at_before_or_equal=");
        sb4.append(date5);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ PinnedMessagesRequest(int i13, List list, String str, String str2, String str3, String str4, String str5, Date date, Date date2, Date date3, Date date4, Date date5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, list, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : date, (i14 & 256) != 0 ? null : date2, (i14 & 512) != 0 ? null : date3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : date4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : date5);
    }
}
