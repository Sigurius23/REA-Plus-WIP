package s23;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.net.Uri;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import hc3.C17171d;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.AttachmentType;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.AudioRecordingController;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.C19544a;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import n23.AbstractC26205h;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p031b9.AbstractC2875y;
import p279kd.C22379f;
import q80.C30036h;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: s23.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C32091d implements InterfaceC32094g {

    /* JADX INFO: renamed from: a */
    public final Context f133074a;

    /* JADX INFO: renamed from: b */
    public final StreamFileManager f133075b;

    /* JADX INFO: renamed from: c */
    public EnumC32092e f133076c;

    /* JADX INFO: renamed from: d */
    public final C17171d f133077d;

    /* JADX INFO: renamed from: e */
    public C2996c2 f133078e;

    /* JADX INFO: renamed from: f */
    public C2996c2 f133079f;

    /* JADX INFO: renamed from: g */
    public final C23470p f133080g;

    /* JADX INFO: renamed from: h */
    public MediaRecorder f133081h;

    /* JADX INFO: renamed from: i */
    public File f133082i;

    /* JADX INFO: renamed from: j */
    public Long f133083j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f133084k;

    /* JADX INFO: renamed from: l */
    public C19544a f133085l;

    /* JADX INFO: renamed from: m */
    public C19544a f133086m;

    /* JADX INFO: renamed from: n */
    public C19544a f133087n;

    /* JADX INFO: renamed from: o */
    public C19544a f133088o;

    /* JADX INFO: renamed from: p */
    public C19544a f133089p;

    /* JADX INFO: renamed from: q */
    public final C30036h f133090q;

    public C32091d(Context context) {
        StreamFileManager streamFileManager = new StreamFileManager();
        this.f133074a = context;
        this.f133075b = streamFileManager;
        this.f133076c = EnumC32092e.f133091w;
        this.f133077d = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO());
        this.f133080g = AbstractC1772c1.m5382S(this, "Chat:DefaultStreamMediaRecorder");
        this.f133084k = new ArrayList();
        this.f133090q = new C30036h(this, 25);
    }

    /* JADX INFO: renamed from: a */
    public static final void m99828a(C32091d c32091d, File file) {
        c32091d.m99831d();
        MediaRecorder mediaRecorder = (MediaRecorder) c32091d.f133090q.invoke();
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(6);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setAudioEncodingBitRate(32000);
        mediaRecorder.setAudioSamplingRate(16000);
        mediaRecorder.setAudioChannels(1);
        mediaRecorder.setOutputFile(file.getPath());
        mediaRecorder.prepare();
        c32091d.m99832e(EnumC32092e.f133092x);
        c32091d.f133081h = mediaRecorder;
    }

    /* JADX INFO: renamed from: b */
    public final int m99829b(File file) {
        int iIntValue = 0;
        if (file == null) {
            return 0;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(Uri.fromFile(file).toString());
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            Integer numValueOf = strExtractMetadata != null ? Integer.valueOf(Integer.parseInt(strExtractMetadata)) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        } catch (Throwable th3) {
            try {
                C2345k c2345kM99830c = m99830c();
                InterfaceC2339e interfaceC2339e = c2345kM99830c.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345kM99830c.f9273a)) {
                    c2345kM99830c.f9274b.log(enumC2341g, c2345kM99830c.f9273a, "[getAudioDurationInMs] failed: " + th3, th3);
                }
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
            }
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public final C2345k m99830c() {
        return (C2345k) this.f133080g.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m99831d() {
        MediaRecorder mediaRecorder = this.f133081h;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        m99832e(EnumC32092e.f133091w);
        C19544a c19544a = this.f133086m;
        if (c19544a != null) {
            AudioRecordingController.setupMediaRecorder$lambda$3(c19544a.f74449a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m99832e(EnumC32092e enumC32092e) {
        this.f133076c = enumC32092e;
        C19544a c19544a = this.f133088o;
        if (c19544a != null) {
            AudioRecordingController.setupMediaRecorder$lambda$5(c19544a.f74449a, enumC32092e);
        }
        InterfaceC30057d interfaceC30057d = null;
        if (AbstractC32090c.f133073a[this.f133076c.ordinal()] != 1) {
            this.f133083j = 0L;
            C2345k c2345kM99830c = m99830c();
            InterfaceC2339e interfaceC2339e = c2345kM99830c.f9275c;
            String str = c2345kM99830c.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM99830c.f9274b.log(enumC2341g, str, "[onMediaRecorderState] #2; activeRecordingStartedAt: " + this.f133083j, null);
                return;
            }
            return;
        }
        this.f133083j = Long.valueOf(System.currentTimeMillis());
        C2345k c2345kM99830c2 = m99830c();
        InterfaceC2339e interfaceC2339e2 = c2345kM99830c2.f9275c;
        String str2 = c2345kM99830c2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345kM99830c2.f9274b.log(enumC2341g2, str2, "[onMediaRecorderState] #1; activeRecordingStartedAt: " + this.f133083j, null);
        }
        C2996c2 c2996c2 = this.f133079f;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f133079f = AbstractC3006f0.m8732z(this.f133077d, null, null, new C22379f(this, interfaceC30057d, 28), 3);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC26205h m99833f() {
        String name;
        try {
            MediaRecorder mediaRecorder = this.f133081h;
            if (mediaRecorder == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            mediaRecorder.stop();
            Long l7 = this.f133083j;
            long jCurrentTimeMillis = l7 != null ? System.currentTimeMillis() - l7.longValue() : 0L;
            int iM99829b = m99829b(this.f133082i);
            C2345k c2345kM99830c = m99830c();
            InterfaceC2339e interfaceC2339e = c2345kM99830c.f9275c;
            String str = c2345kM99830c.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM99830c.f9274b.log(enumC2341g, str, "[stopRecording] startedAt: " + this.f133083j + ", calculatedDuration: " + jCurrentTimeMillis + ", parsedDuration: " + iM99829b, null);
            }
            if (iM99829b <= 0) {
                iM99829b = (int) jCurrentTimeMillis;
            }
            C19544a c19544a = this.f133089p;
            if (c19544a != null) {
                AudioRecordingController.setupMediaRecorder$lambda$10(c19544a.f74449a, iM99829b);
            }
            m99831d();
            C19544a c19544a2 = this.f133086m;
            if (c19544a2 != null) {
                AudioRecordingController.setupMediaRecorder$lambda$3(c19544a2.f74449a);
            }
            File file = this.f133082i;
            if (file == null || (name = file.getName()) == null) {
                name = "Recording";
            }
            C32093f c32093f = new C32093f(iM99829b, new Attachment(null, null, null, null, null, null, null, MimeType.MIME_TYPE_AAC, 0, name, null, AttachmentType.AUDIO_RECORDING, null, null, null, null, null, this.f133082i, null, AbstractC25247g0.m73990Y(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, Float.valueOf(iM99829b / 1000.0f)), new C23465k(AttachmentExtensionsKt.EXTRA_WAVEFORM_DATA, this.f133084k)), 390527, null));
            C2345k c2345kM99830c2 = m99830c();
            InterfaceC2339e interfaceC2339e2 = c2345kM99830c2.f9275c;
            String str2 = c2345kM99830c2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM99830c2.f9274b.log(enumC2341g2, str2, "[stopRecording] succeed: " + c32093f, null);
            }
            return new C26204g(c32093f);
        } catch (Exception e5) {
            C2345k c2345kM99830c3 = m99830c();
            InterfaceC2339e interfaceC2339e3 = c2345kM99830c3.f9275c;
            String str3 = c2345kM99830c3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                c2345kM99830c3.f9274b.log(enumC2341g3, str3, AbstractC2875y.m8297j(e5, "[stopRecording] failed: "), e5);
            }
            m99831d();
            return new C26203f(new C26201d("Could not Stop audio recording.", e5));
        }
    }
}
