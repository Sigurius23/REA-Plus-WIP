package ub0;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.BiomarkerUpdateItem;
import com.whoop.advancedlabs.domain.models.EditBiomarkerItem;
import com.whoop.advancedlabs.domain.models.EditBiomarkersResponse;
import com.whoop.advancedlabs.domain.models.UpdateBiomarkersRequest;
import com.whoop.advancedlabs.domain.models.UpdateBiomarkersResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25272z;
import n83.C26463f;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: ub0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000202B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0013J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u0019J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0'2\u0006\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Lub0/e;", "Lod1/g;", "Lub0/c;", "Lub0/d;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "", "Lub0/b;", "biomarkers", "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;", "s", "(Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;", "", "testId", "r", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "q", "request", "Lub0/a;", "changes", "u", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lub0/a;Lq83/d;)Ljava/lang/Object;", "n", "", "isAiConfirmation", "p", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "originalBiomarkers", "newBiomarkers", "m", "(Ljava/util/List;Ljava/util/List;)Lub0/a;", "Lub0/e$a;", "state", "o", "(Lub0/e$a;)Lub0/d;", "", "changedBiomarkerId", "Ll83/a0;", "t", "(Ljava/util/Map;Ljava/lang/String;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34740e implements InterfaceC27844g<AbstractC34738c, AbstractC34739d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ub0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lub0/e$b;", "", "<init>", "()V", "b", "c", "a", "Lub0/e$b$a;", "Lub0/e$b$b;", "Lub0/e$b$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: ub0.e$b$a */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lub0/e$b$a;", "Lub0/e$b;", "Lub0/d;", "result", "<init>", "(Lub0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lub0/d;", "()Lub0/d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC34739d result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC34739d result) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC34739d getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.result, ((a) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "DirectResult(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: ub0.e$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lub0/e$b$b;", "Lub0/e$b;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "response", "", "testId", "", "isAiConfirmation", "<init>", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "()Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42456b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final EditBiomarkersResponse response;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String testId;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean isAiConfirmation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42456b(EditBiomarkersResponse response, String testId, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                AbstractC22676k.m65750j(testId, "testId");
                this.response = response;
                this.testId = testId;
                this.isAiConfirmation = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final EditBiomarkersResponse getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getTestId() {
                return this.testId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsAiConfirmation() {
                return this.isAiConfirmation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42456b)) {
                    return false;
                }
                C42456b c42456b = (C42456b) other;
                return AbstractC22676k.m65745e(this.response, c42456b.response) && AbstractC22676k.m65745e(this.testId, c42456b.testId) && this.isAiConfirmation == c42456b.isAiConfirmation;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isAiConfirmation) + AbstractC11266d.m30450d(this.response.hashCode() * 31, 31, this.testId);
            }

            public String toString() {
                EditBiomarkersResponse editBiomarkersResponse = this.response;
                String str = this.testId;
                boolean z4 = this.isAiConfirmation;
                StringBuilder sb4 = new StringBuilder("LoadDataSuccess(response=");
                sb4.append(editBiomarkersResponse);
                sb4.append(", testId=");
                sb4.append(str);
                sb4.append(", isAiConfirmation=");
                return AbstractC18489d0.m53372m(sb4, z4, ")");
            }
        }

        /* JADX INFO: renamed from: ub0.e$b$c */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lub0/e$b$c;", "Lub0/e$b;", "Lub0/c;", "action", "<init>", "(Lub0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lub0/c;", "()Lub0/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC34738c action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC34738c action) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC34738c getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.action, ((c) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "UpdateState(action=" + this.action + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: ub0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor", m100430f = "EditBiomarkersInteractor.kt", m100431l = {277}, m100432m = "confirmBiomarkers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f146313F;

        /* JADX INFO: renamed from: w */
        Object f146314w;

        /* JADX INFO: renamed from: x */
        Object f146315x;

        /* JADX INFO: renamed from: y */
        Object f146316y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f146317z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f146317z = obj;
            this.f146313F |= Integer.MIN_VALUE;
            return C34740e.this.m109711n(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ub0.e$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$confirmBiomarkers$response$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {278}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f146318w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f146320y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ UpdateBiomarkersRequest f146321z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, UpdateBiomarkersRequest updateBiomarkersRequest, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f146320y = str;
            this.f146321z = updateBiomarkersRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34740e.this.new d(this.f146320y, this.f146321z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146318w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C34740e.this.api;
            String str = this.f146320y;
            UpdateBiomarkersRequest updateBiomarkersRequest = this.f146321z;
            this.f146318w = 1;
            Object objConfirmBiomarkers = advancedLabsApi.confirmBiomarkers(str, updateBiomarkersRequest, this);
            return objConfirmBiomarkers == enumC31071a ? enumC31071a : objConfirmBiomarkers;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UpdateBiomarkersResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ub0.e$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor", m100430f = "EditBiomarkersInteractor.kt", m100431l = {288}, m100432m = "deleteTest", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f146322E;

        /* JADX INFO: renamed from: w */
        Object f146323w;

        /* JADX INFO: renamed from: x */
        boolean f146324x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f146325y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f146325y = obj;
            this.f146322E |= Integer.MIN_VALUE;
            return C34740e.this.m109713p(null, false, this);
        }
    }

    /* JADX INFO: renamed from: ub0.e$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$deleteTest$response$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {290, 292}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f146327w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f146328x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34740e f146329y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f146330z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, C34740e c34740e, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f146328x = z4;
            this.f146329y = c34740e;
            this.f146330z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f146328x, this.f146329y, this.f146330z, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.deleteTestAi(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r5.deleteTest(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f146327w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L42
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                boolean r5 = r4.f146328x
                if (r5 == 0) goto L31
                ub0.e r5 = r4.f146329y
                com.whoop.advancedlabs.domain.AdvancedLabsApi r5 = ub0.C34740e.m109704g(r5)
                java.lang.String r1 = r4.f146330z
                r4.f146327w = r3
                java.lang.Object r5 = r5.deleteTestAi(r1, r4)
                if (r5 != r0) goto L42
                goto L41
            L31:
                ub0.e r5 = r4.f146329y
                com.whoop.advancedlabs.domain.AdvancedLabsApi r5 = ub0.C34740e.m109704g(r5)
                java.lang.String r1 = r4.f146330z
                r4.f146327w = r2
                java.lang.Object r5 = r5.deleteTest(r1, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ub0.C34740e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ub0.e$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$$inlined$flatMapLatest$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f146331w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f146332x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f146333y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34740e f146334z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C34740e c34740e) {
            super(3, interfaceC30057d);
            this.f146334z = c34740e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34738c abstractC34738c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f146334z);
            gVar.f146332x = interfaceC13062m;
            gVar.f146333y = abstractC34738c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146331w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f146332x;
                C13084s1 c13084s1 = new C13084s1(new i((AbstractC34738c) this.f146333y, this.f146334z, null));
                this.f146332x = null;
                this.f146333y = null;
                this.f146331w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC34738c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ub0.e$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$$inlined$transform$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146335w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f146336x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f146337y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34740e f146338z;

        /* JADX INFO: renamed from: ub0.e$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f146339w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34740e f146340x;

            /* JADX INFO: renamed from: ub0.e$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$$inlined$transform$1$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {47, 58, 60, 62, 65, 66, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42457a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f146341E;

                /* JADX INFO: renamed from: F */
                Object f146342F;

                /* JADX INFO: renamed from: G */
                Object f146343G;

                /* JADX INFO: renamed from: H */
                Object f146344H;

                /* JADX INFO: renamed from: I */
                Object f146345I;

                /* JADX INFO: renamed from: J */
                Object f146346J;

                /* JADX INFO: renamed from: K */
                Object f146347K;

                /* JADX INFO: renamed from: L */
                int f146348L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f146349w;

                /* JADX INFO: renamed from: x */
                int f146350x;

                /* JADX INFO: renamed from: z */
                Object f146352z;

                public C42457a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f146349w = obj;
                    this.f146350x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34740e c34740e) {
                this.f146340x = c34740e;
                this.f146339w = interfaceC13062m;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x016f, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x01af, code lost:
            
                if (r2.emit((ub0.AbstractC34739d) r10, r0) == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01cd, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01ed, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L60;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
                /*
                    Method dump skipped, instruction units count: 520
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ub0.C34740e.h.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C34740e c34740e) {
            super(2, interfaceC30057d);
            this.f146337y = interfaceC13058l;
            this.f146338z = c34740e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f146337y, interfaceC30057d, this.f146338z);
            hVar.f146336x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146335w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f146336x;
                InterfaceC13058l interfaceC13058l = this.f146337y;
                a aVar = new a(interfaceC13062m, this.f146338z);
                this.f146336x = null;
                this.f146335w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ub0.e$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$1$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {45, 48, 50, 54, 56, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lub0/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C34740e f146353E;

        /* JADX INFO: renamed from: w */
        Object f146354w;

        /* JADX INFO: renamed from: x */
        int f146355x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f146356y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC34738c f146357z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC34738c abstractC34738c, C34740e c34740e, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146357z = abstractC34738c;
            this.f146353E = c34740e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f146357z, this.f146353E, interfaceC30057d);
            iVar.f146356y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:31:0x009b  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[PHI: r2
          0x00c5: PHI (r2v12 ub0.d) = (r2v11 ub0.d), (r2v11 ub0.d), (r2v15 ub0.d) binds: [B:30:0x0099, B:32:0x00c2, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        
            if (r8 == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            if (r8 == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L39;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ub0.C34740e.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ub0.e$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$2", m100430f = "EditBiomarkersInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ll83/k;", "Lub0/e$a;", "Lub0/e$b;", "<destruct>", "internalAction", "<anonymous>", "(Ll83/k;Lub0/e$b;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f146358w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f146359x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f146360y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C23465k c23465k, b bVar, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            j jVar = C34740e.this.new j(interfaceC30057d);
            jVar.f146359x = c23465k;
            jVar.f146360y = bVar;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34737b c34737b;
            C23465k c23465k = (C23465k) this.f146359x;
            b bVar = (b) this.f146360y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f146358w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            a aVarM109719b = (a) c23465k.f92937w;
            if (bVar instanceof b.C42456b) {
                C26463f c26463f = new C26463f();
                b.C42456b c42456b = (b.C42456b) bVar;
                for (EditBiomarkerItem editBiomarkerItem : c42456b.getResponse().getItems()) {
                    String biomarkerId = editBiomarkerItem.getBiomarkerId();
                    String biomarkerId2 = editBiomarkerItem.getBiomarkerId();
                    boolean included = editBiomarkerItem.getIncluded();
                    Double value = editBiomarkerItem.getValue();
                    String unit = editBiomarkerItem.getUnit();
                    List<String> calculatedFromBiomarkers = editBiomarkerItem.getCalculatedFromBiomarkers();
                    c26463f.put(biomarkerId, new C34737b(biomarkerId2, included, value, unit, calculatedFromBiomarkers != null ? AbstractC25265s.m74103I1(calculatedFromBiomarkers) : C25235a0.f99113w));
                }
                C26463f c26463fM78380b = c26463f.m78380b();
                return new C23465k(aVarM109719b.m109720a(c26463fM78380b, c26463fM78380b, c42456b.getTestId(), c42456b.getResponse(), c42456b.getIsAiConfirmation()), bVar);
            }
            if (!(bVar instanceof b.c)) {
                if (bVar instanceof b.a) {
                    return new C23465k(aVarM109719b, bVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            b.c cVar = (b.c) bVar;
            AbstractC34738c action = cVar.getAction();
            if (action instanceof AbstractC34738c.d) {
                C34737b c34737b2 = aVarM109719b.m109721c().get(((AbstractC34738c.d) cVar.getAction()).getBiomarkerId());
                if (c34737b2 != null) {
                    LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(aVarM109719b.m109721c());
                    linkedHashMapM74003l0.put(((AbstractC34738c.d) cVar.getAction()).getBiomarkerId(), C34737b.m109681b(c34737b2, null, !c34737b2.getIncluded(), null, null, null, 29, null));
                    C34740e.this.m109717t(linkedHashMapM74003l0, ((AbstractC34738c.d) cVar.getAction()).getBiomarkerId());
                    aVarM109719b = a.m109719b(aVarM109719b, null, linkedHashMapM74003l0, null, null, false, 29, null);
                }
            } else if (action instanceof AbstractC34738c.b) {
                C34737b c34737b3 = aVarM109719b.m109721c().get(((AbstractC34738c.b) cVar.getAction()).getBiomarkerId());
                if (c34737b3 != null) {
                    LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(aVarM109719b.m109721c());
                    linkedHashMapM74003l1.put(((AbstractC34738c.b) cVar.getAction()).getBiomarkerId(), C34737b.m109681b(c34737b3, null, true, null, null, null, 29, null));
                    C34740e.this.m109717t(linkedHashMapM74003l1, ((AbstractC34738c.b) cVar.getAction()).getBiomarkerId());
                    aVarM109719b = a.m109719b(aVarM109719b, null, linkedHashMapM74003l1, null, null, false, 29, null);
                }
            } else if (action instanceof AbstractC34738c.e) {
                LinkedHashMap linkedHashMapM74003l2 = AbstractC25247g0.m74003l0(aVarM109719b.m109721c());
                for (C34737b c34737b4 : ((AbstractC34738c.e) cVar.getAction()).m109692a()) {
                    C34737b c34737b5 = (C34737b) linkedHashMapM74003l2.get(c34737b4.getBiomarkerId());
                    if (c34737b5 != null) {
                        String biomarkerId3 = c34737b4.getBiomarkerId();
                        boolean included2 = c34737b4.getIncluded();
                        Double value2 = c34737b4.getValue();
                        if (value2 == null) {
                            value2 = c34737b5.getValue();
                        }
                        Double d3 = value2;
                        String unit2 = c34737b4.getUnit();
                        if (unit2 == null) {
                            unit2 = c34737b5.getUnit();
                        }
                        linkedHashMapM74003l2.put(biomarkerId3, C34737b.m109681b(c34737b5, null, included2, d3, unit2, null, 17, null));
                    } else {
                        linkedHashMapM74003l2.put(c34737b4.getBiomarkerId(), c34737b4);
                    }
                }
                aVarM109719b = a.m109719b(aVarM109719b, null, linkedHashMapM74003l2, null, null, false, 29, null);
            } else if ((action instanceof AbstractC34738c.f) && (c34737b = aVarM109719b.m109721c().get(((AbstractC34738c.f) cVar.getAction()).getBiomarkerId())) != null) {
                LinkedHashMap linkedHashMapM74003l3 = AbstractC25247g0.m74003l0(aVarM109719b.m109721c());
                String biomarkerId4 = ((AbstractC34738c.f) cVar.getAction()).getBiomarkerId();
                Double value3 = ((AbstractC34738c.f) cVar.getAction()).getValue();
                String unit3 = ((AbstractC34738c.f) cVar.getAction()).getUnit();
                if (unit3 == null) {
                    unit3 = c34737b.getUnit();
                }
                linkedHashMapM74003l3.put(biomarkerId4, C34737b.m109681b(c34737b, null, ((AbstractC34738c.f) cVar.getAction()).getValue() != null, value3, unit3, null, 17, null));
                C34740e.this.m109717t(linkedHashMapM74003l3, ((AbstractC34738c.f) cVar.getAction()).getBiomarkerId());
                aVarM109719b = a.m109719b(aVarM109719b, null, linkedHashMapM74003l3, null, null, false, 29, null);
            }
            return new C23465k(aVarM109719b, bVar);
        }
    }

    /* JADX INFO: renamed from: ub0.e$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor", m100430f = "EditBiomarkersInteractor.kt", m100431l = {247}, m100432m = "loadConfirmBiomarkers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f146362w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f146363x;

        /* JADX INFO: renamed from: z */
        int f146365z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f146363x = obj;
            this.f146365z |= Integer.MIN_VALUE;
            return C34740e.this.m109714q(null, this);
        }
    }

    /* JADX INFO: renamed from: ub0.e$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$loadConfirmBiomarkers$response$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {248}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f146366w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f146368y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, InterfaceC30057d<? super l> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f146368y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34740e.this.new l(this.f146368y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146366w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C34740e.this.api;
            String str = this.f146368y;
            this.f146366w = 1;
            Object confirmBiomarkers = advancedLabsApi.getConfirmBiomarkers(str, this);
            return confirmBiomarkers == enumC31071a ? enumC31071a : confirmBiomarkers;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super EditBiomarkersResponse> interfaceC30057d) {
            return ((l) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ub0.e$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor", m100430f = "EditBiomarkersInteractor.kt", m100431l = {236}, m100432m = "loadEditBiomarkers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f146369w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f146370x;

        /* JADX INFO: renamed from: z */
        int f146372z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f146370x = obj;
            this.f146372z |= Integer.MIN_VALUE;
            return C34740e.this.m109715r(null, this);
        }
    }

    /* JADX INFO: renamed from: ub0.e$n */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$loadEditBiomarkers$response$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {237}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f146373w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f146375y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, InterfaceC30057d<? super n> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f146375y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34740e.this.new n(this.f146375y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146373w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C34740e.this.api;
            String str = this.f146375y;
            this.f146373w = 1;
            Object editBiomarkers = advancedLabsApi.getEditBiomarkers(str, this);
            return editBiomarkers == enumC31071a ? enumC31071a : editBiomarkers;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super EditBiomarkersResponse> interfaceC30057d) {
            return ((n) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ub0.e$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor", m100430f = "EditBiomarkersInteractor.kt", m100431l = {262}, m100432m = "updateBiomarkers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f146377F;

        /* JADX INFO: renamed from: w */
        Object f146378w;

        /* JADX INFO: renamed from: x */
        Object f146379x;

        /* JADX INFO: renamed from: y */
        Object f146380y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f146381z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f146381z = obj;
            this.f146377F |= Integer.MIN_VALUE;
            return C34740e.this.m109718u(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ub0.e$p */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$updateBiomarkers$response$1", m100430f = "EditBiomarkersInteractor.kt", m100431l = {263}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f146382w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f146384y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ UpdateBiomarkersRequest f146385z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, UpdateBiomarkersRequest updateBiomarkersRequest, InterfaceC30057d<? super p> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f146384y = str;
            this.f146385z = updateBiomarkersRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34740e.this.new p(this.f146384y, this.f146385z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f146382w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C34740e.this.api;
            String str = this.f146384y;
            UpdateBiomarkersRequest updateBiomarkersRequest = this.f146385z;
            this.f146382w = 1;
            Object objUpdateBiomarkers = advancedLabsApi.updateBiomarkers(str, updateBiomarkersRequest, this);
            return objUpdateBiomarkers == enumC31071a ? enumC31071a : objUpdateBiomarkers;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UpdateBiomarkersResponse> interfaceC30057d) {
            return ((p) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C34740e(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C34736a m109710m(List<C34737b> originalBiomarkers, List<C34737b> newBiomarkers) {
        List<C34737b> list = originalBiomarkers;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((C34737b) obj).getBiomarkerId(), obj);
        }
        List<C34737b> list2 = newBiomarkers;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Object obj2 : list2) {
            linkedHashMap2.put(((C34737b) obj2).getBiomarkerId(), obj2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : AbstractC25265s.m74159y0(AbstractC12350b.m34556E(linkedHashMap.keySet(), linkedHashMap2.keySet()))) {
            C34737b c34737b = (C34737b) linkedHashMap.get(str);
            C34737b c34737b2 = (C34737b) linkedHashMap2.get(str);
            if (c34737b != null && c34737b2 != null) {
                boolean included = c34737b.getIncluded();
                boolean included2 = c34737b2.getIncluded();
                boolean zM65742b = AbstractC22676k.m65742b(c34737b.getValue(), c34737b2.getValue());
                if (!included && included2) {
                    arrayList.add(c34737b2.getBiomarkerId());
                } else if (included && !included2) {
                    arrayList2.add(c34737b2.getBiomarkerId());
                } else if (included && included2 && !zM65742b) {
                    arrayList3.add(c34737b2.getBiomarkerId());
                }
            } else if (c34737b != null || c34737b2 == null) {
                if (c34737b != null && c34737b2 == null && c34737b.getIncluded()) {
                    arrayList2.add(c34737b.getBiomarkerId());
                }
            } else if (c34737b2.getIncluded()) {
                arrayList.add(c34737b2.getBiomarkerId());
            }
        }
        return new C34736a(arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m109711n(String str, UpdateBiomarkersRequest updateBiomarkersRequest, C34736a c34736a, InterfaceC30057d<? super AbstractC34739d> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f146313F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f146313F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f146317z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f146313F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, updateBiomarkersRequest, null);
            cVar2.f146314w = null;
            cVar2.f146315x = null;
            cVar2.f146316y = c34736a;
            cVar2.f146313F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to confirm biomarkers", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c34736a = (C34736a) cVar2.f146316y;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC34739d.e(c34736a, ((UpdateBiomarkersResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDestination());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34739d.b.f146294a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC34739d m109712o(a state) {
        EditBiomarkersResponse latestResponse = state.getLatestResponse();
        if (latestResponse == null) {
            return AbstractC34739d.b.f146294a;
        }
        List<EditBiomarkerItem> items = latestResponse.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (EditBiomarkerItem editBiomarkerItemCopy$default : items) {
            C34737b c34737b = state.m109721c().get(editBiomarkerItemCopy$default.getBiomarkerId());
            if (c34737b != null) {
                editBiomarkerItemCopy$default = EditBiomarkerItem.copy$default(editBiomarkerItemCopy$default, null, null, null, c34737b.getValue(), null, c34737b.getUnit(), c34737b.getIncluded(), 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, 262039, null);
            }
            arrayList.add(editBiomarkerItemCopy$default);
        }
        return new AbstractC34739d.d(EditBiomarkersResponse.copy$default(latestResponse, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, 8159, null), state.getIsAiConfirmation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m109713p(String str, boolean z4, InterfaceC30057d<? super AbstractC34739d> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f146322E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f146322E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f146325y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f146322E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(z4, this, str, null);
            eVar2.f146323w = null;
            eVar2.f146324x = z4;
            eVar2.f146322E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to delete test", fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC34739d.a.f146293a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34739d.b.f146294a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m109714q(String str, InterfaceC30057d<? super AbstractC34739d> interfaceC30057d) {
        k kVar;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f146365z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f146365z = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objM108729b = kVar2.f146363x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar2.f146365z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            l lVar = new l(str, null);
            kVar2.f146362w = null;
            kVar2.f146365z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load confirm biomarkers", lVar, kVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC34739d.d((EditBiomarkersResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), true);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34739d.b.f146294a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m109715r(String str, InterfaceC30057d<? super AbstractC34739d> interfaceC30057d) {
        m mVar;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f146372z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f146372z = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        m mVar2 = mVar;
        Object objM108729b = mVar2.f146370x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar2.f146372z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            n nVar = new n(str, null);
            mVar2.f146369w = null;
            mVar2.f146372z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load edit biomarkers", nVar, mVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC34739d.d((EditBiomarkersResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34739d.b.f146294a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final UpdateBiomarkersRequest m109716s(List<C34737b> biomarkers) {
        List<C34737b> list = biomarkers;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C34737b c34737b : list) {
            arrayList.add(new BiomarkerUpdateItem(c34737b.getBiomarkerId(), c34737b.getIncluded(), c34737b.getValue(), c34737b.getUnit()));
        }
        return new UpdateBiomarkersRequest(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m109717t(Map<String, C34737b> map, String str) {
        Collection<C34737b> collectionValues = map.values();
        ArrayList<C34737b> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C34737b) obj).m109684d().contains(str)) {
                arrayList.add(obj);
            }
        }
        for (C34737b c34737b : arrayList) {
            Set<String> setM109684d = c34737b.m109684d();
            boolean z4 = true;
            if (!(setM109684d instanceof Collection) || !setM109684d.isEmpty()) {
                Iterator<T> it = setM109684d.iterator();
                while (it.hasNext()) {
                    C34737b c34737b2 = map.get((String) it.next());
                    if (c34737b2 == null || !c34737b2.getIncluded()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (c34737b.getIncluded() != z4) {
                map.put(c34737b.getBiomarkerId(), C34737b.m109681b(c34737b, null, z4, null, null, null, 29, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: u */
    public final Object m109718u(String str, UpdateBiomarkersRequest updateBiomarkersRequest, C34736a c34736a, InterfaceC30057d<? super AbstractC34739d> interfaceC30057d) {
        o oVar;
        if (interfaceC30057d instanceof o) {
            oVar = (o) interfaceC30057d;
            int i13 = oVar.f146377F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oVar.f146377F = i13 - Integer.MIN_VALUE;
            } else {
                oVar = new o(interfaceC30057d);
            }
        } else {
            oVar = new o(interfaceC30057d);
        }
        o oVar2 = oVar;
        Object objM108729b = oVar2.f146381z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = oVar2.f146377F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            p pVar = new p(str, updateBiomarkersRequest, null);
            oVar2.f146378w = null;
            oVar2.f146379x = null;
            oVar2.f146380y = c34736a;
            oVar2.f146377F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to update biomarkers", pVar, oVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c34736a = (C34736a) oVar2.f146380y;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC34739d.e(c34736a, ((UpdateBiomarkersResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getDestination());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC34739d.b.f146294a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new h(new C13060l1(new C23465k(new a(null, null, null, null, false, 31, null), new b.a(AbstractC34739d.c.f146295a)), AbstractC13091v.m36590P(upstream, new g(null, this)), new j(null)), null, this));
    }

    public /* synthetic */ C34740e(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EditBiomarkersInteractor") : interfaceC34116n);
    }

    /* JADX INFO: renamed from: ub0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001BS\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lub0/e$a;", "", "", "", "Lub0/b;", "initialBiomarkersMap", "biomarkersMap", "currentTestId", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "latestResponse", "", "isAiConfirmation", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)V", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lub0/e$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "b", "c", "Ljava/lang/String;", "d", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "f", "()Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "Z", "g", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, C34737b> initialBiomarkersMap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, C34737b> biomarkersMap;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String currentTestId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EditBiomarkersResponse latestResponse;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isAiConfirmation;

        public a(Map<String, C34737b> initialBiomarkersMap, Map<String, C34737b> biomarkersMap, String currentTestId, EditBiomarkersResponse editBiomarkersResponse, boolean z4) {
            AbstractC22676k.m65750j(initialBiomarkersMap, "initialBiomarkersMap");
            AbstractC22676k.m65750j(biomarkersMap, "biomarkersMap");
            AbstractC22676k.m65750j(currentTestId, "currentTestId");
            this.initialBiomarkersMap = initialBiomarkersMap;
            this.biomarkersMap = biomarkersMap;
            this.currentTestId = currentTestId;
            this.latestResponse = editBiomarkersResponse;
            this.isAiConfirmation = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m109719b(a aVar, Map map, Map map2, String str, EditBiomarkersResponse editBiomarkersResponse, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = aVar.initialBiomarkersMap;
            }
            if ((i13 & 2) != 0) {
                map2 = aVar.biomarkersMap;
            }
            if ((i13 & 4) != 0) {
                str = aVar.currentTestId;
            }
            if ((i13 & 8) != 0) {
                editBiomarkersResponse = aVar.latestResponse;
            }
            if ((i13 & 16) != 0) {
                z4 = aVar.isAiConfirmation;
            }
            boolean z13 = z4;
            String str2 = str;
            return aVar.m109720a(map, map2, str2, editBiomarkersResponse, z13);
        }

        /* JADX INFO: renamed from: a */
        public final a m109720a(Map<String, C34737b> initialBiomarkersMap, Map<String, C34737b> biomarkersMap, String currentTestId, EditBiomarkersResponse latestResponse, boolean isAiConfirmation) {
            AbstractC22676k.m65750j(initialBiomarkersMap, "initialBiomarkersMap");
            AbstractC22676k.m65750j(biomarkersMap, "biomarkersMap");
            AbstractC22676k.m65750j(currentTestId, "currentTestId");
            return new a(initialBiomarkersMap, biomarkersMap, currentTestId, latestResponse, isAiConfirmation);
        }

        /* JADX INFO: renamed from: c */
        public final Map<String, C34737b> m109721c() {
            return this.biomarkersMap;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCurrentTestId() {
            return this.currentTestId;
        }

        /* JADX INFO: renamed from: e */
        public final Map<String, C34737b> m109723e() {
            return this.initialBiomarkersMap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.initialBiomarkersMap, aVar.initialBiomarkersMap) && AbstractC22676k.m65745e(this.biomarkersMap, aVar.biomarkersMap) && AbstractC22676k.m65745e(this.currentTestId, aVar.currentTestId) && AbstractC22676k.m65745e(this.latestResponse, aVar.latestResponse) && this.isAiConfirmation == aVar.isAiConfirmation;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EditBiomarkersResponse getLatestResponse() {
            return this.latestResponse;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsAiConfirmation() {
            return this.isAiConfirmation;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.biomarkersMap, this.initialBiomarkersMap.hashCode() * 31, 31), 31, this.currentTestId);
            EditBiomarkersResponse editBiomarkersResponse = this.latestResponse;
            return Boolean.hashCode(this.isAiConfirmation) + ((iM30450d + (editBiomarkersResponse == null ? 0 : editBiomarkersResponse.hashCode())) * 31);
        }

        public String toString() {
            Map<String, C34737b> map = this.initialBiomarkersMap;
            Map<String, C34737b> map2 = this.biomarkersMap;
            String str = this.currentTestId;
            EditBiomarkersResponse editBiomarkersResponse = this.latestResponse;
            boolean z4 = this.isAiConfirmation;
            StringBuilder sb4 = new StringBuilder("EditBiomarkersState(initialBiomarkersMap=");
            sb4.append(map);
            sb4.append(", biomarkersMap=");
            sb4.append(map2);
            sb4.append(", currentTestId=");
            sb4.append(str);
            sb4.append(", latestResponse=");
            sb4.append(editBiomarkersResponse);
            sb4.append(", isAiConfirmation=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(Map map, Map map2, String str, EditBiomarkersResponse editBiomarkersResponse, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            int i14 = i13 & 1;
            C25272z c25272z = C25272z.f99163w;
            this(i14 != 0 ? c25272z : map, (i13 & 2) != 0 ? c25272z : map2, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : editBiomarkersResponse, (i13 & 16) != 0 ? false : z4);
        }
    }
}
