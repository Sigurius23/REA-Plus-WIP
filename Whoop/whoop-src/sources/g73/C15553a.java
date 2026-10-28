package g73;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.Editable;
import android.text.Selection;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import fe3.AbstractC14421e;
import hn.InterfaceC17510r;
import im.InterfaceC18653b;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.anr.C20058f;
import io.sentry.cache.tape.InterfaceC20288e;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executors;
import jg3.AbstractC21688o;
import jg3.C21676c;
import jg3.C21677d;
import jg3.C21678e;
import jg3.C21682i;
import jg3.C21689p;
import l33.C23326a;
import lk.InterfaceC24484c;
import me3.InterfaceC25479b;
import ml.InterfaceC25661c;
import ml.InterfaceC25662d;
import n23.AbstractC26205h;
import n23.C26200c;
import n23.C26203f;
import n23.C26204g;
import ne3.C26624l;
import ng3.AbstractC26703p;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.DateTimeException;
import p020ap.ExecutorC1878a;
import p088dc.AbstractC11895b;
import p185h6.C16970y;
import p215i9.InterfaceC18241q;
import p217ib.InterfaceC18311h;
import p244j6.C21357b;
import p314m.InterfaceC24832c;
import p324m9.InterfaceC25282j;
import p343nk.AbstractC26793n;
import p479s4.AbstractC32120a;
import p516u8.AbstractC34590f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.C29839x;
import q83.InterfaceC30057d;
import stream.video.sfu.event.SfuEvent;
import stream.video.sfu.models.Error;
import u33.EnumC34512e;
import ug.AbstractC34924m;
import v33.AbstractC35638w;
import v33.C35623h;
import v33.C35639x;
import x43.C37981m;
import x43.C37982n;
import x43.InterfaceC37973e;

