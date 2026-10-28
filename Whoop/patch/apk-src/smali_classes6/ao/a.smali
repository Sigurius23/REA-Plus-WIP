.class public final Lao/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[I

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Led3/a;

    invoke-direct {p1}, Led3/a;-><init>()V

    iput-object p1, p0, Lao/a;->i:Ljava/lang/Object;

    const/16 p1, 0x100

    new-array p1, p1, [I

    iput-object p1, p0, Lao/a;->a:[I

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lao/a;->i:Ljava/lang/Object;

    const/16 p1, 0x100

    new-array p1, p1, [I

    iput-object p1, p0, Lao/a;->a:[I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
