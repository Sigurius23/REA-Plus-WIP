.class public final Ln71/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln71/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln71/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u000eR \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Ln71/f$a;",
        "Ln71/f;",
        "",
        "currentHr",
        "maxHr",
        "",
        "Lfz0/d;",
        "hrZonesState",
        "<init>",
        "(IILjava/util/List;)V",
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
        "a",
        "I",
        "c",
        "b",
        "getMaxHr",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "Lcom/whoop/design/util/TextResource$b;",
        "d",
        "Lcom/whoop/design/util/TextResource$b;",
        "()Lcom/whoop/design/util/TextResource$b;",
        "defaultStatTitle",
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
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfz0/d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/whoop/design/util/TextResource$b;


# direct methods
.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lfz0/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "hrZonesState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln71/f$a;->a:I

    iput p2, p0, Ln71/f$a;->b:I

    iput-object p3, p0, Ln71/f$a;->c:Ljava/util/List;

    sget p1, Lgy0/f;->F0:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    iput-object p1, p0, Ln71/f$a;->d:Lcom/whoop/design/util/TextResource$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Ln71/f$a;->d()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lfz0/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln71/f$a;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Ln71/f$a;->a:I

    return v0
.end method

.method public d()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Ln71/f$a;->d:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln71/f$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln71/f$a;

    iget v1, p0, Ln71/f$a;->a:I

    iget v3, p1, Ln71/f$a;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ln71/f$a;->b:I

    iget v3, p1, Ln71/f$a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ln71/f$a;->c:Ljava/util/List;

    iget-object p1, p1, Ln71/f$a;->c:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ln71/f$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ln71/f$a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Ln71/f$a;->c:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Ln71/f$a;->a:I

    iget v1, p0, Ln71/f$a;->b:I

    iget-object v2, p0, Ln71/f$a;->c:Ljava/util/List;

    const-string v3, ", maxHr="

    const-string v4, ", hrZonesState="

    const-string v5, "Default(currentHr="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
