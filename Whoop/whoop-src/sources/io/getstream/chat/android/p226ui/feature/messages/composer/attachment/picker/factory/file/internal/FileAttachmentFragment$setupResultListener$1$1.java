package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal;

import android.net.Uri;
import android.widget.Toast;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment$setupResultListener$1$1", m100430f = "FileAttachmentFragment.kt", m100431l = {229}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class FileAttachmentFragment$setupResultListener$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ List<Uri> $uris;
    int label;
    final /* synthetic */ FileAttachmentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileAttachmentFragment$setupResultListener$1$1(List<? extends Uri> list, FileAttachmentFragment fileAttachmentFragment, InterfaceC30057d<? super FileAttachmentFragment$setupResultListener$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$uris = list;
        this.this$0 = fileAttachmentFragment;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new FileAttachmentFragment$setupResultListener$1$1(this.$uris, this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((FileAttachmentFragment$setupResultListener$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
            C19681xb812d1d5 c19681xb812d1d5 = new C19681xb812d1d5(this.this$0, this.$uris, null);
            this.label = 1;
            obj = AbstractC3006f0.m8705K(io3, c19681xb812d1d5, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        List<AttachmentMetaData> list = (List) obj;
        if (list.size() < this.$uris.size()) {
            Toast.makeText(this.this$0.getContext(), this.this$0.getString(C19469R.string.stream_ui_message_composer_file_not_supported), 0).show();
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener = this.this$0.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener != null) {
            attachmentsPickerTabListener.onSelectedAttachmentsChanged(list);
        }
        AttachmentsPickerTabListener attachmentsPickerTabListener2 = this.this$0.attachmentsPickerTabListener;
        if (attachmentsPickerTabListener2 != null) {
            attachmentsPickerTabListener2.onSelectedAttachmentsSubmitted();
        }
        return C23454a0.f92919a;
    }
}
