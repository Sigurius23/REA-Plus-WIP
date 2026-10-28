.class public final La63/i;
.super Lj63/c;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Long;

.field public final c:Li63/d;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le63/d;Li63/d;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, La63/i;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, La63/i;->d:Ljava/lang/Object;

    .line 3
    iget-object p1, p1, Le63/d;->c:Li63/n;

    .line 4
    sget-object p3, Li63/r;->a:Ljava/util/List;

    const-string p3, "Content-Length"

    invoke-virtual {p1, p3}, Lal/a;->w0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, La63/i;->b:Ljava/lang/Long;

    if-nez p2, :cond_1

    .line 5
    sget-object p1, Li63/b;->a:Li63/d;

    .line 6
    sget-object p2, Li63/b;->b:Li63/d;

    .line 7
    :cond_1
    iput-object p2, p0, La63/i;->c:Li63/d;

    return-void
.end method

.method public constructor <init>(Lr63/e;Li63/d;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, La63/i;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p3, p0, La63/i;->d:Ljava/lang/Object;

    .line 10
    iget-object p1, p1, Lr63/e;->w:Ljava/lang/Object;

    .line 11
    check-cast p1, Le63/d;

    .line 12
    iget-object p1, p1, Le63/d;->c:Li63/n;

    .line 13
    sget-object p3, Li63/r;->a:Ljava/util/List;

    const-string p3, "Content-Length"

    invoke-virtual {p1, p3}, Lal/a;->w0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, La63/i;->b:Ljava/lang/Long;

    if-nez p2, :cond_1

    .line 14
    sget-object p1, Li63/b;->a:Li63/d;

    .line 15
    sget-object p2, Li63/b;->b:Li63/d;

    .line 16
    :cond_1
    iput-object p2, p0, La63/i;->c:Li63/d;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget v0, p0, La63/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La63/i;->b:Ljava/lang/Long;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La63/i;->b:Ljava/lang/Long;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Li63/d;
    .locals 1

    iget v0, p0, La63/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La63/i;->c:Li63/d;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La63/i;->c:Li63/d;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lio/ktor/utils/io/q;
    .locals 6

    iget v0, p0, La63/i;->a:I

    iget-object v1, p0, La63/i;->d:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/io/InputStream;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    sget-object v2, Lx63/b;->a:Lx63/a;

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "pool"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lb2/y;

    const/4 v4, 0x0

    const/16 v5, 0x10

    invoke-direct {v3, v2, v1, v4, v5}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Lbc3/e1;->w:Lbc3/e1;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v3}, Lhg3/i;->s0(Lbc3/c0;Lq83/j;ZLc93/m;)Lio/ktor/utils/io/t;

    move-result-object v0

    iget-object v0, v0, Lio/ktor/utils/io/t;->x:Lio/ktor/utils/io/m;

    return-object v0

    :pswitch_0
    check-cast v1, Lio/ktor/utils/io/q;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
