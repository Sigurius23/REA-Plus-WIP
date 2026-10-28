.class public final Lll/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lll/a;


# static fields
.field public static final x:Lll/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lll/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lll/c;-><init>(I)V

    sput-object v0, Lll/c;->x:Lll/c;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lll/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(Lzk/z;Lwk/h;)Lzk/z;
    .locals 0

    iget p2, p0, Lll/c;->w:I

    packed-switch p2, :pswitch_data_0

    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkl/b;

    iget-object p1, p1, Lkl/b;->w:Lar/a;

    iget-object p1, p1, Lar/a;->b:Ljava/lang/Object;

    check-cast p1, Lkl/g;

    invoke-virtual {p1}, Lkl/g;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance p2, Lgl/x;

    invoke-static {p1}, Ltl/a;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-direct {p2, p1}, Lgl/x;-><init>([B)V

    return-object p2

    :pswitch_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
