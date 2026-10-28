.class public final Lxu2/b$a;
.super Lxu2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0018\u001a\u0004\u0008 \u0010\u001aR\u001a\u0010%\u001a\u00020\"8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010#\u001a\u0004\u0008\u001f\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lxu2/b$a;",
        "Lxu2/b;",
        "",
        "groupIndex",
        "exerciseIndex",
        "<init>",
        "(II)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "e",
        "I",
        "getGroupIndex",
        "f",
        "getExerciseIndex",
        "Lcom/whoop/design/util/TextResource$b;",
        "g",
        "Lcom/whoop/design/util/TextResource$b;",
        "l",
        "()Lcom/whoop/design/util/TextResource$b;",
        "title",
        "h",
        "j",
        "description",
        "i",
        "k",
        "primaryActionText",
        "Lhu2/f;",
        "Lhu2/f;",
        "()Lhu2/f;",
        "approveEvent",
        "weightlifting_release"
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
.field private final e:I

.field private final f:I

.field private final g:Lcom/whoop/design/util/TextResource$b;

.field private final h:Lcom/whoop/design/util/TextResource$b;

.field private final i:Lcom/whoop/design/util/TextResource$b;

.field private final j:Lhu2/f;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxu2/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lxu2/b$a;->e:I

    iput p2, p0, Lxu2/b$a;->f:I

    sget v0, Lcu2/h;->h:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b$a;->g:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->g:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b$a;->h:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->p0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b$a;->i:Lcom/whoop/design/util/TextResource$b;

    new-instance v0, Lhu2/f;

    invoke-direct {v0, p1, p2}, Lhu2/f;-><init>(II)V

    iput-object v0, p0, Lxu2/b$a;->j:Lhu2/f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lhu2/b;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$a;->i()Lhu2/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$a;->j()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$a;->k()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxu2/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxu2/b$a;

    iget v1, p0, Lxu2/b$a;->e:I

    iget v3, p1, Lxu2/b$a;->e:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lxu2/b$a;->f:I

    iget p1, p1, Lxu2/b$a;->f:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic h()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$a;->l()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lxu2/b$a;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lxu2/b$a;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public i()Lhu2/f;
    .locals 1

    iget-object v0, p0, Lxu2/b$a;->j:Lhu2/f;

    return-object v0
.end method

.method public j()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b$a;->h:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public k()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b$a;->i:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public l()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b$a;->g:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lxu2/b$a;->e:I

    iget v1, p0, Lxu2/b$a;->f:I

    const-string v2, ", exerciseIndex="

    const-string v3, ")"

    const-string v4, "DeleteExercise(groupIndex="

    invoke-static {v0, v1, v4, v2, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
