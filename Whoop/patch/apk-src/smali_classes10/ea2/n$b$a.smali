.class final Lea2/n$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea2/n$b;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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

.field final synthetic F:Lcom/whoop/data/onboarding/OnboardingStatus;

.field final synthetic w:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic x:Lcom/whoop/data/onboarding/FeatureEducationType;

.field final synthetic y:Z

.field final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lc93/a;Lcom/whoop/data/onboarding/FeatureEducationType;ZLandroid/content/Context;Lp1/c1;Lcom/whoop/data/onboarding/OnboardingStatus;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Z",
            "Landroid/content/Context;",
            "Lp1/c1;",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lea2/n$b$a;->w:Lc93/a;

    iput-object p2, p0, Lea2/n$b$a;->x:Lcom/whoop/data/onboarding/FeatureEducationType;

    iput-boolean p3, p0, Lea2/n$b$a;->y:Z

    iput-object p4, p0, Lea2/n$b$a;->z:Landroid/content/Context;

    iput-object p5, p0, Lea2/n$b$a;->E:Lp1/c1;

    iput-object p6, p0, Lea2/n$b$a;->F:Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLjava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lea2/n$b$a;->E:Lp1/c1;

    invoke-static {p1}, Lea2/n;->F(Lp1/c1;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    iget-object v1, p0, Lea2/n$b$a;->F:Lcom/whoop/data/onboarding/OnboardingStatus;

    iget-object v2, p0, Lea2/n$b$a;->x:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {v4}, Lcom/whoop/data/onboarding/OnboardingStatus;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v4

    if-ne v4, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-ltz v0, :cond_2

    invoke-virtual {p2, v0, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-static {p1, p2}, Lea2/n;->G(Lp1/c1;Ljava/util/List;)V

    iget-object p1, p0, Lea2/n$b$a;->w:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lea2/n$b$a;->x:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iget-boolean p2, p0, Lea2/n$b$a;->y:Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Toggled "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "OnboardingStatusDebug"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lea2/n$b$a;->z:Landroid/content/Context;

    iget-object p2, p0, Lea2/n$b$a;->x:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    iget-boolean v0, p0, Lea2/n$b$a;->y:Z

    if-eqz v0, :cond_3

    const-string v0, "marked as completed"

    goto :goto_3

    :cond_3
    const-string v0, "marked as not completed"

    :goto_3
    const-string v1, " "

    const-string v2, ". Cache sync attempted. If not working immediately, try restarting the app."

    invoke-static {p2, v1, v0, v2}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_4
    iget-object p1, p0, Lea2/n$b$a;->z:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to update status: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lea2/n$b$a;->a(ZLjava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
