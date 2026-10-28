package io.getstream.chat.android.p226ui.utils.extensions;

import android.view.View;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.ArrayList;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a'\u0010\u0014\u001a\u00020\u0003*\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0003*\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/p;", "Ll83/a0;", "actions", "updateConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "side", "constrainViewToParentBySide", "(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V", "startView", "endView", "constrainViewStartToEndOfView", "(Landroidx/constraintlayout/widget/p;Landroid/view/View;Landroid/view/View;)V", "constrainViewEndToEndOfView", "", "views", "horizontalChainInParent", "(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V", "verticalChainInParent", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ConstraintLayoutKt {
    @InternalStreamChatApi
    public static final void constrainViewEndToEndOfView(C1153p c1153p, View startView, View endView) {
        AbstractC22676k.m65750j(c1153p, "<this>");
        AbstractC22676k.m65750j(startView, "startView");
        AbstractC22676k.m65750j(endView, "endView");
        c1153p.m3649f(startView.getId(), 7, endView.getId(), 7);
    }

    @InternalStreamChatApi
    public static final void constrainViewStartToEndOfView(C1153p c1153p, View startView, View endView) {
        AbstractC22676k.m65750j(c1153p, "<this>");
        AbstractC22676k.m65750j(startView, "startView");
        AbstractC22676k.m65750j(endView, "endView");
        c1153p.m3649f(startView.getId(), 6, endView.getId(), 7);
    }

    @InternalStreamChatApi
    public static final void constrainViewToParentBySide(C1153p c1153p, View view, int i13) {
        AbstractC22676k.m65750j(c1153p, "<this>");
        AbstractC22676k.m65750j(view, "view");
        c1153p.m3649f(view.getId(), i13, 0, i13);
    }

    @InternalStreamChatApi
    public static final void horizontalChainInParent(C1153p c1153p, View... views) {
        AbstractC22676k.m65750j(c1153p, "<this>");
        AbstractC22676k.m65750j(views, "views");
        ArrayList arrayList = new ArrayList(views.length);
        for (View view : views) {
            arrayList.add(Integer.valueOf(view.getId()));
        }
        int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList);
        if (iArrM74091C1.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        c1153p.m3651j(iArrM74091C1[0]).f5118d.f5143V = 0;
        int i13 = 1;
        c1153p.m3650g(iArrM74091C1[0], 1, 0, 1, -1);
        for (int i14 = 1; i14 < iArrM74091C1.length; i14++) {
            int i15 = i14 - 1;
            c1153p.m3650g(iArrM74091C1[i14], i13, iArrM74091C1[i15], 2, -1);
            int i16 = i13;
            c1153p.m3650g(iArrM74091C1[i15], 2, iArrM74091C1[i14], i16, -1);
            i13 = i16;
        }
        c1153p.m3650g(iArrM74091C1[iArrM74091C1.length - 1], 2, 0, 2, -1);
    }

    @InternalStreamChatApi
    public static final void updateConstraints(ConstraintLayout constraintLayout, Function1 actions) {
        AbstractC22676k.m65750j(constraintLayout, "<this>");
        AbstractC22676k.m65750j(actions, "actions");
        C1153p c1153p = new C1153p();
        c1153p.m3648e(constraintLayout);
        actions.invoke(c1153p);
        c1153p.m3644a(constraintLayout);
    }

    @InternalStreamChatApi
    public static final void verticalChainInParent(C1153p c1153p, View... views) {
        AbstractC22676k.m65750j(c1153p, "<this>");
        AbstractC22676k.m65750j(views, "views");
        ArrayList arrayList = new ArrayList(views.length);
        for (View view : views) {
            arrayList.add(Integer.valueOf(view.getId()));
        }
        int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList);
        if (iArrM74091C1.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        c1153p.m3651j(iArrM74091C1[0]).f5118d.f5144W = 0;
        c1153p.m3650g(iArrM74091C1[0], 3, 0, 3, 0);
        for (int i13 = 1; i13 < iArrM74091C1.length; i13++) {
            int i14 = i13 - 1;
            c1153p.m3650g(iArrM74091C1[i13], 3, iArrM74091C1[i14], 4, 0);
            c1153p.m3650g(iArrM74091C1[i14], 4, iArrM74091C1[i13], 3, 0);
        }
        c1153p.m3650g(iArrM74091C1[iArrM74091C1.length - 1], 4, 0, 4, 0);
    }
}
