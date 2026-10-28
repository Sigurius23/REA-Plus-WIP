package av2;

import com.whoop.design.util.AbstractC8693b;
import cu2.AbstractC11128h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import zu2.C41156c;
import zu2.EnumC41159f;
import zu2.InterfaceC41154a;

/* JADX INFO: renamed from: av2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lav2/f;", "", "<init>", "()V", "Lzu2/a;", "Lav2/e;", "b", "(Lzu2/a;)Lav2/e;", "Lzu2/c;", "domainState", "a", "(Lzu2/c;)Lav2/e;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2099f {

    /* JADX INFO: renamed from: av2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8334a;

        static {
            int[] iArr = new int[EnumC41159f.values().length];
            try {
                iArr[EnumC41159f.TooLong.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8334a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC2098e m6631b(InterfaceC41154a interfaceC41154a) {
        if (AbstractC22676k.m65745e(interfaceC41154a, InterfaceC41154a.a.f177532a)) {
            return new C2096c(true);
        }
        if (AbstractC22676k.m65745e(interfaceC41154a, InterfaceC41154a.b.f177533a)) {
            return new InterfaceC2098e.a(AbstractC8693b.m21277k(AbstractC11128h.f35473h1));
        }
        if (AbstractC22676k.m65745e(interfaceC41154a, InterfaceC41154a.c.f177534a)) {
            return new InterfaceC2098e.a(AbstractC8693b.m21277k(AbstractC11128h.f35506s1));
        }
        if (AbstractC22676k.m65745e(interfaceC41154a, InterfaceC41154a.d.f177535a)) {
            return C2097d.f8324a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2098e m6632a(C41156c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getCurrentFocusState() != null) {
            return m6631b(domainState.getCurrentFocusState());
        }
        return new InterfaceC2098e.b(AbstractC8693b.m21278l(domainState.getName()), domainState.getNameValidity() == EnumC41159f.TooLong, a.f8334a[domainState.getNameValidity().ordinal()] == 1 ? AbstractC8693b.m21277k(AbstractC11128h.f35451a2) : AbstractC8693b.m21267a(), domainState.getNameValidity() == EnumC41159f.Valid);
    }
}
