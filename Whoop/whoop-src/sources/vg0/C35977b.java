package vg0;

import android.content.Context;
import android.net.Uri;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiChatImageUploadResponse;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.models.AttachmentType;
import ec3.AbstractC13091v;
import ec3.AbstractC13095w0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.C31381b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.C34820i0;
import wb3.AbstractC37056f;
import xg0.C38271c;

/* JADX INFO: renamed from: vg0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lvg0/b;", "Lod1/g;", "Lvg0/a;", "", "Lxg0/c;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Landroid/content/Context;", "context", "Lrg0/b;", "analyticsHelper", "Ltr2/n;", "logger", "Lbc3/z;", "dispatcher", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Landroid/content/Context;Lrg0/b;Ltr2/n;Lbc3/z;)V", "Lvg0/a$b;", "action", "Lec3/l;", "l", "(Lvg0/a$b;)Lec3/l;", "Landroid/net/Uri;", "uri", "", "displayName", "fingerprint", "", "fileSizeBytes", "j", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;J)Lec3/l;", "fileId", "Ll83/a0;", "k", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Landroid/content/Context;", "c", "Lrg0/b;", "d", "Ltr2/n;", "e", "Lbc3/z;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35977b implements InterfaceC27844g<AbstractC35974a, List<? extends C38271c>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: vg0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$interact$1", m100430f = "AiChatFileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lvg0/a;", "action", "Lec3/l;", "", "Lxg0/c;", "<anonymous>", "(Lvg0/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153203w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153204x;

        /* JADX INFO: renamed from: vg0.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$interact$1$1", m100430f = "AiChatFileInteractor.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Lxg0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42532a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f153206w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35977b f153207x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC35974a f153208y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42532a(C35977b c35977b, AbstractC35974a abstractC35974a, InterfaceC30057d<? super C42532a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f153207x = c35977b;
                this.f153208y = abstractC35974a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42532a(this.f153207x, this.f153208y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42532a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153206w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C35977b c35977b = this.f153207x;
                    String fileId = ((AbstractC35974a.a) this.f153208y).getFileId();
                    this.f153206w = 1;
                    if (c35977b.m114234k(fileId, this) == enumC31071a) {
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

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C35977b.this.new a(interfaceC30057d);
            aVar.f153204x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC35974a abstractC35974a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((a) create(abstractC35974a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC35974a abstractC35974a = (AbstractC35974a) this.f153204x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153203w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC35974a instanceof AbstractC35974a.b) {
                return C35977b.this.m114235l((AbstractC35974a.b) abstractC35974a);
            }
            if (abstractC35974a instanceof AbstractC35974a.a) {
                return new C13084s1(new C42532a(C35977b.this, abstractC35974a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: vg0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$performUpload$1", m100430f = "AiChatFileInteractor.kt", m100431l = {97, 112, 121, 142, 148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxg0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f153209E;

        /* JADX INFO: renamed from: F */
        Object f153210F;

        /* JADX INFO: renamed from: G */
        Object f153211G;

        /* JADX INFO: renamed from: H */
        int f153212H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f153213I;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ Uri f153215K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ String f153216L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ String f153217M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ long f153218N;

        /* JADX INFO: renamed from: w */
        Object f153219w;

        /* JADX INFO: renamed from: x */
        Object f153220x;

        /* JADX INFO: renamed from: y */
        Object f153221y;

        /* JADX INFO: renamed from: z */
        Object f153222z;

        /* JADX INFO: renamed from: vg0.b$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$performUpload$1$response$1", m100430f = "AiChatFileInteractor.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153223w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35977b f153224x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C34820i0 f153225y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C34820i0 f153226z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35977b c35977b, C34820i0 c34820i0, C34820i0 c34820i1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153224x = c35977b;
                this.f153225y = c34820i0;
                this.f153226z = c34820i1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153224x, this.f153225y, this.f153226z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153223w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153224x.api;
                C34820i0 c34820i0 = this.f153225y;
                C34820i0 c34820i1 = this.f153226z;
                this.f153223w = 1;
                Object objUploadFile = aiChatApi.uploadFile(c34820i0, c34820i1, this);
                return objUploadFile == enumC31071a ? enumC31071a : objUploadFile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<AiChatImageUploadResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, String str, String str2, long j7, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153215K = uri;
            this.f153216L = str;
            this.f153217M = str2;
            this.f153218N = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C35977b.this.new b(this.f153215K, this.f153216L, this.f153217M, this.f153218N, interfaceC30057d);
            bVar.f153213I = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0282, code lost:
        
            if (r8.emit(r16, r28) == r9) goto L56;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 648
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vg0.C35977b.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vg0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor", m100430f = "AiChatFileInteractor.kt", m100431l = {154}, m100432m = "removeFile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f153228F;

        /* JADX INFO: renamed from: w */
        Object f153229w;

        /* JADX INFO: renamed from: x */
        Object f153230x;

        /* JADX INFO: renamed from: y */
        int f153231y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f153232z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153232z = obj;
            this.f153228F |= Integer.MIN_VALUE;
            return C35977b.this.m114234k(null, this);
        }
    }

    /* JADX INFO: renamed from: vg0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$removeFile$2$response$1", m100430f = "AiChatFileInteractor.kt", m100431l = {154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f153233w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f153235y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f153235y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35977b.this.new d(this.f153235y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153233w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AiChatApi aiChatApi = C35977b.this.api;
            String str = this.f153235y;
            this.f153233w = 1;
            Object objDeleteFile = aiChatApi.deleteFile(str, this);
            return objDeleteFile == enumC31071a ? enumC31071a : objDeleteFile;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vg0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$uploadFiles$1", m100430f = "AiChatFileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "index", "Lec3/l;", "Lxg0/c;", "<anonymous>", "(I)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153236w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ int f153237x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35974a.b f153239z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC35974a.b bVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153239z = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C35977b.this.new e(this.f153239z, interfaceC30057d);
            eVar.f153237x = ((Number) obj).intValue();
            return eVar;
        }

        public final Object invoke(int i13, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((e) create(Integer.valueOf(i13), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13 = this.f153237x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153236w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C35977b c35977b = C35977b.this;
            Uri uri = this.f153239z.m114215d().get(i13);
            List<String> listM114212a = this.f153239z.m114212a();
            String str = (i13 < 0 || i13 >= listM114212a.size()) ? "" : listM114212a.get(i13);
            String fingerprint = this.f153239z.getFingerprint();
            List<Long> listM114213b = this.f153239z.m114213b();
            return c35977b.m114233j(uri, str, fingerprint, ((i13 < 0 || i13 >= listM114213b.size()) ? new Long(0L) : listM114213b.get(i13)).longValue());
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC30057d<? super InterfaceC13058l>) obj2);
        }
    }

    /* JADX INFO: renamed from: vg0.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$uploadFiles$2", m100430f = "AiChatFileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lxg0/c;", "currentList", "updatedModel", "<anonymous>", "(Ljava/util/List;Lxg0/c;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153240w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153241x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153242y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<C38271c> list, C38271c c38271c, InterfaceC30057d<? super List<C38271c>> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f153241x = list;
            fVar.f153242y = c38271c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f153241x;
            C38271c c38271c = (C38271c) this.f153242y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153240w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<C38271c> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C38271c c38271c2 : list2) {
                if (AbstractC22676k.m65745e(c38271c2.getUri(), c38271c.getUri())) {
                    c38271c2 = c38271c;
                }
                arrayList.add(c38271c2);
            }
            return arrayList;
        }
    }

    public C35977b(AiChatApi api, Context context, C31381b analyticsHelper, InterfaceC34116n logger, AbstractC3076z dispatcher) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.api = api;
        this.context = context;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
        this.dispatcher = dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m114233j(Uri uri, String displayName, String fingerprint, long fileSizeBytes) {
        return new C13084s1(new b(uri, displayName, fingerprint, fileSizeBytes, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m114234k(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f153228F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f153228F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f153232z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f153228F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (str != null) {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                d dVar = new d(str, null);
                cVar2.f153229w = null;
                cVar2.f153230x = null;
                cVar2.f153231y = 0;
                cVar2.f153228F = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.analyticsHelper.m96621b((InterfaceC34385a.b) interfaceC34385a, "remove_file");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m114235l(AbstractC35974a.b action) {
        List<Uri> listM114215d = action.m114215d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM114215d, 10));
        int i13 = 0;
        for (Object obj : listM114215d) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            Uri uri = (Uri) obj;
            AttachmentType attachmentType = AttachmentType.PDF;
            List<String> listM114212a = action.m114212a();
            String str = (i13 < 0 || i13 >= listM114212a.size()) ? "" : listM114212a.get(i13);
            List<Long> listM114213b = action.m114213b();
            arrayList.add(new C38271c(attachmentType, true, false, uri, str, null, ((i13 < 0 || i13 >= listM114213b.size()) ? 0L : listM114213b.get(i13)).longValue(), null, 164, null));
            i13 = i14;
        }
        return AbstractC13091v.m36580F(new C13060l1(arrayList, AbstractC13091v.m36579E(4, new e(action, null), new C3383g(AbstractC37056f.m118950B(action.m114215d()), 2)), new f(null)), this.dispatcher);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36579E(AbstractC13095w0.f45249a, new a(null), upstream);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C35977b(AiChatApi aiChatApi, Context context, C31381b c31381b, InterfaceC34116n interfaceC34116n, AbstractC3076z abstractC3076z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AiChatFileInteractor") : interfaceC34116n;
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(aiChatApi, context, c31381b, interfaceC34116nM107848a, abstractC3076z);
    }
}
