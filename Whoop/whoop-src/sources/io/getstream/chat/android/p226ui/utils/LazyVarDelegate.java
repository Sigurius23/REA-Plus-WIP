package io.getstream.chat.android.p226ui.utils;

import c93.InterfaceC4339a;
import f93.InterfaceC14292d;
import j93.InterfaceC21493z;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/LazyVarDelegate;", "", "T", "Lf93/d;", "Lkotlin/Function0;", "initializer", "<init>", "(Lc93/a;)V", "thisRef", "Lj93/z;", "property", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "defaultValue$delegate", "Ll83/h;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "overrideValue", "Ljava/lang/Object;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LazyVarDelegate<T> implements InterfaceC14292d {

    /* JADX INFO: renamed from: defaultValue$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultValue;
    private T overrideValue;

    public LazyVarDelegate(InterfaceC4339a initializer) {
        AbstractC22676k.m65750j(initializer, "initializer");
        this.defaultValue = AbstractC30060g.m92088H(initializer);
    }

    private final T getDefaultValue() {
        return (T) this.defaultValue.getValue();
    }

    @Override // f93.InterfaceC14291c
    public final T getValue(Object thisRef, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        T t14 = this.overrideValue;
        return t14 == null ? (T) this.defaultValue.getValue() : t14;
    }

    @Override // f93.InterfaceC14292d
    public final void setValue(Object thisRef, InterfaceC21493z property, T value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        this.overrideValue = value;
    }
}
