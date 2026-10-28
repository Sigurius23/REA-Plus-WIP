.class public final synthetic Lig0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgg0/c$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lgg0/c$b;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lig0/c;->w:I

    iput-object p1, p0, Lig0/c;->x:Lgg0/c$b;

    iput-object p2, p0, Lig0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lig0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lig0/c;->x:Lgg0/c$b;

    iget-object v1, p0, Lig0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lig0/e;->e(Lgg0/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lig0/c;->x:Lgg0/c$b;

    iget-object v1, p0, Lig0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lig0/e;->d(Lgg0/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lig0/c;->x:Lgg0/c$b;

    iget-object v1, p0, Lig0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lig0/e;->a(Lgg0/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lig0/c;->x:Lgg0/c$b;

    iget-object v1, p0, Lig0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lig0/e;->b(Lgg0/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
