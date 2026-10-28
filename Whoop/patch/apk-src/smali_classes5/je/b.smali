.class public final Lje/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/o;


# instance fields
.field public final w:Lvg/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvg/m;->b:Lvg/r;

    const-string v1, "env"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lje/b;->w:Lvg/l;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Luf/u;

    iget-object p2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast p2, Lvf/b;

    iget-object p2, p2, Lvf/b;->y:Lmf/c;

    const-string v0, "X-Amzn-Trace-Id"

    invoke-virtual {p2, v0}, La2/a;->o(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lje/b;->w:Lvg/l;

    check-cast p2, Lvg/r;

    const-string v1, "_X_AMZN_TRACE_ID"

    invoke-virtual {p2, v1}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AWS_LAMBDA_FUNCTION_NAME"

    invoke-virtual {p2, v2}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast p2, Lvf/b;

    iget-object p2, p2, Lvf/b;->y:Lmf/c;

    sget-object v2, Lje/c;->a:Ltg/g;

    invoke-virtual {v2, v1}, Ltg/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object p1
.end method
