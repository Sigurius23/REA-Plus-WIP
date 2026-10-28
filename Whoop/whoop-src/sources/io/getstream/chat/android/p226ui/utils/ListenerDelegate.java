package io.getstream.chat.android.p226ui.utils;

import f93.InterfaceC14292d;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import j93.InterfaceC21493z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/ListenerDelegate;", "", "L", "Lf93/d;", "initialValue", "Lkotlin/Function1;", "Lkotlin/Function0;", "wrap", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", "realListener", "Ljava/lang/Object;", "wrapper", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ListenerDelegate<L> implements InterfaceC14292d {
    private L realListener;
    private final L wrapper;

    public ListenerDelegate(L initialValue, Function1 wrap) {
        AbstractC22676k.m65750j(initialValue, "initialValue");
        AbstractC22676k.m65750j(wrap, "wrap");
        this.realListener = initialValue;
        this.wrapper = (L) wrap.invoke(new C19683b(this, 10));
    }

    /* JADX INFO: renamed from: a */
    public static Object m55663a(ListenerDelegate listenerDelegate) {
        return listenerDelegate.realListener;
    }

    @Override // f93.InterfaceC14291c
    public final L getValue(Object thisRef, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        return this.wrapper;
    }

    @Override // f93.InterfaceC14292d
    public final void setValue(Object thisRef, InterfaceC21493z property, L value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        this.realListener = value;
    }
}
