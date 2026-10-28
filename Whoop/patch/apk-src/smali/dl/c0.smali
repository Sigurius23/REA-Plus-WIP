.class public final Ldl/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# static fields
.field public static final b:Ldl/c0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldl/c0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldl/c0;-><init>(I)V

    sput-object v0, Ldl/c0;->b:Ldl/c0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldl/c0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 3

    iget v0, p0, Ldl/c0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ldl/g0;

    const-class v1, Ldl/i;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    invoke-direct {v0, p1}, Ldl/g0;-><init>(Ldl/t;)V

    return-object v0

    :pswitch_0
    new-instance v0, Ldl/b0;

    const-class v1, Landroid/net/Uri;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldl/b0;-><init>(Ldl/t;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Ldl/b0;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldl/b0;-><init>(Ldl/t;I)V

    return-object v0

    :pswitch_2
    new-instance v0, Ldl/b0;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldl/b0;-><init>(Ldl/t;I)V

    return-object v0

    :pswitch_3
    new-instance p1, Ldl/d0;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ldl/d0;-><init>(I)V

    return-object p1

    :pswitch_4
    new-instance p1, Ldl/d;

    new-instance v0, Ldl/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ldl/c;-><init>(I)V

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ldl/d;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Ldl/d;

    new-instance v0, Ldl/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldl/c;-><init>(I)V

    invoke-direct {p1, v0, v1}, Ldl/d;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_6
    sget-object p1, Ldl/d0;->b:Ldl/d0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
