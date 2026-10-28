.class public final synthetic Le61/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFJI)V
    .locals 0

    .line 1
    iput p5, p0, Le61/l;->w:I

    iput p1, p0, Le61/l;->y:F

    iput p2, p0, Le61/l;->z:F

    iput-wide p3, p0, Le61/l;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(FJFI)V
    .locals 0

    .line 2
    iput p5, p0, Le61/l;->w:I

    iput p1, p0, Le61/l;->y:F

    iput-wide p2, p0, Le61/l;->x:J

    iput p4, p0, Le61/l;->z:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JFFI)V
    .locals 0

    .line 3
    iput p5, p0, Le61/l;->w:I

    iput-wide p1, p0, Le61/l;->x:J

    iput p3, p0, Le61/l;->y:F

    iput p4, p0, Le61/l;->z:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Le61/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Le61/l;->x:J

    check-cast p1, Lk2/e;

    iget v2, p0, Le61/l;->y:F

    iget v3, p0, Le61/l;->z:F

    invoke-static {v2, v3, v0, v1, p1}, Lzi1/t;->b(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Lwr0/u0;->h(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-wide v0, p0, Le61/l;->x:J

    check-cast p1, Lk2/e;

    iget v2, p0, Le61/l;->y:F

    iget v3, p0, Le61/l;->z:F

    invoke-static {v2, v3, v0, v1, p1}, Lrz0/e;->e(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-wide v0, p0, Le61/l;->x:J

    check-cast p1, Lf2/d;

    iget v2, p0, Le61/l;->y:F

    iget v3, p0, Le61/l;->z:F

    invoke-static {v2, v3, v0, v1, p1}, Lrz0/e;->g(FFJLf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Lqk2/b;->a(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Ln71/o;->j(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Lmk1/c;->g(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Llz0/c;->b(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Lgb1/b0;->i(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-wide v0, p0, Le61/l;->x:J

    check-cast p1, Lk2/e;

    iget v2, p0, Le61/l;->y:F

    iget v3, p0, Le61/l;->z:F

    invoke-static {v2, v3, v0, v1, p1}, Lf11/d;->f(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Lf01/n0;->j(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget v0, p0, Le61/l;->z:F

    check-cast p1, Lk2/e;

    iget v1, p0, Le61/l;->y:F

    iget-wide v2, p0, Le61/l;->x:J

    invoke-static {v1, v0, v2, v3, p1}, Le61/m;->d(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
