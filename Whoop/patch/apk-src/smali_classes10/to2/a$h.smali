.class final Lto2/a$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lto2/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.checkout.view.screens.UniversalCheckoutScreenKt$UniversalCheckoutScreen$1$1"
    f = "UniversalCheckoutScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lj02/x0;

.field final synthetic H:Lh20/d2;

.field final synthetic I:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field final synthetic J:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic K:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Lh20/d2;Ll83/h;Lp1/t2;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lj02/x0;",
            "Lh20/d2;",
            "Ll83/h;",
            "Lp1/t2;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lto2/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lto2/a$h;->x:Ljava/lang/String;

    iput-object p2, p0, Lto2/a$h;->y:Ljava/lang/String;

    iput-object p3, p0, Lto2/a$h;->z:Ljava/lang/String;

    iput-object p4, p0, Lto2/a$h;->E:Ljava/lang/String;

    iput-object p5, p0, Lto2/a$h;->F:Ljava/lang/String;

    iput-object p6, p0, Lto2/a$h;->G:Lj02/x0;

    iput-object p7, p0, Lto2/a$h;->H:Lh20/d2;

    iput-object p8, p0, Lto2/a$h;->I:Ll83/h;

    iput-object p9, p0, Lto2/a$h;->J:Lp1/t2;

    iput-object p10, p0, Lto2/a$h;->K:Ll83/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p11}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lto2/a$h;

    iget-object v1, p0, Lto2/a$h;->x:Ljava/lang/String;

    iget-object v2, p0, Lto2/a$h;->y:Ljava/lang/String;

    iget-object v3, p0, Lto2/a$h;->z:Ljava/lang/String;

    iget-object v4, p0, Lto2/a$h;->E:Ljava/lang/String;

    iget-object v5, p0, Lto2/a$h;->F:Ljava/lang/String;

    iget-object v6, p0, Lto2/a$h;->G:Lj02/x0;

    iget-object v7, p0, Lto2/a$h;->H:Lh20/d2;

    iget-object v8, p0, Lto2/a$h;->I:Ll83/h;

    iget-object v9, p0, Lto2/a$h;->J:Lp1/t2;

    iget-object v10, p0, Lto2/a$h;->K:Ll83/h;

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Lto2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Lh20/d2;Ll83/h;Lp1/t2;Ll83/h;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lto2/a$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lto2/a$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lto2/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lto2/a$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lto2/a$h;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lto2/a$h;->I:Ll83/h;

    invoke-static {p1}, Lto2/a;->x(Ll83/h;)Lpo2/b;

    move-result-object p1

    new-instance v0, Lpo2/a$l;

    iget-object v1, p0, Lto2/a$h;->x:Ljava/lang/String;

    iget-object v2, p0, Lto2/a$h;->y:Ljava/lang/String;

    iget-object v3, p0, Lto2/a$h;->z:Ljava/lang/String;

    iget-object v4, p0, Lto2/a$h;->J:Lp1/t2;

    invoke-static {v4}, Lto2/a;->y(Lp1/t2;)Lpo2/c;

    move-result-object v4

    invoke-virtual {v4}, Lpo2/c;->e()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    iget-object v4, p0, Lto2/a$h;->E:Ljava/lang/String;

    :cond_0
    iget-object v5, p0, Lto2/a$h;->F:Ljava/lang/String;

    iget-object v6, p0, Lto2/a$h;->G:Lj02/x0;

    invoke-direct/range {v0 .. v6}, Lpo2/a$l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;)V

    invoke-virtual {p1, v0}, Lpo2/b;->r(Lpo2/a$n0;)V

    iget-object p1, p0, Lto2/a$h;->K:Ll83/h;

    invoke-static {p1}, Lto2/a;->w(Ll83/h;)Ljo2/e;

    move-result-object p1

    iget-object v0, p0, Lto2/a$h;->H:Lh20/d2;

    invoke-virtual {p1, v0}, Ljo2/e;->A(Lh20/d2;)Lbc3/k1;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
