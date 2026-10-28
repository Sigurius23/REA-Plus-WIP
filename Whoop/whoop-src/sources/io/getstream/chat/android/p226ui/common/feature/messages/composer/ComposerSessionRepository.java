package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import androidx.lifecycle.C1601k1;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import i93.C18284j;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26463f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001b*\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010%\u001a\u00020$2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;", "", "Landroidx/lifecycle/k1;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/k1;)V", "Lorg/json/JSONObject;", "sessionJson", "()Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "", "Lio/getstream/chat/android/models/Attachment;", "toAttachmentList", "(Lorg/json/JSONArray;)Ljava/util/List;", "attachment", "attachmentToJson", "(Lio/getstream/chat/android/models/Attachment;)Lorg/json/JSONObject;", "json", "jsonToAttachment", "(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/models/Message;", "message", "messageToJson", "(Lio/getstream/chat/android/models/Message;)Lorg/json/JSONObject;", "jsonToMessage", "(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Message;", "", "", "extraData", "extraDataToJson", "(Ljava/util/Map;)Lorg/json/JSONObject;", "sourceUriString", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;", "selectedAttachments", "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;", "editMode", "Ll83/a0;", ProfileAnalyticsKt.SAVE, "(Ljava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;)V", "restoreSelectedAttachments", "()Ljava/util/List;", "restoreEditMode", "()Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;", "Landroidx/lifecycle/k1;", "EditMode", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ComposerSessionRepository {
    public static final int $stable = 8;
    private final C1601k1 savedStateHandle;

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;", "", "message", "Lio/getstream/chat/android/models/Message;", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "<init>", "(Lio/getstream/chat/android/models/Message;Ljava/util/List;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getAttachments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class EditMode {
        public static final int $stable = 8;
        private final List<Attachment> attachments;
        private final Message message;

        public EditMode(Message message, List<Attachment> attachments) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(attachments, "attachments");
            this.message = message;
            this.attachments = attachments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EditMode copy$default(EditMode editMode, Message message, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                message = editMode.message;
            }
            if ((i13 & 2) != 0) {
                list = editMode.attachments;
            }
            return editMode.copy(message, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final List<Attachment> component2() {
            return this.attachments;
        }

        public final EditMode copy(Message message, List<Attachment> attachments) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(attachments, "attachments");
            return new EditMode(message, attachments);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditMode)) {
                return false;
            }
            EditMode editMode = (EditMode) other;
            return AbstractC22676k.m65745e(this.message, editMode.message) && AbstractC22676k.m65745e(this.attachments, editMode.attachments);
        }

        public final List<Attachment> getAttachments() {
            return this.attachments;
        }

        public final Message getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.attachments.hashCode() + (this.message.hashCode() * 31);
        }

        public final String toString() {
            return "EditMode(message=" + this.message + ", attachments=" + this.attachments + ")";
        }
    }

    public ComposerSessionRepository(C1601k1 savedStateHandle) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    private final JSONObject attachmentToJson(Attachment attachment) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strSourceUriString = sourceUriString(attachment);
        if (strSourceUriString != null) {
            jSONObject.put("uri", strSourceUriString);
        }
        String type = attachment.getType();
        if (type != null) {
            jSONObject.put("type", type);
        }
        jSONObject.put("name", attachment.getName());
        jSONObject.put("fileSize", attachment.getFileSize());
        String mimeType = attachment.getMimeType();
        if (mimeType != null) {
            jSONObject.put("mimeType", mimeType);
        }
        String assetUrl = attachment.getAssetUrl();
        if (assetUrl != null) {
            jSONObject.put("assetUrl", assetUrl);
        }
        String imageUrl = attachment.getImageUrl();
        if (imageUrl != null) {
            jSONObject.put("imageUrl", imageUrl);
        }
        String thumbUrl = attachment.getThumbUrl();
        if (thumbUrl != null) {
            jSONObject.put("thumbUrl", thumbUrl);
        }
        String title = attachment.getTitle();
        if (title != null) {
            jSONObject.put("title", title);
        }
        JSONObject jSONObjectExtraDataToJson = extraDataToJson(attachment.getExtraData());
        if (jSONObjectExtraDataToJson != null) {
            jSONObject.put("extraData", jSONObjectExtraDataToJson);
        }
        return jSONObject;
    }

    private final JSONObject extraDataToJson(Map<String, ? extends Object> extraData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : extraData.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!AbstractC22676k.m65745e(key, AttachmentStorageHelper.EXTRA_SOURCE_URI)) {
                if (value instanceof String) {
                    jSONObject.put(key, value);
                } else if (value instanceof Boolean) {
                    jSONObject.put(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    jSONObject.put(key, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    jSONObject.put(key, ((Number) value).longValue());
                } else if (value instanceof Double) {
                    jSONObject.put(key, ((Number) value).doubleValue());
                } else if (value instanceof Float) {
                    jSONObject.put(key, ((Number) value).floatValue());
                }
            }
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    private final Attachment jsonToAttachment(JSONObject json) {
        String strOptString = json.optString("uri");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        String strOptString2 = json.optString("name");
        if (strOptString2.length() <= 0) {
            strOptString2 = null;
        }
        String strOptString3 = json.optString("assetUrl");
        String str = strOptString3.length() > 0 ? strOptString3 : null;
        String strOptString4 = json.optString("imageUrl");
        String str2 = strOptString4.length() > 0 ? strOptString4 : null;
        String strOptString5 = json.optString("thumbUrl");
        String str3 = strOptString5.length() > 0 ? strOptString5 : null;
        if (strOptString == null && strOptString2 == null && str == null && str2 == null && str3 == null) {
            return null;
        }
        C26463f c26463f = new C26463f();
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("extraData");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            AbstractC22676k.m65749i(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c26463f.put(next, jSONObjectOptJSONObject.get(next));
            }
        }
        if (strOptString != null) {
            c26463f.put(AttachmentStorageHelper.EXTRA_SOURCE_URI, strOptString);
        }
        C26463f c26463fM78380b = c26463f.m78380b();
        String strOptString6 = json.optString("type");
        String str4 = strOptString6.length() > 0 ? strOptString6 : null;
        String strOptString7 = json.optString("name");
        int iOptInt = json.optInt("fileSize");
        String strOptString8 = json.optString("mimeType");
        String str5 = strOptString8.length() > 0 ? strOptString8 : null;
        String strOptString9 = json.optString("title");
        return new Attachment(null, null, null, str3, str2, str, null, str5, iOptInt, strOptString9.length() > 0 ? strOptString9 : null, null, str4, null, strOptString7, null, null, null, null, null, c26463fM78380b, 513095, null);
    }

    private final Message jsonToMessage(JSONObject json) {
        String strOptString = json.optString("msgId");
        String str = strOptString.length() > 0 ? strOptString : null;
        if (str == null) {
            return null;
        }
        String strOptString2 = json.optString("msgCid");
        String str2 = strOptString2.length() > 0 ? strOptString2 : null;
        if (str2 == null) {
            return null;
        }
        String strOptString3 = json.optString("msgText");
        AbstractC22676k.m65749i(strOptString3, "optString(...)");
        String strOptString4 = json.optString("msgParentId");
        String str3 = strOptString4.length() > 0 ? strOptString4 : null;
        String strOptString5 = json.optString("msgType");
        AbstractC22676k.m65749i(strOptString5, "optString(...)");
        return new Message(str, str2, strOptString3, null, str3, null, null, null, null, 0, 0, null, null, null, null, strOptString5, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -32792, 65535, null);
    }

    private final JSONObject messageToJson(Message message) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", message.getId());
        jSONObject.put("msgCid", message.getCid());
        jSONObject.put("msgText", message.getText());
        String parentId = message.getParentId();
        if (parentId != null) {
            jSONObject.put("msgParentId", parentId);
        }
        jSONObject.put("msgType", message.getType());
        return jSONObject;
    }

    private final JSONObject sessionJson() {
        String str = (String) this.savedStateHandle.m5001b("stream_composer_session");
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String sourceUriString(Attachment attachment) {
        Object obj = attachment.getExtraData().get(AttachmentStorageHelper.EXTRA_SOURCE_URI);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    private final List<Attachment> toAttachmentList(JSONArray jSONArray) throws JSONException {
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC25243e0) it).nextInt());
            AbstractC22676k.m65749i(jSONObject, "getJSONObject(...)");
            Attachment attachmentJsonToAttachment = jsonToAttachment(jSONObject);
            if (attachmentJsonToAttachment != null) {
                arrayList.add(attachmentJsonToAttachment);
            }
        }
        return arrayList;
    }

    public final EditMode restoreEditMode() {
        JSONObject jSONObjectOptJSONObject;
        Message messageJsonToMessage;
        JSONObject jSONObjectSessionJson = sessionJson();
        if (jSONObjectSessionJson == null || (jSONObjectOptJSONObject = jSONObjectSessionJson.optJSONObject("stream_composer_edit_message")) == null || (messageJsonToMessage = jsonToMessage(jSONObjectOptJSONObject)) == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectSessionJson.optJSONArray("stream_composer_edit_attachments");
        return new EditMode(messageJsonToMessage, jSONArrayOptJSONArray != null ? toAttachmentList(jSONArrayOptJSONArray) : C25271y.f99162w);
    }

    public final List<Attachment> restoreSelectedAttachments() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectSessionJson = sessionJson();
        return (jSONObjectSessionJson == null || (jSONArrayOptJSONArray = jSONObjectSessionJson.optJSONArray("stream_composer_selected_attachments")) == null) ? C25271y.f99162w : toAttachmentList(jSONArrayOptJSONArray);
    }

    public final void save(List<Attachment> selectedAttachments, EditMode editMode) {
        AbstractC22676k.m65750j(selectedAttachments, "selectedAttachments");
        if (selectedAttachments.isEmpty() && editMode == null) {
            this.savedStateHandle.m5003d("stream_composer_session");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        List<Attachment> list = selectedAttachments;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(attachmentToJson((Attachment) it.next()));
        }
        jSONObject.put("stream_composer_selected_attachments", new JSONArray((Collection) arrayList));
        if (editMode != null) {
            jSONObject.put("stream_composer_edit_message", messageToJson(editMode.getMessage()));
            List<Attachment> attachments = editMode.getAttachments();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
            Iterator<T> it3 = attachments.iterator();
            while (it3.hasNext()) {
                arrayList2.add(attachmentToJson((Attachment) it3.next()));
            }
            jSONObject.put("stream_composer_edit_attachments", new JSONArray((Collection) arrayList2));
        }
        this.savedStateHandle.m5004e(jSONObject.toString(), "stream_composer_session");
    }
}
