.class public final synthetic Lch0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lch0/r;->w:I

    iput-object p1, p0, Lch0/r;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/r;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lch0/m0;->a(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/r;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lch0/m0;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lch0/r;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lch0/u;->a(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
