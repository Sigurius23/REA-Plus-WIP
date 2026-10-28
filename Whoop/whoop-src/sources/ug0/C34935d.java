package ug0;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg0.AbstractC35980c;
import zg0.AbstractC40624g;

/* JADX INFO: renamed from: ug0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lug0/d;", "", "<init>", "()V", "Lzg0/g;", NotificationCompat.CATEGORY_EVENT, "Lvg0/c;", "a", "(Lzg0/g;)Lvg0/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34935d {
    /* JADX INFO: renamed from: a */
    public final AbstractC35980c m110259a(AbstractC40624g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC40624g.g) {
            return AbstractC35980c.b.f153289a;
        }
        if (event instanceof AbstractC40624g.e) {
            return new AbstractC35980c.a(((AbstractC40624g.e) event).getFingerprint());
        }
        return null;
    }
}
