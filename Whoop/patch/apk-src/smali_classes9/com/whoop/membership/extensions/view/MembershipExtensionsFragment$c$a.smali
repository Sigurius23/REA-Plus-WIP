.class public final Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

.field final synthetic e:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;",
            "Lp1/t2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    iput-object p2, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->e:Lp1/t2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->e:Lp1/t2;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->X(Lp1/t2;)Liw1/i;

    move-result-object v0

    instance-of v1, v0, Liw1/k;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->R(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Lhw1/b;

    move-result-object v0

    sget-object v1, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v0, v1}, Lhw1/b;->a(Lhw1/a;)V

    return-void

    :cond_0
    instance-of v1, v0, Liw1/d;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->R(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Lhw1/b;

    move-result-object v0

    sget-object v1, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v0, v1}, Lhw1/b;->a(Lhw1/a;)V

    return-void

    :cond_1
    instance-of v1, v0, Liw1/b;

    if-eqz v1, :cond_4

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->W(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->T(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Liw1/h;

    move-result-object v0

    sget-object v1, Liw1/a$b;->a:Liw1/a$b;

    iget-object v2, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->S(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v3}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->V(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    return-void

    :cond_2
    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->U(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->R(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Lhw1/b;

    move-result-object v0

    sget-object v1, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v0, v1}, Lhw1/b;->a(Lhw1/a;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->T(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Liw1/h;

    move-result-object v0

    sget-object v1, Liw1/a$c;->a:Liw1/a$c;

    iget-object v2, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->S(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v3}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->V(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    return-void

    :cond_4
    instance-of v1, v0, Liw1/f$c;

    if-eqz v1, :cond_5

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->R(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Lhw1/b;

    move-result-object v0

    sget-object v1, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {v0, v1}, Lhw1/b;->a(Lhw1/a;)V

    return-void

    :cond_5
    instance-of v0, v0, Liw1/f;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->T(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Liw1/h;

    move-result-object v0

    new-instance v1, Liw1/e$a;

    iget-object v2, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->e:Lp1/t2;

    invoke-static {v2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->X(Lp1/t2;)Liw1/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsPostCheckoutViewState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Liw1/f;

    sget-object v3, Lcom/whoop/membership/extensions/domain/models/CtaAction;->DISMISS:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-direct {v1, v2, v3}, Liw1/e$a;-><init>(Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    iget-object v2, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->S(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a;->d:Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    invoke-static {v3}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->V(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    return-void

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
