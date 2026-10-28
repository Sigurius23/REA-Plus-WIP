package k20;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import g73.C15553a;
import java.util.Locale;
import java.util.regex.Pattern;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: k20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C22144i extends AbstractC22155t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85893w;

    /* JADX INFO: renamed from: x */
    public final String f85894x;

    public C22144i(EventReporter$Mode mode, int i13) {
        this.f85893w = i13;
        switch (i13) {
            case 3:
                AbstractC22676k.m65750j(mode, "mode");
                this.f85894x = C15553a.m43789p(mode, "sheet_savedpm_show");
                break;
            case 4:
                AbstractC22676k.m65750j(mode, "mode");
                this.f85894x = C15553a.m43789p(mode, "manage_savedpm_show");
                break;
            case 5:
                AbstractC22676k.m65750j(mode, "mode");
                this.f85894x = C15553a.m43789p(mode, "sheet_newpm_show");
                break;
            default:
                AbstractC22676k.m65750j(mode, "mode");
                this.f85894x = C15553a.m43789p(mode, "cannot_return_from_link_and_lpms");
                break;
        }
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f85893w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f85894x;
    }

    public C22144i(EventReporter$Mode mode, AbstractC29840y abstractC29840y) {
        this.f85893w = 2;
        AbstractC22676k.m65750j(mode, "mode");
        this.f85894x = C15553a.m43789p(mode, "paymentoption_" + C15553a.m43788o(abstractC29840y) + "_select");
    }

    public C22144i(String type) {
        this.f85893w = 0;
        AbstractC22676k.m65750j(type, "type");
        Pattern patternCompile = Pattern.compile("(?<=.)(?=\\p{Upper})");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(type).replaceAll("_");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        this.f85894x = "autofill_".concat(lowerCase);
    }
}
