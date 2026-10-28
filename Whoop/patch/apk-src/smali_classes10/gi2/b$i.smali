.class public final Lgi2/b$i;
.super Lgi2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgi2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u000fR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u001a\u00a8\u0006\""
    }
    d2 = {
        "Lgi2/b$i;",
        "Lgi2/b;",
        "",
        "shareToStrava",
        "shareAllActivities",
        "",
        "templateName",
        "",
        "Lji2/c;",
        "sharedActivities",
        "navBack",
        "importActivities",
        "<init>",
        "(ZZLjava/lang/String;Ljava/util/List;ZZ)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "d",
        "()Z",
        "b",
        "c",
        "Ljava/lang/String;",
        "f",
        "Ljava/util/List;",
        "e",
        "()Ljava/util/List;",
        "strava_release"
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
.field private final a:Z

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lji2/c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Z

.field private final f:Z


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lji2/c;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "templateName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedActivities"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgi2/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p1, p0, Lgi2/b$i;->a:Z

    iput-boolean p2, p0, Lgi2/b$i;->b:Z

    iput-object p3, p0, Lgi2/b$i;->c:Ljava/lang/String;

    iput-object p4, p0, Lgi2/b$i;->d:Ljava/util/List;

    iput-boolean p5, p0, Lgi2/b$i;->e:Z

    iput-boolean p6, p0, Lgi2/b$i;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lgi2/b$i;->f:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lgi2/b$i;->e:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lgi2/b$i;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lgi2/b$i;->a:Z

    return v0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lji2/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgi2/b$i;->d:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgi2/b$i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgi2/b$i;

    iget-boolean v1, p0, Lgi2/b$i;->a:Z

    iget-boolean v3, p1, Lgi2/b$i;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lgi2/b$i;->b:Z

    iget-boolean v3, p1, Lgi2/b$i;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lgi2/b$i;->c:Ljava/lang/String;

    iget-object v3, p1, Lgi2/b$i;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lgi2/b$i;->d:Ljava/util/List;

    iget-object v3, p1, Lgi2/b$i;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lgi2/b$i;->e:Z

    iget-boolean v3, p1, Lgi2/b$i;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lgi2/b$i;->f:Z

    iget-boolean p1, p1, Lgi2/b$i;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgi2/b$i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lgi2/b$i;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lgi2/b$i;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lgi2/b$i;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lgi2/b$i;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lgi2/b$i;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lgi2/b$i;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lgi2/b$i;->a:Z

    iget-boolean v1, p0, Lgi2/b$i;->b:Z

    iget-object v2, p0, Lgi2/b$i;->c:Ljava/lang/String;

    iget-object v3, p0, Lgi2/b$i;->d:Ljava/util/List;

    iget-boolean v4, p0, Lgi2/b$i;->e:Z

    iget-boolean v5, p0, Lgi2/b$i;->f:Z

    const-string v6, ", shareAllActivities="

    const-string v7, ", templateName="

    const-string v8, "UpsertSettings(shareToStrava="

    invoke-static {v8, v6, v7, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sharedActivities="

    const-string v6, ", navBack="

    invoke-static {v2, v1, v6, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", importActivities="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
