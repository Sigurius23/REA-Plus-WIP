.class public final Lx30/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/h;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:Lu30/c;

.field public final c:Lg40/h;

.field public final d:Lg40/z2;

.field public final e:Lg40/s2;

.field public final f:Lec3/f2;

.field public final g:Lg40/i0;

.field public final h:Ln53/e;

.field public final i:Z

.field public final j:Lzy/c;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/z;Lg40/v2;Ljava/util/Map;Lu30/c;I)V
    .locals 13

    move-object/from16 v3, p3

    move-object/from16 v0, p7

    new-instance v4, Lg40/r0;

    new-instance v1, Lm63/d;

    const/16 v2, 0x3e

    const/4 v5, 0x0

    invoke-direct {v1, v3, v5, v5, v2}, Lm63/d;-><init>(Ljava/util/Set;Lg1/u4;Lg1/u4;I)V

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {v4, v1, v6}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    move/from16 v1, p8

    and-int/lit16 v1, v1, 0x100

    const/4 v6, 0x0

    const/4 v8, 0x1

    if-eqz v1, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    move v1, v6

    :goto_0
    const-string v9, "identifier"

    invoke-static {p1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "countryCodes"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lu30/c;->z:Lu30/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/o;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object v0, p0, Lx30/o;->b:Lu30/c;

    iget-boolean v10, v0, Lu30/c;->w:Z

    if-eqz v10, :cond_1

    sget-object v10, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    goto :goto_1

    :cond_1
    sget-object v10, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :goto_1
    iget-boolean v11, v0, Lu30/c;->x:Z

    if-eqz v11, :cond_2

    sget-object v11, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    goto :goto_2

    :cond_2
    sget-object v11, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :goto_2
    iget-boolean v0, v0, Lu30/c;->y:Z

    if-eqz v0, :cond_3

    sget-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    goto :goto_3

    :cond_3
    sget-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :goto_3
    if-eqz p4, :cond_5

    sget-object v12, Lu30/b;->y:Lu30/b;

    if-ne v9, v12, :cond_4

    move-object/from16 v5, p4

    :cond_4
    if-eqz v5, :cond_5

    move-object v6, v10

    move-object v10, v5

    move-object v5, v0

    new-instance v0, Lg40/v;

    move-object v7, v11

    const/4 v11, 0x0

    const/16 v12, 0x400

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v0 .. v12}, Lg40/v;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Lg40/z;ZI)V

    move-object v11, v4

    goto :goto_5

    :cond_5
    move-object v5, v0

    move v0, v6

    move-object v6, v10

    move-object v7, v11

    move-object v11, v4

    new-instance v3, Lg40/l;

    invoke-direct {v3, v5, v6, v7}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    new-instance v5, Lg40/i0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-direct {v5, v2, v11}, Lg40/i0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    if-eqz v1, :cond_6

    sget-object v1, Lu30/b;->x:Lu30/b;

    if-ne v9, v1, :cond_6

    move v9, v8

    goto :goto_4

    :cond_6
    move v9, v0

    :goto_4
    new-instance v0, Lg40/f;

    const/4 v8, 0x0

    const/16 v10, 0x80

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v10}, Lg40/f;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/m;Ljava/util/Set;Lg40/i0;Lg40/v2;Ljava/util/Map;ZZI)V

    :goto_5
    iput-object v0, p0, Lx30/o;->c:Lg40/h;

    invoke-interface {v0}, Lg40/y2;->i()Lg40/z2;

    move-result-object p1

    iput-object p1, p0, Lx30/o;->d:Lg40/z2;

    new-instance p1, Lg40/s2;

    invoke-direct {p1, p0}, Lg40/s2;-><init>(Lx30/o;)V

    iput-object p1, p0, Lx30/o;->e:Lg40/s2;

    invoke-interface {v0}, Lg40/h;->g()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lx30/o;->f:Lec3/f2;

    invoke-interface {v0}, Lg40/h;->j()Lg40/i0;

    move-result-object p1

    iput-object p1, p0, Lx30/o;->g:Lg40/i0;

    new-instance p1, Lx30/n;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lx30/n;-><init>(Lx30/o;I)V

    iget-object v1, v11, Lg40/r0;->i:Ln53/e;

    invoke-static {v1, p1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lx30/o;->h:Ln53/e;

    invoke-interface {v0}, Lg40/y2;->d()Z

    move-result p1

    iput-boolean p1, p0, Lx30/o;->i:Z

    invoke-interface {v0}, Lg40/y2;->c()Lzy/c;

    move-result-object p1

    iput-object p1, p0, Lx30/o;->j:Lzy/c;

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lx30/o;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lx30/o;->c:Lg40/h;

    invoke-interface {v0, p1}, Lg40/y2;->b(Z)V

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    iget-object v0, p0, Lx30/o;->j:Lzy/c;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lx30/o;->i:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/o;->c:Lg40/h;

    invoke-interface {v0}, Lg40/y2;->e()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/o;->c:Lg40/h;

    invoke-interface {v0}, Lg40/y2;->f()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/o;->f:Lec3/f2;

    return-object v0
.end method

.method public final h(Ljava/util/Map;)V
    .locals 1

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/o;->c:Lg40/h;

    invoke-interface {v0, p1}, Lg40/y2;->h(Ljava/util/Map;)V

    return-void
.end method

.method public final i()Lg40/z2;
    .locals 1

    iget-object v0, p0, Lx30/o;->e:Lg40/s2;

    return-object v0
.end method

.method public final j()Lg40/i0;
    .locals 1

    iget-object v0, p0, Lx30/o;->g:Lg40/i0;

    return-object v0
.end method
