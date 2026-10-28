.class public final Lod/g;
.super Lod/l;
.source "SourceFile"


# static fields
.field public static final b:Lod/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lod/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lod/g;->b:Lod/g;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "KmsDisabledKey"

    return-object v0
.end method
