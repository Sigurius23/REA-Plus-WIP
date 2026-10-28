.class final Lv41/d0$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/d0;->y(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv41/t;Ll0/l;Lkotlin/jvm/functions/Function1;ZZZZILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lp1/r1;",
        "Landroid/graphics/pdf/PdfRenderer;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lp1/r1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.PdfViewerKt$PdfViewer$2$renderer$2$1"
    f = "PdfViewer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lv41/t;


# direct methods
.method public constructor <init>(Lbc3/c0;Lv41/t;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lv41/t;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lv41/d0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/d0$c;->y:Lbc3/c0;

    iput-object p2, p0, Lv41/d0$c;->z:Lv41/t;

    iput-object p3, p0, Lv41/d0$c;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lv41/d0$c;

    iget-object v1, p0, Lv41/d0$c;->y:Lbc3/c0;

    iget-object v2, p0, Lv41/d0$c;->z:Lv41/t;

    iget-object v3, p0, Lv41/d0$c;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lv41/d0$c;-><init>(Lbc3/c0;Lv41/t;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lv41/d0$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lp1/r1;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/r1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lv41/d0$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/d0$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/d0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/d0$c;->f(Lp1/r1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lv41/d0$c;->x:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lv41/d0$c;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lv41/d0$c;->y:Lbc3/c0;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lv41/d0$c$a;

    iget-object v3, p0, Lv41/d0$c;->z:Lv41/t;

    iget-object v4, p0, Lv41/d0$c;->E:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v2, v0, v3, v4, v5}, Lv41/d0$c$a;-><init>(Lp1/r1;Lv41/t;Ljava/lang/String;Lq83/d;)V

    const/4 v0, 0x2

    invoke-static {p1, v1, v5, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
