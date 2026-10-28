.class public final Lx30/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/i1;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:Lx30/w;

.field public final c:Z


# direct methods
.method public constructor <init>(Lzx/o;Ljava/util/LinkedHashMap;Lb5/d;ZLw30/c;Lux/a;Lux/b;Lcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 8

    new-instance v0, Lx30/w;

    move-object v1, p1

    move-object v2, p2

    move-object v7, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v7}, Lx30/w;-><init>(Lzx/o;Ljava/util/LinkedHashMap;ZLw30/c;Lux/a;Lux/b;Lb5/d;)V

    const-string p2, "cardAccountRangeRepositoryFactory"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cbcEligibility"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cardBrandFilter"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cardFundingFilter"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 p1, p8

    iput-object p1, p0, Lx30/x;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object v0, p0, Lx30/x;->b:Lx30/w;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx30/x;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lx30/x;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lx30/x;->b:Lx30/w;

    invoke-virtual {v0, p1}, Lx30/w;->b(Z)V

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lx30/x;->c:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/x;->b:Lx30/w;

    iget-object v0, v0, Lx30/w;->b:Lx30/v;

    invoke-virtual {v0}, Lx30/v;->e()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/x;->b:Lx30/w;

    iget-object v0, v0, Lx30/w;->b:Lx30/v;

    invoke-virtual {v0}, Lx30/v;->f()Lec3/f2;

    move-result-object v0

    return-object v0
.end method
