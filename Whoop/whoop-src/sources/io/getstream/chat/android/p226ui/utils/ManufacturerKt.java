package io.getstream.chat.android.p226ui.utils;

import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"shouldConsumeLongTap", "", "MANUFACTURER_XIAOMI", "", "MANUFACTURERS_TO_CONSUME_LONG_TAP", "", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ManufacturerKt {
    private static final String MANUFACTURER_XIAOMI = "xiaomi";
    private static final List<String> MANUFACTURERS_TO_CONSUME_LONG_TAP = AbstractC37056f.m118958J(MANUFACTURER_XIAOMI);

    public static final boolean shouldConsumeLongTap() {
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC22676k.m65749i(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        List<String> list = MANUFACTURERS_TO_CONSUME_LONG_TAP;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                if (AbstractC39414r.m125876U(lowerCase, lowerCase2, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
