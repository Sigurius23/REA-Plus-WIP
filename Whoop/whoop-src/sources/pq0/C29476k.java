package pq0;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.domain.model.teams.Widget;
import eq0.AbstractC13540u3;
import iq0.C20838q;
import l83.C23465k;
import p429ql.AbstractC30457c;
import p464rl.InterfaceC31508c;
import p676zb.C40253d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: pq0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lpq0/k;", "Landroidx/recyclerview/widget/o2;", "Leq0/u3;", "widgetItemViewBinding", "<init>", "(Leq0/u3;)V", "Lcom/whoop/domain/model/teams/Widget;", "widget", "Ll83/k;", "", "authHeader", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Ll83/a0;", "a", "(Lcom/whoop/domain/model/teams/Widget;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "Leq0/u3;", "Lzb/d;", "b", "Lzb/d;", NotificationCompat.CATEGORY_PROGRESS, "c", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29476k extends AbstractC1717o2 {

    /* JADX INFO: renamed from: c */
    private static final a f119727c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f119728d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC13540u3 widgetItemViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40253d progress;

    /* JADX INFO: renamed from: pq0.k$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lpq0/k$a;", "", "<init>", "()V", "", "PROGRESS_WIDTH", "F", "PROGRESS_RADIUS", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: pq0.k$b */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"pq0/k$b", "Lql/c;", "Landroid/graphics/Bitmap;", "resource", "Lrl/c;", "transition", "Ll83/a0;", "i", "(Landroid/graphics/Bitmap;Lrl/c;)V", "Landroid/graphics/drawable/Drawable;", "placeholder", "e", "(Landroid/graphics/drawable/Drawable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC30457c {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC13540u3 f119731z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC13540u3 abstractC13540u3) {
            super(0);
            this.f119731z = abstractC13540u3;
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: e */
        public void mo5839e(Drawable placeholder) {
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo5838b(Bitmap resource, InterfaceC31508c transition) {
            AbstractC22676k.m65750j(resource, "resource");
            this.f119731z.f47700a.setImageBitmap(resource);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29476k(AbstractC13540u3 widgetItemViewBinding) {
        super(widgetItemViewBinding.getRoot());
        AbstractC22676k.m65750j(widgetItemViewBinding, "widgetItemViewBinding");
        this.widgetItemViewBinding = widgetItemViewBinding;
        C40253d c40253d = new C40253d(this.itemView.getContext());
        c40253d.m129251b(5.0f);
        c40253d.f174066w.f174059n = 40.0f;
        c40253d.invalidateSelf();
        c40253d.setColorFilter(new PorterDuffColorFilter(this.itemView.getContext().getColor(AbstractC36510a.f156023c0), PorterDuff.Mode.SRC_IN));
        c40253d.start();
        this.progress = c40253d;
    }

    /* JADX INFO: renamed from: a */
    public final void m90013a(Widget widget, C23465k authHeader, PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(widget, "widget");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        setIsRecyclable(false);
        AbstractC13540u3 abstractC13540u3 = this.widgetItemViewBinding;
        abstractC13540u3.f47700a.setImageDrawable(this.progress);
        C4964f c4964fM15546j = ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15546j();
        c4964fM15546j.f20321Y = C20838q.f78353a.m57557b(widget.getImageUrl(), authHeader, preferenceHelper);
        c4964fM15546j.f20323a0 = true;
        c4964fM15546j.m15538z(new b(abstractC13540u3));
    }
}
