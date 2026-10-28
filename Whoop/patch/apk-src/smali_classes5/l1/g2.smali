.class public final synthetic Ll1/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(JLc93/a;ZZI)V
    .locals 0

    .line 1
    const/4 p6, 0x0

    iput p6, p0, Ll1/g2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll1/g2;->z:J

    iput-object p3, p0, Ll1/g2;->E:Ll83/e;

    iput-boolean p4, p0, Ll1/g2;->x:Z

    iput-boolean p5, p0, Ll1/g2;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;ZJ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ll1/g2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll1/g2;->x:Z

    iput-object p2, p0, Ll1/g2;->E:Ll83/e;

    iput-boolean p3, p0, Ll1/g2;->y:Z

    iput-wide p4, p0, Ll1/g2;->z:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll1/g2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/g2;->E:Ll83/e;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Ll1/g2;->x:Z

    iget-boolean v3, p0, Ll1/g2;->y:Z

    iget-wide v4, p0, Ll1/g2;->z:J

    invoke-static/range {v1 .. v7}, Lsy0/m;->b(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll1/g2;->E:Ll83/e;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-wide v1, p0, Ll1/g2;->z:J

    iget-boolean v4, p0, Ll1/g2;->x:Z

    iget-boolean v5, p0, Ll1/g2;->y:Z

    invoke-static/range {v1 .. v7}, Ll1/n2;->d(JLc93/a;ZZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
