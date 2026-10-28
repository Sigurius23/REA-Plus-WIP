package mq0;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import bq0.C3547c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.data.local.prefs.PreferenceHelper;
import eq0.AbstractC13492l0;
import iq0.C20838q;
import iq0.C20841t;
import js2.C21930h;
import l83.C23454a0;
import l83.C23465k;
import p429ql.AbstractC30457c;
import p464rl.InterfaceC31508c;
import p676zb.C40253d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36510a;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: mq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lmq0/g;", "Landroidx/recyclerview/widget/o2;", "Leq0/l0;", "dataWidgetItemViewBinding", "Lkotlin/Function1;", "Liq0/t;", "Ll83/a0;", "widgetOnClickListener", "<init>", "(Leq0/l0;Lkotlin/jvm/functions/Function1;)V", "Lbq0/c;", "dataWidgetImage", "Ll83/k;", "", "authHeader", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "c", "(Lbq0/c;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "a", "Leq0/l0;", "b", "Lkotlin/jvm/functions/Function1;", "Lzb/d;", "Lzb/d;", NotificationCompat.CATEGORY_PROGRESS, "d", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25882g extends AbstractC1717o2 {

    /* JADX INFO: renamed from: d */
    private static final a f102097d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f102098e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC13492l0 dataWidgetItemViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 widgetOnClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40253d progress;

    /* JADX INFO: renamed from: mq0.g$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lmq0/g$a;", "", "<init>", "()V", "", "PROGRESS_WIDTH", "F", "PROGRESS_RADIUS", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: mq0.g$b */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m65681d2 = {"mq0/g$b", "Lql/c;", "Landroid/graphics/Bitmap;", "resource", "Lrl/c;", "transition", "Ll83/a0;", "j", "(Landroid/graphics/Bitmap;Lrl/c;)V", "Landroid/graphics/drawable/Drawable;", "errorDrawable", "g", "(Landroid/graphics/drawable/Drawable;)V", "placeholder", "e", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC30457c {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C3547c f102102E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C25882g f102103F;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC13492l0 f102104z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC13492l0 abstractC13492l0, C3547c c3547c, C25882g c25882g) {
            super(0);
            this.f102104z = abstractC13492l0;
            this.f102102E = c3547c;
            this.f102103F = c25882g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final C23454a0 m76514k(C25882g c25882g, C3547c c3547c, Bitmap bitmap, View it) {
            AbstractC22676k.m65750j(it, "it");
            c25882g.widgetOnClickListener.invoke(new C20841t(c3547c.getName(), bitmap));
            return C23454a0.f92919a;
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: e */
        public void mo5839e(Drawable placeholder) {
        }

        @Override // p429ql.AbstractC30457c, p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: g */
        public void mo15543g(Drawable errorDrawable) {
            this.f102104z.f47425a.setImageResource(AbstractC38529z.f165810c);
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo5838b(Bitmap resource, InterfaceC31508c transition) {
            AbstractC22676k.m65750j(resource, "resource");
            this.f102104z.f47425a.setImageBitmap(resource);
            if (this.f102102E.getHasData()) {
                View root = this.f102103F.dataWidgetItemViewBinding.getRoot();
                AbstractC22676k.m65749i(root, "getRoot(...)");
                AbstractC1953c.m5963a(root, new C21930h(this.f102103F, this.f102102E, resource, 22));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25882g(AbstractC13492l0 dataWidgetItemViewBinding, Function1 widgetOnClickListener) {
        super(dataWidgetItemViewBinding.getRoot());
        AbstractC22676k.m65750j(dataWidgetItemViewBinding, "dataWidgetItemViewBinding");
        AbstractC22676k.m65750j(widgetOnClickListener, "widgetOnClickListener");
        this.dataWidgetItemViewBinding = dataWidgetItemViewBinding;
        this.widgetOnClickListener = widgetOnClickListener;
        C40253d c40253d = new C40253d(this.itemView.getContext());
        c40253d.m129251b(5.0f);
        c40253d.f174066w.f174059n = 30.0f;
        c40253d.invalidateSelf();
        c40253d.setColorFilter(new PorterDuffColorFilter(this.itemView.getContext().getColor(AbstractC36510a.f156023c0), PorterDuff.Mode.SRC_IN));
        c40253d.start();
        this.progress = c40253d;
    }

    /* JADX INFO: renamed from: c */
    public final void m76512c(C3547c dataWidgetImage, C23465k authHeader, PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(dataWidgetImage, "dataWidgetImage");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC13492l0 abstractC13492l0 = this.dataWidgetItemViewBinding;
        abstractC13492l0.f47426b.setText(dataWidgetImage.getName());
        abstractC13492l0.f47425a.setImageDrawable(this.progress);
        C4964f c4964fM15546j = ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15546j();
        c4964fM15546j.f20321Y = C20838q.f78353a.m57557b(dataWidgetImage.getThumbnailUrl(), authHeader, preferenceHelper);
        c4964fM15546j.f20323a0 = true;
        c4964fM15546j.m15538z(new b(abstractC13492l0, dataWidgetImage, this));
    }
}
