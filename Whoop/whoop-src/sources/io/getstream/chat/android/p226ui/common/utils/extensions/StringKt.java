package io.getstream.chat.android.p226ui.common.utils.extensions;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Locale;
import java.util.regex.Pattern;
import m83.AbstractC25265s;
import p249jc.C21567b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;
import yb3.EnumC39413q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "initials", "(Ljava/lang/String;)Ljava/lang/String;", "", "containsLinks", "(Ljava/lang/String;)Z", "addSchemeToUrlIfNeeded", "Lyb3/p;", "whitespaceRegex", "Lyb3/p;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StringKt {
    private static final C39412p whitespaceRegex = new C39412p("\\s+");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m55086a(String str) {
        return (String) initials$lambda$0(str);
    }

    @InternalStreamChatApi
    public static final String addSchemeToUrlIfNeeded(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return (AbstractC39421y.m125930O(str, "mailto:", false) || AbstractC39421y.m125930O(str, "http://", false) || AbstractC39421y.m125930O(str, "https://", false)) ? str : "http://".concat(str);
    }

    public static final boolean containsLinks(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
        Pattern patternCompile = Pattern.compile("(^|\\s)((http|https|ftp)://)?[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+(/[a-zA-Z0-9- ;,./?%&=]*)?", C21567b.m60604j(2));
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        return patternCompile.matcher(str).find();
    }

    public static final String initials(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC25265s.m74110N0(AbstractC25265s.m74156w1(whitespaceRegex.m125854h(AbstractC39414r.m125869O0(str).toString()), 2), "", null, null, new C19616a(0), 30);
    }

    private static final CharSequence initials$lambda$0(String it) {
        AbstractC22676k.m65750j(it, "it");
        String upperCase = AbstractC39414r.m125866L0(1, it).toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
