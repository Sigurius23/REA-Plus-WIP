.class public final synthetic Lwz/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwz/g1;


# direct methods
.method public synthetic constructor <init>(Lwz/g1;I)V
    .locals 0

    iput p2, p0, Lwz/r;->w:I

    iput-object p1, p0, Lwz/r;->x:Lwz/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwz/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwz/r;->x:Lwz/g1;

    iget-object v0, v0, Lwz/g1;->E:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwz/r;->x:Lwz/g1;

    iget-object v0, v0, Lwz/g1;->z:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
