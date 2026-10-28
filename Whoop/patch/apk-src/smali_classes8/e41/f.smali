.class public final synthetic Le41/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Le41/f;->w:I

    iput-boolean p1, p0, Le41/f;->x:Z

    iput-object p2, p0, Le41/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Le41/f;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Le41/f;->x:Z

    iget-object v1, p0, Le41/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lvp1/h;->A(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v0, p0, Le41/f;->x:Z

    iget-object v1, p0, Le41/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lsg2/d;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-boolean v0, p0, Le41/f;->x:Z

    iget-object v1, p0, Le41/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/startactivity/goals/a;->d(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-boolean v0, p0, Le41/f;->x:Z

    iget-object v1, p0, Le41/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lih2/b;->q(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-boolean v0, p0, Le41/f;->x:Z

    iget-object v1, p0, Le41/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Le41/g;->f(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
