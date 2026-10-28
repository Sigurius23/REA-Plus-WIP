package xu1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.Locale;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xu1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\f\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, m65681d2 = {"", "cardId", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lfi0/a;", "source", "offerId", "timeLeft", "Ll83/a0;", "c", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "closeAction", "a", "limited-time-offer_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38654b {
    /* JADX INFO: renamed from: a */
    public static final void m123911a(InterfaceC14515a interfaceC14515a, String source, String offerId, String closeAction) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        AbstractC22676k.m65750j(closeAction, "closeAction");
        interfaceC14515a.mo41428k("20_dollar_discount", "close", closeAction, "Limited Time Offer", AbstractC25247g0.m73990Y(new C23465k("source", source), new C23465k("close_action", closeAction)));
    }

    /* JADX INFO: renamed from: b */
    public static final String m123912b(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (AbstractC22676k.m65745e(lowerCase, "paytoday")) {
            return "pay_today";
        }
        return AbstractC22676k.m65745e(lowerCase, "paylater") ? "pay_later" : "close";
    }

    /* JADX INFO: renamed from: c */
    public static final void m123913c(InterfaceC14515a interfaceC14515a, String source, String offerId, String timeLeft) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        AbstractC22676k.m65750j(timeLeft, "timeLeft");
        InterfaceC14515a.m41418i(interfaceC14515a, "20_dollar_discount", ProfileAnalyticsKt.VIEW, null, "Limited Time Offer", null, AbstractC25247g0.m73990Y(new C23465k("source", source), new C23465k("time_left_on_offer", timeLeft)), 20, null);
    }
}
