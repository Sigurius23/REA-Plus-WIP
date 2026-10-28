package live.hms.video.connection.stats.clientside.model;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/SubscribeBaseSample;", "Llive/hms/video/connection/stats/clientside/model/BaseSample;", "audio_level_high_seconds", "", "getAudio_level_high_seconds", "()J", "audio_concealed_samples", "getAudio_concealed_samples", "audio_total_samples_received", "getAudio_total_samples_received", "audio_concealment_events", "getAudio_concealment_events", "fec_packets_discarded", "getFec_packets_discarded", "fec_packets_received", "getFec_packets_received", "total_samples_duration", "", "getTotal_samples_duration", "()F", "total_packets_received", "getTotal_packets_received", "total_packets_lost", "getTotal_packets_lost", "jitter_buffer_delay", "", "getJitter_buffer_delay", "()D", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface SubscribeBaseSample extends BaseSample {
    long getAudio_concealed_samples();

    long getAudio_concealment_events();

    long getAudio_level_high_seconds();

    long getAudio_total_samples_received();

    long getFec_packets_discarded();

    long getFec_packets_received();

    double getJitter_buffer_delay();

    long getTotal_packets_lost();

    long getTotal_packets_received();

    float getTotal_samples_duration();
}
