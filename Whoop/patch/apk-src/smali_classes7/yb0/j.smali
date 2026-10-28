.class public final synthetic Lyb0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lwb0/f;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lwb0/f;I)V
    .locals 0

    iput p3, p0, Lyb0/j;->w:I

    iput-object p1, p0, Lyb0/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lyb0/j;->y:Lwb0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lyb0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyb0/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lyb0/j;->y:Lwb0/f;

    invoke-static {v0, v1}, Lyb0/k;->W(Lkotlin/jvm/functions/Function1;Lwb0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyb0/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lyb0/j;->y:Lwb0/f;

    invoke-static {v0, v1}, Lyb0/k;->S(Lkotlin/jvm/functions/Function1;Lwb0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
