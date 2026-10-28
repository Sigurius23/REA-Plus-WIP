package androidx.health.platform.client.impl.ipc;

import java.util.concurrent.ExecutionException;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public class ApiVersionException extends ExecutionException {
    public ApiVersionException(int i13, int i14) {
        super(AbstractC2875y.m8294g(i13, i14, "Version requirements for calling the method was not met, remoteVersion: ", ", minVersion: "));
    }
}
