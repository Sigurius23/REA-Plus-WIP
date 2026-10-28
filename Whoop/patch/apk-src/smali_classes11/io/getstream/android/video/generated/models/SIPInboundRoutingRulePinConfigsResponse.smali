.class public final Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BA\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u0014\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;",
        "",
        "customWebhookUrl",
        "",
        "pinFailedAttemptPrompt",
        "pinHangupPrompt",
        "pinPrompt",
        "pinSuccessPrompt",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getCustomWebhookUrl",
        "()Ljava/lang/String;",
        "getPinFailedAttemptPrompt",
        "getPinHangupPrompt",
        "getPinPrompt",
        "getPinSuccessPrompt",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final customWebhookUrl:Ljava/lang/String;

.field private final pinFailedAttemptPrompt:Ljava/lang/String;

.field private final pinHangupPrompt:Ljava/lang/String;

.field private final pinPrompt:Ljava/lang/String;

.field private final pinSuccessPrompt:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "custom_webhook_url"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_failed_attempt_prompt"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_hangup_prompt"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_prompt"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_success_prompt"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "custom_webhook_url"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_failed_attempt_prompt"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_hangup_prompt"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_prompt"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "pin_success_prompt"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCustomWebhookUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinFailedAttemptPrompt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinHangupPrompt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinPrompt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinSuccessPrompt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->customWebhookUrl:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinFailedAttemptPrompt:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinHangupPrompt:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinPrompt:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;->pinSuccessPrompt:Ljava/lang/String;

    const-string v5, ", pinFailedAttemptPrompt="

    const-string v6, ", pinHangupPrompt="

    const-string v7, "SIPInboundRoutingRulePinConfigsResponse(customWebhookUrl="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pinPrompt="

    const-string v5, ", pinSuccessPrompt="

    invoke-static {v0, v2, v1, v3, v5}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
