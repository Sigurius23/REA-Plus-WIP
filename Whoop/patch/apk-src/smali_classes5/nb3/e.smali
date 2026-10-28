.class public final Lnb3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr93/b0;


# static fields
.field public static final w:Lnb3/e;

.field public static final x:Lva3/h;

.field public static final y:Lm83/y;

.field public static final z:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnb3/e;->w:Lnb3/e;

    sget-object v0, Lnb3/b;->w:[Lnb3/b;

    const-string v0, "<Error module>"

    invoke-static {v0}, Lva3/h;->g(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lnb3/e;->x:Lva3/h;

    sget-object v0, Lm83/y;->w:Lm83/y;

    sput-object v0, Lnb3/e;->y:Lm83/y;

    sget-object v0, Lnb3/d;->w:Lnb3/d;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lnb3/e;->z:Ll83/p;

    return-void
.end method


# virtual methods
.method public final F(Lva3/e;)Lr93/k0;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a()Lr93/k;
    .locals 0

    return-object p0
.end method

.method public final c()Lo93/h;
    .locals 1

    sget-object v0, Lnb3/e;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo93/h;

    return-object v0
.end method

.method public final e0()Ljava/util/List;
    .locals 1

    sget-object v0, Lnb3/e;->y:Lm83/y;

    return-object v0
.end method

.method public final f(Lva3/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    const-string p2, "fqName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final g()Lr93/k;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    sget-object v0, Ls93/g;->a:Ls93/f;

    return-object v0
.end method

.method public final getName()Lva3/h;
    .locals 1

    sget-object v0, Lnb3/e;->x:Lva3/h;

    return-object v0
.end method

.method public final n0(Lr93/b0;)Z
    .locals 1

    const-string v0, "targetModule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final r(Lbd3/e0;)Ljava/lang/Object;
    .locals 1

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
