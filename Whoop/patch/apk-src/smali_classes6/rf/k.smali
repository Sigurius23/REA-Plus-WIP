.class public final Lrf/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# static fields
.field public static final w:Lrf/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrf/k;->w:Lrf/k;

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 9

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    const-class v1, Lrf/w;

    invoke-virtual {v0, v1}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Lud3/o0;->d:Lud3/v0;

    iget-object v3, v0, Lud3/o0;->a:Lud3/e0;

    check-cast v1, Lrf/w;

    if-eqz v1, :cond_3

    iget-object v1, v1, Lrf/w;->c:Lqf/b;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Lgf/c;

    invoke-direct {v4}, Lgf/c;-><init>()V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v3, Lud3/e0;->d:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x3a

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, v3, Lud3/e0;->e:I

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "value"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lgf/a;

    const-string v6, "server.address"

    invoke-direct {v5, v6}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    const-string v3, "counter"

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object v5

    iget-object v0, v0, Lud3/o0;->b:Ljava/lang/String;

    iget-object v6, v1, Lqf/b;->M:Lqg/d;

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lrf/g;

    invoke-direct {v7, v2, v6, v4}, Lrf/g;-><init>(Lud3/v0;Lqg/d;Lgf/c;)V

    invoke-virtual {v5, v0, v7}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance v0, Lud3/o0;

    invoke-direct {v0, v5}, Lud3/o0;-><init>(Lud3/n0;)V

    :cond_1
    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    iget-object v0, p1, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-nez v2, :cond_2

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lud3/x0;->h()Lud3/w0;

    move-result-object p1

    iget-object v1, v1, Lqf/b;->N:Lqg/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lrf/h;

    invoke-direct {v2, v0, v1, v4}, Lrf/h;-><init>(Lud3/a1;Lqg/d;Lgf/c;)V

    iput-object v2, p1, Lud3/w0;->g:Lud3/a1;

    invoke-virtual {p1}, Lud3/w0;->a()Lud3/x0;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
