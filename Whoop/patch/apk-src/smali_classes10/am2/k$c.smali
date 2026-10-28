.class final Lam2/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lam2/k;->A(Lcm2/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
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
.field final synthetic w:Lcm2/p;

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcm2/p;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcm2/p;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lam2/k$c;->w:Lcm2/p;

    iput-object p2, p0, Lam2/k$c;->x:Lp1/c1;

    iput-object p3, p0, Lam2/k$c;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lam2/k$c;->x:Lp1/c1;

    iget-object v1, p0, Lam2/k$c;->w:Lcm2/p;

    invoke-virtual {v1}, Lcm2/p;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbm2/n;

    invoke-virtual {v1}, Lbm2/n;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lam2/k;->k0(Lp1/c1;Ljava/lang/String;)V

    iget-object v0, p0, Lam2/k$c;->y:Lp1/c1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lam2/k;->l0(Lp1/c1;Z)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lam2/k$c;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
