package p734sl0;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: sl0.k0 */
/* JADX INFO: loaded from: classes7.dex */
public class C32630k0 implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f135238a;

    /* JADX INFO: renamed from: sl0.k0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final HashMap f135239a = new HashMap();

        /* JADX INFO: renamed from: a */
        public C32630k0 m101914a() {
            return new C32630k0(this.f135239a, 0);
        }

        /* JADX INFO: renamed from: b */
        public a m101915b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"conversationIdSeed\" is marked as non-null but was passed a null value.");
            }
            this.f135239a.put("conversationIdSeed", str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m101916c(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"sourceId\" is marked as non-null but was passed a null value.");
            }
            this.f135239a.put("sourceId", str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m101917d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"sourceType\" is marked as non-null but was passed a null value.");
            }
            this.f135239a.put("sourceType", str);
            return this;
        }
    }

    public /* synthetic */ C32630k0(HashMap map, int i13) {
        this(map);
    }

    public static C32630k0 fromBundle(Bundle bundle) {
        C32630k0 c32630k0 = new C32630k0();
        if (AbstractC17176i.m48518t(bundle, C32630k0.class, "suggestion")) {
            String string = bundle.getString("suggestion");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"suggestion\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("suggestion", string);
        } else {
            c32630k0.f135238a.put("suggestion", "GENERAL");
        }
        if (bundle.containsKey("hint")) {
            String string2 = bundle.getString("hint");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"hint\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("hint", string2);
        } else {
            c32630k0.f135238a.put("hint", "");
        }
        if (bundle.containsKey("contextualMessage")) {
            String string3 = bundle.getString("contextualMessage");
            if (string3 == null) {
                throw new IllegalArgumentException("Argument \"contextualMessage\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("contextualMessage", string3);
        } else {
            c32630k0.f135238a.put("contextualMessage", "");
        }
        if (bundle.containsKey("conversationIdSeed")) {
            String string4 = bundle.getString("conversationIdSeed");
            if (string4 == null) {
                throw new IllegalArgumentException("Argument \"conversationIdSeed\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("conversationIdSeed", string4);
        } else {
            c32630k0.f135238a.put("conversationIdSeed", "");
        }
        if (bundle.containsKey("sourcePillar")) {
            String string5 = bundle.getString("sourcePillar");
            if (string5 == null) {
                throw new IllegalArgumentException("Argument \"sourcePillar\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("sourcePillar", string5);
        } else {
            c32630k0.f135238a.put("sourcePillar", "");
        }
        if (bundle.containsKey("sourceType")) {
            String string6 = bundle.getString("sourceType");
            if (string6 == null) {
                throw new IllegalArgumentException("Argument \"sourceType\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("sourceType", string6);
        } else {
            c32630k0.f135238a.put("sourceType", "");
        }
        if (bundle.containsKey("presetQuestion")) {
            c32630k0.f135238a.put("presetQuestion", bundle.getString("presetQuestion"));
        } else {
            c32630k0.f135238a.put("presetQuestion", null);
        }
        if (bundle.containsKey("includeInitialMessage")) {
            c32630k0.f135238a.put("includeInitialMessage", Boolean.valueOf(bundle.getBoolean("includeInitialMessage")));
        } else {
            c32630k0.f135238a.put("includeInitialMessage", Boolean.TRUE);
        }
        if (bundle.containsKey("sourceId")) {
            String string7 = bundle.getString("sourceId");
            if (string7 == null) {
                throw new IllegalArgumentException("Argument \"sourceId\" is marked as non-null but was passed a null value.");
            }
            c32630k0.f135238a.put("sourceId", string7);
        } else {
            c32630k0.f135238a.put("sourceId", "");
        }
        if (bundle.containsKey("source")) {
            c32630k0.f135238a.put("source", bundle.getString("source"));
        } else {
            c32630k0.f135238a.put("source", "");
        }
        if (!bundle.containsKey("args")) {
            c32630k0.f135238a.put("args", "");
            return c32630k0;
        }
        c32630k0.f135238a.put("args", bundle.getString("args"));
        return c32630k0;
    }

    /* JADX INFO: renamed from: a */
    public String m101902a() {
        return (String) this.f135238a.get("args");
    }

    /* JADX INFO: renamed from: b */
    public String m101903b() {
        return (String) this.f135238a.get("contextualMessage");
    }

    /* JADX INFO: renamed from: c */
    public String m101904c() {
        return (String) this.f135238a.get("conversationIdSeed");
    }

    /* JADX INFO: renamed from: d */
    public String m101905d() {
        return (String) this.f135238a.get("hint");
    }

    /* JADX INFO: renamed from: e */
    public boolean m101906e() {
        return ((Boolean) this.f135238a.get("includeInitialMessage")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C32630k0 c32630k0 = (C32630k0) obj;
        if (this.f135238a.containsKey("suggestion") != c32630k0.f135238a.containsKey("suggestion")) {
            return false;
        }
        if (m101912k() == null ? c32630k0.m101912k() != null : !m101912k().equals(c32630k0.m101912k())) {
            return false;
        }
        if (this.f135238a.containsKey("hint") != c32630k0.f135238a.containsKey("hint")) {
            return false;
        }
        if (m101905d() == null ? c32630k0.m101905d() != null : !m101905d().equals(c32630k0.m101905d())) {
            return false;
        }
        if (this.f135238a.containsKey("contextualMessage") != c32630k0.f135238a.containsKey("contextualMessage")) {
            return false;
        }
        if (m101903b() == null ? c32630k0.m101903b() != null : !m101903b().equals(c32630k0.m101903b())) {
            return false;
        }
        if (this.f135238a.containsKey("conversationIdSeed") != c32630k0.f135238a.containsKey("conversationIdSeed")) {
            return false;
        }
        if (m101904c() == null ? c32630k0.m101904c() != null : !m101904c().equals(c32630k0.m101904c())) {
            return false;
        }
        if (this.f135238a.containsKey("sourcePillar") != c32630k0.f135238a.containsKey("sourcePillar")) {
            return false;
        }
        if (m101910i() == null ? c32630k0.m101910i() != null : !m101910i().equals(c32630k0.m101910i())) {
            return false;
        }
        if (this.f135238a.containsKey("sourceType") != c32630k0.f135238a.containsKey("sourceType")) {
            return false;
        }
        if (m101911j() == null ? c32630k0.m101911j() != null : !m101911j().equals(c32630k0.m101911j())) {
            return false;
        }
        if (this.f135238a.containsKey("presetQuestion") != c32630k0.f135238a.containsKey("presetQuestion")) {
            return false;
        }
        if (m101907f() == null ? c32630k0.m101907f() != null : !m101907f().equals(c32630k0.m101907f())) {
            return false;
        }
        if (this.f135238a.containsKey("includeInitialMessage") != c32630k0.f135238a.containsKey("includeInitialMessage") || m101906e() != c32630k0.m101906e() || this.f135238a.containsKey("sourceId") != c32630k0.f135238a.containsKey("sourceId")) {
            return false;
        }
        if (m101909h() == null ? c32630k0.m101909h() != null : !m101909h().equals(c32630k0.m101909h())) {
            return false;
        }
        if (this.f135238a.containsKey("source") != c32630k0.f135238a.containsKey("source")) {
            return false;
        }
        if (m101908g() == null ? c32630k0.m101908g() != null : !m101908g().equals(c32630k0.m101908g())) {
            return false;
        }
        if (this.f135238a.containsKey("args") != c32630k0.f135238a.containsKey("args")) {
            return false;
        }
        return m101902a() == null ? c32630k0.m101902a() == null : m101902a().equals(c32630k0.m101902a());
    }

    /* JADX INFO: renamed from: f */
    public String m101907f() {
        return (String) this.f135238a.get("presetQuestion");
    }

    /* JADX INFO: renamed from: g */
    public String m101908g() {
        return (String) this.f135238a.get("source");
    }

    /* JADX INFO: renamed from: h */
    public String m101909h() {
        return (String) this.f135238a.get("sourceId");
    }

    public int hashCode() {
        return (((((((m101906e() ? 1 : 0) + (((((((((((((((m101912k() != null ? m101912k().hashCode() : 0) + 31) * 31) + (m101905d() != null ? m101905d().hashCode() : 0)) * 31) + (m101903b() != null ? m101903b().hashCode() : 0)) * 31) + (m101904c() != null ? m101904c().hashCode() : 0)) * 31) + (m101910i() != null ? m101910i().hashCode() : 0)) * 31) + (m101911j() != null ? m101911j().hashCode() : 0)) * 31) + (m101907f() != null ? m101907f().hashCode() : 0)) * 31)) * 31) + (m101909h() != null ? m101909h().hashCode() : 0)) * 31) + (m101908g() != null ? m101908g().hashCode() : 0)) * 31) + (m101902a() != null ? m101902a().hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public String m101910i() {
        return (String) this.f135238a.get("sourcePillar");
    }

    /* JADX INFO: renamed from: j */
    public String m101911j() {
        return (String) this.f135238a.get("sourceType");
    }

    /* JADX INFO: renamed from: k */
    public String m101912k() {
        return (String) this.f135238a.get("suggestion");
    }

    /* JADX INFO: renamed from: l */
    public Bundle m101913l() {
        Bundle bundle = new Bundle();
        if (this.f135238a.containsKey("suggestion")) {
            bundle.putString("suggestion", (String) this.f135238a.get("suggestion"));
        } else {
            bundle.putString("suggestion", "GENERAL");
        }
        if (this.f135238a.containsKey("hint")) {
            bundle.putString("hint", (String) this.f135238a.get("hint"));
        } else {
            bundle.putString("hint", "");
        }
        if (this.f135238a.containsKey("contextualMessage")) {
            bundle.putString("contextualMessage", (String) this.f135238a.get("contextualMessage"));
        } else {
            bundle.putString("contextualMessage", "");
        }
        if (this.f135238a.containsKey("conversationIdSeed")) {
            bundle.putString("conversationIdSeed", (String) this.f135238a.get("conversationIdSeed"));
        } else {
            bundle.putString("conversationIdSeed", "");
        }
        if (this.f135238a.containsKey("sourcePillar")) {
            bundle.putString("sourcePillar", (String) this.f135238a.get("sourcePillar"));
        } else {
            bundle.putString("sourcePillar", "");
        }
        if (this.f135238a.containsKey("sourceType")) {
            bundle.putString("sourceType", (String) this.f135238a.get("sourceType"));
        } else {
            bundle.putString("sourceType", "");
        }
        if (this.f135238a.containsKey("presetQuestion")) {
            bundle.putString("presetQuestion", (String) this.f135238a.get("presetQuestion"));
        } else {
            bundle.putString("presetQuestion", null);
        }
        if (this.f135238a.containsKey("includeInitialMessage")) {
            bundle.putBoolean("includeInitialMessage", ((Boolean) this.f135238a.get("includeInitialMessage")).booleanValue());
        } else {
            bundle.putBoolean("includeInitialMessage", true);
        }
        if (this.f135238a.containsKey("sourceId")) {
            bundle.putString("sourceId", (String) this.f135238a.get("sourceId"));
        } else {
            bundle.putString("sourceId", "");
        }
        if (this.f135238a.containsKey("source")) {
            bundle.putString("source", (String) this.f135238a.get("source"));
        } else {
            bundle.putString("source", "");
        }
        if (this.f135238a.containsKey("args")) {
            bundle.putString("args", (String) this.f135238a.get("args"));
            return bundle;
        }
        bundle.putString("args", "");
        return bundle;
    }

    public String toString() {
        return "AiConversationFragmentArgs{suggestion=" + m101912k() + ", hint=" + m101905d() + ", contextualMessage=" + m101903b() + ", conversationIdSeed=" + m101904c() + ", sourcePillar=" + m101910i() + ", sourceType=" + m101911j() + ", presetQuestion=" + m101907f() + ", includeInitialMessage=" + m101906e() + ", sourceId=" + m101909h() + ", source=" + m101908g() + ", args=" + m101902a() + "}";
    }

    private C32630k0() {
        this.f135238a = new HashMap();
    }

    private C32630k0(HashMap map) {
        HashMap map2 = new HashMap();
        this.f135238a = map2;
        map2.putAll(map);
    }
}
