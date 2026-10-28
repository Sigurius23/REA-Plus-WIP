.class public final Lt10/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv00/c0;

.field public final b:Le10/r0;

.field public final c:Lc10/n;

.field public final d:Ls10/f;

.field public final e:Lt10/e;

.field public final f:Lt10/t;

.field public final g:Lk20/a;

.field public final h:Lbc3/c0;


# direct methods
.method public constructor <init>(Lv00/c0;Le10/r0;Lc10/n;Ls10/f;Lt10/e;Lt10/t;Lk20/a;Landroidx/lifecycle/g0;Lj/c;Lbc3/c0;Lt10/c;)V
    .locals 1

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClickDelegate"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCaller"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formActivityConfirmationHandlerRegistrar"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt10/d;->a:Lv00/c0;

    iput-object p2, p0, Lt10/d;->b:Le10/r0;

    iput-object p3, p0, Lt10/d;->c:Lc10/n;

    iput-object p4, p0, Lt10/d;->d:Ls10/f;

    iput-object p5, p0, Lt10/d;->e:Lt10/e;

    iput-object p6, p0, Lt10/d;->f:Lt10/t;

    iput-object p7, p0, Lt10/d;->g:Lk20/a;

    iput-object p10, p0, Lt10/d;->h:Lbc3/c0;

    iget-object p2, p11, Lt10/c;->a:Le10/r0;

    invoke-virtual {p2, p9, p8}, Le10/r0;->f(Lj/c;Landroidx/lifecycle/g0;)V

    iget-boolean p3, p11, Lt10/c;->b:Z

    if-nez p3, :cond_0

    invoke-virtual {p2, p1}, Le10/r0;->c(Lv00/c0;)V

    const/4 p1, 0x1

    iput-boolean p1, p11, Lt10/c;->b:Z

    :cond_0
    invoke-static {p8}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance p2, Lsz/q;

    const/4 p3, 0x2

    const/4 p4, 0x0

    invoke-direct {p2, p0, p4, p3}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p3, 0x3

    invoke-static {p1, p4, p4, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
