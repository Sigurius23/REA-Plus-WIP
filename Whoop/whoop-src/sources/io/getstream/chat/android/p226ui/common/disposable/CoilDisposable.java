package io.getstream.chat.android.p226ui.common.disposable;

import fi.InterfaceC14497c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/disposable/CoilDisposable;", "Lio/getstream/chat/android/ui/common/disposable/Disposable;", "Lfi/c;", "disposable", "<init>", "(Lfi/c;)V", "Ll83/a0;", "dispose", "()V", "Lfi/c;", "", "isDisposed", "()Z", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CoilDisposable implements Disposable {
    public static final int $stable = 8;
    private final InterfaceC14497c disposable;

    public CoilDisposable(InterfaceC14497c disposable) {
        AbstractC22676k.m65750j(disposable, "disposable");
        this.disposable = disposable;
    }

    @Override // io.getstream.chat.android.p226ui.common.disposable.Disposable
    public final void dispose() {
        this.disposable.dispose();
    }

    @Override // io.getstream.chat.android.p226ui.common.disposable.Disposable
    public final boolean isDisposed() {
        return this.disposable.isDisposed();
    }
}
