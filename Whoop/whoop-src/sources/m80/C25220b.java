package m80;

import b91.C2889d;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p208i2.C17924z0;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p392p3.AbstractC28771i;
import p392p3.C28780r;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p745y81.C39336i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: m80.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0013\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lm80/b;", "", "Lb91/d;", "whoopTypography", "Ly81/i;", "whoopColors", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lb91/d;Ly81/i;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "", "paragraphs", "userEnteredEmail", "suggestedEmail", "Ll3/g;", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;", "d", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ll3/m0;", "b", "Ll3/m0;", "neutralStyle", "c", "emailStyle", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25220b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C23267m0 neutralStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23267m0 emailStyle;

    public C25220b(C2889d whoopTypography, C39336i whoopColors, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(whoopTypography, "whoopTypography");
        AbstractC22676k.m65750j(whoopColors, "whoopColors");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
        long white70 = whoopColors.getWhite70();
        AbstractC28771i abstractC28771i = whoopTypography.getB2().getStyle().f92255a.f92196f;
        this.neutralStyle = new C23267m0(white70, whoopTypography.getB2().getStyle().f92255a.f92192b, whoopTypography.getB2().getStyle().f92255a.f92193c, whoopTypography.getB2().getStyle().f92255a.f92194d, whoopTypography.getB2().getStyle().f92255a.f92195e, abstractC28771i, whoopTypography.getB2().getStyle().f92255a.f92197g, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65408);
        this.emailStyle = new C23267m0(whoopColors.getBrandWhite(), whoopTypography.getB2().getStyle().f92255a.f92192b, C28780r.f116542I, whoopTypography.getB2().getStyle().f92255a.f92194d, whoopTypography.getB2().getStyle().f92255a.f92195e, whoopTypography.getB2().getStyle().f92255a.f92196f, whoopTypography.getB2().getStyle().f92255a.f92197g, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65408);
    }

    /* JADX INFO: renamed from: a */
    private final C23254g m73858a(List<String> paragraphs, String userEnteredEmail, String suggestedEmail) {
        C23248d c23248d = new C23248d();
        C22659b0 c22659b0 = new C22659b0();
        Iterator<T> it = paragraphs.iterator();
        while (it.hasNext()) {
            String string = AbstractC39414r.m125869O0((String) it.next()).toString();
            if (string.length() != 0 && (AbstractC39414r.m125890i0(userEnteredEmail) || !m73860c(c23248d, c22659b0, this, string, userEnteredEmail))) {
                if (suggestedEmail == null || AbstractC39414r.m125890i0(suggestedEmail) || !m73860c(c23248d, c22659b0, this, string, suggestedEmail)) {
                    m73859b(c23248d, c22659b0, this, string, AbstractC39414r.m125887f0(string, '@', 0, false, 6) >= 0);
                }
            }
        }
        return c23248d.m67309k();
    }

    /* JADX INFO: renamed from: b */
    private static final void m73859b(C23248d c23248d, C22659b0 c22659b0, C25220b c25220b, String str, boolean z4) {
        if (str.length() == 0) {
            return;
        }
        if (c23248d.f92119w.length() > 0) {
            c23248d.m67300b((c22659b0.f89329w || !z4) ? "\n\n" : "\n");
        }
        int iM67308j = c23248d.m67308j(z4 ? c25220b.emailStyle : c25220b.neutralStyle);
        try {
            c23248d.m67300b(str);
            c23248d.m67304f(iM67308j);
            c22659b0.f89329w = z4;
        } catch (Throwable th3) {
            c23248d.m67304f(iM67308j);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m73860c(C23248d c23248d, C22659b0 c22659b0, C25220b c25220b, String str, String str2) {
        String string;
        int iM125888g0;
        if (AbstractC39414r.m125890i0(str2) || (iM125888g0 = AbstractC39414r.m125888g0((string = AbstractC39414r.m125869O0(str).toString()), str2, 0, true, 2)) == -1) {
            return false;
        }
        String strSubstring = string.substring(0, iM125888g0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String string2 = AbstractC39414r.m125869O0(strSubstring).toString();
        String strSubstring2 = string.substring(iM125888g0, str2.length() + iM125888g0);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        String strSubstring3 = string.substring(str2.length() + iM125888g0);
        AbstractC22676k.m65749i(strSubstring3, "substring(...)");
        String string3 = AbstractC39414r.m125869O0(strSubstring3).toString();
        if (string2.length() > 0) {
            m73859b(c23248d, c22659b0, c25220b, string2, false);
        }
        m73859b(c23248d, c22659b0, c25220b, strSubstring2, true);
        if (string3.length() > 0) {
            m73859b(c23248d, c22659b0, c25220b, string3, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final C23254g m73861d(List<String> paragraphs, String userEnteredEmail, String suggestedEmail) {
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(userEnteredEmail, "userEnteredEmail");
        if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.EMAIL_DIALOG_TEXT_STYLING)) {
            return m73862e(paragraphs, userEnteredEmail, suggestedEmail);
        }
        C23248d c23248d = new C23248d();
        int iM67308j = c23248d.m67308j(this.neutralStyle);
        try {
            c23248d.m67300b(AbstractC25265s.m74110N0(paragraphs, "\n\n", null, null, null, 62));
            return c23248d.m67309k();
        } finally {
            c23248d.m67304f(iM67308j);
        }
    }

    /* JADX INFO: renamed from: e */
    public final C23254g m73862e(List<String> paragraphs, String userEnteredEmail, String suggestedEmail) {
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(userEnteredEmail, "userEnteredEmail");
        try {
            return m73858a(paragraphs, userEnteredEmail, suggestedEmail);
        } catch (Exception unused) {
            C23248d c23248d = new C23248d();
            int iM67308j = c23248d.m67308j(this.neutralStyle);
            try {
                c23248d.m67300b(AbstractC25265s.m74110N0(paragraphs, "\n\n", null, null, null, 62));
                return c23248d.m67309k();
            } finally {
                c23248d.m67304f(iM67308j);
            }
        }
    }
}
