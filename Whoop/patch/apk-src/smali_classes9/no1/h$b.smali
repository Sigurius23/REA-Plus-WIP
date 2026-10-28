.class final Lno1/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno1/h;->e(Llo1/a$e;Ljava/lang/String;Lko1/c;Lko1/a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.hormonalinsights.logsymptoms.view.LogSymptomsScreenKt$LogSymptomsScreen$1$1"
    f = "LogSymptomsScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lko1/a;

.field final synthetic y:Llo1/a$e;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lko1/a;Llo1/a$e;Ljava/lang/String;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko1/a;",
            "Llo1/a$e;",
            "Ljava/lang/String;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lno1/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lno1/h$b;->x:Lko1/a;

    iput-object p2, p0, Lno1/h$b;->y:Llo1/a$e;

    iput-object p3, p0, Lno1/h$b;->z:Ljava/lang/String;

    iput-object p4, p0, Lno1/h$b;->E:Ll83/h;

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

    new-instance v0, Lno1/h$b;

    iget-object v1, p0, Lno1/h$b;->x:Lko1/a;

    iget-object v2, p0, Lno1/h$b;->y:Llo1/a$e;

    iget-object v3, p0, Lno1/h$b;->z:Ljava/lang/String;

    iget-object v4, p0, Lno1/h$b;->E:Ll83/h;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lno1/h$b;-><init>(Lko1/a;Llo1/a$e;Ljava/lang/String;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lno1/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lno1/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lno1/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lno1/h$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lno1/h$b;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lno1/h$b;->x:Lko1/a;

    iget-object v0, p0, Lno1/h$b;->y:Llo1/a$e;

    invoke-virtual {p1, v0}, Lko1/a;->a(Llo1/a;)Llo1/a;

    iget-object p1, p0, Lno1/h$b;->E:Ll83/h;

    invoke-static {p1}, Lno1/h;->m(Ll83/h;)Llo1/b;

    move-result-object p1

    new-instance v0, Llo1/a$g;

    iget-object v1, p0, Lno1/h$b;->z:Ljava/lang/String;

    invoke-direct {v0, v1}, Llo1/a$g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Llo1/b;->o(Llo1/a$k;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
