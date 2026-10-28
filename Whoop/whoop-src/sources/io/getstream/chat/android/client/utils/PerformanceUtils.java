package io.getstream.chat.android.client.utils;

import android.util.Log;
import c93.InterfaceC4339a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\fR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/PerformanceUtils;", "", "<init>", "()V", "", "taskName", "Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;", "entry", "Ll83/a0;", "doMeasureAndUpdateResult", "(Ljava/lang/String;Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;)V", "startTask", "(Ljava/lang/String;)V", "stopTask", "T", "Lkotlin/Function0;", "task", "(Ljava/lang/String;Lc93/a;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lq83/d;", "suspendTask", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "message", "log", "", "tasks", "Ljava/util/Map;", "TaskEntry", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PerformanceUtils {
    public static final PerformanceUtils INSTANCE = new PerformanceUtils();
    private static volatile Map<String, TaskEntry> tasks = C25272z.f99163w;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.PerformanceUtils$suspendTask$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.PerformanceUtils", m100430f = "PerformanceUtils.kt", m100431l = {86}, m100432m = "suspendTask")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194501<T> extends AbstractC32269c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194501(InterfaceC30057d<? super C194501> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceUtils.this.suspendTask(null, null, this);
        }
    }

    private PerformanceUtils() {
    }

    private final void doMeasureAndUpdateResult(String taskName, TaskEntry entry) {
        Long lastStart = entry.getLastStart();
        if (lastStart != null) {
            double dCurrentTimeMillis = (System.currentTimeMillis() - lastStart.longValue()) / 1000.0d;
            double sumDuration = entry.getSumDuration() + dCurrentTimeMillis;
            int count = entry.getCount() + 1;
            tasks = AbstractC25247g0.m73996e0(tasks, new C23465k(taskName, TaskEntry.copy$default(entry, null, count, sumDuration, null, 1, null)));
            INSTANCE.log("Task \"" + taskName + "\" completed for " + dCurrentTimeMillis + " seconds\nThe average duration for task \"" + taskName + "\" is " + (sumDuration / ((double) count)) + " seconds");
        }
    }

    public final void log(String message) {
        AbstractC22676k.m65750j(message, "message");
        Log.d("Performance", message);
    }

    public final void startTask(String taskName) throws Throwable {
        Map<String, TaskEntry> mapM73996e0;
        AbstractC22676k.m65750j(taskName, "taskName");
        synchronized (taskName) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                TaskEntry taskEntry = tasks.get(taskName);
                if (taskEntry == null) {
                    try {
                        mapM73996e0 = AbstractC25247g0.m73996e0(tasks, new C23465k(taskName, new TaskEntry(taskName, 0, 0.0d, Long.valueOf(jCurrentTimeMillis))));
                    } catch (Throwable th3) {
                        th = th3;
                        taskName = taskName;
                        throw th;
                    }
                } else {
                    mapM73996e0 = AbstractC25247g0.m73996e0(tasks, new C23465k(taskName, TaskEntry.copy$default(taskEntry, null, 0, 0.0d, Long.valueOf(jCurrentTimeMillis), 7, null)));
                }
                tasks = mapM73996e0;
                INSTANCE.log("Task \"" + taskName + "\" started");
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void stopTask(String taskName) {
        AbstractC22676k.m65750j(taskName, "taskName");
        synchronized (taskName) {
            TaskEntry taskEntry = tasks.get(taskName);
            if (taskEntry != null) {
                INSTANCE.doMeasureAndUpdateResult(taskName, taskEntry);
                return;
            }
            INSTANCE.log("There is no such task \"" + taskName + "\"");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final <T> Object suspendTask(String str, Function1 function1, InterfaceC30057d<? super T> interfaceC30057d) {
        C194501 c194501;
        String str2;
        int i13;
        long j7;
        if (interfaceC30057d instanceof C194501) {
            c194501 = (C194501) interfaceC30057d;
            int i14 = c194501.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c194501.label = i14 - Integer.MIN_VALUE;
            } else {
                c194501 = new C194501(interfaceC30057d);
            }
        } else {
            c194501 = new C194501(interfaceC30057d);
        }
        Object obj = c194501.result;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = c194501.label;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            TaskEntry taskEntry = tasks.get(str);
            int count = taskEntry != null ? taskEntry.getCount() : 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c194501.L$0 = str;
            c194501.L$1 = null;
            c194501.I$0 = count;
            c194501.J$0 = jCurrentTimeMillis;
            c194501.label = 1;
            Object objInvoke = function1.invoke(c194501);
            if (objInvoke == obj2) {
                return obj2;
            }
            str2 = str;
            i13 = count;
            obj = objInvoke;
            j7 = jCurrentTimeMillis;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c194501.J$0;
            int i16 = c194501.I$0;
            String str3 = (String) c194501.L$0;
            AbstractC34132o.m107864I(obj);
            i13 = i16;
            str2 = str3;
        }
        INSTANCE.doMeasureAndUpdateResult(str2, new TaskEntry(str2, i13, 0.0d, new Long(j7), 4, null));
        return obj;
    }

    public final <T> T task(String taskName, InterfaceC4339a task) throws Throwable {
        String str;
        Throwable th3;
        int count;
        AbstractC22676k.m65750j(taskName, "taskName");
        AbstractC22676k.m65750j(task, "task");
        synchronized (taskName) {
            try {
                TaskEntry taskEntry = tasks.get(taskName);
                if (taskEntry != null) {
                    try {
                        count = taskEntry.getCount();
                    } catch (Throwable th4) {
                        th3 = th4;
                        str = taskName;
                        throw th3;
                    }
                } else {
                    count = 0;
                }
                int i13 = count;
                long jCurrentTimeMillis = System.currentTimeMillis();
                T t14 = (T) task.invoke();
                str = taskName;
                try {
                    INSTANCE.doMeasureAndUpdateResult(str, new TaskEntry(str, i13, 0.0d, Long.valueOf(jCurrentTimeMillis), 4, null));
                    return t14;
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
                str = taskName;
            }
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;", "", "name", "", "count", "", "sumDuration", "", "lastStart", "", "<init>", "(Ljava/lang/String;IDLjava/lang/Long;)V", "getName", "()Ljava/lang/String;", "getCount", "()I", "getSumDuration", "()D", "getLastStart", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;IDLjava/lang/Long;)Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class TaskEntry {
        private final int count;
        private final Long lastStart;
        private final String name;
        private final double sumDuration;

        public TaskEntry(String name, int i13, double d3, Long l7) {
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
            this.count = i13;
            this.sumDuration = d3;
            this.lastStart = l7;
        }

        public static /* synthetic */ TaskEntry copy$default(TaskEntry taskEntry, String str, int i13, double d3, Long l7, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = taskEntry.name;
            }
            if ((i14 & 2) != 0) {
                i13 = taskEntry.count;
            }
            if ((i14 & 4) != 0) {
                d3 = taskEntry.sumDuration;
            }
            if ((i14 & 8) != 0) {
                l7 = taskEntry.lastStart;
            }
            Long l12 = l7;
            return taskEntry.copy(str, i13, d3, l12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getSumDuration() {
            return this.sumDuration;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getLastStart() {
            return this.lastStart;
        }

        public final TaskEntry copy(String name, int count, double sumDuration, Long lastStart) {
            AbstractC22676k.m65750j(name, "name");
            return new TaskEntry(name, count, sumDuration, lastStart);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaskEntry)) {
                return false;
            }
            TaskEntry taskEntry = (TaskEntry) other;
            return AbstractC22676k.m65745e(this.name, taskEntry.name) && this.count == taskEntry.count && Double.compare(this.sumDuration, taskEntry.sumDuration) == 0 && AbstractC22676k.m65745e(this.lastStart, taskEntry.lastStart);
        }

        public final int getCount() {
            return this.count;
        }

        public final Long getLastStart() {
            return this.lastStart;
        }

        public final String getName() {
            return this.name;
        }

        public final double getSumDuration() {
            return this.sumDuration;
        }

        public final int hashCode() {
            int iM48499a = AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.count, this.name.hashCode() * 31, 31), 31, this.sumDuration);
            Long l7 = this.lastStart;
            return iM48499a + (l7 == null ? 0 : l7.hashCode());
        }

        public final String toString() {
            String str = this.name;
            int i13 = this.count;
            double d3 = this.sumDuration;
            Long l7 = this.lastStart;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "TaskEntry(name=", str, ", count=", ", sumDuration=");
            sbM30467u.append(d3);
            sbM30467u.append(", lastStart=");
            sbM30467u.append(l7);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }

        public /* synthetic */ TaskEntry(String str, int i13, double d3, Long l7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? 0.0d : d3, l7);
        }
    }
}
