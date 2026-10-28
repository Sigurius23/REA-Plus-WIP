.class public final Lgh3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgh3/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    iget v0, p0, Lgh3/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lap/c;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lap/c;-><init>(Ljava/lang/Runnable;I)V

    const-string p1, "glide-active-resources"

    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "No threads allowed."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
