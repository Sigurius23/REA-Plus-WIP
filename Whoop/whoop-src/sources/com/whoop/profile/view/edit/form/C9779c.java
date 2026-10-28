package com.whoop.profile.view.edit.form;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractC10537e;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cp0.AbstractC10986p;
import cp0.AbstractC11009x0;
import cq0.C11059g;
import cz.AbstractC11227t0;
import cz0.AbstractC11245f;
import d11.AbstractC11471f;
import d61.InterfaceC11732a;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import mh.C25540h;
import p114eb.C12970k1;
import p114eb.C12982q;
import p114eb.C12999y0;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.form.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9779c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28435w;

    public /* synthetic */ C9779c(int i13) {
        this.f28435w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28435w) {
            case 0:
                return EditProfileFormUtils.handleUsernameFieldBlur$lambda$1((FieldState) obj);
            case 1:
                return EditProfileFormUtils.handleUsernameFieldBlur$lambda$2((FieldState) obj);
            case 2:
                return EditProfileTextFieldKt.EditProfileTextField_iQW2vr8$lambda$1$0(((Boolean) obj).booleanValue());
            case 3:
                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$0$0((String) obj);
            case 4:
                return AbstractC10463c.m26727d(obj);
            case 5:
                return AbstractC10537e.m27175d((View) obj);
            case 6:
                return AbstractC10986p.m29332x((C29891y) obj);
            case 7:
                return AbstractC10986p.m29298F((String) obj);
            case 8:
                return AbstractC11009x0.m29468a0(((Integer) obj).intValue());
            case 9:
                return C11059g.m29766h0((C29218v0) obj);
            case 10:
                return StrengthTrainerDestination.C10738a.m28024p((C12999y0) obj);
            case 11:
                return StrengthTrainerDestination.C10738a.m28020i((C12982q) obj);
            case 12:
                return StrengthTrainerDestination.C10738a.m28023m((C12999y0) obj);
            case 13:
                return StrengthTrainerDestination.C10739b.m28037d((C12982q) obj);
            case 14:
                return StrengthTrainerDestination.C10741d.m28054j((C12982q) obj);
            case 15:
                return StrengthTrainerDestination.C10742e.m28076i((C12982q) obj);
            case 16:
                return StrengthTrainerDestination.C10742e.m28078m((C12999y0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return StrengthTrainerDestination.C10742e.m28079n((C12970k1) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return StrengthTrainerDestination.C10743f.m28091c((C12982q) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return StrengthTrainerDestination.C10744g.m28097d((C12982q) obj);
            case 20:
                return StrengthTrainerDestination.C10745h.m28104d((C12982q) obj);
            case 21:
                return StrengthTrainerDestination.C10746i.m28115c((C12982q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return StrengthTrainerDestination.C10747j.m28119b((C12982q) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC10757a.m28152P((C12982q) obj);
            case 24:
                List it = (List) obj;
                AbstractC22676k.m65750j(it, "it");
                return (AbstractC11227t0) AbstractC25265s.m74112P0(it);
            case 25:
                return AbstractC11245f.m30354e((InterfaceC11732a) obj);
            case 26:
                return C23454a0.f92919a;
            case 27:
                return C23454a0.f92919a;
            case 28:
                return C23454a0.f92919a;
            default:
                return AbstractC11471f.m30795t((C25540h) obj);
        }
    }
}
