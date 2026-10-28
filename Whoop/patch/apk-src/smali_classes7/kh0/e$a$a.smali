.class final Lkh0/e$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkh0/e$a;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ai.chat.view.imagewidget.ImagePreviewDialogKt$ImagePreviewDialog$1$3$1$2$1$1$1"
    f = "ImagePreviewDialog.kt"
    l = {
        0x60
    }
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

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lh0/a4;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh0/a4;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/a4;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lkh0/e$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkh0/e$a$a;->y:Lh0/a4;

    iput-object p2, p0, Lkh0/e$a$a;->z:Lp1/c1;

    iput-object p3, p0, Lkh0/e$a$a;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/c1;Ld0/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkh0/e$a$a;->h(Lp1/c1;Ld0/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lp1/c1;Ld0/e;)Ll83/a0;
    .locals 2

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    invoke-static {p0, v0, v1}, Lkh0/e;->t(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lkh0/e$a$a;

    iget-object v1, p0, Lkh0/e$a$a;->y:Lh0/a4;

    iget-object v2, p0, Lkh0/e$a$a;->z:Lp1/c1;

    iget-object v3, p0, Lkh0/e$a$a;->E:Lp1/c1;

    invoke-direct {v0, v1, v2, v3, p2}, Lkh0/e$a$a;-><init>(Lh0/a4;Lp1/c1;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lkh0/e$a$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lkh0/e$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkh0/e$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkh0/e$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkh0/e$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lkh0/e$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkh0/e$a$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkh0/e$a$a$a;

    iget-object v2, p0, Lkh0/e$a$a;->y:Lh0/a4;

    iget-object v4, p0, Lkh0/e$a$a;->z:Lp1/c1;

    const/4 v5, 0x0

    invoke-direct {p1, v2, v4, v5}, Lkh0/e$a$a$a;-><init>(Lh0/a4;Lp1/c1;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, v5, p1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v6, Ld0/e;

    iget-object p1, p0, Lkh0/e$a$a;->E:Lp1/c1;

    invoke-static {p1}, Lkh0/e;->s(Lp1/c1;)J

    move-result-wide v7

    new-instance p1, Lh2/b;

    invoke-direct {p1, v7, v8}, Lh2/b;-><init>(J)V

    sget-object v0, Ld0/f;->n:Ld0/f2;

    const/16 v2, 0xc

    invoke-direct {v6, p1, v0, v5, v2}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    new-instance v7, Lh2/b;

    const-wide/16 v8, 0x0

    invoke-direct {v7, v8, v9}, Lh2/b;-><init>(J)V

    iget-object p1, p0, Lkh0/e$a$a;->E:Lp1/c1;

    new-instance v9, Lkh0/d;

    const/4 v0, 0x0

    invoke-direct {v9, v0, p1}, Lkh0/d;-><init>(ILp1/c1;)V

    iput-object v5, p0, Lkh0/e$a$a;->x:Ljava/lang/Object;

    iput v3, p0, Lkh0/e$a$a;->w:I

    const/4 v8, 0x0

    const/4 v11, 0x6

    move-object v10, p0

    invoke-static/range {v6 .. v11}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
