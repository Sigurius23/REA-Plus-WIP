.class public final Lzt2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u0017\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lzt2/e;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Ly71/g;",
        "icon",
        "Ly3/f;",
        "iconSize",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Ly71/g;",
        "()Ly71/g;",
        "c",
        "F",
        "()F",
        "d",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "weekly-plan_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Ly71/g;

.field private final c:F

.field private final d:Lcom/whoop/navigation/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Ly71/g;->c:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lzt2/e;->e:I

    return-void
.end method

.method private constructor <init>(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lzt2/e;->a:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lzt2/e;->b:Ly71/g;

    .line 5
    iput p3, p0, Lzt2/e;->c:F

    .line 6
    iput-object p4, p0, Lzt2/e;->d:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    const/4 p6, 0x4

    and-int/2addr p5, p6

    if-eqz p5, :cond_0

    const/4 p3, 0x6

    int-to-float p3, p3

    int-to-float p5, p6

    mul-float/2addr p3, p5

    :cond_0
    move v3, p3

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lzt2/e;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lzt2/e;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;FLcom/whoop/navigation/e;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lzt2/e;->d:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final b()Ly71/g;
    .locals 1

    iget-object v0, p0, Lzt2/e;->b:Ly71/g;

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lzt2/e;->c:F

    return v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lzt2/e;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lzt2/e;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lzt2/e;

    iget-object v0, p0, Lzt2/e;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p1, Lzt2/e;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lzt2/e;->b:Ly71/g;

    iget-object v1, p1, Lzt2/e;->b:Ly71/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lzt2/e;->c:F

    iget v1, p1, Lzt2/e;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lzt2/e;->d:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lzt2/e;->d:Lcom/whoop/navigation/e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lzt2/e;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzt2/e;->b:Ly71/g;

    invoke-virtual {v2}, Ly71/g;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lzt2/e;->c:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lzt2/e;->d:Lcom/whoop/navigation/e;

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lzt2/e;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lzt2/e;->b:Ly71/g;

    iget v2, p0, Lzt2/e;->c:F

    invoke-static {v2}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzt2/e;->d:Lcom/whoop/navigation/e;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BannerCalloutTileState(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconSize="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
