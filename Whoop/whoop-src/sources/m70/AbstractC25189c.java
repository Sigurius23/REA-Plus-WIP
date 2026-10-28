package m70;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m70.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lm70/g;", "", "a", "(Lm70/g;)Ljava/lang/String;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25189c {
    /* JADX INFO: renamed from: a */
    public static final String m73738a(InterfaceC25193g interfaceC25193g) {
        AbstractC22676k.m65750j(interfaceC25193g, "<this>");
        if (interfaceC25193g.equals(InterfaceC25193g.a.f98944a)) {
            return "api_connection_exception";
        }
        if (interfaceC25193g.equals(InterfaceC25193g.b.f98945a)) {
            return "api_exception";
        }
        if (interfaceC25193g.equals(InterfaceC25193g.c.f98946a)) {
            return "card_exception";
        }
        if (interfaceC25193g.equals(InterfaceC25193g.d.f98947a)) {
            return "invalid_request_exception";
        }
        if (!(interfaceC25193g instanceof InterfaceC25195i)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC25195i interfaceC25195i = (InterfaceC25195i) interfaceC25193g;
        if (interfaceC25195i.equals(InterfaceC25195i.a.f98949a)) {
            return "authentication_exception";
        }
        if (interfaceC25195i.equals(InterfaceC25195i.b.f98950a)) {
            return "unknown_exception";
        }
        throw new NoWhenBranchMatchedException();
    }
}
