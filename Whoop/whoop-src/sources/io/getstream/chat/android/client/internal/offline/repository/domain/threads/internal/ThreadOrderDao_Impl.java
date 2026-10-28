package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;", "order", "Ll83/a0;", "insertThreadOrder", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Lq83/d;)Ljava/lang/Object;", "", "id", "selectThreadOrder", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfThreadOrderEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadOrderDao_Impl implements ThreadOrderDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfThreadOrderEntity;
    private final ListConverter __listConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ThreadOrderDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__listConverter = new ListConverter();
        this.__db = __db;
        this.__insertAdapterOfThreadOrderEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_thread_order` (`id`,`order`) VALUES (?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ThreadOrderEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                String strFromStringList = ThreadOrderDao_Impl.this.__listConverter.fromStringList(entity.getOrder());
                if (strFromStringList == null) {
                    statement.mo5359u(2);
                } else {
                    statement.mo5354L(2, strFromStringList);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$2(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertThreadOrder$lambda$0(ThreadOrderDao_Impl threadOrderDao_Impl, ThreadOrderEntity threadOrderEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        threadOrderDao_Impl.__insertAdapterOfThreadOrderEntity.insert(_connection, threadOrderEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final ThreadOrderEntity selectThreadOrder$lambda$1(String str, String str2, ThreadOrderDao_Impl threadOrderDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "order");
            ThreadOrderEntity threadOrderEntity = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N2)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                }
                List<String> stringList = threadOrderDao_Impl.__listConverter.toStringList(strMo5353J0);
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                threadOrderEntity = new ThreadOrderEntity(strMo5353J1, stringList);
            }
            interfaceC33689cMo68212g1.close();
            return threadOrderEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(17), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao
    public final Object insertThreadOrder(ThreadOrderEntity threadOrderEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(7, this, threadOrderEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao
    public final Object selectThreadOrder(String str, InterfaceC30057d<? super ThreadOrderEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19223a(8, str, this), interfaceC30057d);
    }
}
