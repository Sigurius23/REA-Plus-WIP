package io.getstream.chat.android.p226ui.common.utils;

import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a,\u0010\u000b\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u0011"}, m65681d2 = {"GIPHY_INFO_DEFAULT_WIDTH_DP", "", "getGIPHY_INFO_DEFAULT_WIDTH_DP$annotations", "()V", "GIPHY_INFO_DEFAULT_HEIGHT_DP", "getGIPHY_INFO_DEFAULT_HEIGHT_DP$annotations", "giphyInfo", "Lio/getstream/chat/android/ui/common/utils/GiphyInfo;", "Lio/getstream/chat/android/models/Attachment;", "field", "Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;", "getGiphySize", "map", "", "", "size", "defaultValue", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GiphyInfoTypeKt {
    public static final int GIPHY_INFO_DEFAULT_HEIGHT_DP = 200;
    public static final int GIPHY_INFO_DEFAULT_WIDTH_DP = 200;

    @InternalStreamChatApi
    public static /* synthetic */ void getGIPHY_INFO_DEFAULT_HEIGHT_DP$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getGIPHY_INFO_DEFAULT_WIDTH_DP$annotations() {
    }

    private static final int getGiphySize(Map<String, String> map, String str, int i13) {
        String str2;
        String str3 = map.get(str);
        return (str3 == null || AbstractC39414r.m125890i0(str3) || (str2 = map.get(str)) == null) ? i13 : Integer.parseInt(str2);
    }

    public static final GiphyInfo giphyInfo(Attachment attachment, GiphyInfoType field) {
        AbstractC22676k.m65750j(attachment, "<this>");
        AbstractC22676k.m65750j(field, "field");
        Object obj = attachment.getExtraData().get("giphy");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get(field.getValue()) : null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 == null) {
            return null;
        }
        String str = (String) map2.get(QueryParams.URL);
        if (str == null) {
            str = "";
        }
        return new GiphyInfo(str, getGiphySize(map2, "width", Utils.dpToPx(200)), getGiphySize(map2, "height", Utils.dpToPx(200)));
    }
}
