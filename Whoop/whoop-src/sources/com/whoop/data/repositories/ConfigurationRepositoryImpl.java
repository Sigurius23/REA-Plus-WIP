package com.whoop.data.repositories;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.wipeable.ConfigurationsDao;
import com.whoop.data.local.room.entity.ConfigurationDto;
import com.whoop.service.network.ConfigurationApi;
import com.whoop.service.network.WhoopConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u0010J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010 J'\u0010&\u001a\u00028\u0000\"\b\b\u0000\u0010#*\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\bH\u0096@¢\u0006\u0004\b)\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.¨\u0006/"}, m65681d2 = {"Lcom/whoop/data/repositories/ConfigurationRepositoryImpl;", "Ljs0/c;", "Lcom/whoop/service/network/ConfigurationApi;", "configurationApi", "Lbc3/c0;", "applicationScope", "Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;", "configurationsDao", "", "isDebug", "fetchEnabled", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/ConfigurationApi;Lbc3/c0;Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;ZZLtr2/n;)V", "fetchConfigurationValuesFromServer", "(Lq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/service/network/WhoopConfiguration;", "fetchConfigurationValuesFromServerAuthed", "fetchConfigurationValuesFromServerUnauthed", "response", "Ll83/a0;", "updateConfigurations", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "clearCachedConfigurations", "", "key", "value", "addConfigurationToCache", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "loadInitialConfigurationValuesFromDb", "()V", "logConfigurations", "", "T", "Ljs0/a;", "configuration", "getConfigurationValueFromJava", "(Ljs0/a;)Ljava/lang/Object;", "fetchConfigurationValuesAsync", "fetchConfigurationValues", "Lcom/whoop/service/network/ConfigurationApi;", "Lbc3/c0;", "Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;", "Z", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConfigurationRepositoryImpl extends AbstractC21909c {
    private final InterfaceC2994c0 applicationScope;
    private final ConfigurationApi configurationApi;
    private final ConfigurationsDao configurationsDao;
    private final boolean fetchEnabled;
    private final boolean isDebug;
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$addConfigurationToCache$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {104}, m100432m = "addConfigurationToCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65501 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65501(InterfaceC30057d<? super C65501> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationRepositoryImpl.this.addConfigurationToCache(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$clearCachedConfigurations$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {96}, m100432m = "clearCachedConfigurations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65511 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65511(InterfaceC30057d<? super C65511> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationRepositoryImpl.this.clearCachedConfigurations(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesAsync$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesAsync$1", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65521 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65521(InterfaceC30057d<? super C65521> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ConfigurationRepositoryImpl.this.new C65521(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65521) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ConfigurationRepositoryImpl configurationRepositoryImpl = ConfigurationRepositoryImpl.this;
                this.label = 1;
                if (configurationRepositoryImpl.fetchConfigurationValuesFromServer(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {51, 52, 58, 60}, m100432m = "fetchConfigurationValuesFromServer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65531 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C65531(InterfaceC30057d<? super C65531> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationRepositoryImpl.this.fetchConfigurationValuesFromServer(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerAuthed$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {70}, m100432m = "fetchConfigurationValuesFromServerAuthed", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65541 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65541(InterfaceC30057d<? super C65541> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationRepositoryImpl.this.fetchConfigurationValuesFromServerAuthed(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesFromServerUnauthed$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {79}, m100432m = "fetchConfigurationValuesFromServerUnauthed", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65551 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65551(InterfaceC30057d<? super C65551> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationRepositoryImpl.this.fetchConfigurationValuesFromServerUnauthed(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$loadInitialConfigurationValuesFromDb$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl$loadInitialConfigurationValuesFromDb$1", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65561 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65561(InterfaceC30057d<? super C65561> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ConfigurationRepositoryImpl.this.new C65561(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65561) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ConfigurationsDao configurationsDao = ConfigurationRepositoryImpl.this.configurationsDao;
                    this.label = 1;
                    obj = configurationsDao.getAllConfigurations(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                for (ConfigurationDto configurationDto : (List) obj) {
                    ConfigurationRepositoryImpl.this.getConfigurations().put(configurationDto.getKey(), configurationDto.getValue());
                }
            } catch (Exception e5) {
                ConfigurationRepositoryImpl.this.logger.mo85213c("Failed to retrieve configurations from Room DB", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.ConfigurationRepositoryImpl$updateConfigurations$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.ConfigurationRepositoryImpl", m100430f = "ConfigurationRepositoryImpl.kt", m100431l = {89}, m100432m = "updateConfigurations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65571 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C65571(InterfaceC30057d<? super C65571> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurationRepositoryImpl.this.updateConfigurations(null, this);
        }
    }

    public ConfigurationRepositoryImpl(ConfigurationApi configurationApi, InterfaceC2994c0 applicationScope, ConfigurationsDao configurationsDao, boolean z4, boolean z13, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(configurationApi, "configurationApi");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(configurationsDao, "configurationsDao");
        AbstractC22676k.m65750j(logger, "logger");
        this.configurationApi = configurationApi;
        this.applicationScope = applicationScope;
        this.configurationsDao = configurationsDao;
        this.isDebug = z4;
        this.fetchEnabled = z13;
        this.logger = logger;
        loadInitialConfigurationValuesFromDb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object addConfigurationToCache(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65501 c65501;
        if (interfaceC30057d instanceof C65501) {
            c65501 = (C65501) interfaceC30057d;
            int i13 = c65501.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65501.label = i13 - Integer.MIN_VALUE;
            } else {
                c65501 = new C65501(interfaceC30057d);
            }
        } else {
            c65501 = new C65501(interfaceC30057d);
        }
        Object obj = c65501.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65501.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                ConfigurationsDao configurationsDao = this.configurationsDao;
                ConfigurationDto configurationDto = new ConfigurationDto(str, str2);
                c65501.L$0 = null;
                c65501.L$1 = null;
                c65501.label = 1;
                if (configurationsDao.insert(configurationDto, c65501) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to insert configuration into Room DB", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object clearCachedConfigurations(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65511 c65511;
        if (interfaceC30057d instanceof C65511) {
            c65511 = (C65511) interfaceC30057d;
            int i13 = c65511.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65511.label = i13 - Integer.MIN_VALUE;
            } else {
                c65511 = new C65511(interfaceC30057d);
            }
        } else {
            c65511 = new C65511(interfaceC30057d);
        }
        Object obj = c65511.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65511.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                getConfigurations().clear();
                ConfigurationsDao configurationsDao = this.configurationsDao;
                c65511.label = 1;
                if (configurationsDao.deleteAll(c65511) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Unable to delete all cached configurations from Room DB", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (updateConfigurations(r9, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchConfigurationValuesFromServer(q83.InterfaceC30057d<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.whoop.data.repositories.ConfigurationRepositoryImpl.C65531
            if (r0 == 0) goto L13
            r0 = r9
            com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1 r0 = (com.whoop.data.repositories.ConfigurationRepositoryImpl.C65531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1 r0 = new com.whoop.data.repositories.ConfigurationRepositoryImpl$fetchConfigurationValuesFromServer$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L55
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            p505ts.AbstractC34132o.m107864I(r9)
            goto Lab
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L41:
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            p505ts.AbstractC34132o.m107864I(r9)
            goto L95
        L4d:
            java.lang.Object r2 = r0.L$0
            java.util.List r2 = (java.util.List) r2
            p505ts.AbstractC34132o.m107864I(r9)
            goto L75
        L55:
            p505ts.AbstractC34132o.m107864I(r9)
            goto L65
        L59:
            p505ts.AbstractC34132o.m107864I(r9)
            r0.label = r6
            java.lang.Object r9 = r8.fetchConfigurationValuesFromServerAuthed(r0)
            if (r9 != r1) goto L65
            goto Laa
        L65:
            java.util.List r9 = (java.util.List) r9
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r2 = r8.fetchConfigurationValuesFromServerUnauthed(r0)
            if (r2 != r1) goto L72
            goto Laa
        L72:
            r7 = r2
            r2 = r9
            r9 = r7
        L75:
            java.util.List r9 = (java.util.List) r9
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L86
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L86
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L86:
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r4 = r8.clearCachedConfigurations(r0)
            if (r4 != r1) goto L93
            goto Laa
        L93:
            r4 = r2
            r2 = r9
        L95:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r9 = m83.AbstractC25265s.m74129g1(r2, r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r8.updateConfigurations(r9, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            boolean r9 = r8.isDebug
            if (r9 == 0) goto Lb2
            r8.logConfigurations()
        Lb2:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.ConfigurationRepositoryImpl.fetchConfigurationValuesFromServer(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchConfigurationValuesFromServerAuthed(InterfaceC30057d<? super List<WhoopConfiguration>> interfaceC30057d) {
        C65541 c65541;
        if (interfaceC30057d instanceof C65541) {
            c65541 = (C65541) interfaceC30057d;
            int i13 = c65541.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65541.label = i13 - Integer.MIN_VALUE;
            } else {
                c65541 = new C65541(interfaceC30057d);
            }
        } else {
            c65541 = new C65541(interfaceC30057d);
        }
        Object configurations = c65541.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65541.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(configurations);
                ConfigurationApi configurationApi = this.configurationApi;
                c65541.label = 1;
                configurations = configurationApi.getConfigurations(c65541);
                if (configurations == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(configurations);
            }
            return (List) configurations;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Encountered an exception when trying to pull authed configuration service", this.logger, null, 8, null);
            return C25271y.f99162w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchConfigurationValuesFromServerUnauthed(InterfaceC30057d<? super List<WhoopConfiguration>> interfaceC30057d) {
        C65551 c65551;
        if (interfaceC30057d instanceof C65551) {
            c65551 = (C65551) interfaceC30057d;
            int i13 = c65551.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65551.label = i13 - Integer.MIN_VALUE;
            } else {
                c65551 = new C65551(interfaceC30057d);
            }
        } else {
            c65551 = new C65551(interfaceC30057d);
        }
        Object configurationsUnauthed = c65551.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65551.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(configurationsUnauthed);
                ConfigurationApi configurationApi = this.configurationApi;
                c65551.label = 1;
                configurationsUnauthed = configurationApi.getConfigurationsUnauthed(c65551);
                if (configurationsUnauthed == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(configurationsUnauthed);
            }
            return (List) configurationsUnauthed;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Encountered an exception when trying to pull unauthed configuration service", this.logger, null, 8, null);
            return C25271y.f99162w;
        }
    }

    private final void loadInitialConfigurationValuesFromDb() {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C65561(null), 3);
    }

    private final void logConfigurations() {
        StringBuilder sb4 = new StringBuilder("Configurations:\n");
        for (Map.Entry<String, String> entry : getConfigurations().entrySet()) {
            sb4.append(entry.getKey() + " : " + entry.getValue());
            sb4.append('\n');
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        interfaceC34116n.mo85228t(string, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateConfigurations(List<WhoopConfiguration> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65571 c65571;
        Iterator<WhoopConfiguration> it;
        if (interfaceC30057d instanceof C65571) {
            c65571 = (C65571) interfaceC30057d;
            int i13 = c65571.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65571.label = i13 - Integer.MIN_VALUE;
            } else {
                c65571 = new C65571(interfaceC30057d);
            }
        } else {
            c65571 = new C65571(interfaceC30057d);
        }
        Object obj = c65571.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c65571.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            it = list.iterator();
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c65571.L$1;
            AbstractC34132o.m107864I(obj);
        }
        while (it.hasNext()) {
            WhoopConfiguration next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            getConfigurations().put(key, value);
            c65571.L$0 = null;
            c65571.L$1 = it;
            c65571.L$2 = null;
            c65571.L$3 = null;
            c65571.label = 1;
            if (addConfigurationToCache(key, value, c65571) == obj2) {
                return obj2;
            }
        }
        return C23454a0.f92919a;
    }

    @Override // js0.AbstractC21909c
    public Object fetchConfigurationValues(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return !this.fetchEnabled ? Boolean.TRUE : fetchConfigurationValuesFromServer(interfaceC30057d);
    }

    @Override // js0.AbstractC21909c
    public void fetchConfigurationValuesAsync() {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C65521(null), 3);
    }

    @Override // js0.AbstractC21909c
    public <T> T getConfigurationValueFromJava(AbstractC21907a<T> configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        return (T) getConfigurations().m62332i(configuration.getName(), configuration.getDefaultValue());
    }
}
