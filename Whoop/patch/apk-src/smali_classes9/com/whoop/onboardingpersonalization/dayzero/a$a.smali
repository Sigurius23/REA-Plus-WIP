.class public final Lcom/whoop/onboardingpersonalization/dayzero/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/onboardingpersonalization/dayzero/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/onboardingpersonalization/dayzero/a$a;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "",
        "key",
        "b",
        "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;",
        "arguments",
        "Lcom/whoop/onboardingpersonalization/dayzero/a;",
        "a",
        "(Landroid/os/Bundle;)Lcom/whoop/onboardingpersonalization/dayzero/a;",
        "Ll02/a;",
        "deserializer",
        "Ll02/a;",
        "onboarding-personalization_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;-><init>()V

    return-void
.end method

.method private final b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Lcom/whoop/onboardingpersonalization/dayzero/a;
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "headerMetaData"

    invoke-direct {v1, v2, v0}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/whoop/onboardingpersonalization/dayzero/a;->a()Ll02/a;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    :try_start_0
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ll02/a;->c()Lad3/c;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lcom/whoop/navigation/models/ChatHeaderMetadata;->Companion:Lcom/whoop/navigation/models/ChatHeaderMetadata$Companion;

    invoke-virtual {v7}, Lcom/whoop/navigation/models/ChatHeaderMetadata$Companion;->serializer()Lwc3/c;

    move-result-object v7

    check-cast v7, Lwc3/b;

    invoke-virtual {v6, v7, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v4}, Ll02/a;->d()Ltr2/n;

    move-result-object v4

    const-class v6, Lcom/whoop/navigation/models/ChatHeaderMetadata;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-interface {v6}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Failed to deserialize query param JSON to "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Lqr2/a$a;

    invoke-interface {v4, v6, v0, v7}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_1
    move-object v0, v5

    :goto_1
    check-cast v0, Lcom/whoop/navigation/models/ChatHeaderMetadata;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ChatHeaderMetadata;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, v5

    :goto_2
    new-instance v6, Lcom/whoop/onboardingpersonalization/dayzero/a;

    const-string v7, "fingerprint"

    invoke-direct {v1, v2, v7}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v7, "sourceId"

    invoke-direct {v1, v2, v7}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    if-nez v7, :cond_3

    move-object/from16 v19, v8

    goto :goto_3

    :cond_3
    move-object/from16 v19, v7

    :goto_3
    const-string v7, "sourceType"

    invoke-direct {v1, v2, v7}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v15, v8

    goto :goto_4

    :cond_4
    move-object v15, v7

    :goto_4
    const-string v7, "source"

    invoke-direct {v1, v2, v7}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v7, "conversationSeedId"

    invoke-direct {v1, v2, v7}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    move-object v12, v8

    goto :goto_5

    :cond_5
    move-object v12, v7

    :goto_5
    new-instance v8, Lsl0/n0;

    const v27, 0x1eba7

    const/16 v28, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    invoke-direct/range {v8 .. v28}, Lsl0/n0;-><init>(Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x1

    if-eqz v2, :cond_6

    const-string v9, "dismissible"

    invoke-virtual {v2, v9, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    :cond_6
    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    if-nez v0, :cond_8

    sget-object v5, Lr12/c;->DECODE_FAILED:Lr12/c;

    goto :goto_6

    :cond_8
    if-nez v4, :cond_9

    sget-object v5, Lr12/c;->BLANK_PATH:Lr12/c;

    :cond_9
    :goto_6
    invoke-direct {v6, v8, v7, v4, v5}, Lcom/whoop/onboardingpersonalization/dayzero/a;-><init>(Lsl0/n0;ZLcom/whoop/navigation/models/ChatHeaderMetadata;Lr12/c;)V

    return-object v6
.end method
