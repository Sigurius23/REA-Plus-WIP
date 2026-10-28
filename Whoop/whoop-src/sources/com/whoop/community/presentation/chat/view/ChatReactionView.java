package com.whoop.community.presentation.chat.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1177g;
import eq0.AbstractC13521r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xp0.AbstractC38501b0;
import xp0.AbstractC38509f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/community/presentation/chat/view/ChatReactionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "arr", "Ll83/a0;", "f", "(Landroid/content/res/TypedArray;)V", "", "count", "setCount", "(I)V", "Leq0/r;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leq0/r;", "binding", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ChatReactionView extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private AbstractC13521r binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC38509f0.f165744a);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m19291f(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    private final void m19291f(TypedArray arr) {
        ImageView imageView;
        Object systemService = getContext().getSystemService("layout_inflater");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        AbstractC13521r abstractC13521r = (AbstractC13521r) AbstractC1177g.m3732c((LayoutInflater) systemService, AbstractC38501b0.f165529m, this, true);
        this.binding = abstractC13521r;
        if (arr == null || abstractC13521r == null || (imageView = abstractC13521r.f47573b) == null) {
            return;
        }
        imageView.setImageResource(arr.getResourceId(AbstractC38509f0.f165745b, 0));
    }

    public final void setCount(int count) {
        TextView textView;
        AbstractC13521r abstractC13521r = this.binding;
        if (abstractC13521r == null || (textView = abstractC13521r.f47572a) == null) {
            return;
        }
        textView.setText(String.valueOf(count));
    }
}
