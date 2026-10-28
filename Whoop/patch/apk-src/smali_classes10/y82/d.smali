.class public final synthetic Ly82/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Ly82/d;->w:I

    iput-object p1, p0, Ly82/d;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ly82/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly82/d;->x:Landroid/content/Context;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Ly82/b$f;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ly82/d;->x:Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Ly82/b$f;->d(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
