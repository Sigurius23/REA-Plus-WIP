package io.getstream.chat.android.p226ui.feature.gallery.internal;

import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.viewpager2.adapter.AbstractC1861i;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Attachment;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;", "Landroidx/viewpager2/adapter/i;", "Landroidx/fragment/app/r0;", "fragmentActivity", "", "Lio/getstream/chat/android/models/Attachment;", "mediaList", "Lkotlin/Function0;", "Ll83/a0;", "mediaClickListener", "<init>", "(Landroidx/fragment/app/r0;Ljava/util/List;Lc93/a;)V", "", "getItemCount", "()I", "position", "Landroidx/fragment/app/m0;", "createFragment", "(I)Landroidx/fragment/app/m0;", "getItem", "(I)Lio/getstream/chat/android/models/Attachment;", "Ljava/util/List;", "Lc93/a;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryPagerAdapter extends AbstractC1861i {
    private final InterfaceC4339a mediaClickListener;
    private final List<Attachment> mediaList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentGalleryPagerAdapter(AbstractActivityC1340r0 fragmentActivity, List<Attachment> mediaList, InterfaceC4339a mediaClickListener) {
        super(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
        AbstractC22676k.m65750j(fragmentActivity, "fragmentActivity");
        AbstractC22676k.m65750j(mediaList, "mediaList");
        AbstractC22676k.m65750j(mediaClickListener, "mediaClickListener");
        this.mediaList = mediaList;
        this.mediaClickListener = mediaClickListener;
    }

    @Override // androidx.viewpager2.adapter.AbstractC1861i
    public final AbstractComponentCallbacksC1320m0 createFragment(int position) throws Throwable {
        Attachment item = getItem(position);
        String type = item.getType();
        if (AbstractC22676k.m65745e(type, "image")) {
            return AttachmentGalleryImagePageFragment.INSTANCE.create(item.getImageUrl(), this.mediaClickListener);
        }
        if (AbstractC22676k.m65745e(type, "video")) {
            return AttachmentGalleryVideoPageFragment.INSTANCE.create(item.getThumbUrl(), item.getAssetUrl(), this.mediaClickListener);
        }
        throw new Throwable("Unsupported attachment type");
    }

    public final Attachment getItem(int position) {
        return this.mediaList.get(position);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.mediaList.size();
    }
}
