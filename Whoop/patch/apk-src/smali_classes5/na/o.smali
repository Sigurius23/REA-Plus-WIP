.class public final Lna/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Lu8/p;

.field public final h:I

.field public final i:[J

.field public final j:[J

.field public final k:I

.field public final l:[Lna/p;


# direct methods
.method public constructor <init>(IIJJJJLu8/p;I[Lna/p;I[J[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lna/o;->a:I

    iput p2, p0, Lna/o;->b:I

    iput-wide p3, p0, Lna/o;->c:J

    iput-wide p5, p0, Lna/o;->d:J

    iput-wide p7, p0, Lna/o;->e:J

    iput-wide p9, p0, Lna/o;->f:J

    iput-object p11, p0, Lna/o;->g:Lu8/p;

    iput p12, p0, Lna/o;->h:I

    iput-object p13, p0, Lna/o;->l:[Lna/p;

    iput p14, p0, Lna/o;->k:I

    iput-object p15, p0, Lna/o;->i:[J

    move-object/from16 p1, p16

    iput-object p1, p0, Lna/o;->j:[J

    return-void
.end method


# virtual methods
.method public final a(Lu8/p;)Lna/o;
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Lna/o;

    iget-object v2, v0, Lna/o;->i:[J

    iget-object v3, v0, Lna/o;->j:[J

    move-object/from16 v16, v2

    iget v2, v0, Lna/o;->a:I

    move-object/from16 v17, v3

    iget v3, v0, Lna/o;->b:I

    iget-wide v4, v0, Lna/o;->c:J

    iget-wide v6, v0, Lna/o;->d:J

    iget-wide v8, v0, Lna/o;->e:J

    iget-wide v10, v0, Lna/o;->f:J

    iget v13, v0, Lna/o;->h:I

    iget-object v14, v0, Lna/o;->l:[Lna/p;

    iget v15, v0, Lna/o;->k:I

    move-object/from16 v12, p1

    invoke-direct/range {v1 .. v17}, Lna/o;-><init>(IIJJJJLu8/p;I[Lna/p;I[J[J)V

    return-object v1
.end method
