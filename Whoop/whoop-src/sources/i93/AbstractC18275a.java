package i93;

import d93.InterfaceC11820a;
import j93.AbstractC21478l0;
import java.util.Iterator;

/* JADX INFO: renamed from: i93.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18275a implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final char f71122w;

    /* JADX INFO: renamed from: x */
    public final char f71123x;

    /* JADX INFO: renamed from: y */
    public final int f71124y = 1;

    public AbstractC18275a(char c3, char c7) {
        this.f71122w = c3;
        this.f71123x = (char) AbstractC21478l0.m60400F(c3, c7, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18276b(this.f71122w, this.f71123x, this.f71124y);
    }
}
