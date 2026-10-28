package m70;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: m70.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lm70/a$d;", "Lm70/k;", "d", "(Lm70/a$d;)Lm70/k;", "Lm70/a$c;", "c", "(Lm70/a$c;)Lm70/k;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25191e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C25197k m73763c(InterfaceC25187a.c cVar) {
        return new C25197k(cVar.getCardNumber(), cVar.getCardExpirationMonth(), cVar.getCardExpirationYear(), cVar.getCardCvv(), cVar.getCardZip(), cVar.getUserCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C25197k m73764d(InterfaceC25187a.d dVar) {
        return new C25197k(dVar.getCardNumber(), dVar.getCardExpirationMonth(), dVar.getCardExpirationYear(), dVar.getCardCvv(), dVar.getCardZip(), dVar.getUserCountryCode());
    }
}
