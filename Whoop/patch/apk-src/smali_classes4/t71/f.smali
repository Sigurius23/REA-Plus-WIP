.class public final Lt71/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0019\u001a\u0004\u0008 \u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001d\u001a\u0004\u0008\"\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\u001c\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001b\u00a8\u0006%"
    }
    d2 = {
        "Lt71/f;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Ly81/f;",
        "titleColor",
        "subTitle",
        "subTitleColor",
        "Lt71/g;",
        "impactCardType",
        "ctaButtonText",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "f",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Ly81/f;",
        "g",
        "()Ly81/f;",
        "c",
        "d",
        "e",
        "Lt71/g;",
        "()Lt71/g;",
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
.field public static final g:I = 0x8


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Ly81/f;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Ly81/f;

.field private final e:Lt71/g;

.field private final f:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitleColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactCardType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaButtonText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt71/f;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lt71/f;->b:Ly81/f;

    .line 4
    iput-object p3, p0, Lt71/f;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lt71/f;->d:Ly81/f;

    .line 6
    iput-object p5, p0, Lt71/f;->e:Lt71/g;

    .line 7
    iput-object p6, p0, Lt71/f;->f:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 8
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 9
    sget-object p2, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 10
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 11
    sget-object p4, Ly81/f;->WHITE_50:Ly81/f;

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    .line 12
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p6

    :cond_4
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 13
    invoke-direct/range {p2 .. p8}, Lt71/f;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lt71/f;->f:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Lt71/g;
    .locals 1

    iget-object v0, p0, Lt71/f;->e:Lt71/g;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lt71/f;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Ly81/f;
    .locals 1

    iget-object v0, p0, Lt71/f;->d:Ly81/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt71/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt71/f;

    iget-object v1, p0, Lt71/f;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lt71/f;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lt71/f;->b:Ly81/f;

    iget-object v3, p1, Lt71/f;->b:Ly81/f;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lt71/f;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lt71/f;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lt71/f;->d:Ly81/f;

    iget-object v3, p1, Lt71/f;->d:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lt71/f;->e:Lt71/g;

    iget-object v3, p1, Lt71/f;->e:Lt71/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lt71/f;->f:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lt71/f;->f:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lt71/f;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Ly81/f;
    .locals 1

    iget-object v0, p0, Lt71/f;->b:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lt71/f;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt71/f;->b:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Lt71/f;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lt71/f;->d:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Lt71/f;->e:Lt71/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lt71/f;->f:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lt71/f;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lt71/f;->b:Ly81/f;

    iget-object v2, p0, Lt71/f;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lt71/f;->d:Ly81/f;

    iget-object v4, p0, Lt71/f;->e:Lt71/g;

    iget-object v5, p0, Lt71/f;->f:Lcom/whoop/design/util/TextResource;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ImpactActivityCardState(title="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subTitle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subTitleColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", impactCardType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ctaButtonText="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
