package com.whoop.cache.persistence;

import android.database.SQLException;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import androidx.room.C1808m;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25271y;
import p002a0.AbstractC0038m;
import p002a0.C0010c;
import p002a0.C0022g;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r51.C30936d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import sg2.C32469t;
import uk2.C35051a;
import um0.AbstractC35075a;
import um0.C35076b;
import um0.C35077c;
import um0.C35078d;
import um0.C35080f;
import yb3.AbstractC39414r;
import yt2.C39775f;

/* JADX INFO: renamed from: com.whoop.cache.persistence.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tH\u0096@¢\u0006\u0004\b$\u0010\u001dJ\u0018\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b&\u0010\u001dJ\u0018\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020 H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tH\u0094@¢\u0006\u0004\b*\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00100¨\u00062"}, m65681d2 = {"Lcom/whoop/cache/persistence/a;", "Lum0/a;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Ltb/a;", "_connection", "La0/g;", "", "", "Lum0/f;", "_map", "Ll83/a0;", "x", "(Ltb/a;La0/g;)V", "", "scopes", "i", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lum0/c;", "entry", "j", "(Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "l", "(Lum0/c;Lq83/d;)Ljava/lang/Object;", "uri", "Lum0/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "b", "", "g", "(Lq83/d;)Ljava/lang/Object;", "a", "e", "scope", "d", "keep", "c", "(ILq83/d;)Ljava/lang/Object;", "f", "Landroidx/room/z0;", "Landroidx/room/k;", "Landroidx/room/k;", "__insertAdapterOfCacheScopeEntity", "Landroidx/room/m;", "Landroidx/room/m;", "__upsertAdapterOfCacheEntryEntity", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6101a extends AbstractC35075a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC1848z0 __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC1802k __insertAdapterOfCacheScopeEntity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C1808m __upsertAdapterOfCacheEntryEntity;

    /* JADX INFO: renamed from: com.whoop.cache.persistence.a$a */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"com/whoop/cache/persistence/a$a", "Landroidx/room/k;", "Lum0/f;", "", "createQuery", "()Ljava/lang/String;", "Ltb/c;", "statement", "entity", "Ll83/a0;", "a", "(Ltb/c;Lum0/f;)V", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC1802k {
        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c statement, C35080f entity) {
            AbstractC22676k.m65750j(statement, "statement");
            AbstractC22676k.m65750j(entity, "entity");
            statement.mo5356p(1, entity.getId());
            statement.mo5354L(2, entity.getUri());
            statement.mo5354L(3, entity.getScope());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR ABORT INTO `cache_scopes` (`id`,`uri`,`scope`) VALUES (nullif(?, 0),?,?)";
        }
    }

    /* JADX INFO: renamed from: com.whoop.cache.persistence.a$b */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"com/whoop/cache/persistence/a$b", "Landroidx/room/k;", "Lum0/c;", "", "createQuery", "()Ljava/lang/String;", "Ltb/c;", "statement", "entity", "Ll83/a0;", "a", "(Ltb/c;Lum0/c;)V", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC1802k {
        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c statement, C35077c entity) {
            AbstractC22676k.m65750j(statement, "statement");
            AbstractC22676k.m65750j(entity, "entity");
            statement.mo5354L(1, entity.getUri());
            statement.mo5357q(2, entity.getData());
            statement.mo5356p(3, entity.getLastUpdated());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT INTO `cache_entries` (`uri`,`data`,`lastUpdated`) VALUES (?,?,?)";
        }
    }

    /* JADX INFO: renamed from: com.whoop.cache.persistence.a$c */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"com/whoop/cache/persistence/a$c", "Landroidx/room/i;", "Lum0/c;", "", "createQuery", "()Ljava/lang/String;", "Ltb/c;", "statement", "entity", "Ll83/a0;", "a", "(Ltb/c;Lum0/c;)V", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC1794i {
        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c statement, C35077c entity) {
            AbstractC22676k.m65750j(statement, "statement");
            AbstractC22676k.m65750j(entity, "entity");
            statement.mo5354L(1, entity.getUri());
            statement.mo5357q(2, entity.getData());
            statement.mo5356p(3, entity.getLastUpdated());
            statement.mo5354L(4, entity.getUri());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "UPDATE `cache_entries` SET `uri` = ?,`data` = ?,`lastUpdated` = ? WHERE `uri` = ?";
        }
    }

    /* JADX INFO: renamed from: com.whoop.cache.persistence.a$d, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/cache/persistence/a$d;", "", "<init>", "()V", "", "Lj93/d;", "a", "()Ljava/util/List;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC21461d> m18341a() {
            return C25271y.f99162w;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.cache.persistence.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.BffCacheDao_Impl$upsert$2", m100430f = "BffCacheDao_Impl.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f24211w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35077c f24213y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C35080f> f24214z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C35077c c35077c, List<C35080f> list, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f24213y = c35077c;
            this.f24214z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C6101a.this.new e(this.f24213y, this.f24214z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24211w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C6101a c6101a = C6101a.this;
                C35077c c35077c = this.f24213y;
                List<C35080f> list = this.f24214z;
                this.f24211w = 1;
                if (C6101a.super.mo18336j(c35077c, list, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C6101a(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfCacheScopeEntity = new a();
        this.__upsertAdapterOfCacheEntryEntity = new C1808m(new b(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final int m18303A(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            return interfaceC33689cMo68212g1.mo5355e1() ? (int) interfaceC33689cMo68212g1.getLong(0) : 0;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final boolean m18304B(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            boolean z4 = false;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                z4 = ((int) interfaceC33689cMo68212g1.getLong(0)) != 0;
            }
            return z4;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final int m18305C(String str, int i13, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return AbstractC21478l0.m60402H(_connection);
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m18306D(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m18307E(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m18308F(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final int m18309G(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            return interfaceC33689cMo68212g1.mo5355e1() ? (int) interfaceC33689cMo68212g1.getLong(0) : 0;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C35078d m18310H(String str, String str2, C6101a c6101a, InterfaceC33687a _connection) throws Exception {
        C35078d c35078d;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "uri");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "data");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastUpdated");
            C0022g c0022g = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J0)) {
                    c0022g.put(strMo5353J0, new ArrayList());
                }
            }
            interfaceC33689cMo68212g1.reset();
            c6101a.m18324x(_connection, c0022g);
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                C35077c c35077c = new C35077c(interfaceC33689cMo68212g1.mo5353J0(iM60658N), interfaceC33689cMo68212g1.getBlob(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3));
                Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                AbstractC22676k.m65749i(objM73986U, "getValue(...)");
                c35078d = new C35078d(c35077c, (List) objM73986U);
            } else {
                c35078d = null;
            }
            return c35078d;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m18311I(C6101a c6101a, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        c6101a.__insertAdapterOfCacheScopeEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m18312J(C6101a c6101a, C35077c c35077c, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        C1808m c1808m = c6101a.__upsertAdapterOfCacheEntryEntity;
        c1808m.getClass();
        try {
            c1808m.f7112a.insert(_connection, c35077c);
        } catch (SQLException e5) {
            String message = e5.getMessage();
            if (message == null) {
                throw e5;
            }
            if (!AbstractC39414r.m125876U(message, "unique", true) && !AbstractC39414r.m125876U(message, "2067", false) && !AbstractC39414r.m125876U(message, "1555", false)) {
                throw e5;
            }
            c1808m.f7113b.handle(_connection, c35077c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private final void m18324x(InterfaceC33687a _connection, C0022g _map) throws Exception {
        C0010c c0010c = (C0010c) _map.keySet();
        C0022g c0022g = c0010c.f25w;
        if (c0022g.isEmpty()) {
            return;
        }
        if (_map.f50y > 999) {
            AbstractC32411b.m101080X(_map, new C35076b(1, this, _connection));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `id`,`uri`,`scope` FROM `cache_scopes` WHERE `uri` IN (");
        AbstractC29125c.m88533j(c0022g.f50y, sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(string);
        Iterator it = c0010c.iterator();
        int i13 = 1;
        while (true) {
            AbstractC0038m abstractC0038m = (AbstractC0038m) it;
            if (!abstractC0038m.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g1.close();
                    throw th3;
                }
            }
            interfaceC33689cMo68212g1.mo5354L(i13, (String) abstractC0038m.next());
            i13++;
        }
        int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "uri");
        if (iM60657M == -1) {
            interfaceC33689cMo68212g1.close();
            return;
        }
        while (interfaceC33689cMo68212g1.mo5355e1()) {
            List list = (List) _map.get(interfaceC33689cMo68212g1.mo5353J0(iM60657M));
            if (list != null) {
                list.add(new C35080f(interfaceC33689cMo68212g1.getLong(0), interfaceC33689cMo68212g1.mo5353J0(1), interfaceC33689cMo68212g1.mo5353J0(2)));
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m18325y(C6101a c6101a, InterfaceC33687a interfaceC33687a, C0022g _tmpMap) throws Exception {
        AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
        c6101a.m18324x(interfaceC33687a, _tmpMap);
        return C23454a0.f92919a;
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: a */
    public Object mo18327a(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C35051a(3), interfaceC30057d);
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: b */
    public Object mo18328b(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C30936d(str, 7), interfaceC30057d);
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: c */
    public Object mo18329c(int i13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C39775f(i13, 1), interfaceC30057d);
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: d */
    public Object mo18330d(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C30936d(str, 8), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: e */
    public Object mo18331e(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C30936d(str, 6), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: f */
    public Object mo18332f(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C30936d(str, 5), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: g */
    public Object mo18333g(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C35051a(4), interfaceC30057d);
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: h */
    public Object mo18334h(String str, InterfaceC30057d<? super C35078d> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C32469t(28, str, this), interfaceC30057d);
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: i */
    public Object mo18335i(List<C35080f> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C32469t(29, this, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: j */
    public Object mo18336j(C35077c c35077c, List<C35080f> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new e(c35077c, list, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // um0.AbstractC35075a
    /* JADX INFO: renamed from: l */
    public Object mo18337l(C35077c c35077c, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C35076b(0, this, c35077c), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }
}
