.class public final synthetic Lc11/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(JLp1/t2;I)V
    .locals 0

    iput p4, p0, Lc11/g;->w:I

    iput-wide p1, p0, Lc11/g;->x:J

    iput-object p3, p0, Lc11/g;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lc11/g;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v1, p1

    check-cast v1, Lk2/e;

    iget-object p1, p0, Lc11/g;->y:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/4 v0, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v2}, Le93/b;->m(FFF)F

    move-result v8

    const/4 v10, 0x0

    const/16 v11, 0x76

    iget-wide v2, p0, Lc11/g;->x:J

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v0, p1

    check-cast v0, Lk2/e;

    iget-object p1, p0, Lc11/g;->y:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p1, v1, v2}, Le93/b;->m(FFF)F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x76

    iget-wide v1, p0, Lc11/g;->x:J

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v0, p1

    check-cast v0, Lk2/e;

    iget-object p1, p0, Lc11/g;->y:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x76

    iget-wide v1, p0, Lc11/g;->x:J

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc11/g;->y:Lp1/t2;

    check-cast p1, Lk2/e;

    iget-wide v1, p0, Lc11/g;->x:J

    invoke-static {v1, v2, v0, p1}, Lc11/h;->d(JLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
