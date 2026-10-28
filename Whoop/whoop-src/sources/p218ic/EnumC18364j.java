package p218ic;

import ge3.AbstractC15751g;
import java.util.concurrent.Executor;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18364j implements Executor {

    /* JADX INFO: renamed from: w */
    public static final EnumC18364j f71497w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC18364j[] f71498x;

    static {
        EnumC18364j enumC18364j = new EnumC18364j("INSTANCE", 0);
        f71497w = enumC18364j;
        EnumC18364j[] enumC18364jArr = {enumC18364j};
        f71498x = enumC18364jArr;
        AbstractC15751g.m44468u(enumC18364jArr);
    }

    public static EnumC18364j valueOf(String str) {
        return (EnumC18364j) Enum.valueOf(EnumC18364j.class, str);
    }

    public static EnumC18364j[] values() {
        return (EnumC18364j[]) f71498x.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        AbstractC22676k.m65750j(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
