.class public final Lwz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010!\u001a\u0004\u0008\u0019\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\'\u001a\u0004\u0008\u001d\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lwz0/e;",
        "Lm91/u;",
        "",
        "Lwz0/f;",
        "steps",
        "Li51/a;",
        "repeatMode",
        "Ly3/f;",
        "height",
        "width",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onCompleteInteraction",
        "<init>",
        "(Ljava/util/List;Li51/a;FLy3/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Ljava/util/List;",
        "e",
        "()Ljava/util/List;",
        "b",
        "Li51/a;",
        "c",
        "()Li51/a;",
        "F",
        "()F",
        "d",
        "Ly3/f;",
        "f",
        "()Ly3/f;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
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
            "Lwz0/f;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Li51/a;

.field private final c:F

.field private final d:Ly3/f;

.field private final e:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method private constructor <init>(Ljava/util/List;Li51/a;FLy3/f;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwz0/f;",
            ">;",
            "Li51/a;",
            "F",
            "Ly3/f;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeatMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwz0/e;->a:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lwz0/e;->b:Li51/a;

    .line 5
    iput p3, p0, Lwz0/e;->c:F

    .line 6
    iput-object p4, p0, Lwz0/e;->d:Ly3/f;

    .line 7
    iput-object p5, p0, Lwz0/e;->e:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Li51/a;FLy3/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lwz0/e;-><init>(Ljava/util/List;Li51/a;FLy3/f;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lwz0/e;->c:F

    return v0
.end method

.method public final b()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lwz0/e;->e:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final c()Li51/a;
    .locals 1

    iget-object v0, p0, Lwz0/e;->b:Li51/a;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lwz0/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwz0/e;->a:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lwz0/e;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lwz0/e;

    iget-object v0, p0, Lwz0/e;->a:Ljava/util/List;

    iget-object v1, p1, Lwz0/e;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lwz0/e;->b:Li51/a;

    iget-object v1, p1, Lwz0/e;->b:Li51/a;

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lwz0/e;->c:F

    iget v1, p1, Lwz0/e;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lwz0/e;->d:Ly3/f;

    iget-object v1, p1, Lwz0/e;->d:Ly3/f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lwz0/e;->e:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lwz0/e;->e:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Ly3/f;
    .locals 1

    iget-object v0, p0, Lwz0/e;->d:Ly3/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lwz0/e;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lwz0/e;->b:Li51/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lwz0/e;->c:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lwz0/e;->d:Ly3/f;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget v2, v2, Ly3/f;->w:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lwz0/e;->e:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lwz0/e;->a:Ljava/util/List;

    iget-object v1, p0, Lwz0/e;->b:Li51/a;

    iget v2, p0, Lwz0/e;->c:F

    invoke-static {v2}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lwz0/e;->d:Ly3/f;

    iget-object v4, p0, Lwz0/e;->e:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AnimatedSequenceState(steps="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", repeatMode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onCompleteInteraction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
