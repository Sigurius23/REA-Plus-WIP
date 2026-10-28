package com.mapbox.maps.attribution;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.mapbox.maps.C5489R;
import io.getstream.chat.android.client.api.QueryParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import m83.C25271y;
import p231iv.C20940a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0002;<B]\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010!J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010&J\u000f\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010\u0018J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u0007H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0014H\u0004¢\u0006\u0004\b3\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionParser;", "", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "context", "", "attributionData", "", "withImproveMap", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", "", "Liv/a;", "extraAttributions", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;ZZZZZZLjava/util/List;)V", "stringLiteralList", "Ll83/a0;", "parseStringLiteralToAttributions", "(Ljava/util/List;)V", "parseAttributions", "()V", "Landroid/text/SpannableStringBuilder;", "htmlBuilder", "Landroid/text/style/URLSpan;", "urlSpan", "parseUrlSpan", "(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)V", QueryParams.URL, "isUrlValid", "(Ljava/lang/String;)Z", "anchor", "isImproveThisMapAnchor", "anchorString", "translateImproveThisMapAnchor", "(Ljava/lang/String;)Ljava/lang/String;", "isValidForImproveThisMap", "isValidForMapbox", "parseAnchorValue", "(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)Ljava/lang/String;", "stripCopyright", "addAdditionalAttributions", "", "getAttributions", "()Ljava/util/Set;", "shortenedOutput", "createAttributionString", "(Z)Ljava/lang/String;", "parse", "Ljava/lang/ref/WeakReference;", "Ljava/lang/String;", "Z", "Ljava/util/List;", "", "attributions", "Ljava/util/Set;", "Companion", "Options", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class AttributionParser {
    private static final String COPYRIGHT = "© ";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EMPTY_STRING = "";
    private static final List<String> IMPROVE_MAP_URLS;
    private static final String IMPROVE_THIS_MAP = "Improve this map";
    private final String attributionData;
    private final Set<C20940a> attributions;
    private final WeakReference<Context> context;
    private final List<C20940a> extraAttributions;
    private final boolean withCopyrightSign;
    private final boolean withImproveMap;
    private final boolean withMapboxAttribution;
    private final boolean withMapboxGeofencingConsent;
    private final boolean withMapboxPrivacyPolicy;
    private final boolean withTelemetryAttribution;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Companion;", "", "()V", "COPYRIGHT", "", "EMPTY_STRING", "IMPROVE_MAP_URLS", "", "getIMPROVE_MAP_URLS", "()Ljava/util/List;", "IMPROVE_THIS_MAP", "fromHtml", "Landroid/text/Spanned;", "html", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Spanned fromHtml(String html) {
            Spanned spannedFromHtml = Html.fromHtml(html, 0);
            AbstractC22676k.m65749i(spannedFromHtml, "{\n        Html.fromHtml(…HTML_MODE_LEGACY)\n      }");
            return spannedFromHtml;
        }

        public final List<String> getIMPROVE_MAP_URLS() {
            return AttributionParser.IMPROVE_MAP_URLS;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006+"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Options;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "attribution", "parseAttribution", "([Ljava/lang/String;)Ljava/lang/String;", "htmlStr", "", "hasValidHTMLTag", "(Ljava/lang/String;)Z", "attributionData", "withAttributionData", "([Ljava/lang/String;)Lcom/mapbox/maps/attribution/AttributionParser$Options;", "", "Liv/a;", "attributions", "withExtraAttributions", "(Ljava/util/List;)Lcom/mapbox/maps/attribution/AttributionParser$Options;", "withImproveMap", "(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", "Lcom/mapbox/maps/attribution/AttributionParser;", "build", "()Lcom/mapbox/maps/attribution/AttributionParser;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Z", "attributionDataStringArray", "[Ljava/lang/String;", "", "stringLiteralArray", "Ljava/util/List;", "extraAttributions", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Options {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String HTML_STYLE_REGEX = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
        private String[] attributionDataStringArray;
        private final WeakReference<Context> context;
        private List<C20940a> extraAttributions;
        private List<String> stringLiteralArray;
        private boolean withCopyrightSign;
        private boolean withImproveMap;
        private boolean withMapboxAttribution;
        private boolean withMapboxGeofencingConsent;
        private boolean withMapboxPrivacyPolicy;
        private boolean withTelemetryAttribution;

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Options$Companion;", "", "()V", "HTML_STYLE_REGEX", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Options(Context context) {
            AbstractC22676k.m65750j(context, "context");
            this.context = new WeakReference<>(context);
            this.withImproveMap = true;
            this.withCopyrightSign = true;
            this.withMapboxAttribution = true;
            this.withMapboxPrivacyPolicy = true;
            this.withMapboxGeofencingConsent = true;
            this.stringLiteralArray = new ArrayList();
            this.extraAttributions = C25271y.f99162w;
        }

        private final boolean hasValidHTMLTag(String htmlStr) {
            return Pattern.compile(HTML_STYLE_REGEX).matcher(htmlStr).find();
        }

        private final String parseAttribution(String[] attribution) {
            StringBuilder sb4 = new StringBuilder();
            for (String str : attribution) {
                if (str.length() > 0) {
                    if (hasValidHTMLTag(str)) {
                        sb4.append(str);
                    } else {
                        this.stringLiteralArray.add(str);
                    }
                }
            }
            String string = sb4.toString();
            AbstractC22676k.m65749i(string, "builder.toString()");
            return string;
        }

        public final AttributionParser build() {
            String[] strArr = this.attributionDataStringArray;
            if (strArr == null) {
                throw new IllegalStateException("Using builder without providing attribution data");
            }
            AbstractC22676k.m65747g(strArr);
            AttributionParser attributionParser = new AttributionParser(this.context, parseAttribution(strArr), this.withImproveMap, this.withCopyrightSign, this.withTelemetryAttribution, this.withMapboxAttribution, this.withMapboxPrivacyPolicy, this.withMapboxGeofencingConsent, this.extraAttributions);
            attributionParser.parse();
            attributionParser.parseStringLiteralToAttributions(this.stringLiteralArray);
            return attributionParser;
        }

        public final Options withAttributionData(String... attributionData) {
            AbstractC22676k.m65750j(attributionData, "attributionData");
            this.attributionDataStringArray = (String[]) Arrays.copyOf(attributionData, attributionData.length);
            return this;
        }

        public final Options withCopyrightSign(boolean withCopyrightSign) {
            this.withCopyrightSign = withCopyrightSign;
            return this;
        }

        public final Options withExtraAttributions(List<C20940a> attributions) {
            AbstractC22676k.m65750j(attributions, "attributions");
            this.extraAttributions = attributions;
            return this;
        }

        public final Options withImproveMap(boolean withImproveMap) {
            this.withImproveMap = withImproveMap;
            return this;
        }

        public final Options withMapboxAttribution(boolean withMapboxAttribution) {
            this.withMapboxAttribution = withMapboxAttribution;
            return this;
        }

        public final Options withMapboxGeofencingConsent(boolean withMapboxGeofencingConsent) {
            this.withMapboxGeofencingConsent = withMapboxGeofencingConsent;
            return this;
        }

        public final Options withMapboxPrivacyPolicy(boolean withMapboxPrivacyPolicy) {
            this.withMapboxPrivacyPolicy = withMapboxPrivacyPolicy;
            return this;
        }

        public final Options withTelemetryAttribution(boolean withTelemetryAttribution) {
            this.withTelemetryAttribution = withTelemetryAttribution;
            return this;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        IMPROVE_MAP_URLS = arrayList;
        arrayList.add("https://www.mapbox.com/feedback/");
        arrayList.add("https://www.mapbox.com/map-feedback/");
        arrayList.add("https://apps.mapbox.com/feedback/");
    }

    public AttributionParser(WeakReference<Context> context, String attributionData, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List<C20940a> extraAttributions) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attributionData, "attributionData");
        AbstractC22676k.m65750j(extraAttributions, "extraAttributions");
        this.context = context;
        this.attributionData = attributionData;
        this.withImproveMap = z4;
        this.withCopyrightSign = z13;
        this.withTelemetryAttribution = z14;
        this.withMapboxAttribution = z15;
        this.withMapboxPrivacyPolicy = z16;
        this.withMapboxGeofencingConsent = z17;
        this.extraAttributions = extraAttributions;
        this.attributions = new LinkedHashSet();
    }

    private final void addAdditionalAttributions() {
        String string;
        String string2;
        String string3;
        Context context = this.context.get();
        if (this.withTelemetryAttribution) {
            Set<C20940a> set = this.attributions;
            if (context == null || (string3 = context.getString(C5489R.string.mapbox_telemetrySettings)) == null) {
                string3 = "Mapbox Telemetry";
            }
            set.add(new C20940a(string3, "https://www.mapbox.com/telemetry/"));
        }
        if (this.withMapboxGeofencingConsent) {
            Set<C20940a> set2 = this.attributions;
            if (context == null || (string2 = context.getString(C5489R.string.mapbox_geofencing_consent)) == null) {
                string2 = "Mapbox Geofencing";
            }
            set2.add(new C20940a(string2, "geofencing_url_marker"));
        }
        if (this.withMapboxPrivacyPolicy) {
            Set<C20940a> set3 = this.attributions;
            if (context == null || (string = context.getString(C5489R.string.mapbox_privacy_policy)) == null) {
                string = "Mapbox Privacy Policy";
            }
            set3.add(new C20940a(string, "https://www.mapbox.com/legal/privacy#product-privacy-policy/"));
        }
        this.attributions.addAll(this.extraAttributions);
    }

    public static /* synthetic */ String createAttributionString$default(AttributionParser attributionParser, boolean z4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAttributionString");
        }
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return attributionParser.createAttributionString(z4);
    }

    private final boolean isImproveThisMapAnchor(String anchor) {
        return AbstractC22676k.m65745e(anchor, IMPROVE_THIS_MAP);
    }

    private final boolean isUrlValid(String url) {
        return isValidForImproveThisMap(url) && isValidForMapbox(url);
    }

    private final boolean isValidForImproveThisMap(String url) {
        return this.withImproveMap || !IMPROVE_MAP_URLS.contains(url);
    }

    private final boolean isValidForMapbox(String url) {
        return this.withMapboxAttribution || !AbstractC22676k.m65745e(url, "https://www.mapbox.com/about/maps/");
    }

    private final String parseAnchorValue(SpannableStringBuilder htmlBuilder, URLSpan urlSpan) {
        int spanStart = htmlBuilder.getSpanStart(urlSpan);
        int spanEnd = htmlBuilder.getSpanEnd(urlSpan);
        char[] cArr = new char[spanEnd - spanStart];
        htmlBuilder.getChars(spanStart, spanEnd, cArr, 0);
        return stripCopyright(new String(cArr));
    }

    private final void parseAttributions() {
        Spanned spannedFromHtml = INSTANCE.fromHtml(this.attributionData);
        AbstractC22676k.m65748h(spannedFromHtml, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
        URLSpan[] urlSpans = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        AbstractC22676k.m65749i(urlSpans, "urlSpans");
        for (URLSpan urlSpan : urlSpans) {
            AbstractC22676k.m65749i(urlSpan, "urlSpan");
            parseUrlSpan(spannableStringBuilder, urlSpan);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseStringLiteralToAttributions(List<String> stringLiteralList) {
        Iterator<String> it = stringLiteralList.iterator();
        while (it.hasNext()) {
            String string = INSTANCE.fromHtml(it.next()).toString();
            if (!this.withCopyrightSign) {
                string = stripCopyright(string);
            }
            this.attributions.add(new C20940a(string, ""));
        }
    }

    private final void parseUrlSpan(SpannableStringBuilder htmlBuilder, URLSpan urlSpan) {
        String url = urlSpan.getURL();
        AbstractC22676k.m65749i(url, "url");
        if (isUrlValid(url)) {
            String anchorValue = parseAnchorValue(htmlBuilder, urlSpan);
            if (isImproveThisMapAnchor(anchorValue)) {
                if (!this.withImproveMap) {
                    return;
                } else {
                    anchorValue = translateImproveThisMapAnchor(anchorValue);
                }
            }
            this.attributions.add(new C20940a(anchorValue, url));
        }
    }

    private final String stripCopyright(String anchorString) {
        if (this.withCopyrightSign || !AbstractC39421y.m125930O(anchorString, COPYRIGHT, false)) {
            return anchorString;
        }
        String strSubstring = anchorString.substring(2, anchorString.length());
        AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String translateImproveThisMapAnchor(String anchorString) {
        Context context = this.context.get();
        if (context == null) {
            return anchorString;
        }
        String string = context.getString(C5489R.string.mapbox_telemetryImproveMap);
        AbstractC22676k.m65749i(string, "context.getString(R.stri…pbox_telemetryImproveMap)");
        return string;
    }

    public final String createAttributionString() {
        return createAttributionString$default(this, false, 1, null);
    }

    public final Set<C20940a> getAttributions() {
        return this.attributions;
    }

    public final void parse() {
        parseAttributions();
        addAdditionalAttributions();
    }

    public final String createAttributionString(boolean shortenedOutput) {
        String str;
        if (this.attributions.isEmpty()) {
            return "";
        }
        StringBuilder sb4 = new StringBuilder(this.withCopyrightSign ? "" : COPYRIGHT);
        int i13 = 0;
        for (C20940a c20940a : this.attributions) {
            i13++;
            if (shortenedOutput) {
                str = c20940a.f79119a;
                if (AbstractC22676k.m65745e(str, "OpenStreetMap")) {
                    str = "OSM";
                }
            } else {
                str = c20940a.f79119a;
            }
            sb4.append(str);
            if (i13 != this.attributions.size()) {
                sb4.append(" / ");
            }
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "stringBuilder.toString()");
        return string;
    }
}
