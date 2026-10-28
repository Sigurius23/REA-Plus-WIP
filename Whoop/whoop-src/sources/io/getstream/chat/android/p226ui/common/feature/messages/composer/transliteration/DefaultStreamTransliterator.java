package io.getstream.chat.android.p226ui.common.feature.messages.composer.transliteration;

import android.icu.text.Transliterator;
import android.os.Build;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import java.util.Enumeration;
import l83.InterfaceC23462h;
import m83.C25266t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xb3.AbstractC38176k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;", "", "transliterationId", "<init>", "(Ljava/lang/String;)V", "id", "Ll83/a0;", "setTransliterator", "text", "transliterate", "(Ljava/lang/String;)Ljava/lang/String;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Landroid/icu/text/Transliterator;", "transliterator", "Landroid/icu/text/Transliterator;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultStreamTransliterator implements StreamTransliterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private Transliterator transliterator;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultStreamTransliterator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void setTransliterator(String id4) {
        Enumeration<String> availableIDs = Transliterator.getAvailableIDs();
        AbstractC22676k.m65749i(availableIDs, "getAvailableIDs(...)");
        if (AbstractC38176k.m122279o(AbstractC38176k.m122278n(new C25266t(availableIDs)), id4)) {
            this.transliterator = Transliterator.getInstance(id4);
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("The id: ", id4, " for transliteration is not available"), null);
        }
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.transliteration.StreamTransliterator
    public final String transliterate(String text) {
        String strTransliterate;
        AbstractC22676k.m65750j(text, "text");
        try {
            Transliterator transliterator = this.transliterator;
            if (transliterator != null && (strTransliterate = transliterator.transliterate(text)) != null) {
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (!interfaceC2339e.isLoggable(enumC2341g, str)) {
                    return strTransliterate;
                }
                logger.f9274b.log(enumC2341g, str, "[transliterate] input: " + text + ", output: " + strTransliterate, null);
                return strTransliterate;
            }
        } catch (Exception e5) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[transliterate] failed(" + text + "): " + e5, e5);
            }
        }
        return text;
    }

    public DefaultStreamTransliterator(String str) {
        this.logger = AbstractC1772c1.m5382S(this, "Chat:Transliterator");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            if (str != null) {
                setTransliterator(str);
                return;
            }
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str2 = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC2875y.m8296i(i13, "This android version: ", " doesn't support transliteration natively. User a custom StreamTransliterator to add transliteration."), null);
        }
    }

    public /* synthetic */ DefaultStreamTransliterator(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str);
    }
}
