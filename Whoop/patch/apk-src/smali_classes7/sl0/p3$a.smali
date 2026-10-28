.class final Lsl0/p3$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/p3;->o(Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;ZZLql0/c;ILc93/a;ZZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.VoiceTextFieldKt$VoiceInputTextField$1$1"
    f = "VoiceTextField.kt"
    l = {}
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

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lg2/s;

.field final synthetic H:Lb3/x2;

.field w:I

.field final synthetic x:Z

.field final synthetic y:Z

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(ZZLbc3/c0;Lp1/c1;Lp1/c1;Lg2/s;Lb3/x2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lg2/s;",
            "Lb3/x2;",
            "Lq83/d<",
            "-",
            "Lsl0/p3$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lsl0/p3$a;->x:Z

    iput-boolean p2, p0, Lsl0/p3$a;->y:Z

    iput-object p3, p0, Lsl0/p3$a;->z:Lbc3/c0;

    iput-object p4, p0, Lsl0/p3$a;->E:Lp1/c1;

    iput-object p5, p0, Lsl0/p3$a;->F:Lp1/c1;

    iput-object p6, p0, Lsl0/p3$a;->G:Lg2/s;

    iput-object p7, p0, Lsl0/p3$a;->H:Lb3/x2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lsl0/p3$a;

    iget-boolean v1, p0, Lsl0/p3$a;->x:Z

    iget-boolean v2, p0, Lsl0/p3$a;->y:Z

    iget-object v3, p0, Lsl0/p3$a;->z:Lbc3/c0;

    iget-object v4, p0, Lsl0/p3$a;->E:Lp1/c1;

    iget-object v5, p0, Lsl0/p3$a;->F:Lp1/c1;

    iget-object v6, p0, Lsl0/p3$a;->G:Lg2/s;

    iget-object v7, p0, Lsl0/p3$a;->H:Lb3/x2;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lsl0/p3$a;-><init>(ZZLbc3/c0;Lp1/c1;Lp1/c1;Lg2/s;Lb3/x2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/p3$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/p3$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/p3$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/p3$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsl0/p3$a;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lsl0/p3$a;->x:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lsl0/p3$a;->y:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsl0/p3$a;->E:Lp1/c1;

    invoke-static {p1}, Lsl0/p3;->W(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsl0/p3$a;->F:Lp1/c1;

    invoke-static {p1}, Lsl0/p3;->U(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lsl0/p3$a;->F:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lsl0/p3;->V(Lp1/c1;Z)V

    iget-object p1, p0, Lsl0/p3$a;->z:Lbc3/c0;

    new-instance v0, Lsl0/p3$a$a;

    iget-object v1, p0, Lsl0/p3$a;->G:Lg2/s;

    iget-object v2, p0, Lsl0/p3$a;->H:Lb3/x2;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lsl0/p3$a$a;-><init>(Lg2/s;Lb3/x2;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
