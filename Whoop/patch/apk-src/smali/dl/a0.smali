.class public final Ldl/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    iput p2, p0, Ldl/a0;->a:I

    iput-object p1, p0, Ldl/a0;->b:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 3

    iget v0, p0, Ldl/a0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ldl/b;

    iget-object v0, p0, Ldl/a0;->b:Landroid/content/res/Resources;

    sget-object v1, Ldl/d0;->b:Ldl/d0;

    invoke-direct {p1, v0, v1}, Ldl/b;-><init>(Landroid/content/res/Resources;Ldl/t;)V

    return-object p1

    :pswitch_0
    new-instance v0, Ldl/b;

    const-class v1, Landroid/net/Uri;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    iget-object v1, p0, Ldl/a0;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, Ldl/b;-><init>(Landroid/content/res/Resources;Ldl/t;)V

    return-object v0

    :pswitch_1
    new-instance v0, Ldl/b;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    iget-object v1, p0, Ldl/a0;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, Ldl/b;-><init>(Landroid/content/res/Resources;Ldl/t;)V

    return-object v0

    :pswitch_2
    new-instance v0, Ldl/b;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    iget-object v1, p0, Ldl/a0;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, Ldl/b;-><init>(Landroid/content/res/Resources;Ldl/t;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
