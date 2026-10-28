package sq0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: sq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lsq0/b;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32882b extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextView textView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32882b(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(AbstractC38499a0.f165132N1);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.textView = (TextView) viewFindViewById;
        Context context = itemView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.context = context;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextView getTextView() {
        return this.textView;
    }

    public final Context getContext() {
        return this.context;
    }
}
