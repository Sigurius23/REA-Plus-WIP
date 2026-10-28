.class final Lea2/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea2/n;->l(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Lcom/whoop/data/onboarding/FeatureEducationType;

.field final synthetic x:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic y:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/FeatureEducationType;Lc93/m;Lc93/a;Landroid/content/Context;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Lc93/m;",
            "Lc93/a;",
            "Landroid/content/Context;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lea2/n$b;->w:Lcom/whoop/data/onboarding/FeatureEducationType;

    iput-object p2, p0, Lea2/n$b;->x:Lc93/m;

    iput-object p3, p0, Lea2/n$b;->y:Lc93/a;

    iput-object p4, p0, Lea2/n$b;->z:Landroid/content/Context;

    iput-object p5, p0, Lea2/n$b;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 8

    new-instance v6, Lcom/whoop/data/onboarding/OnboardingStatus;

    iget-object v0, p0, Lea2/n$b;->w:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-direct {v6, v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatus;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V

    iget-object v7, p0, Lea2/n$b;->x:Lc93/m;

    new-instance v0, Lea2/n$b$a;

    iget-object v1, p0, Lea2/n$b;->y:Lc93/a;

    iget-object v2, p0, Lea2/n$b;->w:Lcom/whoop/data/onboarding/FeatureEducationType;

    iget-object v4, p0, Lea2/n$b;->z:Landroid/content/Context;

    iget-object v5, p0, Lea2/n$b;->E:Lp1/c1;

    move v3, p1

    invoke-direct/range {v0 .. v6}, Lea2/n$b$a;-><init>(Lc93/a;Lcom/whoop/data/onboarding/FeatureEducationType;ZLandroid/content/Context;Lp1/c1;Lcom/whoop/data/onboarding/OnboardingStatus;)V

    invoke-interface {v7, v6, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lea2/n$b;->a(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
