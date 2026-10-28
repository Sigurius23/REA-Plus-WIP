.class public final Lre/i;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/i;->b:Lre/i;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "ADMIN_NO_SRP_AUTH"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AdminNoSrpAuth"

    return-object v0
.end method
