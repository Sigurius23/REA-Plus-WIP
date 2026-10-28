.class public abstract Lm9/a;
.super Lm9/d;
.source "SourceFile"


# instance fields
.field public final J:J

.field public final K:J

.field public final L:J

.field public M:Lxl/a;

.field public N:[I


# direct methods
.method public constructor <init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJJJ)V
    .locals 11

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Lm9/d;-><init>(Lz8/f;Lz8/g;ILu8/p;ILjava/lang/Object;JJ)V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 p1, p14

    iput-wide p1, p0, Lm9/a;->J:J

    move-wide/from16 p1, p10

    iput-wide p1, p0, Lm9/a;->K:J

    move-wide/from16 p1, p12

    iput-wide p1, p0, Lm9/a;->L:J

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lm9/a;->N:[I

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    aget p1, v0, p1

    return p1
.end method

.method public d()J
    .locals 5

    iget-wide v0, p0, Lm9/a;->J:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public abstract e()Z
.end method
