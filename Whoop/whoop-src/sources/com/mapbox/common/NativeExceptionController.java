package com.mapbox.common;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/common/NativeExceptionController;", "", "<init>", "()V", "", "value", "Ll83/a0;", "setRethrowNativeExceptions", "(Z)V", "getRethrowNativeExceptions", "()Z", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class NativeExceptionController {
    public static final NativeExceptionController INSTANCE = new NativeExceptionController();

    private NativeExceptionController() {
    }

    public static final native boolean getRethrowNativeExceptions();

    public static final native void setRethrowNativeExceptions(boolean value);
}
