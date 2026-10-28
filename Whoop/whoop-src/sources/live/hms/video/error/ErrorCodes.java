package live.hms.video.error;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes;", "", "<init>", "()V", "WebSocketConnectionErrors", "InitAPIErrors", "TracksErrors", "WebrtcErrors", "WebsocketMethodErrors", "GenericErrors", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ErrorCodes {
    public static final ErrorCodes INSTANCE = new ErrorCodes();

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes$GenericErrors;", "", "<init>", "()V", "cNotConnected", "", "cSignalling", "cUnknown", "cNotReady", "cJsonParsingFailed", "cTrackMetadataMissing", "cRTCTrackMissing", "cPeerMetadataMissing", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class GenericErrors {
        public static final GenericErrors INSTANCE = new GenericErrors();
        public static final int cJsonParsingFailed = 6004;
        public static final int cNotConnected = 6000;
        public static final int cNotReady = 6003;
        public static final int cPeerMetadataMissing = 6007;
        public static final int cRTCTrackMissing = 6006;
        public static final int cSignalling = 6001;
        public static final int cTrackMetadataMissing = 6005;
        public static final int cUnknown = 6002;

        private GenericErrors() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes$InitAPIErrors;", "", "<init>", "()V", "cServerErrors", "", "cConnectionLost", "cHTTPError", "cInvalidEndpointURL", "cEndpointUnreachable", "cInvalidTokenFormat", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class InitAPIErrors {
        public static final InitAPIErrors INSTANCE = new InitAPIErrors();
        public static final int cConnectionLost = 2001;
        public static final int cEndpointUnreachable = 2003;
        public static final int cHTTPError = 2400;
        public static final int cInvalidEndpointURL = 2002;
        public static final int cInvalidTokenFormat = 2004;
        public static final int cServerErrors = 2000;

        private InitAPIErrors() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes$TracksErrors;", "", "<init>", "()V", "cGenericTrack", "", "cCantAccessCaptureDevice", "cPeerConnectionFactoryDisposed", "cNothingToReturn", "cInvalidVideoSettings", "cCodecChangeNotPermitted", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class TracksErrors {
        public static final TracksErrors INSTANCE = new TracksErrors();
        public static final int cCantAccessCaptureDevice = 3001;
        public static final int cCodecChangeNotPermitted = 3007;
        public static final int cGenericTrack = 3000;
        public static final int cInvalidVideoSettings = 3006;
        public static final int cNothingToReturn = 3005;
        public static final int cPeerConnectionFactoryDisposed = 3004;

        private TracksErrors() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;", "", "<init>", "()V", "cGenericConnect", "", "cWebSocketConnectionLost", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class WebSocketConnectionErrors {
        public static final WebSocketConnectionErrors INSTANCE = new WebSocketConnectionErrors();
        public static final int cGenericConnect = 1000;
        public static final int cWebSocketConnectionLost = 1003;

        private WebSocketConnectionErrors() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes$WebrtcErrors;", "", "<init>", "()V", "cCreateOfferFailed", "", "cCreateAnswerFailed", "cSetLocalDescriptionFailed", "cSetRemoteDescriptionFailed", "cICEFailure", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class WebrtcErrors {
        public static final WebrtcErrors INSTANCE = new WebrtcErrors();
        public static final int cCreateAnswerFailed = 4002;
        public static final int cCreateOfferFailed = 4001;
        public static final int cICEFailure = 4005;
        public static final int cSetLocalDescriptionFailed = 4003;
        public static final int cSetRemoteDescriptionFailed = 4004;

        private WebrtcErrors() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/error/ErrorCodes$WebsocketMethodErrors;", "", "<init>", "()V", "cServerErrors", "", "cAlreadyJoined", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class WebsocketMethodErrors {
        public static final WebsocketMethodErrors INSTANCE = new WebsocketMethodErrors();
        public static final int cAlreadyJoined = 5001;
        public static final int cServerErrors = 5000;

        private WebsocketMethodErrors() {
        }
    }

    private ErrorCodes() {
    }
}
