package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal;

import android.net.Uri;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.p226ui.common.helper.internal.AttachmentStorageHelper;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment$setupResultListener$1$1$filteredAttachments$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment$setupResultListener$1$1$filteredAttachments$1", m100430f = "FileAttachmentFragment.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class C19681xb812d1d5 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ List<Uri> $uris;
    int label;
    final /* synthetic */ FileAttachmentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19681xb812d1d5(FileAttachmentFragment fileAttachmentFragment, List<? extends Uri> list, InterfaceC30057d<? super C19681xb812d1d5> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = fileAttachmentFragment;
        this.$uris = list;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C19681xb812d1d5(this.this$0, this.$uris, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<AttachmentMetaData>> interfaceC30057d) {
        return ((C19681xb812d1d5) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        AttachmentStorageHelper attachmentStorageHelper = this.this$0.attachmentStorageHelper;
        if (attachmentStorageHelper != null) {
            return attachmentStorageHelper.resolveMetadata(this.$uris);
        }
        AbstractC22676k.m65757q("attachmentStorageHelper");
        throw null;
    }
}
