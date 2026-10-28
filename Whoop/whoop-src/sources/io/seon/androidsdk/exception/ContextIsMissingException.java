package io.seon.androidsdk.exception;

/* JADX INFO: loaded from: classes3.dex */
public class ContextIsMissingException extends SeonException {
    public ContextIsMissingException() {
        super("Context cannot be null, please check that you have properly configured the context property on your Seon object instance!");
    }
}
