.class public final Ly33/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Le53/d;

.field public y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le53/d;)V
    .locals 1

    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly33/a;->w:Ljava/lang/String;

    iput-object p2, p0, Ly33/a;->x:Le53/d;

    const-string p1, "jwt"

    iput-object p1, p0, Ly33/a;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 4

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    iget-object v1, v0, Lud3/o0;->a:Lud3/e0;

    iget-object v1, v1, Lud3/e0;->i:Ljava/lang/String;

    const-string v2, "video"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v1}, Lud3/e0;->g()Lcom/iterable/iterableapi/v;

    move-result-object v1

    const-string v2, "api_key"

    iget-object v3, p0, Ly33/a;->w:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/iterable/iterableapi/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lud3/o0;->a:Lud3/e0;

    :goto_0
    iget-object v2, p0, Ly33/a;->x:Le53/d;

    iget-object v2, v2, Le53/d;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    const-string v3, "url"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lud3/n0;->a:Lud3/e0;

    const-string v1, "stream-auth-type"

    iget-object v3, p0, Ly33/a;->y:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Authorization"

    invoke-virtual {v0, v1, v2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p1, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
