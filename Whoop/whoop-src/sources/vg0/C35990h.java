package vg0;

import android.net.Uri;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiChatImageUploadResponse;
import com.whoop.bot.models.conversation.ImageUploadRequest;
import com.whoop.bot.models.conversation.ImageUploadRequestBody;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.models.AttachmentType;
import ec3.AbstractC13091v;
import ec3.AbstractC13095w0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fl0.C14563h;
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
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import xg0.C38271c;

/* JADX INFO: renamed from: vg0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lvg0/h;", "Lod1/g;", "Lvg0/g;", "", "Lxg0/c;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Lfl0/h;", "imageFileHandler", "Lrg0/b;", "analyticsHelper", "Ltr2/n;", "logger", "Lbc3/z;", "dispatcher", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Lfl0/h;Lrg0/b;Ltr2/n;Lbc3/z;)V", "Landroid/net/Uri;", "imageUris", "", "fingerprint", "", "fileSizesBytes", "Lec3/l;", "l", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lec3/l;", "fileUri", "fileSizeBytes", "j", "(Landroid/net/Uri;Ljava/lang/String;J)Lec3/l;", "fileId", "k", "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Lfl0/h;", "c", "Lrg0/b;", "d", "Ltr2/n;", "e", "Lbc3/z;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35990h implements InterfaceC27844g<AbstractC35988g, List<? extends C38271c>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14563h imageFileHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: vg0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$interact$1", m100430f = "AiChatImageInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lvg0/g;", "action", "Lec3/l;", "", "Lxg0/c;", "<anonymous>", "(Lvg0/g;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153359w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153360x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C35990h.this.new a(interfaceC30057d);
            aVar.f153360x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC35988g abstractC35988g, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((a) create(abstractC35988g, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC35988g abstractC35988g = (AbstractC35988g) this.f153360x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153359w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC35988g instanceof AbstractC35988g.b) {
                AbstractC35988g.b bVar = (AbstractC35988g.b) abstractC35988g;
                return C35990h.this.m114300l(bVar.m114286c(), bVar.getFingerprint(), bVar.m114284a());
            }
            if (abstractC35988g instanceof AbstractC35988g.a) {
                return C35990h.this.m114299k(((AbstractC35988g.a) abstractC35988g).getFileId());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: vg0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$performUpload$1", m100430f = "AiChatImageInteractor.kt", m100431l = {70, 72, 120, 123}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxg0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Uri f153363F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ long f153364G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f153365H;

        /* JADX INFO: renamed from: w */
        Object f153366w;

        /* JADX INFO: renamed from: x */
        Object f153367x;

        /* JADX INFO: renamed from: y */
        int f153368y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f153369z;

        /* JADX INFO: renamed from: vg0.h$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$performUpload$1$imageModel$1", m100430f = "AiChatImageInteractor.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153370w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35990h f153371x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ ImageUploadRequest f153372y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35990h c35990h, ImageUploadRequest imageUploadRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153371x = c35990h;
                this.f153372y = imageUploadRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153371x, this.f153372y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153370w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153371x.api;
                ImageUploadRequestBody body = this.f153372y.getBody();
                this.f153370w = 1;
                Object objUploadImage = aiChatApi.uploadImage(body, this);
                return objUploadImage == enumC31071a ? enumC31071a : objUploadImage;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<AiChatImageUploadResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, long j7, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153363F = uri;
            this.f153364G = j7;
            this.f153365H = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C35990h.this.new b(this.f153363F, this.f153364G, this.f153365H, interfaceC30057d);
            bVar.f153369z = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0097 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0035, B:17:0x0041, B:27:0x0089, B:29:0x0097, B:38:0x0151, B:31:0x00d3, B:33:0x00db, B:36:0x00f8, B:37:0x0120, B:41:0x0160, B:42:0x0165, B:18:0x0047, B:24:0x0064, B:21:0x0050), top: B:48:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d3 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0035, B:17:0x0041, B:27:0x0089, B:29:0x0097, B:38:0x0151, B:31:0x00d3, B:33:0x00db, B:36:0x00f8, B:37:0x0120, B:41:0x0160, B:42:0x0165, B:18:0x0047, B:24:0x0064, B:21:0x0050), top: B:48:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00db A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0035, B:17:0x0041, B:27:0x0089, B:29:0x0097, B:38:0x0151, B:31:0x00d3, B:33:0x00db, B:36:0x00f8, B:37:0x0120, B:41:0x0160, B:42:0x0165, B:18:0x0047, B:24:0x0064, B:21:0x0050), top: B:48:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0120 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0035, B:17:0x0041, B:27:0x0089, B:29:0x0097, B:38:0x0151, B:31:0x00d3, B:33:0x00db, B:36:0x00f8, B:37:0x0120, B:41:0x0160, B:42:0x0165, B:18:0x0047, B:24:0x0064, B:21:0x0050), top: B:48:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x015f  */
        /* JADX WARN: Code duplicated, block: B:41:0x0160 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0035, B:17:0x0041, B:27:0x0089, B:29:0x0097, B:38:0x0151, B:31:0x00d3, B:33:0x00db, B:36:0x00f8, B:37:0x0120, B:41:0x0160, B:42:0x0165, B:18:0x0047, B:24:0x0064, B:21:0x0050), top: B:48:0x0012 }] */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0198, code lost:
        
            if (r8.emit(r14, r28) == r9) goto L45;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vg0.C35990h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vg0.h$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$removeImage$1", m100430f = "AiChatImageInteractor.kt", m100431l = {129, 136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Lxg0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f153373E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f153374F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C35990h f153375G;

        /* JADX INFO: renamed from: w */
        Object f153376w;

        /* JADX INFO: renamed from: x */
        Object f153377x;

        /* JADX INFO: renamed from: y */
        int f153378y;

        /* JADX INFO: renamed from: z */
        int f153379z;

        /* JADX INFO: renamed from: vg0.h$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$removeImage$1$1$response$1", m100430f = "AiChatImageInteractor.kt", m100431l = {130}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153380w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35990h f153381x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f153382y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35990h c35990h, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153381x = c35990h;
                this.f153382y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153381x, this.f153382y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153380w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153381x.api;
                String str = this.f153382y;
                this.f153380w = 1;
                Object objDeleteFile = aiChatApi.deleteFile(str, this);
                return objDeleteFile == enumC31071a ? enumC31071a : objDeleteFile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C35990h c35990h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153374F = str;
            this.f153375G = c35990h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f153374F, this.f153375G, interfaceC30057d);
            cVar.f153373E = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        
            if (r15 == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        
            if (r0.emit(m83.C25271y.f99162w, r14) == r1) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f153373E
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f153379z
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L7a
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                java.lang.Object r2 = r14.f153377x
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r14.f153376w
                vg0.h r2 = (vg0.C35990h) r2
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L56
            L2b:
                p505ts.AbstractC34132o.m107864I(r15)
                java.lang.String r15 = r14.f153374F
                if (r15 == 0) goto L68
                vg0.h r2 = r14.f153375G
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                tr2.n r7 = vg0.C35990h.m114294f(r2)
                vg0.h$c$a r10 = new vg0.h$c$a
                r10.<init>(r2, r15, r5)
                r14.f153373E = r0
                r14.f153376w = r2
                r14.f153377x = r5
                r15 = 0
                r14.f153378y = r15
                r14.f153379z = r4
                r8 = 0
                r9 = 0
                r12 = 6
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L56
                goto L79
            L56:
                u02.a r15 = (u02.InterfaceC34385a) r15
                boolean r4 = r15 instanceof u02.InterfaceC34385a.b
                if (r4 == 0) goto L69
                rg0.b r2 = vg0.C35990h.m114291c(r2)
                u02.a$b r15 = (u02.InterfaceC34385a.b) r15
                java.lang.String r4 = "remove_image"
                r2.m96621b(r15, r4)
                goto L69
            L68:
                r11 = r14
            L69:
                r11.f153373E = r5
                r11.f153376w = r5
                r11.f153377x = r5
                r11.f153379z = r3
                m83.y r15 = m83.C25271y.f99162w
                java.lang.Object r15 = r0.emit(r15, r14)
                if (r15 != r1) goto L7a
            L79:
                return r1
            L7a:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: vg0.C35990h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vg0.h$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$uploadImages$1", m100430f = "AiChatImageInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "index", "Lec3/l;", "Lxg0/c;", "<anonymous>", "(I)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f153383E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<Long> f153384F;

        /* JADX INFO: renamed from: w */
        int f153385w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ int f153386x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<Uri> f153388z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Uri> list, String str, List<Long> list2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153388z = list;
            this.f153383E = str;
            this.f153384F = list2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C35990h.this.new d(this.f153388z, this.f153383E, this.f153384F, interfaceC30057d);
            dVar.f153386x = ((Number) obj).intValue();
            return dVar;
        }

        public final Object invoke(int i13, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((d) create(Integer.valueOf(i13), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13 = this.f153386x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153385w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C35990h c35990h = C35990h.this;
            Uri uri = this.f153388z.get(i13);
            String str = this.f153383E;
            List<Long> list = this.f153384F;
            return c35990h.m114298j(uri, str, ((i13 < 0 || i13 >= list.size()) ? new Long(0L) : list.get(i13)).longValue());
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC30057d<? super InterfaceC13058l>) obj2);
        }
    }

    /* JADX INFO: renamed from: vg0.h$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$uploadImages$2", m100430f = "AiChatImageInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lxg0/c;", "currentList", "updatedItem", "<anonymous>", "(Ljava/util/List;Lxg0/c;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153389w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153390x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153391y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<C38271c> list, C38271c c38271c, InterfaceC30057d<? super List<C38271c>> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f153390x = list;
            eVar.f153391y = c38271c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f153390x;
            C38271c c38271c = (C38271c) this.f153391y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f153389w != 0) {
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

    public C35990h(AiChatApi api, C14563h imageFileHandler, C31381b analyticsHelper, InterfaceC34116n logger, AbstractC3076z dispatcher) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(imageFileHandler, "imageFileHandler");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.api = api;
        this.imageFileHandler = imageFileHandler;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
        this.dispatcher = dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m114298j(Uri fileUri, String fingerprint, long fileSizeBytes) {
        return new C13084s1(new b(fileUri, fileSizeBytes, fingerprint, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m114299k(String fileId) {
        return new C13084s1(new c(fileId, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m114300l(List<? extends Uri> imageUris, String fingerprint, List<Long> fileSizesBytes) {
        List<? extends Uri> list = imageUris;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C38271c(AttachmentType.IMAGE, true, false, (Uri) obj, null, null, ((i13 < 0 || i13 >= fileSizesBytes.size()) ? 0L : fileSizesBytes.get(i13)).longValue(), null, 180, null));
            i13 = i14;
        }
        return AbstractC13091v.m36580F(new C13060l1(arrayList, AbstractC13091v.m36579E(4, new d(imageUris, fingerprint, fileSizesBytes, null), new C3383g(AbstractC37056f.m118950B(imageUris), 2)), new e(null)), this.dispatcher);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36579E(AbstractC13095w0.f45249a, new a(null), upstream);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C35990h(AiChatApi aiChatApi, C14563h c14563h, C31381b c31381b, InterfaceC34116n interfaceC34116n, AbstractC3076z abstractC3076z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AiChatImageInteractor") : interfaceC34116n;
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(aiChatApi, c14563h, c31381b, interfaceC34116nM107848a, abstractC3076z);
    }
}
