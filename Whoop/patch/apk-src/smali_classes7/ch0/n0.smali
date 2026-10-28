.class public final synthetic Lch0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lch0/o0;


# direct methods
.method public synthetic constructor <init>(Lch0/o0;I)V
    .locals 0

    iput p2, p0, Lch0/n0;->w:I

    iput-object p1, p0, Lch0/n0;->x:Lch0/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/n0;->x:Lch0/o0;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lch0/o0;->e(Lch0/o0;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lch0/n0;->x:Lch0/o0;

    invoke-static {v0, p1}, Lch0/o0;->d(Lch0/o0;I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lch0/n0;->x:Lch0/o0;

    invoke-static {v0, p1}, Lch0/o0;->a(Lch0/o0;I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
