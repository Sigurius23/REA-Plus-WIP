.class public final Lcf/d;
.super Lcf/e;
.source "SourceFile"


# static fields
.field public static final d:Lcf/d;

.field public static final e:Lcf/d;

.field public static final f:Lcf/d;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lcf/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcf/d;-><init>(II)V

    sput-object v0, Lcf/d;->d:Lcf/d;

    new-instance v0, Lcf/d;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcf/d;-><init>(II)V

    sput-object v0, Lcf/d;->e:Lcf/d;

    new-instance v0, Lcf/d;

    const/16 v1, 0xc

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcf/d;-><init>(II)V

    sput-object v0, Lcf/d;->f:Lcf/d;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lcf/d;->c:I

    invoke-direct {p0, p1}, Lcf/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcf/d;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lcf/e;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "LogResponseWithBody"

    return-object v0

    :pswitch_1
    const-string v0, "LogRequestWithBody"

    return-object v0

    :pswitch_2
    const-string v0, "LogRequest"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
