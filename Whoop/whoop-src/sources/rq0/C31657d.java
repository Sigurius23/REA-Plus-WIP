package rq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import il.C18615a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p144fc.AbstractC14345a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vq0.AbstractC36282f;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: rq0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 Rb\u0010,\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"`$2\"\u0010%\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"`$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R>\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050-j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, m65681d2 = {"Lrq0/d;", "Lfc/a;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Ll83/a0;", "onTapLogo", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "object", "", "i", "(Landroid/view/View;Ljava/lang/Object;)Z", "d", "()I", "Landroid/view/ViewGroup;", "container", "position", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "a", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "x", "(I)I", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/ArrayList;", "", "Lrq0/p;", "Lkotlin/collections/ArrayList;", "value", "e", "Ljava/util/ArrayList;", "u", "()Ljava/util/ArrayList;", "y", "(Ljava/util/ArrayList;)V", "logos", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "f", "Ljava/util/HashMap;", "v", "()Ljava/util/HashMap;", "setVariantIndex", "(Ljava/util/HashMap;)V", "variantIndex", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31657d extends AbstractC14345a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1 onTapLogo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ArrayList<List<InterfaceC31687p>> logos;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private HashMap<Integer, Integer> variantIndex;

    public C31657d(Context context, Function1 onTapLogo) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(onTapLogo, "onTapLogo");
        this.context = context;
        this.onTapLogo = onTapLogo;
        this.logos = new ArrayList<>();
        this.variantIndex = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m97917w(C31657d c31657d, int i13, ImageView imageView, ImageView imageView2, View view) {
        int iM97920x = c31657d.m97920x(i13);
        Integer num = c31657d.variantIndex.get(Integer.valueOf(iM97920x));
        int iIntValue = ((num != null ? num.intValue() : 0) + 1) % c31657d.logos.get(iM97920x).size();
        c31657d.variantIndex.put(Integer.valueOf(iM97920x), Integer.valueOf(iIntValue));
        if (c31657d.logos.get(iM97920x).size() > 1) {
            InterfaceC31687p interfaceC31687p = c31657d.logos.get(iM97920x).get(iIntValue);
            AbstractC22676k.m65747g(imageView);
            interfaceC31687p.mo98189b(imageView, c31657d.context, C18615a.m53885b(300));
        }
        c31657d.onTapLogo.invoke(Integer.valueOf(iIntValue));
        AbstractC22676k.m65747g(imageView2);
        AbstractC36282f.m115969a(imageView2, 0.5f, 75L, 150L);
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
        return this.logos.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: h */
    public Object mo4234h(ViewGroup container, final int position) {
        AbstractC22676k.m65750j(container, "container");
        View viewInflate = LayoutInflater.from(this.context).inflate(AbstractC38501b0.f165506a0, container, false);
        final ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC38499a0.f165018A4);
        final ImageView imageView2 = (ImageView) viewInflate.findViewById(AbstractC38499a0.f165034C2);
        List<InterfaceC31687p> list = this.logos.get(m97920x(position));
        Integer num = this.variantIndex.get(Integer.valueOf(m97920x(position)));
        InterfaceC31687p interfaceC31687p = list.get(num != null ? num.intValue() : 0);
        AbstractC22676k.m65747g(imageView);
        InterfaceC31687p.m98188a(interfaceC31687p, imageView, this.context, null, 4, null);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: rq0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C31657d.m97917w(this.f130902w, position, imageView, imageView2, view);
            }
        });
        if (this.logos.get(m97920x(position)).size() <= 1) {
            imageView2.setVisibility(8);
        }
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

    /* JADX INFO: renamed from: u */
    public final ArrayList<List<InterfaceC31687p>> m97918u() {
        return this.logos;
    }

    /* JADX INFO: renamed from: v */
    public final HashMap<Integer, Integer> m97919v() {
        return this.variantIndex;
    }

    /* JADX INFO: renamed from: x */
    public final int m97920x(int position) {
        return position % this.logos.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m97921y(ArrayList<List<InterfaceC31687p>> value) {
        AbstractC22676k.m65750j(value, "value");
        ArrayList<List<InterfaceC31687p>> arrayList = new ArrayList<>();
        for (Object obj : value) {
            if (!((List) obj).isEmpty()) {
                arrayList.add(obj);
            }
        }
        this.logos = arrayList;
        m40968j();
    }
}
