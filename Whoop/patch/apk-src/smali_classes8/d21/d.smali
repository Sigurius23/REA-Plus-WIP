.class public final synthetic Ld21/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p3, p0, Ld21/d;->w:I

    iput-object p1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Ld21/d;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ld21/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ld21/d;->y:I

    invoke-static {v0, v1, p1}, Lv90/q;->g(Lkotlin/jvm/functions/Function1;IZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ld21/d;->y:I

    invoke-static {v0, v1, p1}, Lv90/f;->c(Lkotlin/jvm/functions/Function1;IZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Ld21/d;->y:I

    check-cast p1, Lq3/y;

    iget-object v1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lih0/l;->t(Lkotlin/jvm/functions/Function1;ILq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Ld21/d;->y:I

    check-cast p1, Lq3/y;

    iget-object v1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lih0/l;->n(Lkotlin/jvm/functions/Function1;ILq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ld21/d;->y:I

    invoke-static {v0, v1, p1}, Lg21/b;->b(Lkotlin/jvm/functions/Function1;IZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Ld21/d;->y:I

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    iget-object v1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lfu2/d;->m(Lkotlin/jvm/functions/Function1;ILcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, Ld21/d;->y:I

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    iget-object v1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lfu2/d;->c(Lkotlin/jvm/functions/Function1;ILcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ld21/d;->y:I

    invoke-static {p1, v0, v1}, Leu2/o;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget v0, p0, Ld21/d;->y:I

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Ld21/f;->c(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget v0, p0, Ld21/d;->y:I

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Ld21/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Ld21/f;->d(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
