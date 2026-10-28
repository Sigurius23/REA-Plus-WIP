package as2;

import android.view.View;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: as2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Ll83/a0;", "action", "a", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1953c {
    /* JADX INFO: renamed from: a */
    public static final void m5963a(View view, Function1 action) {
        AbstractC22676k.m65750j(view, "<this>");
        AbstractC22676k.m65750j(action, "action");
        view.setOnClickListener(new ViewOnClickListenerC1952b(action));
    }
}
