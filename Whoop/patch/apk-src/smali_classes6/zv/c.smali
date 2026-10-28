.class public final Lzv/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lzv/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzv/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzv/c;->a:Lzv/c;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ViewportStatus#Idle"

    return-object v0
.end method
