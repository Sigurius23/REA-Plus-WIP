.class final Lul1/a$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lul1/a;->interact(Lec3/l;)Lec3/l;
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
        "Lul1/b;",
        "state",
        "Lil1/o;",
        "action",
        "<anonymous>",
        "(Lul1/b;Lil1/o;)Lul1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$5"
    f = "DialogStateCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lul1/a;


# direct methods
.method public constructor <init>(Lul1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lul1/a;",
            "Lq83/d<",
            "-",
            "Lul1/a$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lul1/a$g;->z:Lul1/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lul1/b;Lil1/o;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lul1/b;",
            "Lil1/o;",
            "Lq83/d<",
            "-",
            "Lul1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lul1/a$g;

    iget-object v1, p0, Lul1/a$g;->z:Lul1/a;

    invoke-direct {v0, v1, p3}, Lul1/a$g;-><init>(Lul1/a;Lq83/d;)V

    iput-object p1, v0, Lul1/a$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lul1/a$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lul1/a$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lul1/b;

    check-cast p2, Lil1/o;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lul1/a$g;->f(Lul1/b;Lil1/o;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lul1/a$g;->x:Ljava/lang/Object;

    check-cast v0, Lul1/b;

    iget-object v1, p0, Lul1/a$g;->y:Ljava/lang/Object;

    check-cast v1, Lil1/o;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lul1/a$g;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lil1/o$c;->a:Lil1/o$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lul1/b;->k()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lul1/b$b;->m:Lul1/b$b;

    return-object p1

    :cond_0
    instance-of p1, v1, Lil1/o$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lul1/a$g;->z:Lul1/a;

    invoke-static {p1}, Lul1/a;->e(Lul1/a;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v2, "CDM: CDM Continue"

    invoke-interface {p1, v2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lul1/a$g;->z:Lul1/a;

    invoke-static {p1}, Lul1/a;->h(Lul1/a;)V

    iget-object p1, p0, Lul1/a$g;->z:Lul1/a;

    invoke-static {p1}, Lul1/a;->c(Lul1/a;)Lml1/b;

    move-result-object p1

    check-cast v1, Lil1/o$a;

    invoke-virtual {v1}, Lil1/o$a;->a()Landroid/companion/CompanionDeviceManager$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lml1/b;->e(Landroid/companion/CompanionDeviceManager$Callback;)V

    sget-object p1, Lul1/b$b;->m:Lul1/b$b;

    return-object p1

    :cond_1
    instance-of p1, v1, Lil1/o$d;

    if-eqz p1, :cond_2

    new-instance p1, Lul1/b$f;

    sget v0, Lks0/a;->d:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sget v1, Lks0/a;->b:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget v2, Lks0/a;->c:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lul1/b$f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_2
    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
