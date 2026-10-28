package io.seon.androidsdk.exception;

/* JADX INFO: loaded from: classes3.dex */
public class InternetAccessException extends SeonException {
    public InternetAccessException() {
        super("Internet permission denied. Please make sure you have added INTERNET permission in manifest");
    }
}
