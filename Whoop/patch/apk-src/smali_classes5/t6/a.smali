.class public final Lt6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Lt6/a;

.field public static final y:Lt6/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt6/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt6/a;-><init>(I)V

    sput-object v0, Lt6/a;->x:Lt6/a;

    new-instance v0, Lt6/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lt6/a;-><init>(I)V

    sput-object v0, Lt6/a;->y:Lt6/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt6/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt6/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ln6/n;

    instance-of v0, p2, Lv6/n;

    if-eqz v0, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1

    :pswitch_0
    check-cast p2, Ln6/n;

    instance-of v0, p2, Lv6/v;

    if-eqz v0, :cond_1

    move-object p1, p2

    :cond_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
