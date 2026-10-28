package io.getstream.chat.android.p226ui.feature.gallery.internal;

import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0003R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;", "", "<init>", "()V", "Lec3/l;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "getAttachmentGalleryItems", "()Lec3/l;", "attachmentGalleryItems", "Ll83/a0;", "setAttachmentGalleryItems", "(Ljava/util/List;)V", "registerAttachmentGalleryItemsObserver", "unregisterAttachmentGalleryItemsObserver", "Ljava/util/List;", "", "attachmentGalleryItemsObserverCount", "I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryRepository {
    public static final AttachmentGalleryRepository INSTANCE = new AttachmentGalleryRepository();
    private static List<AttachmentGalleryItem> attachmentGalleryItems = C25271y.f99162w;
    private static int attachmentGalleryItemsObserverCount;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.internal.AttachmentGalleryRepository$getAttachmentGalleryItems$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.gallery.internal.AttachmentGalleryRepository$getAttachmentGalleryItems$1", m100430f = "AttachmentGalleryRepository.kt", m100431l = {28}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196591 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C196591(InterfaceC30057d<? super C196591> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C196591 c196591 = new C196591(2, interfaceC30057d);
            c196591.L$0 = obj;
            return c196591;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196591) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List list = AttachmentGalleryRepository.attachmentGalleryItems;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(list, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    private AttachmentGalleryRepository() {
    }

    public final InterfaceC13058l getAttachmentGalleryItems() {
        return new C13084s1(new C196591(2, null));
    }

    public final void registerAttachmentGalleryItemsObserver() {
        attachmentGalleryItemsObserverCount++;
    }

    public final void setAttachmentGalleryItems(List<AttachmentGalleryItem> attachmentGalleryItems2) {
        AbstractC22676k.m65750j(attachmentGalleryItems2, "attachmentGalleryItems");
        attachmentGalleryItems = attachmentGalleryItems2;
    }

    public final void unregisterAttachmentGalleryItemsObserver() {
        int i13 = attachmentGalleryItemsObserverCount - 1;
        attachmentGalleryItemsObserverCount = i13;
        if (i13 == 0) {
            attachmentGalleryItems = C25271y.f99162w;
        }
    }
}
