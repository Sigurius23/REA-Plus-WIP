package x30;

import com.whoop.android.R;
import i93.C18284j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import live.hms.video.error.ErrorCodes;
import m83.C25271y;
import p314m.AbstractC24858q;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: x30.s */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37925s extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C37925s f162381w = new C37925s(1, AbstractC37926s0.class, "formatExpirationDateForAccessibility", "formatExpirationDateForAccessibility(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p13 = (String) obj;
        AbstractC22676k.m65750j(p13, "p0");
        int length = p13.length();
        C25271y c25271y = C25271y.f99162w;
        if (length == 0) {
            return AbstractC32128i.m100064s(R.string.stripe_expiration_date_empty_content_description, new Object[0], c25271y);
        }
        if (AbstractC39421y.m125932Q(p13) == null) {
            return AbstractC32128i.m100055i(p13);
        }
        int i13 = ((((!AbstractC39414r.m125890i0(p13) && p13.charAt(0) != '0' && p13.charAt(0) != '1') || (p13.length() > 1 && Integer.parseInt(AbstractC39414r.m125866L0(2, p13)) > 12)) ? 1 : 0) ^ 1) + 1;
        Integer numM125932Q = AbstractC39421y.m125932Q(AbstractC39414r.m125866L0(i13, p13));
        C18284j c18284j = new C18284j(i13, AbstractC39414r.m125884c0(p13), 1);
        Integer numM125932Q2 = AbstractC39421y.m125932Q(c18284j.isEmpty() ? "" : AbstractC39414r.m125857C0(p13, c18284j));
        try {
            if (numM125932Q == null) {
                return AbstractC32128i.m100055i(p13);
            }
            Locale localeM7700b = AbstractC24858q.m72880d().m7700b(0);
            if (localeM7700b == null) {
                localeM7700b = Locale.getDefault();
            }
            Date date = new SimpleDateFormat("MM", localeM7700b).parse(String.valueOf(numM125932Q));
            String str = date != null ? new SimpleDateFormat("MMMM", localeM7700b).format(date) : null;
            if (numM125932Q2 == null) {
                return AbstractC32128i.m100064s(R.string.stripe_expiration_date_month_complete_content_description, new Object[]{str}, c25271y);
            }
            return new C18284j(0, 9, 1).m52655e(numM125932Q2.intValue()) ? AbstractC32128i.m100064s(R.string.stripe_expiration_date_year_incomplete_content_description, new Object[]{str}, c25271y) : AbstractC32128i.m100064s(R.string.stripe_expiration_date_content_description, new Object[]{str, Integer.valueOf(numM125932Q2.intValue() + ErrorCodes.InitAPIErrors.cServerErrors)}, c25271y);
        } catch (ParseException unused) {
            return AbstractC32128i.m100055i(p13);
        }
    }
}
