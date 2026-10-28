package io.getstream.chat.android.client.utils;

import android.util.Base64;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import org.json.JSONException;
import org.json.JSONObject;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007R\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/TokenUtils;", "", "<init>", "()V", "", "token", "getUserId", "(Ljava/lang/String;)Ljava/lang/String;", "userId", "devToken", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TokenUtils {
    public static final TokenUtils INSTANCE;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h logger;

    static {
        TokenUtils tokenUtils = new TokenUtils();
        INSTANCE = tokenUtils;
        logger = AbstractC1772c1.m5382S(tokenUtils, "Chat:TokenUtils");
    }

    private TokenUtils() {
    }

    public final String devToken(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        if (userId.length() <= 0) {
            throw new IllegalArgumentException("User id must not be empty");
        }
        String strM31996o = AbstractC11895b.m31996o("{\"user_id\":\"", userId, "\"}");
        Charset UTF_8 = StandardCharsets.UTF_8;
        AbstractC22676k.m65749i(UTF_8, "UTF_8");
        byte[] bytes = strM31996o.getBytes(UTF_8);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        AbstractC22676k.m65749i(strEncodeToString, "encodeToString(...)");
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." + strEncodeToString + ".devtoken";
    }

    public final C2345k getLogger() {
        return (C2345k) logger.getValue();
    }

    public final String getUserId(String token) {
        String str;
        String str2;
        AbstractC22676k.m65750j(token, "token");
        try {
            if (!AbstractC39414r.m125876U(token, ".", false)) {
                token = null;
            }
            if (token == null || (str2 = (String) AbstractC25265s.m74102I0(1, AbstractC39414r.m125906y0(token, new String[]{"."}, 6))) == null) {
                str = "";
            } else {
                Charset UTF_8 = StandardCharsets.UTF_8;
                AbstractC22676k.m65749i(UTF_8, "UTF_8");
                byte[] bytes = str2.getBytes(UTF_8);
                AbstractC22676k.m65749i(bytes, "getBytes(...)");
                byte[] bArrDecode = Base64.decode(bytes, 2);
                AbstractC22676k.m65749i(bArrDecode, "decode(...)");
                str = new String(bArrDecode, AbstractC39397a.f169546a);
            }
            String strOptString = new JSONObject(str).optString("user_id");
            AbstractC22676k.m65747g(strOptString);
            return strOptString;
        } catch (IllegalArgumentException e5) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger2.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g, logger2.m7231b(), "Unable to obtain userId from JWT Token Payload", e5);
            }
            return "";
        } catch (JSONException e13) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger3.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger3.m7231b())) {
                logger3.m7230a().log(enumC2341g2, logger3.m7231b(), "Unable to obtain userId from JWT Token Payload", e13);
            }
            return "";
        }
    }
}
