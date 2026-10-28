.class final Lbd2/a$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd2/a;->i(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Landroid/net/Uri;",
        "<anonymous>",
        "(Lbc3/c0;)Landroid/net/Uri;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.share.action.ShareActionsHelper$handleMore$uri$1"
    f = "ShareActionsHelper.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lbd2/a;

.field final synthetic y:Landroid/content/Context;

.field final synthetic z:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lbd2/a;Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbd2/a;",
            "Landroid/content/Context;",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lbd2/a$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbd2/a$l;->x:Lbd2/a;

    iput-object p2, p0, Lbd2/a$l;->y:Landroid/content/Context;

    iput-object p3, p0, Lbd2/a$l;->z:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lbd2/a$l;->E:Ljava/lang/String;

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

    new-instance v0, Lbd2/a$l;

    iget-object v1, p0, Lbd2/a$l;->x:Lbd2/a;

    iget-object v2, p0, Lbd2/a$l;->y:Landroid/content/Context;

    iget-object v3, p0, Lbd2/a$l;->z:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lbd2/a$l;->E:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lbd2/a$l;-><init>(Lbd2/a;Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lq83/d;)V

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
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lbd2/a$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbd2/a$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbd2/a$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbd2/a$l;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lbd2/a$l;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbd2/a$l;->x:Lbd2/a;

    iget-object v0, p0, Lbd2/a$l;->y:Landroid/content/Context;

    iget-object v1, p0, Lbd2/a$l;->z:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lbd2/a$l;->E:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lbd2/a;->d(Lbd2/a;Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
