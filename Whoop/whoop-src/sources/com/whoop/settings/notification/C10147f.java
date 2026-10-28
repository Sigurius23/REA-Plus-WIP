package com.whoop.settings.notification;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.NotificationSettingDto;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleResponse;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ic2.C18396a;
import ic2.C18402g;
import ic2.C18403h;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.settings.notification.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/settings/notification/f;", "", "<init>", "()V", "Lec3/l;", "Lcom/whoop/settings/notification/b;", "upstream", "Lic2/g;", "a", "(Lec3/l;)Lec3/l;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10147f {

    /* JADX INFO: renamed from: com.whoop.settings.notification.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f30686w;

        /* JADX INFO: renamed from: com.whoop.settings.notification.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41419a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f30687w;

            /* JADX INFO: renamed from: com.whoop.settings.notification.f$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SettingsNotificationViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41420a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f30688E;

                /* JADX INFO: renamed from: F */
                Object f30689F;

                /* JADX INFO: renamed from: G */
                Object f30690G;

                /* JADX INFO: renamed from: H */
                int f30691H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f30692w;

                /* JADX INFO: renamed from: x */
                int f30693x;

                /* JADX INFO: renamed from: y */
                Object f30694y;

                public C41420a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f30692w = obj;
                    this.f30693x |= Integer.MIN_VALUE;
                    return C41419a.this.emit(null, this);
                }
            }

            public C41419a(InterfaceC13062m interfaceC13062m) {
                this.f30687w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41420a c41420a;
                ShepherdToggleResponse shepherdDetectionToggle;
                ShepherdToggleResponse shepherdNotificationToggle;
                if (interfaceC30057d instanceof C41420a) {
                    c41420a = (C41420a) interfaceC30057d;
                    int i13 = c41420a.f30693x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41420a.f30693x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41420a = new C41420a(interfaceC30057d);
                    }
                } else {
                    c41420a = new C41420a(interfaceC30057d);
                }
                Object obj2 = c41420a.f30692w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41420a.f30693x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f30687w;
                    AbstractC10143b abstractC10143b = (AbstractC10143b) obj;
                    if (!(abstractC10143b instanceof AbstractC10143b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC10143b.a aVar = (AbstractC10143b.a) abstractC10143b;
                    List<NotificationSettingDto> listM25679a = aVar.m25679a();
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM25679a, 10));
                    for (NotificationSettingDto notificationSettingDto : listM25679a) {
                        arrayList.add(new C18396a(notificationSettingDto.isActive(), notificationSettingDto.getNamespace(), AbstractC8693b.m21278l(notificationSettingDto.getSubtitle()), AbstractC8693b.m21278l(notificationSettingDto.getTitle())));
                    }
                    ShepherdToggleSettingsResponse shepherdSetting = aVar.getShepherdSetting();
                    C18403h c18403h = (shepherdSetting == null || (shepherdNotificationToggle = shepherdSetting.getShepherdNotificationToggle()) == null) ? null : new C18403h(shepherdNotificationToggle.getEnabled(), new TextResource.C8691e(shepherdNotificationToggle.getDescription()), new TextResource.C8691e(shepherdNotificationToggle.getTitle()), shepherdNotificationToggle.getTitle());
                    ShepherdToggleSettingsResponse shepherdSetting2 = aVar.getShepherdSetting();
                    C18402g c18402g = new C18402g(false, arrayList, c18403h, (shepherdSetting2 == null || (shepherdDetectionToggle = shepherdSetting2.getShepherdDetectionToggle()) == null) ? false : shepherdDetectionToggle.getEnabled());
                    c41420a.f30694y = null;
                    c41420a.f30688E = null;
                    c41420a.f30689F = null;
                    c41420a.f30690G = null;
                    c41420a.f30691H = 0;
                    c41420a.f30693x = 1;
                    if (interfaceC13062m.emit(c18402g, c41420a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f30686w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f30686w.collect(new C41419a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m25704a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
