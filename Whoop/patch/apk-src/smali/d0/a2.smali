.class public final synthetic Ld0/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld0/z1;


# direct methods
.method public synthetic constructor <init>(Ld0/z1;I)V
    .locals 0

    iput p2, p0, Ld0/a2;->w:I

    iput-object p1, p0, Ld0/a2;->x:Ld0/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ld0/a2;->w:I

    check-cast p1, Lp1/i0;

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ld0/c2;

    const/4 v0, 0x1

    iget-object v1, p0, Ld0/a2;->x:Ld0/z1;

    invoke-direct {p1, v1, v0}, Ld0/c2;-><init>(Ld0/z1;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ld0/c2;

    const/4 v0, 0x0

    iget-object v1, p0, Ld0/a2;->x:Ld0/z1;

    invoke-direct {p1, v1, v0}, Ld0/c2;-><init>(Ld0/z1;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
