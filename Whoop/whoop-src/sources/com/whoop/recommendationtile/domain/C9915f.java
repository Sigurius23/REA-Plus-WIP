package com.whoop.recommendationtile.domain;

import c93.InterfaceC4351m;
import ck1.C4780c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.whoopaction.domain.models.RequestExtensionsKt;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import i31.C18052g;
import io.ktor.client.call.NoTransformationFoundException;
import io.ktor.serialization.ContentConvertException;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import jb1.C21535a;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sy0.C33082e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import w53.C36845b;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010!\u001a\u0004\u0018\u00010 *\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\u0004\u0018\u00010.*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/f;", "Lod1/g;", "Lcom/whoop/recommendationtile/domain/d;", "Lcom/whoop/recommendationtile/domain/e;", "Li31/g;", "seed", "Lu02/c;", "apiClient", "Ljb1/a;", "designItemReducer", "Ltr2/n;", "logger", "<init>", "(Li31/g;Lu02/c;Ljb1/a;Ltr2/n;)V", "state", "header", "k", "(Lcom/whoop/recommendationtile/domain/e;Li31/g;)Lcom/whoop/recommendationtile/domain/e;", "q", "(Lcom/whoop/recommendationtile/domain/e;)Lcom/whoop/recommendationtile/domain/e;", "m", "", "isToggled", "r", "(Li31/g;Z)Li31/g;", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "action", "Lec3/l;", "Lcom/whoop/recommendationtile/domain/f$a;", "l", "(Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lec3/l;", "Lf63/c;", "Lcom/whoop/design/models/DesignSystemModel;", "o", "(Lf63/c;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Li31/g;", "b", "Lu02/c;", "c", "Ljb1/a;", "d", "Ltr2/n;", "Lsy0/e;", "n", "(Li31/g;)Lsy0/e;", "completionCheckbox", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9915f implements InterfaceC27844g<InterfaceC9913d, C9914e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18052g seed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$a */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/f$a;", "", "c", "b", "a", "d", "Lcom/whoop/recommendationtile/domain/f$a$a;", "Lcom/whoop/recommendationtile/domain/f$a$b;", "Lcom/whoop/recommendationtile/domain/f$a$c;", "Lcom/whoop/recommendationtile/domain/f$a$d;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/f$a$a;", "Lcom/whoop/recommendationtile/domain/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41404a implements a {

            /* JADX INFO: renamed from: a */
            public static final C41404a f29275a = new C41404a();

            private C41404a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C41404a);
            }

            public int hashCode() {
                return 763991400;
            }

            public String toString() {
                return "CompletionFailed";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/f$a$b;", "Lcom/whoop/recommendationtile/domain/f$a;", "Li31/g;", "header", "<init>", "(Li31/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li31/g;", "()Li31/g;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C18052g header;

            public b(C18052g c18052g) {
                this.header = c18052g;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C18052g getHeader() {
                return this.header;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.header, ((b) other).header);
            }

            public int hashCode() {
                C18052g c18052g = this.header;
                if (c18052g == null) {
                    return 0;
                }
                return c18052g.hashCode();
            }

            public String toString() {
                return "CompletionFinished(header=" + this.header + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/f$a$c;", "Lcom/whoop/recommendationtile/domain/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f29277a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1398301878;
            }

            public String toString() {
                return "CompletionStarted";
            }
        }

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$a$d */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/f$a$d;", "Lcom/whoop/recommendationtile/domain/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a */
            public static final d f29278a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1395368304;
            }

            public String toString() {
                return "ErrorDismissed";
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractor$complete$1", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {89, 90, 94, 97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/recommendationtile/domain/f$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ UpdateAction f29279E;

        /* JADX INFO: renamed from: w */
        Object f29280w;

        /* JADX INFO: renamed from: x */
        int f29281x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f29282y;

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractor$complete$1$apiResult$1", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {91, 91}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/DesignSystemModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            Object f29284w;

            /* JADX INFO: renamed from: x */
            int f29285x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C9915f f29286y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ UpdateAction f29287z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C9915f c9915f, UpdateAction updateAction, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f29286y = c9915f;
                this.f29287z = updateAction;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f29286y, this.f29287z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C9915f c9915f;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29285x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c9915f = this.f29286y;
                    C34387c c34387c = c9915f.apiClient;
                    InterfaceC39944a actionApiRequest$default = RequestExtensionsKt.toActionApiRequest$default(this.f29287z.getRequest(), null, 1, null);
                    InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(String.class);
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                    this.f29284w = c9915f;
                    this.f29285x = 1;
                    obj = c34387c.m108748d(actionApiRequest$default, c32236aM44445Y, this);
                    if (obj != enumC31071a) {
                    }
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                c9915f = (C9915f) this.f29284w;
                AbstractC34132o.m107864I(obj);
                this.f29284w = null;
                this.f29285x = 2;
                Object objM24329o = c9915f.m24329o((AbstractC14155c) obj, this);
                return objM24329o == enumC31071a ? enumC31071a : objM24329o;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super DesignSystemModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UpdateAction updateAction, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29279E = updateAction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C9915f.this.new b(this.f29279E, interfaceC30057d);
            bVar.f29282y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0077  */
        /* JADX WARN: Code duplicated, block: B:25:0x0082  */
        /* JADX WARN: Code duplicated, block: B:28:0x0087  */
        /* JADX WARN: Code duplicated, block: B:29:0x008a  */
        /* JADX WARN: Code duplicated, block: B:33:0x009d  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f29282y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f29281x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f29280w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto Lb0
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L67
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L44
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                com.whoop.recommendationtile.domain.f$a$c r0 = com.whoop.recommendationtile.domain.C9915f.a.c.f29277a
                r13.f29282y = r8
                r13.f29281x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L44
                goto Laf
            L44:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                com.whoop.recommendationtile.domain.f r2 = com.whoop.recommendationtile.domain.C9915f.this
                tr2.n r2 = com.whoop.recommendationtile.domain.C9915f.m24322h(r2)
                com.whoop.recommendationtile.domain.f$b$a r4 = new com.whoop.recommendationtile.domain.f$b$a
                com.whoop.recommendationtile.domain.f r3 = com.whoop.recommendationtile.domain.C9915f.this
                com.whoop.whoopaction.domain.models.UpdateAction r6 = r13.f29279E
                r4.<init>(r3, r6, r12)
                r13.f29282y = r8
                r13.f29281x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "RecommendationTileHeader completion failed"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L67
                goto Laf
            L67:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L9d
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.design.models.DesignSystemModel r0 = (com.whoop.design.models.DesignSystemModel) r0
                if (r0 == 0) goto L82
                com.whoop.recommendationtile.domain.f r1 = com.whoop.recommendationtile.domain.C9915f.this
                jb1.a r1 = com.whoop.recommendationtile.domain.C9915f.m24321g(r1)
                m91.u r0 = r1.m60544l(r0)
                goto L83
            L82:
                r0 = r12
            L83:
                boolean r1 = r0 instanceof i31.C18052g
                if (r1 == 0) goto L8a
                i31.g r0 = (i31.C18052g) r0
                goto L8b
            L8a:
                r0 = r12
            L8b:
                com.whoop.recommendationtile.domain.f$a$b r1 = new com.whoop.recommendationtile.domain.f$a$b
                r1.<init>(r0)
                r13.f29282y = r12
                r13.f29280w = r12
                r13.f29281x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto Lb0
                goto Laf
            L9d:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Lb3
                com.whoop.recommendationtile.domain.f$a$a r0 = com.whoop.recommendationtile.domain.C9915f.a.C41404a.f29275a
                r13.f29282y = r12
                r13.f29280w = r12
                r13.f29281x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto Lb0
            Laf:
                return r9
            Lb0:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lb3:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.recommendationtile.domain.C9915f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractor$complete$2", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/recommendationtile/domain/f$a;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f29288w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f29289x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29290y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = C9915f.this.new c(interfaceC30057d);
            cVar.f29289x = interfaceC13062m;
            cVar.f29290y = th3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f29289x;
            Throwable th3 = (Throwable) this.f29290y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29288w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C9915f.this.logger.mo85230v("RecommendationTileHeader completion failed unexpectedly", th3, new AbstractC30556a.a[0]);
                a.C41404a c41404a = a.C41404a.f29275a;
                this.f29289x = null;
                this.f29290y = null;
                this.f29288w = 1;
                if (interfaceC13062m.emit(c41404a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractor", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {124}, m100432m = "headerModel", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f29293F;

        /* JADX INFO: renamed from: w */
        Object f29294w;

        /* JADX INFO: renamed from: x */
        Object f29295x;

        /* JADX INFO: renamed from: y */
        int f29296y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f29297z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29297z = obj;
            this.f29293F |= Integer.MIN_VALUE;
            return C9915f.this.m24329o(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractor$interact$2", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/e;", "state", "Lcom/whoop/recommendationtile/domain/f$a;", "result", "<anonymous>", "(Lcom/whoop/recommendationtile/domain/e;Lcom/whoop/recommendationtile/domain/f$a;)Lcom/whoop/recommendationtile/domain/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f29298w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f29299x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29300y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C9914e c9914e, a aVar, InterfaceC30057d<? super C9914e> interfaceC30057d) {
            e eVar = C9915f.this.new e(interfaceC30057d);
            eVar.f29299x = c9914e;
            eVar.f29300y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C9914e c9914eM24325k;
            C9914e c9914e = (C9914e) this.f29299x;
            a aVar = (a) this.f29300y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f29298w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.c) {
                return C9915f.this.m24331q(c9914e);
            }
            if (!(aVar instanceof a.b)) {
                if (aVar instanceof a.C41404a) {
                    return C9915f.this.m24327m(c9914e);
                }
                if (aVar instanceof a.d) {
                    return C9914e.m24312b(c9914e, null, false, null, 5, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            C18052g header = ((a.b) aVar).getHeader();
            if (header != null) {
                if (!AbstractC22676k.m65745e(header.getId(), c9914e.getHeader().getId())) {
                    header = null;
                }
                if (header != null && (c9914eM24325k = C9915f.this.m24325k(c9914e, header)) != null) {
                    return c9914eM24325k;
                }
            }
            return C9914e.m24312b(c9914e, null, false, null, 1, null);
        }
    }

    public C9915f(C18052g seed, C34387c apiClient, C21535a designItemReducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(seed, "seed");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.seed = seed;
        this.apiClient = apiClient;
        this.designItemReducer = designItemReducer;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C9914e m24325k(C9914e state, C18052g header) {
        return state.m24313a(header, false, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m24326l(UpdateAction action) {
        return new C13015a0(new C13084s1(new b(action, null)), new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    /* JADX INFO: renamed from: m */
    public final C9914e m24327m(C9914e state) {
        C18052g header;
        Boolean checkboxValueBeforeCompletion = state.getCheckboxValueBeforeCompletion();
        if (checkboxValueBeforeCompletion != null) {
            header = m24332r(state.getHeader(), checkboxValueBeforeCompletion.booleanValue());
            if (header == null) {
                header = state.getHeader();
            }
        } else {
            header = state.getHeader();
        }
        return state.m24313a(header, true, null);
    }

    /* JADX INFO: renamed from: n */
    private final C33082e m24328n(C18052g c18052g) {
        InterfaceC25312u trailing = c18052g.getTrailing();
        if (trailing instanceof C33082e) {
            return (C33082e) trailing;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: o */
    public final Object m24329o(AbstractC14155c abstractC14155c, InterfaceC30057d<? super DesignSystemModel> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f29293F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f29293F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM118137a = dVar.f29297z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f29293F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM118137a);
                C36845b c36845bMo13321a = abstractC14155c.mo13321a();
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(DesignSystemModel.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                dVar.f29294w = null;
                dVar.f29295x = null;
                dVar.f29296y = 0;
                dVar.f29293F = 1;
                objM118137a = c36845bMo13321a.m118137a(c32236aM44445Y, dVar);
                if (objM118137a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM118137a);
            }
            return (DesignSystemModel) objM118137a;
        } catch (NoTransformationFoundException e5) {
            this.logger.mo85213c("RecommendationTileHeader completion response had no decodable body", e5, new AbstractC30556a.a[0]);
            return null;
        } catch (ContentConvertException e13) {
            this.logger.mo85213c("RecommendationTileHeader completion response could not be decoded", e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC13058l m24330p(C9915f c9915f, InterfaceC9913d action) {
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof InterfaceC9913d.b) {
            return new C0456u(a.d.f29278a, 1);
        }
        if (action instanceof InterfaceC9913d.a) {
            return c9915f.m24326l(((InterfaceC9913d.a) action).getAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX INFO: renamed from: q */
    public final C9914e m24331q(C9914e state) {
        C18052g header;
        C33082e c33082eM24328n = m24328n(state.getHeader());
        Boolean boolValueOf = c33082eM24328n != null ? Boolean.valueOf(c33082eM24328n.getIsToggled()) : null;
        if (boolValueOf != null) {
            header = m24332r(state.getHeader(), !boolValueOf.booleanValue());
            if (header == null) {
                header = state.getHeader();
            }
        } else {
            header = state.getHeader();
        }
        return state.m24313a(header, false, boolValueOf);
    }

    /* JADX INFO: renamed from: r */
    private final C18052g m24332r(C18052g c18052g, boolean z4) {
        C18052g c18052gM51840b;
        C33082e c33082eM24328n = m24328n(c18052g);
        return (c33082eM24328n == null || (c18052gM51840b = C18052g.m51840b(c18052g, null, null, null, null, null, null, C33082e.m104796b(c33082eM24328n, null, null, z4, null, null, null, null, 123, null), null, false, false, null, 1983, null)) == null) ? c18052g : c18052gM51840b;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C9914e(this.seed, false, null, 6, null), AbstractC9916g.m24336b(upstream, new C4780c(this, 8)), new e(null));
    }

    public /* synthetic */ C9915f(C18052g c18052g, C34387c c34387c, C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18052g, c34387c, (i13 & 4) != 0 ? new C21535a(null, null, 3, null) : c21535a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RecommendationTileHeaderInteractor") : interfaceC34116n);
    }
}
