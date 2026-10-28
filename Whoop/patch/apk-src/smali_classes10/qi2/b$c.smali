.class public final Lqi2/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J.\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lqi2/b$c;",
        "Lqi2/b;",
        "Lcom/whoop/streaks/domain/models/StreaksResponse;",
        "bffData",
        "",
        "showMaxStreakDialog",
        "showRestorationDialog",
        "<init>",
        "(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)V",
        "a",
        "(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)Lqi2/b$c;",
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
        "Lcom/whoop/streaks/domain/models/StreaksResponse;",
        "c",
        "()Lcom/whoop/streaks/domain/models/StreaksResponse;",
        "b",
        "Z",
        "d",
        "()Z",
        "e",
        "streaks_release"
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
.field private final a:Lcom/whoop/streaks/domain/models/StreaksResponse;

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)V
    .locals 1

    const-string v0, "bffData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    iput-boolean p2, p0, Lqi2/b$c;->b:Z

    iput-boolean p3, p0, Lqi2/b$c;->c:Z

    return-void
.end method

.method public static synthetic b(Lqi2/b$c;Lcom/whoop/streaks/domain/models/StreaksResponse;ZZILjava/lang/Object;)Lqi2/b$c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lqi2/b$c;->b:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lqi2/b$c;->c:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lqi2/b$c;->a(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)Lqi2/b$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)Lqi2/b$c;
    .locals 1

    const-string v0, "bffData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqi2/b$c;

    invoke-direct {v0, p1, p2, p3}, Lqi2/b$c;-><init>(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)V

    return-object v0
.end method

.method public final c()Lcom/whoop/streaks/domain/models/StreaksResponse;
    .locals 1

    iget-object v0, p0, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lqi2/b$c;->b:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lqi2/b$c;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqi2/b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqi2/b$c;

    iget-object v1, p0, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    iget-object v3, p1, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lqi2/b$c;->b:Z

    iget-boolean v3, p1, Lqi2/b$c;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lqi2/b$c;->c:Z

    iget-boolean p1, p1, Lqi2/b$c;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    invoke-virtual {v0}, Lcom/whoop/streaks/domain/models/StreaksResponse;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lqi2/b$c;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lqi2/b$c;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lqi2/b$c;->a:Lcom/whoop/streaks/domain/models/StreaksResponse;

    iget-boolean v1, p0, Lqi2/b$c;->b:Z

    iget-boolean v2, p0, Lqi2/b$c;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Result(bffData="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showMaxStreakDialog="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showRestorationDialog="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
