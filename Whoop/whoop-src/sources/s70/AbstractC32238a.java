package s70;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import f70.InterfaceC14176e;
import n70.AbstractC26417d;
import n70.C26418e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: s70.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lu02/a$b;", "", "", "a", "(Lu02/a$b;)Z", "Lf70/e$b;", "b", "()Lf70/e$b;", "c", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32238a {
    /* JADX INFO: renamed from: a */
    public static final boolean m100306a(InterfaceC34385a.b<? extends Object> bVar) {
        AbstractC22676k.m65750j(bVar, "<this>");
        InterfaceC34385a.b.a aVar = bVar instanceof InterfaceC34385a.b.a ? (InterfaceC34385a.b.a) bVar : null;
        return aVar != null && aVar.getErrorCode() == 400;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC14176e.b m100307b() {
        return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.MEMBERSHIP_SERVICES, null, 2, null), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC14176e.b m100308c() {
        ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.ACCOUNT_CREATION;
        return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, activationFlowDestination, new AbstractC26417d.a(activationFlowDestination, null, 2, null), 6, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
    }
}
