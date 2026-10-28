package com.whoop.community.presentation.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.google.android.material.imageview.ShapeableImageView;
import dq0.AbstractC12285c;
import eq0.AbstractC13541v;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.Attachment;
import or2.AbstractC28188o1;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Leq0/v;", "f", "(Lio/getstream/chat/android/models/Attachment;)Leq0/v;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leq0/v;", "binding", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ChatRichTextLinkView extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC13541v binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatRichTextLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC13541v m19292f(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        AbstractC13541v abstractC13541v = this.binding;
        abstractC13541v.f47705e.setText(attachment.getTitle());
        abstractC13541v.f47702b.setText(attachment.getText());
        ShapeableImageView shapeableImageView = abstractC13541v.f47703c;
        AbstractC22676k.m65747g(shapeableImageView);
        shapeableImageView.setVisibility(AbstractC28188o1.m85314d(AbstractC12285c.m34192a(attachment)) ? 0 : 8);
        ((C4964f) ComponentCallbacks2C4960b.m15529e(shapeableImageView.getContext()).m15549m(AbstractC12285c.m34192a(attachment)).m89314d(C40786k.f175894e)).m15537y(shapeableImageView);
        return abstractC13541v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRichTextLinkView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        AbstractC13541v abstractC13541vM38259c = AbstractC13541v.m38259c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC13541vM38259c, "inflate(...)");
        this.binding = abstractC13541vM38259c;
    }

    public /* synthetic */ ChatRichTextLinkView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
