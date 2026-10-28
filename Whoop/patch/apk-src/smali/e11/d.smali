.class public final Le11/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B;\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u0011R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010!\u001a\u0004\u0008\u0017\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Le11/d;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "",
        "leadingIcon",
        "Lgz0/m0;",
        "trailingIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILgz0/m0;Lcom/whoop/navigation/e;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "d",
        "I",
        "Lgz0/m0;",
        "e",
        "()Lgz0/m0;",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
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
.field public static final f:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:I

.field private final d:Lgz0/m0;

.field private final e:Lcom/whoop/navigation/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Le11/d;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILgz0/m0;Lcom/whoop/navigation/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le11/d;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Le11/d;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput p3, p0, Le11/d;->c:I

    .line 5
    iput-object p4, p0, Le11/d;->d:Lgz0/m0;

    .line 6
    iput-object p5, p0, Le11/d;->e:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILgz0/m0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Le11/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILgz0/m0;Lcom/whoop/navigation/e;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Le11/d;->e:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Le11/d;->c:I

    return v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Le11/d;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Le11/d;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Le11/d;->d:Lgz0/m0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le11/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le11/d;

    iget-object v1, p0, Le11/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Le11/d;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Le11/d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Le11/d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Le11/d;->c:I

    iget v3, p1, Le11/d;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Le11/d;->d:Lgz0/m0;

    iget-object v3, p1, Le11/d;->d:Lgz0/m0;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Le11/d;->e:Lcom/whoop/navigation/e;

    iget-object p1, p1, Le11/d;->e:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Le11/d;->a:Lcom/whoop/design/util/TextResource;

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

    iget-object v3, p0, Le11/d;->b:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Le11/d;->c:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Le11/d;->d:Lgz0/m0;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Le11/d;->e:Lcom/whoop/navigation/e;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Le11/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Le11/d;->b:Lcom/whoop/design/util/TextResource;

    iget v2, p0, Le11/d;->c:I

    iget-object v3, p0, Le11/d;->d:Lgz0/m0;

    iget-object v4, p0, Le11/d;->e:Lcom/whoop/navigation/e;

    const-string v5, ", subtitle="

    const-string v6, ", leadingIcon="

    const-string v7, "CurrentPlanTileState(title="

    invoke-static {v7, v0, v5, v1, v6}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", trailingIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
