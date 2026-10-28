package androidx.room;

import android.view.View;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.health.platform.client.proto.C1533u;
import c43.EnumC4206v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.link.LinkActivity;
import cz.C11215n0;
import d33.C11602h1;
import ed3.C13129m;
import fg3.InterfaceC14474b;
import h20.C16657g;
import h20.C16771z;
import h20.C16776z4;
import io.getstream.video.android.core.model.IceCandidate;
import l83.C23454a0;
import l83.C23468n;
import lb3.AbstractC23811y;
import m23.C24970d;
import mb3.C25393j;
import mb3.C25395l;
import mb3.C25403t;
import mb3.InterfaceC25394k;
import n23.AbstractC26205h;
import o20.C27457b;
import o23.C27487q;
import p236j.AbstractC21065d;
import p368og.EnumC27905b;
import p414q5.C29977a;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37729k;
import p599wz.C37733l0;
import p599wz.EnumC37721h0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import pg.C29156a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import v00.C35459c0;
import y00.C38915o4;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: androidx.room.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C1836v0 extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1836v0(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f7198w = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7198w) {
            case 0:
                return AbstractC29125c.m88540q((AbstractC1848z0) this.receiver, (Function1) obj, (InterfaceC30057d) obj2);
            case 1:
                String p13 = (String) obj2;
                AbstractC22676k.m65750j(p13, "p1");
                ((C16657g) this.receiver).m47229d((C27457b) obj, p13);
                return C23454a0.f92919a;
            case 2:
                C11215n0.m30336j((C11215n0) this.receiver, (C38915o4) obj, (InterfaceC30057d) obj2);
                return EnumC31071a.f128113w;
            case 3:
                String p14 = (String) obj2;
                AbstractC22676k.m65750j(p14, "p1");
                ((C16657g) this.receiver).m47229d((C27457b) obj, p14);
                return C23454a0.f92919a;
            case 4:
                String p15 = (String) obj2;
                AbstractC22676k.m65750j(p15, "p1");
                ((C16657g) this.receiver).m47229d((C27457b) obj, p15);
                return C23454a0.f92919a;
            case 5:
                IceCandidate p16 = (IceCandidate) obj;
                EnumC4206v p17 = (EnumC4206v) obj2;
                AbstractC22676k.m65750j(p16, "p0");
                AbstractC22676k.m65750j(p17, "p1");
                C11602h1.m31020f((C11602h1) this.receiver, p16, p17);
                return C23454a0.f92919a;
            case 6:
                IceCandidate p18 = (IceCandidate) obj;
                EnumC4206v p19 = (EnumC4206v) obj2;
                AbstractC22676k.m65750j(p18, "p0");
                AbstractC22676k.m65750j(p19, "p1");
                C11602h1.m31020f((C11602h1) this.receiver, p18, p19);
                return C23454a0.f92919a;
            case 7:
                InterfaceC39443g p24 = (InterfaceC39443g) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC22676k.m65750j(p24, "p0");
                C13129m c13129m = (C13129m) this.receiver;
                c13129m.getClass();
                boolean z4 = false;
                if (!p24.isElementOptional(iIntValue)) {
                    InterfaceC39443g elementDescriptor = p24.getElementDescriptor(iIntValue);
                    AbstractC39447k kind = elementDescriptor.getKind();
                    if (AbstractC22676k.m65745e(kind, C39448l.f169715c) || AbstractC22676k.m65745e(kind, C39448l.f169714b)) {
                        c13129m.f45414i = false;
                    } else if (elementDescriptor.isNullable()) {
                        c13129m.f45414i = true;
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 8:
                Object objM47283d = ((C16776z4) this.receiver).m47283d((C38915o4) obj, (InterfaceC30057d) obj2);
                return objM47283d == EnumC31071a.f128113w ? objM47283d : new C23468n(objM47283d);
            case 9:
                float fFloatValue = ((Number) obj).floatValue();
                int iIntValue2 = ((Number) obj2).intValue();
                C24970d c24970d = (C24970d) this.receiver;
                c24970d.getClass();
                float fAbs = 1.0f - (Math.abs(fFloatValue) * ((1.0f / iIntValue2) / 4.0f));
                c24970d.f97721H.setAlpha(fAbs);
                View view = c24970d.f97719F;
                if (view != null) {
                    view.setAlpha(fAbs);
                }
                return C23454a0.f92919a;
            case 10:
                AbstractC23811y p25 = (AbstractC23811y) obj;
                AbstractC23811y p26 = (AbstractC23811y) obj2;
                AbstractC22676k.m65750j(p25, "p0");
                AbstractC22676k.m65750j(p26, "p1");
                ((C25403t) this.receiver).getClass();
                InterfaceC25394k.f99489b.getClass();
                C25395l c25395l = C25393j.f99488b;
                return Boolean.valueOf(c25395l.m74525b(p25, p26) && !c25395l.m74525b(p26, p25));
            case 11:
                AbstractC23811y p27 = (AbstractC23811y) obj;
                AbstractC23811y p28 = (AbstractC23811y) obj2;
                AbstractC22676k.m65750j(p27, "p0");
                AbstractC22676k.m65750j(p28, "p1");
                return Boolean.valueOf(((C25395l) this.receiver).m74524a(p27, p28));
            case 12:
                return C27487q.m82916a((C27487q) this.receiver, (AbstractC26205h) obj, (InterfaceC30057d) obj2);
            case 13:
                Throwable th3 = (Throwable) obj;
                InterfaceC4339a p29 = (InterfaceC4339a) obj2;
                AbstractC22676k.m65750j(p29, "p1");
                C29156a c29156a = (C29156a) this.receiver;
                InterfaceC14474b interfaceC14474b = (InterfaceC14474b) c29156a.f475x;
                if (c29156a.mo389j(EnumC27905b.f112504w)) {
                    if (th3 != null) {
                        interfaceC14474b.mo41328n((String) p29.invoke(), th3);
                    } else {
                        interfaceC14474b.error((String) p29.invoke());
                    }
                }
                return C23454a0.f92919a;
            case 14:
                InterfaceC4339a p32 = (InterfaceC4339a) obj2;
                AbstractC22676k.m65750j(p32, "p1");
                ((C29156a) this.receiver).mo390n((Throwable) obj, p32);
                return C23454a0.f92919a;
            case 15:
                Throwable th4 = (Throwable) obj;
                InterfaceC4339a msg = (InterfaceC4339a) obj2;
                AbstractC22676k.m65750j(msg, "p1");
                C29156a c29156a2 = (C29156a) this.receiver;
                InterfaceC14474b interfaceC14474b2 = (InterfaceC14474b) c29156a2.f475x;
                AbstractC22676k.m65750j(msg, "msg");
                if (c29156a2.mo389j(EnumC27905b.f112506y)) {
                    if (th4 != null) {
                        interfaceC14474b2.mo41323i((String) msg.invoke(), th4);
                    } else {
                        interfaceC14474b2.info((String) msg.invoke());
                    }
                }
                return C23454a0.f92919a;
            case 16:
                InterfaceC4339a p34 = (InterfaceC4339a) obj2;
                AbstractC22676k.m65750j(p34, "p1");
                ((C29156a) this.receiver).mo396u((Throwable) obj, p34);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC4339a p35 = (InterfaceC4339a) obj2;
                AbstractC22676k.m65750j(p35, "p1");
                ((C29156a) this.receiver).mo394s((Throwable) obj, p35);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((C29977a) this.receiver).getClass();
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1567968963) {
                        if (iHashCode != -154594663) {
                            if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                                return new NoCredentialException(str2);
                            }
                        } else if (str.equals("GET_INTERRUPTED")) {
                            return new GetCredentialInterruptedException(str2);
                        }
                    } else if (str.equals("GET_CANCELED_TAG")) {
                        return new GetCredentialCancellationException(str2);
                    }
                }
                return new GetCredentialUnknownException(str2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                ((C29977a) this.receiver).getClass();
                if (AbstractC22676k.m65745e(str3, "CREATE_CANCELED")) {
                    return new CreateCredentialCancellationException(str4);
                }
                return AbstractC22676k.m65745e(str3, "CREATE_INTERRUPTED") ? new CreateCredentialInterruptedException(str4) : new CreateCredentialUnknownException(str4);
            case 20:
                String p36 = (String) obj2;
                AbstractC22676k.m65750j(p36, "p1");
                ((C16657g) this.receiver).m47229d((C27457b) obj, p36);
                return C23454a0.f92919a;
            case 21:
                ((C16771z) this.receiver).m47279a((InterfaceC41211c) obj, ((Boolean) obj2).booleanValue());
                return C23454a0.f92919a;
            default:
                C37718g0 p37 = (C37718g0) obj;
                C35459c0 p38 = (C35459c0) obj2;
                AbstractC22676k.m65750j(p37, "p0");
                AbstractC22676k.m65750j(p38, "p1");
                LinkActivity linkActivity = (LinkActivity) this.receiver;
                linkActivity.getClass();
                AbstractC21065d abstractC21065d = linkActivity.f22195y;
                if (abstractC21065d != null) {
                    abstractC21065d.mo4052a(new C37729k(p38, new C37708d(null, null), p37, EnumC37721h0.f161649w, C37733l0.f161684w), null);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836v0(AbstractC1848z0 abstractC1848z0) {
        super(2, 1, AbstractC1772c1.class, abstractC1848z0, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.f7198w = 0;
    }
}
