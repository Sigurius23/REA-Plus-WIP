package t30;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;
import com.whoop.android.R;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p465rm.C31559p;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t30.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C33520v extends FrameLayout {

    /* JADX INFO: renamed from: w */
    public final ThreeDS2WebView f139940w;

    /* JADX INFO: renamed from: x */
    public String f139941x;

    /* JADX INFO: renamed from: y */
    public View.OnClickListener f139942y;

    /* JADX INFO: renamed from: z */
    public static final Pattern f139939z = Pattern.compile("method=\"post\"", 10);

    /* JADX INFO: renamed from: E */
    public static final Pattern f139938E = Pattern.compile("action=\"(.+?)\"", 10);

    public C33520v(AbstractActivityC1340r0 abstractActivityC1340r0) {
        super(abstractActivityC1340r0, null, 0);
        this.f139941x = "";
        LayoutInflater.from(abstractActivityC1340r0).inflate(R.layout.stripe_challenge_zone_web_view, this);
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) AbstractC34235f.m108203J(this, R.id.web_view);
        if (threeDS2WebView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.web_view)));
        }
        this.f139940w = threeDS2WebView;
        threeDS2WebView.setOnHtmlSubmitListener$3ds2sdk_release(new C31559p(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final void m105891a(String str) {
        String strGroup;
        if (str == null) {
            return;
        }
        String strReplaceAll = f139939z.matcher(str).replaceAll("method=\"get\"");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        Matcher matcher = f139938E.matcher(strReplaceAll);
        if (matcher.find() && (strGroup = matcher.group(1)) != null && !"https://emv3ds/challenge".equals(strGroup)) {
            Pattern patternCompile = Pattern.compile(strGroup);
            AbstractC22676k.m65749i(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(strReplaceAll).replaceAll("https://emv3ds/challenge");
            AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        }
        this.f139940w.loadDataWithBaseURL(null, strReplaceAll, MimeType.MIME_TYPE_HTML, "UTF-8", null);
    }

    public final View.OnClickListener getOnClickListener$3ds2sdk_release() {
        return this.f139942y;
    }

    public String getUserEntry() {
        return this.f139941x;
    }

    public final ThreeDS2WebView getWebView() {
        return this.f139940w;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f139942y = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.f139942y = onClickListener;
    }
}
