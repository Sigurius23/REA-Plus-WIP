.class public final synthetic Lcz0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLi2/x;J)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lcz0/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcz0/l;->y:F

    iput-object p2, p0, Lcz0/l;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lcz0/l;->x:J

    return-void
.end method

.method public synthetic constructor <init>(JFLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lcz0/l;->w:I

    iput-wide p1, p0, Lcz0/l;->x:J

    iput p3, p0, Lcz0/l;->y:F

    iput-object p4, p0, Lcz0/l;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JLd0/e;F)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lcz0/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcz0/l;->x:J

    iput-object p3, p0, Lcz0/l;->z:Ljava/lang/Object;

    iput p4, p0, Lcz0/l;->y:F

    return-void
.end method

.method public synthetic constructor <init>(Lh11/h;JF)V
    .locals 1

    .line 4
    const/4 v0, 0x1

    iput v0, p0, Lcz0/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/l;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lcz0/l;->x:J

    iput p4, p0, Lcz0/l;->y:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcz0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcz0/l;->z:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v1, p0, Lcz0/l;->x:J

    check-cast p1, Lk2/e;

    iget v3, p0, Lcz0/l;->y:F

    invoke-static {v3, v0, v1, v2, p1}, Ly21/i;->b(FLi2/x;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcz0/l;->z:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    iget v1, p0, Lcz0/l;->y:F

    check-cast p1, Lk2/e;

    iget-wide v2, p0, Lcz0/l;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lqt2/j;->c(JLd0/e;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcz0/l;->z:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    check-cast p1, Lf2/d;

    iget-wide v1, p0, Lcz0/l;->x:J

    iget v3, p0, Lcz0/l;->y:F

    invoke-static {v1, v2, v3, v0, p1}, Ljn2/c;->a(JFLp1/t2;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcz0/l;->z:Ljava/lang/Object;

    check-cast v0, Lh11/h;

    iget v1, p0, Lcz0/l;->y:F

    check-cast p1, Lk2/e;

    iget-wide v2, p0, Lcz0/l;->x:J

    invoke-static {v0, v2, v3, v1, p1}, Lh11/d;->b(Lh11/h;JFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcz0/l;->z:Ljava/lang/Object;

    check-cast v0, Li2/k;

    check-cast p1, Lk2/e;

    iget-wide v1, p0, Lcz0/l;->x:J

    iget v3, p0, Lcz0/l;->y:F

    invoke-static {v1, v2, v3, v0, p1}, Lcz0/o;->e(JFLi2/k;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
