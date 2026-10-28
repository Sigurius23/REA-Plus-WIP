.class public final Lbm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public final w:Z

.field public final x:Lbm/t;


# direct methods
.method public constructor <init>(ZLbm/t;)V
    .locals 1

    const-string v0, "pagerState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbm/a;->w:Z

    iput-object p2, p0, Lbm/a;->x:Lbm/t;

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 0

    const/4 p1, 0x2

    if-ne p5, p1, :cond_1

    iget-boolean p1, p0, Lbm/a;->w:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p3, p4}, Lh2/b;->e(J)F

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-static {p1, p2}, Lge3/g;->c(FF)J

    move-result-wide p1

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final V(JJLq83/d;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lbm/a;->x:Lbm/t;

    invoke-virtual {p1}, Lbm/t;->h()F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lbm/a;->w:Z

    if-eqz p1, :cond_0

    invoke-static {p3, p4}, Ly3/q;->d(J)F

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-static {p1, p2}, Ls4/i;->a(FF)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    const-wide/16 p1, 0x0

    :goto_1
    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3
.end method
