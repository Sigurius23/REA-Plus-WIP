.class public final synthetic Lyf1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwf1/c$c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lwf1/c$c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lyf1/c;->w:I

    iput-object p1, p0, Lyf1/c;->x:Lwf1/c$c;

    iput-object p2, p0, Lyf1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lyf1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyf1/c;->x:Lwf1/c$c;

    iget-object v1, p0, Lyf1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyf1/d;->f(Lwf1/c$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyf1/c;->x:Lwf1/c$c;

    iget-object v1, p0, Lyf1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyf1/d;->c(Lwf1/c$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lyf1/c;->x:Lwf1/c$c;

    iget-object v1, p0, Lyf1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyf1/d;->b(Lwf1/c$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lyf1/c;->x:Lwf1/c$c;

    iget-object v1, p0, Lyf1/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lyf1/d;->d(Lwf1/c$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

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
