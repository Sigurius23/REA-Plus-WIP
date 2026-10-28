package pj2;

import android.os.Bundle;
import ej2.AbstractC13264a;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: pj2.f */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC29307f {

    /* JADX INFO: renamed from: pj2.f$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f118655a;

        public /* synthetic */ a(String str, int i13) {
            this(str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC13264a.f45926a;
        }

        /* JADX INFO: renamed from: b */
        public String m88967b() {
            return (String) this.f118655a.get("sessionType");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f118655a.containsKey("sessionType") != aVar.f118655a.containsKey("sessionType")) {
                return false;
            }
            if (m88967b() == null ? aVar.m88967b() == null : m88967b().equals(aVar.m88967b())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f118655a.containsKey("sessionType")) {
                bundle.putString("sessionType", (String) this.f118655a.get("sessionType"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m88967b() != null ? m88967b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionStressMonitorToSession(actionId=" + mo19186a() + "){sessionType=" + m88967b() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f118655a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"sessionType\" is marked as non-null but was passed a null value.");
            }
            map.put("sessionType", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m88966a(String str) {
        return new a(str, 0);
    }
}
