.class public final Lot2/m$i;
.super Lot2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lot2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010#\u001a\u0004\u0008$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010&\u001a\u0004\u0008\u001b\u0010\'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008\u001f\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010+\u001a\u0004\u0008(\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lot2/m$i;",
        "Lot2/m;",
        "Lot2/p;",
        "initialScreen",
        "Lot2/r;",
        "metricSelectionScreen",
        "Lot2/t;",
        "sliderScreen",
        "Lot2/a;",
        "activitiesScreen",
        "Lot2/c;",
        "behaviorsScreen",
        "Lep0/j;",
        "screenContextMetadata",
        "<init>",
        "(Lot2/p;Lot2/r;Lot2/t;Lot2/a;Lot2/c;Lep0/j;)V",
        "",
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
        "Lot2/p;",
        "c",
        "()Lot2/p;",
        "b",
        "Lot2/r;",
        "d",
        "()Lot2/r;",
        "Lot2/t;",
        "f",
        "()Lot2/t;",
        "Lot2/a;",
        "()Lot2/a;",
        "e",
        "Lot2/c;",
        "()Lot2/c;",
        "Lep0/j;",
        "()Lep0/j;",
        "weekly-plan_release"
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
.field private final a:Lot2/p;

.field private final b:Lot2/r;

.field private final c:Lot2/t;

.field private final d:Lot2/a;

.field private final e:Lot2/c;

.field private final f:Lep0/j;


# direct methods
.method public constructor <init>(Lot2/p;Lot2/r;Lot2/t;Lot2/a;Lot2/c;Lep0/j;)V
    .locals 1

    const-string v0, "initialScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricSelectionScreen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lot2/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lot2/m$i;->a:Lot2/p;

    iput-object p2, p0, Lot2/m$i;->b:Lot2/r;

    iput-object p3, p0, Lot2/m$i;->c:Lot2/t;

    iput-object p4, p0, Lot2/m$i;->d:Lot2/a;

    iput-object p5, p0, Lot2/m$i;->e:Lot2/c;

    iput-object p6, p0, Lot2/m$i;->f:Lep0/j;

    return-void
.end method


# virtual methods
.method public final a()Lot2/a;
    .locals 1

    iget-object v0, p0, Lot2/m$i;->d:Lot2/a;

    return-object v0
.end method

.method public final b()Lot2/c;
    .locals 1

    iget-object v0, p0, Lot2/m$i;->e:Lot2/c;

    return-object v0
.end method

.method public final c()Lot2/p;
    .locals 1

    iget-object v0, p0, Lot2/m$i;->a:Lot2/p;

    return-object v0
.end method

.method public final d()Lot2/r;
    .locals 1

    iget-object v0, p0, Lot2/m$i;->b:Lot2/r;

    return-object v0
.end method

.method public final e()Lep0/j;
    .locals 1

    iget-object v0, p0, Lot2/m$i;->f:Lep0/j;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lot2/m$i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lot2/m$i;

    iget-object v1, p0, Lot2/m$i;->a:Lot2/p;

    iget-object v3, p1, Lot2/m$i;->a:Lot2/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lot2/m$i;->b:Lot2/r;

    iget-object v3, p1, Lot2/m$i;->b:Lot2/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lot2/m$i;->c:Lot2/t;

    iget-object v3, p1, Lot2/m$i;->c:Lot2/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lot2/m$i;->d:Lot2/a;

    iget-object v3, p1, Lot2/m$i;->d:Lot2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lot2/m$i;->e:Lot2/c;

    iget-object v3, p1, Lot2/m$i;->e:Lot2/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lot2/m$i;->f:Lep0/j;

    iget-object p1, p1, Lot2/m$i;->f:Lep0/j;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lot2/t;
    .locals 1

    iget-object v0, p0, Lot2/m$i;->c:Lot2/t;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lot2/m$i;->a:Lot2/p;

    invoke-virtual {v0}, Lot2/p;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lot2/m$i;->b:Lot2/r;

    invoke-virtual {v1}, Lot2/r;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lot2/m$i;->c:Lot2/t;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lot2/t;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lot2/m$i;->d:Lot2/a;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lot2/a;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lot2/m$i;->e:Lot2/c;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lot2/c;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lot2/m$i;->f:Lep0/j;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lep0/j;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lot2/m$i;->a:Lot2/p;

    iget-object v1, p0, Lot2/m$i;->b:Lot2/r;

    iget-object v2, p0, Lot2/m$i;->c:Lot2/t;

    iget-object v3, p0, Lot2/m$i;->d:Lot2/a;

    iget-object v4, p0, Lot2/m$i;->e:Lot2/c;

    iget-object v5, p0, Lot2/m$i;->f:Lep0/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Success(initialScreen="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricSelectionScreen="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sliderScreen="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", activitiesScreen="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", behaviorsScreen="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", screenContextMetadata="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
