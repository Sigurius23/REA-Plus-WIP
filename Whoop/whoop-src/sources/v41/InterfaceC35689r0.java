package v41;

import io.getstream.chat.android.client.api.QueryParams;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v41.r0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lv41/r0;", "", "d", "e", "b", "a", "c", "Lv41/r0$a;", "Lv41/r0$b;", "Lv41/r0$c;", "Lv41/r0$d;", "Lv41/r0$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC35689r0 {

    /* JADX INFO: renamed from: v41.r0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"Lv41/r0$a;", "Lv41/r0;", "assetName", "", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC35689r0 {
    }

    /* JADX INFO: renamed from: v41.r0$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"Lv41/r0$b;", "Lv41/r0;", "fileName", "", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC35689r0 {
    }

    /* JADX INFO: renamed from: v41.r0$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m65681d2 = {"Lv41/r0$c;", "Lv41/r0;", "", "jsonString", "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", "d", "(Ljava/lang/String;)I", "", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC35689r0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String jsonString;

        private /* synthetic */ c(String str) {
            this.jsonString = str;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ c m113122a(String str) {
            return new c(str);
        }

        /* JADX INFO: renamed from: b */
        public static String m113123b(String jsonString) {
            AbstractC22676k.m65750j(jsonString, "jsonString");
            return jsonString;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m113124c(String str, Object obj) {
            return (obj instanceof c) && AbstractC22676k.m65745e(str, ((c) obj).getJsonString());
        }

        /* JADX INFO: renamed from: d */
        public static int m113125d(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: e */
        public static String m113126e(String str) {
            return AbstractC11895b.m31996o("WhoopJsonString(jsonString=", str, ")");
        }

        public boolean equals(Object obj) {
            return m113124c(this.jsonString, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ String getJsonString() {
            return this.jsonString;
        }

        public int hashCode() {
            return m113125d(this.jsonString);
        }

        public String toString() {
            return m113126e(this.jsonString);
        }
    }

    /* JADX INFO: renamed from: v41.r0$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m65681d2 = {"Lv41/r0$d;", "Lv41/r0;", "", "resId", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", "d", "", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getResId", "()I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC35689r0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int resId;

        private /* synthetic */ d(int i13) {
            this.resId = i13;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ d m113128a(int i13) {
            return new d(i13);
        }

        /* JADX INFO: renamed from: b */
        public static int m113129b(int i13) {
            return i13;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m113130c(int i13, Object obj) {
            return (obj instanceof d) && i13 == ((d) obj).getResId();
        }

        /* JADX INFO: renamed from: d */
        public static int m113131d(int i13) {
            return Integer.hashCode(i13);
        }

        /* JADX INFO: renamed from: e */
        public static String m113132e(int i13) {
            return AbstractC2875y.m8296i(i13, "WhoopRawRes(resId=", ")");
        }

        public boolean equals(Object obj) {
            return m113130c(this.resId, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return m113131d(this.resId);
        }

        public String toString() {
            return m113132e(this.resId);
        }
    }

    /* JADX INFO: renamed from: v41.r0$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m65681d2 = {"Lv41/r0$e;", "Lv41/r0;", "", QueryParams.URL, "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", "d", "(Ljava/lang/String;)I", "", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC35689r0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        private /* synthetic */ e(String str) {
            this.url = str;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ e m113134a(String str) {
            return new e(str);
        }

        /* JADX INFO: renamed from: b */
        public static String m113135b(String url) {
            AbstractC22676k.m65750j(url, "url");
            return url;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m113136c(String str, Object obj) {
            return (obj instanceof e) && AbstractC22676k.m65745e(str, ((e) obj).getUrl());
        }

        /* JADX INFO: renamed from: d */
        public static int m113137d(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: e */
        public static String m113138e(String str) {
            return AbstractC11895b.m31996o("WhoopUrl(url=", str, ")");
        }

        public boolean equals(Object obj) {
            return m113136c(this.url, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return m113137d(this.url);
        }

        public String toString() {
            return m113138e(this.url);
        }
    }
}
