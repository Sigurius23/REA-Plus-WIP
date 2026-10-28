.class public final Lwm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/p;


# instance fields
.field public final a:Lwm/b;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(Lwm/b;JJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm/a;->a:Lwm/b;

    iput-wide p2, p0, Lwm/a;->b:J

    iput-wide p4, p0, Lwm/a;->c:J

    iput-wide p6, p0, Lwm/a;->d:J

    iput-wide p8, p0, Lwm/a;->e:J

    iput-wide p10, p0, Lwm/a;->f:J

    return-void
.end method


# virtual methods
.method public final c(J)Lwm/o;
    .locals 13

    iget-object v0, p0, Lwm/a;->a:Lwm/b;

    invoke-interface {v0, p1, p2}, Lwm/b;->d(J)J

    move-result-wide v1

    iget-wide v9, p0, Lwm/a;->e:J

    iget-wide v11, p0, Lwm/a;->f:J

    const-wide/16 v3, 0x0

    iget-wide v5, p0, Lwm/a;->c:J

    iget-wide v7, p0, Lwm/a;->d:J

    invoke-static/range {v1 .. v12}, Lt9/d;->b(JJJJJJ)J

    move-result-wide v0

    new-instance v2, Lwm/o;

    new-instance v3, Lwm/q;

    invoke-direct {v3, p1, p2, v0, v1}, Lwm/q;-><init>(JJ)V

    invoke-direct {v2, v3, v3}, Lwm/o;-><init>(Lwm/q;Lwm/q;)V

    return-object v2
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lwm/a;->b:J

    return-wide v0
.end method
