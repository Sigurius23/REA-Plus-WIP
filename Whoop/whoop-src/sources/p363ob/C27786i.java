package p363ob;

import java.util.List;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: ob.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C27786i {

    /* JADX INFO: renamed from: a */
    public final String f112027a;

    /* JADX INFO: renamed from: b */
    public final String f112028b;

    /* JADX INFO: renamed from: c */
    public final String f112029c;

    /* JADX INFO: renamed from: d */
    public final List f112030d;

    /* JADX INFO: renamed from: e */
    public final List f112031e;

    public C27786i(String referenceTable, String onDelete, List list, String onUpdate, List list2) {
        AbstractC22676k.m65750j(referenceTable, "referenceTable");
        AbstractC22676k.m65750j(onDelete, "onDelete");
        AbstractC22676k.m65750j(onUpdate, "onUpdate");
        this.f112027a = referenceTable;
        this.f112028b = onDelete;
        this.f112029c = onUpdate;
        this.f112030d = list;
        this.f112031e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27786i)) {
            return false;
        }
        C27786i c27786i = (C27786i) obj;
        if (AbstractC22676k.m65745e(this.f112027a, c27786i.f112027a) && AbstractC22676k.m65745e(this.f112028b, c27786i.f112028b) && AbstractC22676k.m65745e(this.f112029c, c27786i.f112029c) && AbstractC22676k.m65745e(this.f112030d, c27786i.f112030d)) {
            return AbstractC22676k.m65745e(this.f112031e, c27786i.f112031e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f112031e.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f112027a.hashCode() * 31, 31, this.f112028b), 31, this.f112029c), 31, this.f112030d);
    }

    public final String toString() {
        return AbstractC39415s.m125908r(AbstractC39415s.m125910t("\n            |ForeignKey {\n            |   referenceTable = '" + this.f112027a + "',\n            |   onDelete = '" + this.f112028b + "',\n            |   onUpdate = '" + this.f112029c + "',\n            |   columnNames = {" + AbstractC34235f.m108212T(AbstractC25265s.m74150t1(this.f112030d)) + "\n            |   referenceColumnNames = {" + AbstractC34235f.m108211S(AbstractC25265s.m74150t1(this.f112031e)) + "\n            |}\n        "), "    ");
    }
}
