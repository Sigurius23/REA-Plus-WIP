package aa2;

import com.whoop.domain.model.FitnessLevel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Laa2/a;", "", "<init>", "()V", "Lcom/whoop/domain/model/FitnessLevel;", "fitnessLevel", "", "a", "(Lcom/whoop/domain/model/FitnessLevel;)Ljava/lang/String;", "b", "(Ljava/lang/String;)Lcom/whoop/domain/model/FitnessLevel;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0592a {
    /* JADX INFO: renamed from: a */
    public final String m1547a(FitnessLevel fitnessLevel) {
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        return fitnessLevel.name();
    }

    /* JADX INFO: renamed from: b */
    public final FitnessLevel m1548b(String fitnessLevel) {
        AbstractC22676k.m65750j(fitnessLevel, "fitnessLevel");
        return FitnessLevel.valueOf(fitnessLevel);
    }
}
