.class public final Lf83/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf83/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf83/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lf83/e;->a:Ly73/p;

    return-object v0

    :pswitch_0
    sget-object v0, Lf83/d;->a:Ly73/i;

    return-object v0

    :pswitch_1
    sget-object v0, Lf83/c;->a:Ly73/h;

    return-object v0

    :pswitch_2
    sget-object v0, Lf83/a;->a:Ly73/d;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
