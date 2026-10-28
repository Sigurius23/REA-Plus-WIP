package p52;

import android.view.View;
import k52.AbstractC22208d;
import p144fc.InterfaceC14352h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p52.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lp52/a;", "Lfc/h;", "<init>", "()V", "Landroid/view/View;", "page", "", "position", "Ll83/a0;", "a", "(Landroid/view/View;F)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28858a implements InterfaceC14352h {
    @Override // p144fc.InterfaceC14352h
    /* JADX INFO: renamed from: a */
    public void mo40974a(View page, float position) {
        AbstractC22676k.m65750j(page, "page");
        View viewFindViewById = page.findViewById(AbstractC22208d.f86346g);
        int height = viewFindViewById != null ? viewFindViewById.getHeight() : 0;
        if (height <= 0) {
            return;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setTranslationX((-position) * page.getWidth());
        }
        View viewFindViewById2 = page.findViewById(AbstractC22208d.f86355j);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setTranslationX((-position) * page.getWidth());
        }
        View viewFindViewById3 = page.findViewById(AbstractC22208d.f86354i1);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setTranslationX((-position) * page.getWidth());
        }
        View viewFindViewById4 = page.findViewById(AbstractC22208d.f86310R);
        if (viewFindViewById4 != null) {
            viewFindViewById4.bringToFront();
        }
        Object tag = page.getTag();
        if (AbstractC22676k.m65745e(tag, 0)) {
            View viewFindViewById5 = page.findViewById(AbstractC22208d.f86350h0);
            viewFindViewById5.setTranslationY((-position) * height);
            viewFindViewById5.setAlpha((position * 2.0f) + 1.0f);
            return;
        }
        if (AbstractC22676k.m65745e(tag, 1)) {
            View viewFindViewById6 = page.findViewById(AbstractC22208d.f86368p0);
            AbstractC22676k.m65748h(viewFindViewById6, "null cannot be cast to non-null type android.view.View");
            viewFindViewById6.setTranslationY((-position) * height);
            viewFindViewById6.setAlpha(1.0f - (position * 2.0f));
            return;
        }
        if (AbstractC22676k.m65745e(tag, 2)) {
            View viewFindViewById7 = page.findViewById(AbstractC22208d.f86294J);
            AbstractC22676k.m65748h(viewFindViewById7, "null cannot be cast to non-null type android.view.View");
            float f13 = (-position) * height;
            viewFindViewById7.setTranslationY(f13);
            float f14 = 1.0f - (position * 2.0f);
            viewFindViewById7.setAlpha(f14);
            View viewFindViewById8 = page.findViewById(AbstractC22208d.f86298L);
            AbstractC22676k.m65748h(viewFindViewById8, "null cannot be cast to non-null type android.view.View");
            viewFindViewById8.setTranslationY(f13);
            viewFindViewById8.setAlpha(f14);
            View viewFindViewById9 = page.findViewById(AbstractC22208d.f86296K);
            AbstractC22676k.m65748h(viewFindViewById9, "null cannot be cast to non-null type android.view.View");
            viewFindViewById9.setTranslationY(f13);
            viewFindViewById9.setAlpha(f14);
        }
    }
}
