.class public final Lv2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lrm/j1;

.field public final b:Lrm/j1;

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv2/b;->w:Lv2/b;

    new-instance v0, Lrm/j1;

    invoke-direct {v0}, Lrm/j1;-><init>()V

    iput-object v0, p0, Lv2/c;->a:Lrm/j1;

    new-instance v0, Lrm/j1;

    invoke-direct {v0}, Lrm/j1;-><init>()V

    iput-object v0, p0, Lv2/c;->b:Lrm/j1;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    invoke-static {p1, p2}, Ly3/q;->d(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "maximumVelocity should be a positive value. You specified="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2}, Ly3/q;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lv2/c;->a:Lrm/j1;

    invoke-static {p1, p2}, Ly3/q;->d(J)F

    move-result v1

    invoke-virtual {v0, v1}, Lrm/j1;->b(F)F

    move-result v0

    iget-object v1, p0, Lv2/c;->b:Lrm/j1;

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p1

    invoke-virtual {v1, p1}, Lrm/j1;->b(F)F

    move-result p1

    invoke-static {v0, p1}, Ls4/i;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method
