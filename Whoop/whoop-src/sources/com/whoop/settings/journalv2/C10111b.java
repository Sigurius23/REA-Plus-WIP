package com.whoop.settings.journalv2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.JournalPreferencesDto;
import com.whoop.data.repositories.JournalRepository;
import com.whoop.service.network.JournalApi;
import com.whoop.service.network.JournalEnabled;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/settings/journalv2/b;", "", "Lin2/d;", "dispatcher", "Lcom/whoop/data/repositories/JournalRepository;", "journalRepository", "Lcom/whoop/service/network/JournalApi;", "journalApi", "Ltr2/n;", "logger", "<init>", "(Lin2/d;Lcom/whoop/data/repositories/JournalRepository;Lcom/whoop/service/network/JournalApi;Ltr2/n;)V", "Lcom/whoop/settings/journalv2/a;", "action", "Lcom/whoop/settings/journalv2/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/settings/journalv2/a;Lq83/d;)Ljava/lang/Object;", "a", "Lin2/d;", "b", "Lcom/whoop/data/repositories/JournalRepository;", "c", "Lcom/whoop/service/network/JournalApi;", "d", "Ltr2/n;", "", "e", "Z", "isJournalEnabled", "f", "isDismissChecked", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10111b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JournalRepository journalRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final JournalApi journalApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isJournalEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDismissChecked;

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.journalv2.JournalSettingsInteractor$interact$2", m100430f = "JournalSettingsInteractor.kt", m100431l = {26, 28, 44, 62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/settings/journalv2/d;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/settings/journalv2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f30407w;

        /* JADX INFO: renamed from: x */
        int f30408x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC10110a f30409y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C10111b f30410z;

        /* JADX INFO: renamed from: com.whoop.settings.journalv2.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.settings.journalv2.JournalSettingsInteractor$interact$2$response$1", m100430f = "JournalSettingsInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/data/remote/domain/dto/JournalPreferencesDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41415a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f30411w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10111b f30412x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41415a(C10111b c10111b, InterfaceC30057d<? super C41415a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f30412x = c10111b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41415a(this.f30412x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f30411w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                JournalApi journalApi = this.f30412x.journalApi;
                this.f30411w = 1;
                Object journalPreferences = journalApi.getJournalPreferences(this);
                return journalPreferences == enumC31071a ? enumC31071a : journalPreferences;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super JournalPreferencesDto> interfaceC30057d) {
                return ((C41415a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: com.whoop.settings.journalv2.b$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.settings.journalv2.JournalSettingsInteractor$interact$2$response$2", m100430f = "JournalSettingsInteractor.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f30413w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10111b f30414x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC10110a f30415y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C10111b c10111b, AbstractC10110a abstractC10110a, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f30414x = c10111b;
                this.f30415y = abstractC10110a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f30414x, this.f30415y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f30413w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                JournalApi journalApi = this.f30414x.journalApi;
                JournalEnabled journalEnabled = new JournalEnabled(((AbstractC10110a.d) this.f30415y).getIsChecked());
                this.f30413w = 1;
                Object objUpsertJournalPreferences = journalApi.upsertJournalPreferences(journalEnabled, this);
                return objUpsertJournalPreferences == enumC31071a ? enumC31071a : objUpsertJournalPreferences;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC10110a abstractC10110a, C10111b c10111b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30409y = abstractC10110a;
            this.f30410z = c10111b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f30409y, this.f30410z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC10113d> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            if (r0 == r8) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        
            if (r0 == r8) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
        
            if (r0.setShouldShowDismissConfirmationDialog(r2, r10) == r8) goto L55;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.journalv2.C10111b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C10111b(InterfaceC18732d dispatcher, JournalRepository journalRepository, JournalApi journalApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(journalRepository, "journalRepository");
        AbstractC22676k.m65750j(journalApi, "journalApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.dispatcher = dispatcher;
        this.journalRepository = journalRepository;
        this.journalApi = journalApi;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: h */
    public final Object m25445h(AbstractC10110a abstractC10110a, InterfaceC30057d<? super InterfaceC10113d> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.mo54465b(), new a(abstractC10110a, this, null), interfaceC30057d);
    }
}
