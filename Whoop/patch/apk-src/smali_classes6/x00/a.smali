.class public final Lx00/a;
.super Lx30/g1;
.source "SourceFile"


# instance fields
.field public final c:Lj00/d0;

.field public final d:Lwz/g0;

.field public final e:Lwz/l1;

.field public final f:Lj00/i0;

.field public final g:Lkotlin/jvm/functions/Function1;

.field public final h:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lj00/d0;Lwz/g0;Lwz/l1;Lj00/i0;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V
    .locals 2

    const-string v0, "signupMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLinkInlineSignupStateChanged"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "link_form"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lx30/g1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Z)V

    iput-object p1, p0, Lx00/a;->c:Lj00/d0;

    iput-object p2, p0, Lx00/a;->d:Lwz/g0;

    iput-object p3, p0, Lx00/a;->e:Lwz/l1;

    iput-object p4, p0, Lx00/a;->f:Lj00/i0;

    iput-object p5, p0, Lx00/a;->g:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lx00/a;->h:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final e()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final g(ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string p3, "hiddenIdentifiers"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p4

    check-cast v8, Lp1/q;

    const p2, 0x15b68a6b

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    const p2, -0x4d65068c

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    sget-object p2, Ld40/r;->f:Lp1/u2;

    invoke-virtual {v8, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lb2/t;->w:Lb2/t;

    if-nez p2, :cond_0

    const/4 p2, 0x6

    int-to-float p2, p2

    const/4 p4, 0x1

    const/4 v0, 0x0

    invoke-static {p3, v0, p2, p4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p3

    :cond_0
    move-object v6, p3

    const/4 p2, 0x0

    invoke-virtual {v8, p2}, Lp1/q;->q(Z)V

    shl-int/lit8 p3, p5, 0xc

    const p4, 0xe000

    and-int v9, p3, p4

    iget-object v0, p0, Lx00/a;->f:Lj00/i0;

    iget-object v1, p0, Lx00/a;->e:Lwz/l1;

    iget-object v2, p0, Lx00/a;->d:Lwz/g0;

    iget-object v3, p0, Lx00/a;->c:Lj00/d0;

    iget-object v5, p0, Lx00/a;->g:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lx00/a;->h:Ljava/lang/Boolean;

    move v4, p1

    invoke-static/range {v0 .. v9}, Ltx/f;->h(Lj00/i0;Lwz/l1;Lwz/g0;Lj00/d0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, p2}, Lp1/q;->q(Z)V

    return-void
.end method
