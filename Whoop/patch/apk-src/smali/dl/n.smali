.class public final Ldl/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Ldl/n;->a:I

    iput-object p1, p0, Ldl/n;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 2

    iget p1, p0, Ldl/n;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ldl/p;

    iget-object v0, p0, Ldl/n;->b:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Ldl/p;-><init>(Landroid/content/Context;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ldl/p;

    iget-object v0, p0, Ldl/n;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Ldl/p;-><init>(Landroid/content/Context;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ldl/p;

    iget-object v0, p0, Ldl/n;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ldl/p;-><init>(Landroid/content/Context;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
