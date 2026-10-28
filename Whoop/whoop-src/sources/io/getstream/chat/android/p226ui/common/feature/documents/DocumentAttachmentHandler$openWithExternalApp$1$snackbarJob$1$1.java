package io.getstream.chat.android.p226ui.common.feature.documents;

import android.content.Context;
import android.view.View;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import l83.C23454a0;
import mr.C25908n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.documents.DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1", m100430f = "DocumentAttachmentHandler.kt", m100431l = {74}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Attachment $attachment;
    final /* synthetic */ Context $context;
    final /* synthetic */ View $it;
    final /* synthetic */ C22669g0 $snackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1(C22669g0 c22669g0, View view, Context context, Attachment attachment, InterfaceC30057d<? super DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$snackbar = c22669g0;
        this.$it = view;
        this.$context = context;
        this.$attachment = attachment;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1(this.$snackbar, this.$it, this.$context, this.$attachment, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.label = 1;
            if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        C22669g0 c22669g0 = this.$snackbar;
        C25908n c25908nM76617h = C25908n.m76617h(this.$it, this.$context.getString(C19470R.string.stream_ui_message_list_attachment_downloading, MediaStringUtil.convertFileSizeByteCount(0L), MediaStringUtil.convertFileSizeByteCount(this.$attachment.getFileSize())), -2);
        c25908nM76617h.m76619j();
        c22669g0.f89336w = c25908nM76617h;
        return C23454a0.f92919a;
    }
}
