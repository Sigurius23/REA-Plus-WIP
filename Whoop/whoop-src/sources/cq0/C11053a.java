package cq0;

import android.graphics.Bitmap;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bq0.C3546b;
import bq0.C3548d;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.community.data.network.ChatApi;
import com.whoop.community.data.network.DataWidgetDto;
import com.whoop.community.data.network.MemberNotificationSettingsDto;
import com.whoop.community.data.network.MessageStatus;
import com.whoop.community.data.network.ReportMessage;
import com.whoop.data.remote.commons.Resource;
import com.whoop.network.exception.DomainException;
import com.whoop.profile.domain.ProfileApiKt;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: cq0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001d\u0010\u001cJ.\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0086@¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00192\u0006\u0010%\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b'\u0010(J \u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lcq0/a;", "", "Lcom/whoop/community/data/network/ChatApi;", "chatApi", "Ltr2/n;", "logger", "Lin2/d;", "dispatcherFactory", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/community/data/network/ChatApi;Ltr2/n;Lin2/d;Lrr2/c;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "e", "(Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;", "", "channelType", "channelId", "attachment", "l", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/community/data/network/MessageStatus;", "messageStatus", "Lcom/whoop/data/remote/commons/Resource;", "", "i", "(Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;", "j", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "Lbq0/b;", "f", "(IILq83/d;)Ljava/lang/Object;", ProfileApiKt.COMMUNITY_ID_PARAM, "Lbq0/d;", "g", "(ILq83/d;)Ljava/lang/Object;", "notificationType", "k", "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/community/data/network/ReportMessage;", "reportMessage", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/community/data/network/ReportMessage;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/community/data/network/ChatApi;", "b", "Ltr2/n;", "c", "Lin2/d;", "d", "Lrr2/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11053a {

    /* JADX INFO: renamed from: f */
    public static final int f34674f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ChatApi chatApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: cq0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository", m100430f = "ChatRepository.kt", m100431l = {43}, m100432m = "encodeBitmapForUpload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f34679w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34680x;

        /* JADX INFO: renamed from: z */
        int f34682z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34680x = obj;
            this.f34682z |= Integer.MIN_VALUE;
            return C11053a.this.m29711e(null, this);
        }
    }

    /* JADX INFO: renamed from: cq0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$encodeBitmapForUpload$2", m100430f = "ChatRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lbc3/c0;)[B"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34683w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Bitmap f34684x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bitmap bitmap, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34684x = bitmap;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f34684x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super byte[]> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34683w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f34684x.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* JADX INFO: renamed from: cq0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$getDataWidgets$2", m100430f = "ChatRepository.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "", "Lbq0/b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34685w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34687y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f34688z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, int i14, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34687y = i13;
            this.f34688z = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11053a.this.new d(this.f34687y, this.f34688z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<? extends List<C3546b>>> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List listM74093D1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34685w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11053a.this.chatApi;
                    int i14 = this.f34687y;
                    int i15 = this.f34688z;
                    this.f34685w = 1;
                    obj = chatApi.getDataWidgets(i14, i15, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                List list = (List) ((C29218v0) obj).f118270b;
                if (list != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((DataWidgetDto) it.next()).toDataWidget());
                    }
                    listM74093D1 = AbstractC25265s.m74093D1(arrayList);
                } else {
                    listM74093D1 = null;
                }
                return Resource.INSTANCE.success(listM74093D1);
            } catch (Throwable th3) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while getting the data widgets", C11053a.this.logger, C11053a.this.crashReporter), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: cq0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$getNotificationSettings$2", m100430f = "ChatRepository.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Lbq0/d;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34689w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34691y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i13, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34691y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11053a.this.new e(this.f34691y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C3548d>> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34689w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11053a.this.chatApi;
                    int i14 = this.f34691y;
                    this.f34689w = 1;
                    obj = chatApi.getNotificationSetting(i14, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return Resource.INSTANCE.success(((MemberNotificationSettingsDto) obj).toMemberNotificationSettings());
            } catch (Throwable th3) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while getting notification settings", C11053a.this.logger, C11053a.this.crashReporter), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: cq0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$reportMessage$2", m100430f = "ChatRepository.kt", m100431l = {122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34692w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ReportMessage f34694y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReportMessage reportMessage, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34694y = reportMessage;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11053a.this.new f(this.f34694y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34692w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11053a.this.chatApi;
                    ReportMessage reportMessage = this.f34694y;
                    this.f34692w = 1;
                    obj = chatApi.reportMessage(reportMessage, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                z4 = ((C29218v0) obj).f118269a.f146788Q;
            } catch (Throwable th3) {
                AbstractC36685b.m117759a(th3, "Exception occurred while reporting a message ", C11053a.this.logger, C11053a.this.crashReporter);
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: cq0.a$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$sendMessageStatus$2", m100430f = "ChatRepository.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34695w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ MessageStatus f34697y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MessageStatus messageStatus, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34697y = messageStatus;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11053a.this.new g(this.f34697y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<Boolean>> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34695w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11053a.this.chatApi;
                    MessageStatus messageStatus = this.f34697y;
                    this.f34695w = 1;
                    obj = chatApi.sendMessageStatus(messageStatus, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return Resource.INSTANCE.success(Boolean.valueOf(((C29218v0) obj).f118269a.f146788Q));
            } catch (Throwable th3) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while sending message status", C11053a.this.logger, C11053a.this.crashReporter), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: cq0.a$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$sendUpdateMessageStatus$2", m100430f = "ChatRepository.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34698w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ MessageStatus f34700y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MessageStatus messageStatus, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34700y = messageStatus;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11053a.this.new h(this.f34700y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<Boolean>> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34698w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11053a.this.chatApi;
                    String messageId = this.f34700y.getMessageId();
                    MessageStatus messageStatus = this.f34700y;
                    this.f34698w = 1;
                    obj = chatApi.sendUpdateMessageStatus(messageId, messageStatus, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return Resource.INSTANCE.success(Boolean.valueOf(((C29218v0) obj).f118269a.f146788Q));
            } catch (Throwable th3) {
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(th3, "Exception occurred while sending update message status", C11053a.this.logger, C11053a.this.crashReporter), null, null, DomainException.INSTANCE.m23148a(th3), 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: cq0.a$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository$updateNotificationSettings$2", m100430f = "ChatRepository.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34701w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f34703y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f34704z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i13, String str, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34703y = i13;
            this.f34704z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C11053a.this.new i(this.f34703y, this.f34704z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34701w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatApi chatApi = C11053a.this.chatApi;
                    int i14 = this.f34703y;
                    String str = this.f34704z;
                    this.f34701w = 1;
                    obj = chatApi.updateNotificationSetting(i14, str, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                z4 = ((C29218v0) obj).f118269a.f146788Q;
            } catch (Throwable th3) {
                AbstractC36685b.m117759a(th3, "Exception occurred while updating the notification settings ", C11053a.this.logger, C11053a.this.crashReporter);
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: cq0.a$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.repository.ChatRepository", m100430f = "ChatRepository.kt", m100431l = {29, 36}, m100432m = "uploadChatAttachment", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f34705E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f34706F;

        /* JADX INFO: renamed from: H */
        int f34708H;

        /* JADX INFO: renamed from: w */
        Object f34709w;

        /* JADX INFO: renamed from: x */
        Object f34710x;

        /* JADX INFO: renamed from: y */
        Object f34711y;

        /* JADX INFO: renamed from: z */
        Object f34712z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34706F = obj;
            this.f34708H |= Integer.MIN_VALUE;
            return C11053a.this.m29718l(null, null, null, this);
        }
    }

    public C11053a(ChatApi chatApi, InterfaceC34116n logger, InterfaceC18732d dispatcherFactory, InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(chatApi, "chatApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.chatApi = chatApi;
        this.logger = logger;
        this.dispatcherFactory = dispatcherFactory;
        this.crashReporter = crashReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m29711e(Bitmap bitmap, InterfaceC30057d<? super byte[]> interfaceC30057d) throws Throwable {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f34682z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f34682z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8705K = bVar.f34680x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f34682z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            InterfaceC30063j interfaceC30063j = this.dispatcherFactory.getDefault();
            c cVar = new c(bitmap, null);
            bVar.f34679w = null;
            bVar.f34682z = 1;
            objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, cVar, bVar);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        AbstractC22676k.m65749i(objM8705K, "withContext(...)");
        return objM8705K;
    }

    /* JADX INFO: renamed from: f */
    public final Object m29712f(int i13, int i14, InterfaceC30057d<? super Resource<? extends List<C3546b>>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new d(i13, i14, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: g */
    public final Object m29713g(int i13, InterfaceC30057d<? super Resource<C3548d>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new e(i13, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: h */
    public final Object m29714h(ReportMessage reportMessage, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new f(reportMessage, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    public final Object m29715i(MessageStatus messageStatus, InterfaceC30057d<? super Resource<Boolean>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new g(messageStatus, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: j */
    public final Object m29716j(MessageStatus messageStatus, InterfaceC30057d<? super Resource<Boolean>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new h(messageStatus, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    public final Object m29717k(int i13, String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new i(i13, str, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m29718l(java.lang.String r8, java.lang.String r9, android.graphics.Bitmap r10, q83.InterfaceC30057d<? super java.lang.String> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof cq0.C11053a.j
            if (r0 == 0) goto L13
            r0 = r11
            cq0.a$j r0 = (cq0.C11053a.j) r0
            int r1 = r0.f34708H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34708H = r1
            goto L18
        L13:
            cq0.a$j r0 = new cq0.a$j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f34706F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f34708H
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L4a
            if (r2 != r4) goto L42
            java.lang.Object r8 = r0.f34705E
            ud3.i0 r8 = (ud3.C34820i0) r8
            java.lang.Object r8 = r0.f34712z
            byte[] r8 = (byte[]) r8
            java.lang.Object r8 = r0.f34711y
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            java.lang.Object r8 = r0.f34710x
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f34709w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Exception -> L40
            goto L9e
        L40:
            r8 = move-exception
            goto La5
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4a:
            java.lang.Object r8 = r0.f34711y
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            java.lang.Object r8 = r0.f34710x
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f34709w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r11)
            goto L6d
        L5b:
            p505ts.AbstractC34132o.m107864I(r11)
            r0.f34709w = r8
            r0.f34710x = r9
            r0.f34711y = r6
            r0.f34708H = r5
            java.lang.Object r11 = r7.m29711e(r10, r0)
            if (r11 != r1) goto L6d
            goto L9d
        L6d:
            byte[] r11 = (byte[]) r11
            ud3.u0 r10 = ud3.AbstractC34846v0.Companion
            yb3.p r2 = ud3.C34818h0.f146589e
            java.lang.String r2 = "image/*"
            ud3.h0 r2 = androidx.room.AbstractC1772c1.m5373J(r2)
            int r5 = r11.length
            r10.getClass()
            ud3.t0 r10 = ud3.C34844u0.m109926c(r2, r11, r3, r5)
            java.lang.String r11 = "file"
            java.lang.String r2 = "attachment.png"
            ud3.i0 r10 = p463rj.AbstractC31484o.m96963o(r11, r2, r10)
            com.whoop.community.data.network.ChatApi r11 = r7.chatApi     // Catch: java.lang.Exception -> L40
            r0.f34709w = r6     // Catch: java.lang.Exception -> L40
            r0.f34710x = r6     // Catch: java.lang.Exception -> L40
            r0.f34711y = r6     // Catch: java.lang.Exception -> L40
            r0.f34712z = r6     // Catch: java.lang.Exception -> L40
            r0.f34705E = r6     // Catch: java.lang.Exception -> L40
            r0.f34708H = r4     // Catch: java.lang.Exception -> L40
            java.lang.Object r11 = r11.uploadChatAttachment(r10, r9, r8, r0)     // Catch: java.lang.Exception -> L40
            if (r11 != r1) goto L9e
        L9d:
            return r1
        L9e:
            com.whoop.community.data.network.AttachmentResponseDto r11 = (com.whoop.community.data.network.AttachmentResponseDto) r11     // Catch: java.lang.Exception -> L40
            java.lang.String r8 = r11.getImageUrl()     // Catch: java.lang.Exception -> L40
            return r8
        La5:
            tr2.n r9 = r7.logger
            java.lang.String r10 = "Error in uploadChatAttachment: "
            qr2.a$a[] r11 = new qr2.AbstractC30556a.a[r3]
            r9.mo85230v(r10, r8, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cq0.C11053a.m29718l(java.lang.String, java.lang.String, android.graphics.Bitmap, q83.d):java.lang.Object");
    }
}
