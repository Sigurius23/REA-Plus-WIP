package lq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.service.network.model.UserState;
import eq0.AbstractC13472h0;
import io.getstream.chat.android.models.User;
import java.util.Locale;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36512c;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: lq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llq0/b;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/ViewGroup;", "parent", "Leq0/h0;", "binding", "<init>", "(Landroid/view/ViewGroup;Leq0/h0;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Ll83/a0;", "bind", "(Lio/getstream/chat/android/models/User;)V", "a", "Leq0/h0;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24654b extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC13472h0 binding;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C24654b(ViewGroup viewGroup, AbstractC13472h0 abstractC13472h0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            abstractC13472h0 = AbstractC13472h0.m38195c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC22676k.m65749i(abstractC13472h0, "inflate(...)");
        }
        this(viewGroup, abstractC13472h0);
    }

    public final void bind(User user) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC13472h0 abstractC13472h0 = this.binding;
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(user.getImage()).m89314d(C40786k.f175894e)).m89319j(AbstractC36512c.f156071n)).m15537y(abstractC13472h0.f47325b);
        abstractC13472h0.f47324a.setText(user.getExtraData().get("first_name") + " " + user.getExtraData().get("last_name"));
        TextView textView = abstractC13472h0.f47326c;
        Context context = this.itemView.getContext();
        int i13 = AbstractC38505d0.f165608P;
        String lowerCase = user.getName().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        textView.setText(context.getString(i13, lowerCase));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24654b(ViewGroup parent, AbstractC13472h0 binding) {
        super(binding.getRoot());
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(binding, "binding");
        this.binding = binding;
    }
}
