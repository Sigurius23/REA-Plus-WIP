.class public final Lg40/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final a:Le10/k0;

.field public b:Z

.field public final c:Lec3/h2;

.field public final d:Ln53/e;


# direct methods
.method public constructor <init>(Le10/k0;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/d0;->a:Le10/k0;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/d0;->c:Lec3/h2;

    new-instance p2, Leg/j;

    const/16 v0, 0x13

    invoke-direct {p2, p0, v0}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/d0;->d:Ln53/e;

    return-void
.end method


# virtual methods
.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/d0;->d:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p6, Lp1/q;

    const p2, -0x424ce6bd

    invoke-virtual {p6, p2}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, p7, 0x6

    and-int/lit8 p2, p2, 0xe

    shr-int/lit8 p4, p7, 0xc

    and-int/lit8 p4, p4, 0x70

    or-int/2addr p2, p4

    shl-int/lit8 p4, p7, 0x6

    and-int/lit16 p4, p4, 0x380

    or-int/2addr p2, p4

    invoke-static {p3, p0, p1, p6, p2}, Lx43/j;->d(Landroidx/compose/ui/Modifier;Lg40/d0;ZLandroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x0

    invoke-virtual {p6, p1}, Lp1/q;->q(Z)V

    return-void
.end method
