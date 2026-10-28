.class public final Li0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/n;


# static fields
.field public static final b:Li0/m;

.field public static final c:Li0/m;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Li0/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li0/m;-><init>(I)V

    sput-object v0, Li0/m;->b:Li0/m;

    new-instance v0, Li0/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li0/m;-><init>(I)V

    sput-object v0, Li0/m;->c:Li0/m;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li0/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IIII)I
    .locals 1

    iget v0, p0, Li0/m;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    sub-int/2addr p1, p3

    sub-int/2addr p1, p4

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p1, p2

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Li0/m;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Start"

    return-object v0

    :pswitch_0
    const-string v0, "Center"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
