package coil.request;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcoil/request/NullRequestDataException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "coil-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NullRequestDataException extends RuntimeException {
    public NullRequestDataException() {
        super("The request's data is null.");
    }
}
