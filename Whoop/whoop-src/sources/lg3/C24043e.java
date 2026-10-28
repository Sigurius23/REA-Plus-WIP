package lg3;

import java.util.ArrayList;

/* JADX INFO: renamed from: lg3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C24043e implements InterfaceC24044f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC24044f[] f95027w;

    /* JADX INFO: renamed from: x */
    public final boolean f95028x;

    public C24043e(boolean z4, ArrayList arrayList) {
        this((InterfaceC24044f[]) arrayList.toArray(new InterfaceC24044f[arrayList.size()]), z4);
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        ArrayList arrayList = (ArrayList) c24055q.f95072f;
        boolean z4 = this.f95028x;
        InterfaceC24044f[] interfaceC24044fArr = this.f95027w;
        int i14 = 0;
        if (!z4) {
            int length = interfaceC24044fArr.length;
            while (i14 < length) {
                i13 = interfaceC24044fArr[i14].mo70946a(c24055q, charSequence, i13);
                if (i13 < 0) {
                    return i13;
                }
                i14++;
            }
            return i13;
        }
        C24054p c24054pM70969c = c24055q.m70969c();
        C24054p c24054p = new C24054p(c24054pM70969c.f95066J);
        c24054p.f95062F = c24054pM70969c.f95062F;
        c24054p.f95063G.putAll(c24054pM70969c.f95063G);
        c24054p.f95064H = c24054pM70969c.f95064H;
        arrayList.add(c24054p);
        int length2 = interfaceC24044fArr.length;
        int iMo70946a = i13;
        while (i14 < length2) {
            iMo70946a = interfaceC24044fArr[i14].mo70946a(c24055q, charSequence, iMo70946a);
            if (iMo70946a < 0) {
                arrayList.remove(arrayList.size() - 1);
                return i13;
            }
            i14++;
        }
        arrayList.remove(arrayList.size() - 2);
        return iMo70946a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.f2432x--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException
     */
    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo70947b(p012ab.C0682h0 r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.f95028x
            if (r2 == 0) goto Le
            int r3 = r8.f2432x
            int r3 = r3 + r1
            r8.f2432x = r3
        Le:
            lg3.f[] r3 = r7.f95027w     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.mo70947b(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.f2432x
            int r9 = r9 - r1
            r8.f2432x = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.f2432x
            int r0 = r0 - r1
            r8.f2432x = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lg3.C24043e.mo70947b(ab.h0, java.lang.StringBuilder):boolean");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        InterfaceC24044f[] interfaceC24044fArr = this.f95027w;
        if (interfaceC24044fArr != null) {
            boolean z4 = this.f95028x;
            sb4.append(z4 ? "[" : "(");
            for (InterfaceC24044f interfaceC24044f : interfaceC24044fArr) {
                sb4.append(interfaceC24044f);
            }
            sb4.append(z4 ? "]" : ")");
        }
        return sb4.toString();
    }

    public C24043e(InterfaceC24044f[] interfaceC24044fArr, boolean z4) {
        this.f95027w = interfaceC24044fArr;
        this.f95028x = z4;
    }
}
