.class final Lx41/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx41/c;->d(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraControllerKt$createLiveMapRecenterAction$1"
    f = "LiveMapCameraController.kt"
    l = {
        0xa1
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Leu/g;

.field final synthetic F:I

.field final synthetic G:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic H:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic I:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lw41/z$a;

.field final synthetic y:Z

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw41/z$a;",
            "ZZ",
            "Leu/g;",
            "I",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lx41/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx41/c$b;->x:Lw41/z$a;

    iput-boolean p2, p0, Lx41/c$b;->y:Z

    iput-boolean p3, p0, Lx41/c$b;->z:Z

    iput-object p4, p0, Lx41/c$b;->E:Leu/g;

    iput p5, p0, Lx41/c$b;->F:I

    iput-object p6, p0, Lx41/c$b;->G:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lx41/c$b;->H:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lx41/c$b;->I:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx41/c$b;

    iget-object v1, p0, Lx41/c$b;->x:Lw41/z$a;

    iget-boolean v2, p0, Lx41/c$b;->y:Z

    iget-boolean v3, p0, Lx41/c$b;->z:Z

    iget-object v4, p0, Lx41/c$b;->E:Leu/g;

    iget v5, p0, Lx41/c$b;->F:I

    iget-object v6, p0, Lx41/c$b;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lx41/c$b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lx41/c$b;->I:Lkotlin/jvm/functions/Function1;

    move-object v9, p1

    invoke-direct/range {v0 .. v9}, Lx41/c$b;-><init>(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lx41/c$b;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lx41/c$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx41/c$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lx41/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx41/c$b;->w:I

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

    iget-object v1, p0, Lx41/c$b;->x:Lw41/z$a;

    move p1, v2

    iget-boolean v2, p0, Lx41/c$b;->y:Z

    iget-boolean v3, p0, Lx41/c$b;->z:Z

    iget-object v4, p0, Lx41/c$b;->E:Leu/g;

    iget v5, p0, Lx41/c$b;->F:I

    iget-object v6, p0, Lx41/c$b;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lx41/c$b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lx41/c$b;->I:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Lx41/c$b;->w:I

    move-object v9, p0

    invoke-static/range {v1 .. v9}, Lx41/c;->g(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
