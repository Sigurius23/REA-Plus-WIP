.class public final Lny0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ:\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lny0/h0;",
        "Lm91/u;",
        "",
        "title",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "",
        "isLoading",
        "<init>",
        "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)V",
        "a",
        "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)Lny0/h0;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "f",
        "b",
        "Lgz0/m0;",
        "e",
        "()Lgz0/m0;",
        "c",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "d",
        "Z",
        "g",
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
.field private final a:Ljava/lang/String;

.field private final b:Lgz0/m0;

.field private final c:Lcom/whoop/whoopaction/domain/models/Action;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lny0/h0;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lny0/h0;->b:Lgz0/m0;

    .line 4
    iput-object p3, p0, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    .line 5
    iput-boolean p4, p0, Lny0/h0;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 6
    sget-object p2, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lny0/h0;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)V

    return-void
.end method

.method public static synthetic b(Lny0/h0;Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;ZILjava/lang/Object;)Lny0/h0;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lny0/h0;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lny0/h0;->b:Lgz0/m0;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lny0/h0;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lny0/h0;->a(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)Lny0/h0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)Lny0/h0;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lny0/h0;

    invoke-direct {v0, p1, p2, p3, p4}, Lny0/h0;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Z)V

    return-object v0
.end method

.method public final c()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final e()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lny0/h0;->b:Lgz0/m0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lny0/h0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lny0/h0;

    iget-object v1, p0, Lny0/h0;->a:Ljava/lang/String;

    iget-object v3, p1, Lny0/h0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lny0/h0;->b:Lgz0/m0;

    iget-object v3, p1, Lny0/h0;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lny0/h0;->d:Z

    iget-boolean p1, p1, Lny0/h0;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lny0/h0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lny0/h0;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lny0/h0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lny0/h0;->b:Lgz0/m0;

    invoke-static {v2, v0, v1}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v2, p0, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lny0/h0;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lny0/h0;->a:Ljava/lang/String;

    iget-object v1, p0, Lny0/h0;->b:Lgz0/m0;

    iget-object v2, p0, Lny0/h0;->c:Lcom/whoop/whoopaction/domain/models/Action;

    iget-boolean v3, p0, Lny0/h0;->d:Z

    const-string v4, ", icon="

    const-string v5, ", action="

    const-string v6, "SecondaryActionButtonState(title="

    invoke-static {v6, v0, v4, v1, v5}, Ljh3/c;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLoading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
