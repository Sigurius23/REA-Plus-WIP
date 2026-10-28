package q02;

import com.whoop.navigation.models.GenericHttpMethod;
import i63.C18181t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: q02.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/navigation/models/GenericHttpMethod;", "Li63/t;", "b", "(Lcom/whoop/navigation/models/GenericHttpMethod;)Li63/t;", "nested-bff-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29749c {

    /* JADX INFO: renamed from: q02.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f121685a;

        static {
            int[] iArr = new int[GenericHttpMethod.values().length];
            try {
                iArr[GenericHttpMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericHttpMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenericHttpMethod.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GenericHttpMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GenericHttpMethod.PATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f121685a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C18181t m91207b(GenericHttpMethod genericHttpMethod) {
        int i13 = a.f121685a[genericHttpMethod.ordinal()];
        if (i13 == 1) {
            C18181t c18181t = C18181t.f70508b;
            return C18181t.f70508b;
        }
        if (i13 == 2) {
            C18181t c18181t2 = C18181t.f70508b;
            return C18181t.f70509c;
        }
        if (i13 == 3) {
            C18181t c18181t3 = C18181t.f70508b;
            return C18181t.f70510d;
        }
        if (i13 == 4) {
            C18181t c18181t4 = C18181t.f70508b;
            return C18181t.f70512f;
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        C18181t c18181t5 = C18181t.f70508b;
        return C18181t.f70511e;
    }
}
