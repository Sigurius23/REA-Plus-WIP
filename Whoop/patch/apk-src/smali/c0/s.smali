.class public final Lc0/s;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lc0/u;

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:J


# direct methods
.method public constructor <init>(Lc0/u;Ly2/j1;J)V
    .locals 0

    iput-object p1, p0, Lc0/s;->w:Lc0/u;

    iput-object p2, p0, Lc0/s;->x:Ly2/j1;

    iput-wide p3, p0, Lc0/s;->y:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc0/s;->w:Lc0/u;

    iget-object v0, v0, Lc0/u;->R:Lc0/x;

    iget-object v1, v0, Lc0/x;->b:Lb2/h;

    iget-object v0, p0, Lc0/s;->x:Ly2/j1;

    iget v2, v0, Ly2/j1;->w:I

    iget v3, v0, Ly2/j1;->x:I

    int-to-long v4, v2

    const/16 v2, 0x20

    shl-long/2addr v4, v2

    int-to-long v2, v3

    const-wide v6, 0xffffffffL

    and-long/2addr v2, v6

    or-long/2addr v2, v4

    iget-wide v4, p0, Lc0/s;->y:J

    sget-object v6, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v1 .. v6}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
