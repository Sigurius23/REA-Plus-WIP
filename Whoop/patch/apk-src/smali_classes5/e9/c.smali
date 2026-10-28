.class public final synthetic Le9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le9/h;


# direct methods
.method public synthetic constructor <init>(Le9/h;I)V
    .locals 0

    iput p2, p0, Le9/c;->w:I

    iput-object p1, p0, Le9/c;->x:Le9/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Le9/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le9/c;->x:Le9/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le9/h;->w(Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Le9/c;->x:Le9/h;

    invoke-virtual {v0}, Le9/h;->y()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
