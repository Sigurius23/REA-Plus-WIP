package i63;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i63.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18171j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70497a;

    /* JADX INFO: renamed from: b */
    public final Serializable f70498b;

    /* JADX INFO: renamed from: c */
    public final Collection f70499c;

    public AbstractC18171j() {
        this.f70497a = 1;
        this.f70498b = new CopyOnWriteArraySet();
        this.f70499c = new CopyOnWriteArraySet();
    }

    /* JADX INFO: renamed from: a */
    public void m52168a(String str) {
        ((CopyOnWriteArraySet) this.f70498b).add(str);
        ((CopyOnWriteArraySet) this.f70499c).remove(str);
    }

    /* JADX INFO: renamed from: b */
    public String m52169b(String name) {
        AbstractC22676k.m65750j(name, "name");
        List list = (List) this.f70499c;
        int iM118951C = AbstractC37056f.m118951C(list);
        if (iM118951C < 0) {
            return null;
        }
        int i13 = 0;
        while (true) {
            C18170i c18170i = (C18170i) list.get(i13);
            if (AbstractC39421y.m125921F(c18170i.f70495a, name, true)) {
                return c18170i.f70496b;
            }
            if (i13 == iM118951C) {
                return null;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo52170c(boolean z4) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f70499c;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.f70498b;
        if (z4) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo52171d(boolean z4) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f70499c;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.f70498b;
        if (z4) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo52172e();

    public String toString() {
        switch (this.f70497a) {
            case 0:
                String str = (String) this.f70498b;
                List<C18170i> list = (List) this.f70499c;
                if (list.isEmpty()) {
                    return str;
                }
                int length = str.length();
                int i13 = 0;
                int length2 = 0;
                for (C18170i c18170i : list) {
                    length2 += c18170i.f70496b.length() + c18170i.f70495a.length() + 3;
                }
                StringBuilder sb4 = new StringBuilder(length + length2);
                sb4.append(str);
                int iM118951C = AbstractC37056f.m118951C(list);
                if (iM118951C >= 0) {
                    while (true) {
                        C18170i c18170i2 = (C18170i) list.get(i13);
                        sb4.append("; ");
                        sb4.append(c18170i2.f70495a);
                        sb4.append("=");
                        String str2 = c18170i2.f70496b;
                        if (AbstractC18172k.m52173a(str2)) {
                            sb4.append(AbstractC18172k.m52174b(str2));
                        } else {
                            sb4.append(str2);
                        }
                        if (i13 != iM118951C) {
                            i13++;
                        }
                    }
                }
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "{\n            val size =…   }.toString()\n        }");
                return string;
            default:
                return super.toString();
        }
    }

    public AbstractC18171j(String content, List parameters) {
        this.f70497a = 0;
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.f70498b = content;
        this.f70499c = parameters;
    }
}
