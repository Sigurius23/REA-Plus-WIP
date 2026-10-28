.class public final Lp91/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp91/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 \n2\u00020\u0001:\u0001\u0015B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ8\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001c\u001a\u0004\u0008 \u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lp91/a;",
        "",
        "",
        "x",
        "y",
        "",
        "isConfinedHorizontally",
        "isConfinedVertically",
        "<init>",
        "(FFZZ)V",
        "e",
        "(FFZZ)Lp91/a;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "F",
        "g",
        "()F",
        "b",
        "h",
        "c",
        "Z",
        "i",
        "()Z",
        "d",
        "j",
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
.field public static final e:Lp91/a$a;

.field private static final f:Lp91/a;

.field private static final g:Lp91/a;

.field private static final h:Lp91/a;

.field private static final i:Lp91/a;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lp91/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp91/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp91/a;->e:Lp91/a$a;

    new-instance v2, Lp91/a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lp91/a;->f:Lp91/a;

    new-instance v3, Lp91/a;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lp91/a;->g:Lp91/a;

    new-instance v4, Lp91/a;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lp91/a;->h:Lp91/a;

    new-instance v5, Lp91/a;

    const/16 v10, 0xd

    const/4 v11, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lp91/a;->i:Lp91/a;

    return-void
.end method

.method public constructor <init>(FFZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lp91/a;->a:F

    .line 3
    iput p2, p0, Lp91/a;->b:F

    .line 4
    iput-boolean p3, p0, Lp91/a;->c:Z

    .line 5
    iput-boolean p4, p0, Lp91/a;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lp91/a;-><init>(FFZZ)V

    return-void
.end method

.method public static final synthetic a()Lp91/a;
    .locals 1

    sget-object v0, Lp91/a;->g:Lp91/a;

    return-object v0
.end method

.method public static final synthetic b()Lp91/a;
    .locals 1

    sget-object v0, Lp91/a;->h:Lp91/a;

    return-object v0
.end method

.method public static final synthetic c()Lp91/a;
    .locals 1

    sget-object v0, Lp91/a;->i:Lp91/a;

    return-object v0
.end method

.method public static final synthetic d()Lp91/a;
    .locals 1

    sget-object v0, Lp91/a;->f:Lp91/a;

    return-object v0
.end method

.method public static synthetic f(Lp91/a;FFZZILjava/lang/Object;)Lp91/a;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lp91/a;->a:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lp91/a;->b:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lp91/a;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lp91/a;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lp91/a;->e(FFZZ)Lp91/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(FFZZ)Lp91/a;
    .locals 1

    new-instance v0, Lp91/a;

    invoke-direct {v0, p1, p2, p3, p4}, Lp91/a;-><init>(FFZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp91/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp91/a;

    iget v1, p0, Lp91/a;->a:F

    iget v3, p1, Lp91/a;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lp91/a;->b:F

    iget v3, p1, Lp91/a;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lp91/a;->c:Z

    iget-boolean v3, p1, Lp91/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lp91/a;->d:Z

    iget-boolean p1, p1, Lp91/a;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lp91/a;->a:F

    return v0
.end method

.method public final h()F
    .locals 1

    iget v0, p0, Lp91/a;->b:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lp91/a;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lp91/a;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v2, p0, Lp91/a;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lp91/a;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lp91/a;->c:Z

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lp91/a;->d:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lp91/a;->a:F

    iget v1, p0, Lp91/a;->b:F

    iget-boolean v2, p0, Lp91/a;->c:Z

    iget-boolean v3, p0, Lp91/a;->d:Z

    const-string v4, ", y="

    const-string v5, ", isConfinedHorizontally="

    const-string v6, "AnchorPoint(x="

    invoke-static {v6, v0, v4, v1, v5}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isConfinedVertically="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
