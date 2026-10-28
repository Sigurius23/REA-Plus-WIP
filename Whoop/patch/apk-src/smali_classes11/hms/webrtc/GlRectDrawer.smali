.class public Lhms/webrtc/GlRectDrawer;
.super Lhms/webrtc/GlGenericDrawer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/GlRectDrawer$ShaderCallbacks;
    }
.end annotation


# static fields
.field private static final FRAGMENT_SHADER:Ljava/lang/String; = "void main() {\n  gl_FragColor = sample(tc);\n}\n"


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lhms/webrtc/GlRectDrawer$ShaderCallbacks;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhms/webrtc/GlRectDrawer$ShaderCallbacks;-><init>(I)V

    const-string v1, "void main() {\n  gl_FragColor = sample(tc);\n}\n"

    invoke-direct {p0, v1, v0}, Lhms/webrtc/GlGenericDrawer;-><init>(Ljava/lang/String;Lhms/webrtc/GlGenericDrawer$ShaderCallbacks;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic drawOes(I[FIIIIII)V
    .locals 0

    invoke-super/range {p0 .. p8}, Lhms/webrtc/GlGenericDrawer;->drawOes(I[FIIIIII)V

    return-void
.end method

.method public bridge synthetic drawRgb(I[FIIIIII)V
    .locals 0

    invoke-super/range {p0 .. p8}, Lhms/webrtc/GlGenericDrawer;->drawRgb(I[FIIIIII)V

    return-void
.end method

.method public bridge synthetic drawYuv([I[FIIIIII)V
    .locals 0

    invoke-super/range {p0 .. p8}, Lhms/webrtc/GlGenericDrawer;->drawYuv([I[FIIIIII)V

    return-void
.end method

.method public bridge synthetic release()V
    .locals 0

    invoke-super {p0}, Lhms/webrtc/GlGenericDrawer;->release()V

    return-void
.end method
