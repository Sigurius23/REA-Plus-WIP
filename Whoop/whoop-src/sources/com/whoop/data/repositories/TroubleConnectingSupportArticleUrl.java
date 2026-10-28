package com.whoop.data.repositories;

import java.util.Locale;
import js0.AbstractC21907a;
import or2.AbstractC28202t0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/data/repositories/TroubleConnectingSupportArticleUrl;", "Ljs0/a;", "", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "component1", "()Ljava/util/Locale;", "copy", "(Ljava/util/Locale;)Lcom/whoop/data/repositories/TroubleConnectingSupportArticleUrl;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Locale;", "getLocale", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TroubleConnectingSupportArticleUrl extends AbstractC21907a<String> {
    private final Locale locale;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TroubleConnectingSupportArticleUrl(Locale locale) {
        super("TROUBLE_CONNECTING_SUPPORT_ARTICLE_URL", AbstractC11895b.m31996o("https://support.whoop.com/s/article/WHOOP-4-0-iOS-Connectivity-and-Pairing?language=", AbstractC28202t0.m85351b(locale), "#ts"));
        AbstractC22676k.m65750j(locale, "locale");
        this.locale = locale;
    }

    public static /* synthetic */ TroubleConnectingSupportArticleUrl copy$default(TroubleConnectingSupportArticleUrl troubleConnectingSupportArticleUrl, Locale locale, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            locale = troubleConnectingSupportArticleUrl.locale;
        }
        return troubleConnectingSupportArticleUrl.copy(locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    public final TroubleConnectingSupportArticleUrl copy(Locale locale) {
        AbstractC22676k.m65750j(locale, "locale");
        return new TroubleConnectingSupportArticleUrl(locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TroubleConnectingSupportArticleUrl) && AbstractC22676k.m65745e(this.locale, ((TroubleConnectingSupportArticleUrl) other).locale);
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public String toString() {
        return "TroubleConnectingSupportArticleUrl(locale=" + this.locale + ")";
    }
}
