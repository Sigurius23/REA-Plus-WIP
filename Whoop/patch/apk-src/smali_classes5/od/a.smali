.class public final Lod/a;
.super Lod/c;
.source "SourceFile"


# static fields
.field public static final b:Lod/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lod/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lod/a;->b:Lod/a;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "KmsAccessDenied"

    return-object v0
.end method
