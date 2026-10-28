.class public final Lle3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public E:Ljava/io/Closeable;

.field public final synthetic w:I

.field public final x:Z

.field public final y:Lne3/h;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZI)V
    .locals 2

    iput p2, p0, Lle3/a;->w:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lle3/a;->x:Z

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle3/a;->y:Lne3/h;

    new-instance p2, Ljava/util/zip/Deflater;

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object p2, p0, Lle3/a;->z:Ljava/lang/Object;

    new-instance v0, Lne3/m;

    invoke-static {p1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lne3/m;-><init>(Lne3/h0;Ljava/util/zip/Deflater;)V

    iput-object v0, p0, Lle3/a;->E:Ljava/io/Closeable;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lle3/a;->x:Z

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle3/a;->y:Lne3/h;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, Lle3/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lle3/a;->E:Ljava/io/Closeable;

    check-cast v0, Lne3/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne3/x;->close()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lle3/a;->E:Ljava/io/Closeable;

    iput-object v0, p0, Lle3/a;->z:Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lle3/a;->E:Ljava/io/Closeable;

    check-cast v0, Lne3/m;

    invoke-virtual {v0}, Lne3/m;->close()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
