package dg2;

import bg2.C3231d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf2.AbstractC35950b;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: dg2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ldg2/c;", "", "<init>", "()V", "Lbg2/d;", "domainState", "Lcom/whoop/design/util/TextResource;", "a", "(Lbg2/d;)Lcom/whoop/design/util/TextResource;", "", "phoneNumber", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Ldg2/b;", "c", "(Lbg2/d;)Ldg2/b;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12011c {
    /* JADX INFO: renamed from: a */
    private final TextResource m33143a(C3231d domainState) {
        if (domainState.getCodeErrorMessage().length() > 0) {
            return new TextResource.C8691e(domainState.getCodeErrorMessage());
        }
        return domainState.getCodeSubmitError() ? AbstractC8693b.m21277k(AbstractC35950b.f153092l) : AbstractC8693b.m21267a();
    }

    /* JADX INFO: renamed from: b */
    private final String m33144b(String phoneNumber) {
        if (phoneNumber.length() <= 6) {
            return phoneNumber;
        }
        return AbstractC2875y.m8299l(AbstractC11266d.m30461o("+", AbstractC39421y.m125925J(phoneNumber.length() - 6, "*")), AbstractC39414r.m125867M0(5, phoneNumber));
    }

    /* JADX INFO: renamed from: c */
    public final C12010b m33145c(C3231d domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new C12010b(domainState.getPhoneNumber(), m33144b(domainState.getPhoneNumber()), domainState.getIsPhoneSubmitting(), domainState.getPhoneSubmitSuccess(), domainState.getPhoneSubmitError(), domainState.getIsCodeSubmitting(), domainState.getCodeVerified(), m33143a(domainState), domainState.getCoachPhoneNumber(), domainState.getIsStartingTextingWhoop(), domainState.getIsTextingWhoopError(), domainState.getDestinationPhoneNumber(), domainState.getIsPhoneNumberError(), domainState.getIsFetchingDestinationPhoneNumber());
    }
}
