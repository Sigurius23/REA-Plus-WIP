package pr;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.whoop.android.R;
import io.sentry.config.AbstractC20301a;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: pr.a */
/* JADX INFO: loaded from: classes6.dex */
public class C29485a extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29485a(Context context, AttributeSet attributeSet, int i13) {
        super(AbstractC30554a.m93706a(context, attributeSet, i13, 0), attributeSet, i13);
        Context context2 = getContext();
        if (AbstractC20301a.m56324W(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC21885a.f84526C;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i13, 0);
            int[] iArr2 = {1, 2};
            int iM65697E = -1;
            for (int i14 = 0; i14 < 2 && iM65697E < 0; i14++) {
                iM65697E = AbstractC22674j.m65697E(context2, typedArrayObtainStyledAttributes, iArr2[i14], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM65697E != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i13, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC21885a.f84525B);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iM65697E2 = -1;
                for (int i15 = 0; i15 < 2 && iM65697E2 < 0; i15++) {
                    iM65697E2 = AbstractC22674j.m65697E(context3, typedArrayObtainStyledAttributes3, iArr3[i15], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iM65697E2 >= 0) {
                    setLineHeight(iM65697E2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        if (AbstractC20301a.m56324W(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i13, AbstractC21885a.f84525B);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iM65697E = -1;
            for (int i14 = 0; i14 < 2 && iM65697E < 0; i14++) {
                iM65697E = AbstractC22674j.m65697E(context2, typedArrayObtainStyledAttributes, iArr[i14], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM65697E >= 0) {
                setLineHeight(iM65697E);
            }
        }
    }
}
