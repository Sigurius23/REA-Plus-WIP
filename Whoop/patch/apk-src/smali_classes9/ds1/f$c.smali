.class public final Lds1/f$c;
.super Lds1/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lds1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u001eR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010 \u001a\u0004\u0008\u0018\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lds1/f$c;",
        "Lds1/f;",
        "Lds1/p;",
        "todayCta",
        "Lgz0/m0;",
        "leftCalendarDisplayIcon",
        "rightCalendarDisplayIcon",
        "",
        "Lh11/h;",
        "entries",
        "",
        "shouldAnimate",
        "<init>",
        "(Lds1/p;Lgz0/m0;Lgz0/m0;Ljava/util/List;Z)V",
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
        "a",
        "Lds1/p;",
        "d",
        "()Lds1/p;",
        "b",
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "c",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "e",
        "Z",
        "getShouldAnimate",
        "()Z",
        "journal_release"
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
.field private final a:Lds1/p;

.field private final b:Lgz0/m0;

.field private final c:Lgz0/m0;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh11/h;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Z


# direct methods
.method public constructor <init>(Lds1/p;Lgz0/m0;Lgz0/m0;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds1/p;",
            "Lgz0/m0;",
            "Lgz0/m0;",
            "Ljava/util/List<",
            "Lh11/h;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "leftCalendarDisplayIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entries"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lds1/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lds1/f$c;->a:Lds1/p;

    iput-object p2, p0, Lds1/f$c;->b:Lgz0/m0;

    iput-object p3, p0, Lds1/f$c;->c:Lgz0/m0;

    iput-object p4, p0, Lds1/f$c;->d:Ljava/util/List;

    iput-boolean p5, p0, Lds1/f$c;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh11/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lds1/f$c;->d:Ljava/util/List;

    return-object v0
.end method

.method public final b()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lds1/f$c;->b:Lgz0/m0;

    return-object v0
.end method

.method public final c()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lds1/f$c;->c:Lgz0/m0;

    return-object v0
.end method

.method public final d()Lds1/p;
    .locals 1

    iget-object v0, p0, Lds1/f$c;->a:Lds1/p;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lds1/f$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lds1/f$c;

    iget-object v1, p0, Lds1/f$c;->a:Lds1/p;

    iget-object v3, p1, Lds1/f$c;->a:Lds1/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lds1/f$c;->b:Lgz0/m0;

    iget-object v3, p1, Lds1/f$c;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lds1/f$c;->c:Lgz0/m0;

    iget-object v3, p1, Lds1/f$c;->c:Lgz0/m0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lds1/f$c;->d:Ljava/util/List;

    iget-object v3, p1, Lds1/f$c;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lds1/f$c;->e:Z

    iget-boolean p1, p1, Lds1/f$c;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lds1/f$c;->a:Lds1/p;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lds1/p;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lds1/f$c;->b:Lgz0/m0;

    invoke-static {v3, v0, v2}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v3, p0, Lds1/f$c;->c:Lgz0/m0;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lds1/f$c;->d:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v1, p0, Lds1/f$c;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lds1/f$c;->a:Lds1/p;

    iget-object v1, p0, Lds1/f$c;->b:Lgz0/m0;

    iget-object v2, p0, Lds1/f$c;->c:Lgz0/m0;

    iget-object v3, p0, Lds1/f$c;->d:Ljava/util/List;

    iget-boolean v4, p0, Lds1/f$c;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Success(todayCta="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leftCalendarDisplayIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rightCalendarDisplayIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", entries="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldAnimate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
