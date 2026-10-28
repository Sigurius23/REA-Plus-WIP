package kn2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.whoop.community.CommunityAddMemberFragment;
import com.whoop.p069ui.views.TooltipView;
import p715kotlin.jvm.internal.AbstractC22676k;
import u40.C34527c;

/* JADX INFO: renamed from: kn2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnTouchListenerC22603e implements View.OnTouchListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88934w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f88935x;

    public /* synthetic */ ViewOnTouchListenerC22603e(Object obj, int i13) {
        this.f88934w = i13;
        this.f88935x = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractActivityC1340r0 activity;
        int i13 = this.f88934w;
        Object obj = this.f88935x;
        switch (i13) {
            case 0:
                return TooltipView.m27473f((PopupWindow) obj, view, motionEvent);
            case 1:
                C34527c c34527c = (C34527c) obj;
                AbstractC22676k.m65750j(view, "view");
                if (c34527c.f145137z || !c34527c.isAdded() || (activity = c34527c.getActivity()) == null) {
                    return view.performClick();
                }
                activity.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return CommunityAddMemberFragment.m18823j0((CommunityAddMemberFragment) obj, view, motionEvent);
        }
    }
}
