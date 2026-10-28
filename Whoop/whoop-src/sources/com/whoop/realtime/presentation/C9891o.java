package com.whoop.realtime.presentation;

import android.view.View;
import android.widget.TextView;
import k52.AbstractC22208d;
import o52.AbstractC27541a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q52.C29987e;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/realtime/presentation/o;", "Lo52/a;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/whoop/realtime/presentation/c;", "item", "Ll83/a0;", "a", "(Lcom/whoop/realtime/presentation/c;)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9891o extends AbstractC27541a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9891o(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
    }

    @Override // o52.AbstractC27541a
    /* JADX INFO: renamed from: a */
    public void mo24021a(AbstractC9879c item) {
        AbstractC22676k.m65750j(item, "item");
        if (!(item instanceof AbstractC9879c.d)) {
            throw new IllegalStateException("Check failed.");
        }
        View viewFindViewById = this.itemView.findViewById(AbstractC22208d.f86326Z);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        C29987e.m91714a((TextView) viewFindViewById, ((AbstractC9879c.d) item).getText());
    }
}
