.class public final Lj3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lb2/v;

.field public final c:Lkotlin/jvm/internal/m;

.field public d:Lj3/d;

.field public e:J

.field public f:J

.field public g:J

.field public final synthetic h:Lj3/e;


# direct methods
.method public constructor <init>(Lj3/e;ILb2/v;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/d;->h:Lj3/e;

    iput p2, p0, Lj3/d;->a:I

    iput-object p3, p0, Lj3/d;->b:Lb2/v;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Lj3/d;->c:Lkotlin/jvm/internal/m;

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lj3/d;->g:J

    return-void
.end method


# virtual methods
.method public final a(JJJJ[F)V
    .locals 13

    iget-object v0, p0, Lj3/d;->h:Lj3/e;

    iget-wide v9, v0, Lj3/e;->f:J

    iget-object v11, p0, Lj3/d;->b:Lb2/v;

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-object/from16 v12, p9

    invoke-static/range {v1 .. v12}, Lup/d;->J(JJJJJLb2/v;[F)Lj3/c;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lj3/d;->c:Lkotlin/jvm/internal/m;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b()V
    .locals 9

    iget-object v0, p0, Lj3/d;->h:Lj3/e;

    iget-object v1, v0, Lj3/e;->a:La0/g0;

    iget v2, p0, Lj3/d;->a:I

    invoke-virtual {v1, v2}, La0/g0;->g(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj3/d;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v0, p0, Lj3/d;->d:Lj3/d;

    iput-object v4, p0, Lj3/d;->d:Lj3/d;

    if-eqz v0, :cond_6

    invoke-virtual {v1, v2}, La0/g0;->d(I)I

    move-result v3

    iget-object v4, v1, La0/s;->c:[Ljava/lang/Object;

    aget-object v5, v4, v3

    iget-object v1, v1, La0/s;->b:[I

    aput v2, v1, v3

    aput-object v0, v4, v3

    return-void

    :cond_1
    invoke-virtual {v1, v2}, La0/g0;->d(I)I

    move-result v5

    iget-object v6, v1, La0/s;->c:[Ljava/lang/Object;

    aget-object v7, v6, v5

    iget-object v1, v1, La0/s;->b:[I

    aput v2, v1, v5

    aput-object v3, v6, v5

    :goto_0
    iget-object v1, v3, Lj3/d;->d:Lj3/d;

    if-nez v1, :cond_7

    :goto_1
    iget-object v1, v0, Lj3/e;->b:Lj3/d;

    if-ne v1, p0, :cond_2

    iget-object v1, v1, Lj3/d;->d:Lj3/d;

    iput-object v1, v0, Lj3/e;->b:Lj3/d;

    iput-object v4, p0, Lj3/d;->d:Lj3/d;

    return-void

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, v1, Lj3/d;->d:Lj3/d;

    goto :goto_2

    :cond_3
    move-object v0, v4

    :goto_2
    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    if-eqz v1, :cond_6

    if-ne v1, p0, :cond_5

    if-eqz v0, :cond_4

    iget-object v1, v1, Lj3/d;->d:Lj3/d;

    iput-object v1, v0, Lj3/d;->d:Lj3/d;

    :cond_4
    iput-object v4, p0, Lj3/d;->d:Lj3/d;

    return-void

    :cond_5
    iget-object v0, v1, Lj3/d;->d:Lj3/d;

    goto :goto_2

    :cond_6
    return-void

    :cond_7
    if-ne v1, p0, :cond_8

    iget-object v0, p0, Lj3/d;->d:Lj3/d;

    iput-object v0, v3, Lj3/d;->d:Lj3/d;

    iput-object v4, p0, Lj3/d;->d:Lj3/d;

    return-void

    :cond_8
    move-object v3, v1

    goto :goto_0
.end method
