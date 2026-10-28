.class public final Lji2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000fR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0019\u00a8\u0006!"
    }
    d2 = {
        "Lji2/m;",
        "",
        "",
        "shareToStrava",
        "shareAllActivities",
        "",
        "templateName",
        "",
        "Lji2/c;",
        "sharedActivityNames",
        "navBack",
        "importActivities",
        "<init>",
        "(ZZLjava/lang/String;Ljava/util/List;ZZ)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
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

    const-string v0, "sharedActivityNames"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lji2/m;->a:Z

    .line 3
    iput-boolean p2, p0, Lji2/m;->b:Z

    .line 4
    iput-object p3, p0, Lji2/m;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lji2/m;->d:Ljava/util/List;

    .line 6
    iput-boolean p5, p0, Lji2/m;->e:Z

    .line 7
    iput-boolean p6, p0, Lji2/m;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_1

    const/4 p5, 0x0

    :cond_1
    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 8
    invoke-direct/range {p2 .. p8}, Lji2/m;-><init>(ZZLjava/lang/String;Ljava/util/List;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lji2/m;->f:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lji2/m;->e:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lji2/m;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lji2/m;->a:Z

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

    iget-object v0, p0, Lji2/m;->d:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lji2/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lji2/m;

    iget-boolean v1, p0, Lji2/m;->a:Z

    iget-boolean v3, p1, Lji2/m;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lji2/m;->b:Z

    iget-boolean v3, p1, Lji2/m;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lji2/m;->c:Ljava/lang/String;

    iget-object v3, p1, Lji2/m;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lji2/m;->d:Ljava/util/List;

    iget-object v3, p1, Lji2/m;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lji2/m;->e:Z

    iget-boolean v3, p1, Lji2/m;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lji2/m;->f:Z

    iget-boolean p1, p1, Lji2/m;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lji2/m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lji2/m;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lji2/m;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lji2/m;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lji2/m;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lji2/m;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lji2/m;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lji2/m;->a:Z

    iget-boolean v1, p0, Lji2/m;->b:Z

    iget-object v2, p0, Lji2/m;->c:Ljava/lang/String;

    iget-object v3, p0, Lji2/m;->d:Ljava/util/List;

    iget-boolean v4, p0, Lji2/m;->e:Z

    iget-boolean v5, p0, Lji2/m;->f:Z

    const-string v6, ", shareAllActivities="

    const-string v7, ", templateName="

    const-string v8, "UpdateSettingsData(shareToStrava="

    invoke-static {v8, v6, v7, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sharedActivityNames="

    const-string v6, ", navBack="

    invoke-static {v2, v1, v6, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", importActivities="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
