.class final Lsv2/e$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsv2/e;->m0(Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lrv2/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    instance-of v0, p1, Ls01/d;

    if-eqz v0, :cond_1

    check-cast p1, Ls01/d;

    invoke-virtual {p1}, Ls01/d;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v0, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lrv2/d$a;

    invoke-direct {v1, p1}, Lrv2/d$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_5

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/NavigationScreenModel$None;->INSTANCE:Lcom/whoop/navigation/NavigationScreenModel$None;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "quick_start_button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lrv2/d$t;->a:Lrv2/d$t;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    iget-object p1, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lrv2/d$i;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lrv2/d$i;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lrv2/d$a;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v1, p1}, Lrv2/d$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lsv2/e$j;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lrv2/d$a;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v1, p1}, Lrv2/d$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsv2/e$j;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
