.class public final Lcf/c;
.super Lcf/e;
.source "SourceFile"


# static fields
.field public static final d:Lcf/c;

.field public static final e:Lcf/c;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lcf/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcf/c;-><init>(II)V

    sput-object v0, Lcf/c;->d:Lcf/c;

    new-instance v0, Lcf/c;

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcf/c;-><init>(II)V

    sput-object v0, Lcf/c;->e:Lcf/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lcf/c;->c:I

    invoke-direct {p0, p1}, Lcf/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcf/c;->c:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "LogResponse"

    return-object v0

    :pswitch_0
    const-string v0, "Default"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
