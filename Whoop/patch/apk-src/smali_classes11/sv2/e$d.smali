.class final Lsv2/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsv2/e;->f0(Landroidx/compose/ui/Modifier;Lrv2/h$b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lm91/u;

.field final synthetic x:Z

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm91/u;ZLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsv2/e$d;->w:Lm91/u;

    iput-boolean p2, p0, Lsv2/e$d;->x:Z

    iput-object p3, p0, Lsv2/e$d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsv2/e$d;->w:Lm91/u;

    instance-of v1, v0, Lp31/l;

    if-eqz v1, :cond_1

    check-cast v0, Lp31/l;

    invoke-virtual {v0}, Lp31/l;->a()Lp31/p;

    move-result-object p1

    instance-of v0, p1, Lp31/p$b;

    if-eqz v0, :cond_0

    check-cast p1, Lp31/p$b;

    invoke-virtual {p1}, Lp31/p$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lsv2/e$d;->y:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lrv2/d$a;

    invoke-direct {v1, p1}, Lrv2/d$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :cond_1
    iget-boolean v0, p0, Lsv2/e$d;->x:Z

    iget-object v1, p0, Lsv2/e$d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lsv2/e;->m1(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsv2/e$d;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
