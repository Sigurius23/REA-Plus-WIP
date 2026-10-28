package live.hms.video.signal.init;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.List;
import live.hms.video.sdk.models.enums.HMSMessageType;
import live.hms.video.utils.AndroidSDKConstants;
import live.hms.video.utils.HMSConstantsKt;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0006H\u0016J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout;", "", "data", "", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;", "last", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getLast", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "HMSRoomLayoutData", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRoomLayout {

    @SerializedName("data")
    private final List<HMSRoomLayoutData> data;

    @SerializedName("last")
    private final String last;

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u00056789:Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0013\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011HÆ\u0003J\u0089\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006;"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;", "", "appId", "", "id", "options", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;", "role", "roleId", "templateId", "typography", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;", "logo", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;", "screens", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;", "themes", "", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;Ljava/util/List;)V", "getAppId", "()Ljava/lang/String;", "getId", "getOptions", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;", "getRole", "getRoleId", "getTemplateId", "getTypography", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;", "getLogo", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;", "getScreens", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;", "getThemes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Screens", "Logo", "TypoGraphy", "HMSLayoutOptions", "HMSRoomTheme", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HMSRoomLayoutData {

        @SerializedName("app_id")
        private final String appId;

        @SerializedName("id")
        private final String id;

        @SerializedName("logo")
        private final Logo logo;

        @SerializedName("options")
        private final HMSLayoutOptions options;

        @SerializedName("role")
        private final String role;

        @SerializedName("role_id")
        private final String roleId;

        @SerializedName("screens")
        private final Screens screens;

        @SerializedName("template_id")
        private final String templateId;

        @SerializedName("themes")
        private final List<HMSRoomTheme> themes;

        @SerializedName("typography")
        private final TypoGraphy typography;

        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSLayoutOptions;", "", "key1", "", "key2", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey1", "()Ljava/lang/String;", "getKey2", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class HMSLayoutOptions {

            @SerializedName("key1")
            private final String key1;

            @SerializedName("key2")
            private final String key2;

            public HMSLayoutOptions(String str, String str2) {
                this.key1 = str;
                this.key2 = str2;
            }

            public static /* synthetic */ HMSLayoutOptions copy$default(HMSLayoutOptions hMSLayoutOptions, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = hMSLayoutOptions.key1;
                }
                if ((i13 & 2) != 0) {
                    str2 = hMSLayoutOptions.key2;
                }
                return hMSLayoutOptions.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getKey1() {
                return this.key1;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getKey2() {
                return this.key2;
            }

            public final HMSLayoutOptions copy(String key1, String key2) {
                return new HMSLayoutOptions(key1, key2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HMSLayoutOptions)) {
                    return false;
                }
                HMSLayoutOptions hMSLayoutOptions = (HMSLayoutOptions) other;
                return AbstractC22676k.m65745e(this.key1, hMSLayoutOptions.key1) && AbstractC22676k.m65745e(this.key2, hMSLayoutOptions.key2);
            }

            public final String getKey1() {
                return this.key1;
            }

            public final String getKey2() {
                return this.key2;
            }

            public int hashCode() {
                String str = this.key1;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.key2;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb4 = new StringBuilder("HMSLayoutOptions(key1=");
                sb4.append(this.key1);
                sb4.append(", key2=");
                return AbstractC25012a.m73377j(sb4, this.key2, ')');
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;", "", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "", "name", "", "palette", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "getPalette", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;", "equals", "other", "hashCode", "", "toString", "HMSColorPalette", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class HMSRoomTheme {

            @SerializedName(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)
            private final Boolean default;

            @SerializedName("name")
            private final String name;

            @SerializedName("palette")
            private final HMSColorPalette palette;

            @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bd\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0003\u0010f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010j\u001a\u00020kHÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010&R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&¨\u0006m"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;", "", "alertErrorBright", "", "alertErrorBrighter", "alertErrorDefault", "alertErrorDim", "alertSuccess", "alertWarning", "backgroundDefault", "backgroundDim", "borderBright", "borderDefault", "onPrimaryHigh", "onPrimaryLow", "onPrimaryMedium", "onSecondaryHigh", "onSecondaryLow", "onSecondaryMedium", "onSurfaceHigh", "onSurfaceLow", "onSurfaceMedium", "primaryBright", "primaryDefault", "primaryDim", "primaryDisabled", "secondaryBright", "secondaryDefault", "secondaryDim", "secondaryDisabled", "surfaceBright", "surfaceBrighter", "surfaceDefault", "surfaceDim", "borderLight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlertErrorBright", "()Ljava/lang/String;", "getAlertErrorBrighter", "getAlertErrorDefault", "getAlertErrorDim", "getAlertSuccess", "getAlertWarning", "getBackgroundDefault", "getBackgroundDim", "getBorderBright", "getBorderDefault", "getOnPrimaryHigh", "getOnPrimaryLow", "getOnPrimaryMedium", "getOnSecondaryHigh", "getOnSecondaryLow", "getOnSecondaryMedium", "getOnSurfaceHigh", "getOnSurfaceLow", "getOnSurfaceMedium", "getPrimaryBright", "getPrimaryDefault", "getPrimaryDim", "getPrimaryDisabled", "getSecondaryBright", "getSecondaryDefault", "getSecondaryDim", "getSecondaryDisabled", "getSurfaceBright", "getSurfaceBrighter", "getSurfaceDefault", "getSurfaceDim", "getBorderLight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
            public static final /* data */ class HMSColorPalette {

                @SerializedName("alert_error_bright")
                private final String alertErrorBright;

                @SerializedName("alert_error_brighter")
                private final String alertErrorBrighter;

                @SerializedName("alert_error_default")
                private final String alertErrorDefault;

                @SerializedName("alert_error_dim")
                private final String alertErrorDim;

                @SerializedName("alert_success")
                private final String alertSuccess;

                @SerializedName("alert_warning")
                private final String alertWarning;

                @SerializedName("background_default")
                private final String backgroundDefault;

                @SerializedName("background_dim")
                private final String backgroundDim;

                @SerializedName("border_bright")
                private final String borderBright;

                @SerializedName("border_default")
                private final String borderDefault;

                @SerializedName("border_light")
                private final String borderLight;

                @SerializedName("on_primary_high")
                private final String onPrimaryHigh;

                @SerializedName("on_primary_low")
                private final String onPrimaryLow;

                @SerializedName("on_primary_medium")
                private final String onPrimaryMedium;

                @SerializedName("on_secondary_high")
                private final String onSecondaryHigh;

                @SerializedName("on_secondary_low")
                private final String onSecondaryLow;

                @SerializedName("on_secondary_medium")
                private final String onSecondaryMedium;

                @SerializedName("on_surface_high")
                private final String onSurfaceHigh;

                @SerializedName("on_surface_low")
                private final String onSurfaceLow;

                @SerializedName("on_surface_medium")
                private final String onSurfaceMedium;

                @SerializedName("primary_bright")
                private final String primaryBright;

                @SerializedName("primary_default")
                private final String primaryDefault;

                @SerializedName("primary_dim")
                private final String primaryDim;

                @SerializedName("primary_disabled")
                private final String primaryDisabled;

                @SerializedName("secondary_bright")
                private final String secondaryBright;

                @SerializedName("secondary_default")
                private final String secondaryDefault;

                @SerializedName("secondary_dim")
                private final String secondaryDim;

                @SerializedName("secondary_disabled")
                private final String secondaryDisabled;

                @SerializedName("surface_bright")
                private final String surfaceBright;

                @SerializedName("surface_brighter")
                private final String surfaceBrighter;

                @SerializedName("surface_default")
                private final String surfaceDefault;

                @SerializedName("surface_dim")
                private final String surfaceDim;

                public HMSColorPalette(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
                    this.alertErrorBright = str;
                    this.alertErrorBrighter = str2;
                    this.alertErrorDefault = str3;
                    this.alertErrorDim = str4;
                    this.alertSuccess = str5;
                    this.alertWarning = str6;
                    this.backgroundDefault = str7;
                    this.backgroundDim = str8;
                    this.borderBright = str9;
                    this.borderDefault = str10;
                    this.onPrimaryHigh = str11;
                    this.onPrimaryLow = str12;
                    this.onPrimaryMedium = str13;
                    this.onSecondaryHigh = str14;
                    this.onSecondaryLow = str15;
                    this.onSecondaryMedium = str16;
                    this.onSurfaceHigh = str17;
                    this.onSurfaceLow = str18;
                    this.onSurfaceMedium = str19;
                    this.primaryBright = str20;
                    this.primaryDefault = str21;
                    this.primaryDim = str22;
                    this.primaryDisabled = str23;
                    this.secondaryBright = str24;
                    this.secondaryDefault = str25;
                    this.secondaryDim = str26;
                    this.secondaryDisabled = str27;
                    this.surfaceBright = str28;
                    this.surfaceBrighter = str29;
                    this.surfaceDefault = str30;
                    this.surfaceDim = str31;
                    this.borderLight = str32;
                }

                public static /* synthetic */ HMSColorPalette copy$default(HMSColorPalette hMSColorPalette, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, int i13, Object obj) {
                    String str33;
                    String str34;
                    String str35 = (i13 & 1) != 0 ? hMSColorPalette.alertErrorBright : str;
                    String str36 = (i13 & 2) != 0 ? hMSColorPalette.alertErrorBrighter : str2;
                    String str37 = (i13 & 4) != 0 ? hMSColorPalette.alertErrorDefault : str3;
                    String str38 = (i13 & 8) != 0 ? hMSColorPalette.alertErrorDim : str4;
                    String str39 = (i13 & 16) != 0 ? hMSColorPalette.alertSuccess : str5;
                    String str40 = (i13 & 32) != 0 ? hMSColorPalette.alertWarning : str6;
                    String str41 = (i13 & 64) != 0 ? hMSColorPalette.backgroundDefault : str7;
                    String str42 = (i13 & 128) != 0 ? hMSColorPalette.backgroundDim : str8;
                    String str43 = (i13 & 256) != 0 ? hMSColorPalette.borderBright : str9;
                    String str44 = (i13 & 512) != 0 ? hMSColorPalette.borderDefault : str10;
                    String str45 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? hMSColorPalette.onPrimaryHigh : str11;
                    String str46 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? hMSColorPalette.onPrimaryLow : str12;
                    String str47 = (i13 & 4096) != 0 ? hMSColorPalette.onPrimaryMedium : str13;
                    String str48 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? hMSColorPalette.onSecondaryHigh : str14;
                    String str49 = str35;
                    String str50 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? hMSColorPalette.onSecondaryLow : str15;
                    String str51 = (i13 & 32768) != 0 ? hMSColorPalette.onSecondaryMedium : str16;
                    String str52 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? hMSColorPalette.onSurfaceHigh : str17;
                    String str53 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? hMSColorPalette.onSurfaceLow : str18;
                    String str54 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? hMSColorPalette.onSurfaceMedium : str19;
                    String str55 = (i13 & 524288) != 0 ? hMSColorPalette.primaryBright : str20;
                    String str56 = (i13 & 1048576) != 0 ? hMSColorPalette.primaryDefault : str21;
                    String str57 = (i13 & 2097152) != 0 ? hMSColorPalette.primaryDim : str22;
                    String str58 = (i13 & 4194304) != 0 ? hMSColorPalette.primaryDisabled : str23;
                    String str59 = (i13 & 8388608) != 0 ? hMSColorPalette.secondaryBright : str24;
                    String str60 = (i13 & 16777216) != 0 ? hMSColorPalette.secondaryDefault : str25;
                    String str61 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? hMSColorPalette.secondaryDim : str26;
                    String str62 = (i13 & 67108864) != 0 ? hMSColorPalette.secondaryDisabled : str27;
                    String str63 = (i13 & 134217728) != 0 ? hMSColorPalette.surfaceBright : str28;
                    String str64 = (i13 & 268435456) != 0 ? hMSColorPalette.surfaceBrighter : str29;
                    String str65 = (i13 & 536870912) != 0 ? hMSColorPalette.surfaceDefault : str30;
                    String str66 = (i13 & 1073741824) != 0 ? hMSColorPalette.surfaceDim : str31;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        str34 = str66;
                        str33 = hMSColorPalette.borderLight;
                    } else {
                        str33 = str32;
                        str34 = str66;
                    }
                    return hMSColorPalette.copy(str49, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str34, str33);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getAlertErrorBright() {
                    return this.alertErrorBright;
                }

                /* JADX INFO: renamed from: component10, reason: from getter */
                public final String getBorderDefault() {
                    return this.borderDefault;
                }

                /* JADX INFO: renamed from: component11, reason: from getter */
                public final String getOnPrimaryHigh() {
                    return this.onPrimaryHigh;
                }

                /* JADX INFO: renamed from: component12, reason: from getter */
                public final String getOnPrimaryLow() {
                    return this.onPrimaryLow;
                }

                /* JADX INFO: renamed from: component13, reason: from getter */
                public final String getOnPrimaryMedium() {
                    return this.onPrimaryMedium;
                }

                /* JADX INFO: renamed from: component14, reason: from getter */
                public final String getOnSecondaryHigh() {
                    return this.onSecondaryHigh;
                }

                /* JADX INFO: renamed from: component15, reason: from getter */
                public final String getOnSecondaryLow() {
                    return this.onSecondaryLow;
                }

                /* JADX INFO: renamed from: component16, reason: from getter */
                public final String getOnSecondaryMedium() {
                    return this.onSecondaryMedium;
                }

                /* JADX INFO: renamed from: component17, reason: from getter */
                public final String getOnSurfaceHigh() {
                    return this.onSurfaceHigh;
                }

                /* JADX INFO: renamed from: component18, reason: from getter */
                public final String getOnSurfaceLow() {
                    return this.onSurfaceLow;
                }

                /* JADX INFO: renamed from: component19, reason: from getter */
                public final String getOnSurfaceMedium() {
                    return this.onSurfaceMedium;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getAlertErrorBrighter() {
                    return this.alertErrorBrighter;
                }

                /* JADX INFO: renamed from: component20, reason: from getter */
                public final String getPrimaryBright() {
                    return this.primaryBright;
                }

                /* JADX INFO: renamed from: component21, reason: from getter */
                public final String getPrimaryDefault() {
                    return this.primaryDefault;
                }

                /* JADX INFO: renamed from: component22, reason: from getter */
                public final String getPrimaryDim() {
                    return this.primaryDim;
                }

                /* JADX INFO: renamed from: component23, reason: from getter */
                public final String getPrimaryDisabled() {
                    return this.primaryDisabled;
                }

                /* JADX INFO: renamed from: component24, reason: from getter */
                public final String getSecondaryBright() {
                    return this.secondaryBright;
                }

                /* JADX INFO: renamed from: component25, reason: from getter */
                public final String getSecondaryDefault() {
                    return this.secondaryDefault;
                }

                /* JADX INFO: renamed from: component26, reason: from getter */
                public final String getSecondaryDim() {
                    return this.secondaryDim;
                }

                /* JADX INFO: renamed from: component27, reason: from getter */
                public final String getSecondaryDisabled() {
                    return this.secondaryDisabled;
                }

                /* JADX INFO: renamed from: component28, reason: from getter */
                public final String getSurfaceBright() {
                    return this.surfaceBright;
                }

                /* JADX INFO: renamed from: component29, reason: from getter */
                public final String getSurfaceBrighter() {
                    return this.surfaceBrighter;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getAlertErrorDefault() {
                    return this.alertErrorDefault;
                }

                /* JADX INFO: renamed from: component30, reason: from getter */
                public final String getSurfaceDefault() {
                    return this.surfaceDefault;
                }

                /* JADX INFO: renamed from: component31, reason: from getter */
                public final String getSurfaceDim() {
                    return this.surfaceDim;
                }

                /* JADX INFO: renamed from: component32, reason: from getter */
                public final String getBorderLight() {
                    return this.borderLight;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getAlertErrorDim() {
                    return this.alertErrorDim;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final String getAlertSuccess() {
                    return this.alertSuccess;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final String getAlertWarning() {
                    return this.alertWarning;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final String getBackgroundDefault() {
                    return this.backgroundDefault;
                }

                /* JADX INFO: renamed from: component8, reason: from getter */
                public final String getBackgroundDim() {
                    return this.backgroundDim;
                }

                /* JADX INFO: renamed from: component9, reason: from getter */
                public final String getBorderBright() {
                    return this.borderBright;
                }

                public final HMSColorPalette copy(String alertErrorBright, String alertErrorBrighter, String alertErrorDefault, String alertErrorDim, String alertSuccess, String alertWarning, String backgroundDefault, String backgroundDim, String borderBright, String borderDefault, String onPrimaryHigh, String onPrimaryLow, String onPrimaryMedium, String onSecondaryHigh, String onSecondaryLow, String onSecondaryMedium, String onSurfaceHigh, String onSurfaceLow, String onSurfaceMedium, String primaryBright, String primaryDefault, String primaryDim, String primaryDisabled, String secondaryBright, String secondaryDefault, String secondaryDim, String secondaryDisabled, String surfaceBright, String surfaceBrighter, String surfaceDefault, String surfaceDim, String borderLight) {
                    return new HMSColorPalette(alertErrorBright, alertErrorBrighter, alertErrorDefault, alertErrorDim, alertSuccess, alertWarning, backgroundDefault, backgroundDim, borderBright, borderDefault, onPrimaryHigh, onPrimaryLow, onPrimaryMedium, onSecondaryHigh, onSecondaryLow, onSecondaryMedium, onSurfaceHigh, onSurfaceLow, onSurfaceMedium, primaryBright, primaryDefault, primaryDim, primaryDisabled, secondaryBright, secondaryDefault, secondaryDim, secondaryDisabled, surfaceBright, surfaceBrighter, surfaceDefault, surfaceDim, borderLight);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HMSColorPalette)) {
                        return false;
                    }
                    HMSColorPalette hMSColorPalette = (HMSColorPalette) other;
                    return AbstractC22676k.m65745e(this.alertErrorBright, hMSColorPalette.alertErrorBright) && AbstractC22676k.m65745e(this.alertErrorBrighter, hMSColorPalette.alertErrorBrighter) && AbstractC22676k.m65745e(this.alertErrorDefault, hMSColorPalette.alertErrorDefault) && AbstractC22676k.m65745e(this.alertErrorDim, hMSColorPalette.alertErrorDim) && AbstractC22676k.m65745e(this.alertSuccess, hMSColorPalette.alertSuccess) && AbstractC22676k.m65745e(this.alertWarning, hMSColorPalette.alertWarning) && AbstractC22676k.m65745e(this.backgroundDefault, hMSColorPalette.backgroundDefault) && AbstractC22676k.m65745e(this.backgroundDim, hMSColorPalette.backgroundDim) && AbstractC22676k.m65745e(this.borderBright, hMSColorPalette.borderBright) && AbstractC22676k.m65745e(this.borderDefault, hMSColorPalette.borderDefault) && AbstractC22676k.m65745e(this.onPrimaryHigh, hMSColorPalette.onPrimaryHigh) && AbstractC22676k.m65745e(this.onPrimaryLow, hMSColorPalette.onPrimaryLow) && AbstractC22676k.m65745e(this.onPrimaryMedium, hMSColorPalette.onPrimaryMedium) && AbstractC22676k.m65745e(this.onSecondaryHigh, hMSColorPalette.onSecondaryHigh) && AbstractC22676k.m65745e(this.onSecondaryLow, hMSColorPalette.onSecondaryLow) && AbstractC22676k.m65745e(this.onSecondaryMedium, hMSColorPalette.onSecondaryMedium) && AbstractC22676k.m65745e(this.onSurfaceHigh, hMSColorPalette.onSurfaceHigh) && AbstractC22676k.m65745e(this.onSurfaceLow, hMSColorPalette.onSurfaceLow) && AbstractC22676k.m65745e(this.onSurfaceMedium, hMSColorPalette.onSurfaceMedium) && AbstractC22676k.m65745e(this.primaryBright, hMSColorPalette.primaryBright) && AbstractC22676k.m65745e(this.primaryDefault, hMSColorPalette.primaryDefault) && AbstractC22676k.m65745e(this.primaryDim, hMSColorPalette.primaryDim) && AbstractC22676k.m65745e(this.primaryDisabled, hMSColorPalette.primaryDisabled) && AbstractC22676k.m65745e(this.secondaryBright, hMSColorPalette.secondaryBright) && AbstractC22676k.m65745e(this.secondaryDefault, hMSColorPalette.secondaryDefault) && AbstractC22676k.m65745e(this.secondaryDim, hMSColorPalette.secondaryDim) && AbstractC22676k.m65745e(this.secondaryDisabled, hMSColorPalette.secondaryDisabled) && AbstractC22676k.m65745e(this.surfaceBright, hMSColorPalette.surfaceBright) && AbstractC22676k.m65745e(this.surfaceBrighter, hMSColorPalette.surfaceBrighter) && AbstractC22676k.m65745e(this.surfaceDefault, hMSColorPalette.surfaceDefault) && AbstractC22676k.m65745e(this.surfaceDim, hMSColorPalette.surfaceDim) && AbstractC22676k.m65745e(this.borderLight, hMSColorPalette.borderLight);
                }

                public final String getAlertErrorBright() {
                    return this.alertErrorBright;
                }

                public final String getAlertErrorBrighter() {
                    return this.alertErrorBrighter;
                }

                public final String getAlertErrorDefault() {
                    return this.alertErrorDefault;
                }

                public final String getAlertErrorDim() {
                    return this.alertErrorDim;
                }

                public final String getAlertSuccess() {
                    return this.alertSuccess;
                }

                public final String getAlertWarning() {
                    return this.alertWarning;
                }

                public final String getBackgroundDefault() {
                    return this.backgroundDefault;
                }

                public final String getBackgroundDim() {
                    return this.backgroundDim;
                }

                public final String getBorderBright() {
                    return this.borderBright;
                }

                public final String getBorderDefault() {
                    return this.borderDefault;
                }

                public final String getBorderLight() {
                    return this.borderLight;
                }

                public final String getOnPrimaryHigh() {
                    return this.onPrimaryHigh;
                }

                public final String getOnPrimaryLow() {
                    return this.onPrimaryLow;
                }

                public final String getOnPrimaryMedium() {
                    return this.onPrimaryMedium;
                }

                public final String getOnSecondaryHigh() {
                    return this.onSecondaryHigh;
                }

                public final String getOnSecondaryLow() {
                    return this.onSecondaryLow;
                }

                public final String getOnSecondaryMedium() {
                    return this.onSecondaryMedium;
                }

                public final String getOnSurfaceHigh() {
                    return this.onSurfaceHigh;
                }

                public final String getOnSurfaceLow() {
                    return this.onSurfaceLow;
                }

                public final String getOnSurfaceMedium() {
                    return this.onSurfaceMedium;
                }

                public final String getPrimaryBright() {
                    return this.primaryBright;
                }

                public final String getPrimaryDefault() {
                    return this.primaryDefault;
                }

                public final String getPrimaryDim() {
                    return this.primaryDim;
                }

                public final String getPrimaryDisabled() {
                    return this.primaryDisabled;
                }

                public final String getSecondaryBright() {
                    return this.secondaryBright;
                }

                public final String getSecondaryDefault() {
                    return this.secondaryDefault;
                }

                public final String getSecondaryDim() {
                    return this.secondaryDim;
                }

                public final String getSecondaryDisabled() {
                    return this.secondaryDisabled;
                }

                public final String getSurfaceBright() {
                    return this.surfaceBright;
                }

                public final String getSurfaceBrighter() {
                    return this.surfaceBrighter;
                }

                public final String getSurfaceDefault() {
                    return this.surfaceDefault;
                }

                public final String getSurfaceDim() {
                    return this.surfaceDim;
                }

                public int hashCode() {
                    String str = this.alertErrorBright;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.alertErrorBrighter;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.alertErrorDefault;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.alertErrorDim;
                    int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.alertSuccess;
                    int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    String str6 = this.alertWarning;
                    int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    String str7 = this.backgroundDefault;
                    int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.backgroundDim;
                    int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                    String str9 = this.borderBright;
                    int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                    String str10 = this.borderDefault;
                    int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                    String str11 = this.onPrimaryHigh;
                    int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                    String str12 = this.onPrimaryLow;
                    int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
                    String str13 = this.onPrimaryMedium;
                    int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
                    String str14 = this.onSecondaryHigh;
                    int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
                    String str15 = this.onSecondaryLow;
                    int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
                    String str16 = this.onSecondaryMedium;
                    int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
                    String str17 = this.onSurfaceHigh;
                    int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
                    String str18 = this.onSurfaceLow;
                    int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
                    String str19 = this.onSurfaceMedium;
                    int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
                    String str20 = this.primaryBright;
                    int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
                    String str21 = this.primaryDefault;
                    int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
                    String str22 = this.primaryDim;
                    int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
                    String str23 = this.primaryDisabled;
                    int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
                    String str24 = this.secondaryBright;
                    int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
                    String str25 = this.secondaryDefault;
                    int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
                    String str26 = this.secondaryDim;
                    int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
                    String str27 = this.secondaryDisabled;
                    int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
                    String str28 = this.surfaceBright;
                    int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
                    String str29 = this.surfaceBrighter;
                    int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
                    String str30 = this.surfaceDefault;
                    int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
                    String str31 = this.surfaceDim;
                    int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
                    String str32 = this.borderLight;
                    return iHashCode31 + (str32 != null ? str32.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb4 = new StringBuilder("HMSColorPalette(alertErrorBright=");
                    sb4.append(this.alertErrorBright);
                    sb4.append(", alertErrorBrighter=");
                    sb4.append(this.alertErrorBrighter);
                    sb4.append(", alertErrorDefault=");
                    sb4.append(this.alertErrorDefault);
                    sb4.append(", alertErrorDim=");
                    sb4.append(this.alertErrorDim);
                    sb4.append(", alertSuccess=");
                    sb4.append(this.alertSuccess);
                    sb4.append(", alertWarning=");
                    sb4.append(this.alertWarning);
                    sb4.append(", backgroundDefault=");
                    sb4.append(this.backgroundDefault);
                    sb4.append(", backgroundDim=");
                    sb4.append(this.backgroundDim);
                    sb4.append(", borderBright=");
                    sb4.append(this.borderBright);
                    sb4.append(", borderDefault=");
                    sb4.append(this.borderDefault);
                    sb4.append(", onPrimaryHigh=");
                    sb4.append(this.onPrimaryHigh);
                    sb4.append(", onPrimaryLow=");
                    sb4.append(this.onPrimaryLow);
                    sb4.append(", onPrimaryMedium=");
                    sb4.append(this.onPrimaryMedium);
                    sb4.append(", onSecondaryHigh=");
                    sb4.append(this.onSecondaryHigh);
                    sb4.append(", onSecondaryLow=");
                    sb4.append(this.onSecondaryLow);
                    sb4.append(", onSecondaryMedium=");
                    sb4.append(this.onSecondaryMedium);
                    sb4.append(", onSurfaceHigh=");
                    sb4.append(this.onSurfaceHigh);
                    sb4.append(", onSurfaceLow=");
                    sb4.append(this.onSurfaceLow);
                    sb4.append(", onSurfaceMedium=");
                    sb4.append(this.onSurfaceMedium);
                    sb4.append(", primaryBright=");
                    sb4.append(this.primaryBright);
                    sb4.append(", primaryDefault=");
                    sb4.append(this.primaryDefault);
                    sb4.append(", primaryDim=");
                    sb4.append(this.primaryDim);
                    sb4.append(", primaryDisabled=");
                    sb4.append(this.primaryDisabled);
                    sb4.append(", secondaryBright=");
                    sb4.append(this.secondaryBright);
                    sb4.append(", secondaryDefault=");
                    sb4.append(this.secondaryDefault);
                    sb4.append(", secondaryDim=");
                    sb4.append(this.secondaryDim);
                    sb4.append(", secondaryDisabled=");
                    sb4.append(this.secondaryDisabled);
                    sb4.append(", surfaceBright=");
                    sb4.append(this.surfaceBright);
                    sb4.append(", surfaceBrighter=");
                    sb4.append(this.surfaceBrighter);
                    sb4.append(", surfaceDefault=");
                    sb4.append(this.surfaceDefault);
                    sb4.append(", surfaceDim=");
                    sb4.append(this.surfaceDim);
                    sb4.append(", borderLight=");
                    return AbstractC25012a.m73377j(sb4, this.borderLight, ')');
                }
            }

            public HMSRoomTheme(Boolean bool, String str, HMSColorPalette hMSColorPalette) {
                this.default = bool;
                this.name = str;
                this.palette = hMSColorPalette;
            }

            public static /* synthetic */ HMSRoomTheme copy$default(HMSRoomTheme hMSRoomTheme, Boolean bool, String str, HMSColorPalette hMSColorPalette, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    bool = hMSRoomTheme.default;
                }
                if ((i13 & 2) != 0) {
                    str = hMSRoomTheme.name;
                }
                if ((i13 & 4) != 0) {
                    hMSColorPalette = hMSRoomTheme.palette;
                }
                return hMSRoomTheme.copy(bool, str, hMSColorPalette);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Boolean getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final HMSColorPalette getPalette() {
                return this.palette;
            }

            public final HMSRoomTheme copy(Boolean bool, String name, HMSColorPalette palette) {
                return new HMSRoomTheme(bool, name, palette);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HMSRoomTheme)) {
                    return false;
                }
                HMSRoomTheme hMSRoomTheme = (HMSRoomTheme) other;
                return AbstractC22676k.m65745e(this.default, hMSRoomTheme.default) && AbstractC22676k.m65745e(this.name, hMSRoomTheme.name) && AbstractC22676k.m65745e(this.palette, hMSRoomTheme.palette);
            }

            public final Boolean getDefault() {
                return this.default;
            }

            public final String getName() {
                return this.name;
            }

            public final HMSColorPalette getPalette() {
                return this.palette;
            }

            public int hashCode() {
                Boolean bool = this.default;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.name;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                HMSColorPalette hMSColorPalette = this.palette;
                return iHashCode2 + (hMSColorPalette != null ? hMSColorPalette.hashCode() : 0);
            }

            public String toString() {
                return "HMSRoomTheme(default=" + this.default + ", name=" + this.name + ", palette=" + this.palette + ')';
            }
        }

        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Logo;", "", QueryParams.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class Logo {

            @SerializedName(QueryParams.URL)
            private final String url;

            public Logo(String str) {
                this.url = str;
            }

            public static /* synthetic */ Logo copy$default(Logo logo, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = logo.url;
                }
                return logo.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final Logo copy(String url) {
                return new Logo(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Logo) && AbstractC22676k.m65745e(this.url, ((Logo) other).url);
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC25012a.m73377j(new StringBuilder("Logo(url="), this.url, ')');
            }
        }

        @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens;", "", "conferencing", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing;", "leave", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Leave;", "preview", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview;", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Leave;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview;)V", "getConferencing", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing;", "getLeave", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Leave;", "getPreview", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Conferencing", "Leave", "Preview", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class Screens {

            @SerializedName("conferencing")
            private final Conferencing conferencing;

            @SerializedName("leave")
            private final Leave leave;

            @SerializedName("preview")
            private final Preview preview;

            @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing;", "", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default;", "hlsLiveStreaming", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default;)V", "getDefault", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default;", "getHlsLiveStreaming", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Default", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
            public static final /* data */ class Conferencing {

                @SerializedName(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)
                private final Default default;

                @SerializedName("hls_live_streaming")
                private final Default hlsLiveStreaming;

                @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default;", "", "elements", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements;", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements;)V", "getElements", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elements", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                public static final /* data */ class Default {

                    @SerializedName("elements")
                    private final Elements elements;

                    @Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\f>?@ABCDEFGHIBk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0081\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006J"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements;", "", HMSMessageType.CHAT, "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Chat;", "emojiReactions", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$EmojiReactions;", "handRaise", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HandRaise;", "onStageExp", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$OnStageExp;", "participantList", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$ParticipantList;", "videoTileLayout", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout;", "brb", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Brb;", "hlsLiveStreamingHeader", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HLSLiveStreamingHeader;", "virtualBackground", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSVirtualBackground;", "noiseCancellationElement", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Chat;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$EmojiReactions;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HandRaise;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$OnStageExp;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$ParticipantList;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Brb;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HLSLiveStreamingHeader;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSVirtualBackground;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;)V", "getChat", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Chat;", "getEmojiReactions", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$EmojiReactions;", "getHandRaise", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HandRaise;", "getOnStageExp", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$OnStageExp;", "getParticipantList", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$ParticipantList;", "getVideoTileLayout", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout;", "getBrb", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Brb;", "getHlsLiveStreamingHeader", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HLSLiveStreamingHeader;", "getVirtualBackground", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSVirtualBackground;", "getNoiseCancellationElement", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Chat", "RealTimeControls", "EmojiReactions", "HandRaise", "NoiseCancellationElement", "OnStageExp", "ParticipantList", "Brb", "VideoTileLayout", "HLSLiveStreamingHeader", "HMSVirtualBackground", "HMSBackgroundMedia", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                    public static final /* data */ class Elements {

                        @SerializedName("brb")
                        private final Brb brb;

                        @SerializedName(HMSMessageType.CHAT)
                        private final Chat chat;

                        @SerializedName("emoji_reactions")
                        private final EmojiReactions emojiReactions;

                        @SerializedName("hand_raise")
                        private final HandRaise handRaise;

                        @SerializedName("header")
                        private final HLSLiveStreamingHeader hlsLiveStreamingHeader;

                        @SerializedName("noise_cancellation")
                        private final NoiseCancellationElement noiseCancellationElement;

                        @SerializedName("on_stage_exp")
                        private final OnStageExp onStageExp;

                        @SerializedName("participant_list")
                        private final ParticipantList participantList;

                        @SerializedName("video_tile_layout")
                        private final VideoTileLayout videoTileLayout;

                        @SerializedName("virtual_background")
                        private final HMSVirtualBackground virtualBackground;

                        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Brb;", "", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final class Brb {
                        }

                        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jv\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Chat;", "", "allowPinningMessages", "", "initialState", "", "overlayView", "publicChatEnabled", "rolesWhiteList", "", "privateChatEnabled", "chatTitle", "messagePlaceholder", "realTimeControls", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$RealTimeControls;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$RealTimeControls;)V", "getAllowPinningMessages", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInitialState", "()Ljava/lang/String;", "getOverlayView", "getPublicChatEnabled", "()Z", "getRolesWhiteList", "()Ljava/util/List;", "getPrivateChatEnabled", "getChatTitle", "getMessagePlaceholder", "getRealTimeControls", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$RealTimeControls;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$RealTimeControls;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$Chat;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class Chat {

                            @SerializedName("allow_pinning_messages")
                            private final Boolean allowPinningMessages;

                            @SerializedName("chat_title")
                            private final String chatTitle;

                            @SerializedName("initial_state")
                            private final String initialState;

                            @SerializedName("message_placeholder")
                            private final String messagePlaceholder;

                            @SerializedName("is_overlay")
                            private final Boolean overlayView;

                            @SerializedName("private_chat_enabled")
                            private final boolean privateChatEnabled;

                            @SerializedName("public_chat_enabled")
                            private final boolean publicChatEnabled;

                            @SerializedName("real_time_controls")
                            private final RealTimeControls realTimeControls;

                            @SerializedName("roles_whitelist")
                            private final List<String> rolesWhiteList;

                            public Chat(Boolean bool, String str, Boolean bool2, boolean z4, List<String> list, boolean z13, String chatTitle, String messagePlaceholder, RealTimeControls realTimeControls) {
                                AbstractC22676k.m65750j(chatTitle, "chatTitle");
                                AbstractC22676k.m65750j(messagePlaceholder, "messagePlaceholder");
                                AbstractC22676k.m65750j(realTimeControls, "realTimeControls");
                                this.allowPinningMessages = bool;
                                this.initialState = str;
                                this.overlayView = bool2;
                                this.publicChatEnabled = z4;
                                this.rolesWhiteList = list;
                                this.privateChatEnabled = z13;
                                this.chatTitle = chatTitle;
                                this.messagePlaceholder = messagePlaceholder;
                                this.realTimeControls = realTimeControls;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public static /* synthetic */ Chat copy$default(Chat chat, Boolean bool, String str, Boolean bool2, boolean z4, List list, boolean z13, String str2, String str3, RealTimeControls realTimeControls, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    bool = chat.allowPinningMessages;
                                }
                                if ((i13 & 2) != 0) {
                                    str = chat.initialState;
                                }
                                if ((i13 & 4) != 0) {
                                    bool2 = chat.overlayView;
                                }
                                if ((i13 & 8) != 0) {
                                    z4 = chat.publicChatEnabled;
                                }
                                if ((i13 & 16) != 0) {
                                    list = chat.rolesWhiteList;
                                }
                                if ((i13 & 32) != 0) {
                                    z13 = chat.privateChatEnabled;
                                }
                                if ((i13 & 64) != 0) {
                                    str2 = chat.chatTitle;
                                }
                                if ((i13 & 128) != 0) {
                                    str3 = chat.messagePlaceholder;
                                }
                                if ((i13 & 256) != 0) {
                                    realTimeControls = chat.realTimeControls;
                                }
                                String str4 = str3;
                                RealTimeControls realTimeControls2 = realTimeControls;
                                boolean z14 = z13;
                                String str5 = str2;
                                List list2 = list;
                                Boolean bool3 = bool2;
                                return chat.copy(bool, str, bool3, z4, list2, z14, str5, str4, realTimeControls2);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final Boolean getAllowPinningMessages() {
                                return this.allowPinningMessages;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final String getInitialState() {
                                return this.initialState;
                            }

                            /* JADX INFO: renamed from: component3, reason: from getter */
                            public final Boolean getOverlayView() {
                                return this.overlayView;
                            }

                            /* JADX INFO: renamed from: component4, reason: from getter */
                            public final boolean getPublicChatEnabled() {
                                return this.publicChatEnabled;
                            }

                            public final List<String> component5() {
                                return this.rolesWhiteList;
                            }

                            /* JADX INFO: renamed from: component6, reason: from getter */
                            public final boolean getPrivateChatEnabled() {
                                return this.privateChatEnabled;
                            }

                            /* JADX INFO: renamed from: component7, reason: from getter */
                            public final String getChatTitle() {
                                return this.chatTitle;
                            }

                            /* JADX INFO: renamed from: component8, reason: from getter */
                            public final String getMessagePlaceholder() {
                                return this.messagePlaceholder;
                            }

                            /* JADX INFO: renamed from: component9, reason: from getter */
                            public final RealTimeControls getRealTimeControls() {
                                return this.realTimeControls;
                            }

                            public final Chat copy(Boolean allowPinningMessages, String initialState, Boolean overlayView, boolean publicChatEnabled, List<String> rolesWhiteList, boolean privateChatEnabled, String chatTitle, String messagePlaceholder, RealTimeControls realTimeControls) {
                                AbstractC22676k.m65750j(chatTitle, "chatTitle");
                                AbstractC22676k.m65750j(messagePlaceholder, "messagePlaceholder");
                                AbstractC22676k.m65750j(realTimeControls, "realTimeControls");
                                return new Chat(allowPinningMessages, initialState, overlayView, publicChatEnabled, rolesWhiteList, privateChatEnabled, chatTitle, messagePlaceholder, realTimeControls);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof Chat)) {
                                    return false;
                                }
                                Chat chat = (Chat) other;
                                return AbstractC22676k.m65745e(this.allowPinningMessages, chat.allowPinningMessages) && AbstractC22676k.m65745e(this.initialState, chat.initialState) && AbstractC22676k.m65745e(this.overlayView, chat.overlayView) && this.publicChatEnabled == chat.publicChatEnabled && AbstractC22676k.m65745e(this.rolesWhiteList, chat.rolesWhiteList) && this.privateChatEnabled == chat.privateChatEnabled && AbstractC22676k.m65745e(this.chatTitle, chat.chatTitle) && AbstractC22676k.m65745e(this.messagePlaceholder, chat.messagePlaceholder) && AbstractC22676k.m65745e(this.realTimeControls, chat.realTimeControls);
                            }

                            public final Boolean getAllowPinningMessages() {
                                return this.allowPinningMessages;
                            }

                            public final String getChatTitle() {
                                return this.chatTitle;
                            }

                            public final String getInitialState() {
                                return this.initialState;
                            }

                            public final String getMessagePlaceholder() {
                                return this.messagePlaceholder;
                            }

                            public final Boolean getOverlayView() {
                                return this.overlayView;
                            }

                            public final boolean getPrivateChatEnabled() {
                                return this.privateChatEnabled;
                            }

                            public final boolean getPublicChatEnabled() {
                                return this.publicChatEnabled;
                            }

                            public final RealTimeControls getRealTimeControls() {
                                return this.realTimeControls;
                            }

                            public final List<String> getRolesWhiteList() {
                                return this.rolesWhiteList;
                            }

                            public int hashCode() {
                                Boolean bool = this.allowPinningMessages;
                                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                                String str = this.initialState;
                                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                                Boolean bool2 = this.overlayView;
                                int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.publicChatEnabled);
                                List<String> list = this.rolesWhiteList;
                                return this.realTimeControls.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b((iM8289b + (list != null ? list.hashCode() : 0)) * 31, 31, this.privateChatEnabled), 31, this.chatTitle), 31, this.messagePlaceholder);
                            }

                            public String toString() {
                                return "Chat(allowPinningMessages=" + this.allowPinningMessages + ", initialState=" + this.initialState + ", overlayView=" + this.overlayView + ", publicChatEnabled=" + this.publicChatEnabled + ", rolesWhiteList=" + this.rolesWhiteList + ", privateChatEnabled=" + this.privateChatEnabled + ", chatTitle=" + this.chatTitle + ", messagePlaceholder=" + this.messagePlaceholder + ", realTimeControls=" + this.realTimeControls + ')';
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$EmojiReactions;", "", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final class EmojiReactions {
                        }

                        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HLSLiveStreamingHeader;", "", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class HLSLiveStreamingHeader {

                            @SerializedName("description")
                            private final String description;

                            @SerializedName("title")
                            private final String title;

                            public HLSLiveStreamingHeader(String str, String str2) {
                                this.title = str;
                                this.description = str2;
                            }

                            public static /* synthetic */ HLSLiveStreamingHeader copy$default(HLSLiveStreamingHeader hLSLiveStreamingHeader, String str, String str2, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    str = hLSLiveStreamingHeader.title;
                                }
                                if ((i13 & 2) != 0) {
                                    str2 = hLSLiveStreamingHeader.description;
                                }
                                return hLSLiveStreamingHeader.copy(str, str2);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final String getTitle() {
                                return this.title;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final String getDescription() {
                                return this.description;
                            }

                            public final HLSLiveStreamingHeader copy(String title, String description) {
                                return new HLSLiveStreamingHeader(title, description);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof HLSLiveStreamingHeader)) {
                                    return false;
                                }
                                HLSLiveStreamingHeader hLSLiveStreamingHeader = (HLSLiveStreamingHeader) other;
                                return AbstractC22676k.m65745e(this.title, hLSLiveStreamingHeader.title) && AbstractC22676k.m65745e(this.description, hLSLiveStreamingHeader.description);
                            }

                            public final String getDescription() {
                                return this.description;
                            }

                            public final String getTitle() {
                                return this.title;
                            }

                            public int hashCode() {
                                String str = this.title;
                                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                                String str2 = this.description;
                                return iHashCode + (str2 != null ? str2.hashCode() : 0);
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("HLSLiveStreamingHeader(title=");
                                sb4.append(this.title);
                                sb4.append(", description=");
                                return AbstractC25012a.m73377j(sb4, this.description, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSBackgroundMedia;", "", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "", QueryParams.URL, "", "mediaType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUrl", "()Ljava/lang/String;", "getMediaType", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSBackgroundMedia;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class HMSBackgroundMedia {

                            @SerializedName(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)
                            private final Boolean default;

                            @SerializedName("media_type")
                            private final String mediaType;

                            @SerializedName(QueryParams.URL)
                            private final String url;

                            public HMSBackgroundMedia(Boolean bool, String str, String str2) {
                                this.default = bool;
                                this.url = str;
                                this.mediaType = str2;
                            }

                            public static /* synthetic */ HMSBackgroundMedia copy$default(HMSBackgroundMedia hMSBackgroundMedia, Boolean bool, String str, String str2, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    bool = hMSBackgroundMedia.default;
                                }
                                if ((i13 & 2) != 0) {
                                    str = hMSBackgroundMedia.url;
                                }
                                if ((i13 & 4) != 0) {
                                    str2 = hMSBackgroundMedia.mediaType;
                                }
                                return hMSBackgroundMedia.copy(bool, str, str2);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final Boolean getDefault() {
                                return this.default;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final String getUrl() {
                                return this.url;
                            }

                            /* JADX INFO: renamed from: component3, reason: from getter */
                            public final String getMediaType() {
                                return this.mediaType;
                            }

                            public final HMSBackgroundMedia copy(Boolean bool, String url, String mediaType) {
                                return new HMSBackgroundMedia(bool, url, mediaType);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof HMSBackgroundMedia)) {
                                    return false;
                                }
                                HMSBackgroundMedia hMSBackgroundMedia = (HMSBackgroundMedia) other;
                                return AbstractC22676k.m65745e(this.default, hMSBackgroundMedia.default) && AbstractC22676k.m65745e(this.url, hMSBackgroundMedia.url) && AbstractC22676k.m65745e(this.mediaType, hMSBackgroundMedia.mediaType);
                            }

                            public final Boolean getDefault() {
                                return this.default;
                            }

                            public final String getMediaType() {
                                return this.mediaType;
                            }

                            public final String getUrl() {
                                return this.url;
                            }

                            public int hashCode() {
                                Boolean bool = this.default;
                                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                                String str = this.url;
                                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                                String str2 = this.mediaType;
                                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("HMSBackgroundMedia(default=");
                                sb4.append(this.default);
                                sb4.append(", url=");
                                sb4.append(this.url);
                                sb4.append(", mediaType=");
                                return AbstractC25012a.m73377j(sb4, this.mediaType, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSVirtualBackground;", "", "backgroundMedia", "", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HMSBackgroundMedia;", "<init>", "(Ljava/util/List;)V", "getBackgroundMedia", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class HMSVirtualBackground {

                            @SerializedName("background_media")
                            private final List<HMSBackgroundMedia> backgroundMedia;

                            public HMSVirtualBackground(List<HMSBackgroundMedia> list) {
                                this.backgroundMedia = list;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public static /* synthetic */ HMSVirtualBackground copy$default(HMSVirtualBackground hMSVirtualBackground, List list, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    list = hMSVirtualBackground.backgroundMedia;
                                }
                                return hMSVirtualBackground.copy(list);
                            }

                            public final List<HMSBackgroundMedia> component1() {
                                return this.backgroundMedia;
                            }

                            public final HMSVirtualBackground copy(List<HMSBackgroundMedia> backgroundMedia) {
                                return new HMSVirtualBackground(backgroundMedia);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof HMSVirtualBackground) && AbstractC22676k.m65745e(this.backgroundMedia, ((HMSVirtualBackground) other).backgroundMedia);
                            }

                            public final List<HMSBackgroundMedia> getBackgroundMedia() {
                                return this.backgroundMedia;
                            }

                            public int hashCode() {
                                List<HMSBackgroundMedia> list = this.backgroundMedia;
                                if (list == null) {
                                    return 0;
                                }
                                return list.hashCode();
                            }

                            public String toString() {
                                return AbstractC17176i.m48506h(new StringBuilder("HMSVirtualBackground(backgroundMedia="), this.backgroundMedia, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$HandRaise;", "", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final class HandRaise {
                        }

                        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;", "", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class NoiseCancellationElement {

                            @SerializedName("enabled_by_default")
                            private final boolean enabled;

                            public NoiseCancellationElement(boolean z4) {
                                this.enabled = z4;
                            }

                            public static /* synthetic */ NoiseCancellationElement copy$default(NoiseCancellationElement noiseCancellationElement, boolean z4, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    z4 = noiseCancellationElement.enabled;
                                }
                                return noiseCancellationElement.copy(z4);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final boolean getEnabled() {
                                return this.enabled;
                            }

                            public final NoiseCancellationElement copy(boolean enabled) {
                                return new NoiseCancellationElement(enabled);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof NoiseCancellationElement) && this.enabled == ((NoiseCancellationElement) other).enabled;
                            }

                            public final boolean getEnabled() {
                                return this.enabled;
                            }

                            public int hashCode() {
                                return Boolean.hashCode(this.enabled);
                            }

                            public String toString() {
                                return AbstractC2875y.m8305r(new StringBuilder("NoiseCancellationElement(enabled="), this.enabled, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JR\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$OnStageExp;", "", "bringToStageLabel", "", "offStageRoles", "", "onStageRole", "removeFromStageLabel", "skipPreviewForRoleChange", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBringToStageLabel", "()Ljava/lang/String;", "getOffStageRoles", "()Ljava/util/List;", "getOnStageRole", "getRemoveFromStageLabel", "getSkipPreviewForRoleChange", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$OnStageExp;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class OnStageExp {

                            @SerializedName("bring_to_stage_label")
                            private final String bringToStageLabel;

                            @SerializedName("off_stage_roles")
                            private final List<String> offStageRoles;

                            @SerializedName("on_stage_role")
                            private final String onStageRole;

                            @SerializedName("remove_from_stage_label")
                            private final String removeFromStageLabel;

                            @SerializedName("skip_preview_for_role_change")
                            private final Boolean skipPreviewForRoleChange;

                            public OnStageExp(String str, List<String> list, String str2, String str3, Boolean bool) {
                                this.bringToStageLabel = str;
                                this.offStageRoles = list;
                                this.onStageRole = str2;
                                this.removeFromStageLabel = str3;
                                this.skipPreviewForRoleChange = bool;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public static /* synthetic */ OnStageExp copy$default(OnStageExp onStageExp, String str, List list, String str2, String str3, Boolean bool, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    str = onStageExp.bringToStageLabel;
                                }
                                if ((i13 & 2) != 0) {
                                    list = onStageExp.offStageRoles;
                                }
                                if ((i13 & 4) != 0) {
                                    str2 = onStageExp.onStageRole;
                                }
                                if ((i13 & 8) != 0) {
                                    str3 = onStageExp.removeFromStageLabel;
                                }
                                if ((i13 & 16) != 0) {
                                    bool = onStageExp.skipPreviewForRoleChange;
                                }
                                Boolean bool2 = bool;
                                String str4 = str2;
                                return onStageExp.copy(str, list, str4, str3, bool2);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final String getBringToStageLabel() {
                                return this.bringToStageLabel;
                            }

                            public final List<String> component2() {
                                return this.offStageRoles;
                            }

                            /* JADX INFO: renamed from: component3, reason: from getter */
                            public final String getOnStageRole() {
                                return this.onStageRole;
                            }

                            /* JADX INFO: renamed from: component4, reason: from getter */
                            public final String getRemoveFromStageLabel() {
                                return this.removeFromStageLabel;
                            }

                            /* JADX INFO: renamed from: component5, reason: from getter */
                            public final Boolean getSkipPreviewForRoleChange() {
                                return this.skipPreviewForRoleChange;
                            }

                            public final OnStageExp copy(String bringToStageLabel, List<String> offStageRoles, String onStageRole, String removeFromStageLabel, Boolean skipPreviewForRoleChange) {
                                return new OnStageExp(bringToStageLabel, offStageRoles, onStageRole, removeFromStageLabel, skipPreviewForRoleChange);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof OnStageExp)) {
                                    return false;
                                }
                                OnStageExp onStageExp = (OnStageExp) other;
                                return AbstractC22676k.m65745e(this.bringToStageLabel, onStageExp.bringToStageLabel) && AbstractC22676k.m65745e(this.offStageRoles, onStageExp.offStageRoles) && AbstractC22676k.m65745e(this.onStageRole, onStageExp.onStageRole) && AbstractC22676k.m65745e(this.removeFromStageLabel, onStageExp.removeFromStageLabel) && AbstractC22676k.m65745e(this.skipPreviewForRoleChange, onStageExp.skipPreviewForRoleChange);
                            }

                            public final String getBringToStageLabel() {
                                return this.bringToStageLabel;
                            }

                            public final List<String> getOffStageRoles() {
                                return this.offStageRoles;
                            }

                            public final String getOnStageRole() {
                                return this.onStageRole;
                            }

                            public final String getRemoveFromStageLabel() {
                                return this.removeFromStageLabel;
                            }

                            public final Boolean getSkipPreviewForRoleChange() {
                                return this.skipPreviewForRoleChange;
                            }

                            public int hashCode() {
                                String str = this.bringToStageLabel;
                                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                                List<String> list = this.offStageRoles;
                                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                                String str2 = this.onStageRole;
                                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                                String str3 = this.removeFromStageLabel;
                                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                                Boolean bool = this.skipPreviewForRoleChange;
                                return iHashCode4 + (bool != null ? bool.hashCode() : 0);
                            }

                            public String toString() {
                                return "OnStageExp(bringToStageLabel=" + this.bringToStageLabel + ", offStageRoles=" + this.offStageRoles + ", onStageRole=" + this.onStageRole + ", removeFromStageLabel=" + this.removeFromStageLabel + ", skipPreviewForRoleChange=" + this.skipPreviewForRoleChange + ')';
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$ParticipantList;", "", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final class ParticipantList {
                        }

                        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$RealTimeControls;", "", "canDisableChat", "", "canBlockUser", "canHideMessage", "<init>", "(ZZZ)V", "getCanDisableChat", "()Z", "getCanBlockUser", "getCanHideMessage", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class RealTimeControls {

                            @SerializedName("can_block_user")
                            private final boolean canBlockUser;

                            @SerializedName("can_disable_chat")
                            private final boolean canDisableChat;

                            @SerializedName("can_hide_message")
                            private final boolean canHideMessage;

                            public RealTimeControls(boolean z4, boolean z13, boolean z14) {
                                this.canDisableChat = z4;
                                this.canBlockUser = z13;
                                this.canHideMessage = z14;
                            }

                            public static /* synthetic */ RealTimeControls copy$default(RealTimeControls realTimeControls, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    z4 = realTimeControls.canDisableChat;
                                }
                                if ((i13 & 2) != 0) {
                                    z13 = realTimeControls.canBlockUser;
                                }
                                if ((i13 & 4) != 0) {
                                    z14 = realTimeControls.canHideMessage;
                                }
                                return realTimeControls.copy(z4, z13, z14);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final boolean getCanDisableChat() {
                                return this.canDisableChat;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final boolean getCanBlockUser() {
                                return this.canBlockUser;
                            }

                            /* JADX INFO: renamed from: component3, reason: from getter */
                            public final boolean getCanHideMessage() {
                                return this.canHideMessage;
                            }

                            public final RealTimeControls copy(boolean canDisableChat, boolean canBlockUser, boolean canHideMessage) {
                                return new RealTimeControls(canDisableChat, canBlockUser, canHideMessage);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof RealTimeControls)) {
                                    return false;
                                }
                                RealTimeControls realTimeControls = (RealTimeControls) other;
                                return this.canDisableChat == realTimeControls.canDisableChat && this.canBlockUser == realTimeControls.canBlockUser && this.canHideMessage == realTimeControls.canHideMessage;
                            }

                            public final boolean getCanBlockUser() {
                                return this.canBlockUser;
                            }

                            public final boolean getCanDisableChat() {
                                return this.canDisableChat;
                            }

                            public final boolean getCanHideMessage() {
                                return this.canHideMessage;
                            }

                            public int hashCode() {
                                return Boolean.hashCode(this.canHideMessage) + AbstractC2875y.m8289b(Boolean.hashCode(this.canDisableChat) * 31, 31, this.canBlockUser);
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("RealTimeControls(canDisableChat=");
                                sb4.append(this.canDisableChat);
                                sb4.append(", canBlockUser=");
                                sb4.append(this.canBlockUser);
                                sb4.append(", canHideMessage=");
                                return AbstractC2875y.m8305r(sb4, this.canHideMessage, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout;", "", "grid", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout$Grid;", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout$Grid;)V", "getGrid", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout$Grid;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Grid", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class VideoTileLayout {

                            @SerializedName("grid")
                            private final Grid grid;

                            @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0003J:\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout$Grid;", "", "enableLocalTileInset", "", "enableSpotlightingPeer", "prominentRoles", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getEnableLocalTileInset", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableSpotlightingPeer", "getProminentRoles", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$VideoTileLayout$Grid;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                            public static final /* data */ class Grid {

                                @SerializedName("enable_local_tile_inset")
                                private final Boolean enableLocalTileInset;

                                @SerializedName("enable_spotlighting_peer")
                                private final Boolean enableSpotlightingPeer;

                                @SerializedName("prominent_roles")
                                private final List<Object> prominentRoles;

                                public Grid(Boolean bool, Boolean bool2, List<? extends Object> list) {
                                    this.enableLocalTileInset = bool;
                                    this.enableSpotlightingPeer = bool2;
                                    this.prominentRoles = list;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public static /* synthetic */ Grid copy$default(Grid grid, Boolean bool, Boolean bool2, List list, int i13, Object obj) {
                                    if ((i13 & 1) != 0) {
                                        bool = grid.enableLocalTileInset;
                                    }
                                    if ((i13 & 2) != 0) {
                                        bool2 = grid.enableSpotlightingPeer;
                                    }
                                    if ((i13 & 4) != 0) {
                                        list = grid.prominentRoles;
                                    }
                                    return grid.copy(bool, bool2, list);
                                }

                                /* JADX INFO: renamed from: component1, reason: from getter */
                                public final Boolean getEnableLocalTileInset() {
                                    return this.enableLocalTileInset;
                                }

                                /* JADX INFO: renamed from: component2, reason: from getter */
                                public final Boolean getEnableSpotlightingPeer() {
                                    return this.enableSpotlightingPeer;
                                }

                                public final List<Object> component3() {
                                    return this.prominentRoles;
                                }

                                public final Grid copy(Boolean enableLocalTileInset, Boolean enableSpotlightingPeer, List<? extends Object> prominentRoles) {
                                    return new Grid(enableLocalTileInset, enableSpotlightingPeer, prominentRoles);
                                }

                                public boolean equals(Object other) {
                                    if (this == other) {
                                        return true;
                                    }
                                    if (!(other instanceof Grid)) {
                                        return false;
                                    }
                                    Grid grid = (Grid) other;
                                    return AbstractC22676k.m65745e(this.enableLocalTileInset, grid.enableLocalTileInset) && AbstractC22676k.m65745e(this.enableSpotlightingPeer, grid.enableSpotlightingPeer) && AbstractC22676k.m65745e(this.prominentRoles, grid.prominentRoles);
                                }

                                public final Boolean getEnableLocalTileInset() {
                                    return this.enableLocalTileInset;
                                }

                                public final Boolean getEnableSpotlightingPeer() {
                                    return this.enableSpotlightingPeer;
                                }

                                public final List<Object> getProminentRoles() {
                                    return this.prominentRoles;
                                }

                                public int hashCode() {
                                    Boolean bool = this.enableLocalTileInset;
                                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                                    Boolean bool2 = this.enableSpotlightingPeer;
                                    int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                                    List<Object> list = this.prominentRoles;
                                    return iHashCode2 + (list != null ? list.hashCode() : 0);
                                }

                                public String toString() {
                                    StringBuilder sb4 = new StringBuilder("Grid(enableLocalTileInset=");
                                    sb4.append(this.enableLocalTileInset);
                                    sb4.append(", enableSpotlightingPeer=");
                                    sb4.append(this.enableSpotlightingPeer);
                                    sb4.append(", prominentRoles=");
                                    return AbstractC17176i.m48506h(sb4, this.prominentRoles, ')');
                                }
                            }

                            public VideoTileLayout(Grid grid) {
                                this.grid = grid;
                            }

                            public static /* synthetic */ VideoTileLayout copy$default(VideoTileLayout videoTileLayout, Grid grid, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    grid = videoTileLayout.grid;
                                }
                                return videoTileLayout.copy(grid);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final Grid getGrid() {
                                return this.grid;
                            }

                            public final VideoTileLayout copy(Grid grid) {
                                return new VideoTileLayout(grid);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof VideoTileLayout) && AbstractC22676k.m65745e(this.grid, ((VideoTileLayout) other).grid);
                            }

                            public final Grid getGrid() {
                                return this.grid;
                            }

                            public int hashCode() {
                                Grid grid = this.grid;
                                if (grid == null) {
                                    return 0;
                                }
                                return grid.hashCode();
                            }

                            public String toString() {
                                return "VideoTileLayout(grid=" + this.grid + ')';
                            }
                        }

                        public Elements(Chat chat, EmojiReactions emojiReactions, HandRaise handRaise, OnStageExp onStageExp, ParticipantList participantList, VideoTileLayout videoTileLayout, Brb brb, HLSLiveStreamingHeader hLSLiveStreamingHeader, HMSVirtualBackground hMSVirtualBackground, NoiseCancellationElement noiseCancellationElement) {
                            this.chat = chat;
                            this.emojiReactions = emojiReactions;
                            this.handRaise = handRaise;
                            this.onStageExp = onStageExp;
                            this.participantList = participantList;
                            this.videoTileLayout = videoTileLayout;
                            this.brb = brb;
                            this.hlsLiveStreamingHeader = hLSLiveStreamingHeader;
                            this.virtualBackground = hMSVirtualBackground;
                            this.noiseCancellationElement = noiseCancellationElement;
                        }

                        public static /* synthetic */ Elements copy$default(Elements elements, Chat chat, EmojiReactions emojiReactions, HandRaise handRaise, OnStageExp onStageExp, ParticipantList participantList, VideoTileLayout videoTileLayout, Brb brb, HLSLiveStreamingHeader hLSLiveStreamingHeader, HMSVirtualBackground hMSVirtualBackground, NoiseCancellationElement noiseCancellationElement, int i13, Object obj) {
                            if ((i13 & 1) != 0) {
                                chat = elements.chat;
                            }
                            if ((i13 & 2) != 0) {
                                emojiReactions = elements.emojiReactions;
                            }
                            if ((i13 & 4) != 0) {
                                handRaise = elements.handRaise;
                            }
                            if ((i13 & 8) != 0) {
                                onStageExp = elements.onStageExp;
                            }
                            if ((i13 & 16) != 0) {
                                participantList = elements.participantList;
                            }
                            if ((i13 & 32) != 0) {
                                videoTileLayout = elements.videoTileLayout;
                            }
                            if ((i13 & 64) != 0) {
                                brb = elements.brb;
                            }
                            if ((i13 & 128) != 0) {
                                hLSLiveStreamingHeader = elements.hlsLiveStreamingHeader;
                            }
                            if ((i13 & 256) != 0) {
                                hMSVirtualBackground = elements.virtualBackground;
                            }
                            if ((i13 & 512) != 0) {
                                noiseCancellationElement = elements.noiseCancellationElement;
                            }
                            HMSVirtualBackground hMSVirtualBackground2 = hMSVirtualBackground;
                            NoiseCancellationElement noiseCancellationElement2 = noiseCancellationElement;
                            Brb brb2 = brb;
                            HLSLiveStreamingHeader hLSLiveStreamingHeader2 = hLSLiveStreamingHeader;
                            ParticipantList participantList2 = participantList;
                            VideoTileLayout videoTileLayout2 = videoTileLayout;
                            return elements.copy(chat, emojiReactions, handRaise, onStageExp, participantList2, videoTileLayout2, brb2, hLSLiveStreamingHeader2, hMSVirtualBackground2, noiseCancellationElement2);
                        }

                        /* JADX INFO: renamed from: component1, reason: from getter */
                        public final Chat getChat() {
                            return this.chat;
                        }

                        /* JADX INFO: renamed from: component10, reason: from getter */
                        public final NoiseCancellationElement getNoiseCancellationElement() {
                            return this.noiseCancellationElement;
                        }

                        /* JADX INFO: renamed from: component2, reason: from getter */
                        public final EmojiReactions getEmojiReactions() {
                            return this.emojiReactions;
                        }

                        /* JADX INFO: renamed from: component3, reason: from getter */
                        public final HandRaise getHandRaise() {
                            return this.handRaise;
                        }

                        /* JADX INFO: renamed from: component4, reason: from getter */
                        public final OnStageExp getOnStageExp() {
                            return this.onStageExp;
                        }

                        /* JADX INFO: renamed from: component5, reason: from getter */
                        public final ParticipantList getParticipantList() {
                            return this.participantList;
                        }

                        /* JADX INFO: renamed from: component6, reason: from getter */
                        public final VideoTileLayout getVideoTileLayout() {
                            return this.videoTileLayout;
                        }

                        /* JADX INFO: renamed from: component7, reason: from getter */
                        public final Brb getBrb() {
                            return this.brb;
                        }

                        /* JADX INFO: renamed from: component8, reason: from getter */
                        public final HLSLiveStreamingHeader getHlsLiveStreamingHeader() {
                            return this.hlsLiveStreamingHeader;
                        }

                        /* JADX INFO: renamed from: component9, reason: from getter */
                        public final HMSVirtualBackground getVirtualBackground() {
                            return this.virtualBackground;
                        }

                        public final Elements copy(Chat chat, EmojiReactions emojiReactions, HandRaise handRaise, OnStageExp onStageExp, ParticipantList participantList, VideoTileLayout videoTileLayout, Brb brb, HLSLiveStreamingHeader hlsLiveStreamingHeader, HMSVirtualBackground virtualBackground, NoiseCancellationElement noiseCancellationElement) {
                            return new Elements(chat, emojiReactions, handRaise, onStageExp, participantList, videoTileLayout, brb, hlsLiveStreamingHeader, virtualBackground, noiseCancellationElement);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Elements)) {
                                return false;
                            }
                            Elements elements = (Elements) other;
                            return AbstractC22676k.m65745e(this.chat, elements.chat) && AbstractC22676k.m65745e(this.emojiReactions, elements.emojiReactions) && AbstractC22676k.m65745e(this.handRaise, elements.handRaise) && AbstractC22676k.m65745e(this.onStageExp, elements.onStageExp) && AbstractC22676k.m65745e(this.participantList, elements.participantList) && AbstractC22676k.m65745e(this.videoTileLayout, elements.videoTileLayout) && AbstractC22676k.m65745e(this.brb, elements.brb) && AbstractC22676k.m65745e(this.hlsLiveStreamingHeader, elements.hlsLiveStreamingHeader) && AbstractC22676k.m65745e(this.virtualBackground, elements.virtualBackground) && AbstractC22676k.m65745e(this.noiseCancellationElement, elements.noiseCancellationElement);
                        }

                        public final Brb getBrb() {
                            return this.brb;
                        }

                        public final Chat getChat() {
                            return this.chat;
                        }

                        public final EmojiReactions getEmojiReactions() {
                            return this.emojiReactions;
                        }

                        public final HandRaise getHandRaise() {
                            return this.handRaise;
                        }

                        public final HLSLiveStreamingHeader getHlsLiveStreamingHeader() {
                            return this.hlsLiveStreamingHeader;
                        }

                        public final NoiseCancellationElement getNoiseCancellationElement() {
                            return this.noiseCancellationElement;
                        }

                        public final OnStageExp getOnStageExp() {
                            return this.onStageExp;
                        }

                        public final ParticipantList getParticipantList() {
                            return this.participantList;
                        }

                        public final VideoTileLayout getVideoTileLayout() {
                            return this.videoTileLayout;
                        }

                        public final HMSVirtualBackground getVirtualBackground() {
                            return this.virtualBackground;
                        }

                        public int hashCode() {
                            Chat chat = this.chat;
                            int iHashCode = (chat == null ? 0 : chat.hashCode()) * 31;
                            EmojiReactions emojiReactions = this.emojiReactions;
                            int iHashCode2 = (iHashCode + (emojiReactions == null ? 0 : emojiReactions.hashCode())) * 31;
                            HandRaise handRaise = this.handRaise;
                            int iHashCode3 = (iHashCode2 + (handRaise == null ? 0 : handRaise.hashCode())) * 31;
                            OnStageExp onStageExp = this.onStageExp;
                            int iHashCode4 = (iHashCode3 + (onStageExp == null ? 0 : onStageExp.hashCode())) * 31;
                            ParticipantList participantList = this.participantList;
                            int iHashCode5 = (iHashCode4 + (participantList == null ? 0 : participantList.hashCode())) * 31;
                            VideoTileLayout videoTileLayout = this.videoTileLayout;
                            int iHashCode6 = (iHashCode5 + (videoTileLayout == null ? 0 : videoTileLayout.hashCode())) * 31;
                            Brb brb = this.brb;
                            int iHashCode7 = (iHashCode6 + (brb == null ? 0 : brb.hashCode())) * 31;
                            HLSLiveStreamingHeader hLSLiveStreamingHeader = this.hlsLiveStreamingHeader;
                            int iHashCode8 = (iHashCode7 + (hLSLiveStreamingHeader == null ? 0 : hLSLiveStreamingHeader.hashCode())) * 31;
                            HMSVirtualBackground hMSVirtualBackground = this.virtualBackground;
                            int iHashCode9 = (iHashCode8 + (hMSVirtualBackground == null ? 0 : hMSVirtualBackground.hashCode())) * 31;
                            NoiseCancellationElement noiseCancellationElement = this.noiseCancellationElement;
                            return iHashCode9 + (noiseCancellationElement != null ? noiseCancellationElement.hashCode() : 0);
                        }

                        public String toString() {
                            return "Elements(chat=" + this.chat + ", emojiReactions=" + this.emojiReactions + ", handRaise=" + this.handRaise + ", onStageExp=" + this.onStageExp + ", participantList=" + this.participantList + ", videoTileLayout=" + this.videoTileLayout + ", brb=" + this.brb + ", hlsLiveStreamingHeader=" + this.hlsLiveStreamingHeader + ", virtualBackground=" + this.virtualBackground + ", noiseCancellationElement=" + this.noiseCancellationElement + ')';
                        }
                    }

                    public Default(Elements elements) {
                        this.elements = elements;
                    }

                    public static /* synthetic */ Default copy$default(Default r10, Elements elements, int i13, Object obj) {
                        if ((i13 & 1) != 0) {
                            elements = r10.elements;
                        }
                        return r10.copy(elements);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final Elements getElements() {
                        return this.elements;
                    }

                    public final Default copy(Elements elements) {
                        return new Default(elements);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Default) && AbstractC22676k.m65745e(this.elements, ((Default) other).elements);
                    }

                    public final Elements getElements() {
                        return this.elements;
                    }

                    public int hashCode() {
                        Elements elements = this.elements;
                        if (elements == null) {
                            return 0;
                        }
                        return elements.hashCode();
                    }

                    public String toString() {
                        return "Default(elements=" + this.elements + ')';
                    }
                }

                public Conferencing(Default r10, Default r14) {
                    this.default = r10;
                    this.hlsLiveStreaming = r14;
                }

                public static /* synthetic */ Conferencing copy$default(Conferencing conferencing, Default r10, Default r14, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        r10 = conferencing.default;
                    }
                    if ((i13 & 2) != 0) {
                        r14 = conferencing.hlsLiveStreaming;
                    }
                    return conferencing.copy(r10, r14);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Default getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Default getHlsLiveStreaming() {
                    return this.hlsLiveStreaming;
                }

                public final Conferencing copy(Default r10, Default hlsLiveStreaming) {
                    return new Conferencing(r10, hlsLiveStreaming);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Conferencing)) {
                        return false;
                    }
                    Conferencing conferencing = (Conferencing) other;
                    return AbstractC22676k.m65745e(this.default, conferencing.default) && AbstractC22676k.m65745e(this.hlsLiveStreaming, conferencing.hlsLiveStreaming);
                }

                public final Default getDefault() {
                    return this.default;
                }

                public final Default getHlsLiveStreaming() {
                    return this.hlsLiveStreaming;
                }

                public int hashCode() {
                    Default r10 = this.default;
                    int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
                    Default r14 = this.hlsLiveStreaming;
                    return iHashCode + (r14 != null ? r14.hashCode() : 0);
                }

                public String toString() {
                    return "Conferencing(default=" + this.default + ", hlsLiveStreaming=" + this.hlsLiveStreaming + ')';
                }
            }

            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Leave;", "", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
            public static final class Leave {
            }

            @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview;", "", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default;", "skipPreview", "", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default;Ljava/lang/Boolean;)V", "getDefault", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default;", "getSkipPreview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default;Ljava/lang/Boolean;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview;", "equals", "other", "hashCode", "", "toString", "", "Default", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
            public static final /* data */ class Preview {

                @SerializedName(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)
                private final Default default;

                @SerializedName("skip_preview_screen")
                private final Boolean skipPreview;

                @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default;", "", "elements", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements;", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements;)V", "getElements", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elements", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                public static final /* data */ class Default {

                    @SerializedName("elements")
                    private final Elements elements;

                    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005 !\"#$B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements;", "", "joinForm", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$JoinForm;", "previewHeader", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$PreviewHeader;", "virtualBackground", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSVirtualBackground;", "noiseCancellationElement", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$NoiseCancellationElement;", "<init>", "(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$JoinForm;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$PreviewHeader;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSVirtualBackground;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$NoiseCancellationElement;)V", "getJoinForm", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$JoinForm;", "getPreviewHeader", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$PreviewHeader;", "getVirtualBackground", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSVirtualBackground;", "getNoiseCancellationElement", "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$NoiseCancellationElement;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "JoinForm", "PreviewHeader", "HMSVirtualBackground", "HMSBackgroundMedia", "NoiseCancellationElement", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                    public static final /* data */ class Elements {

                        @SerializedName("join_form")
                        private final JoinForm joinForm;

                        @SerializedName("noise_cancellation")
                        private final NoiseCancellationElement noiseCancellationElement;

                        @SerializedName("preview_header")
                        private final PreviewHeader previewHeader;

                        @SerializedName("virtual_background")
                        private final HMSVirtualBackground virtualBackground;

                        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSBackgroundMedia;", "", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "", QueryParams.URL, "", "mediaType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUrl", "()Ljava/lang/String;", "getMediaType", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSBackgroundMedia;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class HMSBackgroundMedia {

                            @SerializedName(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)
                            private final Boolean default;

                            @SerializedName("media_type")
                            private final String mediaType;

                            @SerializedName(QueryParams.URL)
                            private final String url;

                            public HMSBackgroundMedia(Boolean bool, String str, String str2) {
                                this.default = bool;
                                this.url = str;
                                this.mediaType = str2;
                            }

                            public static /* synthetic */ HMSBackgroundMedia copy$default(HMSBackgroundMedia hMSBackgroundMedia, Boolean bool, String str, String str2, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    bool = hMSBackgroundMedia.default;
                                }
                                if ((i13 & 2) != 0) {
                                    str = hMSBackgroundMedia.url;
                                }
                                if ((i13 & 4) != 0) {
                                    str2 = hMSBackgroundMedia.mediaType;
                                }
                                return hMSBackgroundMedia.copy(bool, str, str2);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final Boolean getDefault() {
                                return this.default;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final String getUrl() {
                                return this.url;
                            }

                            /* JADX INFO: renamed from: component3, reason: from getter */
                            public final String getMediaType() {
                                return this.mediaType;
                            }

                            public final HMSBackgroundMedia copy(Boolean bool, String url, String mediaType) {
                                return new HMSBackgroundMedia(bool, url, mediaType);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof HMSBackgroundMedia)) {
                                    return false;
                                }
                                HMSBackgroundMedia hMSBackgroundMedia = (HMSBackgroundMedia) other;
                                return AbstractC22676k.m65745e(this.default, hMSBackgroundMedia.default) && AbstractC22676k.m65745e(this.url, hMSBackgroundMedia.url) && AbstractC22676k.m65745e(this.mediaType, hMSBackgroundMedia.mediaType);
                            }

                            public final Boolean getDefault() {
                                return this.default;
                            }

                            public final String getMediaType() {
                                return this.mediaType;
                            }

                            public final String getUrl() {
                                return this.url;
                            }

                            public int hashCode() {
                                Boolean bool = this.default;
                                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                                String str = this.url;
                                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                                String str2 = this.mediaType;
                                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("HMSBackgroundMedia(default=");
                                sb4.append(this.default);
                                sb4.append(", url=");
                                sb4.append(this.url);
                                sb4.append(", mediaType=");
                                return AbstractC25012a.m73377j(sb4, this.mediaType, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSVirtualBackground;", "", "backgroundMedia", "", "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$HMSBackgroundMedia;", "<init>", "(Ljava/util/List;)V", "getBackgroundMedia", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class HMSVirtualBackground {

                            @SerializedName("background_media")
                            private final List<HMSBackgroundMedia> backgroundMedia;

                            public HMSVirtualBackground(List<HMSBackgroundMedia> list) {
                                this.backgroundMedia = list;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public static /* synthetic */ HMSVirtualBackground copy$default(HMSVirtualBackground hMSVirtualBackground, List list, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    list = hMSVirtualBackground.backgroundMedia;
                                }
                                return hMSVirtualBackground.copy(list);
                            }

                            public final List<HMSBackgroundMedia> component1() {
                                return this.backgroundMedia;
                            }

                            public final HMSVirtualBackground copy(List<HMSBackgroundMedia> backgroundMedia) {
                                return new HMSVirtualBackground(backgroundMedia);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof HMSVirtualBackground) && AbstractC22676k.m65745e(this.backgroundMedia, ((HMSVirtualBackground) other).backgroundMedia);
                            }

                            public final List<HMSBackgroundMedia> getBackgroundMedia() {
                                return this.backgroundMedia;
                            }

                            public int hashCode() {
                                List<HMSBackgroundMedia> list = this.backgroundMedia;
                                if (list == null) {
                                    return 0;
                                }
                                return list.hashCode();
                            }

                            public String toString() {
                                return AbstractC17176i.m48506h(new StringBuilder("HMSVirtualBackground(backgroundMedia="), this.backgroundMedia, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$JoinForm;", "", "goLiveBtnLabel", "", "joinBtnLabel", "joinBtnType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGoLiveBtnLabel", "()Ljava/lang/String;", "getJoinBtnLabel", "getJoinBtnType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class JoinForm {

                            @SerializedName("go_live_btn_label")
                            private final String goLiveBtnLabel;

                            @SerializedName("join_btn_label")
                            private final String joinBtnLabel;

                            @SerializedName("join_btn_type")
                            private final String joinBtnType;

                            public JoinForm(String str, String str2, String str3) {
                                this.goLiveBtnLabel = str;
                                this.joinBtnLabel = str2;
                                this.joinBtnType = str3;
                            }

                            public static /* synthetic */ JoinForm copy$default(JoinForm joinForm, String str, String str2, String str3, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    str = joinForm.goLiveBtnLabel;
                                }
                                if ((i13 & 2) != 0) {
                                    str2 = joinForm.joinBtnLabel;
                                }
                                if ((i13 & 4) != 0) {
                                    str3 = joinForm.joinBtnType;
                                }
                                return joinForm.copy(str, str2, str3);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final String getGoLiveBtnLabel() {
                                return this.goLiveBtnLabel;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final String getJoinBtnLabel() {
                                return this.joinBtnLabel;
                            }

                            /* JADX INFO: renamed from: component3, reason: from getter */
                            public final String getJoinBtnType() {
                                return this.joinBtnType;
                            }

                            public final JoinForm copy(String goLiveBtnLabel, String joinBtnLabel, String joinBtnType) {
                                return new JoinForm(goLiveBtnLabel, joinBtnLabel, joinBtnType);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof JoinForm)) {
                                    return false;
                                }
                                JoinForm joinForm = (JoinForm) other;
                                return AbstractC22676k.m65745e(this.goLiveBtnLabel, joinForm.goLiveBtnLabel) && AbstractC22676k.m65745e(this.joinBtnLabel, joinForm.joinBtnLabel) && AbstractC22676k.m65745e(this.joinBtnType, joinForm.joinBtnType);
                            }

                            public final String getGoLiveBtnLabel() {
                                return this.goLiveBtnLabel;
                            }

                            public final String getJoinBtnLabel() {
                                return this.joinBtnLabel;
                            }

                            public final String getJoinBtnType() {
                                return this.joinBtnType;
                            }

                            public int hashCode() {
                                String str = this.goLiveBtnLabel;
                                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                                String str2 = this.joinBtnLabel;
                                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                                String str3 = this.joinBtnType;
                                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("JoinForm(goLiveBtnLabel=");
                                sb4.append(this.goLiveBtnLabel);
                                sb4.append(", joinBtnLabel=");
                                sb4.append(this.joinBtnLabel);
                                sb4.append(", joinBtnType=");
                                return AbstractC25012a.m73377j(sb4, this.joinBtnType, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$NoiseCancellationElement;", "", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class NoiseCancellationElement {

                            @SerializedName("enabled_by_default")
                            private final boolean enabled;

                            public NoiseCancellationElement(boolean z4) {
                                this.enabled = z4;
                            }

                            public static /* synthetic */ NoiseCancellationElement copy$default(NoiseCancellationElement noiseCancellationElement, boolean z4, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    z4 = noiseCancellationElement.enabled;
                                }
                                return noiseCancellationElement.copy(z4);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final boolean getEnabled() {
                                return this.enabled;
                            }

                            public final NoiseCancellationElement copy(boolean enabled) {
                                return new NoiseCancellationElement(enabled);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof NoiseCancellationElement) && this.enabled == ((NoiseCancellationElement) other).enabled;
                            }

                            public final boolean getEnabled() {
                                return this.enabled;
                            }

                            public int hashCode() {
                                return Boolean.hashCode(this.enabled);
                            }

                            public String toString() {
                                return AbstractC2875y.m8305r(new StringBuilder("NoiseCancellationElement(enabled="), this.enabled, ')');
                            }
                        }

                        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Preview$Default$Elements$PreviewHeader;", "", "subTitle", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubTitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
                        public static final /* data */ class PreviewHeader {

                            @SerializedName("sub_title")
                            private final String subTitle;

                            @SerializedName("title")
                            private final String title;

                            public PreviewHeader(String str, String str2) {
                                this.subTitle = str;
                                this.title = str2;
                            }

                            public static /* synthetic */ PreviewHeader copy$default(PreviewHeader previewHeader, String str, String str2, int i13, Object obj) {
                                if ((i13 & 1) != 0) {
                                    str = previewHeader.subTitle;
                                }
                                if ((i13 & 2) != 0) {
                                    str2 = previewHeader.title;
                                }
                                return previewHeader.copy(str, str2);
                            }

                            /* JADX INFO: renamed from: component1, reason: from getter */
                            public final String getSubTitle() {
                                return this.subTitle;
                            }

                            /* JADX INFO: renamed from: component2, reason: from getter */
                            public final String getTitle() {
                                return this.title;
                            }

                            public final PreviewHeader copy(String subTitle, String title) {
                                return new PreviewHeader(subTitle, title);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof PreviewHeader)) {
                                    return false;
                                }
                                PreviewHeader previewHeader = (PreviewHeader) other;
                                return AbstractC22676k.m65745e(this.subTitle, previewHeader.subTitle) && AbstractC22676k.m65745e(this.title, previewHeader.title);
                            }

                            public final String getSubTitle() {
                                return this.subTitle;
                            }

                            public final String getTitle() {
                                return this.title;
                            }

                            public int hashCode() {
                                String str = this.subTitle;
                                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                                String str2 = this.title;
                                return iHashCode + (str2 != null ? str2.hashCode() : 0);
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("PreviewHeader(subTitle=");
                                sb4.append(this.subTitle);
                                sb4.append(", title=");
                                return AbstractC25012a.m73377j(sb4, this.title, ')');
                            }
                        }

                        public Elements(JoinForm joinForm, PreviewHeader previewHeader, HMSVirtualBackground hMSVirtualBackground, NoiseCancellationElement noiseCancellationElement) {
                            this.joinForm = joinForm;
                            this.previewHeader = previewHeader;
                            this.virtualBackground = hMSVirtualBackground;
                            this.noiseCancellationElement = noiseCancellationElement;
                        }

                        public static /* synthetic */ Elements copy$default(Elements elements, JoinForm joinForm, PreviewHeader previewHeader, HMSVirtualBackground hMSVirtualBackground, NoiseCancellationElement noiseCancellationElement, int i13, Object obj) {
                            if ((i13 & 1) != 0) {
                                joinForm = elements.joinForm;
                            }
                            if ((i13 & 2) != 0) {
                                previewHeader = elements.previewHeader;
                            }
                            if ((i13 & 4) != 0) {
                                hMSVirtualBackground = elements.virtualBackground;
                            }
                            if ((i13 & 8) != 0) {
                                noiseCancellationElement = elements.noiseCancellationElement;
                            }
                            return elements.copy(joinForm, previewHeader, hMSVirtualBackground, noiseCancellationElement);
                        }

                        /* JADX INFO: renamed from: component1, reason: from getter */
                        public final JoinForm getJoinForm() {
                            return this.joinForm;
                        }

                        /* JADX INFO: renamed from: component2, reason: from getter */
                        public final PreviewHeader getPreviewHeader() {
                            return this.previewHeader;
                        }

                        /* JADX INFO: renamed from: component3, reason: from getter */
                        public final HMSVirtualBackground getVirtualBackground() {
                            return this.virtualBackground;
                        }

                        /* JADX INFO: renamed from: component4, reason: from getter */
                        public final NoiseCancellationElement getNoiseCancellationElement() {
                            return this.noiseCancellationElement;
                        }

                        public final Elements copy(JoinForm joinForm, PreviewHeader previewHeader, HMSVirtualBackground virtualBackground, NoiseCancellationElement noiseCancellationElement) {
                            return new Elements(joinForm, previewHeader, virtualBackground, noiseCancellationElement);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Elements)) {
                                return false;
                            }
                            Elements elements = (Elements) other;
                            return AbstractC22676k.m65745e(this.joinForm, elements.joinForm) && AbstractC22676k.m65745e(this.previewHeader, elements.previewHeader) && AbstractC22676k.m65745e(this.virtualBackground, elements.virtualBackground) && AbstractC22676k.m65745e(this.noiseCancellationElement, elements.noiseCancellationElement);
                        }

                        public final JoinForm getJoinForm() {
                            return this.joinForm;
                        }

                        public final NoiseCancellationElement getNoiseCancellationElement() {
                            return this.noiseCancellationElement;
                        }

                        public final PreviewHeader getPreviewHeader() {
                            return this.previewHeader;
                        }

                        public final HMSVirtualBackground getVirtualBackground() {
                            return this.virtualBackground;
                        }

                        public int hashCode() {
                            JoinForm joinForm = this.joinForm;
                            int iHashCode = (joinForm == null ? 0 : joinForm.hashCode()) * 31;
                            PreviewHeader previewHeader = this.previewHeader;
                            int iHashCode2 = (iHashCode + (previewHeader == null ? 0 : previewHeader.hashCode())) * 31;
                            HMSVirtualBackground hMSVirtualBackground = this.virtualBackground;
                            int iHashCode3 = (iHashCode2 + (hMSVirtualBackground == null ? 0 : hMSVirtualBackground.hashCode())) * 31;
                            NoiseCancellationElement noiseCancellationElement = this.noiseCancellationElement;
                            return iHashCode3 + (noiseCancellationElement != null ? noiseCancellationElement.hashCode() : 0);
                        }

                        public String toString() {
                            return "Elements(joinForm=" + this.joinForm + ", previewHeader=" + this.previewHeader + ", virtualBackground=" + this.virtualBackground + ", noiseCancellationElement=" + this.noiseCancellationElement + ')';
                        }
                    }

                    public Default(Elements elements) {
                        this.elements = elements;
                    }

                    public static /* synthetic */ Default copy$default(Default r10, Elements elements, int i13, Object obj) {
                        if ((i13 & 1) != 0) {
                            elements = r10.elements;
                        }
                        return r10.copy(elements);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final Elements getElements() {
                        return this.elements;
                    }

                    public final Default copy(Elements elements) {
                        return new Default(elements);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Default) && AbstractC22676k.m65745e(this.elements, ((Default) other).elements);
                    }

                    public final Elements getElements() {
                        return this.elements;
                    }

                    public int hashCode() {
                        Elements elements = this.elements;
                        if (elements == null) {
                            return 0;
                        }
                        return elements.hashCode();
                    }

                    public String toString() {
                        return "Default(elements=" + this.elements + ')';
                    }
                }

                public Preview(Default r10, Boolean bool) {
                    this.default = r10;
                    this.skipPreview = bool;
                }

                public static /* synthetic */ Preview copy$default(Preview preview, Default r10, Boolean bool, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        r10 = preview.default;
                    }
                    if ((i13 & 2) != 0) {
                        bool = preview.skipPreview;
                    }
                    return preview.copy(r10, bool);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Default getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Boolean getSkipPreview() {
                    return this.skipPreview;
                }

                public final Preview copy(Default r10, Boolean skipPreview) {
                    return new Preview(r10, skipPreview);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Preview)) {
                        return false;
                    }
                    Preview preview = (Preview) other;
                    return AbstractC22676k.m65745e(this.default, preview.default) && AbstractC22676k.m65745e(this.skipPreview, preview.skipPreview);
                }

                public final Default getDefault() {
                    return this.default;
                }

                public final Boolean getSkipPreview() {
                    return this.skipPreview;
                }

                public int hashCode() {
                    Default r10 = this.default;
                    int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
                    Boolean bool = this.skipPreview;
                    return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                public String toString() {
                    return "Preview(default=" + this.default + ", skipPreview=" + this.skipPreview + ')';
                }
            }

            public Screens(Conferencing conferencing, Leave leave, Preview preview) {
                this.conferencing = conferencing;
                this.leave = leave;
                this.preview = preview;
            }

            public static /* synthetic */ Screens copy$default(Screens screens, Conferencing conferencing, Leave leave, Preview preview, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    conferencing = screens.conferencing;
                }
                if ((i13 & 2) != 0) {
                    leave = screens.leave;
                }
                if ((i13 & 4) != 0) {
                    preview = screens.preview;
                }
                return screens.copy(conferencing, leave, preview);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Conferencing getConferencing() {
                return this.conferencing;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Leave getLeave() {
                return this.leave;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Preview getPreview() {
                return this.preview;
            }

            public final Screens copy(Conferencing conferencing, Leave leave, Preview preview) {
                return new Screens(conferencing, leave, preview);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screens)) {
                    return false;
                }
                Screens screens = (Screens) other;
                return AbstractC22676k.m65745e(this.conferencing, screens.conferencing) && AbstractC22676k.m65745e(this.leave, screens.leave) && AbstractC22676k.m65745e(this.preview, screens.preview);
            }

            public final Conferencing getConferencing() {
                return this.conferencing;
            }

            public final Leave getLeave() {
                return this.leave;
            }

            public final Preview getPreview() {
                return this.preview;
            }

            public int hashCode() {
                Conferencing conferencing = this.conferencing;
                int iHashCode = (conferencing == null ? 0 : conferencing.hashCode()) * 31;
                Leave leave = this.leave;
                int iHashCode2 = (iHashCode + (leave == null ? 0 : leave.hashCode())) * 31;
                Preview preview = this.preview;
                return iHashCode2 + (preview != null ? preview.hashCode() : 0);
            }

            public String toString() {
                return "Screens(conferencing=" + this.conferencing + ", leave=" + this.leave + ", preview=" + this.preview + ')';
            }
        }

        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$TypoGraphy;", "", "fontFamily", "", "<init>", "(Ljava/lang/String;)V", "getFontFamily", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class TypoGraphy {

            @SerializedName("font_family")
            private final String fontFamily;

            public TypoGraphy(String str) {
                this.fontFamily = str;
            }

            public static /* synthetic */ TypoGraphy copy$default(TypoGraphy typoGraphy, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = typoGraphy.fontFamily;
                }
                return typoGraphy.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFontFamily() {
                return this.fontFamily;
            }

            public final TypoGraphy copy(String fontFamily) {
                return new TypoGraphy(fontFamily);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TypoGraphy) && AbstractC22676k.m65745e(this.fontFamily, ((TypoGraphy) other).fontFamily);
            }

            public final String getFontFamily() {
                return this.fontFamily;
            }

            public int hashCode() {
                String str = this.fontFamily;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC25012a.m73377j(new StringBuilder("TypoGraphy(fontFamily="), this.fontFamily, ')');
            }
        }

        public HMSRoomLayoutData(String str, String str2, HMSLayoutOptions hMSLayoutOptions, String str3, String str4, String str5, TypoGraphy typoGraphy, Logo logo, Screens screens, List<HMSRoomTheme> list) {
            this.appId = str;
            this.id = str2;
            this.options = hMSLayoutOptions;
            this.role = str3;
            this.roleId = str4;
            this.templateId = str5;
            this.typography = typoGraphy;
            this.logo = logo;
            this.screens = screens;
            this.themes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMSRoomLayoutData copy$default(HMSRoomLayoutData hMSRoomLayoutData, String str, String str2, HMSLayoutOptions hMSLayoutOptions, String str3, String str4, String str5, TypoGraphy typoGraphy, Logo logo, Screens screens, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = hMSRoomLayoutData.appId;
            }
            if ((i13 & 2) != 0) {
                str2 = hMSRoomLayoutData.id;
            }
            if ((i13 & 4) != 0) {
                hMSLayoutOptions = hMSRoomLayoutData.options;
            }
            if ((i13 & 8) != 0) {
                str3 = hMSRoomLayoutData.role;
            }
            if ((i13 & 16) != 0) {
                str4 = hMSRoomLayoutData.roleId;
            }
            if ((i13 & 32) != 0) {
                str5 = hMSRoomLayoutData.templateId;
            }
            if ((i13 & 64) != 0) {
                typoGraphy = hMSRoomLayoutData.typography;
            }
            if ((i13 & 128) != 0) {
                logo = hMSRoomLayoutData.logo;
            }
            if ((i13 & 256) != 0) {
                screens = hMSRoomLayoutData.screens;
            }
            if ((i13 & 512) != 0) {
                list = hMSRoomLayoutData.themes;
            }
            Screens screens2 = screens;
            List list2 = list;
            TypoGraphy typoGraphy2 = typoGraphy;
            Logo logo2 = logo;
            String str6 = str4;
            String str7 = str5;
            return hMSRoomLayoutData.copy(str, str2, hMSLayoutOptions, str3, str6, str7, typoGraphy2, logo2, screens2, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        public final List<HMSRoomTheme> component10() {
            return this.themes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HMSLayoutOptions getOptions() {
            return this.options;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getRoleId() {
            return this.roleId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final TypoGraphy getTypography() {
            return this.typography;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Logo getLogo() {
            return this.logo;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Screens getScreens() {
            return this.screens;
        }

        public final HMSRoomLayoutData copy(String appId, String id4, HMSLayoutOptions options, String role, String roleId, String templateId, TypoGraphy typography, Logo logo, Screens screens, List<HMSRoomTheme> themes) {
            return new HMSRoomLayoutData(appId, id4, options, role, roleId, templateId, typography, logo, screens, themes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HMSRoomLayoutData)) {
                return false;
            }
            HMSRoomLayoutData hMSRoomLayoutData = (HMSRoomLayoutData) other;
            return AbstractC22676k.m65745e(this.appId, hMSRoomLayoutData.appId) && AbstractC22676k.m65745e(this.id, hMSRoomLayoutData.id) && AbstractC22676k.m65745e(this.options, hMSRoomLayoutData.options) && AbstractC22676k.m65745e(this.role, hMSRoomLayoutData.role) && AbstractC22676k.m65745e(this.roleId, hMSRoomLayoutData.roleId) && AbstractC22676k.m65745e(this.templateId, hMSRoomLayoutData.templateId) && AbstractC22676k.m65745e(this.typography, hMSRoomLayoutData.typography) && AbstractC22676k.m65745e(this.logo, hMSRoomLayoutData.logo) && AbstractC22676k.m65745e(this.screens, hMSRoomLayoutData.screens) && AbstractC22676k.m65745e(this.themes, hMSRoomLayoutData.themes);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getId() {
            return this.id;
        }

        public final Logo getLogo() {
            return this.logo;
        }

        public final HMSLayoutOptions getOptions() {
            return this.options;
        }

        public final String getRole() {
            return this.role;
        }

        public final String getRoleId() {
            return this.roleId;
        }

        public final Screens getScreens() {
            return this.screens;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final List<HMSRoomTheme> getThemes() {
            return this.themes;
        }

        public final TypoGraphy getTypography() {
            return this.typography;
        }

        public int hashCode() {
            String str = this.appId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            HMSLayoutOptions hMSLayoutOptions = this.options;
            int iHashCode3 = (iHashCode2 + (hMSLayoutOptions == null ? 0 : hMSLayoutOptions.hashCode())) * 31;
            String str3 = this.role;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.roleId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.templateId;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            TypoGraphy typoGraphy = this.typography;
            int iHashCode7 = (iHashCode6 + (typoGraphy == null ? 0 : typoGraphy.hashCode())) * 31;
            Logo logo = this.logo;
            int iHashCode8 = (iHashCode7 + (logo == null ? 0 : logo.hashCode())) * 31;
            Screens screens = this.screens;
            int iHashCode9 = (iHashCode8 + (screens == null ? 0 : screens.hashCode())) * 31;
            List<HMSRoomTheme> list = this.themes;
            return iHashCode9 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("HMSRoomLayoutData(appId=");
            sb4.append(this.appId);
            sb4.append(", id=");
            sb4.append(this.id);
            sb4.append(", options=");
            sb4.append(this.options);
            sb4.append(", role=");
            sb4.append(this.role);
            sb4.append(", roleId=");
            sb4.append(this.roleId);
            sb4.append(", templateId=");
            sb4.append(this.templateId);
            sb4.append(", typography=");
            sb4.append(this.typography);
            sb4.append(", logo=");
            sb4.append(this.logo);
            sb4.append(", screens=");
            sb4.append(this.screens);
            sb4.append(", themes=");
            return AbstractC17176i.m48506h(sb4, this.themes, ')');
        }
    }

    public HMSRoomLayout(List<HMSRoomLayoutData> list, String str) {
        this.data = list;
        this.last = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSRoomLayout copy$default(HMSRoomLayout hMSRoomLayout, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = hMSRoomLayout.data;
        }
        if ((i13 & 2) != 0) {
            str = hMSRoomLayout.last;
        }
        return hMSRoomLayout.copy(list, str);
    }

    public final List<HMSRoomLayoutData> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLast() {
        return this.last;
    }

    public final HMSRoomLayout copy(List<HMSRoomLayoutData> data, String last) {
        return new HMSRoomLayout(data, last);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRoomLayout)) {
            return false;
        }
        HMSRoomLayout hMSRoomLayout = (HMSRoomLayout) other;
        return AbstractC22676k.m65745e(this.data, hMSRoomLayout.data) && AbstractC22676k.m65745e(this.last, hMSRoomLayout.last);
    }

    public final List<HMSRoomLayoutData> getData() {
        return this.data;
    }

    public final String getLast() {
        return this.last;
    }

    public int hashCode() {
        List<HMSRoomLayoutData> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.last;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String json = new Gson().toJson(this);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }
}
