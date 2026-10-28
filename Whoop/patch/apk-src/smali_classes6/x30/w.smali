.class public final Lx30/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/z2;


# instance fields
.field public final a:Lb5/d;

.field public final b:Lx30/v;

.field public final c:Ln53/e;


# direct methods
.method public constructor <init>(Lzx/o;Ljava/util/LinkedHashMap;ZLw30/c;Lux/a;Lux/b;Lb5/d;)V
    .locals 8

    const-string v0, "cardAccountRangeRepositoryFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cbcEligibility"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p7, p0, Lx30/w;->a:Lb5/d;

    new-instance v0, Lx30/v;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "card_detail"

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lx30/v;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lzx/o;Ljava/util/LinkedHashMap;ZLw30/c;Lux/a;Lux/b;)V

    iput-object v0, p0, Lx30/w;->b:Lx30/v;

    iget-object p1, v0, Lx30/v;->c:Lx30/t;

    iget-object p1, p1, Lx30/t;->h:Ln53/e;

    iput-object p1, p0, Lx30/w;->c:Ln53/e;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lx30/w;->b:Lx30/v;

    invoke-virtual {v0, p1}, Lx30/v;->b(Z)V

    return-void
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/w;->c:Ln53/e;

    return-object v0
.end method
