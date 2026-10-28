package p114eb;

import e93.AbstractC12889b;
import java.util.LinkedHashMap;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.j1 */
/* JADX INFO: loaded from: classes.dex */
public class C12967j1 {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f44787b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f44788a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m36450a(AbstractC12964i1 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        String strM36241G = AbstractC12889b.m36241G(navigator.getClass());
        if (strM36241G.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f44788a;
        AbstractC12964i1 abstractC12964i1 = (AbstractC12964i1) linkedHashMap.get(strM36241G);
        if (AbstractC22676k.m65745e(abstractC12964i1, navigator)) {
            return;
        }
        if (abstractC12964i1 != null && abstractC12964i1.f44779b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + abstractC12964i1).toString());
        }
        if (!navigator.f44779b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX INFO: renamed from: b */
    public AbstractC12964i1 mo36434b(String name) {
        AbstractC22676k.m65750j(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC12964i1 abstractC12964i1 = (AbstractC12964i1) this.f44788a.get(name);
        if (abstractC12964i1 != null) {
            return abstractC12964i1;
        }
        throw new IllegalStateException(AbstractC11895b.m31996o("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
