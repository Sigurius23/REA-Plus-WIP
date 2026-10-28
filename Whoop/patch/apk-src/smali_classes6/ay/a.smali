.class public final Lay/a;
.super Ljava/lang/Throwable;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lay/a;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 2
    iput-object p1, p0, Lay/a;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lay/a;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 4
    iput-object p1, p0, Lay/a;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lay/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lay/a;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lay/a;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
