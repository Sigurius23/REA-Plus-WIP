.class public final Llb1/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0081\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Llb1/i2;",
        "",
        "Lgz0/m0;",
        "icon",
        "Ly81/f;",
        "backgroundColor",
        "contentColor",
        "Lrz0/f;",
        "tileStyle",
        "dismissIconColor",
        "<init>",
        "(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;)V",
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
        "a",
        "Lgz0/m0;",
        "d",
        "()Lgz0/m0;",
        "b",
        "Ly81/f;",
        "()Ly81/f;",
        "c",
        "Lrz0/f;",
        "e",
        "()Lrz0/f;",
        "design-models_release"
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
.field private final a:Lgz0/m0;

.field private final b:Ly81/f;

.field private final c:Ly81/f;

.field private final d:Lrz0/f;

.field private final e:Ly81/f;


# direct methods
.method public constructor <init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;)V
    .locals 1

    const-string v0, "backgroundColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llb1/i2;->a:Lgz0/m0;

    .line 3
    iput-object p2, p0, Llb1/i2;->b:Ly81/f;

    .line 4
    iput-object p3, p0, Llb1/i2;->c:Ly81/f;

    .line 5
    iput-object p4, p0, Llb1/i2;->d:Lrz0/f;

    .line 6
    iput-object p5, p0, Llb1/i2;->e:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct/range {p1 .. p6}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/i2;->b:Ly81/f;

    return-object v0
.end method

.method public final b()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/i2;->c:Ly81/f;

    return-object v0
.end method

.method public final c()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/i2;->e:Ly81/f;

    return-object v0
.end method

.method public final d()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Llb1/i2;->a:Lgz0/m0;

    return-object v0
.end method

.method public final e()Lrz0/f;
    .locals 1

    iget-object v0, p0, Llb1/i2;->d:Lrz0/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llb1/i2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llb1/i2;

    iget-object v1, p0, Llb1/i2;->a:Lgz0/m0;

    iget-object v3, p1, Llb1/i2;->a:Lgz0/m0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llb1/i2;->b:Ly81/f;

    iget-object v3, p1, Llb1/i2;->b:Ly81/f;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llb1/i2;->c:Ly81/f;

    iget-object v3, p1, Llb1/i2;->c:Ly81/f;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llb1/i2;->d:Lrz0/f;

    iget-object v3, p1, Llb1/i2;->d:Lrz0/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llb1/i2;->e:Ly81/f;

    iget-object p1, p1, Llb1/i2;->e:Ly81/f;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llb1/i2;->a:Lgz0/m0;

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

    iget-object v3, p0, Llb1/i2;->b:Ly81/f;

    invoke-static {v3, v0, v2}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v3, p0, Llb1/i2;->c:Ly81/f;

    invoke-static {v3, v0, v2}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v3, p0, Llb1/i2;->d:Lrz0/f;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Llb1/i2;->e:Ly81/f;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Llb1/i2;->a:Lgz0/m0;

    iget-object v1, p0, Llb1/i2;->b:Ly81/f;

    iget-object v2, p0, Llb1/i2;->c:Ly81/f;

    iget-object v3, p0, Llb1/i2;->d:Lrz0/f;

    iget-object v4, p0, Llb1/i2;->e:Ly81/f;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "InfoCallOutStyleModel(icon="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tileStyle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismissIconColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Ljh3/c;->i(Ljava/lang/StringBuilder;Ly81/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
