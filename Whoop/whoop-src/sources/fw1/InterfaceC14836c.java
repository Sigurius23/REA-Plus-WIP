package fw1;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: fw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lfw1/c;", "", "", "a", "()Z", "isLoading", "isError", "b", "isSuccess", "Lfw1/a;", "Lfw1/e;", "Lfw1/f;", "Lfw1/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14836c {
    /* JADX INFO: renamed from: a */
    boolean mo42629a();

    /* JADX INFO: renamed from: b */
    default boolean mo42630b() {
        return (mo42629a() || isError()) ? false : true;
    }

    boolean isError();
}
