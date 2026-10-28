package zl0;

import bm.C3383g;
import com.whoop.bot.api.CommitSelectionApi;
import com.whoop.bot.domain.chatminiarchwidget.CommitSelectionRequestBody;
import com.whoop.bot.domain.chatminiarchwidget.CommitSelectionResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: zl0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lzl0/d;", "Lod1/g;", "Lzl0/b;", "Lzl0/c;", "Lcom/whoop/bot/api/CommitSelectionApi;", "api", "Ltr2/n;", "logger", "initialState", "<init>", "(Lcom/whoop/bot/api/CommitSelectionApi;Ltr2/n;Lzl0/c;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/bot/api/CommitSelectionApi;", "b", "Ltr2/n;", "c", "Lzl0/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40872d implements InterfaceC27844g<AbstractC40870b, C40871c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommitSelectionApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40871c initialState;

    /* JADX INFO: renamed from: zl0.d$a */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lzl0/d$a;", "", "d", "c", "b", "a", "Lzl0/d$a$a;", "Lzl0/d$a$b;", "Lzl0/d$a$c;", "Lzl0/d$a$d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zl0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzl0/d$a$a;", "Lzl0/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42761a implements a {

            /* JADX INFO: renamed from: a */
            public static final C42761a f176130a = new C42761a();

            private C42761a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C42761a);
            }

            public int hashCode() {
                return -2021265785;
            }

            public String toString() {
                return "ClearFollowup";
            }
        }

        /* JADX INFO: renamed from: zl0.d$a$b */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzl0/d$a$b;", "Lzl0/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f176131a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1819526836;
            }

            public String toString() {
                return "CommitExecute";
            }
        }

        /* JADX INFO: renamed from: zl0.d$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzl0/d$a$c;", "Lzl0/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f176132a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -163306733;
            }

            public String toString() {
                return "CommitLoading";
            }
        }

        /* JADX INFO: renamed from: zl0.d$a$d */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lzl0/d$a$d;", "Lzl0/d$a;", "", "selectionId", "", "selected", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int selectionId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean selected;

            public d(int i13, boolean z4) {
                this.selectionId = i13;
                this.selected = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getSelectionId() {
                return this.selectionId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return this.selectionId == dVar.selectionId && this.selected == dVar.selected;
            }

            public int hashCode() {
                return Boolean.hashCode(this.selected) + (Integer.hashCode(this.selectionId) * 31);
            }

            public String toString() {
                return "Toggle(selectionId=" + this.selectionId + ", selected=" + this.selected + ")";
            }
        }
    }

    /* JADX INFO: renamed from: zl0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.selectionwidget.SelectionWidgetInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SelectionWidgetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f176135w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f176136x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176137y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40870b abstractC40870b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f176136x = interfaceC13062m;
            bVar.f176137y = abstractC40870b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            InterfaceC13058l c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176135w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f176136x;
                AbstractC40870b abstractC40870b = (AbstractC40870b) this.f176137y;
                if (abstractC40870b instanceof AbstractC40870b.c) {
                    AbstractC40870b.c cVar = (AbstractC40870b.c) abstractC40870b;
                    c0456u2 = new C0456u(new a.d(cVar.getSelectionId(), cVar.getSelected()), 1);
                } else {
                    if (abstractC40870b instanceof AbstractC40870b.b) {
                        c0456u = new C3383g(new a[]{a.c.f176132a, a.b.f176131a}, 3);
                    } else {
                        if (!(abstractC40870b instanceof AbstractC40870b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(a.C42761a.f176130a, 1);
                    }
                    c0456u2 = c0456u;
                }
                this.f176136x = null;
                this.f176137y = null;
                this.f176135w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u2, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC40870b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zl0.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.selectionwidget.SelectionWidgetInteractor$interact$2", m100430f = "SelectionWidgetInteractor.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lzl0/c;", "state", "Lzl0/d$a;", "action", "<anonymous>", "(Lzl0/c;Lzl0/d$a;)Lzl0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f176138w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176139x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176140y;

        /* JADX INFO: renamed from: zl0.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.view.selectionwidget.SelectionWidgetInteractor$interact$2$result$1", m100430f = "SelectionWidgetInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/bot/domain/chatminiarchwidget/CommitSelectionResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f176142w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40872d f176143x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C40871c f176144y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40872d c40872d, C40871c c40871c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f176143x = c40872d;
                this.f176144y = c40871c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f176143x, this.f176144y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f176142w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                CommitSelectionApi commitSelectionApi = this.f176143x.api;
                String commitPath = this.f176144y.getCommitPath();
                CommitSelectionRequestBody commitSelectionRequestBody = new CommitSelectionRequestBody(this.f176144y.m132466g());
                this.f176142w = 1;
                Object objCommitSelection = commitSelectionApi.commitSelection(commitPath, commitSelectionRequestBody, this);
                return objCommitSelection == enumC31071a ? enumC31071a : objCommitSelection;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<CommitSelectionResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C40871c c40871c, a aVar, InterfaceC30057d<? super C40871c> interfaceC30057d) {
            c cVar = C40872d.this.new c(interfaceC30057d);
            cVar.f176139x = c40871c;
            cVar.f176140y = aVar;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            ArrayList arrayListM74124b1;
            C40871c c40871c = (C40871c) this.f176139x;
            a aVar = (a) this.f176140y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176138w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (aVar instanceof a.d) {
                    a.d dVar = (a.d) aVar;
                    if (dVar.getSelected()) {
                        arrayListM74124b1 = AbstractC25265s.m74128f1(new Integer(dVar.getSelectionId()), c40871c.m132466g());
                    } else {
                        arrayListM74124b1 = AbstractC25265s.m74124b1(c40871c.m132466g(), new Integer(dVar.getSelectionId()));
                    }
                    return C40871c.m132460b(c40871c, arrayListM74124b1, null, null, null, null, 30, null);
                }
                if (aVar instanceof a.c) {
                    List<Integer> listM132466g = c40871c.m132466g();
                    if (listM132466g.isEmpty()) {
                        listM132466g = c40871c.m132462c();
                    }
                    return C40871c.m132460b(c40871c, listM132466g, null, InterfaceC40869a.c.f176116a, null, null, 26, null);
                }
                if (!(aVar instanceof a.b)) {
                    if (aVar instanceof a.C42761a) {
                        return C40871c.m132460b(c40871c, null, null, null, null, null, 23, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C40872d.this.logger;
                a aVar2 = new a(C40872d.this, c40871c, null);
                this.f176139x = c40871c;
                this.f176140y = null;
                this.f176138w = 1;
                cVar = this;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar2, cVar, 6, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                cVar = this;
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                InterfaceC40869a.d dVar2 = InterfaceC40869a.d.f176117a;
                CommitSelectionResponse commitSelectionResponse = (CommitSelectionResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                return C40871c.m132460b(c40871c, null, null, dVar2, commitSelectionResponse != null ? commitSelectionResponse.getFollowupMessage() : null, null, 19, null);
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            C40872d.this.logger.mo85214e("CMAW", "Commit failed. SelectionIds: " + c40871c.m132466g() + ". " + ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), new AbstractC30556a.a[0]);
            return C40871c.m132460b(c40871c, null, null, InterfaceC40869a.a.f176114a, null, null, 27, null);
        }
    }

    public C40872d(CommitSelectionApi api, InterfaceC34116n logger, C40871c initialState) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(initialState, "initialState");
        this.api = api;
        this.logger = logger;
        this.initialState = initialState;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialState, AbstractC13091v.m36590P(upstream, new b(null)), new c(null));
    }
}
