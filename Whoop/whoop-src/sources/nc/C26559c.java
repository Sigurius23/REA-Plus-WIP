package nc;

import android.os.Build;
import mc.C25408e;
import p114eb.AbstractC12979o0;
import p218ic.EnumC18390x;
import p364oc.C27807a;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C26559c extends AbstractC26558b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f105573b;

    /* JADX INFO: renamed from: c */
    public final int f105574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26559c(AbstractC12979o0 tracker, int i13) {
        super(tracker);
        this.f105573b = i13;
        switch (i13) {
            case 2:
                AbstractC22676k.m65750j(tracker, "tracker");
                super(tracker);
                this.f105574c = 7;
                break;
            case 3:
                AbstractC22676k.m65750j(tracker, "tracker");
                super(tracker);
                this.f105574c = 7;
                break;
            case 4:
                AbstractC22676k.m65750j(tracker, "tracker");
                super(tracker);
                this.f105574c = 9;
                break;
            default:
                AbstractC22676k.m65750j(tracker, "tracker");
                this.f105574c = 6;
                break;
        }
    }

    @Override // nc.InterfaceC26560d
    /* JADX INFO: renamed from: b */
    public final boolean mo74595b(C30207q workSpec) {
        switch (this.f105573b) {
            case 0:
                AbstractC22676k.m65750j(workSpec, "workSpec");
                return workSpec.f123643j.f71467c;
            case 1:
                AbstractC22676k.m65750j(workSpec, "workSpec");
                return workSpec.f123643j.f71469e;
            case 2:
                AbstractC22676k.m65750j(workSpec, "workSpec");
                return workSpec.f123643j.f71465a == EnumC18390x.f71561x;
            case 3:
                AbstractC22676k.m65750j(workSpec, "workSpec");
                EnumC18390x enumC18390x = workSpec.f123643j.f71465a;
                return enumC18390x == EnumC18390x.f71562y || (Build.VERSION.SDK_INT >= 30 && enumC18390x == EnumC18390x.f71558F);
            default:
                AbstractC22676k.m65750j(workSpec, "workSpec");
                return workSpec.f123643j.f71470f;
        }
    }

    @Override // nc.AbstractC26558b
    /* JADX INFO: renamed from: c */
    public final int mo78687c() {
        switch (this.f105573b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f105574c;
    }

    @Override // nc.AbstractC26558b
    /* JADX INFO: renamed from: d */
    public final boolean mo78688d(Object obj) {
        boolean zBooleanValue;
        switch (this.f105573b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                C25408e value = (C25408e) obj;
                AbstractC22676k.m65750j(value, "value");
                return (!value.f99508e && value.f99504a && value.f99505b) ? false : true;
            case 3:
                C25408e value2 = (C25408e) obj;
                AbstractC22676k.m65750j(value2, "value");
                return !value2.f99504a || value2.f99506c || value2.f99508e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26559c(C27807a tracker) {
        super(tracker);
        this.f105573b = 1;
        AbstractC22676k.m65750j(tracker, "tracker");
        this.f105574c = 5;
    }
}
