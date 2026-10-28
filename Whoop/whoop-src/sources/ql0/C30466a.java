package ql0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import com.whoop.data.repositories.LanguageChecker;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p412q3.C29891y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ql0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ja\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J_\u0010\u0014\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0016\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001f\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0014\u00105\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u00066"}, m65681d2 = {"Lql0/a;", "Lql0/c;", "Landroid/content/Context;", "context", "Lcom/whoop/data/repositories/LanguageChecker;", "languageChecker", "<init>", "(Landroid/content/Context;Lcom/whoop/data/repositories/LanguageChecker;)V", "Lkotlin/Function1;", "Lq3/y;", "Ll83/a0;", "onResult", "onPartialResult", "Lql0/b;", "onError", "", "onRmsChanged", "Landroid/speech/SpeechRecognizer;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/speech/SpeechRecognizer;", "i", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "d", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "stopListening", "()V", "", "c", "()Z", "a", "Landroid/content/Context;", "b", "Lcom/whoop/data/repositories/LanguageChecker;", "Ltr2/n;", "Ltr2/n;", "logger", "Lec3/p1;", "Lec3/p1;", "_isListening", "Lec3/f2;", "e", "Lec3/f2;", "()Lec3/f2;", "isListening", "f", "Landroid/speech/SpeechRecognizer;", "speechRecognizer", "g", "Z", "needsRecreation", "Landroid/content/Intent;", "Landroid/content/Intent;", "recognizerIntent", "isAvailable", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30466a implements InterfaceC30468c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LanguageChecker languageChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13075p1 _isListening;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13037f2 isListening;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SpeechRecognizer speechRecognizer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean needsRecreation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Intent recognizerIntent;

    /* JADX INFO: renamed from: ql0.a$a */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0083\u0004\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\b\u0010 J!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%¨\u0006)"}, m65681d2 = {"Lql0/a$a;", "Landroid/speech/RecognitionListener;", "Lkotlin/Function1;", "Lq3/y;", "Ll83/a0;", "onResult", "onPartialResult", "Lql0/b;", "onError", "", "onRmsChanged", "<init>", "(Lql0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "results", "onResults", "(Landroid/os/Bundle;)V", "partialResults", "onPartialResults", "params", "onReadyForSpeech", "onBeginningOfSpeech", "()V", "rmsdB", "(F)V", "", "buffer", "onBufferReceived", "([B)V", "onEndOfSpeech", "", "error", "(I)V", "eventType", "onEvent", "(ILandroid/os/Bundle;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "c", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a implements RecognitionListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function1 onResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Function1 onPartialResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Function1 onError;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Function1 onRmsChanged;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C30466a f125190e;

        public a(C30466a c30466a, Function1 onResult, Function1 onPartialResult, Function1 onError, Function1 onRmsChanged) {
            AbstractC22676k.m65750j(onResult, "onResult");
            AbstractC22676k.m65750j(onPartialResult, "onPartialResult");
            AbstractC22676k.m65750j(onError, "onError");
            AbstractC22676k.m65750j(onRmsChanged, "onRmsChanged");
            this.f125190e = c30466a;
            this.onResult = onResult;
            this.onPartialResult = onPartialResult;
            this.onError = onError;
            this.onRmsChanged = onRmsChanged;
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] buffer) {
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int error) {
            Object dVar;
            InterfaceC13075p1 interfaceC13075p1 = this.f125190e._isListening;
            Boolean bool = Boolean.FALSE;
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, bool);
            if (error == 5) {
                dVar = AbstractC30467b.a.f125191a;
            } else if (error != 7) {
                dVar = error != 9 ? new AbstractC30467b.d(error) : AbstractC30467b.b.f125192a;
            } else {
                dVar = AbstractC30467b.c.f125193a;
            }
            this.onError.invoke(dVar);
            if (error == 6 || error == 7) {
                return;
            }
            this.f125190e.needsRecreation = true;
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int eventType, Bundle params) {
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle partialResults) {
            ArrayList<String> stringArrayList;
            if (((Boolean) ((C13045h2) this.f125190e._isListening).getValue()).booleanValue()) {
                this.f125190e.logger.mo85228t(String.valueOf(partialResults), new AbstractC30556a.a[0]);
                String str = (partialResults == null || (stringArrayList = partialResults.getStringArrayList("results_recognition")) == null) ? null : (String) AbstractC25265s.m74100H0(stringArrayList);
                if (str != null) {
                    Function1 function1 = this.onPartialResult;
                    int length = str.length();
                    function1.invoke(new C29891y(4, str, AbstractC21478l0.m60431f(length, length)));
                }
            }
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle params) {
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle results) {
            ArrayList<String> stringArrayList;
            if (((Boolean) ((C13045h2) this.f125190e._isListening).getValue()).booleanValue()) {
                this.f125190e.logger.mo85228t(String.valueOf(results), new AbstractC30556a.a[0]);
                String str = (results == null || (stringArrayList = results.getStringArrayList("results_recognition")) == null) ? null : (String) AbstractC25265s.m74100H0(stringArrayList);
                if (str == null) {
                    InterfaceC13075p1 interfaceC13075p1 = this.f125190e._isListening;
                    Boolean bool = Boolean.FALSE;
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, bool);
                    this.onError.invoke(AbstractC30467b.c.f125193a);
                    return;
                }
                Function1 function1 = this.onResult;
                int length = str.length();
                function1.invoke(new C29891y(4, str, AbstractC21478l0.m60431f(length, length)));
                InterfaceC13075p1 interfaceC13075p2 = this.f125190e._isListening;
                Boolean bool2 = Boolean.FALSE;
                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                c13045h3.getClass();
                c13045h3.m36571k(null, bool2);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float rmsdB) {
            this.onRmsChanged.invoke(Float.valueOf(AbstractC12889b.m36283m((rmsdB - (-2.0f)) / 14.0f, 0.0f, 1.0f)));
        }
    }

    public C30466a(Context context, LanguageChecker languageChecker) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(languageChecker, "languageChecker");
        this.context = context;
        this.languageChecker = languageChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("AndroidSpeechRecognitionManager");
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this._isListening = c13045h2M36593c;
        this.isListening = AbstractC13091v.m36598h(c13045h2M36593c);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", languageChecker.getAllowedLanguage());
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 1500L);
        intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", 1500L);
        this.recognizerIntent = intent;
    }

    /* JADX INFO: renamed from: h */
    private final SpeechRecognizer m93226h(Function1 onResult, Function1 onPartialResult, Function1 onError, Function1 onRmsChanged) {
        C30466a c30466a;
        try {
            SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this.context);
            c30466a = this;
            try {
                speechRecognizerCreateSpeechRecognizer.setRecognitionListener(new a(c30466a, onResult, onPartialResult, onError, onRmsChanged));
                return speechRecognizerCreateSpeechRecognizer;
            } catch (Exception e5) {
                e = e5;
                c30466a.logger.mo85228t(AbstractC11266d.m30461o("SpeechRecognizer not available: ", e.getMessage()), new AbstractC30556a.a[0]);
                return null;
            }
        } catch (Exception e13) {
            e = e13;
            c30466a = this;
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m93227i(Function1 onResult, Function1 onPartialResult, Function1 onError, Function1 onRmsChanged) {
        SpeechRecognizer speechRecognizer = this.speechRecognizer;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        this.speechRecognizer = m93226h(onResult, onPartialResult, onError, onRmsChanged);
    }

    @Override // ql0.InterfaceC30468c
    /* JADX INFO: renamed from: a */
    public void mo93228a() {
        SpeechRecognizer speechRecognizer = this.speechRecognizer;
        if (speechRecognizer != null) {
            try {
                speechRecognizer.stopListening();
                speechRecognizer.cancel();
                speechRecognizer.destroy();
            } catch (Throwable th3) {
                speechRecognizer.destroy();
                throw th3;
            }
        }
        this.speechRecognizer = null;
        InterfaceC13075p1 interfaceC13075p1 = this._isListening;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
    }

    @Override // ql0.InterfaceC30468c
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13037f2 getIsListening() {
        return this.isListening;
    }

    @Override // ql0.InterfaceC30468c
    /* JADX INFO: renamed from: c */
    public boolean mo93230c() {
        return AbstractC32122c.checkSelfPermission(this.context, "android.permission.RECORD_AUDIO") == 0;
    }

    @Override // ql0.InterfaceC30468c
    /* JADX INFO: renamed from: d */
    public Object mo93231d(Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zBooleanValue = ((Boolean) ((C13045h2) this._isListening).getValue()).booleanValue();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zBooleanValue) {
            return c23454a0;
        }
        if (!isAvailable()) {
            function3.invoke(AbstractC30467b.a.f125191a);
            return c23454a0;
        }
        if (!mo93230c()) {
            function3.invoke(AbstractC30467b.b.f125192a);
            return c23454a0;
        }
        if (this.speechRecognizer == null || this.needsRecreation) {
            this.speechRecognizer = m93226h(function1, function2, function3, function4);
            this.needsRecreation = false;
        }
        SpeechRecognizer speechRecognizer = this.speechRecognizer;
        if (speechRecognizer != null) {
            try {
                speechRecognizer.cancel();
                try {
                    InterfaceC13075p1 interfaceC13075p1 = this._isListening;
                    Boolean bool = Boolean.TRUE;
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, bool);
                    speechRecognizer.startListening(this.recognizerIntent);
                } catch (Exception e5) {
                    this.logger.mo85228t("Failed to start listening after delay: " + e5.getMessage(), new AbstractC30556a.a[0]);
                    InterfaceC13075p1 interfaceC13075p2 = this._isListening;
                    Boolean bool2 = Boolean.FALSE;
                    C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                    c13045h3.getClass();
                    c13045h3.m36571k(null, bool2);
                    function3.invoke(AbstractC30467b.a.f125191a);
                    m93227i(function1, function2, function3, function4);
                }
            } catch (Exception e13) {
                this.logger.mo85228t(AbstractC11266d.m30461o("Failed to cancel previous recognition: ", e13.getMessage()), new AbstractC30556a.a[0]);
                InterfaceC13075p1 interfaceC13075p3 = this._isListening;
                Boolean bool3 = Boolean.FALSE;
                C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
                c13045h4.getClass();
                c13045h4.m36571k(null, bool3);
                function3.invoke(AbstractC30467b.a.f125191a);
                m93227i(function1, function2, function3, function4);
            }
        } else {
            function3.invoke(AbstractC30467b.a.f125191a);
        }
        return c23454a0;
    }

    @Override // ql0.InterfaceC30468c
    public boolean isAvailable() {
        return SpeechRecognizer.isRecognitionAvailable(this.context);
    }

    @Override // ql0.InterfaceC30468c
    public void stopListening() {
        SpeechRecognizer speechRecognizer;
        if (!((Boolean) ((C13045h2) this._isListening).getValue()).booleanValue() || (speechRecognizer = this.speechRecognizer) == null) {
            return;
        }
        if (speechRecognizer != null) {
            try {
                try {
                    speechRecognizer.cancel();
                } catch (Exception e5) {
                    this.logger.mo85228t("Failed to stop listening: " + e5.getMessage(), new AbstractC30556a.a[0]);
                }
            } finally {
                InterfaceC13075p1 interfaceC13075p1 = this._isListening;
                Boolean bool = Boolean.FALSE;
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
            }
        }
    }
}
