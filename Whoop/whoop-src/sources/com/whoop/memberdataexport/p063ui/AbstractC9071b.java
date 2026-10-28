package com.whoop.memberdataexport.p063ui;

import android.os.Bundle;
import java.util.HashMap;
import jv1.AbstractC21968a;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: com.whoop.memberdataexport.ui.b */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC9071b {

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.b$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f27155a;

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, int i13) {
            this(str, str2, str3, str4, str5);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC21968a.f85039b;
        }

        /* JADX INFO: renamed from: b */
        public String m22605b() {
            return (String) this.f27155a.get("body");
        }

        /* JADX INFO: renamed from: c */
        public String m22606c() {
            return (String) this.f27155a.get("headline");
        }

        /* JADX INFO: renamed from: d */
        public String m22607d() {
            return (String) this.f27155a.get("helpLink");
        }

        /* JADX INFO: renamed from: e */
        public String m22608e() {
            return (String) this.f27155a.get("helpText");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27155a.containsKey("title") != aVar.f27155a.containsKey("title")) {
                return false;
            }
            if (m22609f() == null ? aVar.m22609f() != null : !m22609f().equals(aVar.m22609f())) {
                return false;
            }
            if (this.f27155a.containsKey("headline") != aVar.f27155a.containsKey("headline")) {
                return false;
            }
            if (m22606c() == null ? aVar.m22606c() != null : !m22606c().equals(aVar.m22606c())) {
                return false;
            }
            if (this.f27155a.containsKey("body") != aVar.f27155a.containsKey("body")) {
                return false;
            }
            if (m22605b() == null ? aVar.m22605b() != null : !m22605b().equals(aVar.m22605b())) {
                return false;
            }
            if (this.f27155a.containsKey("helpText") != aVar.f27155a.containsKey("helpText")) {
                return false;
            }
            if (m22608e() == null ? aVar.m22608e() != null : !m22608e().equals(aVar.m22608e())) {
                return false;
            }
            if (this.f27155a.containsKey("helpLink") != aVar.f27155a.containsKey("helpLink")) {
                return false;
            }
            if (m22607d() == null ? aVar.m22607d() == null : m22607d().equals(aVar.m22607d())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public String m22609f() {
            return (String) this.f27155a.get("title");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f27155a.containsKey("title")) {
                bundle.putString("title", (String) this.f27155a.get("title"));
            }
            if (this.f27155a.containsKey("headline")) {
                bundle.putString("headline", (String) this.f27155a.get("headline"));
            }
            if (this.f27155a.containsKey("body")) {
                bundle.putString("body", (String) this.f27155a.get("body"));
            }
            if (this.f27155a.containsKey("helpText")) {
                bundle.putString("helpText", (String) this.f27155a.get("helpText"));
            }
            if (this.f27155a.containsKey("helpLink")) {
                bundle.putString("helpLink", (String) this.f27155a.get("helpLink"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((((((((m22609f() != null ? m22609f().hashCode() : 0) + 31) * 31) + (m22606c() != null ? m22606c().hashCode() : 0)) * 31) + (m22605b() != null ? m22605b().hashCode() : 0)) * 31) + (m22608e() != null ? m22608e().hashCode() : 0)) * 31) + (m22607d() != null ? m22607d().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "MemberdataexportActionMemberdataexportSubmitmdefragmentToMemberdataexportSubmissioncompletefragment(actionId=" + mo19186a() + "){title=" + m22609f() + ", headline=" + m22606c() + ", body=" + m22605b() + ", helpText=" + m22608e() + ", helpLink=" + m22607d() + "}";
        }

        private a(String str, String str2, String str3, String str4, String str5) {
            HashMap map = new HashMap();
            this.f27155a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            map.put("title", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"headline\" is marked as non-null but was passed a null value.");
            }
            map.put("headline", str2);
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"body\" is marked as non-null but was passed a null value.");
            }
            map.put("body", str3);
            if (str4 == null) {
                throw new IllegalArgumentException("Argument \"helpText\" is marked as non-null but was passed a null value.");
            }
            map.put("helpText", str4);
            if (str5 == null) {
                throw new IllegalArgumentException("Argument \"helpLink\" is marked as non-null but was passed a null value.");
            }
            map.put("helpLink", str5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m22604a(String str, String str2, String str3, String str4, String str5) {
        return new a(str, str2, str3, str4, str5, 0);
    }
}
