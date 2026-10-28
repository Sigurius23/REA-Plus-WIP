.class public final Lsz0/p0$h;
.super Lsz0/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsz0/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lsz0/p0$h;",
        "Lsz0/p0;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "displayTimeMs",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDisplayTimeElapsed",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;JLc93/a;)V",
        "f",
        "(Lcom/whoop/design/util/TextResource;JLc93/a;)Lsz0/p0$h;",
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
        "e",
        "Lcom/whoop/design/util/TextResource;",
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "J",
        "h",
        "()J",
        "g",
        "Lc93/a;",
        "i",
        "()Lc93/a;",
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


# static fields
.field public static final h:I


# instance fields
.field private final e:Lcom/whoop/design/util/TextResource;

.field private final f:J

.field private final g:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;JLc93/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "J",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDisplayTimeElapsed"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget v3, Lgy0/a;->N:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 5
    invoke-direct/range {v1 .. v6}, Lsz0/p0;-><init>(Lcom/whoop/design/util/TextResource;ILkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object v2, v1, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-wide p2, v1, Lsz0/p0$h;->f:J

    .line 8
    iput-object p4, v1, Lsz0/p0$h;->g:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 1
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget p6, Lgy0/f;->e2:I

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p1, p6, v0, v1, v0}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const-wide/16 p2, 0x3e8

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    .line 2
    new-instance p4, Lsr2/v;

    const/16 p5, 0x16

    invoke-direct {p4, p5}, Lsr2/v;-><init>(I)V

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;)V

    return-void
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lsz0/p0$h;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic g(Lsz0/p0$h;Lcom/whoop/design/util/TextResource;JLc93/a;ILjava/lang/Object;)Lsz0/p0$h;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-wide p2, p0, Lsz0/p0$h;->f:J

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lsz0/p0$h;->g:Lc93/a;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lsz0/p0$h;->f(Lcom/whoop/design/util/TextResource;JLc93/a;)Lsz0/p0$h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsz0/p0$h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsz0/p0$h;

    iget-object v1, p0, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lsz0/p0$h;->f:J

    iget-wide v5, p1, Lsz0/p0$h;->f:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsz0/p0$h;->g:Lc93/a;

    iget-object p1, p1, Lsz0/p0$h;->g:Lc93/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f(Lcom/whoop/design/util/TextResource;JLc93/a;)Lsz0/p0$h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "J",
            "Lc93/a;",
            ")",
            "Lsz0/p0$h;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDisplayTimeElapsed"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsz0/p0$h;

    invoke-direct {v0, p1, p2, p3, p4}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;)V

    return-object v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lsz0/p0$h;->f:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lsz0/p0$h;->f:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lsz0/p0$h;->g:Lc93/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lsz0/p0$h;->g:Lc93/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lsz0/p0$h;->e:Lcom/whoop/design/util/TextResource;

    iget-wide v1, p0, Lsz0/p0$h;->f:J

    iget-object v3, p0, Lsz0/p0$h;->g:Lc93/a;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Success(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayTimeMs="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", onDisplayTimeElapsed="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
