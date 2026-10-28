.class public final Lre/c;
.super Lre/f;
.source "SourceFile"


# static fields
.field public static final b:Lre/c;

.field public static final c:Lre/c;

.field public static final d:Lre/c;

.field public static final e:Lre/c;

.field public static final f:Lre/c;

.field public static final g:Lre/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lre/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lre/c;-><init>(I)V

    sput-object v0, Lre/c;->b:Lre/c;

    new-instance v0, Lre/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lre/c;-><init>(I)V

    sput-object v0, Lre/c;->c:Lre/c;

    new-instance v0, Lre/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lre/c;-><init>(I)V

    sput-object v0, Lre/c;->d:Lre/c;

    new-instance v0, Lre/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lre/c;-><init>(I)V

    sput-object v0, Lre/c;->e:Lre/c;

    new-instance v0, Lre/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lre/c;-><init>(I)V

    sput-object v0, Lre/c;->f:Lre/c;

    new-instance v0, Lre/c;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lre/c;-><init>(I)V

    sput-object v0, Lre/c;->g:Lre/c;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lre/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lre/c;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "USER_SRP_AUTH"

    return-object v0

    :pswitch_0
    const-string v0, "USER_AUTH"

    return-object v0

    :pswitch_1
    const-string v0, "REFRESH_TOKEN"

    return-object v0

    :pswitch_2
    const-string v0, "CUSTOM_AUTH"

    return-object v0

    :pswitch_3
    const-string v0, "ADMIN_USER_PASSWORD_AUTH"

    return-object v0

    :pswitch_4
    const-string v0, "ADMIN_NO_SRP_AUTH"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lre/c;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "UserSrpAuth"

    return-object v0

    :pswitch_0
    const-string v0, "UserAuth"

    return-object v0

    :pswitch_1
    const-string v0, "RefreshToken"

    return-object v0

    :pswitch_2
    const-string v0, "CustomAuth"

    return-object v0

    :pswitch_3
    const-string v0, "AdminUserPasswordAuth"

    return-object v0

    :pswitch_4
    const-string v0, "AdminNoSrpAuth"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
