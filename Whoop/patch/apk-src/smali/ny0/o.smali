.class public final Lny0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0016J\u001a\u0010\'\u001a\u00020\n2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010)\u001a\u0004\u0008*\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010+\u001a\u0004\u0008,\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010-\u001a\u0004\u0008.\u0010\u0018R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010-\u001a\u0004\u0008/\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010-\u001a\u0004\u00080\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u00101\u001a\u0004\u00082\u0010\u001cR\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u00101\u001a\u0004\u00083\u0010\u001cR\u0017\u0010\r\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u00101\u001a\u0004\u00084\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0010\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u00101\u001a\u0004\u00087\u0010\u001c\u00a8\u00068"
    }
    d2 = {
        "Lny0/o;",
        "",
        "Lny0/q;",
        "type",
        "",
        "resource",
        "Ly81/e;",
        "color",
        "circleColor",
        "pressedColor",
        "",
        "enabled",
        "nonFunctional",
        "shouldKeepOriginalIconColor",
        "",
        "alpha",
        "fill",
        "<init>",
        "(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZ)V",
        "a",
        "()Lny0/q;",
        "c",
        "()I",
        "d",
        "()Ly81/e;",
        "e",
        "f",
        "g",
        "()Z",
        "h",
        "i",
        "j",
        "()F",
        "b",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lny0/q;",
        "m",
        "I",
        "l",
        "Ly81/e;",
        "getColor",
        "getCircleColor",
        "getPressedColor",
        "Z",
        "k",
        "getNonFunctional",
        "getShouldKeepOriginalIconColor",
        "F",
        "getAlpha",
        "getFill",
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
.field public static final k:I


# instance fields
.field private final a:Lny0/q;

.field private final b:I

.field private final c:Ly81/e;

.field private final d:Ly81/e;

.field private final e:Ly81/e;

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private final i:F

.field private final j:Z


# direct methods
.method public constructor <init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZ)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pressedColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lny0/o;->a:Lny0/q;

    .line 3
    iput p2, p0, Lny0/o;->b:I

    .line 4
    iput-object p3, p0, Lny0/o;->c:Ly81/e;

    .line 5
    iput-object p4, p0, Lny0/o;->d:Ly81/e;

    .line 6
    iput-object p5, p0, Lny0/o;->e:Ly81/e;

    .line 7
    iput-boolean p6, p0, Lny0/o;->f:Z

    .line 8
    iput-boolean p7, p0, Lny0/o;->g:Z

    .line 9
    iput-boolean p8, p0, Lny0/o;->h:Z

    .line 10
    iput p9, p0, Lny0/o;->i:F

    .line 11
    iput-boolean p10, p0, Lny0/o;->j:Z

    return-void
.end method

.method public synthetic constructor <init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 12
    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    .line 13
    sget-object v1, Ly81/f;->BRAND_BLACK:Ly81/f;

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move v9, v2

    goto :goto_4

    :cond_4
    move/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move v10, v2

    goto :goto_5

    :cond_5
    move/from16 v10, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    const/high16 v1, 0x3f800000    # 1.0f

    move v11, v1

    goto :goto_6

    :cond_6
    move/from16 v11, p9

    :goto_6
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_7

    move v12, v2

    move-object v3, p1

    move v4, p2

    move-object v2, p0

    goto :goto_7

    :cond_7
    move/from16 v12, p10

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    .line 14
    :goto_7
    invoke-direct/range {v2 .. v12}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZ)V

    return-void
.end method


# virtual methods
.method public final a()Lny0/q;
    .locals 1

    iget-object v0, p0, Lny0/o;->a:Lny0/q;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lny0/o;->j:Z

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lny0/o;->b:I

    return v0
.end method

.method public final d()Ly81/e;
    .locals 1

    iget-object v0, p0, Lny0/o;->c:Ly81/e;

    return-object v0
.end method

.method public final e()Ly81/e;
    .locals 1

    iget-object v0, p0, Lny0/o;->d:Ly81/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lny0/o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lny0/o;

    iget-object v1, p0, Lny0/o;->a:Lny0/q;

    iget-object v3, p1, Lny0/o;->a:Lny0/q;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lny0/o;->b:I

    iget v3, p1, Lny0/o;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lny0/o;->c:Ly81/e;

    iget-object v3, p1, Lny0/o;->c:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lny0/o;->d:Ly81/e;

    iget-object v3, p1, Lny0/o;->d:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lny0/o;->e:Ly81/e;

    iget-object v3, p1, Lny0/o;->e:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lny0/o;->f:Z

    iget-boolean v3, p1, Lny0/o;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lny0/o;->g:Z

    iget-boolean v3, p1, Lny0/o;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lny0/o;->h:Z

    iget-boolean v3, p1, Lny0/o;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lny0/o;->i:F

    iget v3, p1, Lny0/o;->i:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lny0/o;->j:Z

    iget-boolean p1, p1, Lny0/o;->j:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()Ly81/e;
    .locals 1

    iget-object v0, p0, Lny0/o;->e:Ly81/e;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lny0/o;->f:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lny0/o;->g:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lny0/o;->a:Lny0/q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lny0/o;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lny0/o;->c:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-object v2, p0, Lny0/o;->d:Ly81/e;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lny0/o;->e:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-boolean v2, p0, Lny0/o;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lny0/o;->g:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lny0/o;->h:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lny0/o;->i:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v1, p0, Lny0/o;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lny0/o;->h:Z

    return v0
.end method

.method public final j()F
    .locals 1

    iget v0, p0, Lny0/o;->i:F

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lny0/o;->f:Z

    return v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lny0/o;->b:I

    return v0
.end method

.method public final m()Lny0/q;
    .locals 1

    iget-object v0, p0, Lny0/o;->a:Lny0/q;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lny0/o;->a:Lny0/q;

    iget v1, p0, Lny0/o;->b:I

    iget-object v2, p0, Lny0/o;->c:Ly81/e;

    iget-object v3, p0, Lny0/o;->d:Ly81/e;

    iget-object v4, p0, Lny0/o;->e:Ly81/e;

    iget-boolean v5, p0, Lny0/o;->f:Z

    iget-boolean v6, p0, Lny0/o;->g:Z

    iget-boolean v7, p0, Lny0/o;->h:Z

    iget v8, p0, Lny0/o;->i:F

    iget-boolean v9, p0, Lny0/o;->j:Z

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "IconButtonState(type="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", resource="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", circleColor="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pressedColor="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", nonFunctional="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldKeepOriginalIconColor="

    const-string v1, ", alpha="

    invoke-static {v10, v6, v0, v7, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", fill="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
