.class public final Lys/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lys/c;

.field public static final d:Lys/c;

.field public static final e:Lys/c;

.field public static final f:Lys/c;

.field public static final g:Lys/c;

.field public static final h:Lys/c;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lys/c;

    const-string v1, "SHA1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lys/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lys/c;->c:Lys/c;

    new-instance v0, Lys/c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1, v2}, Lys/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lys/c;->d:Lys/c;

    new-instance v0, Lys/c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1, v2}, Lys/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lys/c;->e:Lys/c;

    new-instance v0, Lys/c;

    const-string v1, "SHA1"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lys/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lys/c;->f:Lys/c;

    new-instance v0, Lys/c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1, v2}, Lys/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lys/c;->g:Lys/c;

    new-instance v0, Lys/c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1, v2}, Lys/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lys/c;->h:Lys/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lys/c;->a:I

    iput-object p1, p0, Lys/c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lys/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lys/c;->b:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lys/c;->b:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
