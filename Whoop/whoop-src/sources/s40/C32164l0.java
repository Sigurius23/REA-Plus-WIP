package s40;

import android.content.res.Resources;
import android.text.Editable;
import com.stripe.android.view.ExpiryDateEditText;
import com.whoop.android.R;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.util.Calendar;
import l83.C23467m;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38833g;
import y00.C38806d2;

/* JADX INFO: renamed from: s40.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32164l0 extends AbstractC32155h1 {

    /* JADX INFO: renamed from: E */
    public String f133230E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ ExpiryDateEditText f133231F;

    /* JADX INFO: renamed from: w */
    public int f133232w;

    /* JADX INFO: renamed from: x */
    public int f133233x;

    /* JADX INFO: renamed from: y */
    public C38806d2 f133234y = C38806d2.f166997f;

    /* JADX INFO: renamed from: z */
    public Integer f133235z;

    public C32164l0(ExpiryDateEditText expiryDateEditText) {
        this.f133231F = expiryDateEditText;
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i13;
        Object objM107888l;
        int iIntValue;
        Object objM107888l2;
        String str = this.f133230E;
        boolean z4 = false;
        ExpiryDateEditText expiryDateEditText = this.f133231F;
        if (str != null) {
            expiryDateEditText.setTextSilent$payments_core_release(str);
            Integer num = this.f133235z;
            if (num != null) {
                expiryDateEditText.setSelection(AbstractC12889b.m36284n(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
            }
        }
        C38806d2 c38806d2 = this.f133234y;
        String str2 = c38806d2.f166998a;
        String str3 = c38806d2.f166999b;
        boolean z13 = str2.length() == 2 && !this.f133234y.f167000c;
        if (str2.length() == 2 && str3.length() == 2) {
            boolean z14 = expiryDateEditText.f22541W;
            int iIntValue2 = -1;
            Object obj = -1;
            if (str2.length() != 2) {
                iIntValue = -1;
            } else {
                try {
                    objM107888l = Integer.valueOf(Integer.parseInt(str2));
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l instanceof C23467m) {
                    objM107888l = obj;
                }
                iIntValue = ((Number) objM107888l).intValue();
            }
            if (str3.length() == 2) {
                try {
                    int i14 = Integer.parseInt(str3);
                    Calendar calendar = Calendar.getInstance();
                    AbstractC22676k.m65749i(calendar, "getInstance(...)");
                    int i15 = calendar.get(1);
                    int i16 = i15 / 100;
                    int i17 = i15 % 100;
                    if (i17 > 80 && i14 < 20) {
                        i16++;
                    } else if (i17 < 20 && i14 > 80) {
                        i16--;
                    }
                    objM107888l2 = Integer.valueOf((i16 * 100) + i14);
                } catch (Throwable th4) {
                    objM107888l2 = AbstractC34132o.m107888l(th4);
                }
                iIntValue2 = ((Number) (objM107888l2 instanceof C23467m ? -1 : objM107888l2)).intValue();
            }
            boolean zM113386I = AbstractC35785b.m113386I(iIntValue, iIntValue2);
            expiryDateEditText.f22541W = zM113386I;
            boolean z15 = !zM113386I;
            if (!z14 && zM113386I) {
                expiryDateEditText.getCompletionCallback().invoke();
            }
            z13 = z15;
        } else {
            expiryDateEditText.f22541W = false;
        }
        Resources resources = expiryDateEditText.getResources();
        C38806d2 c38806d3 = this.f133234y;
        if (c38806d3.f167002e) {
            i13 = R.string.stripe_incomplete_expiry_date;
        } else {
            i13 = !c38806d3.f167000c ? R.string.stripe_invalid_expiry_month : R.string.stripe_invalid_expiry_year;
        }
        expiryDateEditText.setErrorMessage(resources.getString(i13));
        if (z13) {
            C38806d2 c38806d4 = this.f133234y;
            if (c38806d4.f167002e || c38806d4.f167001d) {
                z4 = true;
            }
        }
        expiryDateEditText.setShouldShowError(z4);
        this.f133230E = null;
        this.f133235z = null;
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f133232w = i13;
        this.f133233x = i15;
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        StringBuilder sb4 = new StringBuilder();
        int length = string.length();
        int length2 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = string.charAt(i16);
            if (Character.isDigit(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        String string2 = sb4.toString();
        if (string2.length() == 1 && this.f133232w == 0 && this.f133233x == 1) {
            char cCharAt2 = string2.charAt(0);
            if (cCharAt2 != '0' && cCharAt2 != '1') {
                string2 = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE.concat(string2);
                this.f133233x++;
            }
        } else if (string2.length() == 2 && this.f133232w == 2 && this.f133233x == 0) {
            string2 = string2.substring(0, 1);
            AbstractC22676k.m65749i(string2, "substring(...)");
        }
        C38806d2 c38806d2 = C38806d2.f166997f;
        C38806d2 c38806d2M124345a = AbstractC38833g.m124345a(string2);
        this.f133234y = c38806d2M124345a;
        boolean z4 = c38806d2M124345a.f167000c;
        String str = c38806d2M124345a.f166998a;
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        int length3 = str.length();
        ExpiryDateEditText expiryDateEditText = this.f133231F;
        if ((length3 == 2 && this.f133233x > 0 && z4) || string2.length() > 2) {
            sbM53374o.append(expiryDateEditText.f22544c0);
        }
        sbM53374o.append(c38806d2M124345a.f166999b);
        String string3 = sbM53374o.toString();
        AbstractC22676k.m65749i(string3, "toString(...)");
        int length4 = string3.length();
        int i17 = this.f133232w;
        int i18 = this.f133233x;
        int length5 = expiryDateEditText.f22544c0.length() + expiryDateEditText.f22543b0;
        int length6 = (i17 > 2 || i17 + i18 < 2) ? 0 : expiryDateEditText.f22544c0.length();
        boolean z13 = i18 == 0 && i17 == expiryDateEditText.f22544c0.length() + 2;
        int i19 = i17 + i18 + length6;
        if (z13 && i19 > 0) {
            length2 = expiryDateEditText.f22544c0.length();
        }
        this.f133235z = Integer.valueOf(Math.min(length5, Math.min(i19 - length2, length4)));
        this.f133230E = string3;
    }
}
