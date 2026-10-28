.class public final Ln51/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u000fR\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\u001b\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010%\u001a\u0004\u0008\u0018\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Ln51/h;",
        "Lm91/u;",
        "",
        "id",
        "",
        "items",
        "Ly3/f;",
        "spacing",
        "Lb2/f;",
        "horizontalAlignment",
        "Ln51/a;",
        "entrance",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Ljava/lang/String;",
        "getId",
        "b",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "F",
        "e",
        "()F",
        "d",
        "Lb2/f;",
        "()Lb2/f;",
        "Ln51/a;",
        "()Ln51/a;",
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
.field public static final f:I = 0x8


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final c:F

.field private final d:Lb2/f;

.field private final e:Ln51/a;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;F",
            "Lb2/f;",
            "Ln51/a;",
            ")V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalAlignment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ln51/h;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Ln51/h;->b:Ljava/util/List;

    .line 5
    iput p3, p0, Ln51/h;->c:F

    .line 6
    iput-object p4, p0, Ln51/h;->d:Lb2/f;

    .line 7
    iput-object p5, p0, Ln51/h;->e:Ln51/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    .line 8
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    move-object v3, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    int-to-float p3, p1

    :cond_2
    move v4, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    .line 9
    sget-object p4, Lb2/e;->N:Lb2/k;

    :cond_3
    move-object v5, p4

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move-object v6, v0

    goto :goto_1

    :cond_4
    move-object v6, p5

    :goto_1
    const/4 v7, 0x0

    move-object v1, p0

    .line 10
    invoke-direct/range {v1 .. v7}, Ln51/h;-><init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Ln51/h;-><init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;)V

    return-void
.end method


# virtual methods
.method public final a()Ln51/a;
    .locals 1

    iget-object v0, p0, Ln51/h;->e:Ln51/a;

    return-object v0
.end method

.method public final b()Lb2/f;
    .locals 1

    iget-object v0, p0, Ln51/h;->d:Lb2/f;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln51/h;->b:Ljava/util/List;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Ln51/h;->c:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ln51/h;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ln51/h;

    iget-object v0, p0, Ln51/h;->a:Ljava/lang/String;

    iget-object v1, p1, Ln51/h;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ln51/h;->b:Ljava/util/List;

    iget-object v1, p1, Ln51/h;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Ln51/h;->c:F

    iget v1, p1, Ln51/h;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Ln51/h;->d:Lb2/f;

    iget-object v1, p1, Ln51/h;->d:Lb2/f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Ln51/h;->e:Ln51/a;

    iget-object p1, p1, Ln51/h;->e:Ln51/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ln51/h;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Ln51/h;->b:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v3, p0, Ln51/h;->c:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Ln51/h;->d:Lb2/f;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Ln51/h;->e:Ln51/a;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ln51/a;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Ln51/h;->a:Ljava/lang/String;

    iget-object v1, p0, Ln51/h;->b:Ljava/util/List;

    iget v2, p0, Ln51/h;->c:F

    invoke-static {v2}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ln51/h;->d:Lb2/f;

    iget-object v4, p0, Ln51/h;->e:Ln51/a;

    const-string v5, ", items="

    const-string v6, ", spacing="

    const-string v7, "ColumnViewState(id="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", entrance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
