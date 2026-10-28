.class public final Ly2/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/k1;

.field public final b:Lp1/k1;

.field public final c:Lp1/g1;

.field public final d:Lp1/i1;

.field public final e:Lp1/g1;

.field public final f:Ly2/p;

.field public final g:Ly2/p;

.field public h:J

.field public i:J

.field public j:J

.field public k:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ly2/d2;->a:Lp1/k1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ly2/d2;->b:Lp1/k1;

    new-instance v0, Lp1/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/g1;-><init>(F)V

    iput-object v0, p0, Ly2/d2;->c:Lp1/g1;

    new-instance v0, Lp1/i1;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lp1/i1;-><init>(J)V

    iput-object v0, p0, Ly2/d2;->d:Lp1/i1;

    new-instance v0, Lp1/g1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lp1/g1;-><init>(F)V

    iput-object v0, p0, Ly2/d2;->e:Lp1/g1;

    const-string v0, " source"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ly2/p;

    invoke-direct {v1, v0}, Ly2/p;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Ly2/d2;->f:Ly2/p;

    const-string v0, " target"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ly2/p;

    invoke-direct {v0, p1}, Ly2/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ly2/d2;->g:Ly2/p;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ly2/d2;->h:J

    iput-wide v0, p0, Ly2/d2;->i:J

    iput-wide v0, p0, Ly2/d2;->j:J

    iput-wide v0, p0, Ly2/d2;->k:J

    return-void
.end method
