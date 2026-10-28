.class public final synthetic Lar0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lar0/a;->w:I

    iput-object p1, p0, Lar0/a;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lar0/a;->w:I

    const-string v1, "failed to write refreshed token back to disk at "

    const-string v2, "Calculated chunk signature: "

    iget-object v3, p0, Lar0/a;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const-string v0, "Service returned malformed \"Date\" header value \""

    const-string v1, "\", skipping skew calculation"

    invoke-static {v0, v3, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v3}, Lxr0/a;->c(Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {v2, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    const-string v0, "Chunk string to sign:\n"

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    const-string v0, "Calculated signature: "

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    const-string v0, "String to sign:\n"

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {v2, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_6
    const-string v0, "Chunk trailer string to sign:\n"

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {v1, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {v1, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_9
    return-object v3

    :pswitch_a
    const-string v0, "HttpResponse:\n"

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_b
    const-string v0, "HttpRequest:\n"

    invoke-static {v0, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {v3}, Lrx0/g;->b(Ljava/lang/String;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {v3}, Lcom/whoop/universalcheckout/features/a;->k(Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {v3}, Lor0/a;->c(Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {v3}, Lni0/c;->x(Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->GetMessageIdentifier(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_11
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->DeleteMessageForMeIdentifier(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_12
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->GetMessageIdentifier(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {v3}, Lfr0/a;->b(Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {v3}, Lar0/b;->a(Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
