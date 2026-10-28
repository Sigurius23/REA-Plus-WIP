.class final Lhl2/f$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhl2/f;->r(Lec3/l;)Lec3/l;
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
        "Lhl2/d;",
        "previousState",
        "Lhl2/f$a;",
        "internalAction",
        "<anonymous>",
        "(Lhl2/d;Lhl2/f$a;)Lhl2/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$2"
    f = "HrSettingsInteractor.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lhl2/f;


# direct methods
.method public constructor <init>(Lhl2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl2/f;",
            "Lq83/d<",
            "-",
            "Lhl2/f$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhl2/f$j;->z:Lhl2/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lhl2/d;Lhl2/f$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl2/d;",
            "Lhl2/f$a;",
            "Lq83/d<",
            "-",
            "Lhl2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lhl2/f$j;

    iget-object v1, p0, Lhl2/f$j;->z:Lhl2/f;

    invoke-direct {v0, v1, p3}, Lhl2/f$j;-><init>(Lhl2/f;Lq83/d;)V

    iput-object p1, v0, Lhl2/f$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Lhl2/f$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lhl2/f$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhl2/d;

    check-cast p2, Lhl2/f$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lhl2/f$j;->f(Lhl2/d;Lhl2/f$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lhl2/f$j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhl2/d;

    iget-object v0, p0, Lhl2/f$j;->y:Ljava/lang/Object;

    check-cast v0, Lhl2/f$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lhl2/f$j;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lhl2/f$a$a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lhl2/f$j;->z:Lhl2/f;

    check-cast v0, Lhl2/f$a$a;

    invoke-virtual {v0}, Lhl2/f$a$a;->a()Lhl2/c;

    move-result-object v0

    const/4 v3, 0x0

    iput-object v3, p0, Lhl2/f$j;->x:Ljava/lang/Object;

    iput-object v3, p0, Lhl2/f$j;->y:Ljava/lang/Object;

    iput v4, p0, Lhl2/f$j;->w:I

    invoke-static {p1, v1, v0, p0}, Lhl2/f;->c(Lhl2/f;Lhl2/d;Lhl2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lhl2/d;

    return-object p1

    :cond_3
    sget-object p1, Lhl2/f$a$b;->a:Lhl2/f$a$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object v2, Lhl2/b$g;->a:Lhl2/b$g;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lhl2/d;->b(Lhl2/d;Lhl2/b;Lhl2/a;Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Ljava/util/List;Ljava/lang/Boolean;ILjava/lang/Object;)Lhl2/d;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Lhl2/f$a$c;->a:Lhl2/f$a$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object v2, Lhl2/b$p;->a:Lhl2/b$p;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lhl2/d;->b(Lhl2/d;Lhl2/b;Lhl2/a;Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Ljava/util/List;Ljava/lang/Boolean;ILjava/lang/Object;)Lhl2/d;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
