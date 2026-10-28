package ym2;

import androidx.compose.runtime.Composer;
import bp0.AbstractC3531s;
import c93.InterfaceC4351m;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import yf2.C39520a;

/* JADX INFO: renamed from: ym2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39653a {

    /* JADX INFO: renamed from: a */
    public static final C39653a f170603a = new C39653a();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f170604b = new C37816b(new C39520a(1), false, -1074155292);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m126786c(Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC3531s.m10440Q(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m m126787b() {
        return f170604b;
    }
}
