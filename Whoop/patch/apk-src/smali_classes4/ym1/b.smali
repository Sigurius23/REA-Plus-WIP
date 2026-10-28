.class public final synthetic Lym1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lld1/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lym1/b;->w:I

    iput-object p1, p0, Lym1/b;->x:Lld1/c;

    iput-object p2, p0, Lym1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lym1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lym1/b;->x:Lld1/c;

    iget-object v1, p0, Lym1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lym1/c;->b(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lym1/b;->x:Lld1/c;

    iget-object v1, p0, Lym1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lym1/c;->d(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
