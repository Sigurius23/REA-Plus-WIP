.class public final synthetic Lb30/l6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZZI)V
    .locals 0

    .line 1
    const/4 p4, 0x2

    iput p4, p0, Lb30/l6;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/l6;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/l6;->x:Z

    iput-boolean p3, p0, Lb30/l6;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/l6;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lb30/l6;->x:Z

    iput-boolean p3, p0, Lb30/l6;->y:Z

    iput-object p1, p0, Lb30/l6;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 3
    const/4 p4, 0x0

    iput p4, p0, Lb30/l6;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/l6;->x:Z

    iput-boolean p2, p0, Lb30/l6;->y:Z

    iput-object p3, p0, Lb30/l6;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb30/l6;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/l6;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/l6;->x:Z

    iget-boolean v2, p0, Lb30/l6;->y:Z

    invoke-static {v0, v1, v2, p1, p2}, Lb30/c4;->f(Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/l6;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/l6;->x:Z

    iget-boolean v2, p0, Lb30/l6;->y:Z

    invoke-static {v1, v2, v0, p1, p2}, Lw71/h0;->c(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/l6;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/l6;->x:Z

    iget-boolean v2, p0, Lb30/l6;->y:Z

    invoke-static {v1, v2, v0, p1, p2}, Luf/c0;->t(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
