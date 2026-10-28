package cd2;

import java.util.Map;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cd2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lcd2/a;", "", "<init>", "()V", "f", "b", "c", "d", "e", "a", "Lcd2/a$a;", "Lcd2/a$b;", "Lcd2/a$c;", "Lcd2/a$d;", "Lcd2/a$e;", "Lcd2/a$f;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4446a {

    /* JADX INFO: renamed from: cd2.a$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcd2/a$a;", "Lcd2/a;", "", "", "analyticProperties", "", "backgroundEnabledAfterToggle", "assetId", "<init>", "(Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean backgroundEnabledAfterToggle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String assetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, String> analyticProperties, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            this.analyticProperties = analyticProperties;
            this.backgroundEnabledAfterToggle = z4;
            this.assetId = str;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m13893a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBackgroundEnabledAfterToggle() {
            return this.backgroundEnabledAfterToggle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.analyticProperties, aVar.analyticProperties) && this.backgroundEnabledAfterToggle == aVar.backgroundEnabledAfterToggle && AbstractC22676k.m65745e(this.assetId, aVar.assetId);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.analyticProperties.hashCode() * 31, 31, this.backgroundEnabledAfterToggle);
            String str = this.assetId;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Map<String, String> map = this.analyticProperties;
            boolean z4 = this.backgroundEnabledAfterToggle;
            String str = this.assetId;
            StringBuilder sb4 = new StringBuilder("ClickBackgroundToggle(analyticProperties=");
            sb4.append(map);
            sb4.append(", backgroundEnabledAfterToggle=");
            sb4.append(z4);
            sb4.append(", assetId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cd2.a$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcd2/a$b;", "Lcd2/a;", "", "", "analyticProperties", "", "backgroundEnabled", "assetId", "<init>", "(Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean backgroundEnabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String assetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, String> analyticProperties, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            this.analyticProperties = analyticProperties;
            this.backgroundEnabled = z4;
            this.assetId = str;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m13896a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.analyticProperties, bVar.analyticProperties) && this.backgroundEnabled == bVar.backgroundEnabled && AbstractC22676k.m65745e(this.assetId, bVar.assetId);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.analyticProperties.hashCode() * 31, 31, this.backgroundEnabled);
            String str = this.assetId;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Map<String, String> map = this.analyticProperties;
            boolean z4 = this.backgroundEnabled;
            String str = this.assetId;
            StringBuilder sb4 = new StringBuilder("ClickCopy(analyticProperties=");
            sb4.append(map);
            sb4.append(", backgroundEnabled=");
            sb4.append(z4);
            sb4.append(", assetId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cd2.a$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcd2/a$c;", "Lcd2/a;", "", "", "analyticProperties", "", "backgroundEnabled", "assetId", "<init>", "(Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean backgroundEnabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String assetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, String> analyticProperties, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            this.analyticProperties = analyticProperties;
            this.backgroundEnabled = z4;
            this.assetId = str;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m13899a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.analyticProperties, cVar.analyticProperties) && this.backgroundEnabled == cVar.backgroundEnabled && AbstractC22676k.m65745e(this.assetId, cVar.assetId);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.analyticProperties.hashCode() * 31, 31, this.backgroundEnabled);
            String str = this.assetId;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Map<String, String> map = this.analyticProperties;
            boolean z4 = this.backgroundEnabled;
            String str = this.assetId;
            StringBuilder sb4 = new StringBuilder("ClickDownload(analyticProperties=");
            sb4.append(map);
            sb4.append(", backgroundEnabled=");
            sb4.append(z4);
            sb4.append(", assetId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cd2.a$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcd2/a$d;", "Lcd2/a;", "", "", "analyticProperties", "", "backgroundEnabled", "assetId", "<init>", "(Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC4446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean backgroundEnabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String assetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, String> analyticProperties, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            this.analyticProperties = analyticProperties;
            this.backgroundEnabled = z4;
            this.assetId = str;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m13902a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.analyticProperties, dVar.analyticProperties) && this.backgroundEnabled == dVar.backgroundEnabled && AbstractC22676k.m65745e(this.assetId, dVar.assetId);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.analyticProperties.hashCode() * 31, 31, this.backgroundEnabled);
            String str = this.assetId;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Map<String, String> map = this.analyticProperties;
            boolean z4 = this.backgroundEnabled;
            String str = this.assetId;
            StringBuilder sb4 = new StringBuilder("ClickMessage(analyticProperties=");
            sb4.append(map);
            sb4.append(", backgroundEnabled=");
            sb4.append(z4);
            sb4.append(", assetId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cd2.a$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcd2/a$e;", "Lcd2/a;", "", "", "analyticProperties", "", "backgroundEnabled", "assetId", "<init>", "(Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC4446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean backgroundEnabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String assetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<String, String> analyticProperties, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            this.analyticProperties = analyticProperties;
            this.backgroundEnabled = z4;
            this.assetId = str;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m13905a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.analyticProperties, eVar.analyticProperties) && this.backgroundEnabled == eVar.backgroundEnabled && AbstractC22676k.m65745e(this.assetId, eVar.assetId);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.analyticProperties.hashCode() * 31, 31, this.backgroundEnabled);
            String str = this.assetId;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Map<String, String> map = this.analyticProperties;
            boolean z4 = this.backgroundEnabled;
            String str = this.assetId;
            StringBuilder sb4 = new StringBuilder("ClickMore(analyticProperties=");
            sb4.append(map);
            sb4.append(", backgroundEnabled=");
            sb4.append(z4);
            sb4.append(", assetId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cd2.a$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcd2/a$f;", "Lcd2/a;", "", "", "analyticProperties", "", "backgroundEnabled", "<init>", "(Ljava/util/Map;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Z", "()Z", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC4446a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean backgroundEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Map<String, String> analyticProperties, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            this.analyticProperties = analyticProperties;
            this.backgroundEnabled = z4;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m13908a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.analyticProperties, fVar.analyticProperties) && this.backgroundEnabled == fVar.backgroundEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.backgroundEnabled) + (this.analyticProperties.hashCode() * 31);
        }

        public String toString() {
            return "View(analyticProperties=" + this.analyticProperties + ", backgroundEnabled=" + this.backgroundEnabled + ")";
        }
    }

    public /* synthetic */ AbstractC4446a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4446a() {
    }
}
