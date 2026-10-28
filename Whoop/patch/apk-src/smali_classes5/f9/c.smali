.class public final Lf9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:Lf9/u;

.field public final j:Lf9/t;

.field public final k:Landroid/net/Uri;

.field public final l:Lf9/i;

.field public final m:Ljava/util/List;


# direct methods
.method public constructor <init>(JJJZJJJJLf9/i;Lf9/u;Lf9/t;Landroid/net/Uri;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf9/c;->a:J

    iput-wide p3, p0, Lf9/c;->b:J

    iput-wide p5, p0, Lf9/c;->c:J

    iput-boolean p7, p0, Lf9/c;->d:Z

    iput-wide p8, p0, Lf9/c;->e:J

    iput-wide p10, p0, Lf9/c;->f:J

    iput-wide p12, p0, Lf9/c;->g:J

    iput-wide p14, p0, Lf9/c;->h:J

    move-object/from16 p1, p16

    iput-object p1, p0, Lf9/c;->l:Lf9/i;

    move-object/from16 p1, p17

    iput-object p1, p0, Lf9/c;->i:Lf9/u;

    move-object/from16 p1, p19

    iput-object p1, p0, Lf9/c;->k:Landroid/net/Uri;

    move-object/from16 p1, p18

    iput-object p1, p0, Lf9/c;->j:Lf9/t;

    move-object/from16 p1, p20

    iput-object p1, p0, Lf9/c;->m:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(I)Lf9/h;
    .locals 1

    iget-object v0, p0, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/h;

    return-object p1
.end method

.method public final b(I)J
    .locals 6

    iget-object v0, p0, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_1

    iget-wide v1, p0, Lf9/c;->b:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    return-wide v3

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/h;

    iget-wide v3, p1, Lf9/h;->b:J

    :goto_0
    sub-long/2addr v1, v3

    return-wide v1

    :cond_1
    add-int/lit8 v1, p1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf9/h;

    iget-wide v1, v1, Lf9/h;->b:J

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/h;

    iget-wide v3, p1, Lf9/h;->b:J

    goto :goto_0
.end method

.method public final c(I)J
    .locals 2

    invoke-virtual {p0, p1}, Lf9/c;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lx8/t;->J(J)J

    move-result-wide v0

    return-wide v0
.end method
