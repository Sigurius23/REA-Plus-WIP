package com.whoop.gps.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import ii1.InterfaceC18571a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji1.InterfaceC21720a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import of3.InterfaceC27903a;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18386u;
import p218ic.C18380r;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import th1.C33813b;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yh1.C39540a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lii1/a;", "z", "Ll83/h;", "m", "()Lii1/a;", "gpsStorage", "Lji1/a;", "E", "k", "()Lji1/a;", "backendUploader", "Ljs0/c;", "F", "l", "()Ljs0/c;", "configurationRepository", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GpsBackgroundUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h backendUploader;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h configurationRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h gpsStorage;

    /* JADX INFO: renamed from: com.whoop.gps.worker.GpsBackgroundUploadWorker$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8772a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26138w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26139x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26140y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8772a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26138w = interfaceC27903a;
            this.f26139x = interfaceC35951a;
            this.f26140y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ii1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC18571a invoke() {
            InterfaceC27903a interfaceC27903a = this.f26138w;
            InterfaceC35951a interfaceC35951a = this.f26139x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26140y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18571a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gps.worker.GpsBackgroundUploadWorker$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8773b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26141w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26142x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26143y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8773b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26141w = interfaceC27903a;
            this.f26142x = interfaceC35951a;
            this.f26143y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ji1.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21720a invoke() {
            InterfaceC27903a interfaceC27903a = this.f26141w;
            InterfaceC35951a interfaceC35951a = this.f26142x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26143y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21720a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gps.worker.GpsBackgroundUploadWorker$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8774c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26144w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26145x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26146y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8774c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26144w = interfaceC27903a;
            this.f26145x = interfaceC35951a;
            this.f26146y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            InterfaceC27903a interfaceC27903a = this.f26144w;
            InterfaceC35951a interfaceC35951a = this.f26145x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26146y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gps.worker.GpsBackgroundUploadWorker$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.worker.GpsBackgroundUploadWorker", m100430f = "GpsBackgroundUploadWorker.kt", m100431l = {28, 34, 38}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8775d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f26147E;

        /* JADX INFO: renamed from: G */
        int f26149G;

        /* JADX INFO: renamed from: w */
        int f26150w;

        /* JADX INFO: renamed from: x */
        Object f26151x;

        /* JADX INFO: renamed from: y */
        Object f26152y;

        /* JADX INFO: renamed from: z */
        boolean f26153z;

        public C8775d(InterfaceC30057d<? super C8775d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26147E = obj;
            this.f26149G |= Integer.MIN_VALUE;
            return GpsBackgroundUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsBackgroundUploadWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PERIODIC_GPS_UPLOAD_WORK";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.gpsStorage = AbstractC30060g.m92087G(enumC23463i, new C8772a(this, null, null));
        this.backendUploader = AbstractC30060g.m92087G(enumC23463i, new C8773b(this, null, null));
        this.configurationRepository = AbstractC30060g.m92087G(enumC23463i, new C8774c(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC21720a m21474k() {
        return (InterfaceC21720a) this.backendUploader.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final AbstractC21909c m21475l() {
        return (AbstractC21909c) this.configurationRepository.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC18571a m21476m() {
        return (InterfaceC18571a) this.gpsStorage.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[LOOP:0: B:67:0x015c->B:69:0x0162, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C8775d c8775d;
        Object objM125868N0;
        int i13;
        List<C39540a> list;
        boolean zBooleanValue;
        ArrayList arrayList;
        Iterator<T> it;
        List<C39540a> list2;
        if (interfaceC30057d instanceof C8775d) {
            c8775d = (C8775d) interfaceC30057d;
            int i14 = c8775d.f26149G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c8775d.f26149G = i14 - Integer.MIN_VALUE;
            } else {
                c8775d = new C8775d(interfaceC30057d);
            }
        } else {
            c8775d = new C8775d(interfaceC30057d);
        }
        Object objMo53784a = c8775d.f26147E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c8775d.f26149G;
        if (i15 != 0) {
            if (i15 == 1) {
                i13 = c8775d.f26150w;
                AbstractC34132o.m107864I(objMo53784a);
            } else {
                if (i15 == 2) {
                    i13 = c8775d.f26150w;
                    list = (List) c8775d.f26151x;
                    AbstractC34132o.m107864I(objMo53784a);
                    zBooleanValue = ((Boolean) objMo53784a).booleanValue();
                    if (zBooleanValue) {
                        m22895c().mo85216g("Upload failed, will try again in next periodic run", new AbstractC30556a.a[0]);
                        return new C18380r();
                    }
                    List<C39540a> list3 = list;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Long(((C39540a) it.next()).getTimestamp()));
                    }
                    InterfaceC18571a interfaceC18571aM21476m = m21476m();
                    c8775d.f26151x = list;
                    c8775d.f26152y = null;
                    c8775d.f26150w = i13;
                    c8775d.f26153z = zBooleanValue;
                    c8775d.f26149G = 3;
                    objMo53784a = interfaceC18571aM21476m.mo53784a(arrayList, c8775d);
                    if (objMo53784a != enumC31071a) {
                        list2 = list;
                    }
                    return enumC31071a;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c8775d.f26151x;
                AbstractC34132o.m107864I(objMo53784a);
            }
            m22895c().mo85216g(AbstractC2875y.m8294g(list2.size(), ((Number) objMo53784a).intValue(), "Uploaded=", ", deleted="), new AbstractC30556a.a[0]);
            return AbstractC18386u.m52885b();
        }
        AbstractC34132o.m107864I(objMo53784a);
        AbstractC21909c abstractC21909cM21475l = m21475l();
        C33813b c33813b = C33813b.f141616a;
        C21908b configurations = abstractC21909cM21475l.getConfigurations();
        String name = c33813b.getName();
        Object defaultValue = c33813b.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue = ((Integer) defaultValue).intValue();
        InterfaceC18571a interfaceC18571aM21476m2 = m21476m();
        c8775d.f26150w = iIntValue;
        c8775d.f26149G = 1;
        Object objMo53785b = interfaceC18571aM21476m2.mo53785b(iIntValue, c8775d);
        if (objMo53785b != enumC31071a) {
            i13 = iIntValue;
            objMo53784a = objMo53785b;
        }
        return enumC31071a;
        List<C39540a> list4 = (List) objMo53784a;
        if (list4.isEmpty()) {
            return AbstractC18386u.m52885b();
        }
        InterfaceC21720a interfaceC21720aM21474k = m21474k();
        c8775d.f26151x = list4;
        c8775d.f26150w = i13;
        c8775d.f26149G = 2;
        Object objMo61195a = interfaceC21720aM21474k.mo61195a(list4, c8775d);
        if (objMo61195a != enumC31071a) {
            list = list4;
            objMo53784a = objMo61195a;
            zBooleanValue = ((Boolean) objMo53784a).booleanValue();
            if (zBooleanValue) {
                m22895c().mo85216g("Upload failed, will try again in next periodic run", new AbstractC30556a.a[0]);
                return new C18380r();
            }
            List<C39540a> list5 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((C39540a) it.next()).getTimestamp()));
            }
            InterfaceC18571a interfaceC18571aM21476m3 = m21476m();
            c8775d.f26151x = list;
            c8775d.f26152y = null;
            c8775d.f26150w = i13;
            c8775d.f26153z = zBooleanValue;
            c8775d.f26149G = 3;
            objMo53784a = interfaceC18571aM21476m3.mo53784a(arrayList, c8775d);
            if (objMo53784a != enumC31071a) {
                list2 = list;
                m22895c().mo85216g(AbstractC2875y.m8294g(list2.size(), ((Number) objMo53784a).intValue(), "Uploaded=", ", deleted="), new AbstractC30556a.a[0]);
                return AbstractC18386u.m52885b();
            }
        }
        return enumC31071a;
    }
}
