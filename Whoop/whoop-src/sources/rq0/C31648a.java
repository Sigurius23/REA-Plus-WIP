package rq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import p144fc.AbstractC14345a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: rq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dRJ\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lrq0/a;", "Lfc/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "object", "", "i", "(Landroid/view/View;Ljava/lang/Object;)Z", "", "d", "()I", "Landroid/view/ViewGroup;", "container", "position", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "Ll83/a0;", "a", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "u", "(I)I", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/ArrayList;", "Lrq0/p;", "Lkotlin/collections/ArrayList;", "value", "Ljava/util/ArrayList;", "t", "()Ljava/util/ArrayList;", "v", "(Ljava/util/ArrayList;)V", "banners", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31648a extends AbstractC14345a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ArrayList<InterfaceC31687p> banners;

    public C31648a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.banners = new ArrayList<>();
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: a */
    public void mo4232a(ViewGroup container, int position, Object object) {
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(object, "object");
        container.removeView((View) object);
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: d */
    public int mo28901d() {
        return this.banners.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: h */
    public Object mo4234h(ViewGroup container, int position) {
        AbstractC22676k.m65750j(container, "container");
        View viewInflate = LayoutInflater.from(this.context).inflate(AbstractC38501b0.f165504Z, container, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC38499a0.f165242a3);
        InterfaceC31687p interfaceC31687p = this.banners.get(m97818u(position));
        AbstractC22676k.m65749i(interfaceC31687p, "get(...)");
        AbstractC22676k.m65747g(imageView);
        InterfaceC31687p.m98188a(interfaceC31687p, imageView, this.context, null, 4, null);
        container.addView(viewInflate);
        return viewInflate;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: i */
    public boolean mo4235i(View view, Object object) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(object, "object");
        return view.equals(object);
    }

    /* JADX INFO: renamed from: t */
    public final ArrayList<InterfaceC31687p> m97817t() {
        return this.banners;
    }

    /* JADX INFO: renamed from: u */
    public final int m97818u(int position) {
        return position % this.banners.size();
    }

    /* JADX INFO: renamed from: v */
    public final void m97819v(ArrayList<InterfaceC31687p> value) {
        AbstractC22676k.m65750j(value, "value");
        this.banners = value;
        m40968j();
    }
}
