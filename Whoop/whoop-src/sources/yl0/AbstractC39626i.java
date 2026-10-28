package yl0;

import java.util.Set;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: yl0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lu02/a$b;", "Lyl0/e;", "b", "(Lu02/a$b;)Lyl0/e;", "", "", "a", "Ljava/util/Set;", "RETRYABLE_HTTP_CODES", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39626i {

    /* JADX INFO: renamed from: a */
    private static final Set<Integer> f170464a = AbstractC25260n.m74059b1(new Integer[]{408, 429});

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final EnumC39622e m126648b(InterfaceC34385a.b<?> bVar) {
        if (bVar instanceof InterfaceC34385a.b.C42432b) {
            return EnumC39622e.RETRYABLE_ERROR;
        }
        if (bVar instanceof InterfaceC34385a.b.a.C42431a) {
            return EnumC39622e.TERMINAL_ERROR;
        }
        if (!(bVar instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.b.a aVar = (InterfaceC34385a.b.a) bVar;
        return (aVar.getErrorCode() >= 500 || f170464a.contains(Integer.valueOf(aVar.getErrorCode()))) ? EnumC39622e.RETRYABLE_ERROR : EnumC39622e.TERMINAL_ERROR;
    }
}
