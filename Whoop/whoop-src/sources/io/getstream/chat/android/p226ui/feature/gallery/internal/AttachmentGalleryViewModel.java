package io.getstream.chat.android.p226ui.feature.gallery.internal;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;", "Landroidx/lifecycle/w1;", "<init>", "()V", "Ll83/a0;", "onCleared", "Landroidx/lifecycle/u0;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "_attachmentGalleryItemsLiveData", "Landroidx/lifecycle/u0;", "Landroidx/lifecycle/p0;", "attachmentGalleryItemsLiveData", "Landroidx/lifecycle/p0;", "getAttachmentGalleryItemsLiveData", "()Landroidx/lifecycle/p0;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryViewModel extends AbstractC1637w1 {
    private final C1630u0 _attachmentGalleryItemsLiveData;
    private final AbstractC1615p0 attachmentGalleryItemsLiveData;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.internal.AttachmentGalleryViewModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.gallery.internal.AttachmentGalleryViewModel$1", m100430f = "AttachmentGalleryViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196611 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.internal.AttachmentGalleryViewModel$1$1, reason: invalid class name */
        @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* synthetic */ class AnonymousClass1 implements InterfaceC13062m, InterfaceC22666f {
            final /* synthetic */ C1630u0 $tmp0;

            public AnonymousClass1(C1630u0 c1630u0) {
                this.$tmp0 = c1630u0;
            }

            @Override // ec3.InterfaceC13062m
            public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                emit((List<AttachmentGalleryItem>) obj, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                return C23454a0.f92919a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p715kotlin.jvm.internal.InterfaceC22666f
            public final InterfaceC23459e getFunctionDelegate() {
                return new C22656a(2, 4, C1630u0.class, this.$tmp0, "setValue", "setValue(Ljava/lang/Object;)V");
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(List<AttachmentGalleryItem> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C196611.access$invokeSuspend$setValue(this.$tmp0, list, interfaceC30057d);
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                return C23454a0.f92919a;
            }
        }

        public C196611(InterfaceC30057d<? super C196611> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        public static final /* synthetic */ Object access$invokeSuspend$setValue(C1630u0 c1630u0, List list, InterfaceC30057d interfaceC30057d) {
            invokeSuspend$setValue(c1630u0, list, interfaceC30057d);
            return C23454a0.f92919a;
        }

        private static final /* synthetic */ Object invokeSuspend$setValue(C1630u0 c1630u0, List list, InterfaceC30057d interfaceC30057d) {
            c1630u0.setValue(list);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AttachmentGalleryViewModel.this.new C196611(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196611) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l attachmentGalleryItems = AttachmentGalleryRepository.INSTANCE.getAttachmentGalleryItems();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AttachmentGalleryViewModel.this._attachmentGalleryItemsLiveData);
                this.label = 1;
                if (((C13084s1) attachmentGalleryItems).collect(anonymousClass1, this) == enumC31071a) {
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

    public AttachmentGalleryViewModel() {
        C1630u0 c1630u0 = new C1630u0();
        this._attachmentGalleryItemsLiveData = c1630u0;
        this.attachmentGalleryItemsLiveData = c1630u0;
        AttachmentGalleryRepository.INSTANCE.registerAttachmentGalleryItemsObserver();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C196611(null), 3);
    }

    public final AbstractC1615p0 getAttachmentGalleryItemsLiveData() {
        return this.attachmentGalleryItemsLiveData;
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        AttachmentGalleryRepository.INSTANCE.unregisterAttachmentGalleryItemsObserver();
        super.onCleared();
    }
}
