.class public final synthetic Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Llive/hms/video/audio/HMSAudioManager;

.field public final synthetic x:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;->w:Llive/hms/video/audio/HMSAudioManager;

    iput-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;->x:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;->w:Llive/hms/video/audio/HMSAudioManager;

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/a;->x:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;

    invoke-static {v0, v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1;->f(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
