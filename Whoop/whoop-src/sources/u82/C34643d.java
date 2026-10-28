package u82;

import com.whoop.data.repositories.FeatureFlagChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;

/* JADX INFO: renamed from: u82.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0019\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0002\b\u0003\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006%"}, m65681d2 = {"Lu82/d;", "Lpg3/m;", "Ll83/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "", "flagNames", "gsonConverterFactory", "kotlinxSerialization", "<init>", "(Ll83/h;Ljava/util/Set;Lpg3/m;Lpg3/m;)V", "", "a", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "Ljava/lang/reflect/Type;", "type", "", "", "parameterAnnotations", "methodAnnotations", "Lpg3/y0;", "retrofit", "Lpg3/n;", "Lud3/v0;", "requestBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;", "annotations", "Lud3/a1;", "responseBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;", "Ll83/h;", "b", "Ljava/util/Set;", "c", "Lpg3/m;", "d", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34643d extends AbstractC29199m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<String> flagNames;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC29199m gsonConverterFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC29199m kotlinxSerialization;

    public C34643d(InterfaceC23462h featureFlagChecker, Set<String> flagNames, AbstractC29199m gsonConverterFactory, AbstractC29199m kotlinxSerialization) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(flagNames, "flagNames");
        AbstractC22676k.m65750j(gsonConverterFactory, "gsonConverterFactory");
        AbstractC22676k.m65750j(kotlinxSerialization, "kotlinxSerialization");
        this.featureFlagChecker = featureFlagChecker;
        this.flagNames = flagNames;
        this.gsonConverterFactory = gsonConverterFactory;
        this.kotlinxSerialization = kotlinxSerialization;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m109480a(FeatureFlagChecker featureFlagChecker) {
        Set<String> set = this.flagNames;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (featureFlagChecker.isFeatureEnabled((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // pg3.AbstractC29199m
    public InterfaceC29201n requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(parameterAnnotations, "parameterAnnotations");
        AbstractC22676k.m65750j(methodAnnotations, "methodAnnotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        return m109480a((FeatureFlagChecker) this.featureFlagChecker.getValue()) ? this.kotlinxSerialization.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit) : this.gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }

    @Override // pg3.AbstractC29199m
    public InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        return m109480a((FeatureFlagChecker) this.featureFlagChecker.getValue()) ? this.kotlinxSerialization.responseBodyConverter(type, annotations, retrofit) : this.gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
    }
}
