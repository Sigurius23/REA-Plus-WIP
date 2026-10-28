.class public final Lhy0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lhy0/e;",
        "Lm91/u;",
        "Lhy0/g;",
        "dividerType",
        "Lhy0/f;",
        "dividerTextPosition",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "<init>",
        "(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;)V",
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
        "Lhy0/g;",
        "b",
        "()Lhy0/g;",
        "Lhy0/f;",
        "()Lhy0/f;",
        "c",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
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
.field public static final d:I


# instance fields
.field private final a:Lhy0/g;

.field private final b:Lhy0/f;

.field private final c:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "dividerType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dividerTextPosition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhy0/e;->a:Lhy0/g;

    .line 3
    iput-object p2, p0, Lhy0/e;->b:Lhy0/f;

    .line 4
    iput-object p3, p0, Lhy0/e;->c:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    sget-object p1, Lhy0/g;->SOLID:Lhy0/g;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    sget-object p2, Lhy0/f;->LEFT:Lhy0/f;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    new-instance p3, Lcom/whoop/design/util/TextResource$e;

    const-string p4, ""

    invoke-direct {p3, p4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;)V

    return-void
.end method


# virtual methods
.method public final a()Lhy0/f;
    .locals 1

    iget-object v0, p0, Lhy0/e;->b:Lhy0/f;

    return-object v0
.end method

.method public final b()Lhy0/g;
    .locals 1

    iget-object v0, p0, Lhy0/e;->a:Lhy0/g;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lhy0/e;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhy0/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhy0/e;

    iget-object v1, p0, Lhy0/e;->a:Lhy0/g;

    iget-object v3, p1, Lhy0/e;->a:Lhy0/g;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhy0/e;->b:Lhy0/f;

    iget-object v3, p1, Lhy0/e;->b:Lhy0/f;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lhy0/e;->c:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lhy0/e;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhy0/e;->a:Lhy0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhy0/e;->b:Lhy0/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lhy0/e;->c:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lhy0/e;->a:Lhy0/g;

    iget-object v1, p0, Lhy0/e;->b:Lhy0/f;

    iget-object v2, p0, Lhy0/e;->c:Lcom/whoop/design/util/TextResource;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DividerState(dividerType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dividerTextPosition="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lq63/c;->k(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
