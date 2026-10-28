package com.whoop.realtime.presentation;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.C4965g;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.whoop.service.network.model.Sport;
import k52.AbstractC22207c;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pl.C29341d;
import vu1.AbstractC36512c;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/whoop/realtime/presentation/e;", "", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9881e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/realtime/presentation/e$a;", "", "<init>", "()V", "Landroid/widget/ImageView;", "imageView", "Llm2/b;", "activity", "Ll83/a0;", "a", "(Landroid/widget/ImageView;Llm2/b;)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private static final void m24022b(Context context, ImageView imageView) {
            ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e = ComponentCallbacks2C4960b.m15529e(context);
            componentCallbacks2C4966hM15529e.getClass();
            componentCallbacks2C4966hM15529e.m15547k(new C4965g(imageView));
        }

        /* JADX INFO: renamed from: a */
        public final void m24023a(ImageView imageView, InterfaceC24516b activity) {
            AbstractC22676k.m65750j(imageView, "imageView");
            Context context = imageView.getContext();
            if (activity == null) {
                m24022b(context, imageView);
                return;
            }
            if (activity instanceof C24518d) {
                Sport sportM71421k = ((C24518d) activity).m71421k();
                if (sportM71421k == null || sportM71421k.getIconUrl().length() == 0) {
                    m24022b(context, imageView);
                    return;
                } else {
                    ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(context).m15549m(sportM71421k.getIconUrl()).mo15533a(new C29341d().m89314d(C40786k.f175893d)).m89318i(Integer.MIN_VALUE, Integer.MIN_VALUE)).m89315e()).m15537y(imageView);
                    return;
                }
            }
            if (activity instanceof C24517c) {
                boolean zM71418s = ((C24517c) activity).m71418s();
                ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e = ComponentCallbacks2C4960b.m15529e(context);
                componentCallbacks2C4966hM15529e.getClass();
                componentCallbacks2C4966hM15529e.m15547k(new C4965g(imageView));
                imageView.setImageResource(zM71418s ? AbstractC22207c.f86267h : AbstractC36512c.f156069l);
            }
        }

        private Companion() {
        }
    }
}
