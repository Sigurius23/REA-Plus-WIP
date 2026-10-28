package io.getstream.chat.android.client.scope.user;

import bc3.AbstractC3028k2;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import l83.C23468n;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30054a;
import q83.InterfaceC30057d;
import q83.InterfaceC30062i;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R4\u0010\u0012\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0012\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/user/UserIdentifier;", "Lq83/a;", "<init>", "()V", "", "Lio/getstream/chat/android/models/UserId;", "userId", "", "timeoutInMs", "Ll83/n;", "awaitFor-0E7RQCE", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "awaitFor", "toString", "()Ljava/lang/String;", "Lec3/p1;", "_value", "Lec3/p1;", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "Key", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserIdentifier extends AbstractC30054a {
    private static final long DEFAULT_TIMEOUT_IN_MS = 10000;

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final InterfaceC13075p1 _value;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.scope.user.UserIdentifier$Key, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;", "Lq83/i;", "Lio/getstream/chat/android/client/scope/user/UserIdentifier;", "<init>", "()V", "", "DEFAULT_TIMEOUT_IN_MS", "J", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion implements InterfaceC30062i {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public UserIdentifier() {
        super(INSTANCE);
        this._value = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: awaitFor-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m134220awaitFor0E7RQCE$default(UserIdentifier userIdentifier, String str, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j7 = 10000;
        }
        return userIdentifier.m134221awaitFor0E7RQCE(str, j7, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: awaitFor-0E7RQCE, reason: not valid java name */
    public final Object m134221awaitFor0E7RQCE(String str, long j7, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        UserIdentifier$awaitFor$1 userIdentifier$awaitFor$1;
        if (interfaceC30057d instanceof UserIdentifier$awaitFor$1) {
            userIdentifier$awaitFor$1 = (UserIdentifier$awaitFor$1) interfaceC30057d;
            int i13 = userIdentifier$awaitFor$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                userIdentifier$awaitFor$1.label = i13 - Integer.MIN_VALUE;
            } else {
                userIdentifier$awaitFor$1 = new UserIdentifier$awaitFor$1(this, interfaceC30057d);
            }
        } else {
            userIdentifier$awaitFor$1 = new UserIdentifier$awaitFor$1(this, interfaceC30057d);
        }
        Object objM8748b = userIdentifier$awaitFor$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = userIdentifier$awaitFor$1.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8748b);
                UserIdentifier$awaitFor$2$1 userIdentifier$awaitFor$2$1 = new UserIdentifier$awaitFor$2$1(this, str, null);
                userIdentifier$awaitFor$1.L$0 = null;
                userIdentifier$awaitFor$1.L$1 = null;
                userIdentifier$awaitFor$1.J$0 = j7;
                userIdentifier$awaitFor$1.I$0 = 0;
                userIdentifier$awaitFor$1.label = 1;
                objM8748b = AbstractC3028k2.m8748b(j7, userIdentifier$awaitFor$2$1, userIdentifier$awaitFor$1);
                if (objM8748b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8748b);
            }
            return (String) objM8748b;
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    public final String getValue() {
        return (String) ((C13045h2) this._value).getValue();
    }

    public final void setValue(String str) {
        ((C13045h2) this._value).m36570j(str);
    }

    public final String toString() {
        return AbstractC11895b.m31996o("UserIdentifier(", getValue(), ")");
    }
}
