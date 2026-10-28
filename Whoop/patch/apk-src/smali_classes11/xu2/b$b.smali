.class public final Lxu2/b$b;
.super Lxu2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0003\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0015\u001a\u0004\u0008\u001d\u0010\u0017R\u001a\u0010#\u001a\u00020\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008 \u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lxu2/b$b;",
        "Lxu2/b;",
        "",
        "isFromWhoopCoach",
        "<init>",
        "(Z)V",
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
        "e",
        "Z",
        "()Z",
        "Lcom/whoop/design/util/TextResource$b;",
        "f",
        "Lcom/whoop/design/util/TextResource$b;",
        "l",
        "()Lcom/whoop/design/util/TextResource$b;",
        "title",
        "g",
        "j",
        "description",
        "h",
        "k",
        "primaryActionText",
        "Lhu2/b$f;",
        "i",
        "Lhu2/b$f;",
        "()Lhu2/b$f;",
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
.field private final e:Z

.field private final f:Lcom/whoop/design/util/TextResource$b;

.field private final g:Lcom/whoop/design/util/TextResource$b;

.field private final h:Lcom/whoop/design/util/TextResource$b;

.field private final i:Lhu2/b$f;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxu2/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p1, p0, Lxu2/b$b;->e:Z

    sget v0, Lcu2/h;->C0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b$b;->f:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->E0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b$b;->g:Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcu2/h;->P:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    iput-object v0, p0, Lxu2/b$b;->h:Lcom/whoop/design/util/TextResource$b;

    if-eqz p1, :cond_0

    sget-object p1, Lhu2/b$d;->w:Lhu2/b$d;

    goto :goto_0

    :cond_0
    sget-object p1, Lhu2/b$c;->w:Lhu2/b$c;

    :goto_0
    iput-object p1, p0, Lxu2/b$b;->i:Lhu2/b$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lhu2/b;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$b;->i()Lhu2/b$f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$b;->j()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$b;->k()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxu2/b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxu2/b$b;

    iget-boolean v1, p0, Lxu2/b$b;->e:Z

    iget-boolean p1, p1, Lxu2/b$b;->e:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic h()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/b$b;->l()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lxu2/b$b;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public i()Lhu2/b$f;
    .locals 1

    iget-object v0, p0, Lxu2/b$b;->i:Lhu2/b$f;

    return-object v0
.end method

.method public j()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b$b;->g:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public k()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b$b;->h:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public l()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/b$b;->f:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lxu2/b$b;->e:Z

    const-string v1, "DiscardWorkout(isFromWhoopCoach="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
