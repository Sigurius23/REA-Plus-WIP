package io.getstream.chat.android.client.extensions;

import android.net.Uri;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import ev2.C13693b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.streamcdn.image.StreamCdnCropImageMode;
import io.getstream.chat.android.models.streamcdn.image.StreamCdnOriginalImageDimensions;
import io.getstream.chat.android.models.streamcdn.image.StreamCdnResizeImageMode;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39408l;
import yb3.C39410n;
import yb3.C39412p;
import yb3.InterfaceC39407k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001d\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010\u001d\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\u001d\u0010 \u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u0002\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$\"\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006'"}, m65681d2 = {"", "snakeToLowerCamelCase", "(Ljava/lang/String;)Ljava/lang/String;", "lowerCamelCaseToGetter", "camelCaseToSnakeCase", "", "isAnonymousChannelId", "(Ljava/lang/String;)Z", "Ll83/k;", "cidToTypeAndId", "(Ljava/lang/String;)Ll83/k;", "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnOriginalImageDimensions;", "getStreamCdnHostedImageDimensions", "(Ljava/lang/String;)Lio/getstream/chat/android/models/streamcdn/image/StreamCdnOriginalImageDimensions;", "", "resizedWidthPercentage", "resizedHeightPercentage", "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;", "resizeMode", "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;", "cropMode", "createResizedStreamCdnImageUrl", "(Ljava/lang/String;FFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)Ljava/lang/String;", "Landroid/net/Uri;", "wasImagePreviouslyResized", "(Landroid/net/Uri;)Z", "Landroid/net/Uri$Builder;", "key", "value", "appendValueAsQueryParameterIfNotNull", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/Integer;)Landroid/net/Uri$Builder;", "extractBaseUrl", "Lyb3/p;", "snakeRegex", "Lyb3/p;", "camelRegex", "baseUrlRegex", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StringExtensionsKt {
    private static final C39412p snakeRegex = new C39412p("_[a-zA-Z]");
    private static final C39412p camelRegex = new C39412p("(?<=[a-zA-Z])[A-Z]");
    private static final C39412p baseUrlRegex = new C39412p("^(?:https?://)?(.*?)/*$");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m54664a(InterfaceC39407k interfaceC39407k) {
        return (String) camelCaseToSnakeCase$lambda$1(interfaceC39407k);
    }

    private static final Uri.Builder appendValueAsQueryParameterIfNotNull(Uri.Builder builder, String str, String str2) {
        if (str2 == null) {
            return builder;
        }
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter(str, str2);
        AbstractC22676k.m65747g(builderAppendQueryParameter);
        return builderAppendQueryParameter;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m54665b(InterfaceC39407k interfaceC39407k) {
        return (String) snakeToLowerCamelCase$lambda$0(interfaceC39407k);
    }

    public static final String camelCaseToSnakeCase(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        String lowerCase = camelRegex.m125853g(str, new C13693b(29)).toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final CharSequence camelCaseToSnakeCase$lambda$1(InterfaceC39407k it) {
        AbstractC22676k.m65750j(it, "it");
        return "_".concat(((C39410n) it).m125845c());
    }

    public static final C23465k cidToTypeAndId(String str) throws IllegalStateException {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.length() <= 0) {
            throw new IllegalStateException("cid can not be empty");
        }
        if (!AbstractC39414r.m125875T(str, ':', false)) {
            throw new IllegalStateException("cid needs to be in the format channelType:channelId. For example, messaging:123");
        }
        List listM125906y0 = AbstractC39414r.m125906y0(str, new String[]{":"}, 6);
        if (listM125906y0.size() < 2) {
            listM125906y0 = null;
        }
        C23465k c23465k = listM125906y0 != null ? new C23465k(AbstractC25265s.m74096F0(listM125906y0), AbstractC25265s.m74112P0(listM125906y0)) : null;
        if (c23465k != null) {
            return c23465k;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String createResizedStreamCdnImageUrl(String str, float f13, float f14, StreamCdnResizeImageMode streamCdnResizeImageMode, StreamCdnCropImageMode streamCdnCropImageMode) {
        AbstractC22676k.m65750j(str, "<this>");
        InterfaceC2344j interfaceC2344j = C2343i.f9271c;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        StreamCdnOriginalImageDimensions streamCdnHostedImageDimensions = getStreamCdnHostedImageDimensions(str);
        if (streamCdnHostedImageDimensions != null) {
            Uri uri = Uri.parse(str);
            if (!wasImagePreviouslyResized(uri)) {
                int originalWidth = (int) (streamCdnHostedImageDimensions.getOriginalWidth() * f13);
                int originalHeight = (int) (streamCdnHostedImageDimensions.getOriginalHeight() * f14);
                Uri.Builder builderBuildUpon = uri.buildUpon();
                AbstractC22676k.m65749i(builderBuildUpon, "buildUpon(...)");
                String string = appendValueAsQueryParameterIfNotNull(appendValueAsQueryParameterIfNotNull(appendValueAsQueryParameterIfNotNull(appendValueAsQueryParameterIfNotNull(builderBuildUpon, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, Integer.valueOf(originalWidth)), StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, Integer.valueOf(originalHeight)), StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZE_MODE, streamCdnResizeImageMode != null ? streamCdnResizeImageMode.getQueryParameterName() : null), StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_CROP_MODE, streamCdnCropImageMode != null ? streamCdnCropImageMode.getQueryParameterName() : null).build().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, "Chat:resizedStreamCdnImageUrl")) {
                    interfaceC2344j.log(enumC2341g, "Chat:resizedStreamCdnImageUrl", "Resized Stream CDN hosted image URL: ".concat(string), null);
                }
                return string;
            }
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g2, "Chat:resizedStreamCdnImageUrl")) {
                interfaceC2344j.log(enumC2341g2, "Chat:resizedStreamCdnImageUrl", "Image URL already contains resizing parameters. Please apply resizing parameters only to original image URLs.", null);
                return str;
            }
        } else {
            EnumC2341g enumC2341g3 = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g3, "Chat:resizedStreamCdnImageUrl")) {
                interfaceC2344j.log(enumC2341g3, "Chat:resizedStreamCdnImageUrl", "Image not hosted by Stream's CDN or not containing original width and height query parameters was not resized", null);
            }
        }
        return str;
    }

    public static /* synthetic */ String createResizedStreamCdnImageUrl$default(String str, float f13, float f14, StreamCdnResizeImageMode streamCdnResizeImageMode, StreamCdnCropImageMode streamCdnCropImageMode, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            streamCdnResizeImageMode = null;
        }
        if ((i13 & 8) != 0) {
            streamCdnCropImageMode = null;
        }
        return createResizedStreamCdnImageUrl(str, f13, f14, streamCdnResizeImageMode, streamCdnCropImageMode);
    }

    public static final String extractBaseUrl(String str) {
        String str2;
        AbstractC22676k.m65750j(str, "<this>");
        C39410n c39410nM125850d = baseUrlRegex.m125850d(str);
        return (c39410nM125850d == null || (str2 = (String) ((C39408l) c39410nM125850d.m125843a()).get(1)) == null) ? str : str2;
    }

    public static final StreamCdnOriginalImageDimensions getStreamCdnHostedImageDimensions(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("ow");
            Integer numValueOf = queryParameter != null ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
            String queryParameter2 = uri.getQueryParameter("oh");
            Integer numValueOf2 = queryParameter2 != null ? Integer.valueOf(Integer.parseInt(queryParameter2)) : null;
            if (numValueOf2 != null && numValueOf != null) {
                return new StreamCdnOriginalImageDimensions(numValueOf.intValue(), numValueOf2.intValue());
            }
        } catch (Exception e5) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat: getStreamCDNHostedImageDimensions")) {
                interfaceC2344j.log(enumC2341g, "Chat: getStreamCDNHostedImageDimensions", "Failed to parse Stream CDN image dimensions from the URL:\n ".concat(AbstractC29125c.m88514W(e5)), null);
            }
        }
        return null;
    }

    public static final boolean isAnonymousChannelId(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC39414r.m125876U(str, "!members", false);
    }

    @InternalStreamChatApi
    public static final String lowerCamelCaseToGetter(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        String strValueOf = String.valueOf(str.charAt(0));
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        String strSubstring = str.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return AbstractC11895b.m31996o("get", upperCase, strSubstring);
    }

    @InternalStreamChatApi
    public static final String snakeToLowerCamelCase(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return snakeRegex.m125853g(str, new C13693b(28));
    }

    private static final CharSequence snakeToLowerCamelCase$lambda$0(InterfaceC39407k matchResult) {
        AbstractC22676k.m65750j(matchResult, "matchResult");
        String upperCase = AbstractC39421y.m125926K(((C39410n) matchResult).m125845c(), "_", "", false).toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final boolean wasImagePreviouslyResized(Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        AbstractC22676k.m65749i(queryParameterNames, "getQueryParameterNames(...)");
        return !AbstractC25265s.m74106K0(queryParameterNames, AbstractC37056f.m118959K(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZE_MODE, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_CROP_MODE)).isEmpty();
    }

    private static final Uri.Builder appendValueAsQueryParameterIfNotNull(Uri.Builder builder, String str, Integer num) {
        if (num == null) {
            return builder;
        }
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter(str, num.toString());
        AbstractC22676k.m65747g(builderAppendQueryParameter);
        return builderAppendQueryParameter;
    }
}
