.class public final Lzo1/c$k;
.super Lzo1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzo1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ8\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lzo1/c$k;",
        "Lzo1/c;",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
        "response",
        "Lzo1/f;",
        "progressResult",
        "Lzo1/b;",
        "saveRequest",
        "",
        "shouldExit",
        "<init>",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)V",
        "a",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)Lzo1/c$k;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
        "d",
        "()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
        "b",
        "Lzo1/f;",
        "c",
        "()Lzo1/f;",
        "Lzo1/b;",
        "e",
        "()Lzo1/b;",
        "Z",
        "f",
        "()Z",
        "hormonal-insights_release"
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
.field private final a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

.field private final b:Lzo1/f;

.field private final c:Lzo1/b;

.field private final d:Z


# direct methods
.method public constructor <init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveRequest"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lzo1/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    .line 3
    iput-object p2, p0, Lzo1/c$k;->b:Lzo1/f;

    .line 4
    iput-object p3, p0, Lzo1/c$k;->c:Lzo1/b;

    .line 5
    iput-boolean p4, p0, Lzo1/c$k;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    .line 6
    new-instance p2, Lzo1/f;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p2, v1, v1, v0, v1}, Lzo1/f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_1

    .line 7
    new-instance v1, Lzo1/b;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v1

    :cond_1
    and-int/lit8 v0, p5, 0x8

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    move v0, p4

    .line 8
    :goto_0
    invoke-direct {p0, p1, p2, p3, v0}, Lzo1/c$k;-><init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)V

    return-void
.end method

.method public static synthetic b(Lzo1/c$k;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;ZILjava/lang/Object;)Lzo1/c$k;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lzo1/c$k;->b:Lzo1/f;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lzo1/c$k;->c:Lzo1/b;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lzo1/c$k;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lzo1/c$k;->a(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)Lzo1/c$k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)Lzo1/c$k;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveRequest"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzo1/c$k;

    invoke-direct {v0, p1, p2, p3, p4}, Lzo1/c$k;-><init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)V

    return-object v0
.end method

.method public final c()Lzo1/f;
    .locals 1

    iget-object v0, p0, Lzo1/c$k;->b:Lzo1/f;

    return-object v0
.end method

.method public final d()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;
    .locals 1

    iget-object v0, p0, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    return-object v0
.end method

.method public final e()Lzo1/b;
    .locals 1

    iget-object v0, p0, Lzo1/c$k;->c:Lzo1/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzo1/c$k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzo1/c$k;

    iget-object v1, p0, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    iget-object v3, p1, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lzo1/c$k;->b:Lzo1/f;

    iget-object v3, p1, Lzo1/c$k;->b:Lzo1/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lzo1/c$k;->c:Lzo1/b;

    iget-object v3, p1, Lzo1/c$k;->c:Lzo1/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lzo1/c$k;->d:Z

    iget-boolean p1, p1, Lzo1/c$k;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lzo1/c$k;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lzo1/c$k;->b:Lzo1/f;

    invoke-virtual {v1}, Lzo1/f;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lzo1/c$k;->c:Lzo1/b;

    invoke-virtual {v0}, Lzo1/b;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lzo1/c$k;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lzo1/c$k;->a:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;

    iget-object v1, p0, Lzo1/c$k;->b:Lzo1/f;

    iget-object v2, p0, Lzo1/c$k;->c:Lzo1/b;

    iget-boolean v3, p0, Lzo1/c$k;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Success(response="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressResult="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", saveRequest="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldExit="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
