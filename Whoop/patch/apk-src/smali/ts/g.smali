.class public final Lts/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lts/g;

.field public static final d:Lts/g;

.field public static final e:Lts/g;

.field public static final f:Lts/g;

.field public static final g:Lts/g;

.field public static final h:Lts/g;

.field public static final i:Lts/g;

.field public static final j:Lts/g;

.field public static final k:Lts/g;

.field public static final l:Lts/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lts/g;

    const-string v1, "SHA1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->c:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA224"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->d:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA256"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->e:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA384"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->f:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA512"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->g:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA1"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->h:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA224"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->i:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA256"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->j:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA384"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->k:Lts/g;

    new-instance v0, Lts/g;

    const-string v1, "SHA512"

    invoke-direct {v0, v1, v2}, Lts/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lts/g;->l:Lts/g;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lts/g;->a:I

    iput-object p1, p0, Lts/g;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lts/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lts/g;->b:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lts/g;->b:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
