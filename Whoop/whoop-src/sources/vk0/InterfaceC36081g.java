package vk0;

import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import st0.EnumC32978v;

/* JADX INFO: renamed from: vk0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lvk0/g;", "Lvk0/a;", "Lst0/v;", "whoopDeviceType", "Llt0/a;", "s", "(Lst0/v;)Llt0/a;", "", "p", "()Z", "dualResponse", "Lkotlin/time/Duration;", "I", "()J", "timeout", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36081g extends InterfaceC36075a {
    /* JADX INFO: renamed from: B */
    static /* synthetic */ InterfaceC24724a m114591B(InterfaceC36081g interfaceC36081g, EnumC32978v enumC32978v, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commandNumber");
        }
        if ((i13 & 1) != 0) {
            enumC32978v = EnumC32978v.GEN_4;
        }
        return interfaceC36081g.mo114594s(enumC32978v);
    }

    /* JADX INFO: renamed from: I */
    default long mo114592I() {
        return AbstractC36080f.f154108a;
    }

    /* JADX INFO: renamed from: p */
    boolean getDualResponse();

    /* JADX INFO: renamed from: s */
    InterfaceC24724a mo114594s(EnumC32978v whoopDeviceType);
}
