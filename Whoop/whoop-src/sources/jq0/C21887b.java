package jq0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.google.android.material.imageview.ShapeableImageView;
import eq0.AbstractC13470g3;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import iq0.C20839r;
import jo.ViewOnClickListenerC21821j;
import kr.C22782a;
import kr.C22786e;
import kr.C22790i;
import kr.C22792k;
import p429ql.AbstractC30465k;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36512c;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: jq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0012\u001a\u001e\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00110\u00110\u000e\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0019¨\u0006#"}, m65681d2 = {"Ljq0/b;", "Ljq0/c$a;", "Liq0/r;", "Leq0/g3;", "binding", "Lkotlin/Function1;", "Ll83/a0;", "onAttachmentCancelled", "", "attachmentMaxFileSize", "<init>", "(Leq0/g3;Lkotlin/jvm/functions/Function1;J)V", "T", "attachment", "Lql/k;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "e", "(Ljava/lang/Object;)Lql/k;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "d", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "item", "c", "(Liq0/r;)V", "b", "Leq0/g3;", "Lkotlin/jvm/functions/Function1;", "J", "Liq0/r;", "f", "()Liq0/r;", "g", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21887b extends AbstractC21888c.a<C20839r> {

    /* JADX INFO: renamed from: g */
    public static final int f84570g = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC13470g3 binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 onAttachmentCancelled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long attachmentMaxFileSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public C20839r item;

    /* JADX WARN: Illegal instructions before constructor call */
    public C21887b(AbstractC13470g3 binding, Function1 onAttachmentCancelled, long j7) {
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(onAttachmentCancelled, "onAttachmentCancelled");
        View root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        this.onAttachmentCancelled = onAttachmentCancelled;
        this.attachmentMaxFileSize = j7;
        binding.f47319b.setOnClickListener(new ViewOnClickListenerC21821j(this, 4));
        float dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(C19469R.dimen.stream_ui_spacing_tiny);
        ShapeableImageView shapeableImageView = binding.f47320c;
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        C22782a c22782a = new C22782a(dimensionPixelSize);
        C22782a c22782a2 = new C22782a(dimensionPixelSize);
        C22782a c22782a3 = new C22782a(dimensionPixelSize);
        C22782a c22782a4 = new C22782a(dimensionPixelSize);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        shapeableImageView.setShapeAppearanceModel(c22792k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m62109b(C21887b c21887b, View view) {
        c21887b.onAttachmentCancelled.invoke(c21887b.m62113f());
    }

    /* JADX INFO: renamed from: d */
    private final void m62110d(AttachmentMetaData attachment) {
        if (attachment.getSize() <= this.attachmentMaxFileSize) {
            TextView attachmentErrorMessage = this.binding.f47318a;
            AbstractC22676k.m65749i(attachmentErrorMessage, "attachmentErrorMessage");
            attachmentErrorMessage.setVisibility(8);
        } else {
            TextView attachmentErrorMessage2 = this.binding.f47318a;
            AbstractC22676k.m65749i(attachmentErrorMessage2, "attachmentErrorMessage");
            attachmentErrorMessage2.setVisibility(0);
            this.binding.f47318a.setText(this.itemView.getContext().getString(AbstractC38505d0.f165599M));
        }
    }

    /* JADX INFO: renamed from: e */
    private final <T> AbstractC30465k m62111e(T attachment) {
        C4964f c4964fM15545i = ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15545i(Drawable.class);
        c4964fM15545i.f20321Y = attachment;
        c4964fM15545i.f20323a0 = true;
        return ((C4964f) ((C4964f) c4964fM15545i.m89314d(C40786k.f175894e)).m89319j(AbstractC36512c.f156071n)).m15537y(this.binding.f47320c);
    }

    @Override // jq0.AbstractC21888c.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void bind(C20839r item) {
        AbstractC22676k.m65750j(item, "item");
        m62114g(item);
        AttachmentMetaData streamMetaData = item.getStreamMetaData();
        if (streamMetaData != null) {
            if (!AbstractC22676k.m65745e(streamMetaData.getType(), "video")) {
                m62111e(streamMetaData.getUri());
            }
            m62110d(streamMetaData);
        }
        Bitmap dataWidget = item.getDataWidget();
        if (dataWidget != null) {
            m62111e(dataWidget);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C20839r m62113f() {
        C20839r c20839r = this.item;
        if (c20839r != null) {
            return c20839r;
        }
        AbstractC22676k.m65757q("item");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final void m62114g(C20839r c20839r) {
        AbstractC22676k.m65750j(c20839r, "<set-?>");
        this.item = c20839r;
    }
}
