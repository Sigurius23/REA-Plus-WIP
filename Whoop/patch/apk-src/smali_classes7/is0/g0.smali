.class public final synthetic Lis0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLc93/a;Lp1/z0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lis0/g0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lis0/g0;->x:J

    iput-object p3, p0, Lis0/g0;->y:Ljava/lang/Object;

    iput-object p4, p0, Lis0/g0;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Li91/h;J)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lis0/g0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/g0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lis0/g0;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lis0/g0;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lis0/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/g0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lis0/g0;->z:Ljava/lang/Object;

    check-cast v1, Li91/h;

    iget-wide v2, p0, Lis0/g0;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, v2, v3, p1}, Ln71/o;->m(Ljava/util/List;Li91/h;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/g0;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lis0/g0;->z:Ljava/lang/Object;

    check-cast v1, Lp1/z0;

    check-cast p1, Lk2/e;

    iget-wide v2, p0, Lis0/g0;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lis0/j0;->b(JLc93/a;Lp1/z0;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
