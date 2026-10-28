.class public final synthetic Lg40/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg40/f0;->w:I

    iput-wide p1, p0, Lg40/f0;->x:J

    iput-object p3, p0, Lg40/f0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    iput p4, p0, Lg40/f0;->w:I

    iput-object p1, p0, Lg40/f0;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lg40/f0;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JII)V
    .locals 0

    .line 3
    iput p5, p0, Lg40/f0;->w:I

    iput-object p1, p0, Lg40/f0;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lg40/f0;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg40/f0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Lqt2/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v1, v2, v0, p1, p2}, Lqt2/f;->b(JLqt2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v1, v2, v0, p1, p2}, Lqm1/e;->m(JLjava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Lm1/x;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Ln1/h;->a(Lm1/x;JLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Lgr1/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Ljr1/a;->a(Lgr1/i;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Ll3/v0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Luf/c0;->u(Ll3/v0;JLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Lhy0/v0;->c(Lcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Lhy0/v0;->d(Ljava/lang/Integer;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lg40/f0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-wide v1, p0, Lg40/f0;->x:J

    invoke-static {v1, v2, v0, p1, p2}, Lx43/j;->h(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
