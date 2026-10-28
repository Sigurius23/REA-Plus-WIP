.class public final Lx30/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/i1;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:Ljava/util/List;

.field public final c:Lg40/c3;

.field public final d:Ln53/e;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Ljava/lang/String;)V
    .locals 4

    const-string v0, "identifierSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "banks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/k;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p2, p0, Lx30/k;->b:Ljava/util/List;

    new-instance p1, Lg40/c3;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "au_becs_debit[bsb_number]"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    new-instance v1, Lg40/f3;

    new-instance v2, Lx30/j;

    invoke-direct {v2, p2}, Lx30/j;-><init>(Ljava/util/List;)V

    const/4 p2, 0x0

    const/4 v3, 0x4

    invoke-direct {v1, v2, p3, p2, v3}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    invoke-direct {p1, v0, v1}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    iput-object p1, p0, Lx30/k;->c:Lg40/c3;

    iget-object p1, p1, Lg40/c3;->c:Lg40/m3;

    invoke-interface {p1}, Lg40/m3;->p()Lec3/f2;

    move-result-object p1

    new-instance p2, Luo1/b;

    const/16 p3, 0x1a

    invoke-direct {p2, p0, p3}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lx30/k;->d:Ln53/e;

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lx30/k;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 4

    iget-object v0, p0, Lx30/k;->c:Lg40/c3;

    iget-object v1, v0, Lg40/c3;->c:Lg40/m3;

    invoke-interface {v1}, Lg40/k1;->c()Lec3/f2;

    move-result-object v1

    iget-object v0, v0, Lg40/c3;->c:Lg40/m3;

    invoke-interface {v0}, Lg40/m3;->p()Lec3/f2;

    move-result-object v0

    new-instance v2, Lw20/q;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v0, v2}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method
