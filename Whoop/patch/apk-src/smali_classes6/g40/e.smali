.class public final Lg40/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final a:Ln53/e;

.field public final b:Ln53/e;


# direct methods
.method public constructor <init>(Ln53/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/e;->a:Ln53/e;

    new-instance v0, Lg1/u4;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lg1/u4;-><init>(I)V

    invoke-static {p1, v0}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/e;->b:Ln53/e;

    return-void
.end method


# virtual methods
.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/e;->b:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p6

    check-cast v5, Lp1/q;

    const p2, -0x14d465b7

    invoke-virtual {v5, p2}, Lp1/q;->e0(I)V

    and-int/lit8 p2, p7, 0xe

    shr-int/lit8 p6, p7, 0xc

    and-int/lit8 p6, p6, 0x70

    or-int/2addr p2, p6

    shr-int/lit8 p6, p7, 0x3

    and-int/lit16 v0, p6, 0x380

    or-int/2addr p2, v0

    and-int/lit16 p6, p6, 0x1c00

    or-int/2addr p2, p6

    shl-int/lit8 p6, p7, 0x6

    const p7, 0xe000

    and-int/2addr p6, p7

    or-int v6, p2, p6

    const/4 v7, 0x0

    move-object v1, p0

    move v0, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    invoke-static/range {v0 .. v7}, Lv8/b;->b(ZLg40/e;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x0

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    return-void
.end method
