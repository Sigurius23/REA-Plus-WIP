package v62;

import com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: v62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lv62/a;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;", "newProperties", "Ll83/a0;", "c", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "strapProperties", "d", "a", "()Ljava/util/List;", "b", "Ltr2/n;", "", "Ljava/util/List;", "serviceList", "strapList", "Lmc3/a;", "Lmc3/a;", "mutex", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35742a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<PropertyValuesInfo> serviceList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<PropertyValuesInfo> strapList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: v62.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.repository.RemoteDevicePropertiesForUserRepository", m100430f = "RemoteDevicePropertiesForUserRepository.kt", m100431l = {52}, m100432m = "setServiceList$remote_device_config_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f152006F;

        /* JADX INFO: renamed from: w */
        Object f152007w;

        /* JADX INFO: renamed from: x */
        Object f152008x;

        /* JADX INFO: renamed from: y */
        int f152009y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f152010z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152010z = obj;
            this.f152006F |= Integer.MIN_VALUE;
            return C35742a.this.m113226c(null, this);
        }
    }

    /* JADX INFO: renamed from: v62.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.repository.RemoteDevicePropertiesForUserRepository", m100430f = "RemoteDevicePropertiesForUserRepository.kt", m100431l = {52}, m100432m = "setStrapList$remote_device_config_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f152012F;

        /* JADX INFO: renamed from: w */
        Object f152013w;

        /* JADX INFO: renamed from: x */
        Object f152014x;

        /* JADX INFO: renamed from: y */
        int f152015y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f152016z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152016z = obj;
            this.f152012F |= Integer.MIN_VALUE;
            return C35742a.this.m113227d(null, this);
        }
    }

    public C35742a(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
        this.serviceList = new ArrayList();
        this.strapList = new ArrayList();
        this.mutex = AbstractC25438d.m74669a();
    }

    /* JADX INFO: renamed from: a */
    public final List<PropertyValuesInfo> m113224a() {
        return AbstractC25265s.m74093D1(this.serviceList);
    }

    /* JADX INFO: renamed from: b */
    public final List<PropertyValuesInfo> m113225b() {
        return AbstractC25265s.m74093D1(this.strapList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m113226c(List<PropertyValuesInfo> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f152006F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f152006F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f152010z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f152006F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            aVar.f152007w = list;
            aVar.f152008x = interfaceC25435a;
            aVar.f152009y = 0;
            aVar.f152006F = 1;
            if (interfaceC25435a.mo68211b(aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) aVar.f152008x;
            List<PropertyValuesInfo> list2 = (List) aVar.f152007w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            list = list2;
        }
        try {
            this.serviceList.clear();
            this.serviceList.addAll(list);
            this.logger.mo85219j("Fetched remote device properties - " + AbstractC25265s.m74110N0(list, null, null, null, null, 63), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m113227d(List<PropertyValuesInfo> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        InterfaceC25435a interfaceC25435a;
        Object next;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f152012F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f152012F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f152016z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f152012F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            bVar.f152013w = list;
            bVar.f152014x = interfaceC25435a;
            bVar.f152015y = 0;
            bVar.f152012F = 1;
            if (interfaceC25435a.mo68211b(bVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) bVar.f152014x;
            List<PropertyValuesInfo> list2 = (List) bVar.f152013w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            list = list2;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                PropertyValuesInfo propertyValuesInfo = (PropertyValuesInfo) obj2;
                List<PropertyValuesInfo> list3 = this.serviceList;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (AbstractC22676k.m65745e(((PropertyValuesInfo) it.next()).getPropertyName(), propertyValuesInfo.getPropertyName())) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                Object objValueOf = C23454a0.f92919a;
                if (!zHasNext) {
                    interfaceC25435a.mo68214i(null);
                    return objValueOf;
                }
                PropertyValuesInfo propertyValuesInfo2 = (PropertyValuesInfo) it3.next();
                Iterator<T> it4 = this.serviceList.iterator();
                do {
                    if (!it4.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    next = it4.next();
                } while (!AbstractC22676k.m65745e(((PropertyValuesInfo) next).getPropertyName(), propertyValuesInfo2.getPropertyName()));
                PropertyValuesInfo propertyValuesInfo3 = (PropertyValuesInfo) next;
                Iterator<PropertyValuesInfo> it5 = this.strapList.iterator();
                int i15 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i15 = -1;
                        break;
                    }
                    if (AbstractC22676k.m65745e(it5.next().getPropertyName(), propertyValuesInfo3.getPropertyName())) {
                        break;
                    }
                    i15++;
                }
                if (i15 != -1) {
                    this.strapList.set(i15, propertyValuesInfo3);
                } else {
                    objValueOf = Boolean.valueOf(this.strapList.add(new PropertyValuesInfo(propertyValuesInfo2.getPropertyName(), propertyValuesInfo3.getUserValue(), propertyValuesInfo3.getTarget())));
                }
                arrayList2.add(objValueOf);
            }
        } catch (Throwable th3) {
            interfaceC25435a.mo68214i(null);
            throw th3;
        }
    }

    public /* synthetic */ C35742a(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RemoteDeviceProperties") : interfaceC34116n);
    }
}
