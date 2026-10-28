package js0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: js0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ljs0/a;", "", "T", "", "name", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "config-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21907a<T> {
    private final T defaultValue;
    private final String name;

    public AbstractC21907a(String name, T defaultValue) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        this.name = name;
        this.defaultValue = defaultValue;
    }

    public final T getDefaultValue() {
        return this.defaultValue;
    }

    public final String getName() {
        return this.name;
    }
}
