package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import bc3.AbstractC3006f0;
import bc3.C3033m;
import c93.InterfaceC4339a;
import ge3.AbstractC15751g;
import hn.C17508p;
import io.getstream.chat.android.models.User;
import java.util.List;
import l83.C23454a0;
import ou1.C28376a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m65681d2 = {"toUserLookupHandler", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;", "toJavaCompatUserLookupHandler", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CompatUserLookupHandlerKt {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C28376a m55019a(UserLookupHandler userLookupHandler, String str, Function1 function1) {
        return (C28376a) toJavaCompatUserLookupHandler$lambda$1(userLookupHandler, str, function1);
    }

    public static final CompatUserLookupHandler toJavaCompatUserLookupHandler(UserLookupHandler userLookupHandler) {
        AbstractC22676k.m65750j(userLookupHandler, "<this>");
        return new C17508p(userLookupHandler, 5);
    }

    private static final InterfaceC4339a toJavaCompatUserLookupHandler$lambda$1(UserLookupHandler userLookupHandler, String query, Function1 callback) throws Throwable {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC3006f0.m8699E(C30064k.f122676w, new CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1(userLookupHandler, query, callback, null));
        return new C28376a(7);
    }

    public static final UserLookupHandler toUserLookupHandler(final CompatUserLookupHandler compatUserLookupHandler) {
        AbstractC22676k.m65750j(compatUserLookupHandler, "<this>");
        return new UserLookupHandler() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.mention.CompatUserLookupHandlerKt.toUserLookupHandler.1
            @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler
            public final Object handleUserLookup(String str, InterfaceC30057d<? super List<User>> interfaceC30057d) {
                CompatUserLookupHandler compatUserLookupHandler2 = compatUserLookupHandler;
                final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
                c3033m.m8774s();
                final InterfaceC4339a interfaceC4339aHandleCompatUserLookup = compatUserLookupHandler2.handleCompatUserLookup(str, new Function1() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.mention.CompatUserLookupHandlerKt$toUserLookupHandler$1$1$cancelable$1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((List<User>) obj);
                        return C23454a0.f92919a;
                    }

                    public final void invoke(List<User> users) {
                        AbstractC22676k.m65750j(users, "users");
                        c3033m.resumeWith(users);
                    }
                });
                c3033m.m8776u(new Function1() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.mention.CompatUserLookupHandlerKt$toUserLookupHandler$1$1$1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return C23454a0.f92919a;
                    }

                    public final void invoke(Throwable th3) {
                        interfaceC4339aHandleCompatUserLookup.invoke();
                    }
                });
                Object objM8773r = c3033m.m8773r();
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                return objM8773r;
            }
        };
    }
}
