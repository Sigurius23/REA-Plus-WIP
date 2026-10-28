.class public final Lqx/h;
.super Ltx/f;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Ljava/lang/reflect/Executable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Executable;Ljava/lang/Class;I)V
    .locals 0

    iput p3, p0, Lqx/h;->a:I

    iput-object p1, p0, Lqx/h;->c:Ljava/lang/reflect/Executable;

    iput-object p2, p0, Lqx/h;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final U()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lqx/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqx/h;->c:Ljava/lang/reflect/Executable;

    check-cast v0, Ljava/lang/reflect/Method;

    iget-object v1, p0, Lqx/h;->b:Ljava/lang/Class;

    const-class v2, Ljava/lang/Object;

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lqx/h;->c:Ljava/lang/reflect/Executable;

    check-cast v0, Ljava/lang/reflect/Constructor;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lqx/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqx/h;->b:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lqx/h;->b:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
