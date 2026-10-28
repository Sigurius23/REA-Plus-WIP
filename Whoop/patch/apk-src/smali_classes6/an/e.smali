.class public final Lan/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/p;


# instance fields
.field public final synthetic a:Lwm/p;

.field public final synthetic b:Lan/d;


# direct methods
.method public constructor <init>(Lan/d;Lwm/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lan/e;->b:Lan/d;

    iput-object p2, p0, Lan/e;->a:Lwm/p;

    return-void
.end method


# virtual methods
.method public final c(J)Lwm/o;
    .locals 8

    iget-object v0, p0, Lan/e;->a:Lwm/p;

    invoke-interface {v0, p1, p2}, Lwm/p;->c(J)Lwm/o;

    move-result-object p1

    new-instance p2, Lwm/o;

    new-instance v0, Lwm/q;

    iget-object v1, p1, Lwm/o;->a:Lwm/q;

    iget-wide v2, v1, Lwm/q;->a:J

    iget-wide v4, v1, Lwm/q;->b:J

    iget-object v1, p0, Lan/e;->b:Lan/d;

    iget-wide v6, v1, Lan/d;->x:J

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Lwm/q;-><init>(JJ)V

    new-instance v1, Lwm/q;

    iget-object p1, p1, Lwm/o;->b:Lwm/q;

    iget-wide v2, p1, Lwm/q;->a:J

    iget-wide v4, p1, Lwm/q;->b:J

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lwm/q;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lwm/o;-><init>(Lwm/q;Lwm/q;)V

    return-object p2
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lan/e;->a:Lwm/p;

    invoke-interface {v0}, Lwm/p;->e()Z

    move-result v0

    return v0
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Lan/e;->a:Lwm/p;

    invoke-interface {v0}, Lwm/p;->f()J

    move-result-wide v0

    return-wide v0
.end method
