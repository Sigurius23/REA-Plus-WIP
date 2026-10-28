package pe1;

import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.EducationDtoToModelMapperKt;
import com.whoop.educationModels.MediaHeader;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import ke1.AbstractC22419b;
import l83.C23454a0;
import oe1.AbstractC27875e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pe1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lpe1/b;", "", "<init>", "()V", "Lec3/l;", "Lke1/b;", "domainResultFlow", "Loe1/e;", "a", "(Lec3/l;)Lec3/l;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29116b {

    /* JADX INFO: renamed from: pe1.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f117853w;

        /* JADX INFO: renamed from: pe1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42162a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f117854w;

            /* JADX INFO: renamed from: pe1.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.education.presentation.reducers.EducationViewStateReducer$reduce$$inlined$map$1$2", m100430f = "EducationViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42163a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f117855E;

                /* JADX INFO: renamed from: F */
                Object f117856F;

                /* JADX INFO: renamed from: G */
                Object f117857G;

                /* JADX INFO: renamed from: H */
                int f117858H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f117859w;

                /* JADX INFO: renamed from: x */
                int f117860x;

                /* JADX INFO: renamed from: y */
                Object f117861y;

                public C42163a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f117859w = obj;
                    this.f117860x |= Integer.MIN_VALUE;
                    return C42162a.this.emit(null, this);
                }
            }

            public C42162a(InterfaceC13062m interfaceC13062m) {
                this.f117854w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42163a c42163a;
                Object cVar;
                if (interfaceC30057d instanceof C42163a) {
                    c42163a = (C42163a) interfaceC30057d;
                    int i13 = c42163a.f117860x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42163a.f117860x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42163a = new C42163a(interfaceC30057d);
                    }
                } else {
                    c42163a = new C42163a(interfaceC30057d);
                }
                Object obj2 = c42163a.f117859w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42163a.f117860x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f117854w;
                    AbstractC22419b abstractC22419b = (AbstractC22419b) obj;
                    if (abstractC22419b instanceof AbstractC22419b.c) {
                        AbstractC22419b.c cVar2 = (AbstractC22419b.c) abstractC22419b;
                        List<FeatureEducationParagraph> educationSections = EducationDtoToModelMapperKt.toEducationSections(cVar2.getData());
                        TextResource textResourceM88476b = AbstractC29115a.m88476b(cVar2.getData().getScreens());
                        MediaHeader mediaHeader = cVar2.getData().getMediaHeader();
                        cVar = new AbstractC27875e.c(educationSections, textResourceM88476b, mediaHeader != null ? AbstractC29115a.m88475a(mediaHeader) : null, cVar2.getData().getStickyButton());
                    } else if (abstractC22419b instanceof AbstractC22419b.a) {
                        cVar = AbstractC27875e.a.f112408a;
                    } else {
                        if (!(abstractC22419b instanceof AbstractC22419b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = AbstractC27875e.b.f112409a;
                    }
                    c42163a.f117861y = null;
                    c42163a.f117855E = null;
                    c42163a.f117856F = null;
                    c42163a.f117857G = null;
                    c42163a.f117858H = 0;
                    c42163a.f117860x = 1;
                    if (interfaceC13062m.emit(cVar, c42163a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f117853w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f117853w.collect(new C42162a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m88477a(InterfaceC13058l domainResultFlow) {
        AbstractC22676k.m65750j(domainResultFlow, "domainResultFlow");
        return new a(domainResultFlow);
    }
}
