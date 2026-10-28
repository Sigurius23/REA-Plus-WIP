package x02;

import com.google.gson.Gson;
import ge3.AbstractC15751g;
import i63.AbstractC18159b;
import i63.C18163d;
import k63.InterfaceC22231a;
import l63.C23388b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lk63/a;", "Lcom/google/gson/Gson;", "gson", "Li63/d;", "contentType", "Ll83/a0;", "a", "(Lk63/a;Lcom/google/gson/Gson;Li63/d;)V", "network_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37802a {
    /* JADX INFO: renamed from: a */
    public static final void m121307a(InterfaceC22231a interfaceC22231a, Gson gson, C18163d contentType) {
        AbstractC22676k.m65750j(interfaceC22231a, "<this>");
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC15751g.m44438R(interfaceC22231a, contentType, new C23388b(gson));
    }

    /* JADX INFO: renamed from: b */
    public static void m121308b(InterfaceC22231a interfaceC22231a, Gson gson, C18163d c18163d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            gson = new Gson();
        }
        if ((i13 & 2) != 0) {
            C18163d c18163d2 = AbstractC18159b.f70468a;
            c18163d = AbstractC18159b.f70468a;
        }
        m121307a(interfaceC22231a, gson, c18163d);
    }
}
