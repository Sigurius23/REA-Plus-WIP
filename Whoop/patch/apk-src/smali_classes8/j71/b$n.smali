.class public final Lj71/b$n;
.super Lj71/b;
.source "SourceFile"

# interfaces
.implements Lcz0/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj71/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010\u0013R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010\n\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010!\u001a\u0004\u0008\u001e\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lj71/b$n;",
        "Lj71/b;",
        "Lcz0/r;",
        "",
        "Lu61/a;",
        "segments",
        "",
        "id",
        "",
        "skipScrubbing",
        "hideWhileScrubbing",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;ZZ)V",
        "",
        "xInput",
        "Lcz0/s;",
        "a",
        "(F)Lcz0/s;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "e",
        "()Ljava/util/List;",
        "b",
        "Ljava/lang/String;",
        "c",
        "Z",
        "d",
        "()Z",
        "design_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu61/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu61/a;",
            ">;",
            "Ljava/lang/String;",
            "ZZ)V"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lj71/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lj71/b$n;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lj71/b$n;->b:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lj71/b$n;->c:Z

    .line 5
    iput-boolean p4, p0, Lj71/b$n;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lj71/b$n;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-void
.end method


# virtual methods
.method public a(F)Lcz0/s;
    .locals 2

    iget-object v0, p0, Lj71/b$n;->a:Ljava/util/List;

    invoke-virtual {p0}, Lj71/b$n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcz0/t;->f(Ljava/util/List;FLjava/lang/String;)Lcz0/s;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lj71/b$n;->d:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj71/b$n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lj71/b$n;->c:Z

    return v0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu61/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj71/b$n;->a:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj71/b$n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj71/b$n;

    iget-object v1, p0, Lj71/b$n;->a:Ljava/util/List;

    iget-object v3, p1, Lj71/b$n;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj71/b$n;->b:Ljava/lang/String;

    iget-object v3, p1, Lj71/b$n;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lj71/b$n;->c:Z

    iget-boolean v3, p1, Lj71/b$n;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lj71/b$n;->d:Z

    iget-boolean p1, p1, Lj71/b$n;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lj71/b$n;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj71/b$n;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lj71/b$n;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lj71/b$n;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lj71/b$n;->a:Ljava/util/List;

    iget-object v1, p0, Lj71/b$n;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lj71/b$n;->c:Z

    iget-boolean v3, p0, Lj71/b$n;->d:Z

    const-string v4, ", id="

    const-string v5, ", skipScrubbing="

    const-string v6, "Zoom(segments="

    invoke-static {v6, v4, v1, v5, v0}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hideWhileScrubbing="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
