package tr2;

import com.whoop.domain.model.event.LoggableEvent;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lh3.AbstractC24088k;
import lh3.C24081d;
import lh3.C24085h;
import lh3.C24086i;
import lh3.C24087j;
import mm2.C25700c;
import or2.C28162g;
import qr2.AbstractC30556a;
import xg3.AbstractC38284k;
import xg3.C38280g;

/* JADX INFO: renamed from: tr2.d */
/* JADX INFO: loaded from: classes4.dex */
public class C34106d {

    /* JADX INFO: renamed from: c */
    public static final DateTimeFormatter f143006c = DateTimeFormatter.ofPattern("H:mm:ss:SSS");

    /* JADX INFO: renamed from: a */
    private final AbstractC24088k f143007a = new C24087j(new C24086i(new C24081d(new C24085h(1000))));

    /* JADX INFO: renamed from: b */
    private final AbstractC38284k f143008b;

    public C34106d(C34107e c34107e, final C34112j c34112j, AbstractC38284k abstractC38284k, C28162g c28162g) {
        this.f143008b = abstractC38284k;
        if (c28162g.getBuildFlavor().equals("qaDev")) {
            c34107e.m107806y(new InterfaceC34113k() { // from class: tr2.c
                @Override // tr2.InterfaceC34113k
                /* JADX INFO: renamed from: a */
                public final void mo107800a(LoggableEvent loggableEvent) {
                    this.f143004w.m107802b(c34112j, loggableEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m107802b(C34112j c34112j, LoggableEvent loggableEvent) {
        if (loggableEvent.tags.contains(AbstractC30556a.a.CHATTY)) {
            return;
        }
        this.f143007a.onNext(new C25700c(c34112j.m107841a(loggableEvent), loggableEvent.level));
    }

    /* JADX INFO: renamed from: c */
    public C38280g<List<C25700c>> m107803c() {
        return this.f143007a.m122674c(300L, TimeUnit.MILLISECONDS, this.f143008b);
    }
}
