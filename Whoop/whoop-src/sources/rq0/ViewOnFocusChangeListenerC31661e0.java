package rq0;

import android.text.Editable;
import android.view.View;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.StripeEditText;
import com.whoop.community.CommunityAddMemberFragment;
import com.whoop.community.CommunityRemoveMembersFragment;
import com.whoop.community.presentation.teams.TeamRemoveMembersActivity;
import j93.InterfaceC21493z;
import java.util.Iterator;

/* JADX INFO: renamed from: rq0.e0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC31661e0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f130962b;

    public /* synthetic */ ViewOnFocusChangeListenerC31661e0(Object obj, int i13) {
        this.f130961a = i13;
        this.f130962b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        Editable text;
        int i13 = this.f130961a;
        Object obj = this.f130962b;
        switch (i13) {
            case 0:
                TeamRemoveMembersActivity.m19462W((TeamRemoveMembersActivity) obj, view, z4);
                break;
            case 1:
                CardNumberEditText.m16906d((CardNumberEditText) obj, z4);
                break;
            case 2:
                CountryTextInputLayout.m16909O((CountryTextInputLayout) obj, z4);
                break;
            case 3:
                CvcEditText.m16913d((CvcEditText) obj, z4);
                break;
            case 4:
                ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) obj;
                InterfaceC21493z[] interfaceC21493zArr = ExpiryDateEditText.f22539d0;
                if (!z4 && (text = expiryDateEditText.getText()) != null && text.length() != 0 && !expiryDateEditText.f22541W) {
                    expiryDateEditText.setShouldShowError(true);
                    break;
                }
                break;
            case 5:
                StripeEditText stripeEditText = (StripeEditText) obj;
                Iterator it = stripeEditText.f22592S.iterator();
                while (it.hasNext()) {
                    ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z4);
                }
                View.OnFocusChangeListener onFocusChangeListener = stripeEditText.f22593T;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z4);
                }
                break;
            case 6:
                CommunityAddMemberFragment.m18815b0((CommunityAddMemberFragment) obj, view, z4);
                break;
            default:
                CommunityRemoveMembersFragment.m19136f0((CommunityRemoveMembersFragment) obj, view, z4);
                break;
        }
    }
}
