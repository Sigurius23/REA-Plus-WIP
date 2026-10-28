package com.whoop.community.presentation.chat.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.google.android.material.imageview.ShapeableImageView;
import com.whoop.data.local.prefs.PreferenceHelper;
import dq0.AbstractC12285c;
import eq0.AbstractC13511p;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.Attachment;
import iq0.C20838q;
import kq0.C22772a;
import kr.C22782a;
import kr.C22791j;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p429ql.AbstractC30465k;
import p505ts.AbstractC34132o;
import p676zb.C40253d;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import se.AbstractC32411b;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import vu1.AbstractC36511b;
import wb3.AbstractC37056f;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00017B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJS\u0010\u0018\u001a\u001e\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u0011\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00170\u00170\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00103\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0011\u00105\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b4\u0010.¨\u00068"}, m65681d2 = {"Lcom/whoop/community/presentation/chat/view/ChatImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "size", "Ll83/a0;", "setImageCorners", "(I)V", "", QueryParams.URL, "Landroid/widget/ImageView;", "imageView", "Ll83/k;", "header", "Lql/k;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "f", "(Ljava/lang/String;Landroid/widget/ImageView;Ll83/k;)Lql/k;", "Lkq0/a;", "viewState", "Leq0/p;", "j", "(Lkq0/a;)Leq0/p;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getPreferenceHelper", "()Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lzb/d;", "x", "Lzb/d;", NotificationCompat.CATEGORY_PROGRESS, "y", "Leq0/p;", "binding", "Lcom/google/android/material/imageview/ShapeableImageView;", "getImageOne", "()Lcom/google/android/material/imageview/ShapeableImageView;", "imageOne", "getImageTwo", "imageTwo", "getImageThree", "imageThree", "getImageGiphy", "imageGiphy", "z", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ChatImageView extends ConstraintLayout implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h preferenceHelper;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40253d progress;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC13511p binding;

    /* JADX INFO: renamed from: z */
    private static final C6337a f24970z = new C6337a(null);

    /* JADX INFO: renamed from: E */
    public static final int f24969E = 8;

    /* JADX INFO: renamed from: com.whoop.community.presentation.chat.view.ChatImageView$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/presentation/chat/view/ChatImageView$a;", "", "<init>", "()V", "", "PROGRESS_WIDTH", "F", "PROGRESS_RADIUS", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6337a {
        public /* synthetic */ C6337a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6337a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.chat.view.ChatImageView$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6338b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f24974w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24975x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24976y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6338b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24974w = interfaceC27903a;
            this.f24975x = interfaceC35951a;
            this.f24976y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.local.prefs.PreferenceHelper, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final PreferenceHelper invoke() {
            InterfaceC27903a interfaceC27903a = this.f24974w;
            InterfaceC35951a interfaceC35951a = this.f24975x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f24976y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PreferenceHelper.class), interfaceC35951a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC30465k m19289f(String url, ImageView imageView, C23465k header) {
        ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e = ComponentCallbacks2C4960b.m15529e(getContext());
        Object objM57557b = C20838q.f78353a.m57557b(url, header, getPreferenceHelper());
        C4964f c4964fM15545i = componentCallbacks2C4966hM15529e.m15545i(Drawable.class);
        c4964fM15545i.f20321Y = objM57557b;
        c4964fM15545i.f20323a0 = true;
        return ((C4964f) ((C4964f) c4964fM15545i.m89314d(C40786k.f175894e)).m89320k(this.progress)).m15537y(imageView);
    }

    private final PreferenceHelper getPreferenceHelper() {
        return (PreferenceHelper) this.preferenceHelper.getValue();
    }

    private final void setImageCorners(int size) {
        float dimension = getResources().getDimension(AbstractC36511b.f156052e);
        if (size == 1) {
            C22791j c22791jM66029e = getImageOne().getShapeAppearanceModel().m66029e();
            c22791jM66029e.f89753a = AbstractC32411b.m101114z(0);
            c22791jM66029e.f89757e = new C22782a(dimension);
            c22791jM66029e.f89756d = AbstractC32411b.m101114z(0);
            c22791jM66029e.m66023c(dimension);
            c22791jM66029e.f89754b = AbstractC32411b.m101114z(0);
            c22791jM66029e.f89758f = new C22782a(dimension);
            c22791jM66029e.f89755c = AbstractC32411b.m101114z(0);
            c22791jM66029e.m66024d(dimension);
            getImageOne().setShapeAppearanceModel(c22791jM66029e.m66021a());
            return;
        }
        if (size == 2) {
            C22791j c22791jM66029e2 = getImageOne().getShapeAppearanceModel().m66029e();
            c22791jM66029e2.f89753a = AbstractC32411b.m101114z(0);
            c22791jM66029e2.f89757e = new C22782a(dimension);
            c22791jM66029e2.f89756d = AbstractC32411b.m101114z(0);
            c22791jM66029e2.m66023c(dimension);
            getImageOne().setShapeAppearanceModel(c22791jM66029e2.m66021a());
            C22791j c22791jM66029e3 = getImageTwo().getShapeAppearanceModel().m66029e();
            c22791jM66029e3.f89754b = AbstractC32411b.m101114z(0);
            c22791jM66029e3.f89758f = new C22782a(dimension);
            c22791jM66029e3.f89755c = AbstractC32411b.m101114z(0);
            c22791jM66029e3.m66024d(dimension);
            getImageTwo().setShapeAppearanceModel(c22791jM66029e3.m66021a());
            return;
        }
        if (size != 3) {
            return;
        }
        C22791j c22791jM66029e4 = getImageOne().getShapeAppearanceModel().m66029e();
        c22791jM66029e4.f89753a = AbstractC32411b.m101114z(0);
        c22791jM66029e4.f89757e = new C22782a(dimension);
        c22791jM66029e4.f89756d = AbstractC32411b.m101114z(0);
        c22791jM66029e4.m66023c(dimension);
        getImageOne().setShapeAppearanceModel(c22791jM66029e4.m66021a());
        C22791j c22791jM66029e5 = getImageTwo().getShapeAppearanceModel().m66029e();
        c22791jM66029e5.f89754b = AbstractC32411b.m101114z(0);
        c22791jM66029e5.f89758f = new C22782a(dimension);
        getImageTwo().setShapeAppearanceModel(c22791jM66029e5.m66021a());
        C22791j c22791jM66029e6 = getImageThree().getShapeAppearanceModel().m66029e();
        c22791jM66029e6.f89755c = AbstractC32411b.m101114z(0);
        c22791jM66029e6.m66024d(dimension);
        getImageThree().setShapeAppearanceModel(c22791jM66029e6.m66021a());
    }

    public final ShapeableImageView getImageGiphy() {
        ShapeableImageView imageGiphy = this.binding.f47519b;
        AbstractC22676k.m65749i(imageGiphy, "imageGiphy");
        return imageGiphy;
    }

    public final ShapeableImageView getImageOne() {
        ShapeableImageView imageOne = this.binding.f47520c;
        AbstractC22676k.m65749i(imageOne, "imageOne");
        return imageOne;
    }

    public final ShapeableImageView getImageThree() {
        ShapeableImageView imageThree = this.binding.f47521d;
        AbstractC22676k.m65749i(imageThree, "imageThree");
        return imageThree;
    }

    public final ShapeableImageView getImageTwo() {
        ShapeableImageView imageTwo = this.binding.f47522e;
        AbstractC22676k.m65749i(imageTwo, "imageTwo");
        return imageTwo;
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC13511p m19290j(C22772a viewState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC13511p abstractC13511p = this.binding;
        int size = viewState.m65978a().size();
        ShapeableImageView imageOne = abstractC13511p.f47520c;
        AbstractC22676k.m65749i(imageOne, "imageOne");
        imageOne.setVisibility(size >= 1 ? 0 : 8);
        ShapeableImageView imageTwo = abstractC13511p.f47522e;
        AbstractC22676k.m65749i(imageTwo, "imageTwo");
        imageTwo.setVisibility(size >= 2 ? 0 : 8);
        ShapeableImageView imageThree = abstractC13511p.f47521d;
        AbstractC22676k.m65749i(imageThree, "imageThree");
        imageThree.setVisibility(size >= 3 ? 0 : 8);
        TextView overFlow = abstractC13511p.f47523f;
        AbstractC22676k.m65749i(overFlow, "overFlow");
        ShapeableImageView imageThree2 = abstractC13511p.f47521d;
        AbstractC22676k.m65749i(imageThree2, "imageThree");
        overFlow.setVisibility(imageThree2.getVisibility() == 0 && size >= 4 ? 0 : 8);
        abstractC13511p.f47523f.setText(getContext().getString(AbstractC38505d0.f165728x, Integer.valueOf(size - 3)));
        setImageCorners(size);
        int i13 = 0;
        for (Object obj : viewState.m65978a()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            Attachment attachment = (Attachment) obj;
            if (i13 == 0) {
                boolean zM65745e = AbstractC22676k.m65745e(attachment.getType(), "giphy");
                ShapeableImageView imageGiphy = abstractC13511p.f47519b;
                AbstractC22676k.m65749i(imageGiphy, "imageGiphy");
                imageGiphy.setVisibility(zM65745e ? 0 : 8);
                ShapeableImageView imageOne2 = abstractC13511p.f47520c;
                AbstractC22676k.m65749i(imageOne2, "imageOne");
                imageOne2.setVisibility(!zM65745e ? 0 : 8);
                ShapeableImageView shapeableImageView = zM65745e ? abstractC13511p.f47519b : abstractC13511p.f47520c;
                AbstractC22676k.m65747g(shapeableImageView);
                m19289f(AbstractC12285c.m34192a(attachment), shapeableImageView, viewState.getHeader());
                ShapeableImageView giphyLabel = abstractC13511p.f47518a;
                AbstractC22676k.m65749i(giphyLabel, "giphyLabel");
                giphyLabel.setVisibility(zM65745e ? 0 : 8);
            } else if (i13 == 1) {
                String strM34192a = AbstractC12285c.m34192a(attachment);
                ShapeableImageView imageTwo2 = abstractC13511p.f47522e;
                AbstractC22676k.m65749i(imageTwo2, "imageTwo");
                m19289f(strM34192a, imageTwo2, viewState.getHeader());
            } else if (i13 == 2) {
                String strM34192a2 = AbstractC12285c.m34192a(attachment);
                ShapeableImageView imageThree3 = abstractC13511p.f47521d;
                AbstractC22676k.m65749i(imageThree3, "imageThree");
                m19289f(strM34192a2, imageThree3, viewState.getHeader());
            }
            i13 = i14;
        }
        return abstractC13511p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.preferenceHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6338b(this, null, null));
        C40253d c40253d = new C40253d(context);
        c40253d.m129251b(5.0f);
        c40253d.f174066w.f174059n = 30.0f;
        c40253d.invalidateSelf();
        c40253d.setColorFilter(new PorterDuffColorFilter(context.getColor(AbstractC36510a.f156023c0), PorterDuff.Mode.SRC_IN));
        c40253d.start();
        this.progress = c40253d;
        AbstractC13511p abstractC13511pM38229c = AbstractC13511p.m38229c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC13511pM38229c, "inflate(...)");
        this.binding = abstractC13511pM38229c;
    }

    public /* synthetic */ ChatImageView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
