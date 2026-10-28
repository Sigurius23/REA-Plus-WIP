.class public abstract Lgs/b;
.super Lts/o;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgs/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract V()Lct/a;
.end method

.method public abstract W()Lgs/b;
.end method

.method public abstract X()Lgs/b;
.end method

.method public z()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lgs/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lgs/b;->X()Lgs/b;

    move-result-object v0

    invoke-virtual {v0}, Lts/o;->z()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lgs/b;->W()Lgs/b;

    move-result-object v0

    invoke-virtual {v0}, Lts/o;->z()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
