.class public final Lq30/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq30/w0;

.field public final b:Ln30/d;

.field public final c:Lq83/j;


# direct methods
.method public constructor <init>(Lq30/w0;Ln30/d;Lq83/j;)V
    .locals 1

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/v0;->a:Lq30/w0;

    iput-object p2, p0, Lq30/v0;->b:Ln30/d;

    iput-object p3, p0, Lq30/v0;->c:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a(Lr30/g;)V
    .locals 5

    const-string v0, "errorData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Lr30/g;->b()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not convert ErrorData to JSON.\n$"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lq30/v0;->b:Ln30/d;

    check-cast p1, Ln30/c;

    invoke-virtual {p1, v2}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_0
    instance-of p1, v0, Ll83/m;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    move-object v0, v1

    :cond_1
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lq30/v0;->c:Lq83/j;

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v2, Ln43/a;

    const/16 v3, 0xc

    invoke-direct {v2, p0, v0, v1, v3}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v1, v1, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    return-void
.end method
