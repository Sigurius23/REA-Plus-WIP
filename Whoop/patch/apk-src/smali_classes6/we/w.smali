.class public final Lwe/w;
.super Lwe/x;
.source "SourceFile"


# static fields
.field public static final b:Lwe/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe/w;

    const-string v1, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"

    invoke-direct {v0, v1}, Lwe/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/w;->b:Lwe/w;

    return-void
.end method
