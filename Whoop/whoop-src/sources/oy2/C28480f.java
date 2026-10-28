package oy2;

import androidx.core.app.NotificationCompat;
import com.whoop.whooplabs.data.domain.ProtocolStepType;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nz2.AbstractC27308b;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: oy2.f */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b$\u0010%J>\u0010&\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b&\u0010'J,\u0010#\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b#\u0010\u001fJ6\u0010(\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b(\u0010\"J4\u0010)\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b)\u0010%J>\u0010*\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b*\u0010'J,\u0010+\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b+\u0010\u001fJ6\u0010,\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b,\u0010\"J4\u0010-\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b-\u0010%J>\u0010.\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b.\u0010'J,\u0010/\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b/\u0010\u001fJ6\u00100\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b0\u0010\"J4\u00101\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b1\u0010%J>\u00102\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b2\u0010'J,\u00103\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b3\u0010\u001fJ6\u00104\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b4\u0010\"J4\u00105\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b5\u0010%J>\u00106\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0096\u0001¢\u0006\u0004\b6\u0010'J4\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010<¨\u0006="}, m65681d2 = {"Loy2/f;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "message", "Ll83/a0;", "A", "(Ljava/lang/String;)V", "y", "", "throwable", "z", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "step", "Loy2/p;", "timerState", "", "sessionId", "B", "(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Loy2/p;Ljava/lang/Integer;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Z", NotificationCompat.CATEGORY_MESSAGE, "", "Lqr2/a$a;", "tags", "j", "(Ljava/lang/String;[Lqr2/a$a;)V", "messageTag", "b", "(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V", "t", "s", "(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "x", "i", "o", "g", "k", "a", "n", "q", "p", "c", "l", "m", "e", "v", "f", "priority", "tag", "error", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28480f implements InterfaceC34116n {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: oy2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f115277a;

        static {
            int[] iArr = new int[ProtocolStepType.values().length];
            try {
                iArr[ProtocolStepType.TYPEFORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtocolStepType.BP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtocolStepType.BTHR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtocolStepType.SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtocolStepType.NUMBER_INPUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtocolStepType.TEXT_INPUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtocolStepType.TIME_PICKER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f115277a = iArr;
        }
    }

    public C28480f(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: A */
    public final void m86707A(String message) {
        AbstractC22676k.m65750j(message, "message");
        this.logger.mo85216g(message, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: B */
    public final void m86708B(ProtocolStepWithOptions step, AbstractC28490p timerState, Integer sessionId) {
        AbstractC22676k.m65750j(step, "step");
        AbstractC22676k.m65750j(timerState, "timerState");
        StringBuilder sbM30465s = AbstractC11266d.m30465s(step.getProtocolStep().getOrder() + 1, step.getProtocolStep().getId(), "Study step loaded: #", " (", "), session #");
        sbM30465s.append(sessionId);
        StringBuilder sb4 = new StringBuilder(sbM30465s.toString());
        switch (a.f115277a[step.getProtocolStep().getStepType().ordinal()]) {
            case 1:
                sb4.append(", web view: " + step.getProtocolStep().getTypeFormUrl());
                break;
            case 2:
                sb4.append(", bp step: " + step.getProtocolStep().isBpStep());
                break;
            case 3:
                sb4.append(", bthr step: " + step.getProtocolStep().isBtHr());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                sb4.append(", custom input type: " + step.getProtocolStep().getStepType());
                break;
        }
        if (timerState instanceof AbstractC28490p.a) {
            AbstractC28490p.a aVar = (AbstractC28490p.a) timerState;
            if (aVar.getIsCountDown()) {
                sb4.append(", with " + aVar.getSeconds() + " countdown timer.");
            } else {
                sb4.append(", with timer.");
            }
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        interfaceC34116n.mo85216g(string, new AbstractC30556a.a[0]);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: a */
    public void mo85211a(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85211a(msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: b */
    public void mo85212b(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85212b(messageTag, msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: c */
    public void mo85213c(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85213c(msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: e */
    public void mo85214e(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85214e(messageTag, msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: f */
    public void mo85215f(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85215f(messageTag, msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: g */
    public void mo85216g(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85216g(msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: h */
    public void mo85217h(int priority, String tag, String message, Throwable error) {
        AbstractC22676k.m65750j(message, "message");
        this.logger.mo85217h(priority, tag, message, error);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: i */
    public void mo85218i(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85218i(msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: j */
    public void mo85219j(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85219j(msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: k */
    public void mo85220k(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85220k(messageTag, msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: l */
    public void mo85221l(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85221l(messageTag, msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: m */
    public void mo85222m(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85222m(msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: n */
    public void mo85223n(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85223n(messageTag, msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: o */
    public void mo85224o(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85224o(messageTag, msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: p */
    public void mo85225p(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85225p(messageTag, msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: q */
    public void mo85226q(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85226q(msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: s */
    public void mo85227s(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85227s(msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: t */
    public void mo85228t(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85228t(msg, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: u */
    public void mo85229u(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85229u(messageTag, msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: v */
    public void mo85230v(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85230v(msg, t14, tags);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: w */
    public boolean mo85231w() {
        return this.logger.mo85231w();
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: x */
    public void mo85232x(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85232x(messageTag, msg, tags);
    }

    /* JADX INFO: renamed from: y */
    public final void m86709y(String message) {
        AbstractC22676k.m65750j(message, "message");
        this.logger.mo85222m(message, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: z */
    public final void m86710z(String message, Throwable throwable) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(throwable, "throwable");
        this.logger.mo85230v(message, throwable, new AbstractC30556a.a[0]);
    }

    public /* synthetic */ C28480f(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC27308b.m82458a("CampaignStepsInteractor") : interfaceC34116n);
    }
}
