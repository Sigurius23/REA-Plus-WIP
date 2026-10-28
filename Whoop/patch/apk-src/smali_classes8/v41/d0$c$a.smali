.class final Lv41/d0$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/d0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.organism.PdfViewerKt$PdfViewer$2$renderer$2$1$1"
    f = "PdfViewer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lp1/r1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/r1;"
        }
    .end annotation
.end field

.field final synthetic y:Lv41/t;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp1/r1;Lv41/t;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/r1;",
            "Lv41/t;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lv41/d0$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/d0$c$a;->x:Lp1/r1;

    iput-object p2, p0, Lv41/d0$c$a;->y:Lv41/t;

    iput-object p3, p0, Lv41/d0$c$a;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lv41/d0$c$a;

    iget-object v0, p0, Lv41/d0$c$a;->x:Lp1/r1;

    iget-object v1, p0, Lv41/d0$c$a;->y:Lv41/t;

    iget-object v2, p0, Lv41/d0$c$a;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lv41/d0$c$a;-><init>(Lp1/r1;Lv41/t;Ljava/lang/String;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lv41/d0$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/d0$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/d0$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/d0$c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lv41/d0$c$a;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lv41/d0$c$a;->x:Lp1/r1;

    iget-object v0, p0, Lv41/d0$c$a;->y:Lv41/t;

    iget-object v1, p0, Lv41/d0$c$a;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lv41/t;->a(Ljava/lang/String;)Landroid/graphics/pdf/PdfRenderer;

    move-result-object v0

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lv41/d0$c$a;->x:Lp1/r1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
