.class public final Lio2/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ>\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010\u000f\u00a8\u0006%"
    }
    d2 = {
        "Lio2/d0;",
        "Lm91/u;",
        "Lp31/p;",
        "header",
        "Ly71/o;",
        "body",
        "Lcom/whoop/navigation/e;",
        "destination",
        "",
        "cartId",
        "<init>",
        "(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)V",
        "a",
        "(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)Lio2/d0;",
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
        "Lp31/p;",
        "f",
        "()Lp31/p;",
        "b",
        "Ly71/o;",
        "c",
        "()Ly71/o;",
        "Lcom/whoop/navigation/e;",
        "e",
        "()Lcom/whoop/navigation/e;",
        "d",
        "Ljava/lang/String;",
        "getCartId",
        "universal-checkout_release"
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
.field public static final e:I


# instance fields
.field private final a:Lp31/p;

.field private final b:Ly71/o;

.field private final c:Lcom/whoop/navigation/e;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Ly71/o;->q:I

    or-int/2addr v0, v1

    sget v1, Lp31/p;->a:I

    or-int/2addr v0, v1

    sput v0, Lio2/d0;->e:I

    return-void
.end method

.method public constructor <init>(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "destination"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio2/d0;->a:Lp31/p;

    .line 3
    iput-object p2, p0, Lio2/d0;->b:Ly71/o;

    .line 4
    iput-object p3, p0, Lio2/d0;->c:Lcom/whoop/navigation/e;

    .line 5
    iput-object p4, p0, Lio2/d0;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio2/d0;-><init>(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lio2/d0;Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lio2/d0;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio2/d0;->a:Lp31/p;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio2/d0;->b:Ly71/o;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio2/d0;->c:Lcom/whoop/navigation/e;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio2/d0;->d:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio2/d0;->a(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)Lio2/d0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)Lio2/d0;
    .locals 1

    const-string v0, "destination"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio2/d0;

    invoke-direct {v0, p1, p2, p3, p4}, Lio2/d0;-><init>(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ly71/o;
    .locals 1

    iget-object v0, p0, Lio2/d0;->b:Ly71/o;

    return-object v0
.end method

.method public final e()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lio2/d0;->c:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio2/d0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio2/d0;

    iget-object v1, p0, Lio2/d0;->a:Lp31/p;

    iget-object v3, p1, Lio2/d0;->a:Lp31/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio2/d0;->b:Ly71/o;

    iget-object v3, p1, Lio2/d0;->b:Ly71/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio2/d0;->c:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lio2/d0;->c:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio2/d0;->d:Ljava/lang/String;

    iget-object p1, p1, Lio2/d0;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lp31/p;
    .locals 1

    iget-object v0, p0, Lio2/d0;->a:Lp31/p;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio2/d0;->a:Lp31/p;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio2/d0;->b:Ly71/o;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ly71/o;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio2/d0;->c:Lcom/whoop/navigation/e;

    invoke-static {v3, v0, v2}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v2, p0, Lio2/d0;->d:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio2/d0;->a:Lp31/p;

    iget-object v1, p0, Lio2/d0;->b:Ly71/o;

    iget-object v2, p0, Lio2/d0;->c:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lio2/d0;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PreviewTileState(header="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cartId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
