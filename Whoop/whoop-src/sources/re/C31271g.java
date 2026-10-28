package re;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.C39322q;
import p641y8.InterfaceC39323r;

/* JADX INFO: renamed from: re.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C31271g {

    /* JADX INFO: renamed from: b */
    public Object f128785b;

    /* JADX INFO: renamed from: f */
    public Object f128789f;

    /* JADX INFO: renamed from: c */
    public Serializable f128786c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public Serializable f128787d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public Serializable f128788e = new PriorityQueue();

    /* JADX INFO: renamed from: a */
    public int f128784a = -1;

    public C31271g(InterfaceC39323r interfaceC39323r) {
        this.f128785b = interfaceC39323r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.f169174x) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m96289a(long r9, p607x8.C38059n r11) {
        /*
            r8 = this;
            java.io.Serializable r0 = r8.f128787d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.io.Serializable r1 = r8.f128788e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.f128784a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.f128784a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            y8.q r2 = (p641y8.C39322q) r2
            int r4 = p607x8.AbstractC38065t.f163031a
            long r4 = r2.f169174x
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.io.Serializable r2 = r8.f128786c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            x8.n r2 = new x8.n
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            x8.n r2 = (p607x8.C38059n) r2
        L3d:
            int r4 = r11.m121848a()
            r2.m121843C(r4)
            byte[] r4 = r11.f163017a
            int r11 = r11.f163018b
            byte[] r5 = r2.f163017a
            int r6 = r2.m121848a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f128789f
            y8.q r11 = (p641y8.C39322q) r11
            if (r11 == 0) goto L64
            long r4 = r11.f169174x
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L64
            java.util.ArrayList r9 = r11.f169173w
            r9.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            y8.q r11 = new y8.q
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            y8.q r11 = (p641y8.C39322q) r11
        L76:
            java.util.ArrayList r0 = r11.f169173w
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            r7 = 1
        L82:
            va3.AbstractC35849g.m113802d(r7)
            boolean r4 = r0.isEmpty()
            va3.AbstractC35849g.m113807i(r4)
            r11.f169174x = r9
            r0.add(r2)
            r1.add(r11)
            r8.f128789f = r11
            int r9 = r8.f128784a
            if (r9 == r3) goto L9d
            r8.m96290b(r9)
        L9d:
            return
        L9e:
            java.lang.Object r0 = r8.f128785b
            y8.r r0 = (p641y8.InterfaceC39323r) r0
            r0.mo1677a(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.C31271g.m96289a(long, x8.n):void");
    }

    /* JADX INFO: renamed from: b */
    public void m96290b(int i13) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f128788e;
        while (priorityQueue.size() > i13) {
            C39322q c39322q = (C39322q) priorityQueue.poll();
            int i14 = AbstractC38065t.f163031a;
            int i15 = 0;
            while (true) {
                arrayList = c39322q.f169173w;
                if (i15 >= arrayList.size()) {
                    break;
                }
                ((InterfaceC39323r) this.f128785b).mo1677a(c39322q.f169174x, (C38059n) arrayList.get(i15));
                ((ArrayDeque) this.f128786c).push((C38059n) arrayList.get(i15));
                i15++;
            }
            arrayList.clear();
            C39322q c39322q2 = (C39322q) this.f128789f;
            if (c39322q2 != null && c39322q2.f169174x == c39322q.f169174x) {
                this.f128789f = null;
            }
            ((ArrayDeque) this.f128787d).push(c39322q);
        }
    }
}
