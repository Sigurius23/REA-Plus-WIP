package s40;

import android.text.InputFilter;
import com.stripe.android.view.CardNumberEditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p695zx.AbstractC41187i;
import p695zx.C41185g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s40.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C32181u extends AbstractC32155h1 {

    /* JADX INFO: renamed from: E */
    public C41185g f133276E;

    /* JADX INFO: renamed from: F */
    public boolean f133277F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ CardNumberEditText f133278G;

    /* JADX INFO: renamed from: w */
    public int f133279w;

    /* JADX INFO: renamed from: x */
    public int f133280x;

    /* JADX INFO: renamed from: y */
    public Integer f133281y;

    /* JADX INFO: renamed from: z */
    public String f133282z;

    public C32181u(CardNumberEditText cardNumberEditText) {
        this.f133278G = cardNumberEditText;
        this.f133276E = cardNumberEditText.getUnvalidatedCardNumber();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (m83.AbstractC25265s.m74096F0(p499t9.C33623c0.m106240p(r0)) != y00.EnumC38853i.Unknown) goto L51;
     */
    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s40.C32181u.afterTextChanged(android.text.Editable):void");
    }

    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f133277F = false;
        this.f133276E = this.f133278G.getUnvalidatedCardNumber();
        this.f133279w = i13;
        this.f133280x = i15;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // s40.AbstractC32155h1, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        int i16;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        C41185g c41185g = new C41185g(string);
        CardNumberEditText cardNumberEditText = this.f133278G;
        cardNumberEditText.getAccountRangeService().m133834b(c41185g, cardNumberEditText.f22521l0);
        boolean z4 = false;
        boolean z13 = i15 > i14 && i13 == 0 && c41185g.f177696d.length() >= 14;
        this.f133277F = z13;
        int panLength$payments_core_release = c41185g.f177697e;
        if (z13) {
            cardNumberEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(c41185g.m133830a(panLength$payments_core_release).length())});
        }
        if (!this.f133277F) {
            panLength$payments_core_release = cardNumberEditText.getPanLength$payments_core_release();
        }
        String strM133830a = c41185g.m133830a(panLength$payments_core_release);
        int length = strM133830a.length();
        int i17 = this.f133279w;
        int i18 = this.f133280x;
        Set set = (Set) AbstractC41187i.f177703b.get(Integer.valueOf(panLength$payments_core_release));
        if (set == null) {
            set = AbstractC41187i.f177702a;
        }
        Set set2 = set;
        boolean z14 = set2 instanceof Collection;
        if (z14 && set2.isEmpty()) {
            i16 = 0;
        } else {
            Iterator it = set2.iterator();
            i16 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (i17 <= iIntValue && i17 + i18 >= iIntValue && (i16 = i16 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        if (!z14 || !set2.isEmpty()) {
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                if (i18 == 0 && i17 == iIntValue2 + 1) {
                    z4 = true;
                    break;
                }
            }
        }
        int i19 = i17 + i18 + i16;
        if (z4 && i19 > 0) {
            i19--;
        }
        if (i19 <= length) {
            length = i19;
        }
        this.f133281y = Integer.valueOf(length);
        this.f133282z = strM133830a;
    }
}
