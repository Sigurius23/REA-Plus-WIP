.class public final synthetic Lcq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcq0/e;


# direct methods
.method public synthetic constructor <init>(Lcq0/e;I)V
    .locals 0

    iput p2, p0, Lcq0/d;->w:I

    iput-object p1, p0, Lcq0/d;->x:Lcq0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lcq0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcq0/d;->x:Lcq0/e;

    invoke-static {v0}, Lcq0/e;->j(Lcq0/e;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcq0/d;->x:Lcq0/e;

    invoke-static {v0}, Lcq0/e;->c(Lcq0/e;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
