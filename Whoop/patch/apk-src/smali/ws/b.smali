.class public final Lws/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lws/b;

.field public static final d:Lws/b;

.field public static final e:Lws/b;

.field public static final f:Lws/b;

.field public static final g:Lws/b;

.field public static final h:Lws/b;

.field public static final i:Lws/b;

.field public static final j:Lws/b;

.field public static final k:Lws/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lws/b;

    const-string v1, "SHA256"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->c:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "SHA384"

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->d:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "SHA512"

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->e:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "IEEE_P1363"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->f:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "DER"

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->g:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "TINK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->h:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->i:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->j:Lws/b;

    new-instance v0, Lws/b;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1, v2}, Lws/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws/b;->k:Lws/b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lws/b;->a:I

    iput-object p1, p0, Lws/b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lws/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lws/b;->b:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lws/b;->b:Ljava/lang/String;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lws/b;->b:Ljava/lang/String;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
