.class public final La31/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "La31/a;",
        "",
        "",
        "min",
        "max",
        "<init>",
        "(II)V",
        "coercedNumber",
        "",
        "atMax",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "(Ljava/lang/Integer;Z)Lcom/whoop/design/util/TextResource;",
        "number",
        "La31/g;",
        "c",
        "(Ljava/lang/Integer;)La31/g;",
        "increment",
        "b",
        "(Ljava/lang/Integer;I)I",
        "Li93/j;",
        "Li93/j;",
        "range",
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
.field private final a:Li93/j;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-gt p1, p2, :cond_0

    new-instance v1, Li93/j;

    invoke-direct {v1, p1, p2, v0}, Li93/h;-><init>(III)V

    goto :goto_0

    :cond_0
    new-instance v1, Li93/j;

    const/4 p1, 0x0

    invoke-direct {v1, p1, p1, v0}, Li93/h;-><init>(III)V

    :goto_0
    iput-object v1, p0, La31/a;->a:Li93/j;

    return-void
.end method

.method private final a(Ljava/lang/Integer;Z)Lcom/whoop/design/util/TextResource;
    .locals 3

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgy0/f;->w1:I

    new-instance v1, Lcom/whoop/design/util/TextResource$d$b;

    invoke-direct {v1, p1}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    const/4 p1, 0x1

    new-array p1, p1, [Lcom/whoop/design/util/TextResource$d;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-direct {p2, v0, p1}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    return-object p2

    :cond_0
    new-instance p2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    return-object p2

    :cond_1
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget p2, Lgy0/f;->u1:I

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Integer;I)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr p1, p2

    iget-object p2, p0, La31/a;->a:Li93/j;

    invoke-static {p1, p2}, Le93/b;->o(ILi93/g;)I

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, La31/a;->a:Li93/j;

    iget p1, p1, Li93/h;->w:I

    return p1
.end method

.method public c(Ljava/lang/Integer;)La31/g;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, La31/a;->a:Li93/j;

    invoke-static {p1, v2}, Le93/b;->o(ILi93/g;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_1
    move-object v3, p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    iget-object p1, p0, La31/a;->a:Li93/j;

    iget p1, p1, Li93/h;->x:I

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_3

    if-eqz v5, :cond_3

    move v6, v1

    goto :goto_4

    :cond_3
    :goto_3
    move v6, v0

    :goto_4
    iget-object p1, p0, La31/a;->a:Li93/j;

    iget p1, p1, Li93/h;->w:I

    if-nez v3, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_5

    if-eqz v5, :cond_5

    move v7, v1

    goto :goto_6

    :cond_5
    :goto_5
    move v7, v0

    :goto_6
    new-instance v2, La31/g;

    invoke-direct {p0, v3, v6}, La31/a;->a(Ljava/lang/Integer;Z)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct/range {v2 .. v7}, La31/g;-><init>(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;ZZZ)V

    return-object v2
.end method
