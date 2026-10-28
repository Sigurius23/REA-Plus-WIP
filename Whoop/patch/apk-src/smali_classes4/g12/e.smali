.class public final Lg12/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg12/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001b\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lg12/e;",
        "Lg12/d;",
        "Lf12/c;",
        "interactor",
        "Lg12/a;",
        "urlOpenerListener",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lf12/c;Lg12/a;Lbc3/c0;)V",
        "",
        "url",
        "provider",
        "codeVerifier",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lf12/c;",
        "b",
        "Lg12/a;",
        "c",
        "Lbc3/c0;",
        "Lec3/o1;",
        "Lg12/c;",
        "d",
        "Lec3/o1;",
        "eventFlow",
        "e",
        "Ljava/lang/String;",
        "cacheValue",
        "Lec3/t1;",
        "f",
        "Lec3/t1;",
        "()Lec3/t1;",
        "result",
        "oauth-integration_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lf12/c;

.field private final b:Lg12/a;

.field private final c:Lbc3/c0;

.field private final d:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private final f:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf12/c;Lg12/a;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlOpenerListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg12/e;->a:Lf12/c;

    .line 3
    iput-object p2, p0, Lg12/e;->b:Lg12/a;

    .line 4
    iput-object p3, p0, Lg12/e;->c:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lg12/e;->d:Lec3/o1;

    .line 6
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    .line 7
    invoke-static {p1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    .line 8
    iput-object p1, p0, Lg12/e;->f:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lf12/c;Lg12/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lg12/e;-><init>(Lf12/c;Lg12/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic b(Lg12/e;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lg12/e;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic c(Lg12/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lg12/e;->d:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic d(Lg12/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lg12/e;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lg12/e$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lg12/e$c;

    iget v1, v0, Lg12/e$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg12/e$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg12/e$c;

    invoke-direct {v0, p0, p4}, Lg12/e$c;-><init>(Lg12/e;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lg12/e$c;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg12/e$c;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lg12/e$c;->E:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    iget-object p1, v0, Lg12/e$c;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lg12/e$c;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lg12/e$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lg12/e$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lg12/e$c;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lg12/e$c;->y:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/lang/String;

    iget-object p2, v0, Lg12/e$c;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lg12/e$c;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p1

    move-object p1, v2

    :goto_1
    move-object v7, p2

    move-object v8, p3

    goto :goto_2

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p4

    const-string v2, "scope"

    invoke-virtual {p4, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iget-object v2, p0, Lg12/e;->d:Lec3/o1;

    sget-object v5, Lg12/c$d;->a:Lg12/c$d;

    iput-object p1, v0, Lg12/e$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lg12/e$c;->x:Ljava/lang/Object;

    iput-object p3, v0, Lg12/e$c;->y:Ljava/lang/Object;

    iput-object p4, v0, Lg12/e$c;->z:Ljava/lang/Object;

    iput v4, v0, Lg12/e$c;->H:I

    invoke-interface {v2, v5, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    move-object v6, p0

    goto :goto_3

    :cond_4
    move-object v9, p4

    goto :goto_1

    :goto_2
    iget-object p2, p0, Lg12/e;->b:Lg12/a;

    sget-object p3, Lcom/whoop/domain/model/WhoopUri;->Companion:Lcom/whoop/domain/model/WhoopUri$Companion;

    invoke-virtual {p3, p1}, Lcom/whoop/domain/model/WhoopUri$Companion;->parse(Ljava/lang/String;)Lcom/whoop/domain/model/WhoopUri;

    move-result-object p1

    invoke-virtual {p2, p1}, Lg12/a;->b(Lcom/whoop/domain/model/WhoopUri;)V

    iget-object p1, p0, Lg12/e;->b:Lg12/a;

    invoke-virtual {p1}, Lg12/a;->a()Lec3/t1;

    move-result-object p1

    new-instance p2, Lg12/e$a;

    invoke-direct {p2, p1, p0}, Lg12/e$a;-><init>(Lec3/l;Lg12/e;)V

    new-instance p1, Lg12/e$e;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lg12/e$e;-><init>(Lg12/e;Lq83/d;)V

    new-instance v5, Lec3/j1;

    const/4 p4, 0x0

    invoke-direct {v5, p2, p1, p4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v4, Lg12/e$b;

    move-object v6, p0

    invoke-direct/range {v4 .. v9}, Lg12/e$b;-><init>(Lec3/l;Lg12/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v6, Lg12/e;->a:Lf12/c;

    invoke-virtual {p1, v4}, Lf12/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance p2, Lg12/e$d;

    invoke-direct {p2, p0}, Lg12/e$d;-><init>(Lg12/e;)V

    iput-object p3, v0, Lg12/e$c;->w:Ljava/lang/Object;

    iput-object p3, v0, Lg12/e$c;->x:Ljava/lang/Object;

    iput-object p3, v0, Lg12/e$c;->y:Ljava/lang/Object;

    iput-object p3, v0, Lg12/e$c;->z:Ljava/lang/Object;

    iput-object p3, v0, Lg12/e$c;->E:Ljava/lang/Object;

    iput v3, v0, Lg12/e$c;->H:I

    invoke-interface {p1, p2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lg12/e;->f:Lec3/t1;

    return-object v0
.end method
