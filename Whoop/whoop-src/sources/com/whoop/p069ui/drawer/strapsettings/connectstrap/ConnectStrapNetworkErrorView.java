package com.whoop.p069ui.drawer.strapsettings.connectstrap;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.p069ui.pills.StrokedPillButton;
import hi0.AbstractC17306d;
import hi0.AbstractC17314l;
import ii0.AbstractC18549i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.C29616a;
import qm2.EnumC30499p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "arr", "Ll83/a0;", "b", "(Landroid/content/res/TypedArray;)V", "Lkotlin/Function0;", "clickFn", "setRetryClickListener", "(Lc93/a;)V", "Lqm2/p;", "errorState", "setErrorState", "(Lqm2/p;)V", "Lii0/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lii0/i;", "binding", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConnectStrapNetworkErrorView extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private AbstractC18549i binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectStrapNetworkErrorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC17314l.f67052g);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m27134b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    private final void m27134b(TypedArray arr) {
        AbstractC18549i abstractC18549iM53761c = AbstractC18549i.m53761c(LayoutInflater.from(getContext()), this, true);
        AbstractC22676k.m65749i(abstractC18549iM53761c, "inflate(...)");
        this.binding = abstractC18549iM53761c;
        if (arr != null) {
            abstractC18549iM53761c.f72288c.setText(arr.getString(AbstractC17314l.f67055j));
            AbstractC18549i abstractC18549i = this.binding;
            if (abstractC18549i == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC18549i.f72287b.setText(arr.getString(AbstractC17314l.f67054i));
            AbstractC18549i abstractC18549i2 = this.binding;
            if (abstractC18549i2 != null) {
                abstractC18549i2.f72286a.setImageResource(arr.getResourceId(AbstractC17314l.f67053h, AbstractC17306d.f66532c));
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m27135c(InterfaceC4339a interfaceC4339a, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    public final void setErrorState(EnumC30499p errorState) {
        AbstractC22676k.m65750j(errorState, "errorState");
        AbstractC18549i abstractC18549i = this.binding;
        if (abstractC18549i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18549i.f72288c.setText(getContext().getString(errorState.getTitleTextResource()));
        AbstractC18549i abstractC18549i2 = this.binding;
        if (abstractC18549i2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18549i2.f72287b.setText(getContext().getString(errorState.getSubtitleTextResource()));
        C4964f c4964fM15548l = ComponentCallbacks2C4960b.m15529e(getContext()).m15548l(Integer.valueOf(errorState.getErrorImageResource()));
        AbstractC18549i abstractC18549i3 = this.binding;
        if (abstractC18549i3 != null) {
            c4964fM15548l.m15537y(abstractC18549i3.f72286a);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setRetryClickListener(InterfaceC4339a clickFn) {
        AbstractC22676k.m65750j(clickFn, "clickFn");
        AbstractC18549i abstractC18549i = this.binding;
        if (abstractC18549i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        StrokedPillButton retryButton = abstractC18549i.f72289d;
        AbstractC22676k.m65749i(retryButton, "retryButton");
        AbstractC1953c.m5963a(retryButton, new C29616a(clickFn, 16));
    }
}
