.class final Llx0/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llx0/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Llx0/e;",
        "<unused var>",
        "Llx0/a;",
        "internalAction",
        "<anonymous>",
        "(Llx0/e;Llx0/a;)Llx0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.upload.UploadDataInteractor$interact$3"
    f = "UploadDataInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Llx0/d$c;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Llx0/e;Llx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llx0/e;",
            "Llx0/a;",
            "Lq83/d<",
            "-",
            "Llx0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Llx0/d$c;

    invoke-direct {p1, p3}, Llx0/d$c;-><init>(Lq83/d;)V

    iput-object p2, p1, Llx0/d$c;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llx0/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llx0/e;

    check-cast p2, Llx0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Llx0/d$c;->f(Llx0/e;Llx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llx0/d$c;->x:Ljava/lang/Object;

    check-cast v0, Llx0/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llx0/d$c;->w:I

    if-nez v1, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Llx0/a$a;

    if-eqz p1, :cond_0

    new-instance p1, Llx0/e$a;

    check-cast v0, Llx0/a$a;

    invoke-virtual {v0}, Llx0/a$a;->a()Ldt0/c;

    move-result-object v0

    invoke-direct {p1, v0}, Llx0/e$a;-><init>(Ldt0/c;)V

    return-object p1

    :cond_0
    instance-of p1, v0, Llx0/a$b;

    if-eqz p1, :cond_1

    new-instance p1, Llx0/e$b;

    check-cast v0, Llx0/a$b;

    invoke-virtual {v0}, Llx0/a$b;->a()Ldt0/c;

    move-result-object v0

    invoke-direct {p1, v0}, Llx0/e$b;-><init>(Ldt0/c;)V

    return-object p1

    :cond_1
    sget-object p1, Llx0/a$c;->a:Llx0/a$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Llx0/e$c;->a:Llx0/e$c;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
