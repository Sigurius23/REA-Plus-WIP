.class public final Lxk2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJB\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lxk2/f;",
        "",
        "Lmk2/i;",
        "strain",
        "",
        "Lxk2/j;",
        "buffer",
        "",
        "lastProcessedTimestampMillis",
        "Lxk2/h;",
        "profile",
        "<init>",
        "(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)V",
        "a",
        "(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)Lxk2/f;",
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
        "Lmk2/i;",
        "e",
        "()Lmk2/i;",
        "b",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "c",
        "Ljava/lang/Long;",
        "()Ljava/lang/Long;",
        "d",
        "Lxk2/h;",
        "()Lxk2/h;",
        "track-activity_release"
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
.field private final a:Lmk2/i;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Long;

.field private final d:Lxk2/h;


# direct methods
.method public constructor <init>(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/i;",
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;",
            "Ljava/lang/Long;",
            "Lxk2/h;",
            ")V"
        }
    .end annotation

    const-string v0, "strain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxk2/f;->a:Lmk2/i;

    .line 3
    iput-object p2, p0, Lxk2/f;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lxk2/f;->c:Ljava/lang/Long;

    .line 5
    iput-object p4, p0, Lxk2/f;->d:Lxk2/h;

    return-void
.end method

.method public synthetic constructor <init>(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 6
    new-instance v1, Lmk2/i;

    const/16 v12, 0xff

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v1 .. v13}, Lmk2/i;-><init>(FFFLjava/lang/Float;FFDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    .line 7
    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :cond_1
    move-object/from16 v0, p2

    :goto_0
    and-int/lit8 v1, p5, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v1, v2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p5, 0x8

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v2, p4

    .line 8
    :goto_2
    invoke-direct {p0, p1, v0, v1, v2}, Lxk2/f;-><init>(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)V

    return-void
.end method


# virtual methods
.method public final a(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)Lxk2/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/i;",
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;",
            "Ljava/lang/Long;",
            "Lxk2/h;",
            ")",
            "Lxk2/f;"
        }
    .end annotation

    const-string v0, "strain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxk2/f;

    invoke-direct {v0, p1, p2, p3, p4}, Lxk2/f;-><init>(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;)V

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxk2/f;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lxk2/f;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public final d()Lxk2/h;
    .locals 1

    iget-object v0, p0, Lxk2/f;->d:Lxk2/h;

    return-object v0
.end method

.method public final e()Lmk2/i;
    .locals 1

    iget-object v0, p0, Lxk2/f;->a:Lmk2/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxk2/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxk2/f;

    iget-object v1, p0, Lxk2/f;->a:Lmk2/i;

    iget-object v3, p1, Lxk2/f;->a:Lmk2/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxk2/f;->b:Ljava/util/List;

    iget-object v3, p1, Lxk2/f;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxk2/f;->c:Ljava/lang/Long;

    iget-object v3, p1, Lxk2/f;->c:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxk2/f;->d:Lxk2/h;

    iget-object p1, p1, Lxk2/f;->d:Lxk2/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lxk2/f;->a:Lmk2/i;

    invoke-virtual {v0}, Lmk2/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lxk2/f;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lxk2/f;->c:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lxk2/f;->d:Lxk2/h;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lxk2/h;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lxk2/f;->a:Lmk2/i;

    iget-object v1, p0, Lxk2/f;->b:Ljava/util/List;

    iget-object v2, p0, Lxk2/f;->c:Ljava/lang/Long;

    iget-object v3, p0, Lxk2/f;->d:Lxk2/h;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StrainAccumulation(strain="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", buffer="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastProcessedTimestampMillis="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", profile="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
