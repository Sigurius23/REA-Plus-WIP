.class public final Lu61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJB\u0010\r\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lu61/a;",
        "",
        "",
        "Lu61/e;",
        "points",
        "Lk61/a;",
        "fillState",
        "Lk61/c;",
        "strokeState",
        "Li71/d;",
        "scrollerOffset",
        "<init>",
        "(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)V",
        "a",
        "(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)Lu61/a;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "d",
        "()Ljava/util/List;",
        "b",
        "Lk61/a;",
        "c",
        "()Lk61/a;",
        "Lk61/c;",
        "f",
        "()Lk61/c;",
        "Li71/d;",
        "e",
        "()Li71/d;",
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
            "Lu61/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lk61/a;

.field private final c:Lk61/c;

.field private final d:Li71/d;


# direct methods
.method public constructor <init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu61/e;",
            ">;",
            "Lk61/a;",
            "Lk61/c;",
            "Li71/d;",
            ")V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollerOffset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lu61/a;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lu61/a;->b:Lk61/a;

    .line 4
    iput-object p3, p0, Lu61/a;->c:Lk61/c;

    .line 5
    iput-object p4, p0, Lu61/a;->d:Li71/d;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 7
    new-instance p4, Li71/d;

    const/4 p5, 0x0

    const/4 p6, 0x3

    invoke-direct {p4, p5, v0, p6, v0}, Li71/d;-><init>(ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)V

    return-void
.end method

.method public static synthetic b(Lu61/a;Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILjava/lang/Object;)Lu61/a;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lu61/a;->a:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lu61/a;->b:Lk61/a;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lu61/a;->c:Lk61/c;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lu61/a;->d:Li71/d;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lu61/a;->a(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)Lu61/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)Lu61/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu61/e;",
            ">;",
            "Lk61/a;",
            "Lk61/c;",
            "Li71/d;",
            ")",
            "Lu61/a;"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollerOffset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu61/a;

    invoke-direct {v0, p1, p2, p3, p4}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)V

    return-object v0
.end method

.method public final c()Lk61/a;
    .locals 1

    iget-object v0, p0, Lu61/a;->b:Lk61/a;

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu61/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu61/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public final e()Li71/d;
    .locals 1

    iget-object v0, p0, Lu61/a;->d:Li71/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu61/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lu61/a;

    iget-object v1, p0, Lu61/a;->a:Ljava/util/List;

    iget-object v3, p1, Lu61/a;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lu61/a;->b:Lk61/a;

    iget-object v3, p1, Lu61/a;->b:Lk61/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lu61/a;->c:Lk61/c;

    iget-object v3, p1, Lu61/a;->c:Lk61/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lu61/a;->d:Li71/d;

    iget-object p1, p1, Lu61/a;->d:Li71/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lk61/c;
    .locals 1

    iget-object v0, p0, Lu61/a;->c:Lk61/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lu61/a;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu61/a;->b:Lk61/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lk61/a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu61/a;->c:Lk61/c;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lk61/c;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu61/a;->d:Li71/d;

    invoke-virtual {v1}, Li71/d;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lu61/a;->a:Ljava/util/List;

    iget-object v1, p0, Lu61/a;->b:Lk61/a;

    iget-object v2, p0, Lu61/a;->c:Lk61/c;

    iget-object v3, p0, Lu61/a;->d:Li71/d;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "LineGraphSegmentState(points="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strokeState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scrollerOffset="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
