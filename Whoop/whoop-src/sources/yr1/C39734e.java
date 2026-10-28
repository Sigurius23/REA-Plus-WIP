package yr1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr1.AbstractC34099c;
import tr2.InterfaceC34116n;
import w71.AbstractC36877d;

/* JADX INFO: renamed from: yr1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lyr1/e;", "", "<init>", "()V", "Lw71/d;", "type", "Ltr1/c;", "c", "(Lw71/d;)Ltr1/c;", "d", "a", "Lw71/d$f;", "b", "(Lw71/d$f;)Ltr1/c;", "questionType", "e", "Ltr2/n;", "Ltr2/n;", "logger", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39734e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("JournalQuestionTypeMapper");

    /* JADX INFO: renamed from: a */
    private final AbstractC34099c m127142a(AbstractC36877d type) {
        if (type instanceof AbstractC36877d.j) {
            AbstractC36877d.j jVar = (AbstractC36877d.j) type;
            int questionId = jVar.getQuestionId();
            Boolean bool = jVar.getBoolean();
            return new AbstractC34099c.d(questionId, bool != null ? bool.booleanValue() : false);
        }
        if (!(type instanceof AbstractC36877d.k)) {
            return null;
        }
        AbstractC36877d.k kVar = (AbstractC36877d.k) type;
        Boolean bool2 = kVar.getBoolean();
        if (bool2 != null) {
            return new AbstractC34099c.d(kVar.getQuestionId(), bool2.booleanValue());
        }
        return new AbstractC34099c.a(kVar.getQuestionId());
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC34099c m127143b(AbstractC36877d.f type) {
        String text = type.getText();
        if (text == null) {
            text = "";
        }
        return new AbstractC34099c.f(text);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC34099c m127144c(AbstractC36877d type) {
        if (type instanceof AbstractC36877d.a) {
            AbstractC36877d.a aVar = (AbstractC36877d.a) type;
            int questionId = aVar.getQuestionId();
            Integer number = aVar.getNumber();
            return new AbstractC34099c.e(questionId, Double.valueOf(number != null ? number.intValue() : 0.0d));
        }
        if (type instanceof AbstractC36877d.c) {
            AbstractC36877d.c cVar = (AbstractC36877d.c) type;
            int questionId2 = cVar.getQuestionId();
            Integer number2 = cVar.getNumber();
            return new AbstractC34099c.e(questionId2, Double.valueOf(number2 != null ? number2.intValue() : 0.0d));
        }
        if (type instanceof AbstractC36877d.b) {
            AbstractC36877d.b bVar = (AbstractC36877d.b) type;
            int questionId3 = bVar.getQuestionId();
            Double number3 = bVar.getNumber();
            return new AbstractC34099c.b(questionId3, number3 != null ? number3.doubleValue() : 0.0d);
        }
        if (!(type instanceof AbstractC36877d.g)) {
            return null;
        }
        AbstractC36877d.g gVar = (AbstractC36877d.g) type;
        return new AbstractC34099c.e(gVar.getQuestionId(), gVar.getNumber());
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC34099c m127145d(AbstractC36877d type) {
        if (type instanceof AbstractC36877d.d) {
            AbstractC36877d.d dVar = (AbstractC36877d.d) type;
            int questionId = dVar.getQuestionId();
            String time = dVar.getTime();
            return new AbstractC34099c.c(questionId, time != null ? time : "");
        }
        if (type instanceof AbstractC36877d.i) {
            AbstractC36877d.i iVar = (AbstractC36877d.i) type;
            int questionId2 = iVar.getQuestionId();
            Long time2 = iVar.getTime();
            return new AbstractC34099c.h(questionId2, time2 != null ? time2.longValue() : 0L);
        }
        if (!(type instanceof AbstractC36877d.h)) {
            return null;
        }
        AbstractC36877d.h hVar = (AbstractC36877d.h) type;
        int questionId3 = hVar.getQuestionId();
        String time3 = hVar.getTime();
        return new AbstractC34099c.g(questionId3, time3 != null ? time3 : "");
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC34099c m127146e(AbstractC36877d questionType) {
        AbstractC34099c abstractC34099cM127144c;
        AbstractC22676k.m65750j(questionType, "questionType");
        if ((questionType instanceof AbstractC36877d.a) || (questionType instanceof AbstractC36877d.c) || (questionType instanceof AbstractC36877d.b) || (questionType instanceof AbstractC36877d.g)) {
            abstractC34099cM127144c = m127144c(questionType);
        } else if ((questionType instanceof AbstractC36877d.d) || (questionType instanceof AbstractC36877d.i) || (questionType instanceof AbstractC36877d.h)) {
            abstractC34099cM127144c = m127145d(questionType);
        } else if ((questionType instanceof AbstractC36877d.j) || (questionType instanceof AbstractC36877d.k)) {
            abstractC34099cM127144c = m127142a(questionType);
        } else {
            abstractC34099cM127144c = questionType instanceof AbstractC36877d.f ? m127143b((AbstractC36877d.f) questionType) : null;
        }
        if (abstractC34099cM127144c != null) {
            return abstractC34099cM127144c;
        }
        this.logger.mo85222m("Unexpected question type: " + questionType, new AbstractC30556a.a[0]);
        return null;
    }
}
