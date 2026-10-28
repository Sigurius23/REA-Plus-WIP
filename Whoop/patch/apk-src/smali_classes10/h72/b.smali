.class public final Lh72/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh72/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lh72/b;",
        "Lwc3/c;",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "c",
        "(Lzc3/e;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;)V",
        "Lzc3/d;",
        "decoder",
        "b",
        "(Lzc3/d;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;",
        "Lyc3/g;",
        "a",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "sage_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lyc3/g;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "SageOnboardingScreen"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lh72/b;->a(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    iput-object v1, p0, Lh72/b;->a:Lyc3/g;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final a(Lyc3/a;)Ll83/a0;
    .locals 4

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "id"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "type"

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public b(Lzc3/d;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;
    .locals 11

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_d

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    const-string v2, "id"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    const-string v3, ""

    if-eqz v2, :cond_1

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    move-object v2, v3

    :cond_2
    const-string v4, "type"

    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    if-eqz v4, :cond_4

    invoke-static {v4}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    invoke-virtual {v4}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v4

    :cond_4
    :goto_1
    sget-object v4, Lj72/g;->UNKNOWN:Lj72/g;

    invoke-static {}, Lj72/g;->values()[Lj72/g;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    move v8, v7

    :goto_2
    if-ge v8, v6, :cond_6

    aget-object v9, v5, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    move-object v9, v1

    :goto_3
    if-nez v9, :cond_7

    goto :goto_4

    :cond_7
    move-object v4, v9

    :goto_4
    sget-object v2, Lh72/a;->UNKNOWN:Lh72/a;

    invoke-static {}, Lh72/a;->values()[Lh72/a;

    move-result-object v5

    array-length v6, v5

    :goto_5
    if-ge v7, v6, :cond_9

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move-object v1, v8

    goto :goto_6

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_9
    :goto_6
    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    move-object v2, v1

    :goto_7
    const-string v1, "content"

    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_c

    instance-of v1, v0, Lkotlinx/serialization/json/JsonNull;

    if-eqz v1, :cond_b

    goto/16 :goto_9

    :cond_b
    sget-object v1, Lh72/b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lh72/c;->a:Lh72/c;

    goto :goto_8

    :pswitch_1
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen$a;

    invoke-virtual {v1}, Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    goto :goto_8

    :pswitch_2
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen$a;

    invoke-virtual {v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    goto :goto_8

    :pswitch_3
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen$a;

    invoke-virtual {v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    goto :goto_8

    :pswitch_4
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;

    invoke-virtual {v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    goto :goto_8

    :pswitch_5
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen$a;

    invoke-virtual {v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    :goto_8
    new-instance v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    invoke-direct {v0, v4, v2, p1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;-><init>(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)V

    return-object v0

    :cond_c
    :goto_9
    new-instance p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    sget-object v0, Lh72/c;->a:Lh72/c;

    invoke-direct {p1, v4, v2, v0}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;-><init>(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)V

    return-object p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SageOnboardingSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lzc3/e;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll83/j;

    const-string p2, "Serialization is not implemented"

    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lh72/b;->b(Lzc3/d;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lh72/b;->a:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    invoke-virtual {p0, p1, p2}, Lh72/b;->c(Lzc3/e;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;)V

    return-void
.end method
