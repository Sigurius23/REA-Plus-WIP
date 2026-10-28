.class public final Lcg/r;
.super Lcg/t;
.source "SourceFile"


# static fields
.field public static final d:Lcg/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcg/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcg/t;-><init>(I)V

    sput-object v0, Lcg/r;->d:Lcg/r;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Path"

    return-object v0
.end method
