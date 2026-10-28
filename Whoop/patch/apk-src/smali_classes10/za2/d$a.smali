.class final Lza2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lza2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0082\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008#\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lza2/d$a;",
        "",
        "Lza2/f;",
        "base",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "Lza2/e;",
        "output",
        "<init>",
        "(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)V",
        "e",
        "()Lza2/d$a;",
        "Lza2/d$b;",
        "emission",
        "d",
        "(Lza2/d$b;)Lza2/d$a;",
        "a",
        "(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)Lza2/d$a;",
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
        "Lza2/f;",
        "getBase",
        "()Lza2/f;",
        "b",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getModal",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "c",
        "Lza2/e;",
        "()Lza2/e;",
        "settings_release"
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
.field private final a:Lza2/f;

.field private final b:Lcom/whoop/design/models/modal/AnyModal;

.field private final c:Lza2/e;


# direct methods
.method public constructor <init>(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)V
    .locals 1

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lza2/d$a;->a:Lza2/f;

    .line 3
    iput-object p2, p0, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    .line 4
    iput-object p3, p0, Lza2/d$a;->c:Lza2/e;

    return-void
.end method

.method public synthetic constructor <init>(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    sget-object p1, Lza2/f$b;->a:Lza2/f$b;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lza2/d$a;-><init>(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)V

    return-void
.end method

.method public static synthetic b(Lza2/d$a;Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILjava/lang/Object;)Lza2/d$a;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lza2/d$a;->a:Lza2/f;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lza2/d$a;->c:Lza2/e;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lza2/d$a;->a(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)Lza2/d$a;

    move-result-object p0

    return-object p0
.end method

.method private final e()Lza2/d$a;
    .locals 12

    new-instance v3, Lza2/e$b;

    iget-object v0, p0, Lza2/d$a;->a:Lza2/f;

    instance-of v1, v0, Lza2/f$c;

    if-eqz v1, :cond_0

    check-cast v0, Lza2/f$c;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v4, :cond_1

    iget-object v9, p0, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v11}, Lza2/f$c;->b(Lza2/f$c;Ljava/util/List;Lvc2/c;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;ZLcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lza2/f$c;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lza2/d$a;->a:Lza2/f;

    :goto_2
    invoke-direct {v3, v0}, Lza2/e$b;-><init>(Lza2/f;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lza2/d$a;->b(Lza2/d$a;Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILjava/lang/Object;)Lza2/d$a;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public final a(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)Lza2/d$a;
    .locals 1

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza2/d$a;

    invoke-direct {v0, p1, p2, p3}, Lza2/d$a;-><init>(Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;)V

    return-object v0
.end method

.method public final c()Lza2/e;
    .locals 1

    iget-object v0, p0, Lza2/d$a;->c:Lza2/e;

    return-object v0
.end method

.method public final d(Lza2/d$b;)Lza2/d$a;
    .locals 6

    const-string v0, "emission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lza2/d$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lza2/d$b$a;

    invoke-virtual {p1}, Lza2/d$b$a;->a()Lza2/f;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lza2/d$a;->b(Lza2/d$a;Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILjava/lang/Object;)Lza2/d$a;

    move-result-object p1

    invoke-direct {p1}, Lza2/d$a;->e()Lza2/d$a;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lza2/d$b$b;

    if-eqz v0, :cond_4

    check-cast p1, Lza2/d$b$b;

    invoke-virtual {p1}, Lza2/d$b$b;->a()Lfb2/c;

    move-result-object p1

    instance-of v0, p1, Lfb2/c$a;

    if-eqz v0, :cond_1

    check-cast p1, Lfb2/c$a;

    invoke-virtual {p1}, Lfb2/c$a;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v2

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lza2/d$a;->b(Lza2/d$a;Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILjava/lang/Object;)Lza2/d$a;

    move-result-object p1

    invoke-direct {p1}, Lza2/d$a;->e()Lza2/d$a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lfb2/c$b;

    if-eqz v0, :cond_2

    new-instance v3, Lza2/e$a;

    new-instance v0, Lza2/g$a;

    check-cast p1, Lfb2/c$b;

    invoke-virtual {p1}, Lfb2/c$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lza2/g$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-direct {v3, v0}, Lza2/e$a;-><init>(Lza2/g;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lza2/d$a;->b(Lza2/d$a;Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILjava/lang/Object;)Lza2/d$a;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lfb2/c$c;->a:Lfb2/c$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lza2/d$a;->b(Lza2/d$a;Lza2/f;Lcom/whoop/design/models/modal/AnyModal;Lza2/e;ILjava/lang/Object;)Lza2/d$a;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lza2/d$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lza2/d$a;

    iget-object v1, p0, Lza2/d$a;->a:Lza2/f;

    iget-object v3, p1, Lza2/d$a;->a:Lza2/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lza2/d$a;->c:Lza2/e;

    iget-object p1, p1, Lza2/d$a;->c:Lza2/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lza2/d$a;->a:Lza2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lza2/d$a;->c:Lza2/e;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lza2/d$a;->a:Lza2/f;

    iget-object v1, p0, Lza2/d$a;->b:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v2, p0, Lza2/d$a;->c:Lza2/e;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Accumulator(base="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", modal="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", output="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
