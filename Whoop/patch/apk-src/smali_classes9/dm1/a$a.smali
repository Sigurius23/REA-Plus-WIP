.class public final Ldm1/a$a;
.super Ldm1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldm1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u000eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0018\u001a\u0004\u0008\u001f\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u001e\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Ldm1/a$a;",
        "Ldm1/a;",
        "",
        "activityIdV1",
        "activityIdV2",
        "Lcom/whoop/navigation/ActivityDetailType;",
        "activityType",
        "localDate",
        "whoopActivity",
        "Lfm1/g;",
        "sourcePillar",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Ljava/lang/String;Ljava/lang/String;Lfm1/g;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "getActivityIdV1",
        "b",
        "c",
        "Lcom/whoop/navigation/ActivityDetailType;",
        "()Lcom/whoop/navigation/ActivityDetailType;",
        "d",
        "e",
        "f",
        "Lfm1/g;",
        "()Lfm1/g;",
        "home_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/whoop/navigation/ActivityDetailType;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lfm1/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Ljava/lang/String;Ljava/lang/String;Lfm1/g;)V
    .locals 1

    const-string v0, "activityIdV1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityIdV2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldm1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ldm1/a$a;->a:Ljava/lang/String;

    iput-object p2, p0, Ldm1/a$a;->b:Ljava/lang/String;

    iput-object p3, p0, Ldm1/a$a;->c:Lcom/whoop/navigation/ActivityDetailType;

    iput-object p4, p0, Ldm1/a$a;->d:Ljava/lang/String;

    iput-object p5, p0, Ldm1/a$a;->e:Ljava/lang/String;

    iput-object p6, p0, Ldm1/a$a;->f:Lfm1/g;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldm1/a$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/ActivityDetailType;
    .locals 1

    iget-object v0, p0, Ldm1/a$a;->c:Lcom/whoop/navigation/ActivityDetailType;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldm1/a$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lfm1/g;
    .locals 1

    iget-object v0, p0, Ldm1/a$a;->f:Lfm1/g;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldm1/a$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldm1/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldm1/a$a;

    iget-object v1, p0, Ldm1/a$a;->a:Ljava/lang/String;

    iget-object v3, p1, Ldm1/a$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ldm1/a$a;->b:Ljava/lang/String;

    iget-object v3, p1, Ldm1/a$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ldm1/a$a;->c:Lcom/whoop/navigation/ActivityDetailType;

    iget-object v3, p1, Ldm1/a$a;->c:Lcom/whoop/navigation/ActivityDetailType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ldm1/a$a;->d:Ljava/lang/String;

    iget-object v3, p1, Ldm1/a$a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ldm1/a$a;->e:Ljava/lang/String;

    iget-object v3, p1, Ldm1/a$a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ldm1/a$a;->f:Lfm1/g;

    iget-object p1, p1, Ldm1/a$a;->f:Lfm1/g;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ldm1/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ldm1/a$a;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ldm1/a$a;->c:Lcom/whoop/navigation/ActivityDetailType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ldm1/a$a;->d:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ldm1/a$a;->e:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ldm1/a$a;->f:Lfm1/g;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Ldm1/a$a;->a:Ljava/lang/String;

    iget-object v1, p0, Ldm1/a$a;->b:Ljava/lang/String;

    iget-object v2, p0, Ldm1/a$a;->c:Lcom/whoop/navigation/ActivityDetailType;

    iget-object v3, p0, Ldm1/a$a;->d:Ljava/lang/String;

    iget-object v4, p0, Ldm1/a$a;->e:Ljava/lang/String;

    iget-object v5, p0, Ldm1/a$a;->f:Lfm1/g;

    const-string v6, ", activityIdV2="

    const-string v7, ", activityType="

    const-string v8, "ActivityDetailsEvent(activityIdV1="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", localDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whoopActivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourcePillar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
