.class final Lno0/i0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno0/i0;->r(Lt11/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingMultiSelectScreenContentKt$OtherTextArea$1$1"
    f = "ClinicianVideoSchedulingMultiSelectScreenContent.kt"
    l = {
        0x96
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lr0/a;

.field final synthetic z:Lg2/i;


# direct methods
.method public constructor <init>(ZLr0/a;Lg2/i;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lr0/a;",
            "Lg2/i;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lno0/i0$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lno0/i0$a;->x:Z

    iput-object p2, p0, Lno0/i0$a;->y:Lr0/a;

    iput-object p3, p0, Lno0/i0$a;->z:Lg2/i;

    iput-object p4, p0, Lno0/i0$a;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lno0/i0$a;

    iget-boolean v1, p0, Lno0/i0$a;->x:Z

    iget-object v2, p0, Lno0/i0$a;->y:Lr0/a;

    iget-object v3, p0, Lno0/i0$a;->z:Lg2/i;

    iget-object v4, p0, Lno0/i0$a;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lno0/i0$a;-><init>(ZLr0/a;Lg2/i;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lno0/i0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lno0/i0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lno0/i0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lno0/i0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lno0/i0$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lno0/i0$a;->x:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lno0/i0$a;->E:Lp1/c1;

    invoke-static {p1}, Lno0/i0;->w(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lno0/i0$a;->y:Lr0/a;

    iput v2, p0, Lno0/i0$a;->w:I

    invoke-static {p1, p0}, Lr0/a;->a(Lr0/a;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_2
    iget-object p1, p0, Lno0/i0$a;->z:Lg2/i;

    invoke-static {p1}, Lg2/i;->a(Lg2/i;)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lno0/i0$a;->E:Lp1/c1;

    invoke-static {p1, v2}, Lno0/i0;->x(Lp1/c1;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
