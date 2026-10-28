package ow0;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: ow0.b */
/* JADX INFO: loaded from: classes7.dex */
public class C28432b implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f114657a = new HashMap();

    private C28432b() {
    }

    public static C28432b fromBundle(Bundle bundle) {
        C28432b c28432b = new C28432b();
        if (!AbstractC17176i.m48518t(bundle, C28432b.class, "entryPoint")) {
            throw new IllegalArgumentException("Required argument \"entryPoint\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("entryPoint");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        }
        c28432b.f114657a.put("entryPoint", string);
        if (!bundle.containsKey("activityType")) {
            throw new IllegalArgumentException("Required argument \"activityType\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("activityType");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"activityType\" is marked as non-null but was passed a null value.");
        }
        c28432b.f114657a.put("activityType", string2);
        if (bundle.containsKey("newHome")) {
            c28432b.f114657a.put("newHome", Boolean.valueOf(bundle.getBoolean("newHome")));
        } else {
            c28432b.f114657a.put("newHome", Boolean.FALSE);
        }
        if (!bundle.containsKey("activityIdV2")) {
            throw new IllegalArgumentException("Required argument \"activityIdV2\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("activityIdV2");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"activityIdV2\" is marked as non-null but was passed a null value.");
        }
        c28432b.f114657a.put("activityIdV2", string3);
        return c28432b;
    }

    /* JADX INFO: renamed from: a */
    public String m86153a() {
        return (String) this.f114657a.get("activityIdV2");
    }

    /* JADX INFO: renamed from: b */
    public String m86154b() {
        return (String) this.f114657a.get("activityType");
    }

    /* JADX INFO: renamed from: c */
    public String m86155c() {
        return (String) this.f114657a.get("entryPoint");
    }

    /* JADX INFO: renamed from: d */
    public boolean m86156d() {
        return ((Boolean) this.f114657a.get("newHome")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28432b c28432b = (C28432b) obj;
        if (this.f114657a.containsKey("entryPoint") != c28432b.f114657a.containsKey("entryPoint")) {
            return false;
        }
        if (m86155c() == null ? c28432b.m86155c() != null : !m86155c().equals(c28432b.m86155c())) {
            return false;
        }
        if (this.f114657a.containsKey("activityType") != c28432b.f114657a.containsKey("activityType")) {
            return false;
        }
        if (m86154b() == null ? c28432b.m86154b() != null : !m86154b().equals(c28432b.m86154b())) {
            return false;
        }
        if (this.f114657a.containsKey("newHome") == c28432b.f114657a.containsKey("newHome") && m86156d() == c28432b.m86156d() && this.f114657a.containsKey("activityIdV2") == c28432b.f114657a.containsKey("activityIdV2")) {
            return m86153a() == null ? c28432b.m86153a() == null : m86153a().equals(c28432b.m86153a());
        }
        return false;
    }

    public int hashCode() {
        return (((m86156d() ? 1 : 0) + (((((m86155c() != null ? m86155c().hashCode() : 0) + 31) * 31) + (m86154b() != null ? m86154b().hashCode() : 0)) * 31)) * 31) + (m86153a() != null ? m86153a().hashCode() : 0);
    }

    public String toString() {
        return "CoreDetailsFragmentArgs{entryPoint=" + m86155c() + ", activityType=" + m86154b() + ", newHome=" + m86156d() + ", activityIdV2=" + m86153a() + "}";
    }
}
