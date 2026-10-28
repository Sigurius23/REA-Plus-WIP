.class public final synthetic Lz22/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx22/c$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lx22/c$b;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lz22/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lz22/c;->x:Lx22/c$b;

    return-void
.end method

.method public synthetic constructor <init>(Lx22/c$b;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lz22/c;->w:I

    iput-object p1, p0, Lz22/c;->x:Lx22/c$b;

    iput-object p2, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lz22/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lz22/c;->x:Lx22/c$b;

    invoke-static {v0, v1}, Lz22/d;->a(Lkotlin/jvm/functions/Function1;Lx22/c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lz22/c;->x:Lx22/c$b;

    iget-object v1, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lz22/d;->h(Lkotlin/jvm/functions/Function1;Lx22/c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lz22/c;->x:Lx22/c$b;

    iget-object v1, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lz22/d;->d(Lkotlin/jvm/functions/Function1;Lx22/c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lz22/c;->x:Lx22/c$b;

    iget-object v1, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lz22/d;->e(Lkotlin/jvm/functions/Function1;Lx22/c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lz22/c;->x:Lx22/c$b;

    iget-object v1, p0, Lz22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lz22/d;->b(Lkotlin/jvm/functions/Function1;Lx22/c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
