package he1;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.room.C1836v0;
import com.whoop.editactivities.view.EditActivitiesDrawerFragment;
import com.whoop.membership.dunning.DunningBottomSheetFragment;
import g23.ViewOnTouchListenerC15285a;
import g73.C15556d;
import i23.InterfaceC18016a;
import io.getstream.photoview.dialog.common.pager.MultiTouchViewPager;
import m23.C24967a;
import m23.C24970d;
import p031b9.C2817b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pq0.AbstractC29467b;

/* JADX INFO: renamed from: he1.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC17213b implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66149b;

    public /* synthetic */ DialogInterfaceOnShowListenerC17213b(Object obj, int i13) {
        this.f66148a = i13;
        this.f66149b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f66148a) {
            case 0:
                EditActivitiesDrawerFragment.m21342L((EditActivitiesDrawerFragment) this.f66149b, dialogInterface);
                return;
            case 1:
                C2817b c2817b = (C2817b) this.f66149b;
                C24970d c24970d = (C24970d) c2817b.f11021E;
                boolean z4 = c2817b.f11023x;
                ImageView imageView = c24970d.f97724K;
                View view = c24970d.f97721H;
                FrameLayout frameLayout = c24970d.f97723J;
                AbstractC22676k.m65750j(frameLayout, "<this>");
                frameLayout.setVisibility(0);
                MultiTouchViewPager multiTouchViewPager = c24970d.f97725L;
                AbstractC22676k.m65750j(multiTouchViewPager, "<this>");
                multiTouchViewPager.setVisibility(8);
                InterfaceC18016a interfaceC18016a = c24970d.f97736W;
                if (interfaceC18016a != null) {
                    interfaceC18016a.loadImage(imageView, c24970d.f97735V.get(c24970d.f97738b0));
                }
                AbstractC22676k.m65750j(imageView, "<this>");
                c24970d.f97737a0 = new C15556d(imageView, frameLayout);
                ViewOnTouchListenerC15285a viewOnTouchListenerC15285a = new ViewOnTouchListenerC15285a(c24970d.f97722I, new C24967a(c24970d, 0), new C1836v0(2, c24970d, C24970d.class, "handleSwipeViewMove", "handleSwipeViewMove(FI)V", 0, 9), new C24967a(c24970d, 1));
                c24970d.f97730Q = viewOnTouchListenerC15285a;
                c24970d.f97720G.setOnTouchListener(viewOnTouchListenerC15285a);
                if (!z4) {
                    view.setAlpha(1.0f);
                    AbstractC22676k.m65750j(frameLayout, "<this>");
                    frameLayout.setVisibility(8);
                    AbstractC22676k.m65750j(multiTouchViewPager, "<this>");
                    multiTouchViewPager.setVisibility(0);
                    return;
                }
                if (c24970d.f97737a0 == null) {
                    AbstractC22676k.m65757q("transitionImageAnimator");
                    throw null;
                }
                int[] containerPadding = c24970d.f97718E;
                AbstractC22676k.m65750j(containerPadding, "containerPadding");
                view.setAlpha(1.0f);
                AbstractC22676k.m65750j(frameLayout, "<this>");
                frameLayout.setVisibility(8);
                AbstractC22676k.m65750j(multiTouchViewPager, "<this>");
                multiTouchViewPager.setVisibility(0);
                return;
            case 2:
                AbstractC29467b.m89949I((AbstractC29467b) this.f66149b, dialogInterface);
                return;
            default:
                DunningBottomSheetFragment.DialogC9075b.m22632r((DunningBottomSheetFragment) this.f66149b, dialogInterface);
                return;
        }
    }
}
