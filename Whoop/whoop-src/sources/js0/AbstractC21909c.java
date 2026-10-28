package js0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: js0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\n¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\u0003J\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\u000f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ljs0/c;", "", "<init>", "()V", "T", "Ljs0/a;", "configuration", "getConfigurationValue", "(Ljs0/a;)Ljava/lang/Object;", "get", "Ll83/a0;", "fetchConfigurationValuesAsync", "", "fetchConfigurationValues", "(Lq83/d;)Ljava/lang/Object;", "getConfigurationValueFromJava", "Ljs0/b;", "configurations", "Ljs0/b;", "getConfigurations", "()Ljs0/b;", "config-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21909c {
    private final C21908b configurations = new C21908b();

    public abstract Object fetchConfigurationValues(InterfaceC30057d<? super Boolean> interfaceC30057d);

    public abstract void fetchConfigurationValuesAsync();

    public final <T> T get(AbstractC21907a<T> configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        getConfigurations();
        configuration.getName();
        configuration.getDefaultValue();
        AbstractC22676k.m65756p();
        throw null;
    }

    public final <T> T getConfigurationValue(AbstractC21907a<T> configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        getConfigurations();
        configuration.getName();
        configuration.getDefaultValue();
        AbstractC22676k.m65756p();
        throw null;
    }

    public abstract <T> T getConfigurationValueFromJava(AbstractC21907a<T> configuration);

    public final C21908b getConfigurations() {
        return this.configurations;
    }
}
