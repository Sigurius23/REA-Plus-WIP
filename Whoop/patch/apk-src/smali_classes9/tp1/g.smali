.class public final Ltp1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0018\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Ltp1/g;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lgz0/m0;",
        "leftIcon",
        "rightIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Ltp1/h;",
        "type",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;)V",
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
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "c",
        "d",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "Ltp1/h;",
        "f",
        "()Ltp1/h;",
        "hormonal-insights_release"
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
.field public static final f:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lgz0/m0;

.field private final c:Lgz0/m0;

.field private final d:Lcom/whoop/navigation/e;

.field private final e:Ltp1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    sput v0, Ltp1/g;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltp1/g;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Ltp1/g;->b:Lgz0/m0;

    .line 4
    iput-object p3, p0, Ltp1/g;->c:Lgz0/m0;

    .line 5
    iput-object p4, p0, Ltp1/g;->d:Lcom/whoop/navigation/e;

    .line 6
    iput-object p5, p0, Ltp1/g;->e:Ltp1/h;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Ltp1/g;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Ltp1/g;->d:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final b()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Ltp1/g;->b:Lgz0/m0;

    return-object v0
.end method

.method public final c()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Ltp1/g;->c:Lgz0/m0;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ltp1/g;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltp1/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltp1/g;

    iget-object v1, p0, Ltp1/g;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ltp1/g;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ltp1/g;->b:Lgz0/m0;

    iget-object v3, p1, Ltp1/g;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ltp1/g;->c:Lgz0/m0;

    iget-object v3, p1, Ltp1/g;->c:Lgz0/m0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ltp1/g;->d:Lcom/whoop/navigation/e;

    iget-object v3, p1, Ltp1/g;->d:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ltp1/g;->e:Ltp1/h;

    iget-object p1, p1, Ltp1/g;->e:Ltp1/h;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Ltp1/h;
    .locals 1

    iget-object v0, p0, Ltp1/g;->e:Ltp1/h;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ltp1/g;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltp1/g;->b:Lgz0/m0;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltp1/g;->c:Lgz0/m0;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltp1/g;->d:Lcom/whoop/navigation/e;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltp1/g;->e:Ltp1/h;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Ltp1/g;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Ltp1/g;->b:Lgz0/m0;

    iget-object v2, p0, Ltp1/g;->c:Lgz0/m0;

    iget-object v3, p0, Ltp1/g;->d:Lcom/whoop/navigation/e;

    iget-object v4, p0, Ltp1/g;->e:Ltp1/h;

    const-string v5, ", leftIcon="

    const-string v6, ", rightIcon="

    const-string v7, "HormonalInsightsMenuItemState(title="

    invoke-static {v7, v0, v5, v1, v6}, Ljh3/c;->k(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
