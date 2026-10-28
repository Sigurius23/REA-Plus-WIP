.class public final Lg40/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/h;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:Ll83/p;

.field public final c:Lec3/f2;

.field public final d:Lg40/i0;

.field public final e:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Lg40/z;ZI)V
    .locals 12

    move/from16 v2, p12

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_0

    new-instance v3, Lg40/r0;

    new-instance v5, Lm63/d;

    const/16 v6, 0x3e

    const/4 v7, 0x0

    invoke-direct {v5, p3, v7, v7, v6}, Lm63/d;-><init>(Ljava/util/Set;Lg1/u4;Lg1/u4;I)V

    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {v3, v5, v6}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    move-object v5, v3

    goto :goto_0

    :cond_0
    move-object/from16 v5, p4

    :goto_0
    and-int/lit8 v3, v2, 0x10

    if-eqz v3, :cond_1

    sget-object v3, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-object v6, v3

    goto :goto_1

    :cond_1
    move-object/from16 v6, p5

    :goto_1
    and-int/lit8 v3, v2, 0x20

    if-eqz v3, :cond_2

    sget-object v3, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p6

    :goto_2
    and-int/lit8 v8, v2, 0x40

    if-eqz v8, :cond_3

    sget-object v8, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    goto :goto_3

    :cond_3
    move-object/from16 v8, p7

    :goto_3
    and-int/lit16 v2, v2, 0x400

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    move v11, v2

    goto :goto_4

    :cond_4
    move/from16 v11, p11

    :goto_4
    const-string v2, "identifier"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "countryCodes"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "phoneNumberConfig"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "nameConfig"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "emailConfig"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "interactorFactory"

    move-object/from16 v9, p10

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/v;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lg40/u;

    move-object v1, p0

    move-object v2, p2

    move-object v4, p3

    move-object/from16 v10, p9

    move-object v7, v3

    move-object v3, v9

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v11}, Lg40/u;-><init>(Lg40/v;Ljava/util/Map;Lg40/z;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Z)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lg40/v;->b:Ll83/p;

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    iget-object v0, v0, Lg40/t;->r:Ln53/e;

    iput-object v0, p0, Lg40/v;->c:Lec3/f2;

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    iget-object v0, v0, Lg40/t;->m:Lg40/i0;

    iput-object v0, p0, Lg40/v;->d:Lg40/i0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg40/v;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lg40/v;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg40/t;->b(Z)V

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lg40/v;->e:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 1

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    iget-object v0, v0, Lg40/t;->p:Ln53/e;

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    iget-object v0, v0, Lg40/t;->q:Ln53/e;

    return-object v0
.end method

.method public final g()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/v;->c:Lec3/f2;

    return-object v0
.end method

.method public final h(Ljava/util/Map;)V
    .locals 3

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lg40/t;->n:Lec3/h2;

    iget-boolean v2, v0, Lg40/t;->k:Z

    invoke-virtual {v0, v2, p1}, Lg40/t;->v(ZLjava/util/Map;)Lg40/m;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lg40/t;->u(Ljava/util/Map;Lg40/m;)Lg40/f;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {v1, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final i()Lg40/z2;
    .locals 1

    invoke-virtual {p0}, Lg40/v;->k()Lg40/t;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lg40/i0;
    .locals 1

    iget-object v0, p0, Lg40/v;->d:Lg40/i0;

    return-object v0
.end method

.method public final k()Lg40/t;
    .locals 1

    iget-object v0, p0, Lg40/v;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/t;

    return-object v0
.end method
