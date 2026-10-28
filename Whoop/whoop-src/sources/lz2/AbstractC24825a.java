package lz2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.LegalDocumentResponse;
import gz0.EnumC16313m0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: lz2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;", "Ly71/o;", "a", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;)Ly71/o;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24825a {

    /* JADX INFO: renamed from: lz2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f97182w = new a();

        /* JADX INFO: renamed from: a */
        public final long m72773a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m72773a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lz2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f97183w = new b();

        /* JADX INFO: renamed from: a */
        public final long m72774a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m72774a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lz2.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f97184w = new c();

        /* JADX INFO: renamed from: a */
        public final long m72775a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m72775a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lz2.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f97185w = new d();

        /* JADX INFO: renamed from: a */
        public final long m72776a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m72776a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final C39282o m72772a(LegalDocumentResponse legalDocumentResponse) {
        C39274g c39274g;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(legalDocumentResponse, "<this>");
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(legalDocumentResponse.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(legalDocumentResponse.getSubtitle());
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(a.f97182w);
        String leftIcon = legalDocumentResponse.getLeftIcon();
        Object c39274g2 = null;
        if (leftIcon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(""));
        } else {
            c39274g = null;
        }
        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a(b.f97183w);
        String rightIcon = legalDocumentResponse.getRightIcon();
        if (rightIcon != null) {
            EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_FORWARD;
            for (EnumC16313m0 enumC16313m3 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m3.name(), rightIcon)) {
                    c39274g2 = enumC16313m3;
                    break;
                }
            }
            if (c39274g2 != null) {
                enumC16313m2 = c39274g2;
            }
            c39274g2 = new C39274g(enumC16313m2.toWhoopIcon(), AbstractC8693b.m21278l(""));
        }
        return C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, textResourceM21278l2, interfaceC39332eM125323a, c39274g, interfaceC39332eM125323a2, c39274g2, p745y81.Function1.m125323a(c.f97184w), null, null, null, null, p745y81.Function1.m125323a(d.f97185w), AbstractC22676k.m65745e(legalDocumentResponse.getMenuItemState(), "ENABLED"), false, null, false, null, null, null, false, null, 8363526, null);
    }
}
