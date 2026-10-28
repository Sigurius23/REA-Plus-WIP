.class final Ldt1/h$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->z(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/io/File;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$savePdf$2"
    f = "LabradorDetailsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ldt1/h;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lud3/a1;


# direct methods
.method public constructor <init>(Ldt1/h;Ljava/lang/String;Lud3/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/h;",
            "Ljava/lang/String;",
            "Lud3/a1;",
            "Lq83/d<",
            "-",
            "Ldt1/h$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$n;->x:Ldt1/h;

    iput-object p2, p0, Ldt1/h$n;->y:Ljava/lang/String;

    iput-object p3, p0, Ldt1/h$n;->z:Lud3/a1;

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

    new-instance p1, Ldt1/h$n;

    iget-object v0, p0, Ldt1/h$n;->x:Ldt1/h;

    iget-object v1, p0, Ldt1/h$n;->y:Ljava/lang/String;

    iget-object v2, p0, Ldt1/h$n;->z:Lud3/a1;

    invoke-direct {p1, v0, v1, v2, p2}, Ldt1/h$n;-><init>(Ldt1/h;Ljava/lang/String;Lud3/a1;Lq83/d;)V

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
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldt1/h$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/h$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/h$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/h$n;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-string v0, "ECG Reading "

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldt1/h$n;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Ldt1/h$n;->x:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->j(Ldt1/h;)Lor2/a0;

    move-result-object p1

    iget-object v1, p0, Ldt1/h$n;->y:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".pdf"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ldt1/h$n;->z:Lud3/a1;

    invoke-virtual {p1, v0, v1}, Lor2/a0;->h(Ljava/lang/String;Lud3/a1;)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Ldt1/h$n;->x:Ldt1/h;

    invoke-static {v0}, Ldt1/h;->k(Ldt1/h;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to save pdf file"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
