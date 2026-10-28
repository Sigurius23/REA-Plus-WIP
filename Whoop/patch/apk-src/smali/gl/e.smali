.class public final Lgl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/j;


# instance fields
.field public final synthetic a:I

.field public final b:Lgl/m;


# direct methods
.method public synthetic constructor <init>(Lgl/m;I)V
    .locals 0

    iput p2, p0, Lgl/e;->a:I

    iput-object p1, p0, Lgl/e;->b:Lgl/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILwk/h;)Lzk/z;
    .locals 6

    iget v0, p0, Lgl/e;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    new-instance v1, La33/d;

    iget-object v0, p0, Lgl/e;->b:Lgl/m;

    iget-object v2, v0, Lgl/m;->d:Ljava/util/ArrayList;

    iget-object v3, v0, Lgl/m;->c:Lal/g;

    invoke-direct {v1, p1, v2, v3}, La33/d;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lal/g;)V

    sget-object v5, Lgl/m;->j:Lqt/e;

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lgl/m;->a(La33/d;IILwk/h;Lgl/l;)Lgl/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    move v2, p2

    move v3, p3

    move-object v4, p4

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-static {p1}, Ltl/a;->d(Ljava/nio/ByteBuffer;)Lsh/m;

    move-result-object p1

    sget-object v5, Lgl/m;->j:Lqt/e;

    new-instance v1, La33/d;

    iget-object v0, p0, Lgl/e;->b:Lgl/m;

    iget-object p2, v0, Lgl/m;->d:Ljava/util/ArrayList;

    iget-object p3, v0, Lgl/m;->c:Lal/g;

    invoke-direct {v1, p1, p2, p3}, La33/d;-><init>(Ljava/io/InputStream;Ljava/util/ArrayList;Lal/g;)V

    invoke-virtual/range {v0 .. v5}, Lgl/m;->a(La33/d;IILwk/h;Lgl/l;)Lgl/c;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lwk/h;)Z
    .locals 0

    iget p2, p0, Lgl/e;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
