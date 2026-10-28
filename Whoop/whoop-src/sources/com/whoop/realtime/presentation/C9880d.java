package com.whoop.realtime.presentation;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import as2.AbstractC1953c;
import java.util.Locale;
import k52.AbstractC22206b;
import k52.AbstractC22208d;
import l83.C23454a0;
import nq0.C27050m;
import o52.AbstractC27541a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/realtime/presentation/d;", "Lo52/a;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Lcom/whoop/realtime/presentation/c$a;", "Ll83/a0;", "onClick", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lcom/whoop/realtime/presentation/c;", "item", "a", "(Lcom/whoop/realtime/presentation/c;)V", "Lkotlin/jvm/functions/Function1;", "b", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9880d extends AbstractC27541a {

    /* JADX INFO: renamed from: c */
    public static final int f28944c = 8;

    /* JADX INFO: renamed from: d */
    private static final int f28945d = AbstractC22206b.f86243b;

    /* JADX INFO: renamed from: e */
    private static final int f28946e = AbstractC36510a.f156020b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9880d(View itemView, Function1 onClick) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.onClick = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m24020c(C9880d c9880d, AbstractC9879c abstractC9879c, View it) {
        AbstractC22676k.m65750j(it, "it");
        c9880d.onClick.invoke(abstractC9879c);
        return C23454a0.f92919a;
    }

    @Override // o52.AbstractC27541a
    /* JADX INFO: renamed from: a */
    public void mo24021a(AbstractC9879c item) {
        AbstractC22676k.m65750j(item, "item");
        if (!(item instanceof AbstractC9879c.a)) {
            throw new IllegalStateException("Check failed.");
        }
        View itemView = this.itemView;
        AbstractC22676k.m65749i(itemView, "itemView");
        AbstractC1953c.m5963a(itemView, new C27050m(6, this, item));
        AbstractC9879c.a aVar = (AbstractC9879c.a) item;
        int color = aVar.getSelected() ? this.itemView.getContext().getColor(f28946e) : this.itemView.getContext().getColor(f28945d);
        ImageView imageView = (ImageView) this.itemView.findViewById(AbstractC22208d.f86341e0);
        AbstractC9881e.Companion aVar2 = AbstractC9881e.INSTANCE;
        AbstractC22676k.m65747g(imageView);
        aVar2.m24023a(imageView, aVar.getActivity());
        imageView.setColorFilter(Color.rgb(Color.red(color), Color.green(color), Color.blue(color)));
        imageView.setAlpha(Color.alpha(color) / 255.0f);
        TextView textView = (TextView) this.itemView.findViewById(AbstractC22208d.f86344f0);
        aVar.getActivity().mo71416i(textView);
        String strMo71413b = aVar.getActivity().mo71413b();
        AbstractC22676k.m65749i(strMo71413b, "getNameKey(...)");
        Locale locale = Locale.US;
        textView.setTag(AbstractC31061c.m95641q(locale, "US", strMo71413b, locale, "toLowerCase(...)"));
        textView.setTextColor(color);
    }
}
