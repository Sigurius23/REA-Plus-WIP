.class public abstract Lg40/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/y2;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/b3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method


# virtual methods
.method public a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lg40/b3;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    invoke-virtual {p0}, Lg40/b3;->k()Lg40/k1;

    move-result-object v0

    invoke-interface {v0, p1}, Lg40/z2;->b(Z)V

    return-void
.end method

.method public e()Lec3/f2;
    .locals 3

    invoke-virtual {p0}, Lg40/b3;->k()Lg40/k1;

    move-result-object v0

    invoke-interface {v0}, Lg40/k1;->j()Lec3/f2;

    move-result-object v0

    new-instance v1, Leg/j;

    const/16 v2, 0x18

    invoke-direct {v1, p0, v2}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public f()Lec3/f2;
    .locals 2

    invoke-virtual {p0}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lg40/b3;->k()Lg40/k1;

    move-result-object v1

    instance-of v1, v1, Lg40/m3;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/util/Map;)V
    .locals 1

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lg40/b3;->k()Lg40/k1;

    move-result-object v0

    invoke-interface {v0, p1}, Lg40/k1;->s(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final i()Lg40/z2;
    .locals 1

    invoke-virtual {p0}, Lg40/b3;->k()Lg40/k1;

    move-result-object v0

    return-object v0
.end method

.method public abstract k()Lg40/k1;
.end method
