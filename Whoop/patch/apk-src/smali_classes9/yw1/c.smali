.class public final synthetic Lyw1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Luw1/c$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Luw1/c$b;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lyw1/c;->w:I

    iput-object p1, p0, Lyw1/c;->x:Luw1/c$b;

    iput-object p2, p0, Lyw1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lyw1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyw1/c;->x:Luw1/c$b;

    iget-object v1, p0, Lyw1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyw1/d;->c(Luw1/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyw1/c;->x:Luw1/c$b;

    iget-object v1, p0, Lyw1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyw1/d;->b(Luw1/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lyw1/c;->x:Luw1/c$b;

    iget-object v1, p0, Lyw1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyw1/d;->e(Luw1/c$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
