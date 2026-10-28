.class final Lyo0/i$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyo0/i;->c(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.coacheverywhere.onboarding.ui.TypewriterTextKt$TypewriterWhoopText$2$1"
    f = "TypewriterText.kt"
    l = {
        0x38,
        0x3d,
        0x3f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:J

.field final synthetic G:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/a1;

.field w:I

.field x:I

.field y:I

.field final synthetic z:J


# direct methods
.method public constructor <init>(JLjava/lang/String;JLc93/a;Lp1/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "J",
            "Lc93/a;",
            "Lp1/a1;",
            "Lq83/d<",
            "-",
            "Lyo0/i$a;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lyo0/i$a;->z:J

    iput-object p3, p0, Lyo0/i$a;->E:Ljava/lang/String;

    iput-wide p4, p0, Lyo0/i$a;->F:J

    iput-object p6, p0, Lyo0/i$a;->G:Lc93/a;

    iput-object p7, p0, Lyo0/i$a;->H:Lp1/a1;

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

    new-instance v0, Lyo0/i$a;

    iget-wide v1, p0, Lyo0/i$a;->z:J

    iget-object v3, p0, Lyo0/i$a;->E:Ljava/lang/String;

    iget-wide v4, p0, Lyo0/i$a;->F:J

    iget-object v6, p0, Lyo0/i$a;->G:Lc93/a;

    iget-object v7, p0, Lyo0/i$a;->H:Lp1/a1;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lyo0/i$a;-><init>(JLjava/lang/String;JLc93/a;Lp1/a1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lyo0/i$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyo0/i$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyo0/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyo0/i$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyo0/i$a;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lyo0/i$a;->x:I

    iget v2, p0, Lyo0/i$a;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyo0/i$a;->H:Lp1/a1;

    invoke-static {p1, v2}, Lyo0/i;->h(Lp1/a1;I)V

    iget-wide v6, p0, Lyo0/i$a;->z:J

    iput v5, p0, Lyo0/i$a;->y:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    iget-object p1, p0, Lyo0/i$a;->E:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ltz p1, :cond_6

    move v1, p1

    :goto_1
    iget-object p1, p0, Lyo0/i$a;->H:Lp1/a1;

    invoke-static {p1, v2}, Lyo0/i;->h(Lp1/a1;I)V

    iget-wide v5, p0, Lyo0/i$a;->F:J

    iput v2, p0, Lyo0/i$a;->w:I

    iput v1, p0, Lyo0/i$a;->x:I

    iput v4, p0, Lyo0/i$a;->y:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    if-eq v2, v1, :cond_6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    iput v3, p0, Lyo0/i$a;->y:I

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    :goto_4
    iget-object p1, p0, Lyo0/i$a;->G:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
