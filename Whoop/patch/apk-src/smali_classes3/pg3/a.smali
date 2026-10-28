.class public final Lpg3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final x:Lpg3/a;

.field public static final y:Lpg3/a;

.field public static final z:Lpg3/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lpg3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpg3/a;-><init>(I)V

    sput-object v0, Lpg3/a;->x:Lpg3/a;

    new-instance v0, Lpg3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpg3/a;-><init>(I)V

    sput-object v0, Lpg3/a;->y:Lpg3/a;

    new-instance v0, Lpg3/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lpg3/a;-><init>(I)V

    sput-object v0, Lpg3/a;->z:Lpg3/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpg3/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lpg3/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->close()V

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    check-cast p1, Lud3/a1;

    return-object p1

    :pswitch_1
    check-cast p1, Lud3/a1;

    :try_start_0
    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lud3/a1;->d1()Lne3/j;

    move-result-object v1

    invoke-interface {v1, v0}, Lne3/j;->P0(Lne3/i;)J

    invoke-virtual {p1}, Lud3/a1;->k()Lud3/h0;

    move-result-object v1

    invoke-virtual {p1}, Lud3/a1;->i()J

    move-result-wide v2

    sget-object v4, Lud3/a1;->x:Lud3/z0;

    new-instance v4, Lud3/z0;

    invoke-direct {v4, v1, v2, v3, v0}, Lud3/z0;-><init>(Lud3/h0;JLne3/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lud3/a1;->close()V

    return-object v4

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lud3/a1;->close()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
