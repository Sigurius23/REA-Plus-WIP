.class public final Ldl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxk/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ldl/f;->w:I

    iput-object p1, p0, Ldl/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c()V
    .locals 0

    return-void
.end method

.method private final f()V
    .locals 0

    return-void
.end method

.method private final g()V
    .locals 0

    return-void
.end method

.method private final h()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget v0, p0, Ldl/f;->w:I

    return-void
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Ldl/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldl/f;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 1

    iget v0, p0, Ldl/f;->w:I

    return-void
.end method

.method public final d()Lwk/a;
    .locals 1

    iget v0, p0, Ldl/f;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lwk/a;->w:Lwk/a;

    return-object v0

    :pswitch_0
    sget-object v0, Lwk/a;->w:Lwk/a;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lcom/bumptech/glide/d;Lxk/d;)V
    .locals 2

    iget p1, p0, Ldl/f;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ldl/f;->x:Ljava/lang/Object;

    invoke-interface {p2, p1}, Lxk/d;->f(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    :try_start_0
    iget-object p1, p0, Ldl/f;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Ltl/a;->a(Ljava/io/File;)Ljava/nio/MappedByteBuffer;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p2, p1}, Lxk/d;->f(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "ByteBufferFileLoader"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to obtain ByteBuffer for file"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-interface {p2, p1}, Lxk/d;->c(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
