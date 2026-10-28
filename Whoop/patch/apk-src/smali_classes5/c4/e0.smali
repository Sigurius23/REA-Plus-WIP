.class public final Lc4/e0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:Lkotlin/jvm/internal/f0;

.field public final synthetic x:Lc4/f0;

.field public final synthetic y:Ly3/k;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/f0;Lc4/f0;Ly3/k;JJ)V
    .locals 0

    iput-object p1, p0, Lc4/e0;->w:Lkotlin/jvm/internal/f0;

    iput-object p2, p0, Lc4/e0;->x:Lc4/f0;

    iput-object p3, p0, Lc4/e0;->y:Ly3/k;

    iput-wide p4, p0, Lc4/e0;->z:J

    iput-wide p6, p0, Lc4/e0;->E:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lc4/e0;->x:Lc4/f0;

    invoke-virtual {v0}, Lc4/f0;->getPositionProvider()Lc4/i0;

    move-result-object v1

    invoke-virtual {v0}, Lc4/f0;->getParentLayoutDirection()Ly3/m;

    move-result-object v5

    iget-wide v6, p0, Lc4/e0;->E:J

    iget-object v2, p0, Lc4/e0;->y:Ly3/k;

    iget-wide v3, p0, Lc4/e0;->z:J

    invoke-interface/range {v1 .. v7}, Lc4/i0;->i(Ly3/k;JLy3/m;J)J

    move-result-wide v0

    iget-object v2, p0, Lc4/e0;->w:Lkotlin/jvm/internal/f0;

    iput-wide v0, v2, Lkotlin/jvm/internal/f0;->w:J

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
