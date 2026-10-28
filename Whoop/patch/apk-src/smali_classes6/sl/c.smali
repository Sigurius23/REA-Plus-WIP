.class public final Lsl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/e;


# static fields
.field public static final b:Lsl/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsl/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lsl/c;->b:Lsl/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
