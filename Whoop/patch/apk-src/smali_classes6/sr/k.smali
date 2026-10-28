.class public final synthetic Lsr/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsr/l;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lsr/l;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsr/k;->a:Lsr/l;

    iput-wide p2, p0, Lsr/k;->b:J

    iput-wide p4, p0, Lsr/k;->c:J

    return-void
.end method


# virtual methods
.method public final a(Lsr/o;)Lcq/u;
    .locals 10

    iget-object v0, p0, Lsr/k;->a:Lsr/l;

    iget-object v2, v0, Lsr/l;->a:Lsr/h;

    iget-wide v7, p0, Lsr/k;->c:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v1, v2, Lsr/h;->a:Lxr/t;

    const-string v3, "requestExpressIntegrityToken(%s)"

    invoke-virtual {v1, v3, v0}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Lcq/i;

    invoke-direct {v3}, Lcq/i;-><init>()V

    new-instance v1, Lsr/e;

    iget-wide v5, p0, Lsr/k;->b:J

    move-object v9, v3

    move-object v4, p1

    invoke-direct/range {v1 .. v9}, Lsr/e;-><init>(Lsr/h;Lcq/i;Lsr/o;JJLcq/i;)V

    iget-object p1, v2, Lsr/h;->e:Lxr/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lxr/v;

    invoke-direct {v0, p1, v3, v3, v1}, Lxr/v;-><init>(Lxr/b;Lcq/i;Lcq/i;Lsr/g;)V

    invoke-virtual {p1}, Lxr/b;->a()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object p1, v3, Lcq/i;->a:Lcq/u;

    return-object p1
.end method
