.class public final Lc0/y0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ly2/j1;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Lc0/h;


# direct methods
.method public constructor <init>(Ly2/j1;JJLc0/h;)V
    .locals 0

    iput-object p1, p0, Lc0/y0;->w:Ly2/j1;

    iput-wide p2, p0, Lc0/y0;->x:J

    iput-wide p4, p0, Lc0/y0;->y:J

    iput-object p6, p0, Lc0/y0;->z:Lc0/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v0, p1

    check-cast v0, Ly2/i1;

    iget-wide v1, p0, Lc0/y0;->x:J

    const/16 p1, 0x20

    shr-long v3, v1, p1

    long-to-int v3, v3

    iget-wide v4, p0, Lc0/y0;->y:J

    shr-long v6, v4, p1

    long-to-int p1, v6

    add-int/2addr v3, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v1, v6

    long-to-int p1, v1

    and-long v1, v4, v6

    long-to-int v1, v1

    add-int/2addr p1, v1

    const/4 v4, 0x0

    iget-object v5, p0, Lc0/y0;->z:Lc0/h;

    iget-object v1, p0, Lc0/y0;->w:Ly2/j1;

    move v2, v3

    move v3, p1

    invoke-virtual/range {v0 .. v5}, Ly2/i1;->r(Ly2/j1;IIFLkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
