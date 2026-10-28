.class public final Lod/i;
.super Lod/l;
.source "SourceFile"


# static fields
.field public static final b:Lod/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lod/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lod/i;->b:Lod/i;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "KmsInvalidState"

    return-object v0
.end method
