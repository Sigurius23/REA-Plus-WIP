.class public final synthetic Lm23/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm23/d;


# direct methods
.method public synthetic constructor <init>(Lm23/d;I)V
    .locals 0

    iput p2, p0, Lm23/b;->w:I

    iput-object p1, p0, Lm23/b;->x:Lm23/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm23/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/MotionEvent;

    const-string v0, "this$0"

    iget-object v1, p0, Lm23/b;->x:Lm23/d;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lm23/d;->e()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, v1, Lm23/d;->S:Z

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm23/b;->x:Lm23/d;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-static {v0, p1}, Lm23/d;->a(Lm23/d;Landroid/view/MotionEvent;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1
    check-cast p1, Lf23/a;

    const-string v0, "this$0"

    iget-object v1, p0, Lm23/b;->x:Lm23/d;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lm23/d;->U:Lf23/a;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lm23/b;->x:Lm23/d;

    iget-object v0, v0, Lm23/d;->z:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
