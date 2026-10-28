.class public final Lqj/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ll83/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLl83/e;II)V
    .locals 0

    iput p5, p0, Lqj/a;->w:I

    iput-object p1, p0, Lqj/a;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lqj/a;->x:Z

    iput-object p3, p0, Lqj/a;->z:Ll83/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lqj/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lqj/a;->y:Ljava/lang/Object;

    check-cast p2, Luj/m;

    iget-object v0, p0, Lqj/a;->z:Ll83/e;

    check-cast v0, Lx1/b;

    const/16 v1, 0x181

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v1

    iget-boolean v2, p0, Lqj/a;->x:Z

    invoke-static {p2, v2, v0, p1, v1}, Luj/k;->a(Luj/m;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p2, p0, Lqj/a;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/ButtonType;

    iget-object v0, p0, Lqj/a;->z:Ll83/e;

    check-cast v0, Lx1/b;

    const/16 v1, 0x181

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v1

    iget-boolean v2, p0, Lqj/a;->x:Z

    invoke-static {p2, v2, v0, p1, v1}, Luj/e;->a(Lcom/amplitude/android/engagement/types/ButtonType;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object p2, p0, Lqj/a;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/ButtonBlock;

    iget-object v0, p0, Lqj/a;->z:Ll83/e;

    check-cast v0, Lsj/f;

    const/16 v1, 0x9

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v1

    iget-boolean v2, p0, Lqj/a;->x:Z

    invoke-static {p2, v2, v0, p1, v1}, Lse/a;->d(Lcom/amplitude/android/engagement/types/ButtonBlock;ZLsj/f;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
