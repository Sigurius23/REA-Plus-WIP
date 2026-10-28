package live.hms.video.utils;

import android.util.Base64;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Llive/hms/video/utils/AuthTokenUtils;", "", "<init>", "()V", "TAG", "", "getJWTPayload", "Llive/hms/video/utils/AuthTokenUtils$AuthToken;", "token", "AuthToken", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AuthTokenUtils {
    public static final AuthTokenUtils INSTANCE = new AuthTokenUtils();
    private static final String TAG = "AuthTokenUtils";

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/utils/AuthTokenUtils$AuthToken;", "", "roomId", "", "userId", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "getUserId", "getRole", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class AuthToken {

        @SerializedName("role")
        private final String role;

        @SerializedName("room_id")
        private final String roomId;

        @SerializedName("user_id")
        private final String userId;

        public AuthToken(String roomId, String str, String role) {
            AbstractC22676k.m65750j(roomId, "roomId");
            AbstractC22676k.m65750j(role, "role");
            this.roomId = roomId;
            this.userId = str;
            this.role = role;
        }

        public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = authToken.roomId;
            }
            if ((i13 & 2) != 0) {
                str2 = authToken.userId;
            }
            if ((i13 & 4) != 0) {
                str3 = authToken.role;
            }
            return authToken.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public final AuthToken copy(String roomId, String userId, String role) {
            AbstractC22676k.m65750j(roomId, "roomId");
            AbstractC22676k.m65750j(role, "role");
            return new AuthToken(roomId, userId, role);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthToken)) {
                return false;
            }
            AuthToken authToken = (AuthToken) other;
            return AbstractC22676k.m65745e(this.roomId, authToken.roomId) && AbstractC22676k.m65745e(this.userId, authToken.userId) && AbstractC22676k.m65745e(this.role, authToken.role);
        }

        public final String getRole() {
            return this.role;
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int iHashCode = this.roomId.hashCode() * 31;
            String str = this.userId;
            return this.role.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("AuthToken(roomId=");
            sb4.append(this.roomId);
            sb4.append(", userId=");
            sb4.append(this.userId);
            sb4.append(", role=");
            return AbstractC25012a.m73377j(sb4, this.role, ')');
        }
    }

    private AuthTokenUtils() {
    }

    public final AuthToken getJWTPayload(String token) throws HMSException {
        AbstractC22676k.m65750j(token, "token");
        HMSLogger.m71136d(TAG, "getJWTPayload: token=".concat(token));
        if (token.length() == 0) {
            throw ErrorFactory.APIErrors.InvalidTokenFormat$default(ErrorFactory.APIErrors.INSTANCE, ErrorFactory.Action.INIT, "Token cannot be an empty string", null, null, 12, null);
        }
        List listM125906y0 = AbstractC39414r.m125906y0(token, new String[]{"."}, 6);
        if (listM125906y0.size() != 3) {
            ErrorFactory.APIErrors.InvalidTokenFormat$default(ErrorFactory.APIErrors.INSTANCE, ErrorFactory.Action.INIT, "Expected 3 '.' separate fields - header, payload and signature respectively", null, null, 12, null);
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listM125906y0.get(1), 0);
            AbstractC22676k.m65747g(bArrDecode);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC22676k.m65749i(UTF_8, "UTF_8");
            Object objFromJson = GsonUtils.INSTANCE.getGson().fromJson(new String(bArrDecode, UTF_8), (Class<Object>) AuthToken.class);
            AbstractC22676k.m65749i(objFromJson, "fromJson(...)");
            return (AuthToken) objFromJson;
        } catch (JsonSyntaxException e5) {
            HMSLogger.INSTANCE.m71138e(TAG, "Error parsing json", e5);
            throw ErrorFactory.APIErrors.InvalidTokenFormat$default(ErrorFactory.APIErrors.INSTANCE, ErrorFactory.Action.INIT, "Token is missing room id", null, null, 12, null);
        } catch (Exception e13) {
            HMSLogger.INSTANCE.m71138e(TAG, "Error not parsing json", e13);
            ErrorFactory.APIErrors aPIErrors = ErrorFactory.APIErrors.INSTANCE;
            ErrorFactory.Action action = ErrorFactory.Action.INIT;
            String message = e13.getMessage();
            if (message == null) {
                message = "";
            }
            throw ErrorFactory.APIErrors.InvalidTokenFormat$default(aPIErrors, action, message, null, null, 12, null);
        }
    }
}
