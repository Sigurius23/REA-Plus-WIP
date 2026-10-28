package pj1;

import android.os.RemoteException;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p030b7.InterfaceC2773b;
import p322m7.InterfaceC25170r0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pj1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\b\u0010\t\u001a<\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\n*\u00020\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0082@¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, m65681d2 = {"Lb7/b;", "Lj93/d;", "Lm7/r0;", "recordType", "", "", "clientRecordIdsList", "Ll83/a0;", "c", "(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "T", "records", "d", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29300d {

    /* JADX INFO: renamed from: pj1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectWhoopRecordsWriterKt", m100430f = "HealthConnectWhoopRecordsWriter.kt", m100431l = {118}, m100432m = "deleteRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f118639E;

        /* JADX INFO: renamed from: w */
        Object f118640w;

        /* JADX INFO: renamed from: x */
        Object f118641x;

        /* JADX INFO: renamed from: y */
        Object f118642y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f118643z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118643z = obj;
            this.f118639E |= Integer.MIN_VALUE;
            return AbstractC29300d.m88946c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: pj1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectWhoopRecordsWriterKt", m100430f = "HealthConnectWhoopRecordsWriter.kt", m100431l = {137}, m100432m = "insertRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T extends InterfaceC25170r0> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f118644E;

        /* JADX INFO: renamed from: w */
        Object f118645w;

        /* JADX INFO: renamed from: x */
        Object f118646x;

        /* JADX INFO: renamed from: y */
        Object f118647y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f118648z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118648z = obj;
            this.f118644E |= Integer.MIN_VALUE;
            return AbstractC29300d.m88947d(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m88946c(InterfaceC2773b interfaceC2773b, InterfaceC21461d interfaceC21461d, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Exception {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f118639E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f118639E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f118643z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f118639E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!list.isEmpty()) {
                    C25271y c25271y = C25271y.f99162w;
                    aVar.f118640w = null;
                    aVar.f118641x = interfaceC21461d;
                    aVar.f118642y = null;
                    aVar.f118639E = 1;
                    if (interfaceC2773b.mo7842g(interfaceC21461d, c25271y, list, aVar) == obj2) {
                        return obj2;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC21461d = (InterfaceC21461d) aVar.f118641x;
            AbstractC34132o.m107864I(obj);
        } catch (RemoteException e5) {
            if (!AbstractC22676k.m65745e(e5.getMessage(), "Request contains invalid UID.")) {
                throw new Exception("Failed to delete records of type " + interfaceC21461d + ", reason: " + e5.getMessage(), e5);
            }
        } catch (Exception e13) {
            throw new Exception("Failed to delete records of type " + interfaceC21461d + ", reason: " + e13.getMessage(), e13);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final <T extends InterfaceC25170r0> Object m88947d(InterfaceC2773b interfaceC2773b, InterfaceC21461d interfaceC21461d, List<? extends T> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Exception {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f118644E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f118644E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo7839c = bVar.f118648z;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f118644E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo7839c);
                if (!list.isEmpty()) {
                    bVar.f118645w = null;
                    bVar.f118646x = interfaceC21461d;
                    bVar.f118647y = null;
                    bVar.f118644E = 1;
                    objMo7839c = interfaceC2773b.mo7839c(list, bVar);
                    if (objMo7839c == obj) {
                        return obj;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC21461d = (InterfaceC21461d) bVar.f118646x;
            AbstractC34132o.m107864I(objMo7839c);
            return C23454a0.f92919a;
        } catch (Exception e5) {
            throw new Exception("Failed to insert records of type " + interfaceC21461d + " reason: " + e5.getMessage(), e5);
        }
    }
}
