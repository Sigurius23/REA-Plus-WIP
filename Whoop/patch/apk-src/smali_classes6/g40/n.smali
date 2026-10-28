.class public final Lg40/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/k1;
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final a:Lc93/a;

.field public final b:Lec3/h2;

.field public final c:Lec3/r1;

.field public final d:Ln53/e;

.field public final e:Ln53/e;


# direct methods
.method public constructor <init>(Lzy/b;Lc93/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg40/n;->a:Lc93/a;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lg40/n;->b:Lec3/h2;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lg40/n;->c:Lec3/r1;

    const-string p1, ""

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    invoke-static {p2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    new-instance v1, Lg1/u4;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lg1/u4;-><init>(I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    iput-object v0, p0, Lg40/n;->d:Ln53/e;

    new-instance v0, Lg1/w8;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg1/w8;-><init>(I)V

    invoke-static {p2, p1, v0}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/n;->e:Ln53/e;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/n;->b:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Lec3/f2;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/n;->d:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p6

    check-cast v4, Lp1/q;

    const p2, 0x6489507

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, p7, 0xf

    and-int/lit8 p2, p2, 0xe

    shl-int/lit8 p3, p7, 0x6

    and-int/lit16 p3, p3, 0x380

    or-int v5, p2, p3

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p1

    invoke-static/range {v0 .. v5}, Lvd/e;->b(Lg40/n;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x0

    invoke-virtual {v4, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/n;->e:Ln53/e;

    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
