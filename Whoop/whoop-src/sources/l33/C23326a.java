package l33;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import o53.C27591b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.event.AudioLevel;
import stream.video.sfu.event.InboundStateNotification;
import stream.video.sfu.event.InboundVideoState;
import stream.video.sfu.event.ParticipantJoined;
import stream.video.sfu.event.ParticipantLeft;
import stream.video.sfu.event.SfuEvent;
import stream.video.sfu.event.TrackPublished;
import stream.video.sfu.event.TrackUnpublished;
import stream.video.sfu.models.CallState;
import stream.video.sfu.models.ICETrickle;
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.ParticipantCount;
import stream.video.sfu.models.Pin;
import v33.AbstractC35638w;
import v33.C35614a;
import v33.C35615a0;
import v33.C35616b;
import v33.C35617b0;
import v33.C35618c;
import v33.C35619d;
import v33.C35620e;
import v33.C35621f;
import v33.C35622g;
import v33.C35623h;
import v33.C35624i;
import v33.C35625j;
import v33.C35626k;
import v33.C35627l;
import v33.C35628m;
import v33.C35629n;
import v33.C35630o;
import v33.C35631p;
import v33.C35632q;
import v33.C35633r;
import v33.C35634s;
import v33.C35635t;
import v33.C35636u;
import v33.C35637v;
import v33.C35640y;
import v33.C35641z;

