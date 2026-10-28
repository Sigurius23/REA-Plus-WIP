package com.whoop.data.repositories;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1", m100430f = "LanguageRepository.kt", m100431l = {244, 246, 247}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class LanguageRepository$setAppLocaleList$1$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $newLanguage;
    final /* synthetic */ String $oldLanguage;
    int label;
    final /* synthetic */ LanguageRepository this$0;

    /* JADX INFO: renamed from: com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1$1", m100430f = "LanguageRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66021 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $newLanguage;
        final /* synthetic */ String $oldLanguage;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LanguageRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66021(LanguageRepository languageRepository, String str, String str2, InterfaceC30057d<? super C66021> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = languageRepository;
            this.$newLanguage = str;
            this.$oldLanguage = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C66021 c66021 = new C66021(this.this$0, this.$newLanguage, this.$oldLanguage, interfaceC30057d);
            c66021.L$0 = obj;
            return c66021;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66021) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(LanguageRepositoryKt.getKEY_SHOW_LANGUAGE_MODAL(), Boolean.valueOf(this.this$0.isNotEnglish(this.$newLanguage) && !AbstractC39414r.m125890i0(this.$oldLanguage)));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepository$setAppLocaleList$1$1$1(LanguageRepository languageRepository, String str, String str2, InterfaceC30057d<? super LanguageRepository$setAppLocaleList$1$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = languageRepository;
        this.$newLanguage = str;
        this.$oldLanguage = str2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new LanguageRepository$setAppLocaleList$1$1$1(this.this$0, this.$newLanguage, this.$oldLanguage, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((LanguageRepository$setAppLocaleList$1$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (hg3.AbstractC17269i.m48861G(r8, r1, r7) == r0) goto L22;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            p505ts.AbstractC34132o.m107864I(r8)
            goto L8a
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6f
        L20:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L3a
        L24:
            p505ts.AbstractC34132o.m107864I(r8)
            com.whoop.data.repositories.LanguageRepository r8 = r7.this$0
            a6.g r8 = com.whoop.data.repositories.LanguageRepository.access$getPrefsDataStore$p(r8)
            ec3.l r8 = r8.getData()
            r7.label = r4
            java.lang.Object r8 = ec3.AbstractC13091v.m36575A(r8, r7)
            if (r8 != r0) goto L3a
            goto L89
        L3a:
            f6.f r8 = (p138f6.AbstractC14134f) r8
            f6.d r1 = com.whoop.data.repositories.LanguageRepositoryKt.getKEY_USER_LANGUAGE_OVERRIDE()
            java.lang.Object r8 = r8.mo40227b(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r1)
            if (r8 != 0) goto L8a
            com.whoop.data.repositories.LanguageRepository r8 = r7.this$0
            tr2.n r8 = com.whoop.data.repositories.LanguageRepository.access$getLogger$p(r8)
            r1 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
            java.lang.String r4 = "refreshForLanguageChange"
            r8.mo85228t(r4, r1)
            com.whoop.data.repositories.LanguageRepository r8 = r7.this$0
            l83.h r8 = com.whoop.data.repositories.LanguageRepository.access$getLanguageRefresher$p(r8)
            java.lang.Object r8 = r8.getValue()
            com.whoop.data.repositories.CachedDataLanguageRefresher r8 = (com.whoop.data.repositories.CachedDataLanguageRefresher) r8
            r7.label = r3
            java.lang.Object r8 = r8.refreshForLanguageChange(r7)
            if (r8 != r0) goto L6f
            goto L89
        L6f:
            com.whoop.data.repositories.LanguageRepository r8 = r7.this$0
            a6.g r8 = com.whoop.data.repositories.LanguageRepository.access$getPrefsDataStore$p(r8)
            com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1$1 r1 = new com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1$1
            com.whoop.data.repositories.LanguageRepository r3 = r7.this$0
            java.lang.String r4 = r7.$newLanguage
            java.lang.String r5 = r7.$oldLanguage
            r6 = 0
            r1.<init>(r3, r4, r5, r6)
            r7.label = r2
            java.lang.Object r8 = hg3.AbstractC17269i.m48861G(r8, r1, r7)
            if (r8 != r0) goto L8a
        L89:
            return r0
        L8a:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