/* JADX INFO: renamed from: g73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15553a implements InterfaceC18653b, InterfaceC37973e, InterfaceC17510r, InterfaceC18241q, InterfaceC18311h, InterfaceC20288e, InterfaceC26704q, InterfaceC24484c, InterfaceC24832c, InterfaceC25282j, InterfaceC25479b, InterfaceC25661c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58380w;

    public /* synthetic */ C15553a(int i13) {
        this.f58380w = i13;
    }

    /* JADX INFO: renamed from: o */
    public static final String m43788o(AbstractC29840y abstractC29840y) {
        if (abstractC29840y instanceof C29824j) {
            return "googlepay";
        }
        if (abstractC29840y instanceof C29838w) {
            return "savedpm";
        }
        if ((abstractC29840y instanceof C29828m) || (abstractC29840y instanceof C29822i) || (abstractC29840y instanceof C29818g) || (abstractC29840y instanceof AbstractC29835t)) {
            return AbstractC34924m.m110125G(abstractC29840y) ? "link" : "newpm";
        }
        if (abstractC29840y == null) {
            return "unknown";
        }
        if (abstractC29840y instanceof C29839x) {
            return "shop_pay";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    public static final String m43789p(EventReporter$Mode eventReporter$Mode, String str) {
        return "mc_" + eventReporter$Mode + "_" + str;
    }

    /* JADX INFO: renamed from: r */
    public static final Field m43790r(InterfaceC20602v0 interfaceC20602v0, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("tag");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, AbstractC11895b.m31996o("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m43791t(C21357b c21357b, Editable editable, int i13, int i14, boolean z4) {
        int iMin;
        if (editable != null && i13 >= 0 && i14 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z4) {
                    int iMax = Math.max(i13, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z13 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z13) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z13) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z13 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i14, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z14 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z14) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z14) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z14 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i13, 0);
                    iMin = Math.min(selectionEnd + i14, editable.length());
                }
                C16970y[] c16970yArr = (C16970y[]) editable.getSpans(selectionStart, iMin, C16970y.class);
                if (c16970yArr != null && c16970yArr.length > 0) {
                    for (C16970y c16970y : c16970yArr) {
                        int spanStart = editable.getSpanStart(c16970y);
                        int spanEnd = editable.getSpanEnd(c16970y);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c21357b.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c21357b.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static C26204g m43792v(C35623h c35623h) {
        C26200c c26200cM99978d;
        Error error = c35623h.f151412a;
        if (error != null) {
            c26200cM99978d = new C26200c(error.getMessage(), error.getCode().getValue(), error.getCode().getValue(), 8);
        } else {
            c26200cM99978d = AbstractC32120a.m99978d(EnumC34512e.UNABLE_TO_PARSE_SOCKET_EVENT, null, 6);
        }
        return new C26204g(new C37981m(c26200cM99978d, c35623h.f151413b));
    }

    /* JADX INFO: renamed from: w */
    public static final CharSequence m43793w(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: a */
    public MediaCodecInfo mo43794a(int i13) {
        switch (this.f58380w) {
            case 5:
                break;
        }
        return MediaCodecList.getCodecInfoAt(i13);
    }

    @Override // p324m9.InterfaceC25282j, p528un.InterfaceC35092c
    /* JADX INFO: renamed from: b */
    public long mo36164b() {
        throw new NoSuchElementException();
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: c */
    public boolean mo43795c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f58380w) {
            case 5:
                return "secure-playback".equals(str) && "video/avc".equals(str2);
            default:
                return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: d */
    public boolean mo43796d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f58380w) {
        }
        return false;
    }

    @Override // p324m9.InterfaceC25282j, p528un.InterfaceC35092c
    /* JADX INFO: renamed from: e */
    public long mo36165e() {
        throw new NoSuchElementException();
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: f */
    public int mo43797f() {
        switch (this.f58380w) {
            case 5:
                break;
        }
        return MediaCodecList.getCodecCount();
    }

    @Override // hn.InterfaceC17510r, p215i9.InterfaceC18241q
    /* JADX INFO: renamed from: g */
    public boolean mo43798g() {
        switch (this.f58380w) {
        }
        return false;
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return new ExecutorC1878a(Executors.newSingleThreadExecutor());
    }

    @Override // ml.InterfaceC25661c
    /* JADX INFO: renamed from: h */
    public void mo7696h(InterfaceC25662d interfaceC25662d) {
        interfaceC25662d.onStart();
    }

    @Override // io.sentry.cache.tape.InterfaceC20288e
    /* JADX INFO: renamed from: i */
    public Object mo2349i(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.readShort() == 1) {
                long j7 = dataInputStream.readLong();
                int i13 = dataInputStream.readInt();
                if (i13 >= 0 && i13 <= 1000) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        String utf = dataInputStream.readUTF();
                        String utf2 = dataInputStream.readUTF();
                        boolean z4 = dataInputStream.readBoolean();
                        String utf3 = dataInputStream.readUTF();
                        if (z4) {
                            utf3 = null;
                        }
                        stackTraceElementArr[i14] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                    }
                    return new C20058f(j7, stackTraceElementArr);
                }
            }
        } catch (EOFException unused) {
        }
        return null;
    }

    @Override // lk.InterfaceC24484c
    /* JADX INFO: renamed from: j */
    public Object mo704j(InterfaceC30057d interfaceC30057d) {
        throw null;
    }

    @Override // ml.InterfaceC25661c
    /* JADX INFO: renamed from: k */
    public void mo7697k(InterfaceC25662d interfaceC25662d) {
    }

    @Override // ng3.InterfaceC26704q
    /* JADX INFO: renamed from: l */
    public Object mo43799l(InterfaceC26698k interfaceC26698k) {
        switch (this.f58380w) {
            case 14:
                return C21677d.m61002q0(interfaceC26698k);
            case 15:
                if (interfaceC26698k instanceof C21682i) {
                    return (C21682i) interfaceC26698k;
                }
                try {
                    C21689p c21689pM61073o = C21689p.m61073o(interfaceC26698k);
                    try {
                        return new C21682i(C21678e.m61017r0(interfaceC26698k), c21689pM61073o);
                    } catch (DateTimeException unused) {
                        return C21682i.m61053q0(C21676c.m60991p0(interfaceC26698k), c21689pM61073o);
                    }
                } catch (DateTimeException unused2) {
                    throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC26698k + ", type " + interfaceC26698k.getClass().getName());
                }
            case 20:
                AbstractC21688o abstractC21688o = (AbstractC21688o) interfaceC26698k.mo14019g(AbstractC26703p.f106194a);
                if (abstractC21688o == null || (abstractC21688o instanceof C21689p)) {
                    return null;
                }
                return abstractC21688o;
            default:
                return (AbstractC21688o) interfaceC26698k.mo14019g(this);
        }
    }

    @Override // me3.InterfaceC25479b
    public void log(String message) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        AbstractC14421e.f52594a.mo41121j(message, 4, null);
    }

    @Override // io.sentry.cache.tape.InterfaceC20288e
    /* JADX INFO: renamed from: m */
    public void mo2353m(OutputStream outputStream, Object obj) throws IOException {
        C20058f c20058f = (C20058f) obj;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            c20058f.m55926a(dataOutputStream);
            dataOutputStream.flush();
            outputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th3) {
            try {
                dataOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // lk.InterfaceC24484c
    /* JADX INFO: renamed from: n */
    public Object mo708n(InterfaceC30057d interfaceC30057d) {
        throw null;
    }

    @Override // p324m9.InterfaceC25282j, p528un.InterfaceC35092c
    public boolean next() {
        return false;
    }

    @Override // x43.InterfaceC37973e
    /* JADX INFO: renamed from: q */
    public C26624l mo30747q(Object obj) {
        C35639x event = (C35639x) obj;
        AbstractC22676k.m65750j(event, "event");
        return event.f151441a.encodeByteString();
    }

    @Override // x43.InterfaceC37973e
    /* JADX INFO: renamed from: s */
    public AbstractC26205h mo30749s(byte[] raw) {
        AbstractC22676k.m65750j(raw, "raw");
        try {
            SfuEvent sfuEvent = (SfuEvent) SfuEvent.ADAPTER.decode(raw);
            if (sfuEvent.getError() == null) {
                return new C26204g(new C37982n(C23326a.m67539a(sfuEvent)));
            }
            AbstractC35638w abstractC35638wM67539a = C23326a.m67539a(sfuEvent);
            AbstractC22676k.m65748h(abstractC35638wM67539a, "null cannot be cast to non-null type io.getstream.video.android.core.events.ErrorEvent");
            return m43792v((C35623h) abstractC35638wM67539a);
        } catch (Exception e5) {
            return new C26203f(AbstractC32120a.m99978d(EnumC34512e.UNABLE_TO_PARSE_SOCKET_EVENT, e5, 2));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m43800u() {
        throw null;
    }

    public C15553a(AbstractC26793n abstractC26793n) {
        this.f58380w = 21;
    }

    public C15553a() {
        this.f58380w = 1;
        new HashMap();
        UUID uuid = AbstractC34590f.f145654d;
    }
}