/* JADX INFO: renamed from: l33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C23326a {

    /* JADX INFO: renamed from: a */
    public static final C23470p f92469a = AbstractC1772c1.m5382S(new C23326a(), "RTCEventMapper");

    /* JADX INFO: renamed from: a */
    public static AbstractC35638w m67539a(SfuEvent sfuEvent) {
        ParticipantCount participant_count;
        ParticipantCount participant_count2;
        if (sfuEvent.getSubscriber_offer() != null) {
            return new C35640y(sfuEvent.getSubscriber_offer().getSdp());
        }
        if (sfuEvent.getConnection_quality_changed() != null) {
            return new C35621f(sfuEvent.getConnection_quality_changed().getConnection_quality_updates());
        }
        if (sfuEvent.getAudio_level_changed() != null) {
            List<AudioLevel> audio_levels = sfuEvent.getAudio_level_changed().getAudio_levels();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(audio_levels, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (AudioLevel audioLevel : audio_levels) {
                linkedHashMap.put(audioLevel.getSession_id(), new C27591b(audioLevel.getLevel(), audioLevel.getUser_id(), audioLevel.getIs_speaking()));
            }
            return new C35614a(linkedHashMap);
        }
        if (sfuEvent.getChange_publish_quality() != null) {
            return new C35620e(sfuEvent.getChange_publish_quality());
        }
        if (sfuEvent.getChange_publish_options() != null) {
            return new C35619d(sfuEvent.getChange_publish_options());
        }
        if (sfuEvent.getTrack_published() != null) {
            TrackPublished track_published = sfuEvent.getTrack_published();
            return new C35641z(track_published.getUser_id(), track_published.getSession_id(), track_published.getType(), track_published.getParticipant());
        }
        if (sfuEvent.getTrack_unpublished() != null) {
            TrackUnpublished track_unpublished = sfuEvent.getTrack_unpublished();
            return new C35615a0(track_unpublished.getUser_id(), track_unpublished.getSession_id(), track_unpublished.getType(), track_unpublished.getParticipant());
        }
        if (sfuEvent.getParticipant_joined() != null) {
            ParticipantJoined participant_joined = sfuEvent.getParticipant_joined();
            Participant participant = participant_joined.getParticipant();
            AbstractC22676k.m65747g(participant);
            return new C35631p(participant, participant_joined.getCall_cid(), participant_joined.getIs_pinned());
        }
        if (sfuEvent.getParticipant_left() != null) {
            ParticipantLeft participant_left = sfuEvent.getParticipant_left();
            Participant participant2 = participant_left.getParticipant();
            AbstractC22676k.m65747g(participant2);
            return new C35632q(participant2, participant_left.getCall_cid());
        }
        if (sfuEvent.getDominant_speaker_changed() != null) {
            return new C35622g(sfuEvent.getDominant_speaker_changed().getUser_id(), sfuEvent.getDominant_speaker_changed().getSession_id());
        }
        int anonymous = 0;
        if (sfuEvent.getHealth_check_response() != null) {
            ParticipantCount participant_count3 = sfuEvent.getHealth_check_response().getParticipant_count();
            int total = participant_count3 != null ? participant_count3.getTotal() : 0;
            ParticipantCount participant_count4 = sfuEvent.getHealth_check_response().getParticipant_count();
            return new C35637v(new C35630o(total, participant_count4 != null ? participant_count4.getAnonymous() : 0));
        }
        if (sfuEvent.getJoin_response() != null) {
            CallState call_state = sfuEvent.getJoin_response().getCall_state();
            int total2 = (call_state == null || (participant_count2 = call_state.getParticipant_count()) == null) ? 0 : participant_count2.getTotal();
            CallState call_state2 = sfuEvent.getJoin_response().getCall_state();
            if (call_state2 != null && (participant_count = call_state2.getParticipant_count()) != null) {
                anonymous = participant_count.getAnonymous();
            }
            C35630o c35630o = new C35630o(total2, anonymous);
            CallState call_state3 = sfuEvent.getJoin_response().getCall_state();
            AbstractC22676k.m65747g(call_state3);
            return new C35629n(call_state3, c35630o, sfuEvent.getJoin_response().getFast_reconnect_deadline_seconds(), sfuEvent.getJoin_response().getReconnected(), sfuEvent.getJoin_response().getPublish_options());
        }
        if (sfuEvent.getIce_trickle() != null) {
            ICETrickle ice_trickle = sfuEvent.getIce_trickle();
            return new C35626k(ice_trickle.getIce_candidate(), ice_trickle.getPeer_type());
        }
        if (sfuEvent.getIce_restart() != null) {
            return new C35625j(sfuEvent.getIce_restart().getPeer_type());
        }
        if (sfuEvent.getPublisher_answer() != null) {
            return new C35636u(sfuEvent.getPublisher_answer().getSdp());
        }
        if (sfuEvent.getError() != null) {
            return new C35623h(sfuEvent.getError().getError(), sfuEvent.getError().getReconnect_strategy());
        }
        if (sfuEvent.getCall_grants_updated() != null) {
            return new C35618c(sfuEvent.getCall_grants_updated().getCurrent_grants(), sfuEvent.getCall_grants_updated().getMessage());
        }
        if (sfuEvent.getGo_away() != null) {
            return new C35624i(sfuEvent.getGo_away().getReason());
        }
        if (sfuEvent.getParticipant_migration_complete() != null) {
            return C35633r.f151435a;
        }
        if (sfuEvent.getPins_updated() != null) {
            List<Pin> pins = sfuEvent.getPins_updated().getPins();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(pins, 10));
            for (Pin pin : pins) {
                arrayList.add(new C35634s(pin.getUser_id(), pin.getSession_id()));
            }
            return new C35635t(arrayList);
        }
        if (sfuEvent.getCall_ended() != null) {
            return new C35616b(sfuEvent.getCall_ended().getReason().getValue());
        }
        InboundStateNotification inbound_state_notification = sfuEvent.getInbound_state_notification();
        C23470p c23470p = f92469a;
        if (inbound_state_notification == null) {
            C2345k c2345k = (C2345k) c23470p.getValue();
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "Unknown event: " + sfuEvent, null);
            }
            return new C35617b0(sfuEvent);
        }
        C2345k c2345k2 = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345k2.f9274b.log(enumC2341g2, str2, AbstractC11895b.m31998q("[inbound_state_notification] #sfu; #track; inbound_video_states: ", sfuEvent.getInbound_state_notification().getInbound_video_states()), null);
        }
        List<InboundVideoState> inbound_video_states = sfuEvent.getInbound_state_notification().getInbound_video_states();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(inbound_video_states, 10));
        for (InboundVideoState inboundVideoState : inbound_video_states) {
            arrayList2.add(new C35628m(inboundVideoState.getUser_id(), inboundVideoState.getSession_id(), inboundVideoState.getTrack_type(), inboundVideoState.getPaused()));
        }
        return new C35627l(arrayList2);
    }
}
