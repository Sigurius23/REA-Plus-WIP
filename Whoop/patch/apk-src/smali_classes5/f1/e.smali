.class public final synthetic Lf1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLc93/a;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lf1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf1/e;->y:J

    iput-object p3, p0, Lf1/e;->z:Ljava/lang/Object;

    iput-boolean p4, p0, Lf1/e;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(Lmz0/a;ZJ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lf1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/e;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lf1/e;->x:Z

    iput-wide p3, p0, Lf1/e;->y:J

    return-void
.end method

.method public synthetic constructor <init>(ZLny0/d0;J)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lf1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf1/e;->x:Z

    iput-object p2, p0, Lf1/e;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lf1/e;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lny0/d0;

    iget-wide v1, p0, Lf1/e;->y:J

    check-cast p1, Lk2/e;

    iget-boolean v3, p0, Lf1/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lny0/d1;->c(ZLny0/d0;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lmz0/a;

    iget-wide v1, p0, Lf1/e;->y:J

    check-cast p1, Lk2/e;

    iget-boolean v3, p0, Lf1/e;->x:Z

    invoke-static {v0, v3, v1, v2, p1}, Lmz0/b;->a(Lmz0/a;ZJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lf1/e;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    check-cast p1, Lf2/d;

    iget-object v0, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v0}, Lf2/b;->d()J

    move-result-wide v0

    const/16 v3, 0x20

    shr-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, Lf1/y0;->r(Lf2/d;F)Li2/g;

    move-result-object v4

    new-instance v5, Li2/p;

    iget-wide v0, p0, Lf1/e;->y:J

    const/4 v3, 0x5

    invoke-direct {v5, v0, v1, v3}, Li2/p;-><init>(JI)V

    new-instance v1, Lch0/e;

    const/4 v6, 0x6

    iget-boolean v3, p0, Lf1/e;->x:Z

    invoke-direct/range {v1 .. v6}, Lch0/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
