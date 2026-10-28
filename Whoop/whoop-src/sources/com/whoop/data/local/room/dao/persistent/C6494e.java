package com.whoop.data.local.room.dao.persistent;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamsDao_Impl;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import cq0.C11059g;
import fi.C14503i;
import fu2.C14789d;
import fx2.C14855g;
import i51.AbstractC18114k;
import io.getstream.chat.android.client.audio.StreamAudioPlayer;
import io.getstream.chat.android.client.audio.TrackInfo;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal.ChannelItemSwipeListener;
import java.util.Map;
import ju0.C21960b;
import mh.C25540h;
import o11.AbstractC27406l;
import o73.C27648a;
import p461rh.AbstractC31426o;
import p500tb.InterfaceC33687a;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import pg3.C29218v0;
import qk2.AbstractC30446b;
import r80.AbstractC31061c;
import s32.AbstractC32111c;
import tr2.C34109g;
import uh1.C34967b;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6494e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25389w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f25390x;

    public /* synthetic */ C6494e(int i13, int i14) {
        this.f25389w = i14;
        this.f25390x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25389w) {
            case 0:
                return OptimalStrainMappingDao_Impl.lambda$getOptimalStrainForRecovery$3(this.f25390x, (InterfaceC33687a) obj);
            case 1:
                return MemberStoryDao_Impl.lambda$getMemberStoryById$5(this.f25390x, (InterfaceC33687a) obj);
            case 2:
                return TeamInviteDao_Impl.lambda$removeInvite$5(this.f25390x, (InterfaceC33687a) obj);
            case 3:
                return TeamsDao_Impl.lambda$removeAllTeams$7(this.f25390x, (InterfaceC33687a) obj);
            case 4:
                return C11059g.m29750V(this.f25390x, (C29218v0) obj);
            case 5:
                return C11059g.m29761e0(this.f25390x, (C29218v0) obj);
            case 6:
                return AbstractC31426o.m96739c(C27648a.m83553D(((C14503i) obj).f52968a, this.f25390x));
            case 7:
                return AbstractC31426o.m96739c(C27648a.m83553D(((C14503i) obj).f52968a, this.f25390x));
            case 8:
                return AbstractC31426o.m96739c(C27648a.m83553D(((C14503i) obj).f52968a, this.f25390x));
            case 9:
                return C14789d.m42507r(this.f25390x, (WorkoutGroup) obj);
            case 10:
                return C14789d.m42511w(this.f25390x, (WorkoutExercise) obj);
            case 11:
                return C14855g.m42803H0(this.f25390x, (InterfaceC33687a) obj);
            case 12:
                return C14855g.m42805I0(this.f25390x, (InterfaceC33687a) obj);
            case 13:
                return C14855g.m42799E0(this.f25390x, (InterfaceC33687a) obj);
            case 14:
                return C14855g.m42798D0(this.f25390x, (InterfaceC33687a) obj);
            case 15:
                return AbstractC18114k.m51999k(this.f25390x, (Modifier) obj);
            case 16:
                return Boolean.valueOf(StreamAudioPlayer.removeAudio$lambda$14(this.f25390x, (TrackInfo) obj));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ChannelStateLogic.updateMessageCount$lambda$55(this.f25390x, (ChannelData) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ChannelStateImpl.setMessageCount$lambda$147(this.f25390x, (ChannelData) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(ChannelItemSwipeListener.closeAllOtherPositions$lambda$2(this.f25390x, (Map.Entry) obj));
            case 20:
                return C21960b.m62695i(this.f25390x, (InterfaceC33687a) obj);
            case 21:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f25390x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(AbstractC31061c.m95639o("Collection doesn't contain element at index ", this.f25390x, '.'));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC27406l.m82675v(this.f25390x, (C25540h) obj);
            case 24:
                return AbstractC30446b.m93135E(this.f25390x, (InterfaceC39171c) obj);
            case 25:
                return AbstractC32111c.m99941j(this.f25390x, (C25540h) obj);
            case 26:
                return C34109g.m107829w(this.f25390x, (InterfaceC33687a) obj);
            case 27:
                return C34967b.m110445p(this.f25390x, (InterfaceC33687a) obj);
            default:
                return C34967b.m110443n(this.f25390x, (InterfaceC33687a) obj);
        }
    }
}
