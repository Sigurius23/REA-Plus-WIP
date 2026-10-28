.class public final La3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La3/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lz2/h;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p1, Lz2/h;->a:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1

    iget v0, p0, La3/e;->w:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x8

    return v0

    :pswitch_0
    const/16 v0, 0x10

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
